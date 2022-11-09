package com.lyb.designmode.compose.android_code;


import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.RemoteViews;

@RemoteViews.RemoteView
public class LinearLayout extends ViewGroup {

    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    @ViewDebug.ExportedProperty(category = "measurement")
    private int mOrientation;


    public LinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        if (mOrientation == VERTICAL) {
            layoutVertical(l, t, r, b);
        } else {
            layoutHorizontal(l, t, r, b);
        }
    }

    void layoutVertical(int left, int top, int right, int bottom) {
        /**
         * 省略，请看源码
         */

    }


    void layoutHorizontal(int left, int top, int right, int bottom) {
        /**
         * 省略，请看源码
         */
    }

}
