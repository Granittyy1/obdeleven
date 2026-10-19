package androidx.compose.animation;

import androidx.compose.animation.core.C0902b;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.P;
import androidx.compose.animation.core.d0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.N0;
import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: SingleValueAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P<H> f9674a = C0907g.c(0.0f, 0.0f, null, 7);

    public static final N0 a(long j, InterfaceC0923x interfaceC0923x, String str, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC0923x = f9674a;
        }
        InterfaceC0923x interfaceC0923x2 = interfaceC0923x;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zK = interfaceC1084f.K(H.f(j));
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = (d0) ((ColorVectorConverterKt$ColorToVector$1) ColorVectorConverterKt.f9265a).invoke(H.f(j));
            interfaceC1084f.E(objF);
        }
        return C0902b.c(new H(j), (d0) objF, interfaceC0923x2, null, str2, null, interfaceC1084f, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }
}
