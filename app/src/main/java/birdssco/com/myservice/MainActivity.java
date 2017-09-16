package birdssco.com.myservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import birdssco.com.myservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add fragment

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFramentMain, new MainFragment())
                    .commit();

        }

    }   //Main method      savedInstanceState = เก็บค่าต่างๆไปมาของ app

}   //Main class
