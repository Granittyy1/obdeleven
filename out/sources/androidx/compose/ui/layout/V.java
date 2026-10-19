package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class V extends Y.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.node.U f14219b;

    public V(androidx.compose.ui.node.U u10) {
        this.f14219b = u10;
    }

    @Override // androidx.compose.ui.layout.Y.a
    public final LayoutDirection b() {
        return this.f14219b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Y.a
    public final int c() {
        return this.f14219b.getRoot().f14390H.f14641p.f14220b;
    }
}
