package p091h2;

import A1.K;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.r;
import p114j1.w;
import p241t7.b;

/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class u implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f36089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f36090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f36091c;

    public u(String str) {
        n.a aVar = new n.a();
        aVar.f35337l = t.m("video/mp2t");
        aVar.f35338m = t.m(str);
        this.f36089a = new n(aVar);
    }

    @Override // p091h2.z
    public final void a(r rVar) {
        long jD;
        long j;
        b.l(this.f36090b);
        int i10 = A.f40996a;
        w wVar = this.f36090b;
        synchronized (wVar) {
            try {
                long j10 = wVar.f41077c;
                jD = j10 != -9223372036854775807L ? j10 + wVar.f41076b : wVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        w wVar2 = this.f36090b;
        synchronized (wVar2) {
            j = wVar2.f41076b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        n nVar = this.f36089a;
        if (j != nVar.f35307s) {
            n.a aVarA = nVar.a();
            aVarA.f35343r = j;
            n nVar2 = new n(aVarA);
            this.f36089a = nVar2;
            this.f36091c.d(nVar2);
        }
        int iA = rVar.a();
        this.f36091c.a(iA, rVar);
        this.f36091c.b(jD, 1, iA, 0, null);
    }

    @Override // p091h2.z
    public final void b(w wVar, A1.r rVar, F.c cVar) {
        this.f36090b = wVar;
        cVar.a();
        cVar.b();
        K kP = rVar.p(cVar.f35809d, 5);
        this.f36091c = kP;
        kP.d(this.f36089a);
    }
}
