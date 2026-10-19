package io.grpc.internal;

import java.util.logging.Level;

/* JADX INFO: compiled from: DelayedStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37128c;

    public /* synthetic */ C(int i10, Object obj) {
        this.f37127b = i10;
        this.f37128c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p184ob.a aVarC;
        long jNanoTime;
        switch (this.f37127b) {
            case 0:
                ((B) this.f37128c).n();
                return;
        }
        while (true) {
            p184ob.d dVar = (p184ob.d) this.f37128c;
            synchronized (dVar) {
                aVarC = dVar.c();
            }
            if (aVarC == null) {
                return;
            }
            p184ob.c cVar = aVarC.f45251c;
            kotlin.jvm.internal.i.b(cVar);
            p184ob.d dVar2 = (p184ob.d) this.f37128c;
            boolean zIsLoggable = p184ob.d.f45261i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                ob.d.a aVar = cVar.f45254a.f45262a;
                jNanoTime = System.nanoTime();
                kotlin.jvm.internal.h.c(aVarC, cVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                p184ob.d.a(dVar2, aVarC);
                try {
                    p293xa.r rVar = p293xa.r.f47939a;
                    if (zIsLoggable) {
                        ob.d.a aVar2 = cVar.f45254a.f45262a;
                        kotlin.jvm.internal.h.c(aVarC, cVar, "finished run in ".concat(kotlin.jvm.internal.h.e(System.nanoTime() - jNanoTime)));
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        ob.d.a aVar3 = cVar.f45254a.f45262a;
                        kotlin.jvm.internal.h.c(aVarC, cVar, "failed a run in ".concat(kotlin.jvm.internal.h.e(System.nanoTime() - jNanoTime)));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                dVar2.f45262a.a(this);
                throw th2;
            }
        }
    }
}
