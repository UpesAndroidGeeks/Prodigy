package com.example.shivam.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shivam on 02/12/17.
 */

public class Crime {
    private UUID mUUID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getUUID() {
        return mUUID;
    }

    public void setUUID(UUID UUID) {
        mUUID = UUID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime()
    {
        mUUID= UUID.randomUUID();
        mDate= new Date();
    }
    private void  ashi()
    {

    }
}
