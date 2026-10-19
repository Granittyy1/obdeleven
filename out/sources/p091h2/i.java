package p091h2;

import A1.C0576k;
import A1.K;
import java.util.Collections;
import java.util.List;
import p078g1.n;
import p078g1.t;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<F.a> f35896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K[] f35897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35901f = -9223372036854775807L;

    public i(List list) {
        this.f35896a = list;
        this.f35897b = new K[list.size()];
    }

    @Override // p091h2.j
    public final void a(r rVar) {
        boolean z10;
        boolean z11;
        if (this.f35898c) {
            if (this.f35899d == 2) {
                if (rVar.a() == 0) {
                    z11 = false;
                } else {
                    if (rVar.u() != 32) {
                        this.f35898c = false;
                    }
                    this.f35899d--;
                    z11 = this.f35898c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f35899d == 1) {
                if (rVar.a() == 0) {
                    z10 = false;
                } else {
                    if (rVar.u() != 0) {
                        this.f35898c = false;
                    }
                    this.f35899d--;
                    z10 = this.f35898c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = rVar.f41063b;
            int iA = rVar.a();
            for (K k10 : this.f35897b) {
                rVar.G(i10);
                k10.a(iA, rVar);
            }
            this.f35900e += iA;
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f35898c = false;
        this.f35901f = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.f35897b;
            if (i10 >= kArr.length) {
                return;
            }
            F.a aVar = this.f35896a.get(i10);
            cVar.a();
            cVar.b();
            K kP = rVar.p(cVar.f35809d, 3);
            n.a aVar2 = new n.a();
            cVar.b();
            aVar2.f35327a = cVar.f35810e;
            aVar2.f35337l = t.m("video/mp2t");
            aVar2.f35338m = t.m("application/dvbsubs");
            aVar2.f35341p = Collections.singletonList(aVar.f35801b);
            aVar2.f35330d = aVar.f35800a;
            C0576k.b(aVar2, kP);
            kArr[i10] = kP;
            i10++;
        }
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
        if (this.f35898c) {
            b.k(this.f35901f != -9223372036854775807L);
            for (K k10 : this.f35897b) {
                k10.b(this.f35901f, 1, this.f35900e, 0, null);
            }
            this.f35898c = false;
        }
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f35898c = true;
        this.f35901f = j;
        this.f35900e = 0;
        this.f35899d = 2;
    }
}
