package p041d2;

import android.text.Layout;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34531e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f34536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f34537l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f34540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f34541p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f34543r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f34545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f34546u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34532f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34533g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34534h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34535i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34538m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f34539n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f34542q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f34544s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f34529c && fVar.f34529c) {
                this.f34528b = fVar.f34528b;
                this.f34529c = true;
            }
            if (this.f34534h == -1) {
                this.f34534h = fVar.f34534h;
            }
            if (this.f34535i == -1) {
                this.f34535i = fVar.f34535i;
            }
            if (this.f34527a == null && (str = fVar.f34527a) != null) {
                this.f34527a = str;
            }
            if (this.f34532f == -1) {
                this.f34532f = fVar.f34532f;
            }
            if (this.f34533g == -1) {
                this.f34533g = fVar.f34533g;
            }
            if (this.f34539n == -1) {
                this.f34539n = fVar.f34539n;
            }
            if (this.f34540o == null && (alignment2 = fVar.f34540o) != null) {
                this.f34540o = alignment2;
            }
            if (this.f34541p == null && (alignment = fVar.f34541p) != null) {
                this.f34541p = alignment;
            }
            if (this.f34542q == -1) {
                this.f34542q = fVar.f34542q;
            }
            if (this.j == -1) {
                this.j = fVar.j;
                this.f34536k = fVar.f34536k;
            }
            if (this.f34543r == null) {
                this.f34543r = fVar.f34543r;
            }
            if (this.f34544s == Float.MAX_VALUE) {
                this.f34544s = fVar.f34544s;
            }
            if (this.f34545t == null) {
                this.f34545t = fVar.f34545t;
            }
            if (this.f34546u == null) {
                this.f34546u = fVar.f34546u;
            }
            if (!this.f34531e && fVar.f34531e) {
                this.f34530d = fVar.f34530d;
                this.f34531e = true;
            }
            if (this.f34538m != -1 || (i10 = fVar.f34538m) == -1) {
                return;
            }
            this.f34538m = i10;
        }
    }
}
