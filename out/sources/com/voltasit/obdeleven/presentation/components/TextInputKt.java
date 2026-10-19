package com.voltasit.obdeleven.presentation.components;

import Ia.l;
import Ia.p;
import S4.o;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.foundation.text.j;
import androidx.compose.foundation.text.k;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TextInput.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TextInputKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0162  */
    /* JADX WARN: Code duplicated, block: B:102:0x0170  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0270  */
    /* JADX WARN: Code duplicated, block: B:128:0x0275  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x014b  */
    /* JADX WARN: Code duplicated, block: B:97:0x014f  */
    public static final void a(h hVar, final String value, final l<? super String, r> onValueChange, final String label, k kVar, final Integer num, Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        h hVar2;
        int i12;
        final k kVar2;
        int i13;
        int i14;
        final Ia.a<r> aVar2;
        int i15;
        h.a aVar3;
        h hVar3;
        k kVar3;
        long jB;
        int i16;
        Ia.a<ComposeUiNode> aVar4;
        p<ComposeUiNode, Integer, r> pVar;
        int i17;
        boolean z10;
        Object objF;
        boolean z11;
        Object objF2;
        Ia.a<r> aVar5;
        C1086g c1086g;
        String strP;
        String str;
        C1105p0 c1105p0V;
        i.e(value, "value");
        i.e(onValueChange, "onValueChange");
        i.e(label, "label");
        C1086g c1086gP = interfaceC1084f.p(1025350983);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(value) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onValueChange) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.K(label) ? 2048 : 1024;
        }
        int i19 = i11 & 16;
        if (i19 == 0) {
            if ((57344 & i10) == 0) {
                kVar2 = kVar;
                i12 |= c1086gP.K(kVar2) ? 16384 : 8192;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.K(num)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                i14 = i11 & 64;
                if (i14 != 0) {
                    i12 |= 1572864;
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.k(aVar2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i12 |= i15;
                    }
                }
                if ((i12 & 2995931) == 599186 || !c1086gP.s()) {
                    aVar3 = h.a.f13984b;
                    if (i18 != 0) {
                        hVar3 = aVar3;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i19 != 0) {
                        kVar3 = k.f11351g;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i14 != 0) {
                        aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                            @Override // Ia.a
                            public final /* bridge */ /* synthetic */ r invoke() {
                                return r.f47939a;
                            }
                        };
                    }
                    c1086gP.L(1676434738);
                    if (num != null) {
                        jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
                    } else {
                        jB = e.a.f32283f;
                    }
                    long j = jB;
                    c1086gP.T(false);
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    h hVarC = ComposedModifierKt.c(c1086gP, aVar3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar4 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i16))) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
                    long j10 = H.f13503k;
                    O0 o10 = ColorsKt.f11693a;
                    androidx.compose.material.r rVarB = TextFieldDefaults.b(((C1034j) c1086gP.x(o10)).c(), 0L, j10, j, 0L, 0L, 0L, c1086gP, 2097082);
                    c1086gP.L(-1086846752);
                    i17 = 3670016 & i12;
                    if (i17 == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                    if (z10 || objF == c0153a) {
                        objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(InterfaceC1000i interfaceC1000i) {
                                InterfaceC1000i $receiver = interfaceC1000i;
                                i.e($receiver, "$this$$receiver");
                                aVar2.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    l lVar = (l) objF;
                    c1086gP.T(false);
                    c1086gP.L(-1086846711);
                    if (i17 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11 || objF2 == c0153a) {
                        objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(InterfaceC1000i interfaceC1000i) {
                                InterfaceC1000i $receiver = interfaceC1000i;
                                i.e($receiver, "$this$$receiver");
                                aVar2.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    j jVar = new j(lVar, (l) objF2, null, 58);
                    int i20 = i12 >> 3;
                    h hVar4 = hVar3;
                    aVar5 = aVar2;
                    TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                            }
                            return r.f47939a;
                        }
                    }, c1086gP), null, null, null, false, null, kVar3, jVar, true, 0, 0, null, null, rVarB, c1086gP, (i20 & 14) | 1572864 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
                    c1086g = c1086gP;
                    c1086g.L(-1086846580);
                    if (num == null) {
                        strP = null;
                    } else {
                        strP = o.p(c1086g, num.intValue());
                    }
                    c1086g.T(false);
                    if (strP == null) {
                        str = "";
                    } else {
                        str = strP;
                    }
                    TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o10)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
                    c1086g.T(true);
                    kVar2 = kVar3;
                    hVar2 = hVar4;
                } else {
                    c1086gP.w();
                    c1086g = c1086gP;
                    aVar5 = aVar2;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final h hVar5 = hVar2;
                    final Ia.a<r> aVar6 = aVar5;
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                            num2.intValue();
                            TextInputKt.a(hVar5, value, onValueChange, label, kVar2, num, aVar6, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i13 = 196608;
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 != 0) {
                i12 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
            }
            if ((i12 & 2995931) == 599186) {
                aVar3 = h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i19 != 0) {
                    kVar3 = k.f11351g;
                } else {
                    kVar3 = kVar2;
                }
                if (i14 != 0) {
                    aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                c1086gP.L(1676434738);
                if (num != null) {
                    jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
                } else {
                    jB = e.a.f32283f;
                }
                long j11 = jB;
                c1086gP.T(false);
                C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                h hVarC2 = ComposedModifierKt.c(c1086gP, aVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11834a;
                long j12 = H.f13503k;
                O0 o11 = ColorsKt.f11693a;
                androidx.compose.material.r rVarB2 = TextFieldDefaults.b(((C1034j) c1086gP.x(o11)).c(), 0L, j12, j11, 0L, 0L, 0L, c1086gP, 2097082);
                c1086gP.L(-1086846752);
                i17 = 3670016 & i12;
                if (i17 == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                l lVar2 = (l) objF;
                c1086gP.T(false);
                c1086gP.L(-1086846711);
                if (i17 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                j jVar2 = new j(lVar2, (l) objF2, null, 58);
                int i21 = i12 >> 3;
                h hVar6 = hVar3;
                aVar5 = aVar2;
                TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, null, false, null, kVar3, jVar2, true, 0, 0, null, null, rVarB2, c1086gP, (i21 & 14) | 1572864 | (i21 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
                c1086g = c1086gP;
                c1086g.L(-1086846580);
                if (num == null) {
                    strP = null;
                } else {
                    strP = o.p(c1086g, num.intValue());
                }
                c1086g.T(false);
                if (strP == null) {
                    str = "";
                } else {
                    str = strP;
                }
                TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o11)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
                c1086g.T(true);
                kVar2 = kVar3;
                hVar2 = hVar6;
            } else {
                aVar3 = h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i19 != 0) {
                    kVar3 = k.f11351g;
                } else {
                    kVar3 = kVar2;
                }
                if (i14 != 0) {
                    aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                c1086gP.L(1676434738);
                if (num != null) {
                    jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
                } else {
                    jB = e.a.f32283f;
                }
                long j13 = jB;
                c1086gP.T(false);
                C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                h hVarC3 = ComposedModifierKt.c(c1086gP, aVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11834a;
                long j14 = H.f13503k;
                O0 o12 = ColorsKt.f11693a;
                androidx.compose.material.r rVarB3 = TextFieldDefaults.b(((C1034j) c1086gP.x(o12)).c(), 0L, j14, j13, 0L, 0L, 0L, c1086gP, 2097082);
                c1086gP.L(-1086846752);
                i17 = 3670016 & i12;
                if (i17 == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                l lVar3 = (l) objF;
                c1086gP.T(false);
                c1086gP.L(-1086846711);
                if (i17 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                j jVar3 = new j(lVar3, (l) objF2, null, 58);
                int i22 = i12 >> 3;
                h hVar7 = hVar3;
                aVar5 = aVar2;
                TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, null, false, null, kVar3, jVar3, true, 0, 0, null, null, rVarB3, c1086gP, (i22 & 14) | 1572864 | (i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
                c1086g = c1086gP;
                c1086g.L(-1086846580);
                if (num == null) {
                    strP = null;
                } else {
                    strP = o.p(c1086g, num.intValue());
                }
                c1086g.T(false);
                if (strP == null) {
                    str = "";
                } else {
                    str = strP;
                }
                TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o12)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
                c1086g.T(true);
                kVar2 = kVar3;
                hVar2 = hVar7;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final h hVar8 = hVar2;
                final Ia.a<r> aVar7 = aVar5;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                        num2.intValue();
                        TextInputKt.a(hVar8, value, onValueChange, label, kVar2, num, aVar7, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        kVar2 = kVar;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c1086gP.K(num)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            i14 = i11 & 64;
            if (i14 != 0) {
                i12 |= 1572864;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i12 |= i15;
                }
            }
            if ((i12 & 2995931) == 599186) {
                aVar3 = h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i19 != 0) {
                    kVar3 = k.f11351g;
                } else {
                    kVar3 = kVar2;
                }
                if (i14 != 0) {
                    aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                c1086gP.L(1676434738);
                if (num != null) {
                    jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
                } else {
                    jB = e.a.f32283f;
                }
                long j15 = jB;
                c1086gP.T(false);
                C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                h hVarC4 = ComposedModifierKt.c(c1086gP, aVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                TextFieldDefaults textFieldDefaults4 = TextFieldDefaults.f11834a;
                long j16 = H.f13503k;
                O0 o13 = ColorsKt.f11693a;
                androidx.compose.material.r rVarB4 = TextFieldDefaults.b(((C1034j) c1086gP.x(o13)).c(), 0L, j16, j15, 0L, 0L, 0L, c1086gP, 2097082);
                c1086gP.L(-1086846752);
                i17 = 3670016 & i12;
                if (i17 == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a4 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                l lVar4 = (l) objF;
                c1086gP.T(false);
                c1086gP.L(-1086846711);
                if (i17 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                j jVar4 = new j(lVar4, (l) objF2, null, 58);
                int i23 = i12 >> 3;
                h hVar9 = hVar3;
                aVar5 = aVar2;
                TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, null, false, null, kVar3, jVar4, true, 0, 0, null, null, rVarB4, c1086gP, (i23 & 14) | 1572864 | (i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
                c1086g = c1086gP;
                c1086g.L(-1086846580);
                if (num == null) {
                    strP = null;
                } else {
                    strP = o.p(c1086g, num.intValue());
                }
                c1086g.T(false);
                if (strP == null) {
                    str = "";
                } else {
                    str = strP;
                }
                TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o13)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
                c1086g.T(true);
                kVar2 = kVar3;
                hVar2 = hVar9;
            } else {
                aVar3 = h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar3;
                } else {
                    hVar3 = hVar2;
                }
                if (i19 != 0) {
                    kVar3 = k.f11351g;
                } else {
                    kVar3 = kVar2;
                }
                if (i14 != 0) {
                    aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                c1086gP.L(1676434738);
                if (num != null) {
                    jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
                } else {
                    jB = e.a.f32283f;
                }
                long j17 = jB;
                c1086gP.T(false);
                C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                h hVarC5 = ComposedModifierKt.c(c1086gP, aVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA5);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                TextFieldDefaults textFieldDefaults5 = TextFieldDefaults.f11834a;
                long j18 = H.f13503k;
                O0 o14 = ColorsKt.f11693a;
                androidx.compose.material.r rVarB5 = TextFieldDefaults.b(((C1034j) c1086gP.x(o14)).c(), 0L, j18, j17, 0L, 0L, 0L, c1086gP, 2097082);
                c1086gP.L(-1086846752);
                i17 = 3670016 & i12;
                if (i17 == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a5 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                l lVar5 = (l) objF;
                c1086gP.T(false);
                c1086gP.L(-1086846711);
                if (i17 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1000i interfaceC1000i) {
                            InterfaceC1000i $receiver = interfaceC1000i;
                            i.e($receiver, "$this$$receiver");
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                j jVar5 = new j(lVar5, (l) objF2, null, 58);
                int i24 = i12 >> 3;
                h hVar10 = hVar3;
                aVar5 = aVar2;
                TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), null, null, null, false, null, kVar3, jVar5, true, 0, 0, null, null, rVarB5, c1086gP, (i24 & 14) | 1572864 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
                c1086g = c1086gP;
                c1086g.L(-1086846580);
                if (num == null) {
                    strP = null;
                } else {
                    strP = o.p(c1086g, num.intValue());
                }
                c1086g.T(false);
                if (strP == null) {
                    str = "";
                } else {
                    str = strP;
                }
                TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o14)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
                c1086g.T(true);
                kVar2 = kVar3;
                hVar2 = hVar10;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final h hVar11 = hVar2;
                final Ia.a<r> aVar8 = aVar5;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                        num2.intValue();
                        TextInputKt.a(hVar11, value, onValueChange, label, kVar2, num, aVar8, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i13 = 196608;
        i12 |= i13;
        i14 = i11 & 64;
        if (i14 != 0) {
            i12 |= 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i10 & 3670016) == 0) {
                if (c1086gP.k(aVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
        }
        if ((i12 & 2995931) == 599186) {
            aVar3 = h.a.f13984b;
            if (i18 != 0) {
                hVar3 = aVar3;
            } else {
                hVar3 = hVar2;
            }
            if (i19 != 0) {
                kVar3 = k.f11351g;
            } else {
                kVar3 = kVar2;
            }
            if (i14 != 0) {
                aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ r invoke() {
                        return r.f47939a;
                    }
                };
            }
            c1086gP.L(1676434738);
            if (num != null) {
                jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
            } else {
                jB = e.a.f32283f;
            }
            long j19 = jB;
            c1086gP.T(false);
            C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            h hVarC6 = ComposedModifierKt.c(c1086gP, aVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA6);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            TextFieldDefaults textFieldDefaults6 = TextFieldDefaults.f11834a;
            long j110 = H.f13503k;
            O0 o15 = ColorsKt.f11693a;
            androidx.compose.material.r rVarB6 = TextFieldDefaults.b(((C1034j) c1086gP.x(o15)).c(), 0L, j110, j19, 0L, 0L, 0L, c1086gP, 2097082);
            c1086gP.L(-1086846752);
            i17 = 3670016 & i12;
            if (i17 == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a6 = InterfaceC1084f.a.f12980a;
            if (z10) {
                objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            l lVar6 = (l) objF;
            c1086gP.T(false);
            c1086gP.L(-1086846711);
            if (i17 == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF2 = c1086gP.f();
            if (z11) {
                objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            j jVar6 = new j(lVar6, (l) objF2, null, 58);
            int i25 = i12 >> 3;
            h hVar12 = hVar3;
            aVar5 = aVar2;
            TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, null, null, false, null, kVar3, jVar6, true, 0, 0, null, null, rVarB6, c1086gP, (i25 & 14) | 1572864 | (i25 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
            c1086g = c1086gP;
            c1086g.L(-1086846580);
            if (num == null) {
                strP = null;
            } else {
                strP = o.p(c1086g, num.intValue());
            }
            c1086g.T(false);
            if (strP == null) {
                str = "";
            } else {
                str = strP;
            }
            TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o15)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
            c1086g.T(true);
            kVar2 = kVar3;
            hVar2 = hVar12;
        } else {
            aVar3 = h.a.f13984b;
            if (i18 != 0) {
                hVar3 = aVar3;
            } else {
                hVar3 = hVar2;
            }
            if (i19 != 0) {
                kVar3 = k.f11351g;
            } else {
                kVar3 = kVar2;
            }
            if (i14 != 0) {
                aVar2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$1
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ r invoke() {
                        return r.f47939a;
                    }
                };
            }
            c1086gP.L(1676434738);
            if (num != null) {
                jB = ((C1034j) c1086gP.x(ColorsKt.f11693a)).b();
            } else {
                jB = e.a.f32283f;
            }
            long j111 = jB;
            c1086gP.T(false);
            C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            h hVarC7 = ComposedModifierKt.c(c1086gP, aVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA7);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
            TextFieldDefaults textFieldDefaults7 = TextFieldDefaults.f11834a;
            long j112 = H.f13503k;
            O0 o16 = ColorsKt.f11693a;
            androidx.compose.material.r rVarB7 = TextFieldDefaults.b(((C1034j) c1086gP.x(o16)).c(), 0L, j112, j111, 0L, 0L, 0L, c1086gP, 2097082);
            c1086gP.L(-1086846752);
            i17 = 3670016 & i12;
            if (i17 == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a7 = InterfaceC1084f.a.f12980a;
            if (z10) {
                objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            l lVar7 = (l) objF;
            c1086gP.T(false);
            c1086gP.L(-1086846711);
            if (i17 == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF2 = c1086gP.f();
            if (z11) {
                objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            j jVar7 = new j(lVar7, (l) objF2, null, 58);
            int i26 = i12 >> 3;
            h hVar13 = hVar3;
            aVar5 = aVar2;
            TextFieldKt.a(value, onValueChange, W.d(hVar3, 1.0f), false, false, null, androidx.compose.runtime.internal.a.b(263069493, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$2$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num2.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.b(label, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, null, null, false, null, kVar3, jVar7, true, 0, 0, null, null, rVarB7, c1086gP, (i26 & 14) | 1572864 | (i26 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), ((i12 >> 6) & 896) | 24576, 495544);
            c1086g = c1086gP;
            c1086g.L(-1086846580);
            if (num == null) {
                strP = null;
            } else {
                strP = o.p(c1086g, num.intValue());
            }
            c1086g.T(false);
            if (strP == null) {
                str = "";
            } else {
                str = strP;
            }
            TextKt.b(str, PaddingKt.j(aVar3, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o16)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
            c1086g.T(true);
            kVar2 = kVar3;
            hVar2 = hVar13;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final h hVar14 = hVar2;
            final Ia.a<r> aVar9 = aVar5;
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.TextInputKt$TextInput$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                    num2.intValue();
                    TextInputKt.a(hVar14, value, onValueChange, label, kVar2, num, aVar9, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
