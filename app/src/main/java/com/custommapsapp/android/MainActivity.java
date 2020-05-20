package com.custommapsapp.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private Fragment mFragment = null;
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
      //  mFragment = new SelectionFragment();
      //  fragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();

    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
//                            mFragment = new HomeFragment();
//                            fragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();
                            //         openFragment(HomeFragment.newInstance("", ""));
                            return true;
                        case R.id.navigation_sms:

                            mFragment = new QrCodeScannerFragment();
                            fragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();

                            return true;
                        case R.id.navigation_notifications:
                            //    openFragment(NotificationFragment.newInstance("", ""));
                            //   Toast.makeText(getApplicationContext(),"here ",Toast.LENGTH_LONG).show();
//                            mFragment = new SelectionFragment();
//                            fragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();
                            return true;

                        case R.id.navigation_payment:
                            //    openFragment(NotificationFragment.newInstance("", ""));
                            //   Toast.makeText(getApplicationContext(),"here ",Toast.LENGTH_LONG).show();

                            return true;
                    }
                    return false;
                }
            };
}
