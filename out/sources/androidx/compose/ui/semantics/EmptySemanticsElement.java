package androidx.compose.ui.semantics;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: SemanticsModifier.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends H<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15133b;

    public EmptySemanticsElement(f fVar) {
        this.f15133b = fVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return this.f15133b;
    }

    @Override // androidx.compose.ui.node.H
    public final /* bridge */ /* synthetic */ void e(androidx.compose.ui.h.c cVar) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
