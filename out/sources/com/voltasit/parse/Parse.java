package com.voltasit.parse;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.voltasit.sharednetwork.dataSources.b;
import io.intercom.android.sdk.models.Participant;
import p242t9.a;
import p255u9.z;

/* JADX INFO: loaded from: classes3.dex */
public class Parse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f34394a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f34395b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ConnectivityManager f34396c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f34397d = "";

    public static synchronized boolean a() {
        NetworkInfo activeNetworkInfo;
        activeNetworkInfo = f34396c.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void b() {
        ParseInstallation currentInstallation = ParseInstallation.getCurrentInstallation();
        currentInstallation.put("osVersion", Build.VERSION.RELEASE);
        int i10 = z.f47484b;
        if (((z) ParseUser.getCurrentUser()) != null) {
            currentInstallation.put(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
        }
        currentInstallation.saveInBackground();
    }

    public static native String invokeNativeFunction(int i10);
}
