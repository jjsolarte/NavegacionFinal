package com.ihuju.navegacionfinal.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ihuju.navegacionfinal.R;
import com.ihuju.navegacionfinal.adapters.Adapter;
import com.ihuju.navegacionfinal.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    Adapter adapter;
    ArrayList<User> users;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar("Home",true,view);

        llenarUserList();
        RecyclerView recyclerView=view.findViewById(R.id.fragment_home_recicler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        Adapter adapter=new Adapter((ArrayList<User>) users,
                R.layout.cardview_user,getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void llenarUserList() {
        users=new ArrayList<>();
        users.add(new User("Alejandro","https://cdn.tn.com.ar/sites/default/files/styles/1366x765/public/2018/10/09/alejandro_sanz.jpg",29));
        users.add(new User("Thalia","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/ThaliaSodi_cropped.jpg/250px-ThaliaSodi_cropped.jpg",29));
        users.add(new User("Fernando","https://historia-arte.com/_/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpbSI6WyJcL2FydGlzdFwvaW1hZ2VGaWxlXC8zMTJiODAzZjdhM2M4MDFkZGQ4MjRmM2Q0ZWU4OGQ1NS5qcGciLCJyZXNpemVDcm9wLDQwMCw0MDAsQ1JPUF9FTlRST1BZIl19.QCOKDKRZQjzeivk_hDRLoxD5L5/lTDxgsL-WruehzhiM.jpg",29));
    }

    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar=view.findViewById(R.id.toolbar_fragment);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
