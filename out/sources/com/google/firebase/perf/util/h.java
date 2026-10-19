package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28508c;

    /* JADX INFO: compiled from: Timer.java */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new h().f28508c - this.f28508c;
    }

    public final long b(h hVar) {
        return hVar.f28508c - this.f28508c;
    }

    public final long c() {
        return this.f28507b;
    }

    public final void d() {
        this.f28507b = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f28508c = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f28507b);
        parcel.writeLong(this.f28508c);
    }

    @VisibleForTesting
    public h(long j, long j10) {
        this.f28507b = j;
        this.f28508c = j10;
    }
}
