package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends androidx.compose.ui.node.H<PaddingValuesModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f10196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10197c;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(L l10, Ia.l<? super C1235n0, p293xa.r> lVar) {
        this.f10196b = l10;
        this.f10197c = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        PaddingValuesModifier paddingValuesModifier = new PaddingValuesModifier();
        paddingValuesModifier.f10198p = this.f10196b;
        return paddingValuesModifier;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((PaddingValuesModifier) cVar).f10198p = this.f10196b;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10196b, paddingValuesElement.f10196b);
    }

    public final int hashCode() {
        return this.f10196b.hashCode();
    }
}
