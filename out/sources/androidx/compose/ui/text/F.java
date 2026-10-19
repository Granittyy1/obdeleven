package androidx.compose.ui.text;

import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.text.style.TextForegroundStyle;

/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f15317d = new F(0, 0, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f15318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f15320c;

    public F(v vVar, n nVar, t tVar) {
        this.f15318a = vVar;
        this.f15319b = nVar;
        this.f15320c = tVar;
    }

    public static F a(F f10, long j, long j10, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.d dVar, long j11, androidx.compose.ui.text.style.h hVar, int i10, long j12, t tVar, androidx.compose.ui.text.style.f fVar, int i11) {
        TextForegroundStyle cVar;
        long jC = (i11 & 1) != 0 ? f10.f15318a.f15690a.c() : j;
        long j13 = (i11 & 2) != 0 ? f10.f15318a.f15691b : j10;
        androidx.compose.ui.text.font.l lVar2 = (i11 & 4) != 0 ? f10.f15318a.f15692c : lVar;
        v vVar = f10.f15318a;
        androidx.compose.ui.text.font.j jVar = vVar.f15693d;
        androidx.compose.ui.text.font.k kVar = vVar.f15694e;
        androidx.compose.ui.text.font.d dVar2 = (i11 & 32) != 0 ? vVar.f15695f : dVar;
        String str = vVar.f15696g;
        long j14 = (i11 & 128) != 0 ? vVar.f15697h : j11;
        androidx.compose.ui.text.style.a aVar = vVar.f15698i;
        androidx.compose.ui.text.style.j jVar2 = vVar.j;
        Z.c cVar2 = vVar.f15699k;
        long j15 = j14;
        long j16 = vVar.f15700l;
        androidx.compose.ui.text.style.h hVar2 = (i11 & 4096) != 0 ? vVar.f15701m : hVar;
        k0 k0Var = vVar.f15702n;
        J.f fVar2 = vVar.f15704p;
        int i12 = (i11 & 32768) != 0 ? f10.f15319b.f15592a : i10;
        n nVar = f10.f15319b;
        int i13 = nVar.f15593b;
        long j17 = (i11 & 131072) != 0 ? nVar.f15594c : j12;
        androidx.compose.ui.text.style.k kVar2 = nVar.f15595d;
        t tVar2 = (524288 & i11) != 0 ? f10.f15320c : tVar;
        androidx.compose.ui.text.style.f fVar3 = (i11 & 1048576) != 0 ? nVar.f15597f : fVar;
        int i14 = nVar.f15598g;
        androidx.compose.ui.text.style.f fVar4 = fVar3;
        int i15 = nVar.f15599h;
        androidx.compose.ui.text.style.l lVar3 = nVar.f15600i;
        if (androidx.compose.ui.graphics.H.c(jC, vVar.f15690a.c())) {
            cVar = vVar.f15690a;
        } else {
            cVar = jC != 16 ? new androidx.compose.ui.text.style.c(jC) : TextForegroundStyle.a.f15653a;
        }
        return new F(new v(cVar, j13, lVar2, jVar, kVar, dVar2, str, j15, aVar, jVar2, cVar2, j16, hVar2, k0Var, tVar2 != null ? tVar2.f15686a : null, fVar2), new n(i12, i13, j17, kVar2, tVar2 != null ? tVar2.f15687b : null, fVar4, i14, i15, lVar3), tVar2);
    }

    public static F e(F f10, long j, long j10, androidx.compose.ui.text.font.l lVar, androidx.compose.ui.text.font.j jVar, androidx.compose.ui.text.font.d dVar, long j11, androidx.compose.ui.text.style.h hVar, int i10, long j12, int i11) {
        long j13 = (i11 & 1) != 0 ? androidx.compose.ui.graphics.H.f13504l : j;
        long j14 = (i11 & 2) != 0 ? p013b0.n.f20493c : j10;
        androidx.compose.ui.text.font.l lVar2 = (i11 & 4) != 0 ? null : lVar;
        androidx.compose.ui.text.font.j jVar2 = (i11 & 8) != 0 ? null : jVar;
        androidx.compose.ui.text.font.d dVar2 = (i11 & 32) != 0 ? null : dVar;
        long j15 = (i11 & 128) != 0 ? p013b0.n.f20493c : j11;
        long j16 = androidx.compose.ui.graphics.H.f13504l;
        androidx.compose.ui.text.style.h hVar2 = (i11 & 4096) != 0 ? null : hVar;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        long j17 = (i11 & 131072) != 0 ? p013b0.n.f20493c : j12;
        v vVarA = w.a(f10.f15318a, j13, null, Float.NaN, j14, lVar2, jVar2, null, dVar2, null, j15, null, null, null, j16, hVar2, null, null, null);
        n nVarA = o.a(f10.f15319b, i12, Integer.MIN_VALUE, j17, null, null, null, 0, Integer.MIN_VALUE, null);
        return (f10.f15318a == vVarA && f10.f15319b == nVarA) ? f10 : new F(vVarA, nVarA);
    }

    public final long b() {
        return this.f15318a.f15690a.c();
    }

    public final boolean c(F f10) {
        if (this != f10) {
            if (!kotlin.jvm.internal.i.a(this.f15319b, f10.f15319b) || !this.f15318a.a(f10.f15318a)) {
                return false;
            }
        }
        return true;
    }

    public final F d(F f10) {
        return (f10 == null || f10.equals(f15317d)) ? this : new F(this.f15318a.c(f10.f15318a), this.f15319b.a(f10.f15319b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return kotlin.jvm.internal.i.a(this.f15318a, f10.f15318a) && kotlin.jvm.internal.i.a(this.f15319b, f10.f15319b) && kotlin.jvm.internal.i.a(this.f15320c, f10.f15320c);
    }

    public final int hashCode() {
        int iHashCode = (this.f15319b.hashCode() + (this.f15318a.hashCode() * 31)) * 31;
        t tVar = this.f15320c;
        return iHashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) androidx.compose.ui.graphics.H.i(b()));
        sb2.append(", brush=");
        v vVar = this.f15318a;
        sb2.append(vVar.f15690a.e());
        sb2.append(", alpha=");
        sb2.append(vVar.f15690a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) p013b0.n.d(vVar.f15691b));
        sb2.append(", fontWeight=");
        sb2.append(vVar.f15692c);
        sb2.append(", fontStyle=");
        sb2.append(vVar.f15693d);
        sb2.append(", fontSynthesis=");
        sb2.append(vVar.f15694e);
        sb2.append(", fontFamily=");
        sb2.append(vVar.f15695f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(vVar.f15696g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) p013b0.n.d(vVar.f15697h));
        sb2.append(", baselineShift=");
        sb2.append(vVar.f15698i);
        sb2.append(", textGeometricTransform=");
        sb2.append(vVar.j);
        sb2.append(", localeList=");
        sb2.append(vVar.f15699k);
        sb2.append(", background=");
        C4.v.h(vVar.f15700l, ", textDecoration=", sb2);
        sb2.append(vVar.f15701m);
        sb2.append(", shadow=");
        sb2.append(vVar.f15702n);
        sb2.append(", drawStyle=");
        sb2.append(vVar.f15704p);
        sb2.append(", textAlign=");
        n nVar = this.f15319b;
        sb2.append((Object) androidx.compose.ui.text.style.g.b(nVar.f15592a));
        sb2.append(", textDirection=");
        sb2.append((Object) androidx.compose.ui.text.style.i.b(nVar.f15593b));
        sb2.append(", lineHeight=");
        sb2.append((Object) p013b0.n.d(nVar.f15594c));
        sb2.append(", textIndent=");
        sb2.append(nVar.f15595d);
        sb2.append(", platformStyle=");
        sb2.append(this.f15320c);
        sb2.append(", lineHeightStyle=");
        sb2.append(nVar.f15597f);
        sb2.append(", lineBreak=");
        sb2.append((Object) androidx.compose.ui.text.style.e.a(nVar.f15598g));
        sb2.append(", hyphens=");
        sb2.append((Object) androidx.compose.ui.text.style.d.b(nVar.f15599h));
        sb2.append(", textMotion=");
        sb2.append(nVar.f15600i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(v vVar, n nVar) {
        s sVar = vVar.f15703o;
        r rVar = nVar.f15596e;
        this(vVar, nVar, (sVar == null && rVar == null) ? null : new t(sVar, rVar));
    }

    public F(long j, long j10, androidx.compose.ui.text.font.l lVar, long j11, int i10, long j12, int i11) {
        this(new v((i11 & 1) != 0 ? androidx.compose.ui.graphics.H.f13504l : j, (i11 & 2) != 0 ? p013b0.n.f20493c : j10, (i11 & 4) != 0 ? null : lVar, (androidx.compose.ui.text.font.j) null, (androidx.compose.ui.text.font.k) null, (androidx.compose.ui.text.font.d) null, (String) null, (i11 & 128) != 0 ? p013b0.n.f20493c : j11, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.j) null, (Z.c) null, androidx.compose.ui.graphics.H.f13504l, (androidx.compose.ui.text.style.h) null, (k0) null, (s) null, (J.f) null), new n((32768 & i11) != 0 ? Integer.MIN_VALUE : i10, Integer.MIN_VALUE, (i11 & 131072) != 0 ? p013b0.n.f20493c : j12, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
