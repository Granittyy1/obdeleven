package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.layout.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ApproachMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1158d implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<AbstractC1155a, Integer> f14234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ia.l<Y.a, p293xa.r> f14235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1159e f14236e;

    public C1158d(int i10, int i11, Map map, Ia.l lVar, C1159e c1159e) {
        this.f14235d = lVar;
        this.f14236e = c1159e;
        this.f14232a = i10;
        this.f14233b = i11;
        this.f14234c = map;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f14233b;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f14232a;
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f14234c;
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        this.f14235d.invoke(this.f14236e.f14239b.j);
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return null;
    }
}
