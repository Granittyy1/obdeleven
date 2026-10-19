package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ParseGeoPoint implements Parcelable {
    public static final Parcelable.Creator<ParseGeoPoint> CREATOR = new Parcelable.Creator<ParseGeoPoint>() { // from class: com.parse.ParseGeoPoint.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseGeoPoint createFromParcel(Parcel parcel) {
            return new ParseGeoPoint(parcel, ParseParcelDecoder.get());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseGeoPoint[] newArray(int i10) {
            return new ParseGeoPoint[i10];
        }
    };
    static double EARTH_MEAN_RADIUS_KM = 6371.0d;
    static double EARTH_MEAN_RADIUS_MILE = 3958.8d;
    private double latitude = 0.0d;
    private double longitude = 0.0d;

    public ParseGeoPoint() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double distanceInRadiansTo(ParseGeoPoint parseGeoPoint) {
        double d10 = this.latitude * 0.017453292519943295d;
        double d11 = this.longitude * 0.017453292519943295d;
        double latitude = parseGeoPoint.getLatitude() * 0.017453292519943295d;
        double longitude = d11 - (parseGeoPoint.getLongitude() * 0.017453292519943295d);
        double dSin = Math.sin((d10 - latitude) / 2.0d);
        double dSin2 = Math.sin(longitude / 2.0d);
        return Math.asin(Math.sqrt(Math.min(1.0d, (Math.cos(latitude) * Math.cos(d10) * dSin2 * dSin2) + (dSin * dSin)))) * 2.0d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ParseGeoPoint)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ParseGeoPoint parseGeoPoint = (ParseGeoPoint) obj;
        return parseGeoPoint.getLatitude() == this.latitude && parseGeoPoint.getLongitude() == this.longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLatitude(double d10) {
        if (d10 > 90.0d || d10 < -90.0d) {
            throw new IllegalArgumentException("Latitude must be within the range (-90.0, 90.0).");
        }
        this.latitude = d10;
    }

    public void setLongitude(double d10) {
        if (d10 > 180.0d || d10 < -180.0d) {
            throw new IllegalArgumentException("Longitude must be within the range (-180.0, 180.0).");
        }
        this.longitude = d10;
    }

    public String toString() {
        return String.format(Locale.US, "ParseGeoPoint[%.6f,%.6f]", Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        writeToParcel(parcel, ParseParcelEncoder.get());
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }

    public ParseGeoPoint(double d10, double d11) {
        setLatitude(d10);
        setLongitude(d11);
    }

    public ParseGeoPoint(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        setLatitude(parcel.readDouble());
        setLongitude(parcel.readDouble());
    }
}
