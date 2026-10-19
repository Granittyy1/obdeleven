package p091h2;

import A1.C0576k;
import A1.K;
import A1.r;
import D7.i;
import java.util.List;
import p078g1.n;
import p078g1.t;
import p127k1.g;
import p241t7.b;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n> f35761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K[] f35762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f35763c = new g(new i(this));

    public B(List list) {
        this.f35761a = list;
        this.f35762b = new K[list.size()];
    }

    public final void a(r rVar, F.c cVar) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.f35762b;
            if (i10 >= kArr.length) {
                return;
            }
            cVar.a();
            cVar.b();
            K kP = rVar.p(cVar.f35809d, 3);
            n nVar = this.f35761a.get(i10);
            String str = nVar.f35302n;
            b.d("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = nVar.f35290a;
            if (str2 == null) {
                cVar.b();
                str2 = cVar.f35810e;
            }
            n.a aVar = new n.a();
            aVar.f35327a = str2;
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
