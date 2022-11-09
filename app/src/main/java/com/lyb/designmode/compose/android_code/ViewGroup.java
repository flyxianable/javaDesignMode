package com.lyb.designmode.compose.android_code;

import android.view.ViewManager;
import android.view.ViewParent;

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

}

