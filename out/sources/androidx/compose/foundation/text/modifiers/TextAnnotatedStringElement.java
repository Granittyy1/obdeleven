package androidx.compose.foundation.text.modifiers;

import C4.v;
import Ia.l;
import androidx.compose.animation.D;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.node.H;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.style.m;
import java.util.List;
import p005a4.q;
import p293xa.r;

/* JADX INFO: compiled from: TextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends H<TextAnnotatedStringNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1260a f11378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f11379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f11380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<B, r> f11381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11385i;
    public final List<C1260a.c<p>> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<List<I.f>, r> f11386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L f11387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l<TextAnnotatedStringNode.a, r> f11388m;

    public TextAnnotatedStringElement() {
        throw null;
    }

    public TextAnnotatedStringElement(C1260a c1260a, F f10, androidx.compose.ui.text.font.d.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, L l10, l lVar3) {
        this.f11378b = c1260a;
        this.f11379c = f10;
        this.f11380d = aVar;
        this.f11381e = lVar;
        this.f11382f = i10;
        this.f11383g = z10;
        this.f11384h = i11;
        this.f11385i = i12;
        this.j = list;
        this.f11386k = lVar2;
        this.f11387l = l10;
        this.f11388m = lVar3;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new TextAnnotatedStringNode(this.f11378b, this.f11379c, this.f11380d, this.f11381e, this.f11382f, this.f11383g, this.f11384h, this.f11385i, this.j, this.f11386k, null, this.f11387l, this.f11388m);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        boolean z10;
        TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) cVar;
        L l10 = textAnnotatedStringNode.f11389A;
        L l11 = this.f11387l;
        boolean zA = kotlin.jvm.internal.i.a(l11, l10);
        textAnnotatedStringNode.f11389A = l11;
        if (zA) {
            F f10 = textAnnotatedStringNode.f11396q;
            F f11 = this.f11379c;
            if (f11 == f10) {
                f11.getClass();
            } else if (!f11.f15318a.b(f10.f15318a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        textAnnotatedStringNode.R1(z11, textAnnotatedStringNode.W1(this.f11378b), textAnnotatedStringNode.V1(this.f11379c, this.j, this.f11385i, this.f11384h, this.f11383g, this.f11380d, this.f11382f), textAnnotatedStringNode.U1(this.f11381e, this.f11386k, null, this.f11388m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return kotlin.jvm.internal.i.a(this.f11387l, textAnnotatedStringElement.f11387l) && kotlin.jvm.internal.i.a(this.f11378b, textAnnotatedStringElement.f11378b) && kotlin.jvm.internal.i.a(this.f11379c, textAnnotatedStringElement.f11379c) && kotlin.jvm.internal.i.a(this.j, textAnnotatedStringElement.j) && kotlin.jvm.internal.i.a(this.f11380d, textAnnotatedStringElement.f11380d) && this.f11381e == textAnnotatedStringElement.f11381e && this.f11388m == textAnnotatedStringElement.f11388m && m.a(this.f11382f, textAnnotatedStringElement.f11382f) && this.f11383g == textAnnotatedStringElement.f11383g && this.f11384h == textAnnotatedStringElement.f11384h && this.f11385i == textAnnotatedStringElement.f11385i && this.f11386k == textAnnotatedStringElement.f11386k && kotlin.jvm.internal.i.a(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.f11380d.hashCode() + v.c(this.f11378b.hashCode() * 31, 31, this.f11379c)) * 31;
        l<B, r> lVar = this.f11381e;
        int iB = (((D.b(q.b(this.f11382f, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f11383g) + this.f11384h) * 31) + this.f11385i) * 31;
        List<C1260a.c<p>> list = this.j;
        int iHashCode2 = (iB + (list != null ? list.hashCode() : 0)) * 31;
        l<List<I.f>, r> lVar2 = this.f11386k;
        int iHashCode3 = (iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 961;
        L l10 = this.f11387l;
        int iHashCode4 = (iHashCode3 + (l10 != null ? l10.hashCode() : 0)) * 31;
        l<TextAnnotatedStringNode.a, r> lVar3 = this.f11388m;
        return iHashCode4 + (lVar3 != null ? lVar3.hashCode() : 0);
    }
}
