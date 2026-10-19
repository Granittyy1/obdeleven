package com.google.accompanist.permissions;

import Ia.l;
import Ia.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PermissionsUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PermissionsUtilKt {
    public static final void a(final a permissionState, final Lifecycle.Event event, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        i.e(permissionState, "permissionState");
        C1086g c1086gP = interfaceC1084f.p(-1770945943);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(permissionState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(event) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            c1086gP.e(-899069829);
            boolean z10 = (i12 & 14) == 4;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new r() { // from class: com.google.accompanist.permissions.f
                    @Override // androidx.lifecycle.r
                    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event2) {
                        a permissionState2 = permissionState;
                        i.e(permissionState2, "$permissionState");
                        if (event2 != event || i.a(permissionState2.d(), e.b.f25218a)) {
                            return;
                        }
                        permissionState2.f25215c.setValue(permissionState2.a());
                    }
                };
                c1086gP.E(objF);
            }
            final r rVar = (r) objF;
            c1086gP.T(false);
            final Lifecycle lifecycle = ((InterfaceC1376t) c1086gP.x(Z0.b.f7676a)).getLifecycle();
            E.b(lifecycle, rVar, new l<B, A>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final A invoke(B b10) {
                    B DisposableEffect = b10;
                    i.e(DisposableEffect, "$this$DisposableEffect");
                    lifecycle.a(rVar);
                    return new g(lifecycle, rVar);
                }
            }, c1086gP);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PermissionsUtilKt.a(permissionState, event, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
