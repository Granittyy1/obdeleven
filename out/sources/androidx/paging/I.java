package androidx.paging;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ViewportHint.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19249d;

    /* JADX INFO: compiled from: ViewportHint.kt */
    public static final class a extends I {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19251f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15);
            this.f19250e = i10;
            this.f19251f = i11;
        }

        @Override // androidx.paging.I
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f19250e == aVar.f19250e && this.f19251f == aVar.f19251f) {
                if (this.f19246a == aVar.f19246a) {
                    if (this.f19247b == aVar.f19247b) {
                        if (this.f19248c == aVar.f19248c) {
                            if (this.f19249d == aVar.f19249d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.paging.I
        public final int hashCode() {
            return Integer.hashCode(this.f19251f) + Integer.hashCode(this.f19250e) + super.hashCode();
        }

        public final String toString() {
            return kotlin.text.i.w("ViewportHint.Access(\n            |    pageOffset=" + this.f19250e + ",\n            |    indexInPage=" + this.f19251f + ",\n            |    presentedItemsBefore=" + this.f19246a + ",\n            |    presentedItemsAfter=" + this.f19247b + ",\n            |    originalPageOffsetFirst=" + this.f19248c + ",\n            |    originalPageOffsetLast=" + this.f19249d + ",\n            |)");
        }
    }

    /* JADX INFO: compiled from: ViewportHint.kt */
    public static final class b extends I {
        public final String toString() {
            return kotlin.text.i.w("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f19246a + ",\n            |    presentedItemsAfter=" + this.f19247b + ",\n            |    originalPageOffsetFirst=" + this.f19248c + ",\n            |    originalPageOffsetLast=" + this.f19249d + ",\n            |)");
        }
    }

    public I(int i10, int i11, int i12, int i13) {
        this.f19246a = i10;
        this.f19247b = i11;
        this.f19248c = i12;
        this.f19249d = i13;
    }

    public final int a(LoadType loadType) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f19246a;
        }
        if (iOrdinal == 2) {
            return this.f19247b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return this.f19246a == i10.f19246a && this.f19247b == i10.f19247b && this.f19248c == i10.f19248c && this.f19249d == i10.f19249d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f19249d) + Integer.hashCode(this.f19248c) + Integer.hashCode(this.f19247b) + Integer.hashCode(this.f19246a);
    }
}
