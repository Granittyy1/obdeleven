package androidx.compose.foundation.text.modifiers;

import C4.v;
import androidx.compose.animation.D;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.H;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.style.m;
import p005a4.q;

/* JADX INFO: compiled from: TextStringSimpleElement.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends H<TextStringSimpleNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f11411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f11412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f11417i;

    public TextStringSimpleElement(String str, F f10, androidx.compose.ui.text.font.d.a aVar, int i10, boolean z10, int i11, int i12, L l10) {
        this.f11410b = str;
        this.f11411c = f10;
        this.f11412d = aVar;
        this.f11413e = i10;
        this.f11414f = z10;
        this.f11415g = i11;
        this.f11416h = i12;
        this.f11417i = l10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        TextStringSimpleNode textStringSimpleNode = new TextStringSimpleNode();
        textStringSimpleNode.f11419p = this.f11410b;
        textStringSimpleNode.f11420q = this.f11411c;
        textStringSimpleNode.f11421r = this.f11412d;
        textStringSimpleNode.f11422s = this.f11413e;
        textStringSimpleNode.f11423t = this.f11414f;
        textStringSimpleNode.f11424u = this.f11415g;
        textStringSimpleNode.f11425v = this.f11416h;
        textStringSimpleNode.f11426w = this.f11417i;
        return textStringSimpleNode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        boolean z10;
        TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) cVar;
        L l10 = textStringSimpleNode.f11426w;
        L l11 = this.f11417i;
        boolean zA = kotlin.jvm.internal.i.a(l11, l10);
        textStringSimpleNode.f11426w = l11;
        boolean z11 = false;
        boolean z12 = true;
        F f10 = this.f11411c;
        if (zA) {
            F f11 = textStringSimpleNode.f11420q;
            if (f10 == f11) {
                f10.getClass();
            } else if (!f10.f15318a.b(f11.f15318a)) {
                z10 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        String str = textStringSimpleNode.f11419p;
        String str2 = this.f11410b;
        if (!kotlin.jvm.internal.i.a(str, str2)) {
            textStringSimpleNode.f11419p = str2;
            textStringSimpleNode.f11418A = null;
            z11 = true;
        }
        boolean z13 = !textStringSimpleNode.f11420q.c(f10);
        textStringSimpleNode.f11420q = f10;
        int i10 = textStringSimpleNode.f11425v;
        int i11 = this.f11416h;
        if (i10 != i11) {
            textStringSimpleNode.f11425v = i11;
            z13 = true;
        }
        int i12 = textStringSimpleNode.f11424u;
        int i13 = this.f11415g;
        if (i12 != i13) {
            textStringSimpleNode.f11424u = i13;
            z13 = true;
        }
        boolean z14 = textStringSimpleNode.f11423t;
        boolean z15 = this.f11414f;
        if (z14 != z15) {
            textStringSimpleNode.f11423t = z15;
            z13 = true;
        }
        androidx.compose.ui.text.font.d.a aVar = textStringSimpleNode.f11421r;
        androidx.compose.ui.text.font.d.a aVar2 = this.f11412d;
        if (!kotlin.jvm.internal.i.a(aVar, aVar2)) {
            textStringSimpleNode.f11421r = aVar2;
            z13 = true;
        }
        int i14 = textStringSimpleNode.f11422s;
        int i15 = this.f11413e;
        if (m.a(i14, i15)) {
            z12 = z13;
        } else {
            textStringSimpleNode.f11422s = i15;
        }
        if (z11 || z12) {
            f fVarR1 = textStringSimpleNode.R1();
            String str3 = textStringSimpleNode.f11419p;
            F f12 = textStringSimpleNode.f11420q;
            androidx.compose.ui.text.font.d.a aVar3 = textStringSimpleNode.f11421r;
            int i16 = textStringSimpleNode.f11422s;
            boolean z16 = textStringSimpleNode.f11423t;
            int i17 = textStringSimpleNode.f11424u;
            int i18 = textStringSimpleNode.f11425v;
            fVarR1.f11461a = str3;
            fVarR1.f11462b = f12;
            fVarR1.f11463c = aVar3;
            fVarR1.f11464d = i16;
            fVarR1.f11465e = z16;
            fVarR1.f11466f = i17;
            fVarR1.f11467g = i18;
            fVarR1.b();
        }
        if (textStringSimpleNode.f13997o) {
            if (z11 || (z10 && textStringSimpleNode.f11429z != null)) {
                C1185f.f(textStringSimpleNode).P();
            }
            if (z11 || z12) {
                C1185f.f(textStringSimpleNode).O();
                C1192m.a(textStringSimpleNode);
            }
            if (z10) {
                C1192m.a(textStringSimpleNode);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return kotlin.jvm.internal.i.a(this.f11417i, textStringSimpleElement.f11417i) && kotlin.jvm.internal.i.a(this.f11410b, textStringSimpleElement.f11410b) && kotlin.jvm.internal.i.a(this.f11411c, textStringSimpleElement.f11411c) && kotlin.jvm.internal.i.a(this.f11412d, textStringSimpleElement.f11412d) && m.a(this.f11413e, textStringSimpleElement.f11413e) && this.f11414f == textStringSimpleElement.f11414f && this.f11415g == textStringSimpleElement.f11415g && this.f11416h == textStringSimpleElement.f11416h;
    }

    public final int hashCode() {
        int iB = (((D.b(q.b(this.f11413e, (this.f11412d.hashCode() + v.c(this.f11410b.hashCode() * 31, 31, this.f11411c)) * 31, 31), 31, this.f11414f) + this.f11415g) * 31) + this.f11416h) * 31;
        L l10 = this.f11417i;
        return iB + (l10 != null ? l10.hashCode() : 0);
    }
}
