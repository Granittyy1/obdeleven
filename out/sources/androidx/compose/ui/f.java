package androidx.compose.ui;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13403b;

    /* JADX INFO: compiled from: Alignment.kt */
    public static final class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f13404a;

        public a(float f10) {
            this.f13404a = f10;
        }

        @Override // androidx.compose.ui.d.b
        public final int a(int i10, int i11, LayoutDirection layoutDirection) {
            float f10 = (i11 - i10) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.f15717b;
            float f11 = this.f13404a;
            if (layoutDirection != layoutDirection2) {
                f11 *= -1;
            }
            return C1293h.f(1, f11, f10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f13404a, ((a) obj).f13404a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13404a);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("Horizontal(bias="), this.f13404a, ')');
        }
    }

    /* JADX INFO: compiled from: Alignment.kt */
    public static final class b implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f13405a;

        public b(float f10) {
            this.f13405a = f10;
        }

        @Override // androidx.compose.ui.d.c
        public final int a(int i10, int i11) {
            return C1293h.f(1, this.f13405a, (i11 - i10) / 2.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f13405a, ((b) obj).f13405a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13405a);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("Vertical(bias="), this.f13405a, ')');
        }
    }

    public f(float f10, float f11) {
        this.f13402a = f10;
        this.f13403b = f11;
    }

    @Override // androidx.compose.ui.d
    public final long a(long j, long j10, LayoutDirection layoutDirection) {
        float f10 = (((int) (j10 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f11 = (((int) (j10 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.f15717b;
        float f12 = this.f13402a;
        if (layoutDirection != layoutDirection2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        return (((long) Math.round((f13 + this.f13403b) * f11)) & 4294967295L) | (((long) Math.round(f14)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f13402a, fVar.f13402a) == 0 && Float.compare(this.f13403b, fVar.f13403b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13403b) + (Float.hashCode(this.f13402a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f13402a);
        sb2.append(", verticalBias=");
        return B7.b.d(sb2, this.f13403b, ')');
    }
}
