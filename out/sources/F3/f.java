package F3;

import D3.o;

/* JADX INFO: compiled from: LruResourceCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends X3.g<A3.b, o<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.load.engine.c f3222d;

    @Override // X3.g
    public final int b(o<?> oVar) {
        o<?> oVar2 = oVar;
        if (oVar2 == null) {
            return 1;
        }
        return oVar2.getSize();
    }

    @Override // X3.g
    public final void c(A3.b bVar, o<?> oVar) {
        o<?> oVar2 = oVar;
        com.bumptech.glide.load.engine.c cVar = this.f3222d;
        if (cVar == null || oVar2 == null) {
            return;
        }
        cVar.f24591e.a(oVar2, true);
    }
}
