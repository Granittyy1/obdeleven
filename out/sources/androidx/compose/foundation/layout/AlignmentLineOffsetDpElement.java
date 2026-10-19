package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends androidx.compose.ui.node.H<C0943c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1165k f10081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10084e;

    public AlignmentLineOffsetDpElement() {
        throw null;
    }

    public AlignmentLineOffsetDpElement(C1165k c1165k, float f10, float f11, Ia.l lVar) {
        this.f10081b = c1165k;
        this.f10082c = f10;
        this.f10083d = f11;
        this.f10084e = lVar;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            p258v.a.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        C0943c c0943c = new C0943c();
        c0943c.f10251p = this.f10081b;
        c0943c.f10252q = this.f10082c;
        c0943c.f10253r = this.f10083d;
        return c0943c;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        C0943c c0943c = (C0943c) cVar;
        c0943c.f10251p = this.f10081b;
        c0943c.f10252q = this.f10082c;
        c0943c.f10253r = this.f10083d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10081b, alignmentLineOffsetDpElement.f10081b) && p013b0.f.a(this.f10082c, alignmentLineOffsetDpElement.f10082c) && p013b0.f.a(this.f10083d, alignmentLineOffsetDpElement.f10083d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10083d) + O.a.d(this.f10082c, this.f10081b.hashCode() * 31, 31);
    }
}
