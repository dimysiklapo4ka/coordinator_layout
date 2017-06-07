package ua.init.team.layoutmaster.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.init.team.layoutmaster.InterfaceUtils;
import ua.init.team.layoutmaster.MainActivity;
import ua.init.team.layoutmaster.OnButtonClick;
import ua.init.team.layoutmaster.R;

/**
 * Created by dev on 02.06.17.
 */

public class MainFragment extends Fragment  {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main_fragment, container, false);

        //onButtonClick = new OnButtonClick[2];


        view.findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InterfaceUtils.getInterfaceUtils().getOnButtonClick().click();

            }
        });
        return view;
    }

}
