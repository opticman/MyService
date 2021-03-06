package birdssco.com.myservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import birdssco.com.myservice.R;

/**
 * Created by opticman on 16-Sep-17.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }   //class create fragment View

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //  add button controller
        ButtonController();

    }

    private void ButtonController() {
        Button button = (Button) getView().findViewById(R.id.btnGoToSecond);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.contentFramentMain, new SecondFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }
}   //Main Class
