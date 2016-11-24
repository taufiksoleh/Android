package com.taufiksoleh.findfriendlocation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.taufiksoleh.findfriendlocation.adapter.PagerMainAdapter;
import com.taufiksoleh.findfriendlocation.config.Title;

public class FriendFeeds extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_feeds);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_people_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_map_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_star_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_account_circle_black_24dp));

        Log.e("Print Debut ---------> ", String.valueOf(tabLayout.getTabCount()));
        viewPager = (ViewPager)findViewById(R.id.main_pager);
        PagerMainAdapter pagerMainAdapter = new PagerMainAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerMainAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                Log.e("Print Debug 1 ---------> ", String.valueOf(tab.getPosition()));

                getTabIndex(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.e("Print Debug 2 ---------> ", String.valueOf(tab.getPosition()));

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.e("Print Debug 3 ---------> ", String.valueOf(tab.getPosition()));

            }
        });

    }

    public void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    public void getTabIndex(int index){
        switch (index){
            case 0 : setActionBarTitle(Title.FEEDS);break;
            case 1 : setActionBarTitle(Title.MAPS);break;
            case 2 : setActionBarTitle(Title.BOOKMARK);break;
            case 3 : setActionBarTitle(Title.PROFILE);break;
        }
    }

}
