package io.grpc.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackoffPolicyRetryScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2222h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f37547f = Logger.getLogger(C2222h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManagedChannelImpl.m f37548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D9.w f37549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E.a f37550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f37551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D9.w.c f37552e;

    public C2222h(E.a aVar, ManagedChannelImpl.m mVar, D9.w wVar) {
        this.f37550c = aVar;
        this.f37548a = mVar;
        this.f37549b = wVar;
    }

    public final void a(G0.a aVar) {
        this.f37549b.d();
        if (this.f37551d == null) {
            this.f37551d = this.f37550c.a();
        }
        D9.w.c cVar = this.f37552e;
        if (cVar != null) {
            D9.w.b bVar = cVar.f2920a;
            if (!bVar.f2919d && !bVar.f2918c) {
                return;
            }
        }
        long jA = this.f37551d.a();
        this.f37552e = this.f37549b.c(aVar, jA, TimeUnit.NANOSECONDS, this.f37548a);
        f37547f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
