package com.fatigue.driver.app;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class TestThree_MindwaveHelper extends AppCompatActivity {

    private static final String TAG = TestThree_MindwaveHelper.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.test_three);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        MindwaveHelperFragment mMindwaveHelperFrag = new MindwaveHelperFragment();

        ft.add(mMindwaveHelperFrag,TAG);
        ft.commit();

        mMindwaveHelperFrag.setRecordingRawData(false);

    }
}