package com.example.wishingnote.wddemo.Manager;

import android.app.Activity;
import android.app.Fragment;

import com.example.wishingnote.wddemo.R;

public class FragmentManager {
    private static final FragmentManager ourInstance = new FragmentManager();
    private android.app.FragmentManager fragmentManager;
    private Activity activity;
    public static FragmentManager getInstance() {
        return ourInstance;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
        fragmentManager = activity.getFragmentManager();
    }

    public void setFragmentContent(Fragment fragment) {
        fragmentManager.beginTransaction().replace(R.id.main_content, fragment).addToBackStack(null).commit();
    }
}
