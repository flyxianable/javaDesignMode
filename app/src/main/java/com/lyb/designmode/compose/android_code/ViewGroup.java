package com.lyb.designmode.compose.android_code;


import android.animation.LayoutTransition;

import androidx.annotation.UiThread;

@UiThread
public abstract class ViewGroup extends View

        implements ViewParent, ViewManager {


    /**
     * 变成了抽象方法
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected abstract void onLayout(boolean changed,
                                     int l, int t, int r, int b);


    public void addView(android.view.View child) {
        addView(child, -1);
    }


    public void addView(android.view.View child, int index) {
        if (child == null) {
            throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
        }
        android.view.ViewGroup.LayoutParams params = child.getLayoutParams();
        if (params == null) {
            params = generateDefaultLayoutParams();
            if (params == null) {
                throw new IllegalArgumentException("generateDefaultLayoutParams() cannot return null");
            }
        }
        addView(child, index, params);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    public void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) {


        if (child == null) {
            throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
        }

        // addViewInner() will call child.requestLayout() when setting the new LayoutParams
        // therefore, we call requestLayout() on ourselves before, so that the child's request
        // will be blocked at our level
        requestLayout();
        invalidate(true);
        addViewInner(child, index, params, false);
    }

    private void addViewInner(android.view.View child, int index, android.view.ViewGroup.LayoutParams params,
                              boolean preventRequestLayout) {
        //省略
    }

}

