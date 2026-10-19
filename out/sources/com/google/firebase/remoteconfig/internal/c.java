package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: compiled from: ConfigMetadataClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f28598e = new Date(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f28599f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28601b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28602c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28603d = new Object();

    /* JADX INFO: compiled from: ConfigMetadataClient.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f28605b;
    }

    /* JADX INFO: compiled from: ConfigMetadataClient.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f28607b;
    }

    public c(SharedPreferences sharedPreferences) {
        this.f28600a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.f28602c) {
            int i10 = this.f28600a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f28600a.getLong("backoff_end_time_in_millis", -1L));
            aVar = new a();
            aVar.f28604a = i10;
            aVar.f28605b = date;
        }
        return aVar;
    }

    public final b b() {
        b bVar;
        synchronized (this.f28603d) {
            int i10 = this.f28600a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f28600a.getLong("realtime_backoff_end_time_in_millis", -1L));
            bVar = new b();
            bVar.f28606a = i10;
            bVar.f28607b = date;
        }
        return bVar;
    }

    public final void c(int i10, Date date) {
        synchronized (this.f28602c) {
            this.f28600a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i10, Date date) {
        synchronized (this.f28603d) {
            this.f28600a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
