package com.lyb.designmode.decorate.android_code;

import android.content.Intent;
import android.os.Bundle;

/**
 * 装饰者
 * startActivity实际上是ContextImpl的方法
 */
public class ContextWrapper extends Context{

    Context mBase;

    public ContextWrapper(Context base) {
        mBase = base;
    }


    protected void attachBaseContext(Context base) {
        if (mBase != null) {
            throw new IllegalStateException("Base context already set");
        }
        mBase = base;
    }

    @Override
    public void startActivity(Intent intent) {
        mBase.startActivity(intent);
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        mBase.startActivity(intent, options);
    }


    public void startActivityForResult(
            String who, Intent intent, int requestCode, Bundle options) {
        mBase.startActivityForResult(who, intent, requestCode, options);
    }


}
