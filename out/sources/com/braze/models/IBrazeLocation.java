package com.braze.models;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeLocation extends IPutIntoJson<JSONObject> {
    public static final String ACCURACY = "ll_accuracy";
    public static final String ALTITUDE = "altitude";
    public static final a Companion = a.f24153a;
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String VERTICAL_ACCURACY = "alt_accuracy";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f24153a = new a();

        private a() {
        }
    }

    Double getAccuracy();

    Double getAltitude();

    double getLatitude();

    double getLongitude();

    Double getVerticalAccuracy();
}
