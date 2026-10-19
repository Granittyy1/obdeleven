package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1170p {
    long B(InterfaceC1170p interfaceC1170p, long j);

    InterfaceC1170p D();

    default void G(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    I.f H(InterfaceC1170p interfaceC1170p, boolean z10);

    long T(long j);

    default void U(InterfaceC1170p interfaceC1170p, float[] fArr) {
        R.a.e("transformFrom is not implemented on this LayoutCoordinates");
    }

    InterfaceC1170p X();

    long a();

    boolean c();

    default long c0(long j) {
        return 9205357640488583168L;
    }

    long g0(long j);

    long w(long j);
}
