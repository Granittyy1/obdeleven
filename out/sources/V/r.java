package V;

/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f6641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6642b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6643c;

    public r(G g10) {
        this.f6641a = g10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i11 = 1;
        G g10 = this.f6641a;
        if (z10) {
            int iO = O.e.o(g10.f6624g, i10, z10);
            int lineStart = g10.f6624g.getLineStart(iO);
            int iF = g10.f(iO);
            if (i10 == lineStart || i10 == iF) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f6642b == i13) {
            return this.f6643c;
        }
        float fH = z12 ? g10.h(i10, z10) : g10.i(i10, z10);
        if (z11) {
            this.f6642b = i13;
            this.f6643c = fH;
        }
        return fH;
    }
}
