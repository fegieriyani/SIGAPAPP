package com.example.fegi.sigap;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Fegi on 9/23/2018.
 */

public class LaporFragment extends Fragment {
    public static Fragment newInstance() {
        return new LaporFragment();
    }

    ImageButton btnImage;
    Integer REQUEST_CAMERA=1, SELECT_FILE=0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.test, container, false);

        btnImage = (ImageButton) v.findViewById(R.id.btnCamera);

        return v;

    }

}
