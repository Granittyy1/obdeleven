package io.grpc.internal;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExponentialBackoffPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f37173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f37175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f37176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37177e;

    /* JADX INFO: compiled from: ExponentialBackoffPolicy.java */
    public static final class a {
        public final E a() {
            E e10 = new E();
            e10.f37173a = new Random();
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            e10.f37174b = TimeUnit.MINUTES.toNanos(2L);
            e10.f37175c = 1.6d;
            e10.f37176d = 0.2d;
            e10.f37177e = nanos;
            return e10;
        }
    }

    public final long a() {
        long j = this.f37177e;
        double d10 = j;
        this.f37177e = Math.min((long) (this.f37175c * d10), this.f37174b);
        double d11 = this.f37176d;
        double d12 = (-d11) * d10;
        double d13 = d11 * d10;
        A8.p.g(d13 >= d12);
        return j + ((long) ((this.f37173a.nextDouble() * (d13 - d12)) + d12));
    }
}
