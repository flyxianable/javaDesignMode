package com.lyb.designmode.compose.android_code;

import android.graphics.Rect;
import android.view.View;

public interface ViewParent {

    public void requestLayout();

    public void invalidateChild(View child, Rect r);

    public void requestChildFocus(android.view.View child, android.view.View focused);

    public void clearChildFocus(View child);

    public boolean getChildVisibleRect(View child, Rect r, android.graphics.Point offset);

    public android.view.ViewParent getParent();

    public boolean isLayoutRequested();

    public void recomputeViewAttributes(android.view.View child);


}
