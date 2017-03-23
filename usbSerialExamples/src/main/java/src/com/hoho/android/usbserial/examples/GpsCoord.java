package src.com.hoho.android.usbserial.examples;

/**
 * Created by keru on 23/03/17.
 */

public class GpsCoord {

    private double mLat;
    private double mLon;

    private GpsCoord(){}

    public GpsCoord(double lat, double lon) {

        mLat = lat*10e4;
        mLon = lon*10e4;
    }

    public int converterLat(){

        return (int) mLat;
    }

    public int converterLon(){

        return (int) mLon;
    }
}
