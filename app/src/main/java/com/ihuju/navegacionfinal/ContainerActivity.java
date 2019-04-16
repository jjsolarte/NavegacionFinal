package com.ihuju.navegacionfinal;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ihuju.navegacionfinal.fragments.CameraFragment;
import com.ihuju.navegacionfinal.fragments.HomeFragment;
import com.ihuju.navegacionfinal.fragments.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    BottomNavigationView btnNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        HomeFragment homeFragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_frame,homeFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();

        btnNavigation=findViewById(R.id.container_btn_nav);

        btnNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_home:
                        HomeFragment homeFragment=new HomeFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container_frame,homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.menu_search:
                        SearchFragment searchFragment=new SearchFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container_frame,searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.menu_camera:
                        CameraFragment cameraFragment=new CameraFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container_frame,cameraFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                }
                return false;
            }
        });

    }

}
