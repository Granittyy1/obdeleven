package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BooleanAttributeCollector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BooleanAttributeCollectorKt {
    public static final void BooleanAttributeCollector(androidx.compose.ui.h hVar, final AttributeData attributeData, boolean z10, boolean z11, Ia.l<? super AttributeData, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(attributeData, "attributeData");
        C1086g c1086gP = interfaceC1084f.p(2100686120);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        boolean z12 = (i11 & 4) != 0 ? false : z10;
        boolean z13 = (i11 & 8) != 0 ? false : z11;
        final Ia.l<? super AttributeData, p293xa.r> c2399n = (i11 & 16) != 0 ? new C2399n(8) : lVar;
        final boolean zIsFormDisabled = attributeData.isFormDisabled();
        final boolean submitted = attributeData.getAttribute().getSubmitted();
        final X x10 = (X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a() { // from class: io.intercom.android.sdk.views.compose.e
            @Override // Ia.a
            public final Object invoke() {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$1(submitted, zIsFormDisabled, attributeData);
            }
        }, c1086gP, 8, 6);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        long jM627getCollectorBorder0d7_KjU = intercomTheme.getColors(c1086gP, i13).m627getCollectorBorder0d7_KjU();
        float f10 = 1;
        p270w.a aVar2 = intercomTheme.getShapes(c1086gP, i13).f12430b;
        androidx.compose.ui.h hVarA = C0935g.a(W.e(W.d(A8.p.r(hVar2, aVar2), 1.0f), 40), f10, jM627getCollectorBorder0d7_KjU, aVar2);
        T tA = S.a(C0945e.f10289f, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        V v10 = V.f10222a;
        final androidx.compose.ui.h hVar3 = hVar2;
        final Ia.l<? super AttributeData, p293xa.r> lVar2 = c2399n;
        BooleanAttributeCollectorOption(v10, z12 ? null : BooleanAttributeCollector$lambda$2(x10), true, aVar2, zIsFormDisabled, submitted, z13 && kotlin.jvm.internal.i.a(BooleanAttributeCollector$lambda$2(x10), Boolean.TRUE), new Ia.a() { // from class: io.intercom.android.sdk.views.compose.f
            @Override // Ia.a
            public final Object invoke() {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$4(c2399n, attributeData, x10);
            }
        }, c1086gP, 390);
        DividerKt.b(W.c(aVar, 1.0f), f10, jM627getCollectorBorder0d7_KjU, c1086gP, 54, 0);
        BooleanAttributeCollectorOption(v10, z12 ? null : BooleanAttributeCollector$lambda$2(x10), false, aVar2, zIsFormDisabled, submitted, z13 && kotlin.jvm.internal.i.a(BooleanAttributeCollector$lambda$2(x10), Boolean.FALSE), new Ia.a() { // from class: io.intercom.android.sdk.views.compose.g
            @Override // Ia.a
            public final Object invoke() {
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$6$lambda$5(lVar2, attributeData, x10);
            }
        }, c1086gP, 390);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z14 = z12;
            final boolean z15 = z13;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.h
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$7(hVar3, attributeData, z14, z15, lVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributeCollector$lambda$0(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X BooleanAttributeCollector$lambda$1(boolean z10, boolean z11, AttributeData attributeData) {
        String value;
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        Boolean bool = null;
        if ((z10 || z11) && (value = attributeData.getAttribute().getValue()) != null) {
            if (value.equals("true")) {
                bool = Boolean.TRUE;
            } else if (value.equals("false")) {
                bool = Boolean.FALSE;
            }
        }
        return J0.f(bool);
    }

    private static final Boolean BooleanAttributeCollector$lambda$2(X<Boolean> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributeCollector$lambda$6$lambda$4(Ia.l lVar, AttributeData attributeData, X value$delegate) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        kotlin.jvm.internal.i.e(value$delegate, "$value$delegate");
        value$delegate.setValue(Boolean.TRUE);
        Attribute attribute = attributeData.getAttribute();
        lVar.invoke(AttributeData.copy$default(attributeData, attribute.copy((127 & 1) != 0 ? attribute.identifier : null, (127 & 2) != 0 ? attribute.name : null, (127 & 4) != 0 ? attribute.type : null, (127 & 8) != 0 ? attribute.submitted : false, (127 & 16) != 0 ? attribute.customBotControlId : null, (127 & 32) != 0 ? attribute.options : null, (127 & 64) != 0 ? attribute.multiline : null, (127 & 128) != 0 ? attribute.value : "true"), null, false, 6, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributeCollector$lambda$6$lambda$5(Ia.l lVar, AttributeData attributeData, X value$delegate) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        kotlin.jvm.internal.i.e(value$delegate, "$value$delegate");
        value$delegate.setValue(Boolean.FALSE);
        Attribute attribute = attributeData.getAttribute();
        lVar.invoke(AttributeData.copy$default(attributeData, attribute.copy((127 & 1) != 0 ? attribute.identifier : null, (127 & 2) != 0 ? attribute.name : null, (127 & 4) != 0 ? attribute.type : null, (127 & 8) != 0 ? attribute.submitted : false, (127 & 16) != 0 ? attribute.customBotControlId : null, (127 & 32) != 0 ? attribute.options : null, (127 & 64) != 0 ? attribute.multiline : null, (127 & 128) != 0 ? attribute.value : "false"), null, false, 6, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributeCollector$lambda$7(androidx.compose.ui.h hVar, AttributeData attributeData, boolean z10, boolean z11, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        BooleanAttributeCollector(hVar, attributeData, z10, z11, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void BooleanAttributeCollectorOption(final U u10, final Boolean bool, final boolean z10, final p270w.a aVar, final boolean z11, final boolean z12, final boolean z13, final Ia.a<p293xa.r> aVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        IntercomTheme intercomTheme;
        C1086g c1086gP = interfaceC1084f.p(1323902640);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(u10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(bool) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.K(aVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c1086gP.c(z11) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c1086gP.c(z12) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= c1086gP.c(z13) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= c1086gP.k(aVar2) ? 8388608 : 4194304;
        }
        if ((i11 & 23967451) == 4793490 && c1086gP.s()) {
            c1086gP.w();
        } else {
            p270w.d dVar = new p270w.d(0);
            p270w.a aVarB = z10 ? p270w.a.b(aVar, null, dVar, dVar, null, 9) : p270w.a.b(aVar, dVar, null, null, dVar, 6);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            long jM628getCollectorSelected0d7_KjU = intercomTheme2.getColors(c1086gP, i12).m628getCollectorSelected0d7_KjU();
            long jB = H.b(0.38f, intercomTheme2.getColors(c1086gP, i12).m645getPrimaryText0d7_KjU());
            androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarR = A8.p.r(W.c(aVar3, 1.0f), aVarB);
            if (!kotlin.jvm.internal.i.a(bool, Boolean.valueOf(z10))) {
                jM628getCollectorSelected0d7_KjU = H.f13503k;
            }
            androidx.compose.ui.h hVarB = u10.b(ClickableKt.c(C0932d.b(hVarR, jM628getCollectorSelected0d7_KjU, h0.f13629a), (z11 || z12) ? false : true, null, aVar2, 6), true);
            T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c1086gP.L(872785261);
            if (z13) {
                intercomTheme = intercomTheme2;
                ProgressIndicatorKt.a(W.m(aVar3, 20), intercomTheme2.getColors(c1086gP, i12).m645getPrimaryText0d7_KjU(), 3, 0L, 0, 390, c1086gP, 24);
                Lb.a.a(c1086gP, W.q(aVar3, 4));
            } else {
                intercomTheme = intercomTheme2;
            }
            c1086gP.T(false);
            String strP = S4.o.p(c1086gP, z10 ? io.intercom.android.sdk.R.string.intercom_attribute_collector_positive : io.intercom.android.sdk.R.string.intercom_attribute_collector_negative);
            c1086gP.L(872804846);
            long jM645getPrimaryText0d7_KjU = (z11 || kotlin.jvm.internal.i.a(bool, Boolean.valueOf(z10 ^ true))) ? jB : intercomTheme.getColors(c1086gP, i12).m645getPrimaryText0d7_KjU();
            c1086gP.T(false);
            TextKt.b(strP, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 130554);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BooleanAttributeCollectorKt.BooleanAttributeCollectorOption$lambda$9(u10, bool, z10, aVar, z11, z12, z13, aVar2, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributeCollectorOption$lambda$9(U this_BooleanAttributeCollectorOption, Boolean bool, boolean z10, p270w.a shape, boolean z11, boolean z12, boolean z13, Ia.a onClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(this_BooleanAttributeCollectorOption, "$this_BooleanAttributeCollectorOption");
        kotlin.jvm.internal.i.e(shape, "$shape");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        BooleanAttributeCollectorOption(this_BooleanAttributeCollectorOption, bool, z10, shape, z11, z12, z13, onClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void BooleanAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1269323591);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m677getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributePreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BooleanAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void DisabledBooleanAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2015578211);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m681getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r DisabledBooleanAttributePreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DisabledBooleanAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedAndDisabledBooleanAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1476435233);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m683getLambda8$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedAndDisabledBooleanAttributePreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedAndDisabledBooleanAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedBooleanAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-875849702);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m679getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedBooleanAttributePreview$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedBooleanAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
