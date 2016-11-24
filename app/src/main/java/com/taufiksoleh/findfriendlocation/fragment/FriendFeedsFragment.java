package com.taufiksoleh.findfriendlocation.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.taufiksoleh.findfriendlocation.R;
import com.taufiksoleh.findfriendlocation.adapter.RecyclerViewAdapter.Feeds_RecyclerViewAdapter;
import com.taufiksoleh.findfriendlocation.model.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FriendFeedsFragment extends Fragment {

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    Query mTableRef = mRootRef.child("users").orderByKey();

    private List<Users> userList = new ArrayList<>();
    private RecyclerView feeds_recyclerView;
    private Feeds_RecyclerViewAdapter feedsListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friend_feeds, container, false);

        // Get UI Element
        //final TextView txtFullname = (TextView) view.findViewById(R.id.fullname);
//        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                saveDataUser();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        feedsListAdapter = new Feeds_RecyclerViewAdapter(userList);
        feeds_recyclerView = (RecyclerView) view.findViewById(R.id.feeds_Recyclerview);
        feeds_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        feeds_recyclerView.hasFixedSize();
        feeds_recyclerView.setItemAnimator(new DefaultItemAnimator());
        feeds_recyclerView.setAdapter(feedsListAdapter);

        mTableRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Log.e("onChildAdded : ",dataSnapshot.getKey());

                Users getUser = dataSnapshot.getValue(Users.class);

                Users users = new Users();
                users.setUserID(dataSnapshot.getKey());
                users.setAddress(getUser.getAddress());
                users.setBirthdate(getUser.getBirthdate());
                users.setGender(getUser.getGender());
                users.setEmail(getUser.getEmail());
                users.setUsername(getUser.getUsername());
                users.setPassword(getUser.getPassword());
                users.setHandphone(getUser.getHandphone());
                users.setStatus(getUser.getStatus());
                userList.add(users);
                feedsListAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Log.e("onChildChanged : ",dataSnapshot.toString());
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Log.e("onChildRemoved : ",dataSnapshot.toString());
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
                Log.e("onChildMoved : ",dataSnapshot.toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("onCanceled : ",databaseError.toString());
            }
        });


//        mTableRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
////                String fullname = dataSnapshot.getValue(String.class);
//                Log.e("Datasnapshot : ", dataSnapshot.toString());
//                getFeedsData(dataSnapshot);
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

//        mTableRef.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                getFeedsData(dataSnapshot);
//                Log.e("onChildAdded : ",dataSnapshot.toString());
//
//
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//                Log.e("onChildChanged : ",dataSnapshot.toString());
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();


    }

    public void saveDataUser() {
        Random rand = new Random();

        int n = rand.nextInt(5003) + 1;

        Users users = new Users();
        users.setUserID("U-" + n);
        users.setAddress("Pandeglang - BANTEN");
        users.setBirthdate("1995-08-14");
        users.setGender("Male");
        users.setEmail("taufik@email.com");
        users.setUsername("U-" + n);
        users.setPassword("123123");
        users.setHandphone("085695755197");
        users.setStatus("Active");

        mRootRef.child("users").child(users.getUserID()).setValue(users);
    }

    public void RecyclerViewData() {

        for (int i = 0; i < 20; i++) {
            Users users = new Users();
            users.setUserID("U-" + i);
            users.setAddress("Pandeglang - BANTEN");
            users.setBirthdate("1995-08-14");
            users.setGender("Male");
            users.setEmail("taufik@email.com");
            users.setUsername("U-" + i);
            users.setPassword("123123");
            users.setHandphone("085695755197");
            users.setStatus("Active");
            userList.add(users);
        }
        feedsListAdapter.notifyDataSetChanged();
    }

    public void getFeedsData(DataSnapshot dataSnapshot){
        for (DataSnapshot data : dataSnapshot.getChildren()){
            String username = data.getValue(String.class);
            Log.i("Datasnapshoot ----------------> ",username);
        }
    }
}
