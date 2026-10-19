package androidx.activity.compose;

import Ia.l;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1118z;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import p293xa.r;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultRegistryKt {
    public static final <I, O> e<I, O> a(final p076g.a<I, O> aVar, l<? super O, r> lVar, InterfaceC1084f interfaceC1084f, int i10) {
        X xI = J0.i(aVar, interfaceC1084f);
        final X xI2 = J0.i(lVar, interfaceC1084f);
        final String str = (String) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<String>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // Ia.a
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }, interfaceC1084f, 3072, 6);
        p063f.g gVar = (p063f.g) interfaceC1084f.x(LocalActivityResultRegistryOwner.f8207a);
        if (gVar == null) {
            interfaceC1084f.L(1006590171);
            Object baseContext = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof p063f.g) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            gVar = (p063f.g) baseContext;
        } else {
            interfaceC1084f.L(1006589303);
        }
        interfaceC1084f.D();
        if (gVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final androidx.activity.result.a activityResultRegistry = gVar.getActivityResultRegistry();
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (objF == obj) {
            objF = new a();
            interfaceC1084f.E(objF);
        }
        final a aVar2 = (a) objF;
        Object objF2 = interfaceC1084f.f();
        if (objF2 == obj) {
            objF2 = new e(aVar2, xI);
            interfaceC1084f.E(objF2);
        }
        e<I, O> eVar = (e) objF2;
        boolean zK = interfaceC1084f.k(aVar2) | interfaceC1084f.k(activityResultRegistry) | interfaceC1084f.K(str) | interfaceC1084f.k(aVar) | interfaceC1084f.K(xI2);
        Object objF3 = interfaceC1084f.f();
        if (zK || objF3 == obj) {
            Object obj2 = new l<B, A>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final A invoke(B b10) {
                    aVar2.f8211a = activityResultRegistry.d(str, aVar, new I4.e(xI2));
                    return new b(aVar2);
                }
            };
            interfaceC1084f.E(obj2);
            objF3 = obj2;
        }
        l lVar2 = (l) objF3;
        B b10 = E.f12831a;
        boolean zK2 = interfaceC1084f.K(activityResultRegistry) | interfaceC1084f.K(str) | interfaceC1084f.K(aVar);
        Object objF4 = interfaceC1084f.f();
        if (zK2 || objF4 == obj) {
            objF4 = new C1118z(lVar2);
            interfaceC1084f.E(objF4);
        }
        return eVar;
    }
}
