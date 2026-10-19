package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1163i implements InterfaceC1161g {
    @Override // androidx.compose.ui.layout.InterfaceC1161g
    public final long a(long j, long j10) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(1.0f)));
        int i10 = c0.f14231a;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1163i)) {
            return false;
        }
        ((C1163i) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
