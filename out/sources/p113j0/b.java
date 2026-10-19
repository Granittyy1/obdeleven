package p113j0;

import p077g0.k;
import p077g0.m;
import p077g0.n;
import p126k0.p;

/* JADX INFO: compiled from: StopLogic.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f40982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f40983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f40984c;

    public b() {
        n nVar = new n();
        nVar.f35167k = false;
        this.f40982a = nVar;
        this.f40984c = nVar;
    }

    @Override // p126k0.p
    public final float a() {
        return this.f40984c.b();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        n nVar = this.f40982a;
        this.f40984c = nVar;
        nVar.f35168l = f10;
        boolean z10 = f10 > f11;
        nVar.f35167k = z10;
        if (z10) {
            nVar.d(-f12, f10 - f11, f14, f15, f13);
        } else {
            nVar.d(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return this.f40984c.getInterpolation(f10);
    }
}
