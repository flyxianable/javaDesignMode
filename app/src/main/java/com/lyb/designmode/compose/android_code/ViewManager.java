package com.lyb.designmode.compose.android_code;

import android.view.View;
import android.view.ViewGroup;

public interface ViewManager {
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams params);
    public void updateViewLayout(android.view.View view, ViewGroup.LayoutParams params);
    public void removeView(View view);
}
