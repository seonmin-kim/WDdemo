package com.example.wishingnote.wddemo.fragment.pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wishingnote.wddemo.R;

public class FragementAD3 extends Fragment {
    public FragementAD3() {
    }
    public static FragementAD3 newInstance() {
        FragementAD3 fragment = new FragementAD3();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ad3, container, false);
    }

}
