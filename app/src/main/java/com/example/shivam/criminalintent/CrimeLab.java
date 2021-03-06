package com.example.shivam.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by shivam on 10/12/17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for(int i =0;i<100;i++)
        {
            Crime crime = new Crime();
            crime.setTitle("Crime: "+i);
            crime.setSolved(i%2==0);
            mCrimes.add(crime);
        }
    }

    public static  CrimeLab get(Context context)
    {
        if(sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    public Crime getCrime(UUID uuid)
    {
        for(Crime crime:mCrimes)
        {
            if(crime.getUUID().equals(uuid))
            {
                return crime;
            }
        }
        return  null;
    }
    public List<Crime> getCrime()
    {
        return mCrimes;
    }
}
