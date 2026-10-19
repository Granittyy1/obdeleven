package androidx.compose.ui.semantics;

import androidx.collection.B;
import androidx.collection.I;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutNode f15247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f15249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I<n> f15250d = new I<>(2);

    public s(LayoutNode layoutNode, f fVar, B b10) {
        this.f15247a = layoutNode;
        this.f15248b = fVar;
        this.f15249c = b10;
    }

    public final q a() {
        return new q(this.f15248b, false, this.f15247a, new l());
    }
}
