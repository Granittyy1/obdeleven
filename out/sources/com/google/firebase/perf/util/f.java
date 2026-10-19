package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Rate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f28504c;

    /* JADX INFO: compiled from: Rate.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28505a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f28505a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28505a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28505a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(long j, long j10, TimeUnit timeUnit) {
        this.f28502a = j;
        this.f28503b = j10;
        this.f28504c = timeUnit;
    }
}
