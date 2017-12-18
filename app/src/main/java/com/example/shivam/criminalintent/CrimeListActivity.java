package com.example.shivam.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shivam on 10/12/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
