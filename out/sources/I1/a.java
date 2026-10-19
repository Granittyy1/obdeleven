package I1;

import A1.E;
import A1.H;
import A1.p;
import A1.q;
import A1.r;
import java.io.IOException;

/* JADX INFO: compiled from: JpegExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3782a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f3782a = new H("image/jpeg", 65496, 2);
        } else {
            this.f3782a = new b();
        }
    }

    @Override // A1.p
    public final void a() {
        this.f3782a.a();
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f3782a.f(j, j10);
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        return this.f3782a.h(qVar, e10);
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        return this.f3782a.l(qVar);
    }

    @Override // A1.p
    public final void m(r rVar) {
        this.f3782a.m(rVar);
    }
}
