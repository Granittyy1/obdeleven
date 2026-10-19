package io.grpc.internal;

import java.util.concurrent.atomic.AtomicReference;
import p131k5.C2523i1;
import p131k5.C2587y2;
import p131k5.InterfaceC2561s0;
import p131k5.P2;

/* JADX INFO: renamed from: io.grpc.internal.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelayedClientCall.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2252x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37741d;

    public /* synthetic */ RunnableC2252x(Object obj, int i10, Object obj2) {
        this.f37739b = i10;
        this.f37741d = obj;
        this.f37740c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37739b) {
            case 0:
                ((C2251w) this.f37741d).f37709f.d((N7.d) this.f37740c);
                return;
            case 1:
                synchronized (((AtomicReference) this.f37740c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.f37740c;
                            C2523i1 c2523i1 = (C2523i1) ((com.google.android.gms.measurement.internal.e) this.f37741d).f3968a;
                            atomicReference.set(Integer.valueOf(c2523i1.f42218g.u(c2523i1.o().w(), p131k5.B.f41633O)));
                            ((AtomicReference) this.f37740c).notify();
                        } catch (Throwable th) {
                            ((AtomicReference) this.f37740c).notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (((P2) this.f37741d)) {
                    try {
                        ((P2) this.f37741d).f41956b = false;
                        if (!((P2) this.f37741d).f41958d.E()) {
                            ((P2) this.f37741d).f41958d.d().f41719n.c("Connected to service");
                            C2587y2 c2587y2 = ((P2) this.f37741d).f41958d;
                            InterfaceC2561s0 interfaceC2561s0 = (InterfaceC2561s0) this.f37740c;
                            c2587y2.p();
                            c2587y2.f42536d = interfaceC2561s0;
                            c2587y2.I();
                            c2587y2.H();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }
}
