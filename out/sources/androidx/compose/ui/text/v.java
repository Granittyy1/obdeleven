package androidx.compose.ui.text;

import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.text.style.TextForegroundStyle;

/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements C1260a.InterfaceC0160a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextForegroundStyle f15690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.text.font.l f15692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.font.j f15693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.text.font.k f15694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d f15695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.ui.text.style.a f15698i;
    public final androidx.compose.ui.text.style.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z.c f15699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f15700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.ui.text.style.h f15701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k0 f15702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f15703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J.f f15704p;

    public v(long j, long j10, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.d dVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.j jVar2, Z.c cVar, long j12, androidx.compose.ui.text.style.h hVar, k0 k0Var, s sVar, J.f fVar) {
        this(j != 16 ? new androidx.compose.ui.text.style.c(j) : TextForegroundStyle.a.f15653a, j10, lVar, jVar, kVar, dVar, str, j11, aVar, jVar2, cVar, j12, hVar, k0Var, sVar, fVar);
    }

    public final boolean a(v vVar) {
        if (this == vVar) {
            return true;
        }
        return p013b0.n.a(this.f15691b, vVar.f15691b) && kotlin.jvm.internal.i.a(this.f15692c, vVar.f15692c) && kotlin.jvm.internal.i.a(this.f15693d, vVar.f15693d) && kotlin.jvm.internal.i.a(this.f15694e, vVar.f15694e) && kotlin.jvm.internal.i.a(this.f15695f, vVar.f15695f) && kotlin.jvm.internal.i.a(this.f15696g, vVar.f15696g) && p013b0.n.a(this.f15697h, vVar.f15697h) && kotlin.jvm.internal.i.a(this.f15698i, vVar.f15698i) && kotlin.jvm.internal.i.a(this.j, vVar.j) && kotlin.jvm.internal.i.a(this.f15699k, vVar.f15699k) && androidx.compose.ui.graphics.H.c(this.f15700l, vVar.f15700l) && kotlin.jvm.internal.i.a(this.f15703o, vVar.f15703o);
    }

    public final boolean b(v vVar) {
        return kotlin.jvm.internal.i.a(this.f15690a, vVar.f15690a) && kotlin.jvm.internal.i.a(this.f15701m, vVar.f15701m) && kotlin.jvm.internal.i.a(this.f15702n, vVar.f15702n) && kotlin.jvm.internal.i.a(this.f15704p, vVar.f15704p);
    }

    public final v c(v vVar) {
        if (vVar == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyle = vVar.f15690a;
        return w.a(this, textForegroundStyle.c(), textForegroundStyle.e(), textForegroundStyle.a(), vVar.f15691b, vVar.f15692c, vVar.f15693d, vVar.f15694e, vVar.f15695f, vVar.f15696g, vVar.f15697h, vVar.f15698i, vVar.j, vVar.f15699k, vVar.f15700l, vVar.f15701m, vVar.f15702n, vVar.f15703o, vVar.f15704p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return a(vVar) && b(vVar);
    }

    public final int hashCode() {
        TextForegroundStyle textForegroundStyle = this.f15690a;
        long jC = textForegroundStyle.c();
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        int iHashCode = Long.hashCode(jC) * 31;
        androidx.compose.ui.graphics.C cE = textForegroundStyle.e();
        int iHashCode2 = (Float.hashCode(textForegroundStyle.a()) + ((iHashCode + (cE != null ? cE.hashCode() : 0)) * 31)) * 31;
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        int iC = C4.b.c(this.f15691b, iHashCode2, 31);
        androidx.compose.ui.text.font.l lVar = this.f15692c;
        int i11 = (iC + (lVar != null ? lVar.f15447b : 0)) * 31;
        androidx.compose.ui.text.font.j jVar = this.f15693d;
        int iHashCode3 = (i11 + (jVar != null ? Integer.hashCode(jVar.f15436a) : 0)) * 31;
        androidx.compose.ui.text.font.k kVar = this.f15694e;
        int iHashCode4 = (iHashCode3 + (kVar != null ? Integer.hashCode(kVar.f15437a) : 0)) * 31;
        androidx.compose.ui.text.font.d dVar = this.f15695f;
        int iHashCode5 = (iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = this.f15696g;
        int iC2 = C4.b.c(this.f15697h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.a aVar = this.f15698i;
        int iHashCode6 = (iC2 + (aVar != null ? Float.hashCode(aVar.f15654a) : 0)) * 31;
        androidx.compose.ui.text.style.j jVar2 = this.j;
        int iHashCode7 = (iHashCode6 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        Z.c cVar = this.f15699k;
        int iC3 = C4.b.c(this.f15700l, (iHashCode7 + (cVar != null ? cVar.f7672b.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.h hVar = this.f15701m;
        int i12 = (iC3 + (hVar != null ? hVar.f15673a : 0)) * 31;
        k0 k0Var = this.f15702n;
        int iHashCode8 = (i12 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        s sVar = this.f15703o;
        int iHashCode9 = (iHashCode8 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        J.f fVar = this.f15704p;
        return iHashCode9 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        TextForegroundStyle textForegroundStyle = this.f15690a;
        sb2.append((Object) androidx.compose.ui.graphics.H.i(textForegroundStyle.c()));
        sb2.append(", brush=");
        sb2.append(textForegroundStyle.e());
        sb2.append(", alpha=");
        sb2.append(textForegroundStyle.a());
        sb2.append(", fontSize=");
        sb2.append((Object) p013b0.n.d(this.f15691b));
        sb2.append(", fontWeight=");
        sb2.append(this.f15692c);
        sb2.append(", fontStyle=");
        sb2.append(this.f15693d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f15694e);
        sb2.append(", fontFamily=");
        sb2.append(this.f15695f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f15696g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) p013b0.n.d(this.f15697h));
        sb2.append(", baselineShift=");
        sb2.append(this.f15698i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.j);
        sb2.append(", localeList=");
        sb2.append(this.f15699k);
        sb2.append(", background=");
        C4.v.h(this.f15700l, ", textDecoration=", sb2);
        sb2.append(this.f15701m);
        sb2.append(", shadow=");
        sb2.append(this.f15702n);
        sb2.append(", platformStyle=");
        sb2.append(this.f15703o);
        sb2.append(", drawStyle=");
        sb2.append(this.f15704p);
        sb2.append(')');
        return sb2.toString();
    }

    public v(TextForegroundStyle textForegroundStyle, long j, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.d dVar, String str, long j10, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.j jVar2, Z.c cVar, long j11, androidx.compose.ui.text.style.h hVar, k0 k0Var, s sVar, J.f fVar) {
        this.f15690a = textForegroundStyle;
        this.f15691b = j;
        this.f15692c = lVar;
        this.f15693d = jVar;
        this.f15694e = kVar;
        this.f15695f = dVar;
        this.f15696g = str;
        this.f15697h = j10;
        this.f15698i = aVar;
        this.j = jVar2;
        this.f15699k = cVar;
        this.f15700l = j11;
        this.f15701m = hVar;
        this.f15702n = k0Var;
        this.f15703o = sVar;
        this.f15704p = fVar;
    }

    public v(long j, long j10, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.k kVar, androidx.compose.ui.text.font.d dVar, String str, long j11, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.j jVar2, Z.c cVar, long j12, androidx.compose.ui.text.style.h hVar, k0 k0Var, int i10) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.H.f13504l : j, (i10 & 2) != 0 ? p013b0.n.f20493c : j10, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : jVar, (i10 & 16) != 0 ? null : kVar, (i10 & 32) != 0 ? null : dVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? p013b0.n.f20493c : j11, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : jVar2, (i10 & 1024) != 0 ? null : cVar, (i10 & 2048) != 0 ? androidx.compose.ui.graphics.H.f13504l : j12, (i10 & 4096) != 0 ? null : hVar, (i10 & 8192) != 0 ? null : k0Var, (s) null, (J.f) null);
    }
}
