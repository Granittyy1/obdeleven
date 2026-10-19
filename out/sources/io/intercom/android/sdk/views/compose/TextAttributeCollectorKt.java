package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
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
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.s;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2274d;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.components.P;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.AttributeCollectorValidatorKt;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;

/* JADX INFO: compiled from: TextAttributeCollector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextAttributeCollectorKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$TextAttributeCollector$6, reason: invalid class name */
    /* JADX INFO: compiled from: TextAttributeCollector.kt */
    public static final class AnonymousClass6 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ boolean $disabled;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Ia.l<AttributeData, p293xa.r> $onSubmitAttribute;
        final /* synthetic */ Ia.l<String, p293xa.r> $onValidationError;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ p270w.a $shape;
        final /* synthetic */ boolean $submitted;
        final /* synthetic */ X<String> $value$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(boolean z10, boolean z11, boolean z12, p270w.a aVar, Ia.l<? super String, p293xa.r> lVar, Resources resources, AttributeData attributeData, Ia.l<? super AttributeData, p293xa.r> lVar2, X<String> x10) {
            this.$disabled = z10;
            this.$submitted = z11;
            this.$loading = z12;
            this.$shape = aVar;
            this.$onValidationError = lVar;
            this.$resources = resources;
            this.$attributeData = attributeData;
            this.$onSubmitAttribute = lVar2;
            this.$value$delegate = x10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$0(Ia.l lVar, Resources resources, AttributeData attributeData, Ia.l lVar2, X value$delegate) {
            kotlin.jvm.internal.i.e(attributeData, "$attributeData");
            kotlin.jvm.internal.i.e(value$delegate, "$value$delegate");
            String string = kotlin.text.n.p0(TextAttributeCollectorKt.TextAttributeCollector$lambda$3(value$delegate)).toString();
            if (string.length() == 0) {
                String string2 = resources.getString(R.string.intercom_string_is_incorrect);
                kotlin.jvm.internal.i.d(string2, "getString(...)");
                lVar.invoke(string2);
            } else {
                Attribute attribute = attributeData.getAttribute();
                int iValidateAttribute = AttributeValidatorUtils.validateAttribute(string, attribute.getRenderType());
                if (iValidateAttribute == 0) {
                    lVar.invoke("");
                    lVar2.invoke(AttributeData.copy$default(attributeData, attribute.copy((127 & 1) != 0 ? attribute.identifier : null, (127 & 2) != 0 ? attribute.name : null, (127 & 4) != 0 ? attribute.type : null, (127 & 8) != 0 ? attribute.submitted : false, (127 & 16) != 0 ? attribute.customBotControlId : null, (127 & 32) != 0 ? attribute.options : null, (127 & 64) != 0 ? attribute.multiline : null, (127 & 128) != 0 ? attribute.value : string), null, false, 6, null));
                } else {
                    kotlin.jvm.internal.i.b(resources);
                    lVar.invoke(AttributeCollectorValidatorKt.getErrorStringFromCode(resources, iValidateAttribute));
                }
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            boolean z10 = this.$disabled;
            boolean z11 = this.$submitted;
            boolean z12 = this.$loading;
            p270w.a aVar = this.$shape;
            final Ia.l<String, p293xa.r> lVar = this.$onValidationError;
            final Resources resources = this.$resources;
            final AttributeData attributeData = this.$attributeData;
            final Ia.l<AttributeData, p293xa.r> lVar2 = this.$onSubmitAttribute;
            final X<String> x10 = this.$value$delegate;
            TextAttributeCollectorKt.TextAttributeTrailingComponent(z10, z11, z12, aVar, new Ia.a() { // from class: io.intercom.android.sdk.views.compose.r
                @Override // Ia.a
                public final Object invoke() {
                    return TextAttributeCollectorKt.AnonymousClass6.invoke$lambda$0(lVar, resources, attributeData, lVar2, x10);
                }
            }, interfaceC1084f, 0);
        }
    }

    public static final void DisabledTextAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1615951967);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m703getLambda8$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r DisabledTextAttributePreview$lambda$15(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DisabledTextAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void EmptyTextAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(990171980);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m699getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EmptyTextAttributePreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyTextAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void FilledTextAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1421911931);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m697getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FilledTextAttributePreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FilledTextAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void PhoneAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2075517560);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m696getLambda12$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PhoneAttributePreview$lambda$17(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PhoneAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedAndDisabledTextAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1140989915);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m694getLambda10$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedAndDisabledTextAttributePreview$lambda$16(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedAndDisabledTextAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedTextAttributePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(914016734);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m701getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedTextAttributePreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedTextAttributePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void TextAttributeCollector(androidx.compose.ui.h hVar, final AttributeData attributeData, boolean z10, Ia.l<? super String, p293xa.r> lVar, Ia.l<? super AttributeData, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        CountryAreaCode countryAreaCodeFromLocale;
        androidx.compose.ui.h hVarE;
        int i12 = 2;
        kotlin.jvm.internal.i.e(attributeData, "attributeData");
        C1086g c1086gP = interfaceC1084f.p(-1938202913);
        int i13 = 1;
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        int i14 = 0;
        boolean z11 = (i11 & 4) != 0 ? false : z10;
        Ia.l<? super String, p293xa.r> pVar = (i11 & 8) != 0 ? new p() : lVar;
        Ia.l<? super AttributeData, p293xa.r> rVar = (i11 & 16) != 0 ? new androidx.navigation.compose.r(3) : lVar2;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        Resources resources = context.getResources();
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        p270w.a aVar = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
        if (isPhoneType(attributeData)) {
            PhoneNumberValidator.loadCountryAreaCodes(context);
            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
        } else {
            countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
        }
        final CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
        boolean zIsFormDisabled = attributeData.isFormDisabled();
        boolean submitted = attributeData.getAttribute().getSubmitted();
        boolean zA = kotlin.jvm.internal.i.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
        final X x10 = (X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new R9.b(i12, attributeData), c1086gP, 8, 6);
        final X x11 = (X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new io.intercom.android.sdk.survey.ui.questiontype.files.q(attributeData, i13, countryAreaCode), c1086gP, 8, 6);
        if (zA) {
            IntrinsicSize intrinsicSize = IntrinsicSize.f10155b;
            hVarE = G.a(hVar2);
        } else {
            hVarE = W.e(hVar2, 40);
        }
        androidx.compose.ui.h hVar3 = hVarE;
        String strTextAttributeCollector$lambda$3 = TextAttributeCollector$lambda$3(x10);
        boolean z12 = !zIsFormDisabled;
        androidx.compose.foundation.text.k kVar = new androidx.compose.foundation.text.k(null, getKeyboardType(attributeData), i14, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMinor);
        boolean z13 = !zA;
        int i15 = zA ? 2 : 1;
        c1086gP.L(1971829893);
        ComposableLambdaImpl composableLambdaImplB = isPhoneType(attributeData) ? androidx.compose.runtime.internal.a.b(-1255348801, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i16) {
                if ((i16 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                String strTextAttributeCollector$lambda$6 = TextAttributeCollectorKt.TextAttributeCollector$lambda$6(x11);
                kotlin.jvm.internal.i.d(strTextAttributeCollector$lambda$6, "access$TextAttributeCollector$lambda$6(...)");
                TextKt.b(strTextAttributeCollector$lambda$6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
            }
        }, c1086gP) : null;
        c1086gP.T(false);
        final androidx.compose.ui.h hVar4 = hVar2;
        IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$3, new Ia.l() { // from class: io.intercom.android.sdk.views.compose.q
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$8(attributeData, x10, x11, (String) obj);
            }
        }, hVar3, z12, submitted, null, null, androidx.compose.runtime.internal.a.b(-1290485581, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i16) {
                if ((i16 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                AttributeData attributeData2 = attributeData;
                CountryAreaCode countryAreaCode2 = countryAreaCode;
                kotlin.jvm.internal.i.b(countryAreaCode2);
                TextKt.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode2), null, IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m636getHintText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
            }
        }, c1086gP), composableLambdaImplB, androidx.compose.runtime.internal.a.b(930248561, new AnonymousClass6(zIsFormDisabled, submitted, z11, aVar, pVar, resources, attributeData, rVar, x10), c1086gP), false, null, kVar, null, z13, 3, i15, null, aVar, null, null, c1086gP, 817889280, 196608, 0, 1715296);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z14 = z11;
            final Ia.l<? super String, p293xa.r> lVar3 = pVar;
            final Ia.l<? super AttributeData, p293xa.r> lVar4 = rVar;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.n
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextAttributeCollectorKt.TextAttributeCollector$lambda$9(hVar4, attributeData, z14, lVar3, lVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttributeCollector$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttributeCollector$lambda$1(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X TextAttributeCollector$lambda$2(AttributeData attributeData) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = "";
        }
        return J0.f(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$3(X<String> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X TextAttributeCollector$lambda$5(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        return J0.f(isPhoneType(attributeData) ? countryAreaCode.getEmoji() : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$6(X<String> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttributeCollector$lambda$8(AttributeData attributeData, X value$delegate, X countryFlag$delegate, String it) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        kotlin.jvm.internal.i.e(value$delegate, "$value$delegate");
        kotlin.jvm.internal.i.e(countryFlag$delegate, "$countryFlag$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        value$delegate.setValue(it);
        if (isPhoneType(attributeData)) {
            countryFlag$delegate.setValue(getCountryAreaCodeFromText(it).getEmoji());
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttributeCollector$lambda$9(androidx.compose.ui.h hVar, AttributeData attributeData, boolean z10, Ia.l lVar, Ia.l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(attributeData, "$attributeData");
        TextAttributeCollector(hVar, attributeData, z10, lVar, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextAttributeTrailingComponent(final boolean z10, final boolean z11, final boolean z12, final p270w.a aVar, final Ia.a<p293xa.r> aVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        long jM615getAction0d7_KjU;
        long jM639getOnAction0d7_KjU;
        C1086g c1086gP = interfaceC1084f.p(1872215775);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.c(z11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z12) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.K(aVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c1086gP.k(aVar2) ? 16384 : 8192;
        }
        if ((i11 & 46811) == 9362 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (z11) {
                c1086gP.L(803987533);
                c1086gP.T(false);
                jM615getAction0d7_KjU = H.f13503k;
            } else if (z10) {
                c1086gP.L(803989226);
                jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m631getDisabled0d7_KjU();
                c1086gP.T(false);
            } else {
                c1086gP.L(803990696);
                jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m615getAction0d7_KjU();
                c1086gP.T(false);
            }
            long j = jM615getAction0d7_KjU;
            androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
            float f10 = 0;
            androidx.compose.ui.h hVarC = ClickableKt.c(W.q(W.c(C0932d.b(A8.p.r(PaddingKt.j(aVar3, 8, 0.0f, 0.0f, 0.0f, 14), p270w.a.b(aVar, new p270w.d(f10), null, null, new p270w.d(f10), 6)), j, h0.f13629a), 1.0f), 40), (z11 || z12 || z10) ? false : true, null, aVar2, 6);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            if (z11) {
                c1086gP.L(1118235440);
                IconKt.a(U.c.a(R.drawable.intercom_attribute_verified_tick, c1086gP, 0), null, null, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m617getActive0d7_KjU(), c1086gP, 56, 4);
                c1086gP.T(false);
            } else if (z12) {
                c1086gP.L(305789581);
                ProgressIndicatorKt.a(W.m(aVar3, 20), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m639getOnAction0d7_KjU(), 3, 0L, 0, 390, c1086gP, 24);
                c1086gP.T(false);
            } else {
                c1086gP.L(1118249365);
                Painter painterA = U.c.a(R.drawable.intercom_chevron, c1086gP, 0);
                if (z10) {
                    c1086gP.L(1118255019);
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m641getOnDisabled0d7_KjU();
                } else {
                    c1086gP.L(1118256201);
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m639getOnAction0d7_KjU();
                }
                c1086gP.T(false);
                IconKt.a(painterA, null, null, jM639getOnAction0d7_KjU, c1086gP, 56, 4);
                c1086gP.T(false);
            }
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.o
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextAttributeCollectorKt.TextAttributeTrailingComponent$lambda$11(z10, z11, z12, aVar, aVar2, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextAttributeTrailingComponent$lambda$11(boolean z10, boolean z11, boolean z12, p270w.a shape, Ia.a onClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(shape, "$shape");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        TextAttributeTrailingComponent(z10, z11, z12, shape, onClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final CountryAreaCode getCountryAreaCodeFromText(String str) {
        CountryAreaCode countryAreaCodeFromNumber = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(PhoneNumberValidator.normalizeNumber(str)));
        kotlin.jvm.internal.i.d(countryAreaCodeFromNumber, "getCountryAreaCodeFromNumber(...)");
        return countryAreaCodeFromNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHint(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        String str;
        String renderType = attributeData.getAttribute().getRenderType();
        if (kotlin.jvm.internal.i.a(renderType, "email")) {
            return "email@domain.com";
        }
        if (!kotlin.jvm.internal.i.a(renderType, AttributeType.PHONE)) {
            return "";
        }
        if (kotlin.jvm.internal.i.a(countryAreaCode, CountryAreaCode.UNKNOWN)) {
            str = "+1";
        } else {
            str = "+" + countryAreaCode.getDialCode();
        }
        return s.b(str, " 123 456 7890");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0039 A[RETURN, SYNTHETIC] */
    private static final int getKeyboardType(AttributeData attributeData) {
        switch (attributeData.getAttribute().getRenderType()) {
            case "number":
                return 3;
            case "email":
                return 6;
            case "float":
                return 9;
            case "phone":
                return 4;
            default:
                return 1;
        }
    }

    private static final boolean isPhoneType(AttributeData attributeData) {
        return kotlin.jvm.internal.i.a(attributeData.getAttribute().getRenderType(), AttributeType.PHONE);
    }
}
