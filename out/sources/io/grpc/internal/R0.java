package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TimeProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public interface R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37437a = new a();

    /* JADX INFO: compiled from: TimeProvider.java */
    public class a implements R0 {
        public final long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }
}
