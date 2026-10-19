package androidx.compose.runtime.livedata;

import Ia.l;
import androidx.compose.animation.core.Y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.lifecycle.AbstractC1382z;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1376t;

/* JADX INFO: compiled from: LiveDataAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final X a(final C c10, Object obj, InterfaceC1084f interfaceC1084f) {
        final InterfaceC1376t interfaceC1376t = (InterfaceC1376t) interfaceC1084f.x(Z0.b.f7676a);
        Object objF = interfaceC1084f.f();
        Object obj2 = InterfaceC1084f.a.f12980a;
        if (objF == obj2) {
            if (c10.f17844e != AbstractC1382z.f17839k) {
                obj = c10.d();
            }
            objF = J0.f(obj);
            interfaceC1084f.E(objF);
        }
        final X x10 = (X) objF;
        boolean zK = interfaceC1084f.k(c10) | interfaceC1084f.k(interfaceC1376t);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == obj2) {
            objF2 = new l<B, A>() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final A invoke(B b10) {
                    a aVar = new a(0, x10);
                    c10.e(interfaceC1376t, aVar);
                    return new Y(c10, 1, aVar);
                }
            };
            interfaceC1084f.E(objF2);
        }
        E.b(c10, interfaceC1376t, (l) objF2, interfaceC1084f);
        return x10;
    }
}
