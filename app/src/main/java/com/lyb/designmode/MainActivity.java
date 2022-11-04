package com.lyb.designmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lyb.designmode.instance.SingleLazyInstance;

public class MainActivity extends AppCompatActivity {

    LazyThread[] threads = new LazyThread[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i< threads.length; i++){
            threads[i] = new LazyThread();

        }
        for(int i=0; i< threads.length; i++){
            threads[i].start();
        }
    }

    class LazyThread extends Thread{
        @Override
        public void run() {
            SingleLazyInstance singleLazyInstance = SingleLazyInstance.getInstance();
            Log.v("lazy_2022", "instance =" + singleLazyInstance.hashCode());
        }
    }


}

