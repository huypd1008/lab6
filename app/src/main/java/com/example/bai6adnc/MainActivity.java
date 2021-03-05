package com.example.bai6adnc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                int s = 0;
                while (s < 2000){
                    try {
                        sleep(1000);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    s += 400;
                }
                openMap();
            }
        };
        thread.start();


    }
    public void openMap(){
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        this.mapFragment = (MapFragment) fragmentManager.findFragmentById(R.id.fragment_map);
    }
}