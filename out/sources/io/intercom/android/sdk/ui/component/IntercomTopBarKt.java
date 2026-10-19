package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.m5.components.C2269a0;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.O;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IntercomTopBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomTopBarKt {
    /* JADX WARN: Code duplicated, block: B:105:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x014b  */
    /* JADX WARN: Code duplicated, block: B:109:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:122:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0187  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:142:0x021f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0221  */
    /* JADX WARN: Code duplicated, block: B:146:0x0228  */
    /* JADX WARN: Code duplicated, block: B:148:0x022c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0259  */
    /* JADX WARN: Code duplicated, block: B:152:0x025d  */
    /* JADX WARN: Code duplicated, block: B:155:0x026a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0278  */
    /* JADX WARN: Code duplicated, block: B:160:0x0284  */
    /* JADX WARN: Code duplicated, block: B:163:0x0292  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0301  */
    /* JADX WARN: Code duplicated, block: B:176:0x035e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0373  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:191:0x0404  */
    /* JADX WARN: Code duplicated, block: B:194:0x0421  */
    /* JADX WARN: Code duplicated, block: B:198:0x0447  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: IntercomTopBar-bogVsAg, reason: not valid java name */
    public static final void m542IntercomTopBarbogVsAg(androidx.compose.ui.h hVar, String str, IntercomTopBarIcon intercomTopBarIcon, androidx.compose.ui.d.b bVar, long j, long j10, Ia.a<p293xa.r> aVar, Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        final IntercomTopBarIcon intercomTopBarIcon2;
        int i14;
        int i15;
        androidx.compose.ui.d.b bVar2;
        int i16;
        long jM635getHeader0d7_KjU;
        int i17;
        Ia.a<p293xa.r> aVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.compose.ui.f.a aVar3;
        androidx.compose.ui.h.a aVar4;
        androidx.compose.ui.h hVar2;
        String str2;
        androidx.compose.ui.d.b bVar3;
        long jM642getOnHeader0d7_KjU;
        final Ia.a<p293xa.r> nVar;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2;
        long j11;
        int i22;
        Ia.a<ComposeUiNode> aVar5;
        Ia.p<ComposeUiNode, E, p293xa.r> pVar;
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        String str3;
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4;
        boolean z10;
        Object objF;
        int i23;
        C0949i c0949i;
        int i24;
        float f10;
        int i25;
        int i26;
        Ia.a<ComposeUiNode> aVar6;
        boolean z11;
        long j12;
        boolean z12;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar4;
        ?? r10;
        final long j13;
        final String str4;
        final androidx.compose.ui.h hVar3;
        final long j14;
        final androidx.compose.ui.d.b bVar4;
        final Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar5;
        final IntercomTopBarIcon intercomTopBarIcon3;
        int i27;
        C1105p0 c1105p0V;
        int i28;
        int i29;
        C1086g c1086gP = interfaceC1084f.p(832461575);
        int i30 = i11 & 1;
        if (i30 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i31 = i11 & 2;
        if (i31 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.K(str) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    intercomTopBarIcon2 = intercomTopBarIcon;
                    if (c1086gP.K(intercomTopBarIcon2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        bVar2 = bVar;
                        if (c1086gP.K(bVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        jM635getHeader0d7_KjU = j;
                        if ((i11 & 16) == 0 || !c1086gP.i(jM635getHeader0d7_KjU)) {
                            i29 = 8192;
                        } else {
                            i29 = 16384;
                        }
                        i12 |= i29;
                    } else {
                        jM635getHeader0d7_KjU = j;
                    }
                    if ((458752 & i10) != 0) {
                        if ((i11 & 32) == 0 || !c1086gP.i(j10)) {
                            i28 = 65536;
                        } else {
                            i28 = 131072;
                        }
                        i12 |= i28;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar;
                        if ((i10 & 3670016) == 0) {
                            if (c1086gP.k(aVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        if ((29360128 & i10) == 0) {
                            if (c1086gP.k(qVar)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 23967451) == 4793490 || !c1086gP.s()) {
                            c1086gP.r0();
                            i21 = i10 & 1;
                            aVar3 = androidx.compose.ui.d.a.f13346m;
                            aVar4 = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0 || c1086gP.a0()) {
                                if (i30 != 0) {
                                    hVar2 = aVar4;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    str2 = null;
                                } else {
                                    str2 = str;
                                }
                                if (i13 != 0) {
                                    intercomTopBarIcon2 = null;
                                }
                                if (i15 != 0) {
                                    bVar3 = aVar3;
                                } else {
                                    bVar3 = bVar;
                                }
                                if ((i11 & 16) != 0) {
                                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                    i12 &= -458753;
                                } else {
                                    jM642getOnHeader0d7_KjU = j10;
                                }
                                if (i17 != 0) {
                                    nVar = new n();
                                } else {
                                    nVar = aVar;
                                }
                                if (i19 != 0) {
                                    j11 = jM642getOnHeader0d7_KjU;
                                    qVar2 = null;
                                } else {
                                    qVar2 = qVar;
                                    j11 = jM642getOnHeader0d7_KjU;
                                }
                            } else {
                                c1086gP.w();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                hVar2 = hVar;
                                str2 = str;
                                bVar3 = bVar;
                                j11 = j10;
                                nVar = aVar;
                                qVar2 = qVar;
                            }
                            c1086gP.U();
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                            i22 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar4);
                            ComposeUiNode.f14331c0.getClass();
                            aVar5 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            pVar = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar, c1086gP, c0953mA);
                            pVar2 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar2, c1086gP, interfaceC1089h0P);
                            pVar3 = ComposeUiNode.Companion.f14338g;
                            qVar3 = qVar2;
                            if (c1086gP.f12995O) {
                                str3 = str2;
                            } else {
                                str3 = str2;
                                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                                }
                                pVar4 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar4, c1086gP, hVarC);
                                androidx.compose.ui.h hVar4 = hVar2;
                                androidx.compose.ui.h hVarH = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                                c1086gP.L(86796077);
                                if ((i12 & 3670016) == 1048576) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                objF = c1086gP.f();
                                if (z10 || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                        @Override // Ia.a
                                        public final Object invoke() {
                                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                long j15 = jM635getHeader0d7_KjU;
                                androidx.compose.ui.h hVarC2 = ClickableKt.c(hVarH, false, null, (Ia.a) objF, 7);
                                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i23 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarC2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar5);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, eD);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P2);
                                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i23))) {
                                    J4.i.d(i23, c1086gP, i23, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC3);
                                c0949i = C0949i.f10304a;
                                if (intercomTopBarIcon2 != null || kotlin.jvm.internal.i.a(bVar3, androidx.compose.ui.d.a.f13347n)) {
                                    i24 = 16;
                                    f10 = 16;
                                } else {
                                    i24 = 16;
                                    f10 = 48 + 16;
                                }
                                androidx.compose.ui.h hVarJ = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                                i25 = i12 >> 3;
                                C0953m c0953mA2 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                i26 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarJ);
                                c1086gP.r();
                                androidx.compose.ui.d.b bVar5 = bVar3;
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar5);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, c0953mA2);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P3);
                                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                                    J4.i.d(i26, c1086gP, i26, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC4);
                                c1086gP.L(560412879);
                                if (str3 != null) {
                                    z11 = false;
                                    aVar6 = aVar5;
                                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                                } else {
                                    aVar6 = aVar5;
                                    z11 = false;
                                }
                                c1086gP.T(z11);
                                c1086gP.T(true);
                                c1086gP.L(-1319827237);
                                if (intercomTopBarIcon2 != null) {
                                    final long j16 = j11;
                                    j12 = j16;
                                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                        @Override // Ia.p
                                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                            invoke(interfaceC1084f2, num.intValue());
                                            return p293xa.r.f47939a;
                                        }

                                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                                interfaceC1084f2.w();
                                            } else {
                                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j16, interfaceC1084f2, 392, 0);
                                            }
                                        }
                                    }, c1086gP), c1086gP, 196608, 28);
                                    z12 = false;
                                } else {
                                    j12 = j11;
                                    z12 = z11;
                                }
                                c1086gP.T(z12);
                                c1086gP.L(-1319809649);
                                if (qVar3 != null) {
                                    androidx.compose.ui.h hVarF = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                    T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                    i27 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarF);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar6);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar, c1086gP, tA);
                                    R0.a(pVar2, c1086gP, interfaceC1089h0P4);
                                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i27))) {
                                        J4.i.d(i27, c1086gP, i27, pVar3);
                                    }
                                    R0.a(pVar4, c1086gP, hVarC5);
                                    qVar4 = qVar3;
                                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                    r10 = 1;
                                    c1086gP.T(true);
                                } else {
                                    qVar4 = qVar3;
                                    r10 = 1;
                                }
                                c1086gP.T(false);
                                c1086gP.T(r10);
                                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                                c1086gP.T(r10);
                                j13 = j12;
                                str4 = str3;
                                hVar3 = hVar4;
                                j14 = j15;
                                bVar4 = bVar5;
                                IntercomTopBarIcon intercomTopBarIcon4 = intercomTopBarIcon2;
                                qVar5 = qVar4;
                                intercomTopBarIcon3 = intercomTopBarIcon4;
                            }
                            J4.i.d(i22, c1086gP, i22, pVar3);
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC);
                            androidx.compose.ui.h hVar5 = hVar2;
                            androidx.compose.ui.h hVarH2 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j17 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC6 = ClickableKt.c(hVarH2, false, null, (Ia.a) objF, 7);
                            E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarC6);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD2);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P5);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC7);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ2 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA3 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarJ2);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar6 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA3);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P6);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC8);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j18 = j11;
                                j12 = j18;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j18, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF2 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                                androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarF2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA2);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P7);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC9);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar5;
                            j14 = j17;
                            bVar4 = bVar6;
                            IntercomTopBarIcon intercomTopBarIcon5 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon5;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            str4 = str;
                            j14 = jM635getHeader0d7_KjU;
                            intercomTopBarIcon3 = intercomTopBarIcon2;
                            bVar4 = bVar2;
                            nVar = aVar2;
                            j13 = j10;
                            qVar5 = qVar;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i12 |= 12582912;
                    if ((i12 & 23967451) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA4 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA4);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P8);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC10);
                            androidx.compose.ui.h hVar6 = hVar2;
                            androidx.compose.ui.h hVarH3 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j19 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC11 = ClickableKt.c(hVarH3, false, null, (Ia.a) objF, 7);
                            E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                            androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarC11);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD3);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P9);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC12);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ3 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA5 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                            androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarJ3);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar7 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA5);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P10);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC13);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j110 = j11;
                                j12 = j110;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j110, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF3 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA3 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarF3);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA3);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P11);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC14);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar6;
                            j14 = j19;
                            bVar4 = bVar7;
                            IntercomTopBarIcon intercomTopBarIcon6 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon6;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC10);
                        androidx.compose.ui.h hVar7 = hVar2;
                        androidx.compose.ui.h hVarH4 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC15 = ClickableKt.c(hVarH4, false, null, (Ia.a) objF, 7);
                        E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarC15);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD4);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P12);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC16);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ4 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA6 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                        androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVarJ4);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar8 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA6);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P13);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC17);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j112 = j11;
                            j12 = j112;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j112, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF4 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA4 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                            androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarF4);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA4);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P14);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC18);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar7;
                        j14 = j111;
                        bVar4 = bVar8;
                        IntercomTopBarIcon intercomTopBarIcon7 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon7;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA7 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                        androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA7);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P15);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC19);
                            androidx.compose.ui.h hVar8 = hVar2;
                            androidx.compose.ui.h hVarH5 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j113 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC110 = ClickableKt.c(hVarH5, false, null, (Ia.a) objF, 7);
                            E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                            androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVarC110);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD5);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P16);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ5 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA8 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                            androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarJ5);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar9 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA8);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P17);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC112);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j114 = j11;
                                j12 = j114;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j114, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF5 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA5 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVarF5);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA5);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P18);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC113);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar8;
                            j14 = j113;
                            bVar4 = bVar9;
                            IntercomTopBarIcon intercomTopBarIcon8 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon8;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC19);
                        androidx.compose.ui.h hVar9 = hVar2;
                        androidx.compose.ui.h hVarH6 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j115 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC114 = ClickableKt.c(hVarH6, false, null, (Ia.a) objF, 7);
                        E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                        androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarC114);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD6);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P19);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC115);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ6 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA9 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                        androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarJ6);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar10 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA9);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC116);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j116 = j11;
                            j12 = j116;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j116, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF6 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA6 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                            androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, hVarF6);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA6);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC117);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar9;
                        j14 = j115;
                        bVar4 = bVar10;
                        IntercomTopBarIcon intercomTopBarIcon9 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon9;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 3072;
                bVar2 = bVar;
                if ((57344 & i10) == 0) {
                    jM635getHeader0d7_KjU = j;
                    if ((i11 & 16) == 0) {
                        i29 = 8192;
                    } else {
                        i29 = 8192;
                    }
                    i12 |= i29;
                } else {
                    jM635getHeader0d7_KjU = j;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i12 |= i28;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.k(aVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((29360128 & i10) == 0) {
                        if (c1086gP.k(qVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA10 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                        androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA10);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P112);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC118);
                            androidx.compose.ui.h hVar10 = hVar2;
                            androidx.compose.ui.h hVarH7 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j117 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC119 = ClickableKt.c(hVarH7, false, null, (Ia.a) objF, 7);
                            E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                            androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarC119);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD7);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P113);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1110);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ7 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA11 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, hVarJ7);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar11 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA11);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P114);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j118 = j11;
                                j12 = j118;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j118, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF7 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA7 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                                androidx.compose.ui.h hVarC1112 = ComposedModifierKt.c(c1086gP, hVarF7);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA7);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P115);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC1112);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar10;
                            j14 = j117;
                            bVar4 = bVar11;
                            IntercomTopBarIcon intercomTopBarIcon10 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon10;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC118);
                        androidx.compose.ui.h hVar11 = hVar2;
                        androidx.compose.ui.h hVarH8 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j119 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1113 = ClickableKt.c(hVarH8, false, null, (Ia.a) objF, 7);
                        E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                        androidx.compose.ui.h hVarC1114 = ComposedModifierKt.c(c1086gP, hVarC1113);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD8);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1114);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ8 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA12 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                        androidx.compose.ui.h hVarC1115 = ComposedModifierKt.c(c1086gP, hVarJ8);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar12 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA12);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1115);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1110 = j11;
                            j12 = j1110;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1110, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF8 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA8 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                            androidx.compose.ui.h hVarC1116 = ComposedModifierKt.c(c1086gP, hVarF8);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA8);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P118);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1116);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar11;
                        j14 = j119;
                        bVar4 = bVar12;
                        IntercomTopBarIcon intercomTopBarIcon11 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon11;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA13 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                        androidx.compose.ui.h hVarC1117 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA13);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P119);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC1117);
                            androidx.compose.ui.h hVar12 = hVar2;
                            androidx.compose.ui.h hVarH9 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j1111 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC1118 = ClickableKt.c(hVarH9, false, null, (Ia.a) objF, 7);
                            E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
                            androidx.compose.ui.h hVarC1119 = ComposedModifierKt.c(c1086gP, hVarC1118);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD9);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1110);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1119);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ9 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA14 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
                            androidx.compose.ui.h hVarC11110 = ComposedModifierKt.c(c1086gP, hVarJ9);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar13 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA14);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1111);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11110);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j1112 = j11;
                                j12 = j1112;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1112, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF9 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA9 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P1112 = c1086gP.P();
                                androidx.compose.ui.h hVarC11111 = ComposedModifierKt.c(c1086gP, hVarF9);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA9);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P1112);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC11111);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar12;
                            j14 = j1111;
                            bVar4 = bVar13;
                            IntercomTopBarIcon intercomTopBarIcon12 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon12;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC1117);
                        androidx.compose.ui.h hVar13 = hVar2;
                        androidx.compose.ui.h hVarH10 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j1113 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC11112 = ClickableKt.c(hVarH10, false, null, (Ia.a) objF, 7);
                        E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1113 = c1086gP.P();
                        androidx.compose.ui.h hVarC11113 = ComposedModifierKt.c(c1086gP, hVarC11112);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD10);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11113);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ10 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA15 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1114 = c1086gP.P();
                        androidx.compose.ui.h hVarC11114 = ComposedModifierKt.c(c1086gP, hVarJ10);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar14 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA15);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1114);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11114);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1114 = j11;
                            j12 = j1114;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1114, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF10 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA10 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1115 = c1086gP.P();
                            androidx.compose.ui.h hVarC11115 = ComposedModifierKt.c(c1086gP, hVarF10);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA10);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1115);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11115);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar13;
                        j14 = j1113;
                        bVar4 = bVar14;
                        IntercomTopBarIcon intercomTopBarIcon13 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((i12 & 23967451) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA16 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1116 = c1086gP.P();
                    androidx.compose.ui.h hVarC11116 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA16);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1116);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC11116);
                        androidx.compose.ui.h hVar14 = hVar2;
                        androidx.compose.ui.h hVarH11 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j1115 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC11117 = ClickableKt.c(hVarH11, false, null, (Ia.a) objF, 7);
                        E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1117 = c1086gP.P();
                        androidx.compose.ui.h hVarC11118 = ComposedModifierKt.c(c1086gP, hVarC11117);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD11);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11118);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ11 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA17 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1118 = c1086gP.P();
                        androidx.compose.ui.h hVarC11119 = ComposedModifierKt.c(c1086gP, hVarJ11);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar15 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA17);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11119);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1116 = j11;
                            j12 = j1116;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1116, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF11 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA11 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1119 = c1086gP.P();
                            androidx.compose.ui.h hVarC111110 = ComposedModifierKt.c(c1086gP, hVarF11);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA11);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1119);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111110);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar14;
                        j14 = j1115;
                        bVar4 = bVar15;
                        IntercomTopBarIcon intercomTopBarIcon14 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon14;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11116);
                    androidx.compose.ui.h hVar15 = hVar2;
                    androidx.compose.ui.h hVarH12 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1117 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111 = ClickableKt.c(hVarH12, false, null, (Ia.a) objF, 7);
                    E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11110 = c1086gP.P();
                    androidx.compose.ui.h hVarC111112 = ComposedModifierKt.c(c1086gP, hVarC111111);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD12);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11110);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111112);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ12 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA18 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111 = c1086gP.P();
                    androidx.compose.ui.h hVarC111113 = ComposedModifierKt.c(c1086gP, hVarJ12);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar16 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA18);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111113);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1118 = j11;
                        j12 = j1118;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1118, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF12 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA12 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11112 = c1086gP.P();
                        androidx.compose.ui.h hVarC111114 = ComposedModifierKt.c(c1086gP, hVarF12);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA12);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111114);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar15;
                    j14 = j1117;
                    bVar4 = bVar16;
                    IntercomTopBarIcon intercomTopBarIcon15 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon15;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA19 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11113 = c1086gP.P();
                    androidx.compose.ui.h hVarC111115 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA19);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11113);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC111115);
                        androidx.compose.ui.h hVar16 = hVar2;
                        androidx.compose.ui.h hVarH13 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j1119 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC111116 = ClickableKt.c(hVarH13, false, null, (Ia.a) objF, 7);
                        E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11114 = c1086gP.P();
                        androidx.compose.ui.h hVarC111117 = ComposedModifierKt.c(c1086gP, hVarC111116);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD13);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11114);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111117);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ13 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA110 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11115 = c1086gP.P();
                        androidx.compose.ui.h hVarC111118 = ComposedModifierKt.c(c1086gP, hVarJ13);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar17 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA110);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11115);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111118);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j11110 = j11;
                            j12 = j11110;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11110, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF13 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA13 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11116 = c1086gP.P();
                            androidx.compose.ui.h hVarC111119 = ComposedModifierKt.c(c1086gP, hVarF13);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA13);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11116);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111119);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar16;
                        j14 = j1119;
                        bVar4 = bVar17;
                        IntercomTopBarIcon intercomTopBarIcon16 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon16;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC111115);
                    androidx.compose.ui.h hVar17 = hVar2;
                    androidx.compose.ui.h hVarH14 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j11111 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111110 = ClickableKt.c(hVarH14, false, null, (Ia.a) objF, 7);
                    E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11117 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111 = ComposedModifierKt.c(c1086gP, hVarC1111110);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD14);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ14 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA111 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11118 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111112 = ComposedModifierKt.c(c1086gP, hVarJ14);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar18 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA111);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111112);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j11112 = j11;
                        j12 = j11112;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11112, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF14 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA14 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11119 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111113 = ComposedModifierKt.c(c1086gP, hVarF14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA14);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11119);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111113);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar17;
                    j14 = j11111;
                    bVar4 = bVar18;
                    IntercomTopBarIcon intercomTopBarIcon17 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon17;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            intercomTopBarIcon2 = intercomTopBarIcon;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    bVar2 = bVar;
                    if (c1086gP.K(bVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    jM635getHeader0d7_KjU = j;
                    if ((i11 & 16) == 0) {
                        i29 = 8192;
                    } else {
                        i29 = 8192;
                    }
                    i12 |= i29;
                } else {
                    jM635getHeader0d7_KjU = j;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i12 |= i28;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.k(aVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((29360128 & i10) == 0) {
                        if (c1086gP.k(qVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA112 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111114 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA112);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111110);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC1111114);
                            androidx.compose.ui.h hVar18 = hVar2;
                            androidx.compose.ui.h hVarH15 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j11113 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC1111115 = ClickableKt.c(hVarH15, false, null, (Ia.a) objF, 7);
                            E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111116 = ComposedModifierKt.c(c1086gP, hVarC1111115);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD15);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111116);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ15 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA113 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111112 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111117 = ComposedModifierKt.c(c1086gP, hVarJ15);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar19 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA113);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111112);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111117);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j11114 = j11;
                                j12 = j11114;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11114, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF15 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA15 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P111113 = c1086gP.P();
                                androidx.compose.ui.h hVarC1111118 = ComposedModifierKt.c(c1086gP, hVarF15);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA15);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P111113);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC1111118);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar18;
                            j14 = j11113;
                            bVar4 = bVar19;
                            IntercomTopBarIcon intercomTopBarIcon18 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon18;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC1111114);
                        androidx.compose.ui.h hVar19 = hVar2;
                        androidx.compose.ui.h hVarH16 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j11115 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1111119 = ClickableKt.c(hVarH16, false, null, (Ia.a) objF, 7);
                        E eD16 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111114 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111110 = ComposedModifierKt.c(c1086gP, hVarC1111119);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD16);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111114);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111110);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ16 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA114 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111115 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111 = ComposedModifierKt.c(c1086gP, hVarJ16);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar110 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA114);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111115);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j11116 = j11;
                            j12 = j11116;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11116, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF16 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA16 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111116 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111112 = ComposedModifierKt.c(c1086gP, hVarF16);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA16);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111116);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111112);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar19;
                        j14 = j11115;
                        bVar4 = bVar110;
                        IntercomTopBarIcon intercomTopBarIcon19 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon19;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA115 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111117 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111113 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA115);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111117);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC11111113);
                            androidx.compose.ui.h hVar110 = hVar2;
                            androidx.compose.ui.h hVarH17 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j11117 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC11111114 = ClickableKt.c(hVarH17, false, null, (Ia.a) objF, 7);
                            E eD17 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111118 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111115 = ComposedModifierKt.c(c1086gP, hVarC11111114);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD17);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111118);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111115);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ17 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA116 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111119 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111116 = ComposedModifierKt.c(c1086gP, hVarJ17);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar111 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA116);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111119);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111116);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j11118 = j11;
                                j12 = j11118;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11118, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF17 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA17 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P1111110 = c1086gP.P();
                                androidx.compose.ui.h hVarC11111117 = ComposedModifierKt.c(c1086gP, hVarF17);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA17);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P1111110);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC11111117);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar110;
                            j14 = j11117;
                            bVar4 = bVar111;
                            IntercomTopBarIcon intercomTopBarIcon110 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon110;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC11111113);
                        androidx.compose.ui.h hVar111 = hVar2;
                        androidx.compose.ui.h hVarH18 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j11119 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC11111118 = ClickableKt.c(hVarH18, false, null, (Ia.a) objF, 7);
                        E eD18 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111119 = ComposedModifierKt.c(c1086gP, hVarC11111118);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD18);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111119);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ18 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA117 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111112 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111110 = ComposedModifierKt.c(c1086gP, hVarJ18);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar112 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA117);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111110);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111110 = j11;
                            j12 = j111110;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111110, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF18 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA18 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1111113 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111111 = ComposedModifierKt.c(c1086gP, hVarF18);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA18);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1111113);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111111);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar111;
                        j14 = j11119;
                        bVar4 = bVar112;
                        IntercomTopBarIcon intercomTopBarIcon111 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon111;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((i12 & 23967451) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA118 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111112 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA118);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111114);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC111111112);
                        androidx.compose.ui.h hVar112 = hVar2;
                        androidx.compose.ui.h hVarH19 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111111 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC111111113 = ClickableKt.c(hVarH19, false, null, (Ia.a) objF, 7);
                        E eD19 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111115 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111114 = ComposedModifierKt.c(c1086gP, hVarC111111113);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD19);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111115);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111114);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ19 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA119 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111115 = ComposedModifierKt.c(c1086gP, hVarJ19);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar113 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA119);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111115);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111112 = j11;
                            j12 = j111112;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111112, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF19 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA19 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1111117 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111116 = ComposedModifierKt.c(c1086gP, hVarF19);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA19);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1111117);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111116);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar112;
                        j14 = j111111;
                        bVar4 = bVar113;
                        IntercomTopBarIcon intercomTopBarIcon112 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon112;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC111111112);
                    androidx.compose.ui.h hVar113 = hVar2;
                    androidx.compose.ui.h hVarH110 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111113 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111117 = ClickableKt.c(hVarH110, false, null, (Ia.a) objF, 7);
                    E eD110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111118 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111118 = ComposedModifierKt.c(c1086gP, hVarC111111117);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111118);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ110 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1110 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111119 = ComposedModifierKt.c(c1086gP, hVarJ110);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar114 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111119);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j111114 = j11;
                        j12 = j111114;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111114, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF110 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA110 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111110 = ComposedModifierKt.c(c1086gP, hVarF110);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA110);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111110);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar113;
                    j14 = j111113;
                    bVar4 = bVar114;
                    IntercomTopBarIcon intercomTopBarIcon113 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon113;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA1111 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA1111);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC1111111111);
                        androidx.compose.ui.h hVar114 = hVar2;
                        androidx.compose.ui.h hVarH111 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111115 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1111111112 = ClickableKt.c(hVarH111, false, null, (Ia.a) objF, 7);
                        E eD111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111112 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111113 = ComposedModifierKt.c(c1086gP, hVarC1111111112);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD111);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111113);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ111 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA1112 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111113 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111114 = ComposedModifierKt.c(c1086gP, hVarJ111);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar115 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA1112);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111114);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111116 = j11;
                            j12 = j111116;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111116, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF111 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA111 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111114 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111111115 = ComposedModifierKt.c(c1086gP, hVarF111);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA111);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11111114);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111111115);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar114;
                        j14 = j111115;
                        bVar4 = bVar115;
                        IntercomTopBarIcon intercomTopBarIcon114 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon114;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC1111111111);
                    androidx.compose.ui.h hVar115 = hVar2;
                    androidx.compose.ui.h hVarH112 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111117 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111111116 = ClickableKt.c(hVarH112, false, null, (Ia.a) objF, 7);
                    E eD112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111115 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111117 = ComposedModifierKt.c(c1086gP, hVarC1111111116);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD112);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111117);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ112 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1113 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111116 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111118 = ComposedModifierKt.c(c1086gP, hVarJ112);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar116 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1113);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111116);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111118);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j111118 = j11;
                        j12 = j111118;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111118, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF112 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA112 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111117 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111119 = ComposedModifierKt.c(c1086gP, hVarF112);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA112);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111119);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar115;
                    j14 = j111117;
                    bVar4 = bVar116;
                    IntercomTopBarIcon intercomTopBarIcon115 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon115;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            bVar2 = bVar;
            if ((57344 & i10) == 0) {
                jM635getHeader0d7_KjU = j;
                if ((i11 & 16) == 0) {
                    i29 = 8192;
                } else {
                    i29 = 8192;
                }
                i12 |= i29;
            } else {
                jM635getHeader0d7_KjU = j;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i12 |= i28;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((29360128 & i10) == 0) {
                    if (c1086gP.k(qVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 23967451) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA1114 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111118 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111110 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA1114);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111118);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC11111111110);
                        androidx.compose.ui.h hVar116 = hVar2;
                        androidx.compose.ui.h hVarH113 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111119 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC11111111111 = ClickableKt.c(hVarH113, false, null, (Ia.a) objF, 7);
                        E eD113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111119 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111112 = ComposedModifierKt.c(c1086gP, hVarC11111111111);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD113);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111119);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111112);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ113 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA1115 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111113 = ComposedModifierKt.c(c1086gP, hVarJ113);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar117 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA1115);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111113);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1111110 = j11;
                            j12 = j1111110;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111110, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF113 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA113 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111111114 = ComposedModifierKt.c(c1086gP, hVarF113);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA113);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111111114);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar116;
                        j14 = j111119;
                        bVar4 = bVar117;
                        IntercomTopBarIcon intercomTopBarIcon116 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon116;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111110);
                    androidx.compose.ui.h hVar117 = hVar2;
                    androidx.compose.ui.h hVarH114 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111111 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11111111115 = ClickableKt.c(hVarH114, false, null, (Ia.a) objF, 7);
                    E eD114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111112 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111116 = ComposedModifierKt.c(c1086gP, hVarC11111111115);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD114);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111112);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111116);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ114 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1116 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111113 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111117 = ComposedModifierKt.c(c1086gP, hVarJ114);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar118 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1116);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111113);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111117);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111112 = j11;
                        j12 = j1111112;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111112, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF114 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA114 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111114 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111118 = ComposedModifierKt.c(c1086gP, hVarF114);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA114);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111114);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111118);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar117;
                    j14 = j1111111;
                    bVar4 = bVar118;
                    IntercomTopBarIcon intercomTopBarIcon117 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon117;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA1117 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111115 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111119 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA1117);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111115);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC11111111119);
                        androidx.compose.ui.h hVar118 = hVar2;
                        androidx.compose.ui.h hVarH115 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j1111113 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC111111111110 = ClickableKt.c(hVarH115, false, null, (Ia.a) objF, 7);
                        E eD115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111 = ComposedModifierKt.c(c1086gP, hVarC111111111110);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD115);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ115 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA1118 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111117 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111112 = ComposedModifierKt.c(c1086gP, hVarJ115);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar119 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA1118);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111112);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1111114 = j11;
                            j12 = j1111114;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111114, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF115 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA115 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111118 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111111113 = ComposedModifierKt.c(c1086gP, hVarF115);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA115);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111118);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111111113);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar118;
                        j14 = j1111113;
                        bVar4 = bVar119;
                        IntercomTopBarIcon intercomTopBarIcon118 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon118;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111119);
                    androidx.compose.ui.h hVar119 = hVar2;
                    androidx.compose.ui.h hVarH116 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111115 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111111114 = ClickableKt.c(hVarH116, false, null, (Ia.a) objF, 7);
                    E eD116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111115 = ComposedModifierKt.c(c1086gP, hVarC111111111114);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD116);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111115);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ116 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1119 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111110 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111116 = ComposedModifierKt.c(c1086gP, hVarJ116);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar1110 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1119);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111110);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111116);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111116 = j11;
                        j12 = j1111116;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111116, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF116 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA116 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111117 = ComposedModifierKt.c(c1086gP, hVarF116);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA116);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111117);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar119;
                    j14 = j1111115;
                    bVar4 = bVar1110;
                    IntercomTopBarIcon intercomTopBarIcon119 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon119;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((i12 & 23967451) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA11110 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111112 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111118 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA11110);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111112);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC111111111118);
                    androidx.compose.ui.h hVar1110 = hVar2;
                    androidx.compose.ui.h hVarH117 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111117 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111111119 = ClickableKt.c(hVarH117, false, null, (Ia.a) objF, 7);
                    E eD117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111113 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111110 = ComposedModifierKt.c(c1086gP, hVarC111111111119);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD117);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111113);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111110);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ117 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA11111 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111 = ComposedModifierKt.c(c1086gP, hVarJ117);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar1111 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA11111);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111118 = j11;
                        j12 = j1111118;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111118, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF117 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA117 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111115 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111112 = ComposedModifierKt.c(c1086gP, hVarF117);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA117);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111115);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111112);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar1110;
                    j14 = j1111117;
                    bVar4 = bVar1111;
                    IntercomTopBarIcon intercomTopBarIcon1110 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon1110;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC111111111118);
                androidx.compose.ui.h hVar1111 = hVar2;
                androidx.compose.ui.h hVarH118 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j1111119 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC1111111111113 = ClickableKt.c(hVarH118, false, null, (Ia.a) objF, 7);
                E eD118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111116 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111114 = ComposedModifierKt.c(c1086gP, hVarC1111111111113);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD118);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111116);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111114);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ118 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA11112 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111117 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111115 = ComposedModifierKt.c(c1086gP, hVarJ118);
                c1086gP.r();
                androidx.compose.ui.d.b bVar1112 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA11112);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111117);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111115);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111110 = j11;
                    j12 = j11111110;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111110, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF118 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA118 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111118 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111116 = ComposedModifierKt.c(c1086gP, hVarF118);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA118);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111116);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar1111;
                j14 = j1111119;
                bVar4 = bVar1112;
                IntercomTopBarIcon intercomTopBarIcon1111 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon1111;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA11113 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111119 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111117 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA11113);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111119);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC1111111111117);
                    androidx.compose.ui.h hVar1112 = hVar2;
                    androidx.compose.ui.h hVarH119 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j11111111 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111111111118 = ClickableKt.c(hVarH119, false, null, (Ia.a) objF, 7);
                    E eD119 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111110 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111119 = ComposedModifierKt.c(c1086gP, hVarC1111111111118);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD119);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111110);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111119);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ119 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA11114 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111110 = ComposedModifierKt.c(c1086gP, hVarJ119);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar1113 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA11114);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111110);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j11111112 = j11;
                        j12 = j11111112;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111112, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF119 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA119 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111112 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111 = ComposedModifierKt.c(c1086gP, hVarF119);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA119);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar1112;
                    j14 = j11111111;
                    bVar4 = bVar1113;
                    IntercomTopBarIcon intercomTopBarIcon1112 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon1112;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC1111111111117);
                androidx.compose.ui.h hVar1113 = hVar2;
                androidx.compose.ui.h hVarH1110 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j11111113 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC11111111111112 = ClickableKt.c(hVarH1110, false, null, (Ia.a) objF, 7);
                E eD1110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111113 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111113 = ComposedModifierKt.c(c1086gP, hVarC11111111111112);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD1110);
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111113);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111113);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ1110 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA11115 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111114 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111114 = ComposedModifierKt.c(c1086gP, hVarJ1110);
                c1086gP.r();
                androidx.compose.ui.d.b bVar1114 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA11115);
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111114);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111114);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111114 = j11;
                    j12 = j11111114;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111114, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF1110 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA1110 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111115 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111115 = ComposedModifierKt.c(c1086gP, hVarF1110);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA1110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111115);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar1113;
                j14 = j11111113;
                bVar4 = bVar1114;
                IntercomTopBarIcon intercomTopBarIcon1113 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon1113;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                intercomTopBarIcon2 = intercomTopBarIcon;
                if (c1086gP.K(intercomTopBarIcon2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    bVar2 = bVar;
                    if (c1086gP.K(bVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    jM635getHeader0d7_KjU = j;
                    if ((i11 & 16) == 0) {
                        i29 = 8192;
                    } else {
                        i29 = 8192;
                    }
                    i12 |= i29;
                } else {
                    jM635getHeader0d7_KjU = j;
                }
                if ((458752 & i10) != 0) {
                    if ((i11 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i12 |= i28;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.k(aVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    if ((29360128 & i10) == 0) {
                        if (c1086gP.k(qVar)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA11116 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111116 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA11116);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111116);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC11111111111116);
                            androidx.compose.ui.h hVar1114 = hVar2;
                            androidx.compose.ui.h hVarH1111 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j11111115 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC11111111111117 = ClickableKt.c(hVarH1111, false, null, (Ia.a) objF, 7);
                            E eD1111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111111117 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111111111118 = ComposedModifierKt.c(c1086gP, hVarC11111111111117);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD1111);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11111111117);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111111111118);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ1111 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA11117 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111111118 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111111111119 = ComposedModifierKt.c(c1086gP, hVarJ1111);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar1115 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA11117);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11111111118);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111111111119);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j11111116 = j11;
                                j12 = j11111116;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111116, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF1111 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA1111 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P11111111119 = c1086gP.P();
                                androidx.compose.ui.h hVarC111111111111110 = ComposedModifierKt.c(c1086gP, hVarF1111);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA1111);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111119);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC111111111111110);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar1114;
                            j14 = j11111115;
                            bVar4 = bVar1115;
                            IntercomTopBarIcon intercomTopBarIcon1114 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon1114;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC11111111111116);
                        androidx.compose.ui.h hVar1115 = hVar2;
                        androidx.compose.ui.h hVarH1112 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j11111117 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC111111111111111 = ClickableKt.c(hVarH1112, false, null, (Ia.a) objF, 7);
                        E eD1112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111112 = ComposedModifierKt.c(c1086gP, hVarC111111111111111);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD1112);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111112);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ1112 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA11118 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111113 = ComposedModifierKt.c(c1086gP, hVarJ1112);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar1116 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA11118);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111113);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j11111118 = j11;
                            j12 = j11111118;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111118, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF1112 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA1112 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111112 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111111111114 = ComposedModifierKt.c(c1086gP, hVarF1112);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA1112);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111112);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111111111114);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar1115;
                        j14 = j11111117;
                        bVar4 = bVar1116;
                        IntercomTopBarIcon intercomTopBarIcon1115 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon1115;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar3 = androidx.compose.ui.d.a.f13346m;
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        } else {
                            if (i30 != 0) {
                                hVar2 = aVar4;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i13 != 0) {
                                intercomTopBarIcon2 = null;
                            }
                            if (i15 != 0) {
                                bVar3 = aVar3;
                            } else {
                                bVar3 = bVar;
                            }
                            if ((i11 & 16) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                                i12 &= -458753;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if (i17 != 0) {
                                nVar = new n();
                            } else {
                                nVar = aVar;
                            }
                            if (i19 != 0) {
                                j11 = jM642getOnHeader0d7_KjU;
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                                j11 = jM642getOnHeader0d7_KjU;
                            }
                        }
                        c1086gP.U();
                        C0953m c0953mA11119 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111113 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111115 = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, c1086gP, c0953mA11119);
                        pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111113);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        qVar3 = qVar2;
                        if (c1086gP.f12995O) {
                            str3 = str2;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                            }
                            pVar4 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar4, c1086gP, hVarC111111111111115);
                            androidx.compose.ui.h hVar1116 = hVar2;
                            androidx.compose.ui.h hVarH1113 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                            c1086gP.L(86796077);
                            if ((i12 & 3670016) == 1048576) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF = c1086gP.f();
                            if (z10) {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            long j11111119 = jM635getHeader0d7_KjU;
                            androidx.compose.ui.h hVarC111111111111116 = ClickableKt.c(hVarH1113, false, null, (Ia.a) objF, 7);
                            E eD1113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i23 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111114 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111111111117 = ComposedModifierKt.c(c1086gP, hVarC111111111111116);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD1113);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111114);
                            if (c1086gP.f12995O) {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            } else {
                                J4.i.d(i23, c1086gP, i23, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111111111117);
                            c0949i = C0949i.f10304a;
                            if (intercomTopBarIcon2 != null) {
                                i24 = 16;
                                f10 = 16;
                            } else {
                                i24 = 16;
                                f10 = 16;
                            }
                            androidx.compose.ui.h hVarJ1113 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                            i25 = i12 >> 3;
                            C0953m c0953mA111110 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                            i26 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111115 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111111111118 = ComposedModifierKt.c(c1086gP, hVarJ1113);
                            c1086gP.r();
                            androidx.compose.ui.d.b bVar1117 = bVar3;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, c0953mA111110);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111115);
                            if (c1086gP.f12995O) {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            } else {
                                J4.i.d(i26, c1086gP, i26, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111111111118);
                            c1086gP.L(560412879);
                            if (str3 != null) {
                                z11 = false;
                                aVar6 = aVar5;
                                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                            } else {
                                aVar6 = aVar5;
                                z11 = false;
                            }
                            c1086gP.T(z11);
                            c1086gP.T(true);
                            c1086gP.L(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                final long j111111110 = j11;
                                j12 = j111111110;
                                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                        } else {
                                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111110, interfaceC1084f2, 392, 0);
                                        }
                                    }
                                }, c1086gP), c1086gP, 196608, 28);
                                z12 = false;
                            } else {
                                j12 = j11;
                                z12 = z11;
                            }
                            c1086gP.T(z12);
                            c1086gP.L(-1319809649);
                            if (qVar3 != null) {
                                androidx.compose.ui.h hVarF1113 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                                T tA1113 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                                i27 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P111111111116 = c1086gP.P();
                                androidx.compose.ui.h hVarC111111111111119 = ComposedModifierKt.c(c1086gP, hVarF1113);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar6);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar, c1086gP, tA1113);
                                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111116);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                } else {
                                    J4.i.d(i27, c1086gP, i27, pVar3);
                                }
                                R0.a(pVar4, c1086gP, hVarC111111111111119);
                                qVar4 = qVar3;
                                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                                r10 = 1;
                                c1086gP.T(true);
                            } else {
                                qVar4 = qVar3;
                                r10 = 1;
                            }
                            c1086gP.T(false);
                            c1086gP.T(r10);
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                            c1086gP.T(r10);
                            j13 = j12;
                            str4 = str3;
                            hVar3 = hVar1116;
                            j14 = j11111119;
                            bVar4 = bVar1117;
                            IntercomTopBarIcon intercomTopBarIcon1116 = intercomTopBarIcon2;
                            qVar5 = qVar4;
                            intercomTopBarIcon3 = intercomTopBarIcon1116;
                        } else {
                            str3 = str2;
                        }
                        J4.i.d(i22, c1086gP, i22, pVar3);
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC111111111111115);
                        androidx.compose.ui.h hVar1117 = hVar2;
                        androidx.compose.ui.h hVarH1114 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111111111 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1111111111111110 = ClickableKt.c(hVarH1114, false, null, (Ia.a) objF, 7);
                        E eD1114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111117 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111 = ComposedModifierKt.c(c1086gP, hVarC1111111111111110);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD1114);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ1114 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA111111 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111118 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111112 = ComposedModifierKt.c(c1086gP, hVarJ1114);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar1118 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA111111);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111112);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111111112 = j11;
                            j12 = j111111112;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111112, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF1114 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA1114 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111119 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111111111111113 = ComposedModifierKt.c(c1086gP, hVarF1114);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA1114);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111119);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111111111111113);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar1117;
                        j14 = j111111111;
                        bVar4 = bVar1118;
                        IntercomTopBarIcon intercomTopBarIcon1117 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon1117;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((i12 & 23967451) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA111112 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111110 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111114 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA111112);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111110);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC1111111111111114);
                        androidx.compose.ui.h hVar1118 = hVar2;
                        androidx.compose.ui.h hVarH1115 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111111113 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1111111111111115 = ClickableKt.c(hVarH1115, false, null, (Ia.a) objF, 7);
                        E eD1115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111111 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111116 = ComposedModifierKt.c(c1086gP, hVarC1111111111111115);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD1115);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111116);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ1115 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA111113 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111112 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111117 = ComposedModifierKt.c(c1086gP, hVarJ1115);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar1119 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA111113);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111117);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111111114 = j11;
                            j12 = j111111114;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111114, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF1115 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA1115 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1111111111113 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111111111111118 = ComposedModifierKt.c(c1086gP, hVarF1115);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA1115);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111113);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111111111111118);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar1118;
                        j14 = j111111113;
                        bVar4 = bVar1119;
                        IntercomTopBarIcon intercomTopBarIcon1118 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon1118;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC1111111111111114);
                    androidx.compose.ui.h hVar1119 = hVar2;
                    androidx.compose.ui.h hVarH1116 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111111115 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111111111111119 = ClickableKt.c(hVarH1116, false, null, (Ia.a) objF, 7);
                    E eD1116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111110 = ComposedModifierKt.c(c1086gP, hVarC1111111111111119);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD1116);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111110);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ1116 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA111114 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111115 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111 = ComposedModifierKt.c(c1086gP, hVarJ1116);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar11110 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA111114);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j111111116 = j11;
                        j12 = j111111116;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111116, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF1116 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA1116 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111112 = ComposedModifierKt.c(c1086gP, hVarF1116);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA1116);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111112);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar1119;
                    j14 = j111111115;
                    bVar4 = bVar11110;
                    IntercomTopBarIcon intercomTopBarIcon1119 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon1119;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA111115 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111117 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111113 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA111115);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111117);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC11111111111111113);
                        androidx.compose.ui.h hVar11110 = hVar2;
                        androidx.compose.ui.h hVarH1117 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111111117 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC11111111111111114 = ClickableKt.c(hVarH1117, false, null, (Ia.a) objF, 7);
                        E eD1117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111118 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111115 = ComposedModifierKt.c(c1086gP, hVarC11111111111111114);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD1117);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111115);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ1117 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA111116 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111119 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111116 = ComposedModifierKt.c(c1086gP, hVarJ1117);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar11111 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA111116);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111119);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111116);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111111118 = j11;
                            j12 = j111111118;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111118, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF1117 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA1117 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111111111110 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111111111111117 = ComposedModifierKt.c(c1086gP, hVarF1117);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA1117);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111110);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111111111111117);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar11110;
                        j14 = j111111117;
                        bVar4 = bVar11111;
                        IntercomTopBarIcon intercomTopBarIcon11110 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon11110;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111111111113);
                    androidx.compose.ui.h hVar11111 = hVar2;
                    androidx.compose.ui.h hVarH1118 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111111119 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11111111111111118 = ClickableKt.c(hVarH1118, false, null, (Ia.a) objF, 7);
                    E eD1118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111119 = ComposedModifierKt.c(c1086gP, hVarC11111111111111118);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD1118);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111119);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ1118 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA111117 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111112 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111110 = ComposedModifierKt.c(c1086gP, hVarJ1118);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar11112 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA111117);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111112);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111110);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111111110 = j11;
                        j12 = j1111111110;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111110, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF1118 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA1118 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111113 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111111111 = ComposedModifierKt.c(c1086gP, hVarF1118);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA1118);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111111111);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar11111;
                    j14 = j111111119;
                    bVar4 = bVar11112;
                    IntercomTopBarIcon intercomTopBarIcon11111 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon11111;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            bVar2 = bVar;
            if ((57344 & i10) == 0) {
                jM635getHeader0d7_KjU = j;
                if ((i11 & 16) == 0) {
                    i29 = 8192;
                } else {
                    i29 = 8192;
                }
                i12 |= i29;
            } else {
                jM635getHeader0d7_KjU = j;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i12 |= i28;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((29360128 & i10) == 0) {
                    if (c1086gP.k(qVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 23967451) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA111118 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111112 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA111118);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111114);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC111111111111111112);
                        androidx.compose.ui.h hVar11112 = hVar2;
                        androidx.compose.ui.h hVarH1119 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j1111111111 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC111111111111111113 = ClickableKt.c(hVarH1119, false, null, (Ia.a) objF, 7);
                        E eD1119 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111115 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111111114 = ComposedModifierKt.c(c1086gP, hVarC111111111111111113);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD1119);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111115);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111111114);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ1119 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA111119 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111111115 = ComposedModifierKt.c(c1086gP, hVarJ1119);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar11113 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA111119);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111111115);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1111111112 = j11;
                            j12 = j1111111112;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111112, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF1119 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA1119 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111111111117 = c1086gP.P();
                            androidx.compose.ui.h hVarC111111111111111116 = ComposedModifierKt.c(c1086gP, hVarF1119);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA1119);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111117);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC111111111111111116);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar11112;
                        j14 = j1111111111;
                        bVar4 = bVar11113;
                        IntercomTopBarIcon intercomTopBarIcon11112 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon11112;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC111111111111111112);
                    androidx.compose.ui.h hVar11113 = hVar2;
                    androidx.compose.ui.h hVarH11110 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111111113 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111111111111117 = ClickableKt.c(hVarH11110, false, null, (Ia.a) objF, 7);
                    E eD11110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111118 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111118 = ComposedModifierKt.c(c1086gP, hVarC111111111111111117);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD11110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111118);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ11110 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1111110 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111119 = ComposedModifierKt.c(c1086gP, hVarJ11110);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar11114 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1111110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111119);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111111114 = j11;
                        j12 = j1111111114;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111114, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF11110 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA11110 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111110 = ComposedModifierKt.c(c1086gP, hVarF11110);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA11110);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111110);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar11113;
                    j14 = j1111111113;
                    bVar4 = bVar11114;
                    IntercomTopBarIcon intercomTopBarIcon11113 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon11113;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA1111111 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA1111111);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111);
                        androidx.compose.ui.h hVar11114 = hVar2;
                        androidx.compose.ui.h hVarH11111 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j1111111115 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1111111111111111112 = ClickableKt.c(hVarH11111, false, null, (Ia.a) objF, 7);
                        E eD11111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111112 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111113 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111112);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD11111);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111113);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ11111 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA1111112 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111113 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111114 = ComposedModifierKt.c(c1086gP, hVarJ11111);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar11115 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA1111112);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111114);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j1111111116 = j11;
                            j12 = j1111111116;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111116, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF11111 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA11111 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111111114 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111111111111111115 = ComposedModifierKt.c(c1086gP, hVarF11111);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA11111);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111114);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111111111111111115);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar11114;
                        j14 = j1111111115;
                        bVar4 = bVar11115;
                        IntercomTopBarIcon intercomTopBarIcon11114 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon11114;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111);
                    androidx.compose.ui.h hVar11115 = hVar2;
                    androidx.compose.ui.h hVarH11112 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111111117 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111111111111111116 = ClickableKt.c(hVarH11112, false, null, (Ia.a) objF, 7);
                    E eD11112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111115 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111117 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111116);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD11112);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111117);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ11112 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1111113 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111116 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111118 = ComposedModifierKt.c(c1086gP, hVarJ11112);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar11116 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1111113);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111116);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111118);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111111118 = j11;
                        j12 = j1111111118;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111118, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF11112 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA11112 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111117 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111119 = ComposedModifierKt.c(c1086gP, hVarF11112);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA11112);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111119);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar11115;
                    j14 = j1111111117;
                    bVar4 = bVar11116;
                    IntercomTopBarIcon intercomTopBarIcon11115 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon11115;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((i12 & 23967451) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA1111114 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111111111118 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111110 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA1111114);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111118);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111111111111110);
                    androidx.compose.ui.h hVar11116 = hVar2;
                    androidx.compose.ui.h hVarH11113 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111111119 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11111111111111111111 = ClickableKt.c(hVarH11113, false, null, (Ia.a) objF, 7);
                    E eD11113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111112 = ComposedModifierKt.c(c1086gP, hVarC11111111111111111111);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD11113);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111112);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ11113 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1111115 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111110 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111113 = ComposedModifierKt.c(c1086gP, hVarJ11113);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar11117 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1111115);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111110);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111113);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j11111111110 = j11;
                        j12 = j11111111110;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111110, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF11113 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA11113 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111111111 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111111114 = ComposedModifierKt.c(c1086gP, hVarF11113);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA11113);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111111114);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar11116;
                    j14 = j1111111119;
                    bVar4 = bVar11117;
                    IntercomTopBarIcon intercomTopBarIcon11116 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon11116;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC11111111111111111110);
                androidx.compose.ui.h hVar11117 = hVar2;
                androidx.compose.ui.h hVarH11114 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j11111111111 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC11111111111111111115 = ClickableKt.c(hVarH11114, false, null, (Ia.a) objF, 7);
                E eD11114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111112 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111116 = ComposedModifierKt.c(c1086gP, hVarC11111111111111111115);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD11114);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111112);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111111111116);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ11114 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA1111116 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111113 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111117 = ComposedModifierKt.c(c1086gP, hVarJ11114);
                c1086gP.r();
                androidx.compose.ui.d.b bVar11118 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA1111116);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111113);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111111111117);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111111112 = j11;
                    j12 = j11111111112;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111112, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF11114 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA11114 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111118 = ComposedModifierKt.c(c1086gP, hVarF11114);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA11114);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111118);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar11117;
                j14 = j11111111111;
                bVar4 = bVar11118;
                IntercomTopBarIcon intercomTopBarIcon11117 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon11117;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA1111117 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111115 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111119 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA1111117);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111115);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111111111111119);
                    androidx.compose.ui.h hVar11118 = hVar2;
                    androidx.compose.ui.h hVarH11115 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j11111111113 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111111111111111110 = ClickableKt.c(hVarH11115, false, null, (Ia.a) objF, 7);
                    E eD11115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111116 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111111 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111110);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD11115);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111116);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ11115 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA1111118 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111117 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111112 = ComposedModifierKt.c(c1086gP, hVarJ11115);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar11119 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA1111118);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111112);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j11111111114 = j11;
                        j12 = j11111111114;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111114, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF11115 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA11115 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111111118 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111111111113 = ComposedModifierKt.c(c1086gP, hVarF11115);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA11115);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111111111113);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar11118;
                    j14 = j11111111113;
                    bVar4 = bVar11119;
                    IntercomTopBarIcon intercomTopBarIcon11118 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon11118;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC11111111111111111119);
                androidx.compose.ui.h hVar11119 = hVar2;
                androidx.compose.ui.h hVarH11116 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j11111111115 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC111111111111111111114 = ClickableKt.c(hVarH11116, false, null, (Ia.a) objF, 7);
                E eD11116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111119 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111115 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111114);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD11116);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111119);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111115);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ11116 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA1111119 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111111111110 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111116 = ComposedModifierKt.c(c1086gP, hVarJ11116);
                c1086gP.r();
                androidx.compose.ui.d.b bVar111110 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA1111119);
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111110);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111116);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111111116 = j11;
                    j12 = j11111111116;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111116, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF11116 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA11116 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111117 = ComposedModifierKt.c(c1086gP, hVarF11116);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA11116);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111117);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar11119;
                j14 = j11111111115;
                bVar4 = bVar111110;
                IntercomTopBarIcon intercomTopBarIcon11119 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon11119;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        intercomTopBarIcon2 = intercomTopBarIcon;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                bVar2 = bVar;
                if (c1086gP.K(bVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                jM635getHeader0d7_KjU = j;
                if ((i11 & 16) == 0) {
                    i29 = 8192;
                } else {
                    i29 = 8192;
                }
                i12 |= i29;
            } else {
                jM635getHeader0d7_KjU = j;
            }
            if ((458752 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i12 |= i28;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                if ((29360128 & i10) == 0) {
                    if (c1086gP.k(qVar)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i12 & 23967451) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA11111110 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111112 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111118 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA11111110);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111112);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC111111111111111111118);
                        androidx.compose.ui.h hVar111110 = hVar2;
                        androidx.compose.ui.h hVarH11117 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j11111111117 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC111111111111111111119 = ClickableKt.c(hVarH11117, false, null, (Ia.a) objF, 7);
                        E eD11117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111111113 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111111110 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111119);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD11117);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111110);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ11117 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA11111111 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111111114 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111111111 = ComposedModifierKt.c(c1086gP, hVarJ11117);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar111111 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA11111111);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111114);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111111);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j11111111118 = j11;
                            j12 = j11111111118;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111118, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF11117 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA11117 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111111111111115 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111111111111111111112 = ComposedModifierKt.c(c1086gP, hVarF11117);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA11117);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111115);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC1111111111111111111112);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar111110;
                        j14 = j11111111117;
                        bVar4 = bVar111111;
                        IntercomTopBarIcon intercomTopBarIcon111110 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon111110;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC111111111111111111118);
                    androidx.compose.ui.h hVar111111 = hVar2;
                    androidx.compose.ui.h hVarH11118 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j11111111119 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111111111111111111113 = ClickableKt.c(hVarH11118, false, null, (Ia.a) objF, 7);
                    E eD11118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111116 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111114 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111113);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD11118);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111116);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111114);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ11118 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA11111112 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111117 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111115 = ComposedModifierKt.c(c1086gP, hVarJ11118);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar111112 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA11111112);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111115);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j111111111110 = j11;
                        j12 = j111111111110;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111111110, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF11118 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA11118 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111111118 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111111116 = ComposedModifierKt.c(c1086gP, hVarF11118);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA11118);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111116);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar111111;
                    j14 = j11111111119;
                    bVar4 = bVar111112;
                    IntercomTopBarIcon intercomTopBarIcon111111 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon111111;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar3 = androidx.compose.ui.d.a.f13346m;
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    } else {
                        if (i30 != 0) {
                            hVar2 = aVar4;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i13 != 0) {
                            intercomTopBarIcon2 = null;
                        }
                        if (i15 != 0) {
                            bVar3 = aVar3;
                        } else {
                            bVar3 = bVar;
                        }
                        if ((i11 & 16) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                            i12 &= -458753;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if (i17 != 0) {
                            nVar = new n();
                        } else {
                            nVar = aVar;
                        }
                        if (i19 != 0) {
                            j11 = jM642getOnHeader0d7_KjU;
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                            j11 = jM642getOnHeader0d7_KjU;
                        }
                    }
                    c1086gP.U();
                    C0953m c0953mA11111113 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111117 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, c0953mA11111113);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111119);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    qVar3 = qVar2;
                    if (c1086gP.f12995O) {
                        str3 = str2;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111117);
                        androidx.compose.ui.h hVar111112 = hVar2;
                        androidx.compose.ui.h hVarH11119 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                        c1086gP.L(86796077);
                        if ((i12 & 3670016) == 1048576) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10) {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                                @Override // Ia.a
                                public final Object invoke() {
                                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                                }
                            };
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        long j111111111111 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC1111111111111111111118 = ClickableKt.c(hVarH11119, false, null, (Ia.a) objF, 7);
                        E eD11119 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111111119 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111118);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD11119);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        } else {
                            J4.i.d(i23, c1086gP, i23, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111119);
                        c0949i = C0949i.f10304a;
                        if (intercomTopBarIcon2 != null) {
                            i24 = 16;
                            f10 = 16;
                        } else {
                            i24 = 16;
                            f10 = 16;
                        }
                        androidx.compose.ui.h hVarJ11119 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                        i25 = i12 >> 3;
                        C0953m c0953mA11111114 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        i26 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111111111 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111111111110 = ComposedModifierKt.c(c1086gP, hVarJ11119);
                        c1086gP.r();
                        androidx.compose.ui.d.b bVar111113 = bVar3;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, c0953mA11111114);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        } else {
                            J4.i.d(i26, c1086gP, i26, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111111111110);
                        c1086gP.L(560412879);
                        if (str3 != null) {
                            z11 = false;
                            aVar6 = aVar5;
                            TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                        } else {
                            aVar6 = aVar5;
                            z11 = false;
                        }
                        c1086gP.T(z11);
                        c1086gP.T(true);
                        c1086gP.L(-1319827237);
                        if (intercomTopBarIcon2 != null) {
                            final long j111111111112 = j11;
                            j12 = j111111111112;
                            IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                    if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111111112, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, 196608, 28);
                            z12 = false;
                        } else {
                            j12 = j11;
                            z12 = z11;
                        }
                        c1086gP.T(z12);
                        c1086gP.L(-1319809649);
                        if (qVar3 != null) {
                            androidx.compose.ui.h hVarF11119 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                            T tA11119 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                            i27 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111111111111111112 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111111111111111111111 = ComposedModifierKt.c(c1086gP, hVarF11119);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar6);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, tA11119);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111112);
                            if (c1086gP.f12995O) {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            } else {
                                J4.i.d(i27, c1086gP, i27, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC11111111111111111111111);
                            qVar4 = qVar3;
                            qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            r10 = 1;
                            c1086gP.T(true);
                        } else {
                            qVar4 = qVar3;
                            r10 = 1;
                        }
                        c1086gP.T(false);
                        c1086gP.T(r10);
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                        c1086gP.T(r10);
                        j13 = j12;
                        str4 = str3;
                        hVar3 = hVar111112;
                        j14 = j111111111111;
                        bVar4 = bVar111113;
                        IntercomTopBarIcon intercomTopBarIcon111112 = intercomTopBarIcon2;
                        qVar5 = qVar4;
                        intercomTopBarIcon3 = intercomTopBarIcon111112;
                    } else {
                        str3 = str2;
                    }
                    J4.i.d(i22, c1086gP, i22, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111117);
                    androidx.compose.ui.h hVar111113 = hVar2;
                    androidx.compose.ui.h hVarH111110 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111111111113 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11111111111111111111112 = ClickableKt.c(hVarH111110, false, null, (Ia.a) objF, 7);
                    E eD111110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111113 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111113 = ComposedModifierKt.c(c1086gP, hVarC11111111111111111111112);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD111110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111113);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111113);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ111110 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA11111115 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111114 = ComposedModifierKt.c(c1086gP, hVarJ111110);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar111114 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA11111115);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111114);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j111111111114 = j11;
                        j12 = j111111111114;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111111114, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF111110 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA111110 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111111115 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111111111115 = ComposedModifierKt.c(c1086gP, hVarF111110);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA111110);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111115);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111111111115);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar111113;
                    j14 = j111111111113;
                    bVar4 = bVar111114;
                    IntercomTopBarIcon intercomTopBarIcon111113 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon111113;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((i12 & 23967451) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA11111116 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111111111111116 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111111116 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA11111116);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111116);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111116);
                    androidx.compose.ui.h hVar111114 = hVar2;
                    androidx.compose.ui.h hVarH111111 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111111111115 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11111111111111111111117 = ClickableKt.c(hVarH111111, false, null, (Ia.a) objF, 7);
                    E eD111111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111117 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111118 = ComposedModifierKt.c(c1086gP, hVarC11111111111111111111117);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD111111);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111118);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ111111 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA11111117 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111118 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111119 = ComposedModifierKt.c(c1086gP, hVarJ111111);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar111115 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA11111117);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111119);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j111111111116 = j11;
                        j12 = j111111111116;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111111116, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF111111 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA111111 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111111119 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111111111111110 = ComposedModifierKt.c(c1086gP, hVarF111111);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA111111);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111119);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111111111111110);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar111114;
                    j14 = j111111111115;
                    bVar4 = bVar111115;
                    IntercomTopBarIcon intercomTopBarIcon111114 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon111114;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC11111111111111111111116);
                androidx.compose.ui.h hVar111115 = hVar2;
                androidx.compose.ui.h hVarH111112 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j111111111117 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC111111111111111111111111 = ClickableKt.c(hVarH111112, false, null, (Ia.a) objF, 7);
                E eD111112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111110 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111111112 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111111111);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD111112);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111110);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111111112);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ111112 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA11111118 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111111 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111111113 = ComposedModifierKt.c(c1086gP, hVarJ111112);
                c1086gP.r();
                androidx.compose.ui.d.b bVar111116 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA11111118);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111111113);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j111111111118 = j11;
                    j12 = j111111111118;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j111111111118, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF111112 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA111112 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111111112 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111111114 = ComposedModifierKt.c(c1086gP, hVarF111112);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA111112);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111112);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111114);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar111115;
                j14 = j111111111117;
                bVar4 = bVar111116;
                IntercomTopBarIcon intercomTopBarIcon111115 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon111115;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA11111119 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111113 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111111115 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA11111119);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111113);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111115);
                    androidx.compose.ui.h hVar111116 = hVar2;
                    androidx.compose.ui.h hVarH111113 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j111111111119 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC111111111111111111111116 = ClickableKt.c(hVarH111113, false, null, (Ia.a) objF, 7);
                    E eD111113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111111117 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111111116);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD111113);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111117);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ111113 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA111111110 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111111115 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111111118 = ComposedModifierKt.c(c1086gP, hVarJ111113);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar111117 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA111111110);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111118);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111111111110 = j11;
                        j12 = j1111111111110;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111111110, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF111113 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA111113 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111111111111111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC111111111111111111111119 = ComposedModifierKt.c(c1086gP, hVarF111113);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA111113);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC111111111111111111111119);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar111116;
                    j14 = j111111111119;
                    bVar4 = bVar111117;
                    IntercomTopBarIcon intercomTopBarIcon111116 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon111116;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC111111111111111111111115);
                androidx.compose.ui.h hVar111117 = hVar2;
                androidx.compose.ui.h hVarH111114 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j1111111111111 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC1111111111111111111111110 = ClickableKt.c(hVarH111114, false, null, (Ia.a) objF, 7);
                E eD111114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111117 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111111 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111111110);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD111114);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111117);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111111);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ111114 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA111111111 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111118 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111112 = ComposedModifierKt.c(c1086gP, hVarJ111114);
                c1086gP.r();
                androidx.compose.ui.d.b bVar111118 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA111111111);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111118);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111112);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j1111111111112 = j11;
                    j12 = j1111111111112;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111111112, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF111114 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA111114 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111111113 = ComposedModifierKt.c(c1086gP, hVarF111114);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA111114);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111111113);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar111117;
                j14 = j1111111111111;
                bVar4 = bVar111118;
                IntercomTopBarIcon intercomTopBarIcon111117 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon111117;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        bVar2 = bVar;
        if ((57344 & i10) == 0) {
            jM635getHeader0d7_KjU = j;
            if ((i11 & 16) == 0) {
                i29 = 8192;
            } else {
                i29 = 8192;
            }
            i12 |= i29;
        } else {
            jM635getHeader0d7_KjU = j;
        }
        if ((458752 & i10) != 0) {
            if ((i11 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i12 |= i28;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i10 & 3670016) == 0) {
                if (c1086gP.k(aVar2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            if ((29360128 & i10) == 0) {
                if (c1086gP.k(qVar)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i12 & 23967451) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA111111112 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111111111111110 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111114 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA111111112);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111110);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111111114);
                    androidx.compose.ui.h hVar111118 = hVar2;
                    androidx.compose.ui.h hVarH111115 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111111111113 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111111111111111111111115 = ClickableKt.c(hVarH111115, false, null, (Ia.a) objF, 7);
                    E eD111115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111111116 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111111115);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD111115);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111111116);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ111115 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA111111113 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111111112 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111111117 = ComposedModifierKt.c(c1086gP, hVarJ111115);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar111119 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA111111113);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111112);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111111117);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111111111114 = j11;
                        j12 = j1111111111114;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111111114, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF111115 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA111115 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111111111111111113 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111111111111111111111118 = ComposedModifierKt.c(c1086gP, hVarF111115);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA111115);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC1111111111111111111111118);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar111118;
                    j14 = j1111111111113;
                    bVar4 = bVar111119;
                    IntercomTopBarIcon intercomTopBarIcon111118 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon111118;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111114);
                androidx.compose.ui.h hVar111119 = hVar2;
                androidx.compose.ui.h hVarH111116 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j1111111111115 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC1111111111111111111111119 = ClickableKt.c(hVarH111116, false, null, (Ia.a) objF, 7);
                E eD111116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111111111111114 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111111111110 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111111119);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD111116);
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111114);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111111111111111110);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ111116 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA111111114 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111111111111115 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111111111111 = ComposedModifierKt.c(c1086gP, hVarJ111116);
                c1086gP.r();
                androidx.compose.ui.d.b bVar1111110 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA111111114);
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111115);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111111111111111111);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j1111111111116 = j11;
                    j12 = j1111111111116;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111111116, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF111116 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA111116 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111111116 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111111112 = ComposedModifierKt.c(c1086gP, hVarF111116);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA111116);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111116);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111111112);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar111119;
                j14 = j1111111111115;
                bVar4 = bVar1111110;
                IntercomTopBarIcon intercomTopBarIcon111119 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon111119;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar3 = androidx.compose.ui.d.a.f13346m;
                aVar4 = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                } else {
                    if (i30 != 0) {
                        hVar2 = aVar4;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i13 != 0) {
                        intercomTopBarIcon2 = null;
                    }
                    if (i15 != 0) {
                        bVar3 = aVar3;
                    } else {
                        bVar3 = bVar;
                    }
                    if ((i11 & 16) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                        i12 &= -458753;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if (i17 != 0) {
                        nVar = new n();
                    } else {
                        nVar = aVar;
                    }
                    if (i19 != 0) {
                        j11 = jM642getOnHeader0d7_KjU;
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                        j11 = jM642getOnHeader0d7_KjU;
                    }
                }
                c1086gP.U();
                C0953m c0953mA111111115 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111111111111111117 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111111111113 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA111111115);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111117);
                pVar3 = ComposeUiNode.Companion.f14338g;
                qVar3 = qVar2;
                if (c1086gP.f12995O) {
                    str3 = str2;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111111113);
                    androidx.compose.ui.h hVar1111110 = hVar2;
                    androidx.compose.ui.h hVarH111117 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                    c1086gP.L(86796077);
                    if ((i12 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                            @Override // Ia.a
                            public final Object invoke() {
                                return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    long j1111111111117 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11111111111111111111111114 = ClickableKt.c(hVarH111117, false, null, (Ia.a) objF, 7);
                    E eD111117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111111118 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111111115 = ComposedModifierKt.c(c1086gP, hVarC11111111111111111111111114);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD111117);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111111115);
                    c0949i = C0949i.f10304a;
                    if (intercomTopBarIcon2 != null) {
                        i24 = 16;
                        f10 = 16;
                    } else {
                        i24 = 16;
                        f10 = 16;
                    }
                    androidx.compose.ui.h hVarJ111117 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                    i25 = i12 >> 3;
                    C0953m c0953mA111111116 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111111111111119 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111111111111111111116 = ComposedModifierKt.c(c1086gP, hVarJ111117);
                    c1086gP.r();
                    androidx.compose.ui.d.b bVar1111111 = bVar3;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, c0953mA111111116);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11111111111111111119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    } else {
                        J4.i.d(i26, c1086gP, i26, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11111111111111111111111116);
                    c1086gP.L(560412879);
                    if (str3 != null) {
                        z11 = false;
                        aVar6 = aVar5;
                        TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                    } else {
                        aVar6 = aVar5;
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    c1086gP.T(true);
                    c1086gP.L(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                        final long j1111111111118 = j11;
                        j12 = j1111111111118;
                        IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                                if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j1111111111118, interfaceC1084f2, 392, 0);
                                }
                            }
                        }, c1086gP), c1086gP, 196608, 28);
                        z12 = false;
                    } else {
                        j12 = j11;
                        z12 = z11;
                    }
                    c1086gP.T(z12);
                    c1086gP.L(-1319809649);
                    if (qVar3 != null) {
                        androidx.compose.ui.h hVarF111117 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                        T tA111117 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111111111111111111110 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111111111111111111111117 = ComposedModifierKt.c(c1086gP, hVarF111117);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar6);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, tA111117);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        } else {
                            J4.i.d(i27, c1086gP, i27, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC11111111111111111111111117);
                        qVar4 = qVar3;
                        qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        r10 = 1;
                        c1086gP.T(true);
                    } else {
                        qVar4 = qVar3;
                        r10 = 1;
                    }
                    c1086gP.T(false);
                    c1086gP.T(r10);
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                    c1086gP.T(r10);
                    j13 = j12;
                    str4 = str3;
                    hVar3 = hVar1111110;
                    j14 = j1111111111117;
                    bVar4 = bVar1111111;
                    IntercomTopBarIcon intercomTopBarIcon1111110 = intercomTopBarIcon2;
                    qVar5 = qVar4;
                    intercomTopBarIcon3 = intercomTopBarIcon1111110;
                } else {
                    str3 = str2;
                }
                J4.i.d(i22, c1086gP, i22, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC11111111111111111111111113);
                androidx.compose.ui.h hVar1111111 = hVar2;
                androidx.compose.ui.h hVarH111118 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j1111111111119 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC11111111111111111111111118 = ClickableKt.c(hVarH111118, false, null, (Ia.a) objF, 7);
                E eD111118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111111111111111111 = c1086gP.P();
                androidx.compose.ui.h hVarC11111111111111111111111119 = ComposedModifierKt.c(c1086gP, hVarC11111111111111111111111118);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD111118);
                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111111);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC11111111111111111111111119);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ111118 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA111111117 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111111111111111112 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111111111110 = ComposedModifierKt.c(c1086gP, hVarJ111118);
                c1086gP.r();
                androidx.compose.ui.d.b bVar1111112 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA111111117);
                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111112);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111111111110);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111111111110 = j11;
                    j12 = j11111111111110;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111111110, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF111118 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA111118 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111111113 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111111111111 = ComposedModifierKt.c(c1086gP, hVarF111118);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA111118);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111113);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111111111);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar1111111;
                j14 = j1111111111119;
                bVar4 = bVar1111112;
                IntercomTopBarIcon intercomTopBarIcon1111111 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon1111111;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 12582912;
        if ((i12 & 23967451) == 4793490) {
            c1086gP.r0();
            i21 = i10 & 1;
            aVar3 = androidx.compose.ui.d.a.f13346m;
            aVar4 = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                if (i30 != 0) {
                    hVar2 = aVar4;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVar3 = aVar3;
                } else {
                    bVar3 = bVar;
                }
                if ((i11 & 16) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if (i17 != 0) {
                    nVar = new n();
                } else {
                    nVar = aVar;
                }
                if (i19 != 0) {
                    j11 = jM642getOnHeader0d7_KjU;
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                    j11 = jM642getOnHeader0d7_KjU;
                }
            } else {
                if (i30 != 0) {
                    hVar2 = aVar4;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVar3 = aVar3;
                } else {
                    bVar3 = bVar;
                }
                if ((i11 & 16) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if (i17 != 0) {
                    nVar = new n();
                } else {
                    nVar = aVar;
                }
                if (i19 != 0) {
                    j11 = jM642getOnHeader0d7_KjU;
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                    j11 = jM642getOnHeader0d7_KjU;
                }
            }
            c1086gP.U();
            C0953m c0953mA111111118 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
            i22 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P111111111111111111114 = c1086gP.P();
            androidx.compose.ui.h hVarC111111111111111111111111112 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA111111118);
            pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111114);
            pVar3 = ComposeUiNode.Companion.f14338g;
            qVar3 = qVar2;
            if (c1086gP.f12995O) {
                str3 = str2;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                }
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC111111111111111111111111112);
                androidx.compose.ui.h hVar1111112 = hVar2;
                androidx.compose.ui.h hVarH111119 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j11111111111111 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC111111111111111111111111113 = ClickableKt.c(hVarH111119, false, null, (Ia.a) objF, 7);
                E eD111119 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111111111111111115 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111111111114 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111111111113);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD111119);
                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111115);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111111111114);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ111119 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA111111119 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111111111111111116 = c1086gP.P();
                androidx.compose.ui.h hVarC111111111111111111111111115 = ComposedModifierKt.c(c1086gP, hVarJ111119);
                c1086gP.r();
                androidx.compose.ui.d.b bVar1111113 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA111111119);
                R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111116);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC111111111111111111111111115);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111111111112 = j11;
                    j12 = j11111111111112;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111111112, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF111119 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA111119 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111111111111111111117 = c1086gP.P();
                    androidx.compose.ui.h hVarC111111111111111111111111116 = ComposedModifierKt.c(c1086gP, hVarF111119);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA111119);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC111111111111111111111111116);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar1111112;
                j14 = j11111111111111;
                bVar4 = bVar1111113;
                IntercomTopBarIcon intercomTopBarIcon1111112 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon1111112;
            } else {
                str3 = str2;
            }
            J4.i.d(i22, c1086gP, i22, pVar3);
            pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC111111111111111111111111112);
            androidx.compose.ui.h hVar1111113 = hVar2;
            androidx.compose.ui.h hVarH1111110 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
            c1086gP.L(86796077);
            if ((i12 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                    @Override // Ia.a
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                    @Override // Ia.a
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            long j11111111111113 = jM635getHeader0d7_KjU;
            androidx.compose.ui.h hVarC111111111111111111111111117 = ClickableKt.c(hVarH1111110, false, null, (Ia.a) objF, 7);
            E eD1111110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i23 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P111111111111111111118 = c1086gP.P();
            androidx.compose.ui.h hVarC111111111111111111111111118 = ComposedModifierKt.c(c1086gP, hVarC111111111111111111111111117);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD1111110);
            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111118);
            if (c1086gP.f12995O) {
                J4.i.d(i23, c1086gP, i23, pVar3);
            } else {
                J4.i.d(i23, c1086gP, i23, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC111111111111111111111111118);
            c0949i = C0949i.f10304a;
            if (intercomTopBarIcon2 != null) {
                i24 = 16;
                f10 = 16;
            } else {
                i24 = 16;
                f10 = 16;
            }
            androidx.compose.ui.h hVarJ1111110 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
            i25 = i12 >> 3;
            C0953m c0953mA1111111110 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            i26 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P111111111111111111119 = c1086gP.P();
            androidx.compose.ui.h hVarC111111111111111111111111119 = ComposedModifierKt.c(c1086gP, hVarJ1111110);
            c1086gP.r();
            androidx.compose.ui.d.b bVar1111114 = bVar3;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA1111111110);
            R0.a(pVar2, c1086gP, interfaceC1089h0P111111111111111111119);
            if (c1086gP.f12995O) {
                J4.i.d(i26, c1086gP, i26, pVar3);
            } else {
                J4.i.d(i26, c1086gP, i26, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC111111111111111111111111119);
            c1086gP.L(560412879);
            if (str3 != null) {
                z11 = false;
                aVar6 = aVar5;
                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
            } else {
                aVar6 = aVar5;
                z11 = false;
            }
            c1086gP.T(z11);
            c1086gP.T(true);
            c1086gP.L(-1319827237);
            if (intercomTopBarIcon2 != null) {
                final long j11111111111114 = j11;
                j12 = j11111111111114;
                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111111114, interfaceC1084f2, 392, 0);
                        }
                    }
                }, c1086gP), c1086gP, 196608, 28);
                z12 = false;
            } else {
                j12 = j11;
                z12 = z11;
            }
            c1086gP.T(z12);
            c1086gP.L(-1319809649);
            if (qVar3 != null) {
                androidx.compose.ui.h hVarF1111110 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                T tA1111110 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111111110 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111111110 = ComposedModifierKt.c(c1086gP, hVarF1111110);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar6);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, tA1111110);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111110);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar3);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111111110);
                qVar4 = qVar3;
                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                r10 = 1;
                c1086gP.T(true);
            } else {
                qVar4 = qVar3;
                r10 = 1;
            }
            c1086gP.T(false);
            c1086gP.T(r10);
            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
            c1086gP.T(r10);
            j13 = j12;
            str4 = str3;
            hVar3 = hVar1111113;
            j14 = j11111111111113;
            bVar4 = bVar1111114;
            IntercomTopBarIcon intercomTopBarIcon1111113 = intercomTopBarIcon2;
            qVar5 = qVar4;
            intercomTopBarIcon3 = intercomTopBarIcon1111113;
        } else {
            c1086gP.r0();
            i21 = i10 & 1;
            aVar3 = androidx.compose.ui.d.a.f13346m;
            aVar4 = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                if (i30 != 0) {
                    hVar2 = aVar4;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVar3 = aVar3;
                } else {
                    bVar3 = bVar;
                }
                if ((i11 & 16) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if (i17 != 0) {
                    nVar = new n();
                } else {
                    nVar = aVar;
                }
                if (i19 != 0) {
                    j11 = jM642getOnHeader0d7_KjU;
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                    j11 = jM642getOnHeader0d7_KjU;
                }
            } else {
                if (i30 != 0) {
                    hVar2 = aVar4;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i13 != 0) {
                    intercomTopBarIcon2 = null;
                }
                if (i15 != 0) {
                    bVar3 = aVar3;
                } else {
                    bVar3 = bVar;
                }
                if ((i11 & 16) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m635getHeader0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m642getOnHeader0d7_KjU();
                    i12 &= -458753;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if (i17 != 0) {
                    nVar = new n();
                } else {
                    nVar = aVar;
                }
                if (i19 != 0) {
                    j11 = jM642getOnHeader0d7_KjU;
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                    j11 = jM642getOnHeader0d7_KjU;
                }
            }
            c1086gP.U();
            C0953m c0953mA1111111111 = C0952l.a(C0945e.f10286c, aVar3, c1086gP, 0);
            i22 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111111111111111111111 = c1086gP.P();
            androidx.compose.ui.h hVarC1111111111111111111111111111 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA1111111111);
            pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111111);
            pVar3 = ComposeUiNode.Companion.f14338g;
            qVar3 = qVar2;
            if (c1086gP.f12995O) {
                str3 = str2;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                }
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111111111);
                androidx.compose.ui.h hVar1111114 = hVar2;
                androidx.compose.ui.h hVarH1111111 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
                c1086gP.L(86796077);
                if ((i12 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                        @Override // Ia.a
                        public final Object invoke() {
                            return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                long j11111111111115 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC1111111111111111111111111112 = ClickableKt.c(hVarH1111111, false, null, (Ia.a) objF, 7);
                E eD1111111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111111112 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111111113 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111111111112);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD1111111);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111112);
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111111113);
                c0949i = C0949i.f10304a;
                if (intercomTopBarIcon2 != null) {
                    i24 = 16;
                    f10 = 16;
                } else {
                    i24 = 16;
                    f10 = 16;
                }
                androidx.compose.ui.h hVarJ1111111 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
                i25 = i12 >> 3;
                C0953m c0953mA1111111112 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111111113 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111111114 = ComposedModifierKt.c(c1086gP, hVarJ1111111);
                c1086gP.r();
                androidx.compose.ui.d.b bVar1111115 = bVar3;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, c0953mA1111111112);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111113);
                if (c1086gP.f12995O) {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                } else {
                    J4.i.d(i26, c1086gP, i26, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111111114);
                c1086gP.L(560412879);
                if (str3 != null) {
                    z11 = false;
                    aVar6 = aVar5;
                    TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
                } else {
                    aVar6 = aVar5;
                    z11 = false;
                }
                c1086gP.T(z11);
                c1086gP.T(true);
                c1086gP.L(-1319827237);
                if (intercomTopBarIcon2 != null) {
                    final long j11111111111116 = j11;
                    j12 = j11111111111116;
                    IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                            if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111111116, interfaceC1084f2, 392, 0);
                            }
                        }
                    }, c1086gP), c1086gP, 196608, 28);
                    z12 = false;
                } else {
                    j12 = j11;
                    z12 = z11;
                }
                c1086gP.T(z12);
                c1086gP.L(-1319809649);
                if (qVar3 != null) {
                    androidx.compose.ui.h hVarF1111111 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                    T tA1111111 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111111111111111111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111111111111111111111111115 = ComposedModifierKt.c(c1086gP, hVarF1111111);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar6);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA1111111);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC1111111111111111111111111115);
                    qVar4 = qVar3;
                    qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    r10 = 1;
                    c1086gP.T(true);
                } else {
                    qVar4 = qVar3;
                    r10 = 1;
                }
                c1086gP.T(false);
                c1086gP.T(r10);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
                c1086gP.T(r10);
                j13 = j12;
                str4 = str3;
                hVar3 = hVar1111114;
                j14 = j11111111111115;
                bVar4 = bVar1111115;
                IntercomTopBarIcon intercomTopBarIcon1111114 = intercomTopBarIcon2;
                qVar5 = qVar4;
                intercomTopBarIcon3 = intercomTopBarIcon1111114;
            } else {
                str3 = str2;
            }
            J4.i.d(i22, c1086gP, i22, pVar3);
            pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC1111111111111111111111111111);
            androidx.compose.ui.h hVar1111115 = hVar2;
            androidx.compose.ui.h hVarH1111112 = PaddingKt.h(W.e(W.d(ComposedModifierKt.a(C0932d.b(hVar2, jM635getHeader0d7_KjU, h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 1.0f), 56), 4, 0.0f, 2);
            c1086gP.L(86796077);
            if ((i12 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                    @Override // Ia.a
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.ui.component.o
                    @Override // Ia.a
                    public final Object invoke() {
                        return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(nVar);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            long j11111111111117 = jM635getHeader0d7_KjU;
            androidx.compose.ui.h hVarC1111111111111111111111111116 = ClickableKt.c(hVarH1111112, false, null, (Ia.a) objF, 7);
            E eD1111112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i23 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111111111111111111115 = c1086gP.P();
            androidx.compose.ui.h hVarC1111111111111111111111111117 = ComposedModifierKt.c(c1086gP, hVarC1111111111111111111111111116);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD1111112);
            R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111115);
            if (c1086gP.f12995O) {
                J4.i.d(i23, c1086gP, i23, pVar3);
            } else {
                J4.i.d(i23, c1086gP, i23, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC1111111111111111111111111117);
            c0949i = C0949i.f10304a;
            if (intercomTopBarIcon2 != null) {
                i24 = 16;
                f10 = 16;
            } else {
                i24 = 16;
                f10 = 16;
            }
            androidx.compose.ui.h hVarJ1111112 = PaddingKt.j(W.f10226c, f10, 0.0f, i24, 0.0f, 10);
            i25 = i12 >> 3;
            C0953m c0953mA1111111113 = C0952l.a(C0945e.f10288e, bVar3, c1086gP, 6 | ((((i25 & 896) | 48) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            i26 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111111111111111111116 = c1086gP.P();
            androidx.compose.ui.h hVarC1111111111111111111111111118 = ComposedModifierKt.c(c1086gP, hVarJ1111112);
            c1086gP.r();
            androidx.compose.ui.d.b bVar1111116 = bVar3;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA1111111113);
            R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111116);
            if (c1086gP.f12995O) {
                J4.i.d(i26, c1086gP, i26, pVar3);
            } else {
                J4.i.d(i26, c1086gP, i26, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC1111111111111111111111111118);
            c1086gP.L(560412879);
            if (str3 != null) {
                z11 = false;
                aVar6 = aVar5;
                TextKt.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, 6).getType03(), j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, i25 & 14, 3120, 55294);
            } else {
                aVar6 = aVar5;
                z11 = false;
            }
            c1086gP.T(z11);
            c1086gP.T(true);
            c1086gP.L(-1319827237);
            if (intercomTopBarIcon2 != null) {
                final long j11111111111118 = j11;
                j12 = j11111111111118;
                IconButtonKt.b(intercomTopBarIcon2.getOnClick(), c0949i.f(aVar4, androidx.compose.ui.d.a.f13338d), false, null, null, androidx.compose.runtime.internal.a.b(-1057882757, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i32) {
                        if ((i32 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(intercomTopBarIcon2.getIconRes(), interfaceC1084f2, 0), intercomTopBarIcon2.getContentDescription(), W.m(androidx.compose.ui.h.a.f13984b, 24), j11111111111118, interfaceC1084f2, 392, 0);
                        }
                    }
                }, c1086gP), c1086gP, 196608, 28);
                z12 = false;
            } else {
                j12 = j11;
                z12 = z11;
            }
            c1086gP.T(z12);
            c1086gP.L(-1319809649);
            if (qVar3 != null) {
                androidx.compose.ui.h hVarF1111112 = c0949i.f(W.u(W.c(r40, 1.0f)), androidx.compose.ui.d.a.f13340f);
                T tA1111112 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111111111111111111117 = c1086gP.P();
                androidx.compose.ui.h hVarC1111111111111111111111111119 = ComposedModifierKt.c(c1086gP, hVarF1111112);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar6);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, tA1111112);
                R0.a(pVar2, c1086gP, interfaceC1089h0P1111111111111111111117);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar3);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC1111111111111111111111111119);
                qVar4 = qVar3;
                qVar4.invoke(V.f10222a, c1086gP, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                r10 = 1;
                c1086gP.T(true);
            } else {
                qVar4 = qVar3;
                r10 = 1;
            }
            c1086gP.T(false);
            c1086gP.T(r10);
            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, r10);
            c1086gP.T(r10);
            j13 = j12;
            str4 = str3;
            hVar3 = hVar1111115;
            j14 = j11111111111117;
            bVar4 = bVar1111116;
            IntercomTopBarIcon intercomTopBarIcon1111115 = intercomTopBarIcon2;
            qVar5 = qVar4;
            intercomTopBarIcon3 = intercomTopBarIcon1111115;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.p
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(hVar3, str4, intercomTopBarIcon3, bVar4, j14, j13, nVar, qVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-358701081);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m510getLambda1$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomTopBarPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        IntercomTopBarPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithMenuItems(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2022840780);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m514getLambda5$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomTopBarPreviewWithMenuItems$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        IntercomTopBarPreviewWithMenuItems(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithoutNavIcon(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-110907621);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m511getLambda2$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomTopBarPreviewWithoutNavIcon$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        IntercomTopBarPreviewWithoutNavIcon(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Ia.a aVar) {
        aVar.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomTopBar_bogVsAg$lambda$7(androidx.compose.ui.h hVar, String str, IntercomTopBarIcon intercomTopBarIcon, androidx.compose.ui.d.b bVar, long j, long j10, Ia.a aVar, Ia.q qVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        m542IntercomTopBarbogVsAg(hVar, str, intercomTopBarIcon, bVar, j, j10, aVar, qVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
