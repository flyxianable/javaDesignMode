package com.lyb.designmode.adapter.android_code;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import android.view.ViewTreeObserver;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;


public abstract class AbsListView extends AdapterView<ListAdapter> implements TextWatcher,
        ViewTreeObserver.OnGlobalLayoutListener, Filter.FilterListener,
        ViewTreeObserver.OnTouchModeChangeListener{
//        , RemoteViewsAdapter.RemoteAdapterConnectionCallback {

    public static final int CHOICE_MODE_NONE = 0;

    boolean mAdapterHasStableIds;
    ListAdapter mAdapter;
    int mChoiceMode = CHOICE_MODE_NONE;
    LongSparseArray<Integer> mCheckedIdStates;
    SparseBooleanArray mCheckStates;
    int mCheckedItemCount;

    int mOverscrollMax;
    static final int OVERSCROLL_LIMIT_DIVISOR = 3;

    PopupWindow mPopup;

    private boolean mGlobalLayoutListenerAddedFilter;

    private boolean mTextFilterEnabled;

    AdapterDataSetObserver mDataSetObserver;

    int mLayoutMode = LAYOUT_NORMAL;

//    private FastScroller mFastScroll;
//    final RecycleBin mRecycler = new RecycleBin();


    /**
     * Regular layout - usually an unsolicited layout from the view system
     */
    static final int LAYOUT_NORMAL = 0;

    /**
     * Show the first item
     */
    static final int LAYOUT_FORCE_TOP = 1;

    /**
     * Force the selected item to be on somewhere on the screen
     */
    static final int LAYOUT_SET_SELECTION = 2;

    /**
     * Show the last item
     */
    static final int LAYOUT_FORCE_BOTTOM = 3;

    /**
     * Make a mSelectedItem appear in a specific location and build the rest of
     * the views from there. The top is specified by mSpecificTop.
     */
    static final int LAYOUT_SPECIFIC = 4;

    /**
     * Layout to sync as a result of a data change. Restore mSyncPosition to have its top
     * at mSpecificTop
     */
    static final int LAYOUT_SYNC = 5;

    /**
     * Layout as a result of using the navigation keys
     */
    static final int LAYOUT_MOVE_SELECTION = 6;


    class AdapterDataSetObserver
            extends DataSetObserver {
//            extends android.widget.AdapterView<ListAdapter> {
        @Override
        public void onChanged() {
            super.onChanged();
//            if (mFastScroll != null) {
//                mFastScroll.onSectionsChanged();
//            }
        }

        @Override
        public void onInvalidated() {
            super.onInvalidated();
//            if (mFastScroll != null) {
//                mFastScroll.onSectionsChanged();
//            }
        }
    }


    public AbsListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setAdapter(ListAdapter adapter) {
        if (adapter != null) {
            mAdapterHasStableIds = mAdapter.hasStableIds();
            if (mChoiceMode != CHOICE_MODE_NONE && mAdapterHasStableIds &&
                    mCheckedIdStates == null) {
                mCheckedIdStates = new LongSparseArray<Integer>();
            }
        }
        clearChoices();
    }

    public void clearChoices() {
        if (mCheckStates != null) {
            mCheckStates.clear();
        }
        if (mCheckedIdStates != null) {
            mCheckedIdStates.clear();
        }
        mCheckedItemCount = 0;
    }

    /**
     *
     * 子类需要覆写layoutChildren()函数来布局childview，也就是ItemView
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        super.onLayout(changed, l, t, r, b);

        mInLayout = true;

        final int childCount = getChildCount();
        if (changed) {
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).forceLayout();
            }
//            mRecycler.markChildrenDirty();
        }

        /**
         * 布局 Child View
         */

        layoutChildren();

        mOverscrollMax = (b - t) / OVERSCROLL_LIMIT_DIVISOR;

        // TODO: Move somewhere sane. This doesn't belong in onLayout().
//        if (mFastScroll != null) {
//            mFastScroll.onItemCountChanged(getChildCount(), mItemCount);
//        }

        mInLayout = false;
    }

    protected void layoutChildren() {
    }

    /**
     * 关联到Window时调用世获取调用Adapter中的registerDataSetObserver、getCount等方法
     */
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        final ViewTreeObserver treeObserver = getViewTreeObserver();
        treeObserver.addOnTouchModeChangeListener(this);
        if (mTextFilterEnabled && mPopup != null && !mGlobalLayoutListenerAddedFilter) {
            treeObserver.addOnGlobalLayoutListener(this);
        }

        if (mAdapter != null && mDataSetObserver == null) {
            mDataSetObserver = new AdapterDataSetObserver();
            mAdapter.registerDataSetObserver(mDataSetObserver);

            // Data may have changed while we were detached. Refresh.
            mDataChanged = true;
            mOldItemCount = mItemCount;
            mItemCount = mAdapter.getCount();
        }
    }
}
