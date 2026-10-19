package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Y.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutDirection f14238c;

    public d0(int i10, LayoutDirection layoutDirection) {
        this.f14237b = i10;
        this.f14238c = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.Y.a
    public final LayoutDirection b() {
        return this.f14238c;
    }

    @Override // androidx.compose.ui.layout.Y.a
    public final int c() {
        return this.f14237b;
    }
}
