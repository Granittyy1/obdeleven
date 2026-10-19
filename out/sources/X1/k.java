package X1;

import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends p152m1.d implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f7149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7150f;

    @Override // X1.h
    public final int a(long j) {
        h hVar = this.f7149e;
        hVar.getClass();
        return hVar.a(j - this.f7150f);
    }

    @Override // X1.h
    public final long b(int i10) {
        h hVar = this.f7149e;
        hVar.getClass();
        return hVar.b(i10) + this.f7150f;
    }

    @Override // X1.h
    public final List<p102i1.a> c(long j) {
        h hVar = this.f7149e;
        hVar.getClass();
        return hVar.c(j - this.f7150f);
    }

    @Override // X1.h
    public final int e() {
        h hVar = this.f7149e;
        hVar.getClass();
        return hVar.e();
    }

    @Override // p152m1.d
    public final void k() {
        super.k();
        this.f7149e = null;
    }
}
