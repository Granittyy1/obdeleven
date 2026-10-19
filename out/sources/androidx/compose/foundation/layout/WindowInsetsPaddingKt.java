package androidx.compose.foundation.layout;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsPaddingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.modifier.h<a0> f10233a = new androidx.compose.ui.modifier.h<>(new Ia.a<a0>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1
        @Override // Ia.a
        public final a0 invoke() {
            return new C0960u();
        }
    });

    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, final L l10) {
        return ComposedModifierKt.a(hVar, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$4
            {
                super(3);
            }

            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(114694318);
                boolean zK = interfaceC1084f2.K(l10);
                L l11 = l10;
                Object objF = interfaceC1084f2.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new M(l11);
                    interfaceC1084f2.E(objF);
                }
                M m7 = (M) objF;
                interfaceC1084f2.D();
                return m7;
            }
        });
    }

    public static final androidx.compose.ui.h b(androidx.compose.ui.h hVar, final Ia.l<? super a0, p293xa.r> lVar) {
        return ComposedModifierKt.a(hVar, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(-1608161351);
                boolean zK = interfaceC1084f2.K(lVar);
                Ia.l<a0, p293xa.r> lVar2 = lVar;
                Object objF = interfaceC1084f2.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new C0956p(lVar2);
                    interfaceC1084f2.E(objF);
                }
                C0956p c0956p = (C0956p) objF;
                interfaceC1084f2.D();
                return c0956p;
            }
        });
    }

    public static final androidx.compose.ui.h c(androidx.compose.ui.h hVar, final a0 a0Var) {
        return ComposedModifierKt.a(hVar, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$2
            {
                super(3);
            }

            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(-1415685722);
                boolean zK = interfaceC1084f2.K(a0Var);
                a0 a0Var2 = a0Var;
                Object objF = interfaceC1084f2.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new InsetsPaddingModifier(a0Var2);
                    interfaceC1084f2.E(objF);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
                interfaceC1084f2.D();
                return insetsPaddingModifier;
            }
        });
    }
}
