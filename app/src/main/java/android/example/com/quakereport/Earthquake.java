package android.example.com.quakereport;

import androidx.annotation.NonNull;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the string representation of the {@link Earthquake} object.
     */
    @NonNull
    @Override
    public String toString() {
        return "Earthquake{" +
                "mMagnitude='" + mMagnitude + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mDate=" + mTimeInMilliseconds +
                '}';
    }
}
