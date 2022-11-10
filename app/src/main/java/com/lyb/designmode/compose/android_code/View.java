package com.lyb.designmode.compose.android_code;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewDebug;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityEventSource;

import androidx.annotation.NonNull;

public class View implements Drawable.Callback, KeyEvent.Callback,
        AccessibilityEventSource {

    protected int mScrollX;
    protected int mScrollY;
    protected int mLeft;
    protected int mRight;
    protected int mTop;
    protected int mBottom;

    /**
     * 空方法
     *
     * @param changed
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }


    /**
     * 以下方法省略，具体请看源码
     */


    @Override
    public void invalidateDrawable(@NonNull Drawable who) {

    }

    @Override
    public void scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when) {

    }

    @Override
    public void unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what) {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int count, KeyEvent event) {
        return false;
    }

    @Override
    public void sendAccessibilityEvent(int eventType) {

    }

    @Override
    public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {

    }

    public void invalidate(Rect dirty) {
        final int scrollX = mScrollX;
        final int scrollY = mScrollY;
        invalidateInternal(dirty.left - scrollX, dirty.top - scrollY,
                dirty.right - scrollX, dirty.bottom - scrollY, true, false);
    }

    void invalidateInternal(int l, int t, int r, int b, boolean invalidateCache,
                            boolean fullInvalidate) {
        //省略

    }

    public void invalidate(boolean invalidateCache) {
        invalidateInternal(0, 0, mRight - mLeft, mBottom - mTop, invalidateCache, true);
    }

}

