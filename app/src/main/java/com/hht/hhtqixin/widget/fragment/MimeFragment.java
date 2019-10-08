package com.hht.hhtqixin.widget.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hht.hhtqixin.R;
import com.hht.hhtqixin.widget.BaseFragment;

/**
 * @author by  zhengshaorui on 2019/10/8
 * Describe:
 */
public class MimeFragment extends BaseFragment {
    public static MimeFragment newInstance() {

        Bundle args = new Bundle();

        MimeFragment fragment = new MimeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mime,container,false);
        return view;
    }
}
