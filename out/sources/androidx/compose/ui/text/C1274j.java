package androidx.compose.ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1274j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidParagraph f15582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15588g;

    public C1274j(AndroidParagraph androidParagraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f15582a = androidParagraph;
        this.f15583b = i10;
        this.f15584c = i11;
        this.f15585d = i12;
        this.f15586e = i13;
        this.f15587f = f10;
        this.f15588g = f11;
    }

    public final I.f a(I.f fVar) {
        return fVar.h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f15587f)) & 4294967295L));
    }

    public final long b(long j, boolean z10) {
        if (z10) {
            int i10 = E.f15315c;
            long j10 = E.f15314b;
            if (E.a(j, j10)) {
                return j10;
            }
        }
        int i11 = E.f15315c;
        int i12 = (int) (j >> 32);
        int i13 = this.f15583b;
        return O.h.b(i12 + i13, ((int) (j & 4294967295L)) + i13);
    }

    public final I.f c(I.f fVar) {
        float f10 = -this.f15587f;
        return fVar.h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }

    public final int d(int i10) {
        int i11 = this.f15584c;
        int i12 = this.f15583b;
        return Na.l.D(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1274j)) {
            return false;
        }
        C1274j c1274j = (C1274j) obj;
        return this.f15582a.equals(c1274j.f15582a) && this.f15583b == c1274j.f15583b && this.f15584c == c1274j.f15584c && this.f15585d == c1274j.f15585d && this.f15586e == c1274j.f15586e && Float.compare(this.f15587f, c1274j.f15587f) == 0 && Float.compare(this.f15588g, c1274j.f15588g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15588g) + O.a.d(this.f15587f, p005a4.q.b(this.f15586e, p005a4.q.b(this.f15585d, p005a4.q.b(this.f15584c, p005a4.q.b(this.f15583b, this.f15582a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f15582a);
        sb2.append(", startIndex=");
        sb2.append(this.f15583b);
        sb2.append(", endIndex=");
        sb2.append(this.f15584c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f15585d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f15586e);
        sb2.append(", top=");
        sb2.append(this.f15587f);
        sb2.append(", bottom=");
        return B7.b.d(sb2, this.f15588g, ')');
    }
}
