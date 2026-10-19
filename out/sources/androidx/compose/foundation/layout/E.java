package androidx.compose.foundation.layout;

import A1.C0575j;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10116d;

    public E(int i10, int i11, int i12, int i13) {
        this.f10113a = i10;
        this.f10114b = i11;
        this.f10115c = i12;
        this.f10116d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return this.f10113a == e10.f10113a && this.f10114b == e10.f10114b && this.f10115c == e10.f10115c && this.f10116d == e10.f10116d;
    }

    public final int hashCode() {
        return (((((this.f10113a * 31) + this.f10114b) * 31) + this.f10115c) * 31) + this.f10116d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f10113a);
        sb2.append(", top=");
        sb2.append(this.f10114b);
        sb2.append(", right=");
        sb2.append(this.f10115c);
        sb2.append(", bottom=");
        return C0575j.b(sb2, this.f10116d, ')');
    }
}
