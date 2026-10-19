package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1186g;

/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends androidx.compose.ui.node.H<MagnifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<p013b0.c, I.d> f9782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<p013b0.c, I.d> f9783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<p013b0.h, p293xa.r> f9784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f9789i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H f9790k;

    public MagnifierElement() {
        throw null;
    }

    public MagnifierElement(Ia.l lVar, Ia.l lVar2, Ia.l lVar3, float f10, boolean z10, long j, float f11, float f12, boolean z11, H h8) {
        this.f9782b = lVar;
        this.f9783c = lVar2;
        this.f9784d = lVar3;
        this.f9785e = f10;
        this.f9786f = z10;
        this.f9787g = j;
        this.f9788h = f11;
        this.f9789i = f12;
        this.j = z11;
        this.f9790k = h8;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new MagnifierNode(this.f9782b, this.f9783c, this.f9784d, this.f9785e, this.f9786f, this.f9787g, this.f9788h, this.f9789i, this.j, this.f9790k);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        MagnifierNode magnifierNode = (MagnifierNode) cVar;
        float f10 = magnifierNode.f9801s;
        long j = magnifierNode.f9803u;
        float f11 = magnifierNode.f9804v;
        boolean z10 = magnifierNode.f9802t;
        float f12 = magnifierNode.f9805w;
        boolean z11 = magnifierNode.f9806x;
        H h8 = magnifierNode.f9807y;
        View view = magnifierNode.f9808z;
        p013b0.c cVar2 = magnifierNode.f9791A;
        magnifierNode.f9798p = this.f9782b;
        magnifierNode.f9799q = this.f9783c;
        float f13 = this.f9785e;
        magnifierNode.f9801s = f13;
        boolean z12 = this.f9786f;
        magnifierNode.f9802t = z12;
        long j10 = this.f9787g;
        magnifierNode.f9803u = j10;
        float f14 = this.f9788h;
        magnifierNode.f9804v = f14;
        float f15 = this.f9789i;
        magnifierNode.f9805w = f15;
        boolean z13 = this.j;
        magnifierNode.f9806x = z13;
        magnifierNode.f9800r = this.f9784d;
        H h10 = this.f9790k;
        magnifierNode.f9807y = h10;
        View viewA = C1186g.a(magnifierNode);
        p013b0.c cVar3 = C1185f.f(magnifierNode).f14423z;
        if (magnifierNode.f9792B != null) {
            androidx.compose.ui.semantics.v<Ia.a<I.d>> vVar = A.f9677a;
            if (((!Float.isNaN(f13) || !Float.isNaN(f10)) && f13 != f10 && !h10.a()) || j10 != j || !p013b0.f.a(f14, f11) || !p013b0.f.a(f15, f12) || z12 != z10 || z13 != z11 || !kotlin.jvm.internal.i.a(h10, h8) || !viewA.equals(view) || !kotlin.jvm.internal.i.a(cVar3, cVar2)) {
                magnifierNode.R1();
            }
        }
        magnifierNode.S1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f9782b == magnifierElement.f9782b && this.f9783c == magnifierElement.f9783c && this.f9785e == magnifierElement.f9785e && this.f9786f == magnifierElement.f9786f && this.f9787g == magnifierElement.f9787g && p013b0.f.a(this.f9788h, magnifierElement.f9788h) && p013b0.f.a(this.f9789i, magnifierElement.f9789i) && this.j == magnifierElement.j && this.f9784d == magnifierElement.f9784d && kotlin.jvm.internal.i.a(this.f9790k, magnifierElement.f9790k);
    }

    public final int hashCode() {
        int iHashCode = this.f9782b.hashCode() * 31;
        Ia.l<p013b0.c, I.d> lVar = this.f9783c;
        int iB = androidx.compose.animation.D.b(O.a.d(this.f9789i, O.a.d(this.f9788h, C4.b.c(this.f9787g, androidx.compose.animation.D.b(O.a.d(this.f9785e, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f9786f), 31), 31), 31), 31, this.j);
        Ia.l<p013b0.h, p293xa.r> lVar2 = this.f9784d;
        return this.f9790k.hashCode() + ((iB + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }
}
