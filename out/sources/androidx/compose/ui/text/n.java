package androidx.compose.ui.text;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n implements C1260a.InterfaceC0160a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.style.k f15595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f15596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.text.style.f f15597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.ui.text.style.l f15600i;

    public n(int i10, int i11, long j, androidx.compose.ui.text.style.k kVar, r rVar, androidx.compose.ui.text.style.f fVar, int i12, int i13, androidx.compose.ui.text.style.l lVar) {
        this.f15592a = i10;
        this.f15593b = i11;
        this.f15594c = j;
        this.f15595d = kVar;
        this.f15596e = rVar;
        this.f15597f = fVar;
        this.f15598g = i12;
        this.f15599h = i13;
        this.f15600i = lVar;
        if (p013b0.n.a(j, p013b0.n.f20493c) || p013b0.n.c(j) >= 0.0f) {
            return;
        }
        Y.a.c("lineHeight can't be negative (" + p013b0.n.c(j) + ')');
    }

    public final n a(n nVar) {
        if (nVar == null) {
            return this;
        }
        return o.a(this, nVar.f15592a, nVar.f15593b, nVar.f15594c, nVar.f15595d, nVar.f15596e, nVar.f15597f, nVar.f15598g, nVar.f15599h, nVar.f15600i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return androidx.compose.ui.text.style.g.a(this.f15592a, nVar.f15592a) && androidx.compose.ui.text.style.i.a(this.f15593b, nVar.f15593b) && p013b0.n.a(this.f15594c, nVar.f15594c) && kotlin.jvm.internal.i.a(this.f15595d, nVar.f15595d) && kotlin.jvm.internal.i.a(this.f15596e, nVar.f15596e) && kotlin.jvm.internal.i.a(this.f15597f, nVar.f15597f) && this.f15598g == nVar.f15598g && androidx.compose.ui.text.style.d.a(this.f15599h, nVar.f15599h) && kotlin.jvm.internal.i.a(this.f15600i, nVar.f15600i);
    }

    public final int hashCode() {
        int iB = p005a4.q.b(this.f15593b, Integer.hashCode(this.f15592a) * 31, 31);
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        int iC = C4.b.c(this.f15594c, iB, 31);
        androidx.compose.ui.text.style.k kVar = this.f15595d;
        int iHashCode = (iC + (kVar != null ? kVar.hashCode() : 0)) * 31;
        r rVar = this.f15596e;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.f fVar = this.f15597f;
        int iB2 = p005a4.q.b(this.f15599h, p005a4.q.b(this.f15598g, (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31), 31);
        androidx.compose.ui.text.style.l lVar = this.f15600i;
        return iB2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) androidx.compose.ui.text.style.g.b(this.f15592a)) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.i.b(this.f15593b)) + ", lineHeight=" + ((Object) p013b0.n.d(this.f15594c)) + ", textIndent=" + this.f15595d + ", platformStyle=" + this.f15596e + ", lineHeightStyle=" + this.f15597f + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.e.a(this.f15598g)) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.d.b(this.f15599h)) + ", textMotion=" + this.f15600i + ')';
    }

    public n(long j, androidx.compose.ui.text.style.k kVar, int i10) {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE, j, (i10 & 8) != 0 ? null : kVar, null, null, 0, Integer.MIN_VALUE, null);
    }
}
