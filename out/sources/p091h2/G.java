package p091h2;

import A1.C0571f;
import A1.C0576k;
import A1.K;
import java.util.List;
import p078g1.n;
import p078g1.t;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n> f35811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K[] f35812b;

    public G(List list) {
        this.f35811a = list;
        this.f35812b = new K[list.size()];
    }

    public final void a(long j, r rVar) {
        if (rVar.a() < 9) {
            return;
        }
        int iH = rVar.h();
        int iH2 = rVar.h();
        int iU = rVar.u();
        if (iH == 434 && iH2 == 1195456820 && iU == 3) {
            C0571f.b(j, rVar, this.f35812b);
        }
    }

    public final void b(A1.r rVar, F.c cVar) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.f35812b;
            if (i10 >= kArr.length) {
                return;
            }
            cVar.a();
            cVar.b();
            K kP = rVar.p(cVar.f35809d, 3);
            n nVar = this.f35811a.get(i10);
            String str = nVar.f35302n;
            b.d("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            n.a aVar = new n.a();
            cVar.b();
            aVar.f35327a = cVar.f35810e;
            aVar.f35337l = t.m("video/mp2t");
            aVar.f35338m = t.m(str);
            aVar.f35331e = nVar.f35294e;
            aVar.f35330d = nVar.f35293d;
            aVar.f35322H = nVar.f35284I;
            aVar.f35341p = nVar.f35305q;
            C0576k.b(aVar, kP);
            kArr[i10] = kP;
            i10++;
        }
    }
}
