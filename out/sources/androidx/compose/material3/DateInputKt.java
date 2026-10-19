package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.TextFieldValue;
import com.voltasit.obdeleven.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DateInputKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12129b = 16;

    static {
        float f10 = 24;
        f12128a = PaddingKt.b(f10, 10, f10, 0.0f, 8);
    }

    public static final void a(final Long l10, final Ia.l<? super Long, p293xa.r> lVar, final androidx.compose.material3.internal.k kVar, final Na.i iVar, final InterfaceC1065q interfaceC1065q, final Z z10, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(643325609);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(kVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(iVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (i10 & 32768) == 0 ? c1086gP.K(interfaceC1065q) : c1086gP.k(interfaceC1065q) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.K(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((i12 & 599187) == 599186 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Locale localeA = C1053h.a(c1086gP);
            boolean zK = c1086gP.K(localeA);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = kVar.b(localeA);
                c1086gP.E(objF);
            }
            androidx.compose.material3.internal.o oVar = (androidx.compose.material3.internal.o) objF;
            String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_date_input_invalid_for_pattern);
            String strG2 = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_date_input_invalid_year_range);
            String strG3 = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_date_input_invalid_not_allowed);
            boolean zK2 = c1086gP.K(oVar) | ((i12 & 57344) == 16384 || ((i12 & 32768) != 0 && c1086gP.K(interfaceC1065q)));
            Object objF2 = c1086gP.f();
            if (zK2 || objF2 == c0153a) {
                C1063o c1063o = new C1063o(iVar, z10, oVar, interfaceC1065q, strG, strG2, strG3);
                c1086gP.E(c1063o);
                objF2 = c1063o;
            }
            C1063o c1063o2 = (C1063o) objF2;
            final String upperCase = oVar.f12555a.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strG4 = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_date_input_label);
            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), f12128a);
            c1063o2.getClass();
            ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1819015125, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        String str = strG4;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        boolean zK3 = interfaceC1084f3.K(str) | interfaceC1084f3.K(upperCase);
                        final String str2 = strG4;
                        final String str3 = upperCase;
                        Object objF3 = interfaceC1084f3.f();
                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                            objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.g(str2 + ", " + str3, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        }
                        TextKt.b(str, androidx.compose.ui.semantics.p.b(aVar, false, (Ia.l) objF3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131068);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP);
            ComposableLambdaImpl composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-564233108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.b(upperCase, androidx.compose.ui.semantics.p.a(androidx.compose.ui.h.a.f13984b, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3.1
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                return p293xa.r.f47939a;
                            }
                        }), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131068);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP);
            int i13 = i12 << 3;
            b(hVarE, l10, lVar, kVar, composableLambdaImplB, composableLambdaImplB2, 0, c1063o2, oVar, localeA, c1064p, c1086gP, (i13 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 1794054 | (i13 & 896) | (i13 & 7168), (i12 >> 18) & 14);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DateInputKt.a(l10, lVar, kVar, iVar, interfaceC1065q, z10, c1064p, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final androidx.compose.ui.h hVar, final Long l10, final Ia.l<? super Long, p293xa.r> lVar, final androidx.compose.material3.internal.k kVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final int i10, final C1063o c1063o, final androidx.compose.material3.internal.o oVar, final Locale locale, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        int i14;
        C1086g c1086gP = interfaceC1084f.p(-857008589);
        if ((i11 & 6) == 0) {
            i13 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c1086gP.K(l10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c1086gP.k(kVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c1086gP.k(pVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c1086gP.k(pVar2) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c1086gP.h(i10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c1086gP.K(c1063o) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c1086gP.K(oVar) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c1086gP.k(locale) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c1086gP.K(c1064p) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            int i15 = i13;
            final androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<androidx.compose.runtime.X<String>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                @Override // Ia.a
                public final androidx.compose.runtime.X<String> invoke() {
                    return J0.f("");
                }
            }, c1086gP, 3072, 6);
            Object[] objArr = new Object[0];
            W.f fVar = TextFieldValue.f15490d;
            int i16 = 234881024 & i15;
            boolean zK = ((i15 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | c1086gP.k(kVar) | (i16 == 67108864) | c1086gP.k(locale);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = new Ia.a<androidx.compose.runtime.X<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
                    @Override // Ia.a
                    public final androidx.compose.runtime.X<TextFieldValue> invoke() {
                        String strA;
                        Long l11 = l10;
                        if (l11 != null) {
                            androidx.compose.material3.internal.k kVar2 = kVar;
                            androidx.compose.material3.internal.o oVar2 = oVar;
                            strA = kVar2.a(l11.longValue(), oVar2.f12557c, locale);
                            if (strA == null) {
                                strA = "";
                            }
                        } else {
                            strA = "";
                        }
                        return J0.f(new TextFieldValue(4, O.h.b(0, 0), strA));
                    }
                };
                c1086gP.E(objF);
            }
            final androidx.compose.runtime.X xB = androidx.compose.runtime.saveable.b.b(objArr, fVar, (Ia.a) objF, c1086gP, 0);
            TextFieldValue textFieldValue = (TextFieldValue) xB.getValue();
            boolean zK2 = (i16 == 67108864) | c1086gP.K(xB) | c1086gP.K(x10) | ((i15 & 896) == 256) | c1086gP.k(kVar) | ((29360128 & i15) == 8388608) | ((3670016 & i15) == 1048576) | c1086gP.k(locale);
            Object objF2 = c1086gP.f();
            if (zK2 || objF2 == c0153a) {
                Ia.l<TextFieldValue, p293xa.r> lVar2 = new Ia.l<TextFieldValue, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(TextFieldValue textFieldValue2) {
                        TextFieldValue textFieldValue3 = textFieldValue2;
                        if (textFieldValue3.f15491a.f15408c.length() <= oVar.f12557c.length()) {
                            C1260a c1260a = textFieldValue3.f15491a;
                            String str = c1260a.f15408c;
                            for (int i17 = 0; i17 < str.length(); i17++) {
                                if (Character.isDigit(str.charAt(i17))) {
                                }
                            }
                            androidx.compose.runtime.X<TextFieldValue> x11 = xB;
                            androidx.compose.foundation.layout.N n10 = DateInputKt.f12128a;
                            x11.setValue(textFieldValue3);
                            String string = kotlin.text.n.p0(c1260a.f15408c).toString();
                            String str2 = "";
                            Long lValueOf = null;
                            if (string.length() != 0 && string.length() >= oVar.f12557c.length()) {
                                androidx.compose.material3.internal.j jVarI = kVar.i(string, oVar.f12557c);
                                androidx.compose.runtime.X<String> x12 = x10;
                                C1063o c1063o2 = c1063o;
                                int i18 = i10;
                                if (jVarI == null) {
                                    String upperCase = c1063o2.f12658c.f12555a.toUpperCase(Locale.ROOT);
                                    kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                    str2 = String.format(c1063o2.f12660e, Arrays.copyOf(new Object[]{upperCase}, 1));
                                } else {
                                    Na.i iVar = c1063o2.f12656a;
                                    if (iVar.A(jVarI.f12542b)) {
                                        c1063o2.f12657b.getClass();
                                        if (i18 == 1) {
                                            Long l11 = c1063o2.f12662g;
                                            int i19 = (jVarI.f12545e > (l11 != null ? l11.longValue() : Long.MAX_VALUE) ? 1 : (jVarI.f12545e == (l11 != null ? l11.longValue() : Long.MAX_VALUE) ? 0 : -1));
                                        }
                                    } else {
                                        str2 = String.format(c1063o2.f12661f, Arrays.copyOf(new Object[]{C1054i.a(iVar.f4687b, 0, 7), C1054i.a(iVar.f4688c, 0, 7)}, 2));
                                    }
                                }
                                x12.setValue(str2);
                                Ia.l<Long, p293xa.r> lVar3 = lVar;
                                if (x10.getValue().length() == 0 && jVarI != null) {
                                    lValueOf = Long.valueOf(jVarI.f12545e);
                                }
                                lVar3.invoke(lValueOf);
                            } else {
                                x10.setValue("");
                                lVar.invoke(null);
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(lVar2);
                objF2 = lVar2;
            }
            Ia.l lVar3 = (Ia.l) objF2;
            androidx.compose.ui.h hVarJ = PaddingKt.j(hVar, 0.0f, 0.0f, 0.0f, !kotlin.text.n.S((CharSequence) x10.getValue()) ? 0 : f12129b, 7);
            boolean zK3 = c1086gP.K(x10);
            Object objF3 = c1086gP.f();
            if (zK3 || objF3 == c0153a) {
                objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        if (!kotlin.text.n.S(x10.getValue())) {
                            String value = x10.getValue();
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            wVar2.e(SemanticsProperties.f15144J, value);
                        }
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            OutlinedTextFieldKt.a(textFieldValue, lVar3, androidx.compose.ui.semantics.p.b(hVarJ, false, (Ia.l) objF3), false, false, null, pVar, pVar2, null, null, null, null, androidx.compose.runtime.internal.a.b(-591991974, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else if (!kotlin.text.n.S(x10.getValue())) {
                        TextKt.b(x10.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), !kotlin.text.n.S((CharSequence) x10.getValue()), new C1069v(oVar), new androidx.compose.foundation.text.k(Boolean.FALSE, 3, 7, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarStyle), null, true, 0, 0, null, null, c1064p.f12687y, c1086gP, (i15 << 6) & 33030144, 12779904, 0, 4001592);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DateInputKt.b(hVar, l10, lVar, kVar, pVar, pVar2, i10, c1063o, oVar, locale, c1064p, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
