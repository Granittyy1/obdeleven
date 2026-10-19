package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B extends Y.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LookaheadCapablePlaceable f14169b;

    public B(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f14169b = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Y.a
    public final LayoutDirection b() {
        return this.f14169b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Y.a
    public final int c() {
        return this.f14169b.o0();
    }
}
