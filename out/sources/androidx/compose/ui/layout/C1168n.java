package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.layout.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1168n implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<AbstractC1155a, Integer> f14254c;

    public C1168n(int i10, int i11, Map map) {
        this.f14252a = i10;
        this.f14253b = i11;
        this.f14254c = map;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f14253b;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f14252a;
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f14254c;
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return null;
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
    }
}
