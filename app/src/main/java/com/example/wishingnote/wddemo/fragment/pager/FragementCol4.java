package com.example.wishingnote.wddemo.fragment.pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;

public class FragementCol4 extends Fragment {
    public FragementCol4() {
    }
    public static FragementCol4 newInstance() {
        FragementCol4 fragment = new FragementCol4();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_col4, container, false);
    }

}
