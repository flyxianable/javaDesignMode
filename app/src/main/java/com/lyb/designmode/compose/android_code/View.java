package com.lyb.designmode.compose.android_code;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityEventSource;

import androidx.annotation.NonNull;

public class View implements Drawable.Callback, KeyEvent.Callback,
        AccessibilityEventSource {

    /**
     * 空方法
     * @param changed
     * @param left
     * @param top
     * @param right
     * @param bottom
     */
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }


    /**
     *  以下方法省略，具体请看源码
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
}

