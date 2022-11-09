package com.lyb.designmode.decorate.android_code;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.RequiresPermission;

public abstract class Context {

    public static String tag = "decorate_context";

    public abstract void startActivity(@RequiresPermission Intent intent);

    public abstract void startActivity(@RequiresPermission Intent intent, Bundle options);

    public void startActivityForResult(
            String who, Intent intent, int requestCode, Bundle options) {
        throw new RuntimeException("This method is only implemented for Activity-based Contexts. "
                + "Check canStartActivityForResult() before calling.");
    }

}
