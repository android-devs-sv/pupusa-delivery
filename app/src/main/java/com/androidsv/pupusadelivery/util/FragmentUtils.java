package com.androidsv.pupusadelivery.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class FragmentUtils {

    public static void addFragment(FragmentManager manager, int containerId, Fragment fragment, String tag) {
        manager.beginTransaction()
                .add(containerId, fragment, tag)
                .commit();
    }

    public static void replaceFragment(FragmentManager manager, int containerId, Fragment fragment, String tag) {
        manager.beginTransaction()
                .replace(containerId, fragment, tag)
                .commit();
    }
}
