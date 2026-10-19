package rb;

import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d.c f46596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f46597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, d.c cVar, t tVar) {
        super(str, true);
        this.f46596e = cVar;
        this.f46597f = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, rb.t] */
    @Override // p184ob.a
    public final long a() {
        long jA;
        int i10;
        p[] pVarArr;
        d.c cVar = this.f46596e;
        t tVar = this.f46597f;
        cVar.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        d dVar = d.this;
        synchronized (dVar.f46570x) {
            synchronized (dVar) {
                try {
                    t tVar2 = dVar.f46564r;
                    ?? tVar3 = new t();
                    tVar3.b(tVar2);
                    tVar3.b(tVar);
                    ref$ObjectRef.element = tVar3;
                    jA = ((long) tVar3.a()) - ((long) tVar2.a());
                    pVarArr = (jA == 0 || dVar.f46550c.isEmpty()) ? null : (p[]) dVar.f46550c.values().toArray(new p[0]);
                    t tVar4 = (t) ref$ObjectRef.element;
                    kotlin.jvm.internal.i.e(tVar4, "<set-?>");
                    dVar.f46564r = tVar4;
                    dVar.f46557k.c(new e(dVar.f46551d + " onSettings", dVar, ref$ObjectRef), 0L);
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                dVar.f46570x.b((t) ref$ObjectRef.element);
            } catch (IOException e10) {
                dVar.c(e10);
            }
            p293xa.r rVar2 = p293xa.r.f47939a;
        }
        if (pVarArr == null) {
            return -1L;
        }
        for (p pVar : pVarArr) {
            synchronized (pVar) {
                pVar.f46634f += jA;
                if (jA > 0) {
                    pVar.notifyAll();
                }
                p293xa.r rVar3 = p293xa.r.f47939a;
            }
        }
        return -1L;
    }
}
