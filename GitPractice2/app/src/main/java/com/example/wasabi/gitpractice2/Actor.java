package com.example.wasabi.gitpractice2;

/**
 * Created by Wasabi on 2/29/2016.
 */
public class Actor {

    private String mName;
    private String mDOB;
    private String mOscar;

    public Actor(String mName, String mDOB, String mOscar) {
        this.mName = mName;
        this.mDOB = mDOB;
        this.mOscar = mOscar;
    }

    public String getmDOB() {
        return mDOB;
    }

    public void setmDOB(String mDOB) {
        this.mDOB = mDOB;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmOscar() {
        return mOscar;
    }

    public void setmOscar(String mOscar) {
        this.mOscar = mOscar;
    }
}
