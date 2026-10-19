package androidx.media3.exoplayer;

import p078g1.C2196b;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends p235t1.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.x.c f18471c;

    public k0(p078g1.x xVar) {
        super(xVar);
        this.f18471c = new g1.x.c();
    }

    @Override // p235t1.h, p078g1.x
    public final g1.x.b f(int i10, g1.x.b bVar, boolean z10) {
        p078g1.x xVar = this.f47017b;
        g1.x.b bVarF = xVar.f(i10, bVar, z10);
        if (xVar.m(bVarF.f35470c, this.f18471c, 0L).a()) {
            bVarF.h(bVar.f35468a, bVar.f35469b, bVar.f35470c, bVar.f35471d, bVar.f35472e, C2196b.f35233c, true);
        } else {
            bVarF.f35473f = true;
        }
        return bVarF;
    }
}
