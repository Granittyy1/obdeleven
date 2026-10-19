package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: StatsTraceContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C.g[] f37429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f37430b = new AtomicBoolean(false);

    static {
        new O0(new C.g[0]);
    }

    public O0(C.g[] gVarArr) {
        this.f37429a = gVarArr;
    }

    public final void a(long j) {
        for (C.g gVar : this.f37429a) {
            gVar.X(j);
        }
    }
}
