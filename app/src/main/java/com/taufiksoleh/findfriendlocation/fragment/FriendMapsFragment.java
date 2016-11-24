package com.taufiksoleh.findfriendlocation.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taufiksoleh.findfriendlocation.R;

public class FriendMapsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friend_maps, container, false);
    }

    public void onResume(){
        super.onResume();

    }
}
