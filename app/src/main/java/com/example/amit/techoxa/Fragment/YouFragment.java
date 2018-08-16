package com.example.amit.techoxa.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.amit.techoxa.R;


public class YouFragment extends android.support.v4.app.Fragment {

    LinearLayout linear1,linear2,linear3,linear4;

    CardView card1;
    LinearLayout linear_profile,linear_wallets,linear_chat,linear_email;
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard

        View view = inflater.inflate(R.layout.fragment_you, container, false);



        linear_profile= (LinearLayout) view.findViewById(R.id.linear_profile);
        linear_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile();
            }
        });


        linear_wallets= (LinearLayout) view.findViewById(R.id.linear_wallets);
        linear_wallets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wallets();
            }
        });



        linear_chat= (LinearLayout) view.findViewById(R.id.linear_chat);
        linear_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chat();
            }
        });



        return view;



    }

    private void chat() {
        ChatFragment newGamefragment = new ChatFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, newGamefragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void wallets() {

        WalletsFragment newGamefragment = new WalletsFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, newGamefragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void profile() {

        ProfileFragment newGamefragment = new ProfileFragment();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, newGamefragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }



}


