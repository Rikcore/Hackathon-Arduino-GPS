package com.hoho.android.usbserial.examples;

/**
 * Created by keru on 23/03/17.
 */

public class GpsCoord {

    private double mLat;
    private double mLon;

    private GpsCoord(){}

    public GpsCoord(double lat, double lon) {

        mLat = lat;
        mLon = lon;
    }

    public int converterLat(){

        return (int) (mLat*10e4);
    }

    public int converterLon(){

        return (int) (mLon*10e4);
    }

    public double getmLat() {
        return mLat;
    }

    public double getmLon() {
        return mLon;
    }

    public void setmLat(double mLat) {
        this.mLat = mLat;
    }

    public void setmLon(double mLon) {
        this.mLon = mLon;
    }
}
