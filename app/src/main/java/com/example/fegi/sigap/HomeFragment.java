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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public static Fragment newInstance() {
        return new HomeFragment();
    }

    private static final String TAG = "HomeFragment";
    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mListView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Cards> list = new ArrayList<>();

        list.add(new Cards("@drawable://" + R.drawable.bg4, "test"));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.fragment_home, list);
        mListView.setAdapter(adapter);

        return view;
    }
}