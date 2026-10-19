package androidx.compose.ui.semantics;

import A1.C0575j;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f15199d = new h(0.0f, new Na.d(0.0f, 0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Na.d f15201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15202c;

    public h() {
        throw null;
    }

    public h(float f10, Na.d dVar) {
        this.f15200a = f10;
        this.f15201b = dVar;
        this.f15202c = 0;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f15200a == hVar.f15200a && kotlin.jvm.internal.i.a(this.f15201b, hVar.f15201b) && this.f15202c == hVar.f15202c;
    }

    public final int hashCode() {
        return ((this.f15201b.hashCode() + (Float.hashCode(this.f15200a) * 31)) * 31) + this.f15202c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f15200a);
        sb2.append(", range=");
        sb2.append(this.f15201b);
        sb2.append(", steps=");
        return C0575j.b(sb2, this.f15202c, ')');
    }
}
