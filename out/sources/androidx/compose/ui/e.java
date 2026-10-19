package androidx.compose.ui;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13400a;

    /* JADX INFO: compiled from: Alignment.kt */
    public static final class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f13401a;

        public a(float f10) {
            this.f13401a = f10;
        }

        @Override // androidx.compose.ui.d.b
        public final int a(int i10, int i11, LayoutDirection layoutDirection) {
            return C1293h.f(1, this.f13401a, (i11 - i10) / 2.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f13401a, ((a) obj).f13401a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13401a);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("Horizontal(bias="), this.f13401a, ')');
        }
    }

    public e(float f10) {
        this.f13400a = f10;
    }

    @Override // androidx.compose.ui.d
    public final long a(long j, long j10, LayoutDirection layoutDirection) {
        long j11 = (((long) (((int) (j10 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f10 = 1;
        float f11 = (this.f13400a + f10) * (((int) (j11 >> 32)) / 2.0f);
        return (((long) Math.round((f10 - 1.0f) * (((int) (j11 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f11)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return Float.compare(this.f13400a, ((e) obj).f13400a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f13400a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f13400a + ", verticalBias=-1.0)";
    }
}
