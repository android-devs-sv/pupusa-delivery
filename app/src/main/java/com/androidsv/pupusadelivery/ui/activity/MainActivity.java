package com.androidsv.pupusadelivery.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.androidsv.pupusadelivery.R;
import com.androidsv.pupusadelivery.ui.fragment.SplashFragment;
import com.androidsv.pupusadelivery.util.FragmentUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentUtils.addFragment(manager, R.id.fragment_container, SplashFragment.getInstance(), SplashFragment.TAG);
        }
    }
}
