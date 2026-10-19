package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;

/* JADX INFO: renamed from: androidx.compose.material.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ElevationOverlay.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1038n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1038n f11920a = new C1038n();

    @Override // androidx.compose.material.y
    public final long a(long j, float f10, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-1687113661);
        C1034j c1034j = (C1034j) interfaceC1084f.x(ColorsKt.f11693a);
        if (Float.compare(f10, 0) <= 0 || c1034j.i()) {
            interfaceC1084f.L(1169156439);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1169017931);
            O0 o10 = ElevationOverlayKt.f11743a;
            j = Q3.d.i(androidx.compose.ui.graphics.H.b(((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, ColorsKt.b(j, interfaceC1084f)), j);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return j;
    }
}
