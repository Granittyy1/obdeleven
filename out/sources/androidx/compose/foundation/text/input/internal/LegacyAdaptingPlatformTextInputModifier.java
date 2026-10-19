package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* JADX INFO: compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends androidx.compose.ui.node.H<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f11289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyTextFieldState f11290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextFieldSelectionManager f11291d;

    public LegacyAdaptingPlatformTextInputModifier(X x10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.f11289b = x10;
        this.f11290c = legacyTextFieldState;
        this.f11291d = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new T(this.f11289b, this.f11290c, this.f11291d);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        T t8 = (T) cVar;
        if (t8.f13997o) {
            ((AndroidLegacyPlatformTextInputServiceAdapter) t8.f11308p).d();
            t8.f11308p.j(t8);
        }
        X x10 = this.f11289b;
        t8.f11308p = x10;
        if (t8.f13997o) {
            if (x10.f11328a != null) {
                p245u.c.c("Expected textInputModifierNode to be null");
            }
            x10.f11328a = t8;
        }
        t8.f11309q = this.f11290c;
        t8.f11310r = this.f11291d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return kotlin.jvm.internal.i.a(this.f11289b, legacyAdaptingPlatformTextInputModifier.f11289b) && kotlin.jvm.internal.i.a(this.f11290c, legacyAdaptingPlatformTextInputModifier.f11290c) && kotlin.jvm.internal.i.a(this.f11291d, legacyAdaptingPlatformTextInputModifier.f11291d);
    }

    public final int hashCode() {
        return this.f11291d.hashCode() + ((this.f11290c.hashCode() + (this.f11289b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f11289b + ", legacyTextFieldState=" + this.f11290c + ", textFieldSelectionManager=" + this.f11291d + ')';
    }
}
