package com.example.wishingnote.wddemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.wishingnote.wddemo.Listener.OnBackClickListener;

public abstract class BaseFragment extends Fragment implements OnBackClickListener{
    @Override
    public void onBackClick() {
        getActivity().onBackPressed();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }
    abstract protected void init(View view);
}
