package com.example.thiago.nav;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Thiago on 20/11/2016.
 */

public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one,container,false);
    }
}