package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.compose.K;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2279f0;
import io.intercom.android.sdk.m5.components.C2281g0;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.U;
import io.intercom.android.sdk.m5.conversation.ui.components.row.z;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: ListAttributeCollector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ListAttributeCollectorKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3, reason: invalid class name */
    /* JADX INFO: compiled from: ListAttributeCollector.kt */
    public static final class AnonymousClass3 implements Ia.q<ExposedDropdownMenuBoxScope, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ boolean $disabled;
        final /* synthetic */ X<Boolean> $expanded$delegate;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Ia.l<AttributeData, p293xa.r> $onSubmitAttribute;
        final /* synthetic */ boolean $showDropdownMenu;
        final /* synthetic */ boolean $submitted;
        final /* synthetic */ X<String> $value$delegate;

        /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4, reason: invalid class name */
        /* JADX INFO: compiled from: ListAttributeCollector.kt */
        public static final class AnonymousClass4 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
            final /* synthetic */ AttributeData $attributeData;
            final /* synthetic */ X<Boolean> $expanded$delegate;
            final /* synthetic */ Ia.l<AttributeData, p293xa.r> $onSubmitAttribute;
            final /* synthetic */ X<String> $value$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(AttributeData attributeData, Ia.l<? super AttributeData, p293xa.r> lVar, X<String> x10, X<Boolean> x11) {
                this.$attributeData = attributeData;
                this.$onSubmitAttribute = lVar;
                this.$value$delegate = x10;
                this.$expanded$delegate = x11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p293xa.r invoke$lambda$1$lambda$0(String option, Ia.l lVar, AttributeData attributeData, X value$delegate, X expanded$delegate) {
                kotlin.jvm.internal.i.e(option, "$option");
                kotlin.jvm.internal.i.e(attributeData, "$attributeData");
                kotlin.jvm.internal.i.e(value$delegate, "$value$delegate");
                kotlin.jvm.internal.i.e(expanded$delegate, "$expanded$delegate");
                ListAttributeCollectorKt.ListAttributeCollector$lambda$6(value$delegate, option);
                ListAttributeCollectorKt.ListAttributeCollector$lambda$3(expanded$delegate, false);
                Attribute attribute = attributeData.getAttribute();
                lVar.invoke(AttributeData.copy$default(attributeData, attribute.copy((127 & 1) != 0 ? attribute.identifier : null, (127 & 2) != 0 ? attribute.name : null, (127 & 4) != 0 ? attribute.type : null, (127 & 8) != 0 ? attribute.submitted : false, (127 & 16) != 0 ? attribute.customBotControlId : null, (127 & 32) != 0 ? attribute.options : null, (127 & 64) != 0 ? attribute.multiline : null, (127 & 128) != 0 ? attribute.value : option), null, false, 6, null));
                return p293xa.r.f47939a;
            }

            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC0954n, interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0954n ExposedDropdownMenu, InterfaceC1084f interfaceC1084f, int i10) {
                kotlin.jvm.internal.i.e(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
                if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                List<String> options = this.$attributeData.getAttribute().getOptions();
                if (options == null) {
                    return;
                }
                final Ia.l<AttributeData, p293xa.r> lVar = this.$onSubmitAttribute;
                final AttributeData attributeData = this.$attributeData;
                final X<String> x10 = this.$value$delegate;
                final X<Boolean> x11 = this.$expanded$delegate;
                for (final String str : options) {
                    AndroidMenu_androidKt.b(androidx.compose.runtime.internal.a.b(1941734396, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt$ListAttributeCollector$3$4$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                            if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, interfaceC1084f), new Ia.a() { // from class: io.intercom.android.sdk.views.compose.m
                        @Override // Ia.a
                        public final Object invoke() {
                            return ListAttributeCollectorKt.AnonymousClass3.AnonymousClass4.invoke$lambda$1$lambda$0(str, lVar, attributeData, x10, x11);
                        }
                    }, null, null, null, false, null, null, null, interfaceC1084f, 6, 508);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z10, boolean z11, AttributeData attributeData, X<String> x10, boolean z12, boolean z13, X<Boolean> x11, Ia.l<? super AttributeData, p293xa.r> lVar) {
            this.$disabled = z10;
            this.$showDropdownMenu = z11;
            this.$attributeData = attributeData;
            this.$value$delegate = x10;
            this.$submitted = z12;
            this.$loading = z13;
            this.$expanded$delegate = x11;
            this.$onSubmitAttribute = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$0(String it) {
            kotlin.jvm.internal.i.e(it, "it");
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$2$lambda$1(X expanded$delegate) {
            kotlin.jvm.internal.i.e(expanded$delegate, "$expanded$delegate");
            ListAttributeCollectorKt.ListAttributeCollector$lambda$3(expanded$delegate, false);
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(exposedDropdownMenuBoxScope, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(ExposedDropdownMenuBoxScope ExposedDropdownMenuBox, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            kotlin.jvm.internal.i.e(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
            if ((i10 & 14) == 0) {
                i11 = i10 | (interfaceC1084f.K(ExposedDropdownMenuBox) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h hVarD = ExposedDropdownMenuBox.d(W.e(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 40), true);
            String strListAttributeCollector$lambda$5 = ListAttributeCollectorKt.ListAttributeCollector$lambda$5(this.$value$delegate);
            boolean z10 = !this.$disabled;
            k kVar = new k();
            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVarM684getLambda1$intercom_sdk_base_release = ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m684getLambda1$intercom_sdk_base_release();
            final boolean z11 = this.$submitted;
            final boolean z12 = this.$loading;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strListAttributeCollector$lambda$5, kVar, hVarD, z10, true, null, null, pVarM684getLambda1$intercom_sdk_base_release, null, androidx.compose.runtime.internal.a.b(-1903726860, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.ListAttributeCollectorKt.ListAttributeCollector.3.2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                    if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarM = W.m(PaddingKt.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14), 40);
                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                    boolean z13 = z11;
                    boolean z14 = z12;
                    E eD = BoxKt.d(fVar, false);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarM);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, eD);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                    if (z13) {
                        interfaceC1084f2.L(-1795451461);
                        IconKt.a(U.c.a(R.drawable.intercom_attribute_verified_tick, interfaceC1084f2, 0), null, null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 56, 4);
                        interfaceC1084f2.D();
                    } else if (z14) {
                        interfaceC1084f2.L(175868479);
                        ProgressIndicatorKt.a(W.m(aVar, 20), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), 3, 0L, 0, 390, interfaceC1084f2, 24);
                        interfaceC1084f2.D();
                    } else {
                        interfaceC1084f2.L(-1795433709);
                        IconKt.a(U.c.a(R.drawable.intercom_list_arrow_down, interfaceC1084f2, 0), null, null, 0L, interfaceC1084f2, 56, 12);
                        interfaceC1084f2.D();
                    }
                    interfaceC1084f2.J();
                }
            }, interfaceC1084f), false, null, null, null, true, 0, 0, null, null, null, null, interfaceC1084f, 817913904, 24576, 0, 2080096);
            if (this.$showDropdownMenu) {
                boolean z13 = !this.$attributeData.isFormDisabled() && ListAttributeCollectorKt.ListAttributeCollector$lambda$2(this.$expanded$delegate);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i12 = IntercomTheme.$stable;
                long jM621getBackground0d7_KjU = intercomTheme.getColors(interfaceC1084f, i12).m621getBackground0d7_KjU();
                p270w.a aVar = intercomTheme.getShapes(interfaceC1084f, i12).f12430b;
                float f10 = 8;
                interfaceC1084f.L(-742015086);
                final X<Boolean> x10 = this.$expanded$delegate;
                Object objF = interfaceC1084f.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.views.compose.l
                        @Override // Ia.a
                        public final Object invoke() {
                            return ListAttributeCollectorKt.AnonymousClass3.invoke$lambda$2$lambda$1(x10);
                        }
                    };
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                ExposedDropdownMenuBox.a(z13, (Ia.a) objF, null, null, false, aVar, jM621getBackground0d7_KjU, 0.0f, f10, null, androidx.compose.runtime.internal.a.b(-1185294213, new AnonymousClass4(this.$attributeData, this.$onSubmitAttribute, this.$value$delegate, this.$expanded$delegate), interfaceC1084f), interfaceC1084f, 100663344, 6 | ((i11 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 668);
            }
        }
    }

    public static final void DisabledListAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(865192767);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m690getLambda7$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r DisabledListAttributePreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DisabledListAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ListAttributeCollector(androidx.compose.ui.h hVar, final AttributeData attributeData, boolean z10, boolean z11, Ia.l<? super AttributeData, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(attributeData, "attributeData");
        C1086g c1086gP = interfaceC1084f.p(1993212876);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        boolean z12 = (i11 & 4) != 0 ? false : z10;
        boolean z13 = (i11 & 8) != 0 ? false : z11;
        Ia.l<? super AttributeData, p293xa.r> u10 = (i11 & 16) != 0 ? new U(4) : lVar;
        boolean zIsFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        c1086gP.L(497283745);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = J0.f(Boolean.FALSE);
            c1086gP.E(objF);
        }
        X x10 = (X) objF;
        c1086gP.T(false);
        X x11 = (X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new K(2, attributeData), c1086gP, 8, 6);
        boolean z14 = z12 || !(zIsFormDisabled || submitted);
        androidx.compose.ui.h hVarD = W.d(hVar2, 1.0f);
        boolean zListAttributeCollector$lambda$2 = ListAttributeCollector$lambda$2(x10);
        c1086gP.L(497294500);
        Object objF2 = c1086gP.f();
        if (objF2 == c0153a) {
            objF2 = new io.intercom.android.sdk.survey.ui.components.a(2, x10);
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        ExposedDropdownMenu_androidKt.a(zListAttributeCollector$lambda$2, (Ia.l) objF2, hVarD, androidx.compose.runtime.internal.a.b(1992435426, new AnonymousClass3(zIsFormDisabled, z14, attributeData, x11, submitted, z13, x10, u10), c1086gP), c1086gP, 3120, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final boolean z15 = z12;
            final boolean z16 = z13;
            final Ia.l<? super AttributeData, p293xa.r> lVar2 = u10;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ListAttributeCollectorKt.ListAttributeCollector$lambda$9(hVar3, attributeData, z15, z16, lVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ListAttributeCollector$lambda$0(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ListAttributeCollector$lambda$2(X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$3(X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X ListAttributeCollector$lambda$4(AttributeData attributeData) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return J0.f(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ListAttributeCollector$lambda$5(X<String> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListAttributeCollector$lambda$6(X<String> x10, String str) {
        x10.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ListAttributeCollector$lambda$8$lambda$7(X expanded$delegate, boolean z10) {
        kotlin.jvm.internal.i.e(expanded$delegate, "$expanded$delegate");
        ListAttributeCollector$lambda$3(expanded$delegate, z10);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ListAttributeCollector$lambda$9(androidx.compose.ui.h hVar, AttributeData attributeData, boolean z10, boolean z11, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        ListAttributeCollector(hVar, attributeData, z10, z11, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void ListAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1324269915);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m686getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ListAttributePreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ListAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedAndDisabledListAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1340154819);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m692getLambda9$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2279f0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedAndDisabledListAttributePreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedAndDisabledListAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedListAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-899805828);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m688getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.home.ui.components.q(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedListAttributePreview$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedListAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
