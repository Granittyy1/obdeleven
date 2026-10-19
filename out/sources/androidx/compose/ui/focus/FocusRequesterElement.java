package androidx.compose.ui.focus;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends H<x> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FocusRequester f13432b;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.f13432b = focusRequester;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        x xVar = new x();
        xVar.f13469p = this.f13432b;
        return xVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        x xVar = (x) cVar;
        xVar.f13469p.f13431a.m(xVar);
        FocusRequester focusRequester = this.f13432b;
        xVar.f13469p = focusRequester;
        focusRequester.f13431a.b(xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && kotlin.jvm.internal.i.a(this.f13432b, ((FocusRequesterElement) obj).f13432b);
    }

    public final int hashCode() {
        return this.f13432b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f13432b + ')';
    }
}
