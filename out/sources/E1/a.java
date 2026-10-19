package E1;

import A1.E;
import A1.H;
import A1.p;
import A1.q;
import A1.r;
import java.io.IOException;

/* JADX INFO: compiled from: BmpExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f2967a = new H("image/bmp", 16973, 2);

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f2967a.f(j, j10);
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        return this.f2967a.h(qVar, e10);
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        return this.f2967a.l(qVar);
    }

    @Override // A1.p
    public final void m(r rVar) {
        this.f2967a.m(rVar);
    }

    @Override // A1.p
    public final void a() {
    }
}
