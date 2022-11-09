package com.lyb.designmode.adapter.android_code;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

public abstract class AdapterView<T extends Adapter> extends ViewGroup {

    private int mLayoutHeight;
    int mItemCount;
    public static final long INVALID_ROW_ID = Long.MIN_VALUE;
    boolean mInLayout = false;
    boolean mDataChanged;
    int mOldItemCount;
    boolean mBlockLayoutRequests = false;

    android.widget.AdapterView.OnItemClickListener mOnItemClickListener;

    public AdapterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public abstract void setAdapter(T adapter);

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        mLayoutHeight = getHeight();
    }

    public int getCount() {
        return mItemCount;
    }

    public abstract T getAdapter();

    public Object getItemAtPosition(int position) {
        T adapter = getAdapter();
        return (adapter == null || position < 0) ? null : adapter.getItem(position);
    }

    public long getItemIdAtPosition(int position) {
        T adapter = getAdapter();
        return (adapter == null || position < 0) ? INVALID_ROW_ID : adapter.getItemId(position);
    }
}
