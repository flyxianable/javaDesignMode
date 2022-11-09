package com.lyb.designmode.decorate.android_code;

public class Activity extends ContextThemeWrapper{


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        if (newBase != null) {
//            newBase.setAutofillClient(this);
//            newBase.setContentCaptureOptions(getContentCaptureOptions());
        }
    }
}
