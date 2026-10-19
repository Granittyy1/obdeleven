package androidx.compose.foundation.text.modifiers;

import C4.v;
import Ia.l;
import androidx.compose.animation.D;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.style.m;
import java.util.List;
import p005a4.q;
import p293xa.r;

/* JADX INFO: compiled from: SelectableTextAnnotatedStringElement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends H<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1260a f11362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f11363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f11364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<B, r> f11365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11369i;
    public final List<C1260a.c<p>> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<List<I.f>, r> f11370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SelectionController f11371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final L f11372m;

    public SelectableTextAnnotatedStringElement() {
        throw null;
    }

    public SelectableTextAnnotatedStringElement(C1260a c1260a, F f10, androidx.compose.ui.text.font.d.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, SelectionController selectionController, L l10) {
        this.f11362b = c1260a;
        this.f11363c = f10;
        this.f11364d = aVar;
        this.f11365e = lVar;
        this.f11366f = i10;
        this.f11367g = z10;
        this.f11368h = i11;
        this.f11369i = i12;
        this.j = list;
        this.f11370k = lVar2;
        this.f11371l = selectionController;
        this.f11372m = l10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new g(this.f11362b, this.f11363c, this.f11364d, this.f11365e, this.f11366f, this.f11367g, this.f11368h, this.f11369i, this.j, this.f11370k, this.f11371l, this.f11372m);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        boolean z10;
        g gVar = (g) cVar;
        TextAnnotatedStringNode textAnnotatedStringNode = gVar.f11480t;
        L l10 = textAnnotatedStringNode.f11389A;
        L l11 = this.f11372m;
        boolean zA = kotlin.jvm.internal.i.a(l11, l10);
        textAnnotatedStringNode.f11389A = l11;
        F f10 = this.f11363c;
        if (zA) {
            F f11 = textAnnotatedStringNode.f11396q;
            if (f10 == f11) {
                f10.getClass();
            } else if (!f10.f15318a.b(f11.f15318a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        boolean zW1 = textAnnotatedStringNode.W1(this.f11362b);
        boolean zV1 = gVar.f11480t.V1(f10, this.j, this.f11369i, this.f11368h, this.f11367g, this.f11364d, this.f11366f);
        l<? super TextAnnotatedStringNode.a, r> lVar = gVar.f11479s;
        l<B, r> lVar2 = this.f11365e;
        l<List<I.f>, r> lVar3 = this.f11370k;
        SelectionController selectionController = this.f11371l;
        textAnnotatedStringNode.R1(z10, zW1, zV1, textAnnotatedStringNode.U1(lVar2, lVar3, selectionController, lVar));
        gVar.f11478r = selectionController;
        C1185f.f(gVar).O();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return kotlin.jvm.internal.i.a(this.f11372m, selectableTextAnnotatedStringElement.f11372m) && kotlin.jvm.internal.i.a(this.f11362b, selectableTextAnnotatedStringElement.f11362b) && kotlin.jvm.internal.i.a(this.f11363c, selectableTextAnnotatedStringElement.f11363c) && kotlin.jvm.internal.i.a(this.j, selectableTextAnnotatedStringElement.j) && kotlin.jvm.internal.i.a(this.f11364d, selectableTextAnnotatedStringElement.f11364d) && kotlin.jvm.internal.i.a(null, null) && this.f11365e == selectableTextAnnotatedStringElement.f11365e && m.a(this.f11366f, selectableTextAnnotatedStringElement.f11366f) && this.f11367g == selectableTextAnnotatedStringElement.f11367g && this.f11368h == selectableTextAnnotatedStringElement.f11368h && this.f11369i == selectableTextAnnotatedStringElement.f11369i && this.f11370k == selectableTextAnnotatedStringElement.f11370k && kotlin.jvm.internal.i.a(this.f11371l, selectableTextAnnotatedStringElement.f11371l);
    }

    public final int hashCode() {
        int iHashCode = (this.f11364d.hashCode() + v.c(this.f11362b.hashCode() * 31, 31, this.f11363c)) * 31;
        l<B, r> lVar = this.f11365e;
        int iB = (((D.b(q.b(this.f11366f, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f11367g) + this.f11368h) * 31) + this.f11369i) * 31;
        List<C1260a.c<p>> list = this.j;
        int iHashCode2 = (iB + (list != null ? list.hashCode() : 0)) * 31;
        l<List<I.f>, r> lVar2 = this.f11370k;
        int iHashCode3 = (iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.f11371l;
        int iHashCode4 = (iHashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 961;
        L l10 = this.f11372m;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f11362b) + ", style=" + this.f11363c + ", fontFamilyResolver=" + this.f11364d + ", onTextLayout=" + this.f11365e + ", overflow=" + ((Object) m.b(this.f11366f)) + ", softWrap=" + this.f11367g + ", maxLines=" + this.f11368h + ", minLines=" + this.f11369i + ", placeholders=" + this.j + ", onPlaceholderLayout=" + this.f11370k + ", selectionController=" + this.f11371l + ", color=" + this.f11372m + ", autoSize=null)";
    }
}
