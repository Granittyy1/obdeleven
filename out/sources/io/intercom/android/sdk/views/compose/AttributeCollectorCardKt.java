package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.components.P;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: AttributeCollectorCard.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AttributeCollectorCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$AttributeCollectorCard$2, reason: invalid class name */
    /* JADX INFO: compiled from: AttributeCollectorCard.kt */
    public static final class AnonymousClass2 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ List<Attribute> $attributes;
        final /* synthetic */ List<String> $failedAttributeIdentifiers;
        final /* synthetic */ boolean $isFormDisabled;
        final /* synthetic */ List<String> $loadingAttributeIdentifiers;
        final /* synthetic */ Ia.l<AttributeData, p293xa.r> $onSubmitAttribute;
        final /* synthetic */ String $partId;
        final /* synthetic */ Resources $resources;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<Attribute> list, List<String> list2, Resources resources, List<String> list3, String str, boolean z10, Ia.l<? super AttributeData, p293xa.r> lVar) {
            this.$attributes = list;
            this.$failedAttributeIdentifiers = list2;
            this.$resources = resources;
            this.$loadingAttributeIdentifiers = list3;
            this.$partId = str;
            this.$isFormDisabled = z10;
            this.$onSubmitAttribute = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final X invoke$lambda$10$lambda$9$lambda$2() {
            return J0.f("");
        }

        private static final String invoke$lambda$10$lambda$9$lambda$3(X<String> x10) {
            return x10.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$10$lambda$9$lambda$7$lambda$6(X validationError$delegate, String it) {
            kotlin.jvm.internal.i.e(validationError$delegate, "$validationError$delegate");
            kotlin.jvm.internal.i.e(it, "it");
            validationError$delegate.setValue(it);
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0378  */
        /* JADX WARN: Code duplicated, block: B:103:0x0381  */
        /* JADX WARN: Code duplicated, block: B:106:0x038a  */
        /* JADX WARN: Code duplicated, block: B:108:0x0398  */
        /* JADX WARN: Code duplicated, block: B:109:0x039b  */
        /* JADX WARN: Code duplicated, block: B:112:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:115:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:118:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:120:0x03d6  */
        /* JADX WARN: Code duplicated, block: B:121:0x03d9  */
        /* JADX WARN: Code duplicated, block: B:123:0x03ef  */
        /* JADX WARN: Code duplicated, block: B:125:0x03f9 A[PHI: r12
          0x03f9: PHI (r12v18 androidx.compose.runtime.f) = 
          (r12v3 androidx.compose.runtime.f)
          (r12v4 androidx.compose.runtime.f)
          (r12v5 androidx.compose.runtime.f)
          (r12v6 androidx.compose.runtime.f)
          (r12v8 androidx.compose.runtime.f)
          (r12v9 androidx.compose.runtime.f)
          (r12v10 androidx.compose.runtime.f)
          (r12v13 androidx.compose.runtime.f)
          (r12v19 androidx.compose.runtime.f)
         binds: [B:124:0x03f7, B:116:0x03c7, B:113:0x03bc, B:162:?, B:158:?, B:161:?, B:160:?, B:159:?, B:89:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:126:0x0405 A[PHI: r12
          0x0405: PHI (r12v11 androidx.compose.runtime.f) = (r12v3 androidx.compose.runtime.f), (r12v5 androidx.compose.runtime.f), (r12v12 androidx.compose.runtime.f) binds: [B:124:0x03f7, B:113:0x03bc, B:93:0x0362] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:128:0x041d  */
        /* JADX WARN: Code duplicated, block: B:130:0x0421  */
        /* JADX WARN: Code duplicated, block: B:137:0x0457  */
        /* JADX WARN: Code duplicated, block: B:139:0x0473  */
        /* JADX WARN: Code duplicated, block: B:155:0x04d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:158:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:160:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:161:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x017e  */
        /* JADX WARN: Code duplicated, block: B:54:0x0187  */
        /* JADX WARN: Code duplicated, block: B:57:0x019d  */
        /* JADX WARN: Code duplicated, block: B:60:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:62:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:63:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:68:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:74:0x0209  */
        /* JADX WARN: Code duplicated, block: B:77:0x0221  */
        /* JADX WARN: Code duplicated, block: B:79:0x023e  */
        /* JADX WARN: Code duplicated, block: B:82:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:84:0x02ab  */
        /* JADX WARN: Code duplicated, block: B:85:0x0313  */
        /* JADX WARN: Code duplicated, block: B:86:0x031c  */
        /* JADX WARN: Code duplicated, block: B:89:0x0355  */
        /* JADX WARN: Code duplicated, block: B:90:0x0359  */
        /* JADX WARN: Code duplicated, block: B:94:0x0366  */
        /* JADX WARN: Code duplicated, block: B:97:0x036f  */
        /* JADX WARN: Failed to find 'out' block for switch in B:88:0x0352. Please report as an issue. */
        /* JADX WARN: Instruction removed from duplicated block: B:77:0x0221, please report this as an issue */
        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar;
            Ia.l<AttributeData, p293xa.r> lVar;
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar2;
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3;
            Ia.l<AttributeData, p293xa.r> lVar2;
            boolean z10;
            int i12;
            List<Attribute> list;
            X x10;
            String string;
            String str;
            boolean zContains;
            T tA;
            int iF;
            InterfaceC1089h0 interfaceC1089h0Z;
            androidx.compose.ui.h hVarC;
            String name;
            IntercomTheme intercomTheme;
            int i13;
            androidx.compose.ui.h.a aVar;
            int i14;
            IntercomTheme intercomTheme2;
            int i15;
            boolean z11;
            int i16;
            AttributeData attributeData;
            float f10;
            androidx.compose.ui.h hVarJ;
            String renderType;
            InterfaceC1084f interfaceC1084f2;
            boolean z12;
            boolean z13;
            final X x11;
            boolean zK;
            Object objF;
            String strInvoke$lambda$10$lambda$9$lambda$3;
            InterfaceC1084f interfaceC1084f3 = interfaceC1084f;
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            float f11 = 24;
            androidx.compose.ui.h hVarF = PaddingKt.f(aVar2, f11);
            List<Attribute> list2 = this.$attributes;
            List<String> list3 = this.$failedAttributeIdentifiers;
            Resources resources = this.$resources;
            List<String> list4 = this.$loadingAttributeIdentifiers;
            String str2 = this.$partId;
            boolean z14 = this.$isFormDisabled;
            Ia.l<AttributeData, p293xa.r> lVar3 = this.$onSubmitAttribute;
            C0945e.k kVar = C0945e.f10286c;
            androidx.compose.ui.f.a aVar3 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA = C0952l.a(kVar, aVar3, interfaceC1084f3, 0);
            int iF2 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarF);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f3.v(aVar4);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z2);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar4);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC2);
            Iterator<Attribute> it = list2.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = 1;
                    i17 = -1;
                    break;
                } else {
                    if (!it.next().hasValue()) {
                        i11 = 1;
                        break;
                    }
                    i17++;
                }
            }
            Integer numValueOf = Integer.valueOf(i17);
            if (i17 == -1) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : list2.size() - i11;
            interfaceC1084f3.L(1866899712);
            int i18 = iIntValue + i11;
            int i19 = 0;
            while (i19 < i18) {
                Attribute attribute = list2.get(i19);
                C0953m c0953mA2 = C0952l.a(C0945e.f10286c, aVar3, interfaceC1084f3, 0);
                int iF3 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f.z();
                androidx.compose.ui.f.a aVar5 = aVar3;
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                ComposeUiNode.f14331c0.getClass();
                String str3 = str2;
                Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f3.v(aVar6);
                } else {
                    interfaceC1084f.A();
                }
                Ia.p<ComposeUiNode, E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar5, interfaceC1084f3, c0953mA2);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar6, interfaceC1084f3, interfaceC1089h0Z3);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f.m()) {
                    pVar = pVar6;
                    lVar = lVar3;
                } else {
                    pVar = pVar6;
                    lVar = lVar3;
                    if (!kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF3))) {
                    }
                    pVar2 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar2, interfaceC1084f3, hVarC3);
                    pVar3 = pVar;
                    lVar2 = lVar;
                    z10 = z14;
                    i12 = i18;
                    list = list2;
                    x10 = (X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new b(), interfaceC1084f, 3080, 6);
                    if (list3.contains(attribute.getIdentifier())) {
                        string = resources.getString(R.string.intercom_something_went_wrong_try_again);
                    } else {
                        string = "";
                    }
                    str = string;
                    kotlin.jvm.internal.i.b(str);
                    zContains = list4.contains(attribute.getIdentifier());
                    interfaceC1084f3.L(672001750);
                    if (i19 > 0) {
                        Lb.a.a(interfaceC1084f3, W.e(aVar2, f11));
                    }
                    interfaceC1084f.D();
                    androidx.compose.ui.h hVarD = W.d(aVar2, 1.0f);
                    tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, interfaceC1084f3, 0);
                    iF = interfaceC1084f.F();
                    interfaceC1089h0Z = interfaceC1084f.z();
                    hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarD);
                    if (interfaceC1084f.u() != null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f.r();
                    if (interfaceC1084f.m()) {
                        interfaceC1084f3.v(aVar6);
                    } else {
                        interfaceC1084f.A();
                    }
                    R0.a(pVar5, interfaceC1084f3, tA);
                    R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z);
                    if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                    }
                    R0.a(pVar2, interfaceC1084f3, hVarC);
                    if (1.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
                    if (list.size() > 1) {
                        name = (i19 + 1) + ". " + attribute.getName();
                    } else {
                        name = attribute.getName();
                    }
                    String str4 = name;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i13 = IntercomTheme.$stable;
                    List<String> list5 = list4;
                    Resources resources2 = resources;
                    List<String> list6 = list3;
                    float f12 = f11;
                    aVar = aVar2;
                    i14 = i19;
                    TextKt.b(str4, layoutWeightElement, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(interfaceC1084f3, i13).getType04(), interfaceC1084f, 0, 3120, 55292);
                    interfaceC1084f.L(-86962638);
                    if (i14 == 0) {
                        intercomTheme2 = intercomTheme;
                        i15 = i13;
                        z11 = true;
                        i16 = i12;
                    } else if (list.size() > 1) {
                        androidx.compose.ui.h hVarJ2 = PaddingKt.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14);
                        StringBuilder sbE = A8.f.e(i12, "(", " / ");
                        sbE.append(list.size());
                        sbE.append(')');
                        String string2 = sbE.toString();
                        intercomTheme2 = intercomTheme;
                        i15 = i13;
                        i16 = i12;
                        z11 = true;
                        TextKt.b(string2, hVarJ2, U.a.a(interfaceC1084f, R.color.intercom_attribute_input_hint), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(interfaceC1084f, i13).getType04(), interfaceC1084f, 48, 0, 65528);
                    } else {
                        intercomTheme2 = intercomTheme;
                        i15 = i13;
                        i16 = i12;
                        z11 = true;
                    }
                    interfaceC1084f.D();
                    interfaceC1084f.J();
                    attributeData = new AttributeData(attribute, str3, z10);
                    f10 = 12;
                    hVarJ = PaddingKt.j(W.d(aVar, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13);
                    renderType = attribute.getRenderType();
                    switch (renderType.hashCode()) {
                        case -1034364087:
                            interfaceC1084f2 = interfaceC1084f;
                            if (renderType.equals("number")) {
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar = p293xa.r.f47939a;
                                x11 = x10;
                            } else {
                                interfaceC1084f2.L(672066800);
                                interfaceC1084f2.L(672076166);
                                x11 = x10;
                                zK = interfaceC1084f2.K(x11);
                                objF = interfaceC1084f.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                        @Override // Ia.l
                                        public final Object invoke(Object obj) {
                                            return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                        }
                                    };
                                    interfaceC1084f2.E(objF);
                                }
                                interfaceC1084f.D();
                                TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                                interfaceC1084f.D();
                                p293xa.r rVar2 = p293xa.r.f47939a;
                            }
                            break;
                        case 3322014:
                            interfaceC1084f2 = interfaceC1084f;
                            if (renderType.equals(AttributeType.LIST)) {
                                interfaceC1084f2.L(672092489);
                                if (str.length() > 0) {
                                    z12 = z11;
                                } else {
                                    z12 = false;
                                }
                                ListAttributeCollectorKt.ListAttributeCollector(hVarJ, attributeData, z12, zContains, lVar2, interfaceC1084f, 70, 0);
                                interfaceC1084f.D();
                                p293xa.r rVar3 = p293xa.r.f47939a;
                            } else {
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar4 = p293xa.r.f47939a;
                            }
                            x11 = x10;
                            break;
                        case 3556653:
                            interfaceC1084f2 = interfaceC1084f;
                            if (renderType.equals(AttributeType.TEXT)) {
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar5 = p293xa.r.f47939a;
                                x11 = x10;
                            } else {
                                interfaceC1084f2.L(672066800);
                                interfaceC1084f2.L(672076166);
                                x11 = x10;
                                zK = interfaceC1084f2.K(x11);
                                objF = interfaceC1084f.f();
                                if (zK) {
                                    objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                        @Override // Ia.l
                                        public final Object invoke(Object obj) {
                                            return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                        }
                                    };
                                    interfaceC1084f2.E(objF);
                                } else {
                                    objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                        @Override // Ia.l
                                        public final Object invoke(Object obj) {
                                            return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                        }
                                    };
                                    interfaceC1084f2.E(objF);
                                }
                                interfaceC1084f.D();
                                TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                                interfaceC1084f.D();
                                p293xa.r rVar6 = p293xa.r.f47939a;
                            }
                            break;
                        case 64711720:
                            if (renderType.equals("boolean")) {
                                interfaceC1084f2 = interfaceC1084f;
                                interfaceC1084f2.L(672079756);
                                if (str.length() > 0) {
                                    z13 = z11;
                                } else {
                                    z13 = false;
                                }
                                BooleanAttributeCollectorKt.BooleanAttributeCollector(hVarJ, attributeData, z13, zContains, lVar2, interfaceC1084f, 70, 0);
                                interfaceC1084f.D();
                                p293xa.r rVar7 = p293xa.r.f47939a;
                            } else {
                                interfaceC1084f2 = interfaceC1084f;
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar8 = p293xa.r.f47939a;
                            }
                            x11 = x10;
                            break;
                        case 75849770:
                            if (!renderType.equals(AttributeType.WEBSITE)) {
                                interfaceC1084f2 = interfaceC1084f;
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar9 = p293xa.r.f47939a;
                                x11 = x10;
                            }
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(672066800);
                            interfaceC1084f2.L(672076166);
                            x11 = x10;
                            zK = interfaceC1084f2.K(x11);
                            objF = interfaceC1084f.f();
                            if (zK) {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            } else {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            }
                            interfaceC1084f.D();
                            TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar10 = p293xa.r.f47939a;
                            break;
                        case 96619420:
                            if (!renderType.equals("email")) {
                                interfaceC1084f2 = interfaceC1084f;
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar11 = p293xa.r.f47939a;
                                x11 = x10;
                            }
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(672066800);
                            interfaceC1084f2.L(672076166);
                            x11 = x10;
                            zK = interfaceC1084f2.K(x11);
                            objF = interfaceC1084f.f();
                            if (zK) {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            } else {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            }
                            interfaceC1084f.D();
                            TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar12 = p293xa.r.f47939a;
                            break;
                        case 97526364:
                            if (!renderType.equals(AttributeType.FLOAT)) {
                                interfaceC1084f2 = interfaceC1084f;
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar13 = p293xa.r.f47939a;
                                x11 = x10;
                            }
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(672066800);
                            interfaceC1084f2.L(672076166);
                            x11 = x10;
                            zK = interfaceC1084f2.K(x11);
                            objF = interfaceC1084f.f();
                            if (zK) {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            } else {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            }
                            interfaceC1084f.D();
                            TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar14 = p293xa.r.f47939a;
                            break;
                        case 106642798:
                            if (!renderType.equals(AttributeType.PHONE)) {
                                interfaceC1084f2 = interfaceC1084f;
                                interfaceC1084f2.L(-639614028);
                                interfaceC1084f.D();
                                p293xa.r rVar15 = p293xa.r.f47939a;
                                x11 = x10;
                            }
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(672066800);
                            interfaceC1084f2.L(672076166);
                            x11 = x10;
                            zK = interfaceC1084f2.K(x11);
                            objF = interfaceC1084f.f();
                            if (zK) {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            } else {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            }
                            interfaceC1084f.D();
                            TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar16 = p293xa.r.f47939a;
                            break;
                        default:
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar17 = p293xa.r.f47939a;
                            x11 = x10;
                            break;
                    }
                    interfaceC1084f2.L(672105265);
                    if (invoke$lambda$10$lambda$9$lambda$3(x11).length() <= 0 || str.length() > 0) {
                        androidx.compose.ui.h hVarJ3 = PaddingKt.j(W.d(aVar, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13);
                        strInvoke$lambda$10$lambda$9$lambda$3 = invoke$lambda$10$lambda$9$lambda$3(x11);
                        if (strInvoke$lambda$10$lambda$9$lambda$3.length() == 0) {
                            strInvoke$lambda$10$lambda$9$lambda$3 = str;
                        }
                        TextKt.b(strInvoke$lambda$10$lambda$9$lambda$3, hVarJ3, U.a.a(interfaceC1084f2, R.color.intercom_attribute_collector_error), 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, intercomTheme2.getTypography(interfaceC1084f2, i15).getType04(), interfaceC1084f, 48, 3120, 55288);
                    }
                    interfaceC1084f.D();
                    interfaceC1084f.J();
                    i19 = i14 + 1;
                    interfaceC1084f3 = interfaceC1084f;
                    str2 = str3;
                    list4 = list5;
                    aVar3 = aVar5;
                    resources = resources2;
                    lVar3 = lVar2;
                    list2 = list;
                    aVar2 = aVar;
                    z14 = z10;
                    i18 = i16;
                    list3 = list6;
                    f11 = f12;
                }
                androidx.compose.animation.k.b(iF3, interfaceC1084f3, iF3, pVar7);
                pVar2 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar2, interfaceC1084f3, hVarC3);
                pVar3 = pVar;
                lVar2 = lVar;
                z10 = z14;
                i12 = i18;
                list = list2;
                x10 = (X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new b(), interfaceC1084f, 3080, 6);
                if (list3.contains(attribute.getIdentifier())) {
                    string = resources.getString(R.string.intercom_something_went_wrong_try_again);
                } else {
                    string = "";
                }
                str = string;
                kotlin.jvm.internal.i.b(str);
                zContains = list4.contains(attribute.getIdentifier());
                interfaceC1084f3.L(672001750);
                if (i19 > 0) {
                    Lb.a.a(interfaceC1084f3, W.e(aVar2, f11));
                }
                interfaceC1084f.D();
                androidx.compose.ui.h hVarD2 = W.d(aVar2, 1.0f);
                tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, interfaceC1084f3, 0);
                iF = interfaceC1084f.F();
                interfaceC1089h0Z = interfaceC1084f.z();
                hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarD2);
                if (interfaceC1084f.u() != null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f3.v(aVar6);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar5, interfaceC1084f3, tA);
                R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z);
                if (interfaceC1084f.m()) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                } else {
                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                }
                R0.a(pVar2, interfaceC1084f3, hVarC);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
                if (list.size() > 1) {
                    name = (i19 + 1) + ". " + attribute.getName();
                } else {
                    name = attribute.getName();
                }
                String str5 = name;
                intercomTheme = IntercomTheme.INSTANCE;
                i13 = IntercomTheme.$stable;
                List<String> list7 = list4;
                Resources resources3 = resources;
                List<String> list8 = list3;
                float f13 = f11;
                aVar = aVar2;
                i14 = i19;
                TextKt.b(str5, layoutWeightElement2, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(interfaceC1084f3, i13).getType04(), interfaceC1084f, 0, 3120, 55292);
                interfaceC1084f.L(-86962638);
                if (i14 == 0) {
                    intercomTheme2 = intercomTheme;
                    i15 = i13;
                    z11 = true;
                    i16 = i12;
                } else if (list.size() > 1) {
                    androidx.compose.ui.h hVarJ4 = PaddingKt.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14);
                    StringBuilder sbE2 = A8.f.e(i12, "(", " / ");
                    sbE2.append(list.size());
                    sbE2.append(')');
                    String string3 = sbE2.toString();
                    intercomTheme2 = intercomTheme;
                    i15 = i13;
                    i16 = i12;
                    z11 = true;
                    TextKt.b(string3, hVarJ4, U.a.a(interfaceC1084f, R.color.intercom_attribute_input_hint), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(interfaceC1084f, i13).getType04(), interfaceC1084f, 48, 0, 65528);
                } else {
                    intercomTheme2 = intercomTheme;
                    i15 = i13;
                    i16 = i12;
                    z11 = true;
                }
                interfaceC1084f.D();
                interfaceC1084f.J();
                attributeData = new AttributeData(attribute, str3, z10);
                f10 = 12;
                hVarJ = PaddingKt.j(W.d(aVar, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13);
                renderType = attribute.getRenderType();
                switch (renderType.hashCode()) {
                    case -1034364087:
                        interfaceC1084f2 = interfaceC1084f;
                        if (renderType.equals("number")) {
                            interfaceC1084f2.L(672066800);
                            interfaceC1084f2.L(672076166);
                            x11 = x10;
                            zK = interfaceC1084f2.K(x11);
                            objF = interfaceC1084f.f();
                            if (zK) {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            } else {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            }
                            interfaceC1084f.D();
                            TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar18 = p293xa.r.f47939a;
                        } else {
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar19 = p293xa.r.f47939a;
                            x11 = x10;
                        }
                        break;
                    case 3322014:
                        interfaceC1084f2 = interfaceC1084f;
                        if (renderType.equals(AttributeType.LIST)) {
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar110 = p293xa.r.f47939a;
                        } else {
                            interfaceC1084f2.L(672092489);
                            if (str.length() > 0) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            ListAttributeCollectorKt.ListAttributeCollector(hVarJ, attributeData, z12, zContains, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar20 = p293xa.r.f47939a;
                        }
                        x11 = x10;
                        break;
                    case 3556653:
                        interfaceC1084f2 = interfaceC1084f;
                        if (renderType.equals(AttributeType.TEXT)) {
                            interfaceC1084f2.L(672066800);
                            interfaceC1084f2.L(672076166);
                            x11 = x10;
                            zK = interfaceC1084f2.K(x11);
                            objF = interfaceC1084f.f();
                            if (zK) {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            } else {
                                objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                    @Override // Ia.l
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                    }
                                };
                                interfaceC1084f2.E(objF);
                            }
                            interfaceC1084f.D();
                            TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar111 = p293xa.r.f47939a;
                        } else {
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar112 = p293xa.r.f47939a;
                            x11 = x10;
                        }
                        break;
                    case 64711720:
                        if (renderType.equals("boolean")) {
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar113 = p293xa.r.f47939a;
                        } else {
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(672079756);
                            if (str.length() > 0) {
                                z13 = z11;
                            } else {
                                z13 = false;
                            }
                            BooleanAttributeCollectorKt.BooleanAttributeCollector(hVarJ, attributeData, z13, zContains, lVar2, interfaceC1084f, 70, 0);
                            interfaceC1084f.D();
                            p293xa.r rVar21 = p293xa.r.f47939a;
                        }
                        x11 = x10;
                        break;
                    case 75849770:
                        if (!renderType.equals(AttributeType.WEBSITE)) {
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar114 = p293xa.r.f47939a;
                            x11 = x10;
                        }
                        interfaceC1084f2 = interfaceC1084f;
                        interfaceC1084f2.L(672066800);
                        interfaceC1084f2.L(672076166);
                        x11 = x10;
                        zK = interfaceC1084f2.K(x11);
                        objF = interfaceC1084f.f();
                        if (zK) {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        } else {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        }
                        interfaceC1084f.D();
                        TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                        interfaceC1084f.D();
                        p293xa.r rVar115 = p293xa.r.f47939a;
                        break;
                    case 96619420:
                        if (!renderType.equals("email")) {
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar116 = p293xa.r.f47939a;
                            x11 = x10;
                        }
                        interfaceC1084f2 = interfaceC1084f;
                        interfaceC1084f2.L(672066800);
                        interfaceC1084f2.L(672076166);
                        x11 = x10;
                        zK = interfaceC1084f2.K(x11);
                        objF = interfaceC1084f.f();
                        if (zK) {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        } else {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        }
                        interfaceC1084f.D();
                        TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                        interfaceC1084f.D();
                        p293xa.r rVar117 = p293xa.r.f47939a;
                        break;
                    case 97526364:
                        if (!renderType.equals(AttributeType.FLOAT)) {
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar118 = p293xa.r.f47939a;
                            x11 = x10;
                        }
                        interfaceC1084f2 = interfaceC1084f;
                        interfaceC1084f2.L(672066800);
                        interfaceC1084f2.L(672076166);
                        x11 = x10;
                        zK = interfaceC1084f2.K(x11);
                        objF = interfaceC1084f.f();
                        if (zK) {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        } else {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        }
                        interfaceC1084f.D();
                        TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                        interfaceC1084f.D();
                        p293xa.r rVar119 = p293xa.r.f47939a;
                        break;
                    case 106642798:
                        if (!renderType.equals(AttributeType.PHONE)) {
                            interfaceC1084f2 = interfaceC1084f;
                            interfaceC1084f2.L(-639614028);
                            interfaceC1084f.D();
                            p293xa.r rVar1110 = p293xa.r.f47939a;
                            x11 = x10;
                        }
                        interfaceC1084f2 = interfaceC1084f;
                        interfaceC1084f2.L(672066800);
                        interfaceC1084f2.L(672076166);
                        x11 = x10;
                        zK = interfaceC1084f2.K(x11);
                        objF = interfaceC1084f.f();
                        if (zK) {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        } else {
                            objF = new Ia.l() { // from class: io.intercom.android.sdk.views.compose.c
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$7$lambda$6(x11, (String) obj);
                                }
                            };
                            interfaceC1084f2.E(objF);
                        }
                        interfaceC1084f.D();
                        TextAttributeCollectorKt.TextAttributeCollector(hVarJ, attributeData, zContains, (Ia.l) objF, lVar2, interfaceC1084f, 70, 0);
                        interfaceC1084f.D();
                        p293xa.r rVar1111 = p293xa.r.f47939a;
                        break;
                    default:
                        interfaceC1084f2 = interfaceC1084f;
                        interfaceC1084f2.L(-639614028);
                        interfaceC1084f.D();
                        p293xa.r rVar1112 = p293xa.r.f47939a;
                        x11 = x10;
                        break;
                }
                interfaceC1084f2.L(672105265);
                if (invoke$lambda$10$lambda$9$lambda$3(x11).length() <= 0) {
                    androidx.compose.ui.h hVarJ5 = PaddingKt.j(W.d(aVar, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13);
                    strInvoke$lambda$10$lambda$9$lambda$3 = invoke$lambda$10$lambda$9$lambda$3(x11);
                    if (strInvoke$lambda$10$lambda$9$lambda$3.length() == 0) {
                        strInvoke$lambda$10$lambda$9$lambda$3 = str;
                    }
                    TextKt.b(strInvoke$lambda$10$lambda$9$lambda$3, hVarJ5, U.a.a(interfaceC1084f2, R.color.intercom_attribute_collector_error), 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, intercomTheme2.getTypography(interfaceC1084f2, i15).getType04(), interfaceC1084f, 48, 3120, 55288);
                }
                interfaceC1084f.D();
                interfaceC1084f.J();
                i19 = i14 + 1;
                interfaceC1084f3 = interfaceC1084f;
                str2 = str3;
                list4 = list7;
                aVar3 = aVar5;
                resources = resources3;
                lVar3 = lVar2;
                list2 = list;
                aVar2 = aVar;
                z14 = z10;
                i18 = i16;
                list3 = list8;
                f11 = f13;
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    public static final void AttributeCollectorCard(androidx.compose.ui.h hVar, final List<Attribute> attributes, List<String> list, List<String> list2, final String partId, boolean z10, Ia.l<? super AttributeData, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(attributes, "attributes");
        kotlin.jvm.internal.i.e(partId, "partId");
        C1086g c1086gP = interfaceC1084f.p(-136461083);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        List<String> list3 = (i11 & 4) != 0 ? EmptyList.f42983b : list;
        List<String> list4 = (i11 & 8) != 0 ? EmptyList.f42983b : list2;
        boolean z11 = (i11 & 32) != 0 ? false : z10;
        Ia.l<? super AttributeData, p293xa.r> rVar = (i11 & 64) != 0 ? new androidx.navigation.compose.r(2) : lVar;
        IntercomCardKt.IntercomCard(hVar2, IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.a.b(-1007698855, new AnonymousClass2(attributes, list3, ((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)).getResources(), list4, partId, z11, rVar), c1086gP), c1086gP, (i10 & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final List<String> list5 = list3;
            final List<String> list6 = list4;
            final boolean z12 = z11;
            final Ia.l<? super AttributeData, p293xa.r> lVar2 = rVar;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$1(hVar3, attributes, list5, list6, partId, z12, lVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AttributeCollectorCard$lambda$0(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AttributeCollectorCard$lambda$1(androidx.compose.ui.h hVar, List attributes, List list, List list2, String partId, boolean z10, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(attributes, "$attributes");
        kotlin.jvm.internal.i.e(partId, "$partId");
        AttributeCollectorCard(hVar, attributes, list, list2, partId, z10, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void BooleanAttributeCard(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-96019153);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m669getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BooleanAttributeCard$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BooleanAttributeCard(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void ListAttributeCard(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-100505407);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m671getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ListAttributeCard$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ListAttributeCard(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void MultipleAttributeCard(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(327354419);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m675getLambda8$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MultipleAttributeCard$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MultipleAttributeCard(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextAttributeCard(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1807263952);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m673getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttributeCard$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextAttributeCard(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
