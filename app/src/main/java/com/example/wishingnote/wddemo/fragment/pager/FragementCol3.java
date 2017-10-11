package com.example.wishingnote.wddemo.fragment.pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;

public class FragementCol3 extends Fragment {
    public FragementCol3() {
    }
    public static FragementCol3 newInstance() {
        FragementCol3 fragment = new FragementCol3();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_col3, container, false);
    }

}
