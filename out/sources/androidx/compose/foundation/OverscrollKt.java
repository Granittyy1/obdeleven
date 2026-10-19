package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1106q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OverscrollKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComputedProvidableCompositionLocal f9817a = new ComputedProvidableCompositionLocal(new Ia.l<InterfaceC1106q, F>() { // from class: androidx.compose.foundation.OverscrollKt$LocalOverscrollFactory$1
        @Override // Ia.l
        public final F invoke(InterfaceC1106q interfaceC1106q) {
            InterfaceC1106q interfaceC1106q2 = interfaceC1106q;
            int i10 = C0930b.f9863a;
            Context context = (Context) interfaceC1106q2.d(AndroidCompositionLocals_androidKt.f14793b);
            p013b0.c cVar = (p013b0.c) interfaceC1106q2.d(CompositionLocalsKt.f14847h);
            D d10 = (D) interfaceC1106q2.d(OverscrollConfiguration_androidKt.f9815a);
            if (d10 == null) {
                return null;
            }
            return new C0929a(context, cVar, d10.f9747a, d10.f9748b);
        }
    });

    public static final E a(InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(282942128);
        F f10 = (F) interfaceC1084f.x(f9817a);
        if (f10 == null) {
            interfaceC1084f.D();
            return null;
        }
        boolean zK = interfaceC1084f.K(f10);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = f10.a();
            interfaceC1084f.E(objF);
        }
        E e10 = (E) objF;
        interfaceC1084f.D();
        return e10;
    }
}
