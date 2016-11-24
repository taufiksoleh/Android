package com.taufiksoleh.findfriendlocation.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.taufiksoleh.findfriendlocation.fragment.BookmarkFragment;
import com.taufiksoleh.findfriendlocation.fragment.FriendFeedsFragment;
import com.taufiksoleh.findfriendlocation.fragment.FriendMapsFragment;
import com.taufiksoleh.findfriendlocation.fragment.ProfileFragment;

/**
 * Created by taufiksoleh on 11/18/16.
 */

public class PagerMainAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerMainAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FriendFeedsFragment friendFeedsFragment = new FriendFeedsFragment();
                return friendFeedsFragment;

            case 1:
                FriendMapsFragment friendMapsFragment   = new FriendMapsFragment();
                return friendMapsFragment;

            case 2:
                BookmarkFragment bookmarkFragment       = new BookmarkFragment();
                return bookmarkFragment;

            case 3:
                ProfileFragment profileFragment         = new ProfileFragment();
                return profileFragment;

            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
