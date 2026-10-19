package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: SharedPreferencesQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28285a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28289e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f28288d = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28286b = "topic_operation_queue";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28287c = ",";

    public J(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f28285a = sharedPreferences;
        this.f28289e = scheduledThreadPoolExecutor;
    }

    public static J a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        J j = new J(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (j.f28288d) {
            try {
                j.f28288d.clear();
                String string = j.f28285a.getString(j.f28286b, "");
                if (!TextUtils.isEmpty(string) && string.contains(j.f28287c)) {
                    String[] strArrSplit = string.split(j.f28287c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            j.f28288d.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
