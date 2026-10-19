package androidx.compose.ui.graphics.vector;

import p293xa.r;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ia.l<? super g, r> f13959a;

    public abstract void a(J.e eVar);

    public Ia.l<g, r> b() {
        return this.f13959a;
    }

    public final void c() {
        Ia.l<g, r> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(Ia.l<? super g, r> lVar) {
        this.f13959a = lVar;
    }
}
