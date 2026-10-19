package io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Rescheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f36987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D9.w f36988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ManagedChannelImpl.i f36989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.common.base.i f36990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture<?> f36993g;

    /* JADX INFO: compiled from: Rescheduler.java */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            A0 a10 = A0.this;
            if (!a10.f36992f) {
                a10.f36993g = null;
                return;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jA = a10.f36991e - a10.f36990d.a(timeUnit);
            if (jA > 0) {
                a10.f36993g = a10.f36987a.schedule(a10.new b(), jA, timeUnit);
            } else {
                a10.f36992f = false;
                a10.f36993g = null;
                a10.f36989c.run();
            }
        }
    }

    /* JADX INFO: compiled from: Rescheduler.java */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            A0 a10 = A0.this;
            a10.f36988b.execute(a10.new a());
        }
    }

    public A0(ManagedChannelImpl.i iVar, D9.w wVar, ScheduledExecutorService scheduledExecutorService, com.google.common.base.i iVar2) {
        this.f36989c = iVar;
        this.f36988b = wVar;
        this.f36987a = scheduledExecutorService;
        this.f36990d = iVar2;
        iVar2.b();
    }
}
