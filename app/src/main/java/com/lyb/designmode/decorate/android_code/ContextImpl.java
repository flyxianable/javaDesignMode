package com.lyb.designmode.decorate.android_code;


import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;

/**
 * 具体实现Context的抽象方法
 */
public class ContextImpl extends Context{

    @Override
    public void startActivity(Intent intent) {
        warnIfCallingFromSystemProcess();
        startActivity(intent, null);
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        Log.v(Context.tag, "ContextImpl startActivity");
    }

    @Override
    public void startActivityForResult(
            String who, Intent intent, int requestCode, Bundle options) {
        Log.v(Context.tag, "ContextImpl startActivityForResult");
    }


    private void warnIfCallingFromSystemProcess() {
        if (Process.myUid() == Process.SYSTEM_UID) {
//            Slog.w(TAG, "Calling a method in the system process without a qualified user: "
//                    + Debug.getCallers(5));
        }
    }


}
