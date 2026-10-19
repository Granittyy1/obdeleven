package com.obdeleven.feature.boomboarding.ui;

import Ia.l;
import Ia.p;
import androidx.activity.e;
import androidx.compose.animation.core.F;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ComposableLifecycle.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableLifecycleKt {
    public static final void a(final InterfaceC1376t interfaceC1376t, final p<? super InterfaceC1376t, ? super Lifecycle.Event, r> onEvent, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        i.e(onEvent, "onEvent");
        C1086g c1086gP = interfaceC1084f.p(-416992573);
        int i12 = i11 & 1;
        int i13 = i12 != 0 ? i10 | 2 : i10;
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.k(onEvent) ? 32 : 16;
        }
        if (i12 == 1 && (i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0 && !c1086gP.a0()) {
                c1086gP.w();
            } else if (i12 != 0) {
                interfaceC1376t = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            }
            c1086gP.U();
            E.a(interfaceC1376t, new l<B, A>() { // from class: com.obdeleven.feature.boomboarding.ui.ComposableLifecycleKt$ComposableLifecycle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final A invoke(B b10) {
                    B DisposableEffect = b10;
                    i.e(DisposableEffect, "$this$DisposableEffect");
                    e eVar = new e(1, onEvent);
                    interfaceC1376t.getLifecycle().a(eVar);
                    return new F(interfaceC1376t, 1, eVar);
                }
            }, c1086gP);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.obdeleven.feature.boomboarding.ui.ComposableLifecycleKt$ComposableLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ComposableLifecycleKt.a(interfaceC1376t, onEvent, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
