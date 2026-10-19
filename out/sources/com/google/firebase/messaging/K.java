package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Store.java */
/* JADX INFO: loaded from: classes3.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28290a;

    /* JADX INFO: compiled from: Store.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f28291d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f28292e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f28295c;

        public a(String str, String str2, long j) {
            this.f28293a = str;
            this.f28294b = str2;
            this.f28295c = j;
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                e10.toString();
                return null;
            }
        }
    }

    public K(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f28290a = sharedPreferences;
        File file = new File(p186p0.a.C0517a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e10.getMessage();
            }
        }
    }

    public static String a(String str, String str2) {
        return C4.b.d(str, "|T|", str2, "|*");
    }
}
