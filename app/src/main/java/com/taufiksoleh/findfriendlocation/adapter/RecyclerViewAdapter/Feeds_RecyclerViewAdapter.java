package com.taufiksoleh.findfriendlocation.adapter.RecyclerViewAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.taufiksoleh.findfriendlocation.R;
import com.taufiksoleh.findfriendlocation.fragment.FriendFeedsFragment;
import com.taufiksoleh.findfriendlocation.model.Users;

import java.util.List;

/**
 * Created by taufiksoleh on 11/22/16.
 */

public class Feeds_RecyclerViewAdapter extends RecyclerView.Adapter<Feeds_RecyclerViewAdapter.Feeds_ViewHolder> {

    private List<Users> userList;

    public Feeds_RecyclerViewAdapter(List<Users> userList) {
        this.userList = userList;
    }

    @Override
    public Feeds_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_friend_feeds, parent, false);

        return new Feeds_ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(Feeds_ViewHolder holder, int position) {
        Users users = userList.get(position);
        holder.username.setText(users.getUsername());
        holder.handphone.setText(users.getHandphone());
        holder.email.setText(users.getEmail());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class Feeds_ViewHolder extends RecyclerView.ViewHolder {
        public TextView username, email, handphone;

        public Feeds_ViewHolder(View itemView) {
            super(itemView);
            username = (TextView) itemView.findViewById(R.id.feeds_username);
            email = (TextView) itemView.findViewById(R.id.feeds_email);
            handphone = (TextView) itemView.findViewById(R.id.feeds_handphone);
        }
    }
}

