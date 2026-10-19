package androidx.paging;

/* JADX INFO: renamed from: androidx.paging.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1432h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f19354b;

    public C1432h(int i10, I hint) {
        kotlin.jvm.internal.i.e(hint, "hint");
        this.f19353a = i10;
        this.f19354b = hint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1432h)) {
            return false;
        }
        C1432h c1432h = (C1432h) obj;
        return this.f19353a == c1432h.f19353a && kotlin.jvm.internal.i.a(this.f19354b, c1432h.f19354b);
    }

    public final int hashCode() {
        return this.f19354b.hashCode() + (Integer.hashCode(this.f19353a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f19353a + ", hint=" + this.f19354b + ')';
    }
}
