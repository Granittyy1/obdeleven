package D1;

import A1.C0574i;
import A1.E;
import A1.H;
import A1.p;
import A1.q;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: compiled from: AvifExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f2472a = new r(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f2473b = new H("image/avif", -1, -1);

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f2473b.f(j, j10);
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        return this.f2473b.h(qVar, e10);
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        C0574i c0574i = (C0574i) qVar;
        c0574i.k(4, false);
        r rVar = this.f2472a;
        rVar.D(4);
        c0574i.c(rVar.f41062a, 0, 4, false);
        if (rVar.w() != 1718909296) {
            return false;
        }
        rVar.D(4);
        c0574i.c(rVar.f41062a, 0, 4, false);
        return rVar.w() == ((long) 1635150182);
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f2473b.m(rVar);
    }

    @Override // A1.p
    public final void a() {
    }
}
