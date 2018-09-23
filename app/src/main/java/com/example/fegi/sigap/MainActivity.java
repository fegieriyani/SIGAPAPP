package com.example.fegi.sigap;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends SingleFragment
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected Fragment createFragment() {
        return new HomeFragment().newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {

            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_notif:
                fragment = new NotifFragment();
                break;
            case R.id.nav_report:
                fragment = new ReportFragment();
                break;
            case R.id.nav_map:
                fragment = new MapsFragment();
                break;
            case R.id.nav_profile:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }
}

