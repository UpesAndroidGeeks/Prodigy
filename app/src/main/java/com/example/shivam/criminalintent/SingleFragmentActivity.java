package com.example.shivam.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by shivam on 10/12/17.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment createFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v4.app.FragmentManager fm =getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.frameContainer);
        if(fragment == null)
        {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.frameContainer,fragment).commit();
        }
    }

}
