package com.voltasit.obdeleven.presentation.components;

import G8.C0707i;
import Ia.l;
import J8.p;
import K8.i;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import com.voltasit.obdeleven.domain.models.Screen;
import p141l2.H;
import p293xa.r;

/* JADX INFO: compiled from: NavigationController.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NavigationControllerKt {
    public static final void a(final H navController, final i navigationProvider, final Screen startScreen, final p logger, l<? super C0707i, r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(navigationProvider, "navigationProvider");
        kotlin.jvm.internal.i.e(startScreen, "startScreen");
        kotlin.jvm.internal.i.e(logger, "logger");
        C1086g c1086gP = interfaceC1084f.p(-1861963150);
        l<? super C0707i, r> lVar2 = (i11 & 16) != 0 ? new l<C0707i, r>() { // from class: com.voltasit.obdeleven.presentation.components.NavigationControllerKt$NavigationController$1
            @Override // Ia.l
            public final r invoke(C0707i c0707i) {
                C0707i it = c0707i;
                kotlin.jvm.internal.i.e(it, "it");
                return r.f47939a;
            }
        } : lVar;
        E.d(new NavigationControllerKt$NavigationController$2(navigationProvider, navController, lVar2, logger, startScreen, null), c1086gP, "navigation");
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final l<? super C0707i, r> lVar3 = lVar2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.NavigationControllerKt$NavigationController$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NavigationControllerKt.a(navController, navigationProvider, startScreen, logger, lVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
