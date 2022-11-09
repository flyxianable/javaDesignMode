package com.lyb.designmode.decorate.android_code;


public class ContextThemeWrapper extends ContextWrapper{

    public ContextThemeWrapper() {
        super(null);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }
}
