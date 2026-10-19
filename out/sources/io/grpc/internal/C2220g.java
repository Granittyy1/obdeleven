package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AtomicBackoff.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2220g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f37540c = Logger.getLogger(C2220g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f37542b;

    /* JADX INFO: renamed from: io.grpc.internal.g$a */
    /* JADX INFO: compiled from: AtomicBackoff.java */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f37543a;

        public a(long j) {
            this.f37543a = j;
        }
    }

    public C2220g(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f37542b = atomicLong;
        A8.p.f("value must be positive", j > 0);
        this.f37541a = "keepalive time nanos";
        atomicLong.set(j);
    }
}
