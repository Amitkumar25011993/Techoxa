package com.example.amit.techoxa.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amit.techoxa.R;

import java.util.ArrayList;


public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder>{


    public NewAdapter() {

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        MyViewHolder(View view)
        {
            super(view);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {




    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
