package androidx.compose.foundation.lazy.layout;

import A1.C0575j;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0973h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<a> f10720a = new androidx.compose.runtime.collection.c<>(new a[16]);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h$a */
    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10722b;

        public a(int i10, int i11) {
            this.f10721a = i10;
            this.f10722b = i11;
            if (!(i10 >= 0)) {
                p245u.c.a("negative start index");
            }
            if (i11 >= i10) {
                return;
            }
            p245u.c.a("end index greater than start");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10721a == aVar.f10721a && this.f10722b == aVar.f10722b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f10722b) + (Integer.hashCode(this.f10721a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Interval(start=");
            sb2.append(this.f10721a);
            sb2.append(", end=");
            return C0575j.b(sb2, this.f10722b, ')');
        }
    }
}
