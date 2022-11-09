package com.lyb.designmode.compose.android_code;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RemoteViews;

import androidx.annotation.Nullable;

@RemoteViews.RemoteView
public class TextView extends View implements ViewTreeObserver.OnPreDrawListener {

    private int mDeferScroll = -1;

    CharSequence mText;


    public TextView(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

        super.onLayout(changed, left, top, right, bottom);

        if (mDeferScroll >= 0) {

            int curs = mDeferScroll;

            mDeferScroll = -1;

            bringPointIntoView(Math.min(curs, mText.length()));
        }

        // Call auto-size after the width and height have been calculated.

        autoSizeText();

    }

    public boolean bringPointIntoView(int offset) {

        /**
         * 代码省略，具体请看源码
         */
        return false;
    }

    private void autoSizeText() {

        /**
         * 代码省略，具体请看源码
         */
    }


    @Override
    public boolean onPreDraw() {

        return false;
    }
}
