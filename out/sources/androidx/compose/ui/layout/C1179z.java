package androidx.compose.ui.layout;

import androidx.compose.ui.node.C1195p;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.layout.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1179z implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<AbstractC1155a, Integer> f14290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1178y.c f14291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1178y f14292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ia.l<Y.a, p293xa.r> f14293f;

    public C1179z(int i10, int i11, Map map, C1178y.c cVar, C1178y c1178y, Ia.l lVar) {
        this.f14288a = i10;
        this.f14289b = i11;
        this.f14290c = map;
        this.f14291d = cVar;
        this.f14292e = c1178y;
        this.f14293f = lVar;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f14289b;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f14288a;
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f14290c;
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        C1195p.a aVar;
        boolean zS0 = this.f14291d.S0();
        Ia.l<Y.a, p293xa.r> lVar = this.f14293f;
        C1178y c1178y = this.f14292e;
        if (!zS0 || (aVar = c1178y.f14259b.f14389G.f14365b.f14603T) == null) {
            lVar.invoke(c1178y.f14259b.f14389G.f14365b.j);
        } else {
            lVar.invoke(aVar.j);
        }
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return null;
    }
}
