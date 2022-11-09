package com.lyb.designmode.adapter.android_code;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.ListAdapter;
import android.widget.RemoteViews;

@RemoteViews.RemoteView
public class ListView extends AbsListView {

    public ListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public void onGlobalLayout() {

    }

    @Override
    public void onTouchModeChanged(boolean isInTouchMode) {

    }

    @Override
    public void onFilterComplete(int count) {

    }

    @Override
    public ListAdapter getAdapter() {
        return null;
    }

    @Override
    protected void layoutChildren(){
        //省略具体看源码
        final boolean blockLayoutRequests = mBlockLayoutRequests;
        if (blockLayoutRequests) {
            return;
        }
        mBlockLayoutRequests = true;

        View sel;
        View oldSel = null;
        View oldFirst = null;
        View newSel = null;

        try {
            super.layoutChildren();
            invalidate();

            //......

            /**
             * 根据布局模式来布局ItemView
             */
            switch (mLayoutMode) {
                case LAYOUT_SET_SELECTION:
//                    if (newSel != null) {
//                        sel = fillFromSelection(newSel.getTop(), childrenTop, childrenBottom);
//                    } else {
//                        sel = fillFromMiddle(childrenTop, childrenBottom);
//                    }
                    break;
                case LAYOUT_SYNC:
//                    sel = fillSpecific(mSyncPosition, mSpecificTop);
                    break;
                case LAYOUT_FORCE_BOTTOM:
//                    sel = fillUp(mItemCount - 1, childrenBottom);
//                    adjustViewsUpOrDown();
                    break;
                case LAYOUT_FORCE_TOP:
//                    mFirstPosition = 0;
//                    sel = fillFromTop(childrenTop);
//                    adjustViewsUpOrDown();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
