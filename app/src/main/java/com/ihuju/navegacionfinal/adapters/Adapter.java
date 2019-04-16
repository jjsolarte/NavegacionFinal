package com.ihuju.navegacionfinal.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ihuju.navegacionfinal.R;
import com.ihuju.navegacionfinal.pojo.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>{

    private ArrayList<User> userList;
    private int resource; //Layout
    private Activity activity;

    public Adapter(ArrayList<User> userList, int resource, Activity activity) {
        this.userList = userList;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(resource,viewGroup,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder adapterViewHolder, int i) {

        User user=userList.get(i);
        adapterViewHolder.nombre.setText(user.getNombre());
        Picasso.get().load(user.getImagen()).into(adapterViewHolder.image);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView nombre;
        private ImageView icon;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.cardview_img);
            nombre=itemView.findViewById(R.id.cardview_nombre);

        }
    }

}








