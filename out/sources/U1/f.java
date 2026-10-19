package U1;

import A1.p;
import A1.t;
import java.util.HashMap;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements t, androidx.compose.ui.graphics.colorspace.j, androidx.media3.exoplayer.drm.b.InterfaceC0187b {
    public static void b(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    @Override // A1.t
    public p[] c() {
        return new p[]{new g(X1.l.a.f7151a, 16)};
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        double d11 = d10 < 0.0d ? -d10 : d10;
        return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d10);
    }

    @Override // androidx.media3.exoplayer.drm.b.InterfaceC0187b
    public void a() {
    }
}
