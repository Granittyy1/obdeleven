package androidx.media3.exoplayer;

import android.text.TextUtils;

/* JADX INFO: renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1391i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p078g1.n f18431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p078g1.n f18432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18434e;

    public C1391i(String str, p078g1.n nVar, p078g1.n nVar2, int i10, int i11) {
        p241t7.b.e(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f18430a = str;
        nVar.getClass();
        this.f18431b = nVar;
        nVar2.getClass();
        this.f18432c = nVar2;
        this.f18433d = i10;
        this.f18434e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1391i.class != obj.getClass()) {
            return false;
        }
        C1391i c1391i = (C1391i) obj;
        return this.f18433d == c1391i.f18433d && this.f18434e == c1391i.f18434e && this.f18430a.equals(c1391i.f18430a) && this.f18431b.equals(c1391i.f18431b) && this.f18432c.equals(c1391i.f18432c);
    }

    public final int hashCode() {
        return this.f18432c.hashCode() + ((this.f18431b.hashCode() + B1.a.b(this.f18430a, (((527 + this.f18433d) * 31) + this.f18434e) * 31, 31)) * 31);
    }
}
