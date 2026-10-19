package androidx.compose.ui.graphics.colorspace;

import androidx.collection.B;
import androidx.collection.C0884l;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B<h> f13598a;

    static {
        Rgb rgb = f.f13571e;
        int i10 = rgb.f13566c;
        g gVar = new g(rgb, rgb, 1);
        m mVar = f.f13589x;
        int i11 = mVar.f13566c << 6;
        int i12 = rgb.f13566c;
        int i13 = i11 | i12;
        h hVar = new h(rgb, mVar, 0);
        int i14 = (i12 << 6) | mVar.f13566c;
        h hVar2 = new h(mVar, rgb, 0);
        B b10 = C0884l.f9191a;
        B<h> b11 = new B<>();
        b11.h(i10 | (i10 << 6), gVar);
        b11.h(i13, hVar);
        b11.h(i14, hVar2);
        f13598a = b11;
    }
}
