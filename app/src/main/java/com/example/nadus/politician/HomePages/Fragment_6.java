package com.example.nadus.politician.HomePages;

/**
 * Created by nadus on 16-11-2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nadus.politician.Home.SampleActivity;
import com.example.nadus.politician.R;

/**
 * Created by Belal on 18/09/16.
 */


public class Fragment_6 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_6, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        SampleActivity.toolbar.setTitle("Events");

        getActivity().setTitle("Events");
    }
}