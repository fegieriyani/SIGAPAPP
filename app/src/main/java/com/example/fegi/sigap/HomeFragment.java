package com.example.fegi.sigap;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public static Fragment newInstance() {
        return new HomeFragment();
    }

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);

        return v;
    }

    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

        private int[] images_user = {R.drawable.ic_action_user, R.drawable.ic_action_user};

        private String[] user = {"fegi", "eriyani"};

        private String[] date = {"12sept2018", "13sept2019"};

        private int[] images = {R.drawable.bg5, R.drawable.bg4};

        private int[] images_like = {R.drawable.ic_action_fav, R.drawable.ic_action_fav};

        private int[] images_comment = {R.drawable.ic_action_comment, R.drawable.ic_action_comment};

        private String[] title = {"test", "test2"};

        class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView itemImageUser;
            public TextView itemUser;
            public TextView itemDate;
            public ImageView itemImage;
            public ImageView itemImageLike;
            public ImageView itemImageComment;
            public TextView itemTitle;

            public ViewHolder(View itemView) {
                super(itemView);

                itemImageUser = (ImageView) itemView.findViewById(R.id.cardUser);
                itemUser = (TextView) itemView.findViewById(R.id.textUser);
                itemDate = (TextView) itemView.findViewById(R.id.textDate);
                itemImage = (ImageView) itemView.findViewById(R.id.cardImage);
                itemImageLike = (ImageView) itemView.findViewById(R.id.cardLike);
                itemImageComment = (ImageView) itemView.findViewById(R.id.cardComment);
                itemTitle = (TextView) itemView.findViewById(R.id.cardTitle);

            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.listview_layout, viewGroup, false);

            ViewHolder viewHolder = new ViewHolder(view);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {

            viewHolder.itemImageUser.setImageResource(images_user[i]);
            viewHolder.itemUser.setText(user[i]);
            viewHolder.itemDate.setText(date[i]);
            viewHolder.itemImage.setImageResource(images[i]);
            viewHolder.itemImageLike.setImageResource(images_like[i]);
            viewHolder.itemImageComment.setImageResource(images_comment[i]);
            viewHolder.itemTitle.setText(title[i]);
        }

        @Override
        public int getItemCount() {
            return title.length;
        }
    }
}