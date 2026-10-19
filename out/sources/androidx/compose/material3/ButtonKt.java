package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Code duplicated, block: B:101:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0202  */
    /* JADX WARN: Code duplicated, block: B:160:0x020d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0215  */
    /* JADX WARN: Code duplicated, block: B:164:0x021a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0220  */
    /* JADX WARN: Code duplicated, block: B:168:0x0225  */
    /* JADX WARN: Code duplicated, block: B:171:0x0230  */
    /* JADX WARN: Code duplicated, block: B:172:0x0242  */
    /* JADX WARN: Code duplicated, block: B:174:0x0251  */
    /* JADX WARN: Code duplicated, block: B:177:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x026d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0285  */
    /* JADX WARN: Code duplicated, block: B:184:0x0288  */
    /* JADX WARN: Code duplicated, block: B:186:0x028c  */
    /* JADX WARN: Code duplicated, block: B:187:0x028f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0293  */
    /* JADX WARN: Code duplicated, block: B:190:0x0296  */
    /* JADX WARN: Code duplicated, block: B:192:0x029a  */
    /* JADX WARN: Code duplicated, block: B:193:0x029d  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:197:0x02be  */
    /* JADX WARN: Code duplicated, block: B:200:0x02db  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ee A[PHI: r13 r42
      0x02ee: PHI (r13v13 boolean) = (r13v11 boolean), (r13v14 boolean) binds: [B:205:0x02ec, B:201:0x02e3] A[DONT_GENERATE, DONT_INLINE]
      0x02ee: PHI (r42v6 androidx.compose.foundation.layout.L) = (r42v4 androidx.compose.foundation.layout.L), (r42v7 androidx.compose.foundation.layout.L) binds: [B:205:0x02ec, B:201:0x02e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0300  */
    /* JADX WARN: Code duplicated, block: B:218:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x0315  */
    /* JADX WARN: Code duplicated, block: B:223:0x0339  */
    /* JADX WARN: Code duplicated, block: B:224:0x0344  */
    /* JADX WARN: Code duplicated, block: B:228:0x0390  */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    public static final void a(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.ui.graphics.l0 l0Var, C1050e c1050e, C1052g c1052g, C0937i c0937i, androidx.compose.foundation.layout.L l10, androidx.compose.foundation.interaction.k kVar, final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.l0 l0VarA;
        C1050e c1050eC;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C1052g c1052gB;
        C0937i c0937i2;
        androidx.compose.foundation.layout.L l11;
        androidx.compose.foundation.interaction.k kVar2;
        androidx.compose.foundation.layout.L l12;
        androidx.compose.ui.h hVar3;
        int i22;
        Object obj;
        androidx.compose.foundation.interaction.k kVar3;
        long j;
        final long j10;
        int i23;
        Object objF;
        SnapshotStateList snapshotStateList;
        boolean zK;
        Object objF2;
        androidx.compose.foundation.interaction.i iVar;
        float f10;
        Object objF3;
        Animatable animatable;
        boolean z12;
        androidx.compose.foundation.layout.L l13;
        boolean z13;
        boolean zK2;
        Object objF4;
        C0908h c0908h;
        ?? r10;
        float f11;
        final androidx.compose.ui.h hVar4;
        C1052g c1052g2;
        final androidx.compose.foundation.layout.L l14;
        final boolean z14;
        final androidx.compose.foundation.interaction.k kVar4;
        final androidx.compose.ui.graphics.l0 l0Var2;
        Object objF5;
        C1105p0 c1105p0V;
        int i24;
        C1086g c1086gP = interfaceC1084f.p(650121315);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = 2 & i11;
        if (i25 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0VarA = l0Var;
                        int i26 = c1086gP.K(l0VarA) ? 2048 : 1024;
                        i12 |= i26;
                    } else {
                        l0VarA = l0Var;
                    }
                    i12 |= i26;
                } else {
                    l0VarA = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1050eC = c1050e;
                        int i27 = c1086gP.K(c1050eC) ? 16384 : 8192;
                        i12 |= i27;
                    } else {
                        c1050eC = c1050e;
                    }
                    i12 |= i27;
                } else {
                    c1050eC = c1050e;
                }
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0 || !c1086gP.K(c1052g)) {
                        i24 = 65536;
                    } else {
                        i24 = 131072;
                    }
                    i12 |= i24;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = 128 & i11;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((100663296 & i10) == 0) {
                        if (c1086gP.K(kVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((306783379 & i12) == 306783378 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i25 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                i12 &= -7169;
                                l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                            }
                            if ((16 & i11) != 0) {
                                androidx.compose.foundation.layout.N n11 = C1051f.f12444a;
                                i12 &= -57345;
                                c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            }
                            if ((32 & i11) != 0) {
                                c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                                i12 &= -458753;
                            } else {
                                c1052gB = c1052g;
                            }
                            if (i15 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                            if (i17 != 0) {
                                l11 = C1051f.f12444a;
                            } else {
                                l11 = l10;
                            }
                            if (i19 != 0) {
                                kVar2 = null;
                            } else {
                                kVar2 = kVar;
                            }
                            int i28 = i12;
                            l12 = l11;
                            hVar3 = hVar2;
                            i22 = i28;
                        } else {
                            c1086gP.w();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((16 & i11) != 0) {
                                i12 &= -57345;
                            }
                            if ((32 & i11) != 0) {
                                i12 &= -458753;
                            }
                            c1052gB = c1052g;
                            c0937i2 = c0937i;
                            kVar2 = kVar;
                            hVar3 = hVar2;
                            z11 = z11;
                            i22 = i12;
                            l12 = l10;
                        }
                        c1086gP.U();
                        c1086gP.L(-239156623);
                        obj = InterfaceC1084f.a.f12980a;
                        if (kVar2 == null) {
                            objF5 = c1086gP.f();
                            if (objF5 == obj) {
                                objF5 = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF5);
                            }
                            kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                        } else {
                            kVar3 = kVar2;
                        }
                        c1086gP.T(false);
                        if (z11) {
                            j = c1050eC.f12438a;
                        } else {
                            j = c1050eC.f12440c;
                        }
                        if (z11 != 0) {
                            j10 = c1050eC.f12439b;
                        } else {
                            j10 = c1050eC.f12441d;
                        }
                        C1050e c1050e2 = c1050eC;
                        c1086gP.L(-239150048);
                        if (c1052gB == null) {
                            j = j;
                            l0VarA = l0VarA;
                            i22 = i22;
                            kVar3 = kVar3;
                            c0908h = null;
                            r10 = 0;
                            z12 = z11;
                            l13 = l12;
                        } else {
                            i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                            objF = c1086gP.f();
                            if (objF == obj) {
                                objF = new SnapshotStateList();
                                c1086gP.E(objF);
                            }
                            snapshotStateList = (SnapshotStateList) objF;
                            zK = c1086gP.K(kVar3);
                            objF2 = c1086gP.f();
                            if (zK || objF2 == obj) {
                                objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                                c1086gP.E(objF2);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                            iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                            if (z11 == 0) {
                                f10 = c1052gB.f12453e;
                            } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                                f10 = c1052gB.f12450b;
                            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                                f10 = c1052gB.f12452d;
                            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                                f10 = c1052gB.f12451c;
                            } else {
                                f10 = c1052gB.f12449a;
                            }
                            objF3 = c1086gP.f();
                            if (objF3 == obj) {
                                objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                                c1086gP.E(objF3);
                            }
                            animatable = (Animatable) objF3;
                            p013b0.f fVar = new p013b0.f(f10);
                            boolean zK3 = c1086gP.k(animatable) | c1086gP.g(f10);
                            if (((i23 & 14) ^ 6) > 4) {
                                z12 = z11;
                                l13 = l12;
                                if (c1086gP.c(z12)) {
                                    z13 = true;
                                }
                                zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK3 | z13 | c1086gP.k(iVar);
                                objF4 = c1086gP.f();
                                if (zK2 || objF4 == obj) {
                                    objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                    c1086gP.E(objF4);
                                }
                                androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar);
                                c0908h = animatable.f9338c;
                                r10 = 0;
                            } else {
                                z12 = z11;
                                l13 = l12;
                            }
                            if ((i23 & 6) == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK3 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        }
                        c1086gP.T(r10);
                        if (c0908h != null) {
                            f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                        } else {
                            f11 = (float) r10;
                        }
                        final androidx.compose.foundation.layout.L l15 = l13;
                        int i29 = i22;
                        boolean z15 = z12;
                        SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.k(wVar, 0);
                                return p293xa.r.f47939a;
                            }
                        }), z15, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    long j11 = j10;
                                    androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                    final androidx.compose.foundation.layout.L l16 = l15;
                                    final Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                    ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l16);
                                                C0945e.c cVar = C0945e.f10288e;
                                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                                int iF = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar2);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                    androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                                qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                                interfaceC1084f5.J();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i29 & 8078) | (234881024 & (i29 << 6)), 64);
                        hVar4 = hVar3;
                        c1052g2 = c1052gB;
                        l14 = l15;
                        z14 = z15;
                        kVar4 = kVar2;
                        c1050eC = c1050e2;
                        l0Var2 = l0VarA;
                    } else {
                        c1086gP.w();
                        c1052g2 = c1052g;
                        c0937i2 = c0937i;
                        kVar4 = kVar;
                        l0Var2 = l0VarA;
                        hVar4 = hVar2;
                        z14 = z11;
                        l14 = l10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final C1050e c1050e3 = c1050eC;
                        final C1052g c1052g3 = c1052g2;
                        final C0937i c0937i3 = c0937i2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e3, c1052g3, c0937i3, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((306783379 & i12) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n12 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n13 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i210 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i210;
                    } else {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n14 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n15 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i211 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i211;
                    }
                    c1086gP.U();
                    c1086gP.L(-239156623);
                    obj = InterfaceC1084f.a.f12980a;
                    if (kVar2 == null) {
                        objF5 = c1086gP.f();
                        if (objF5 == obj) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1050eC.f12438a;
                    } else {
                        j = c1050eC.f12440c;
                    }
                    if (z11 != 0) {
                        j10 = c1050eC.f12439b;
                    } else {
                        j10 = c1050eC.f12441d;
                    }
                    C1050e c1050e4 = c1050eC;
                    c1086gP.L(-239150048);
                    if (c1052gB == null) {
                        j = j;
                        l0VarA = l0VarA;
                        i22 = i22;
                        kVar3 = kVar3;
                        c0908h = null;
                        r10 = 0;
                        z12 = z11;
                        l13 = l12;
                    } else {
                        i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                        objF = c1086gP.f();
                        if (objF == obj) {
                            objF = new SnapshotStateList();
                            c1086gP.E(objF);
                        }
                        snapshotStateList = (SnapshotStateList) objF;
                        zK = c1086gP.K(kVar3);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                        if (z11 == 0) {
                            f10 = c1052gB.f12453e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                            f10 = c1052gB.f12450b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f10 = c1052gB.f12452d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f10 = c1052gB.f12451c;
                        } else {
                            f10 = c1052gB.f12449a;
                        }
                        objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                            c1086gP.E(objF3);
                        }
                        animatable = (Animatable) objF3;
                        p013b0.f fVar2 = new p013b0.f(f10);
                        boolean zK4 = c1086gP.k(animatable) | c1086gP.g(f10);
                        if (((i23 & 14) ^ 6) > 4) {
                            z12 = z11;
                            l13 = l12;
                            if (c1086gP.c(z12)) {
                                z13 = true;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK4 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar2);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        } else {
                            z12 = z11;
                            l13 = l12;
                        }
                        if ((i23 & 6) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK4 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar2);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    }
                    c1086gP.T(r10);
                    if (c0908h != null) {
                        f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f11 = (float) r10;
                    }
                    final androidx.compose.foundation.layout.L l16 = l13;
                    int i212 = i22;
                    boolean z16 = z12;
                    SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), z16, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j11 = j10;
                                androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                final androidx.compose.foundation.layout.L l17 = l16;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l17);
                                            C0945e.c cVar = C0945e.f10288e;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                            int iF = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar2);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                            qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i212 & 8078) | (234881024 & (i212 << 6)), 64);
                    hVar4 = hVar3;
                    c1052g2 = c1052gB;
                    l14 = l16;
                    z14 = z16;
                    kVar4 = kVar2;
                    c1050eC = c1050e4;
                    l0Var2 = l0VarA;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n16 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n17 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i213 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i213;
                    } else {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n18 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n19 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i214 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i214;
                    }
                    c1086gP.U();
                    c1086gP.L(-239156623);
                    obj = InterfaceC1084f.a.f12980a;
                    if (kVar2 == null) {
                        objF5 = c1086gP.f();
                        if (objF5 == obj) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1050eC.f12438a;
                    } else {
                        j = c1050eC.f12440c;
                    }
                    if (z11 != 0) {
                        j10 = c1050eC.f12439b;
                    } else {
                        j10 = c1050eC.f12441d;
                    }
                    C1050e c1050e5 = c1050eC;
                    c1086gP.L(-239150048);
                    if (c1052gB == null) {
                        j = j;
                        l0VarA = l0VarA;
                        i22 = i22;
                        kVar3 = kVar3;
                        c0908h = null;
                        r10 = 0;
                        z12 = z11;
                        l13 = l12;
                    } else {
                        i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                        objF = c1086gP.f();
                        if (objF == obj) {
                            objF = new SnapshotStateList();
                            c1086gP.E(objF);
                        }
                        snapshotStateList = (SnapshotStateList) objF;
                        zK = c1086gP.K(kVar3);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                        if (z11 == 0) {
                            f10 = c1052gB.f12453e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                            f10 = c1052gB.f12450b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f10 = c1052gB.f12452d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f10 = c1052gB.f12451c;
                        } else {
                            f10 = c1052gB.f12449a;
                        }
                        objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                            c1086gP.E(objF3);
                        }
                        animatable = (Animatable) objF3;
                        p013b0.f fVar3 = new p013b0.f(f10);
                        boolean zK5 = c1086gP.k(animatable) | c1086gP.g(f10);
                        if (((i23 & 14) ^ 6) > 4) {
                            z12 = z11;
                            l13 = l12;
                            if (c1086gP.c(z12)) {
                                z13 = true;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK5 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar3);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        } else {
                            z12 = z11;
                            l13 = l12;
                        }
                        if ((i23 & 6) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK5 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar3);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    }
                    c1086gP.T(r10);
                    if (c0908h != null) {
                        f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f11 = (float) r10;
                    }
                    final androidx.compose.foundation.layout.L l17 = l13;
                    int i215 = i22;
                    boolean z17 = z12;
                    SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), z17, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j11 = j10;
                                androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                final androidx.compose.foundation.layout.L l18 = l17;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l18);
                                            C0945e.c cVar = C0945e.f10288e;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                            int iF = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar2);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                            qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i215 & 8078) | (234881024 & (i215 << 6)), 64);
                    hVar4 = hVar3;
                    c1052g2 = c1052gB;
                    l14 = l17;
                    z14 = z17;
                    kVar4 = kVar2;
                    c1050eC = c1050e5;
                    l0Var2 = l0VarA;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1050e c1050e6 = c1050eC;
                    final C1052g c1052g4 = c1052g2;
                    final C0937i c0937i4 = c0937i2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e6, c1052g4, c0937i4, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                    }
                    i12 |= i26;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i26;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1050eC = c1050e;
                    if (c1086gP.K(c1050eC)) {
                    }
                    i12 |= i27;
                } else {
                    c1050eC = c1050e;
                }
                i12 |= i27;
            } else {
                c1050eC = c1050e;
            }
            if ((i10 & 196608) != 0) {
                if ((i11 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = 128 & i11;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((100663296 & i10) == 0) {
                    if (c1086gP.K(kVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((306783379 & i12) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n110 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n111 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i216 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i216;
                    } else {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n112 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n113 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i217 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i217;
                    }
                    c1086gP.U();
                    c1086gP.L(-239156623);
                    obj = InterfaceC1084f.a.f12980a;
                    if (kVar2 == null) {
                        objF5 = c1086gP.f();
                        if (objF5 == obj) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1050eC.f12438a;
                    } else {
                        j = c1050eC.f12440c;
                    }
                    if (z11 != 0) {
                        j10 = c1050eC.f12439b;
                    } else {
                        j10 = c1050eC.f12441d;
                    }
                    C1050e c1050e7 = c1050eC;
                    c1086gP.L(-239150048);
                    if (c1052gB == null) {
                        j = j;
                        l0VarA = l0VarA;
                        i22 = i22;
                        kVar3 = kVar3;
                        c0908h = null;
                        r10 = 0;
                        z12 = z11;
                        l13 = l12;
                    } else {
                        i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                        objF = c1086gP.f();
                        if (objF == obj) {
                            objF = new SnapshotStateList();
                            c1086gP.E(objF);
                        }
                        snapshotStateList = (SnapshotStateList) objF;
                        zK = c1086gP.K(kVar3);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                        if (z11 == 0) {
                            f10 = c1052gB.f12453e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                            f10 = c1052gB.f12450b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f10 = c1052gB.f12452d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f10 = c1052gB.f12451c;
                        } else {
                            f10 = c1052gB.f12449a;
                        }
                        objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                            c1086gP.E(objF3);
                        }
                        animatable = (Animatable) objF3;
                        p013b0.f fVar4 = new p013b0.f(f10);
                        boolean zK6 = c1086gP.k(animatable) | c1086gP.g(f10);
                        if (((i23 & 14) ^ 6) > 4) {
                            z12 = z11;
                            l13 = l12;
                            if (c1086gP.c(z12)) {
                                z13 = true;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK6 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar4);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        } else {
                            z12 = z11;
                            l13 = l12;
                        }
                        if ((i23 & 6) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK6 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar4);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    }
                    c1086gP.T(r10);
                    if (c0908h != null) {
                        f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f11 = (float) r10;
                    }
                    final androidx.compose.foundation.layout.L l18 = l13;
                    int i218 = i22;
                    boolean z18 = z12;
                    SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), z18, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j11 = j10;
                                androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                final androidx.compose.foundation.layout.L l19 = l18;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l19);
                                            C0945e.c cVar = C0945e.f10288e;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                            int iF = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar2);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                            qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i218 & 8078) | (234881024 & (i218 << 6)), 64);
                    hVar4 = hVar3;
                    c1052g2 = c1052gB;
                    l14 = l18;
                    z14 = z18;
                    kVar4 = kVar2;
                    c1050eC = c1050e7;
                    l0Var2 = l0VarA;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n114 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n115 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i219 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i219;
                    } else {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n116 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n117 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i2110 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i2110;
                    }
                    c1086gP.U();
                    c1086gP.L(-239156623);
                    obj = InterfaceC1084f.a.f12980a;
                    if (kVar2 == null) {
                        objF5 = c1086gP.f();
                        if (objF5 == obj) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1050eC.f12438a;
                    } else {
                        j = c1050eC.f12440c;
                    }
                    if (z11 != 0) {
                        j10 = c1050eC.f12439b;
                    } else {
                        j10 = c1050eC.f12441d;
                    }
                    C1050e c1050e8 = c1050eC;
                    c1086gP.L(-239150048);
                    if (c1052gB == null) {
                        j = j;
                        l0VarA = l0VarA;
                        i22 = i22;
                        kVar3 = kVar3;
                        c0908h = null;
                        r10 = 0;
                        z12 = z11;
                        l13 = l12;
                    } else {
                        i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                        objF = c1086gP.f();
                        if (objF == obj) {
                            objF = new SnapshotStateList();
                            c1086gP.E(objF);
                        }
                        snapshotStateList = (SnapshotStateList) objF;
                        zK = c1086gP.K(kVar3);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                        if (z11 == 0) {
                            f10 = c1052gB.f12453e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                            f10 = c1052gB.f12450b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f10 = c1052gB.f12452d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f10 = c1052gB.f12451c;
                        } else {
                            f10 = c1052gB.f12449a;
                        }
                        objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                            c1086gP.E(objF3);
                        }
                        animatable = (Animatable) objF3;
                        p013b0.f fVar5 = new p013b0.f(f10);
                        boolean zK7 = c1086gP.k(animatable) | c1086gP.g(f10);
                        if (((i23 & 14) ^ 6) > 4) {
                            z12 = z11;
                            l13 = l12;
                            if (c1086gP.c(z12)) {
                                z13 = true;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK7 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar5);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        } else {
                            z12 = z11;
                            l13 = l12;
                        }
                        if ((i23 & 6) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK7 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar5);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    }
                    c1086gP.T(r10);
                    if (c0908h != null) {
                        f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f11 = (float) r10;
                    }
                    final androidx.compose.foundation.layout.L l19 = l13;
                    int i2111 = i22;
                    boolean z19 = z12;
                    SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), z19, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j11 = j10;
                                androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                final androidx.compose.foundation.layout.L l110 = l19;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l110);
                                            C0945e.c cVar = C0945e.f10288e;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                            int iF = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar2);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                            qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i2111 & 8078) | (234881024 & (i2111 << 6)), 64);
                    hVar4 = hVar3;
                    c1052g2 = c1052gB;
                    l14 = l19;
                    z14 = z19;
                    kVar4 = kVar2;
                    c1050eC = c1050e8;
                    l0Var2 = l0VarA;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1050e c1050e9 = c1050eC;
                    final C1052g c1052g5 = c1052g2;
                    final C0937i c0937i5 = c0937i2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e9, c1052g5, c0937i5, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((306783379 & i12) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n118 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n119 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i2112 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i2112;
                } else {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1110 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1111 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i2113 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i2113;
                }
                c1086gP.U();
                c1086gP.L(-239156623);
                obj = InterfaceC1084f.a.f12980a;
                if (kVar2 == null) {
                    objF5 = c1086gP.f();
                    if (objF5 == obj) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1050eC.f12438a;
                } else {
                    j = c1050eC.f12440c;
                }
                if (z11 != 0) {
                    j10 = c1050eC.f12439b;
                } else {
                    j10 = c1050eC.f12441d;
                }
                C1050e c1050e10 = c1050eC;
                c1086gP.L(-239150048);
                if (c1052gB == null) {
                    j = j;
                    l0VarA = l0VarA;
                    i22 = i22;
                    kVar3 = kVar3;
                    c0908h = null;
                    r10 = 0;
                    z12 = z11;
                    l13 = l12;
                } else {
                    i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                    objF = c1086gP.f();
                    if (objF == obj) {
                        objF = new SnapshotStateList();
                        c1086gP.E(objF);
                    }
                    snapshotStateList = (SnapshotStateList) objF;
                    zK = c1086gP.K(kVar3);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                    if (z11 == 0) {
                        f10 = c1052gB.f12453e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                        f10 = c1052gB.f12450b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f10 = c1052gB.f12452d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f10 = c1052gB.f12451c;
                    } else {
                        f10 = c1052gB.f12449a;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == obj) {
                        objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                        c1086gP.E(objF3);
                    }
                    animatable = (Animatable) objF3;
                    p013b0.f fVar6 = new p013b0.f(f10);
                    boolean zK8 = c1086gP.k(animatable) | c1086gP.g(f10);
                    if (((i23 & 14) ^ 6) > 4) {
                        z12 = z11;
                        l13 = l12;
                        if (c1086gP.c(z12)) {
                            z13 = true;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK8 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar6);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    } else {
                        z12 = z11;
                        l13 = l12;
                    }
                    if ((i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK8 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar6);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                }
                c1086gP.T(r10);
                if (c0908h != null) {
                    f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f11 = (float) r10;
                }
                final androidx.compose.foundation.layout.L l110 = l13;
                int i2114 = i22;
                boolean z110 = z12;
                SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), z110, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j11 = j10;
                            androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                            final androidx.compose.foundation.layout.L l111 = l110;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l111);
                                        C0945e.c cVar = C0945e.f10288e;
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i2114 & 8078) | (234881024 & (i2114 << 6)), 64);
                hVar4 = hVar3;
                c1052g2 = c1052gB;
                l14 = l110;
                z14 = z110;
                kVar4 = kVar2;
                c1050eC = c1050e10;
                l0Var2 = l0VarA;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1112 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1113 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i2115 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i2115;
                } else {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1114 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1115 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i2116 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i2116;
                }
                c1086gP.U();
                c1086gP.L(-239156623);
                obj = InterfaceC1084f.a.f12980a;
                if (kVar2 == null) {
                    objF5 = c1086gP.f();
                    if (objF5 == obj) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1050eC.f12438a;
                } else {
                    j = c1050eC.f12440c;
                }
                if (z11 != 0) {
                    j10 = c1050eC.f12439b;
                } else {
                    j10 = c1050eC.f12441d;
                }
                C1050e c1050e11 = c1050eC;
                c1086gP.L(-239150048);
                if (c1052gB == null) {
                    j = j;
                    l0VarA = l0VarA;
                    i22 = i22;
                    kVar3 = kVar3;
                    c0908h = null;
                    r10 = 0;
                    z12 = z11;
                    l13 = l12;
                } else {
                    i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                    objF = c1086gP.f();
                    if (objF == obj) {
                        objF = new SnapshotStateList();
                        c1086gP.E(objF);
                    }
                    snapshotStateList = (SnapshotStateList) objF;
                    zK = c1086gP.K(kVar3);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                    if (z11 == 0) {
                        f10 = c1052gB.f12453e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                        f10 = c1052gB.f12450b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f10 = c1052gB.f12452d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f10 = c1052gB.f12451c;
                    } else {
                        f10 = c1052gB.f12449a;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == obj) {
                        objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                        c1086gP.E(objF3);
                    }
                    animatable = (Animatable) objF3;
                    p013b0.f fVar7 = new p013b0.f(f10);
                    boolean zK9 = c1086gP.k(animatable) | c1086gP.g(f10);
                    if (((i23 & 14) ^ 6) > 4) {
                        z12 = z11;
                        l13 = l12;
                        if (c1086gP.c(z12)) {
                            z13 = true;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK9 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar7);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    } else {
                        z12 = z11;
                        l13 = l12;
                    }
                    if ((i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK9 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar7);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                }
                c1086gP.T(r10);
                if (c0908h != null) {
                    f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f11 = (float) r10;
                }
                final androidx.compose.foundation.layout.L l111 = l13;
                int i2117 = i22;
                boolean z111 = z12;
                SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), z111, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j11 = j10;
                            androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                            final androidx.compose.foundation.layout.L l112 = l111;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l112);
                                        C0945e.c cVar = C0945e.f10288e;
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i2117 & 8078) | (234881024 & (i2117 << 6)), 64);
                hVar4 = hVar3;
                c1052g2 = c1052gB;
                l14 = l111;
                z14 = z111;
                kVar4 = kVar2;
                c1050eC = c1050e11;
                l0Var2 = l0VarA;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1050e c1050e12 = c1050eC;
                final C1052g c1052g6 = c1052g2;
                final C0937i c0937i6 = c0937i2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e12, c1052g6, c0937i6, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                    }
                    i12 |= i26;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i26;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1050eC = c1050e;
                    if (c1086gP.K(c1050eC)) {
                    }
                    i12 |= i27;
                } else {
                    c1050eC = c1050e;
                }
                i12 |= i27;
            } else {
                c1050eC = c1050e;
            }
            if ((i10 & 196608) != 0) {
                if ((i11 & 32) == 0) {
                    i24 = 65536;
                } else {
                    i24 = 65536;
                }
                i12 |= i24;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = 128 & i11;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((100663296 & i10) == 0) {
                    if (c1086gP.K(kVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((306783379 & i12) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n1116 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n1117 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i2118 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i2118;
                    } else {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n1118 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n1119 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i2119 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i2119;
                    }
                    c1086gP.U();
                    c1086gP.L(-239156623);
                    obj = InterfaceC1084f.a.f12980a;
                    if (kVar2 == null) {
                        objF5 = c1086gP.f();
                        if (objF5 == obj) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1050eC.f12438a;
                    } else {
                        j = c1050eC.f12440c;
                    }
                    if (z11 != 0) {
                        j10 = c1050eC.f12439b;
                    } else {
                        j10 = c1050eC.f12441d;
                    }
                    C1050e c1050e13 = c1050eC;
                    c1086gP.L(-239150048);
                    if (c1052gB == null) {
                        j = j;
                        l0VarA = l0VarA;
                        i22 = i22;
                        kVar3 = kVar3;
                        c0908h = null;
                        r10 = 0;
                        z12 = z11;
                        l13 = l12;
                    } else {
                        i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                        objF = c1086gP.f();
                        if (objF == obj) {
                            objF = new SnapshotStateList();
                            c1086gP.E(objF);
                        }
                        snapshotStateList = (SnapshotStateList) objF;
                        zK = c1086gP.K(kVar3);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                        if (z11 == 0) {
                            f10 = c1052gB.f12453e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                            f10 = c1052gB.f12450b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f10 = c1052gB.f12452d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f10 = c1052gB.f12451c;
                        } else {
                            f10 = c1052gB.f12449a;
                        }
                        objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                            c1086gP.E(objF3);
                        }
                        animatable = (Animatable) objF3;
                        p013b0.f fVar8 = new p013b0.f(f10);
                        boolean zK10 = c1086gP.k(animatable) | c1086gP.g(f10);
                        if (((i23 & 14) ^ 6) > 4) {
                            z12 = z11;
                            l13 = l12;
                            if (c1086gP.c(z12)) {
                                z13 = true;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK10 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar8);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        } else {
                            z12 = z11;
                            l13 = l12;
                        }
                        if ((i23 & 6) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK10 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar8);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    }
                    c1086gP.T(r10);
                    if (c0908h != null) {
                        f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f11 = (float) r10;
                    }
                    final androidx.compose.foundation.layout.L l112 = l13;
                    int i21110 = i22;
                    boolean z112 = z12;
                    SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), z112, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j11 = j10;
                                androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                final androidx.compose.foundation.layout.L l113 = l112;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l113);
                                            C0945e.c cVar = C0945e.f10288e;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                            int iF = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar2);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                            qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i21110 & 8078) | (234881024 & (i21110 << 6)), 64);
                    hVar4 = hVar3;
                    c1052g2 = c1052gB;
                    l14 = l112;
                    z14 = z112;
                    kVar4 = kVar2;
                    c1050eC = c1050e13;
                    l0Var2 = l0VarA;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n11110 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n11111 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i21111 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i21111;
                    } else {
                        if (i25 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n11112 = C1051f.f12444a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n11113 = C1051f.f12444a;
                            i12 &= -57345;
                            c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((32 & i11) != 0) {
                            c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                            i12 &= -458753;
                        } else {
                            c1052gB = c1052g;
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        int i21112 = i12;
                        l12 = l11;
                        hVar3 = hVar2;
                        i22 = i21112;
                    }
                    c1086gP.U();
                    c1086gP.L(-239156623);
                    obj = InterfaceC1084f.a.f12980a;
                    if (kVar2 == null) {
                        objF5 = c1086gP.f();
                        if (objF5 == obj) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1050eC.f12438a;
                    } else {
                        j = c1050eC.f12440c;
                    }
                    if (z11 != 0) {
                        j10 = c1050eC.f12439b;
                    } else {
                        j10 = c1050eC.f12441d;
                    }
                    C1050e c1050e14 = c1050eC;
                    c1086gP.L(-239150048);
                    if (c1052gB == null) {
                        j = j;
                        l0VarA = l0VarA;
                        i22 = i22;
                        kVar3 = kVar3;
                        c0908h = null;
                        r10 = 0;
                        z12 = z11;
                        l13 = l12;
                    } else {
                        i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                        objF = c1086gP.f();
                        if (objF == obj) {
                            objF = new SnapshotStateList();
                            c1086gP.E(objF);
                        }
                        snapshotStateList = (SnapshotStateList) objF;
                        zK = c1086gP.K(kVar3);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                        iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                        if (z11 == 0) {
                            f10 = c1052gB.f12453e;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                            f10 = c1052gB.f12450b;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                            f10 = c1052gB.f12452d;
                        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                            f10 = c1052gB.f12451c;
                        } else {
                            f10 = c1052gB.f12449a;
                        }
                        objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                            c1086gP.E(objF3);
                        }
                        animatable = (Animatable) objF3;
                        p013b0.f fVar9 = new p013b0.f(f10);
                        boolean zK11 = c1086gP.k(animatable) | c1086gP.g(f10);
                        if (((i23 & 14) ^ 6) > 4) {
                            z12 = z11;
                            l13 = l12;
                            if (c1086gP.c(z12)) {
                                z13 = true;
                            }
                            zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK11 | z13 | c1086gP.k(iVar);
                            objF4 = c1086gP.f();
                            if (zK2) {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                                c1086gP.E(objF4);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar9);
                            c0908h = animatable.f9338c;
                            r10 = 0;
                        } else {
                            z12 = z11;
                            l13 = l12;
                        }
                        if ((i23 & 6) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK11 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar9);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    }
                    c1086gP.T(r10);
                    if (c0908h != null) {
                        f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f11 = (float) r10;
                    }
                    final androidx.compose.foundation.layout.L l113 = l13;
                    int i21113 = i22;
                    boolean z113 = z12;
                    SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), z113, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                long j11 = j10;
                                androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                                final androidx.compose.foundation.layout.L l114 = l113;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l114);
                                            C0945e.c cVar = C0945e.f10288e;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                            int iF = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar2);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                            qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                            interfaceC1084f5.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i21113 & 8078) | (234881024 & (i21113 << 6)), 64);
                    hVar4 = hVar3;
                    c1052g2 = c1052gB;
                    l14 = l113;
                    z14 = z113;
                    kVar4 = kVar2;
                    c1050eC = c1050e14;
                    l0Var2 = l0VarA;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1050e c1050e15 = c1050eC;
                    final C1052g c1052g7 = c1052g2;
                    final C0937i c0937i7 = c0937i2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e15, c1052g7, c0937i7, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((306783379 & i12) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11114 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11115 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i21114 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i21114;
                } else {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11116 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11117 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i21115 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i21115;
                }
                c1086gP.U();
                c1086gP.L(-239156623);
                obj = InterfaceC1084f.a.f12980a;
                if (kVar2 == null) {
                    objF5 = c1086gP.f();
                    if (objF5 == obj) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1050eC.f12438a;
                } else {
                    j = c1050eC.f12440c;
                }
                if (z11 != 0) {
                    j10 = c1050eC.f12439b;
                } else {
                    j10 = c1050eC.f12441d;
                }
                C1050e c1050e16 = c1050eC;
                c1086gP.L(-239150048);
                if (c1052gB == null) {
                    j = j;
                    l0VarA = l0VarA;
                    i22 = i22;
                    kVar3 = kVar3;
                    c0908h = null;
                    r10 = 0;
                    z12 = z11;
                    l13 = l12;
                } else {
                    i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                    objF = c1086gP.f();
                    if (objF == obj) {
                        objF = new SnapshotStateList();
                        c1086gP.E(objF);
                    }
                    snapshotStateList = (SnapshotStateList) objF;
                    zK = c1086gP.K(kVar3);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                    if (z11 == 0) {
                        f10 = c1052gB.f12453e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                        f10 = c1052gB.f12450b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f10 = c1052gB.f12452d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f10 = c1052gB.f12451c;
                    } else {
                        f10 = c1052gB.f12449a;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == obj) {
                        objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                        c1086gP.E(objF3);
                    }
                    animatable = (Animatable) objF3;
                    p013b0.f fVar10 = new p013b0.f(f10);
                    boolean zK12 = c1086gP.k(animatable) | c1086gP.g(f10);
                    if (((i23 & 14) ^ 6) > 4) {
                        z12 = z11;
                        l13 = l12;
                        if (c1086gP.c(z12)) {
                            z13 = true;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK12 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar10);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    } else {
                        z12 = z11;
                        l13 = l12;
                    }
                    if ((i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK12 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar10);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                }
                c1086gP.T(r10);
                if (c0908h != null) {
                    f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f11 = (float) r10;
                }
                final androidx.compose.foundation.layout.L l114 = l13;
                int i21116 = i22;
                boolean z114 = z12;
                SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), z114, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j11 = j10;
                            androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                            final androidx.compose.foundation.layout.L l115 = l114;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l115);
                                        C0945e.c cVar = C0945e.f10288e;
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i21116 & 8078) | (234881024 & (i21116 << 6)), 64);
                hVar4 = hVar3;
                c1052g2 = c1052gB;
                l14 = l114;
                z14 = z114;
                kVar4 = kVar2;
                c1050eC = c1050e16;
                l0Var2 = l0VarA;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11118 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11119 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i21117 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i21117;
                } else {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111110 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111111 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i21118 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i21118;
                }
                c1086gP.U();
                c1086gP.L(-239156623);
                obj = InterfaceC1084f.a.f12980a;
                if (kVar2 == null) {
                    objF5 = c1086gP.f();
                    if (objF5 == obj) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1050eC.f12438a;
                } else {
                    j = c1050eC.f12440c;
                }
                if (z11 != 0) {
                    j10 = c1050eC.f12439b;
                } else {
                    j10 = c1050eC.f12441d;
                }
                C1050e c1050e17 = c1050eC;
                c1086gP.L(-239150048);
                if (c1052gB == null) {
                    j = j;
                    l0VarA = l0VarA;
                    i22 = i22;
                    kVar3 = kVar3;
                    c0908h = null;
                    r10 = 0;
                    z12 = z11;
                    l13 = l12;
                } else {
                    i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                    objF = c1086gP.f();
                    if (objF == obj) {
                        objF = new SnapshotStateList();
                        c1086gP.E(objF);
                    }
                    snapshotStateList = (SnapshotStateList) objF;
                    zK = c1086gP.K(kVar3);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                    if (z11 == 0) {
                        f10 = c1052gB.f12453e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                        f10 = c1052gB.f12450b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f10 = c1052gB.f12452d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f10 = c1052gB.f12451c;
                    } else {
                        f10 = c1052gB.f12449a;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == obj) {
                        objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                        c1086gP.E(objF3);
                    }
                    animatable = (Animatable) objF3;
                    p013b0.f fVar11 = new p013b0.f(f10);
                    boolean zK13 = c1086gP.k(animatable) | c1086gP.g(f10);
                    if (((i23 & 14) ^ 6) > 4) {
                        z12 = z11;
                        l13 = l12;
                        if (c1086gP.c(z12)) {
                            z13 = true;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK13 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar11);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    } else {
                        z12 = z11;
                        l13 = l12;
                    }
                    if ((i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK13 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar11);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                }
                c1086gP.T(r10);
                if (c0908h != null) {
                    f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f11 = (float) r10;
                }
                final androidx.compose.foundation.layout.L l115 = l13;
                int i21119 = i22;
                boolean z115 = z12;
                SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), z115, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j11 = j10;
                            androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                            final androidx.compose.foundation.layout.L l116 = l115;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l116);
                                        C0945e.c cVar = C0945e.f10288e;
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i21119 & 8078) | (234881024 & (i21119 << 6)), 64);
                hVar4 = hVar3;
                c1052g2 = c1052gB;
                l14 = l115;
                z14 = z115;
                kVar4 = kVar2;
                c1050eC = c1050e17;
                l0Var2 = l0VarA;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1050e c1050e18 = c1050eC;
                final C1052g c1052g8 = c1052g2;
                final C0937i c0937i8 = c0937i2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e18, c1052g8, c0937i8, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0VarA = l0Var;
                if (c1086gP.K(l0VarA)) {
                }
                i12 |= i26;
            } else {
                l0VarA = l0Var;
            }
            i12 |= i26;
        } else {
            l0VarA = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                c1050eC = c1050e;
                if (c1086gP.K(c1050eC)) {
                }
                i12 |= i27;
            } else {
                c1050eC = c1050e;
            }
            i12 |= i27;
        } else {
            c1050eC = c1050e;
        }
        if ((i10 & 196608) != 0) {
            if ((i11 & 32) == 0) {
                i24 = 65536;
            } else {
                i24 = 65536;
            }
            i12 |= i24;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.K(c0937i)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i12 |= i16;
        }
        i17 = 128 & i11;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.K(l10)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((100663296 & i10) == 0) {
                if (c1086gP.K(kVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((306783379 & i12) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111112 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111113 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i211110 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i211110;
                } else {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111114 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111115 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i211111 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i211111;
                }
                c1086gP.U();
                c1086gP.L(-239156623);
                obj = InterfaceC1084f.a.f12980a;
                if (kVar2 == null) {
                    objF5 = c1086gP.f();
                    if (objF5 == obj) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1050eC.f12438a;
                } else {
                    j = c1050eC.f12440c;
                }
                if (z11 != 0) {
                    j10 = c1050eC.f12439b;
                } else {
                    j10 = c1050eC.f12441d;
                }
                C1050e c1050e19 = c1050eC;
                c1086gP.L(-239150048);
                if (c1052gB == null) {
                    j = j;
                    l0VarA = l0VarA;
                    i22 = i22;
                    kVar3 = kVar3;
                    c0908h = null;
                    r10 = 0;
                    z12 = z11;
                    l13 = l12;
                } else {
                    i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                    objF = c1086gP.f();
                    if (objF == obj) {
                        objF = new SnapshotStateList();
                        c1086gP.E(objF);
                    }
                    snapshotStateList = (SnapshotStateList) objF;
                    zK = c1086gP.K(kVar3);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                    if (z11 == 0) {
                        f10 = c1052gB.f12453e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                        f10 = c1052gB.f12450b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f10 = c1052gB.f12452d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f10 = c1052gB.f12451c;
                    } else {
                        f10 = c1052gB.f12449a;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == obj) {
                        objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                        c1086gP.E(objF3);
                    }
                    animatable = (Animatable) objF3;
                    p013b0.f fVar12 = new p013b0.f(f10);
                    boolean zK14 = c1086gP.k(animatable) | c1086gP.g(f10);
                    if (((i23 & 14) ^ 6) > 4) {
                        z12 = z11;
                        l13 = l12;
                        if (c1086gP.c(z12)) {
                            z13 = true;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK14 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar12);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    } else {
                        z12 = z11;
                        l13 = l12;
                    }
                    if ((i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK14 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar12);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                }
                c1086gP.T(r10);
                if (c0908h != null) {
                    f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f11 = (float) r10;
                }
                final androidx.compose.foundation.layout.L l116 = l13;
                int i211112 = i22;
                boolean z116 = z12;
                SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), z116, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j11 = j10;
                            androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                            final androidx.compose.foundation.layout.L l117 = l116;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l117);
                                        C0945e.c cVar = C0945e.f10288e;
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i211112 & 8078) | (234881024 & (i211112 << 6)), 64);
                hVar4 = hVar3;
                c1052g2 = c1052gB;
                l14 = l116;
                z14 = z116;
                kVar4 = kVar2;
                c1050eC = c1050e19;
                l0Var2 = l0VarA;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111116 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111117 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i211113 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i211113;
                } else {
                    if (i25 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111118 = C1051f.f12444a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111119 = C1051f.f12444a;
                        i12 &= -57345;
                        c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((32 & i11) != 0) {
                        c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                        i12 &= -458753;
                    } else {
                        c1052gB = c1052g;
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    int i211114 = i12;
                    l12 = l11;
                    hVar3 = hVar2;
                    i22 = i211114;
                }
                c1086gP.U();
                c1086gP.L(-239156623);
                obj = InterfaceC1084f.a.f12980a;
                if (kVar2 == null) {
                    objF5 = c1086gP.f();
                    if (objF5 == obj) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1050eC.f12438a;
                } else {
                    j = c1050eC.f12440c;
                }
                if (z11 != 0) {
                    j10 = c1050eC.f12439b;
                } else {
                    j10 = c1050eC.f12441d;
                }
                C1050e c1050e110 = c1050eC;
                c1086gP.L(-239150048);
                if (c1052gB == null) {
                    j = j;
                    l0VarA = l0VarA;
                    i22 = i22;
                    kVar3 = kVar3;
                    c0908h = null;
                    r10 = 0;
                    z12 = z11;
                    l13 = l12;
                } else {
                    i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                    objF = c1086gP.f();
                    if (objF == obj) {
                        objF = new SnapshotStateList();
                        c1086gP.E(objF);
                    }
                    snapshotStateList = (SnapshotStateList) objF;
                    zK = c1086gP.K(kVar3);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                    iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                    if (z11 == 0) {
                        f10 = c1052gB.f12453e;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                        f10 = c1052gB.f12450b;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                        f10 = c1052gB.f12452d;
                    } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                        f10 = c1052gB.f12451c;
                    } else {
                        f10 = c1052gB.f12449a;
                    }
                    objF3 = c1086gP.f();
                    if (objF3 == obj) {
                        objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                        c1086gP.E(objF3);
                    }
                    animatable = (Animatable) objF3;
                    p013b0.f fVar13 = new p013b0.f(f10);
                    boolean zK15 = c1086gP.k(animatable) | c1086gP.g(f10);
                    if (((i23 & 14) ^ 6) > 4) {
                        z12 = z11;
                        l13 = l12;
                        if (c1086gP.c(z12)) {
                            z13 = true;
                        }
                        zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK15 | z13 | c1086gP.k(iVar);
                        objF4 = c1086gP.f();
                        if (zK2) {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar13);
                        c0908h = animatable.f9338c;
                        r10 = 0;
                    } else {
                        z12 = z11;
                        l13 = l12;
                    }
                    if ((i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK15 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar13);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                }
                c1086gP.T(r10);
                if (c0908h != null) {
                    f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f11 = (float) r10;
                }
                final androidx.compose.foundation.layout.L l117 = l13;
                int i211115 = i22;
                boolean z117 = z12;
                SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), z117, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            long j11 = j10;
                            androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                            final androidx.compose.foundation.layout.L l118 = l117;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l118);
                                        C0945e.c cVar = C0945e.f10288e;
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i211115 & 8078) | (234881024 & (i211115 << 6)), 64);
                hVar4 = hVar3;
                c1052g2 = c1052gB;
                l14 = l117;
                z14 = z117;
                kVar4 = kVar2;
                c1050eC = c1050e110;
                l0Var2 = l0VarA;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1050e c1050e111 = c1050eC;
                final C1052g c1052g9 = c1052g2;
                final C0937i c0937i9 = c0937i2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e111, c1052g9, c0937i9, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 100663296;
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(qVar)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i12 |= i21;
        }
        if ((306783379 & i12) == 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111110 = C1051f.f12444a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111111 = C1051f.f12444a;
                    i12 &= -57345;
                    c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((32 & i11) != 0) {
                    c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                    i12 &= -458753;
                } else {
                    c1052gB = c1052g;
                }
                if (i15 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                int i211116 = i12;
                l12 = l11;
                hVar3 = hVar2;
                i22 = i211116;
            } else {
                if (i25 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111112 = C1051f.f12444a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111113 = C1051f.f12444a;
                    i12 &= -57345;
                    c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((32 & i11) != 0) {
                    c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                    i12 &= -458753;
                } else {
                    c1052gB = c1052g;
                }
                if (i15 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                int i211117 = i12;
                l12 = l11;
                hVar3 = hVar2;
                i22 = i211117;
            }
            c1086gP.U();
            c1086gP.L(-239156623);
            obj = InterfaceC1084f.a.f12980a;
            if (kVar2 == null) {
                objF5 = c1086gP.f();
                if (objF5 == obj) {
                    objF5 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF5);
                }
                kVar3 = (androidx.compose.foundation.interaction.k) objF5;
            } else {
                kVar3 = kVar2;
            }
            c1086gP.T(false);
            if (z11) {
                j = c1050eC.f12438a;
            } else {
                j = c1050eC.f12440c;
            }
            if (z11 != 0) {
                j10 = c1050eC.f12439b;
            } else {
                j10 = c1050eC.f12441d;
            }
            C1050e c1050e112 = c1050eC;
            c1086gP.L(-239150048);
            if (c1052gB == null) {
                j = j;
                l0VarA = l0VarA;
                i22 = i22;
                kVar3 = kVar3;
                c0908h = null;
                r10 = 0;
                z12 = z11;
                l13 = l12;
            } else {
                i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                objF = c1086gP.f();
                if (objF == obj) {
                    objF = new SnapshotStateList();
                    c1086gP.E(objF);
                }
                snapshotStateList = (SnapshotStateList) objF;
                zK = c1086gP.K(kVar3);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                if (z11 == 0) {
                    f10 = c1052gB.f12453e;
                } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                    f10 = c1052gB.f12450b;
                } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                    f10 = c1052gB.f12452d;
                } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                    f10 = c1052gB.f12451c;
                } else {
                    f10 = c1052gB.f12449a;
                }
                objF3 = c1086gP.f();
                if (objF3 == obj) {
                    objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                    c1086gP.E(objF3);
                }
                animatable = (Animatable) objF3;
                p013b0.f fVar14 = new p013b0.f(f10);
                boolean zK16 = c1086gP.k(animatable) | c1086gP.g(f10);
                if (((i23 & 14) ^ 6) > 4) {
                    z12 = z11;
                    l13 = l12;
                    if (c1086gP.c(z12)) {
                        z13 = true;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK16 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar14);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                } else {
                    z12 = z11;
                    l13 = l12;
                }
                if ((i23 & 6) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK16 | z13 | c1086gP.k(iVar);
                objF4 = c1086gP.f();
                if (zK2) {
                    objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                    c1086gP.E(objF4);
                } else {
                    objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                    c1086gP.E(objF4);
                }
                androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar14);
                c0908h = animatable.f9338c;
                r10 = 0;
            }
            c1086gP.T(r10);
            if (c0908h != null) {
                f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
            } else {
                f11 = (float) r10;
            }
            final androidx.compose.foundation.layout.L l118 = l13;
            int i211118 = i22;
            boolean z118 = z12;
            SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            }), z118, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        long j11 = j10;
                        androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                        final androidx.compose.foundation.layout.L l119 = l118;
                        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                        ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l119);
                                    C0945e.c cVar = C0945e.f10288e;
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                    int iF = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar2);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                    qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                    interfaceC1084f5.J();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 384);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i211118 & 8078) | (234881024 & (i211118 << 6)), 64);
            hVar4 = hVar3;
            c1052g2 = c1052gB;
            l14 = l118;
            z14 = z118;
            kVar4 = kVar2;
            c1050eC = c1050e112;
            l0Var2 = l0VarA;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111114 = C1051f.f12444a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111115 = C1051f.f12444a;
                    i12 &= -57345;
                    c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((32 & i11) != 0) {
                    c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                    i12 &= -458753;
                } else {
                    c1052gB = c1052g;
                }
                if (i15 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                int i211119 = i12;
                l12 = l11;
                hVar3 = hVar2;
                i22 = i211119;
            } else {
                if (i25 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111116 = C1051f.f12444a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.k.f1280b, c1086gP);
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111117 = C1051f.f12444a;
                    i12 &= -57345;
                    c1050eC = C1051f.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((32 & i11) != 0) {
                    c1052gB = C1051f.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31);
                    i12 &= -458753;
                } else {
                    c1052gB = c1052g;
                }
                if (i15 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                int i2111110 = i12;
                l12 = l11;
                hVar3 = hVar2;
                i22 = i2111110;
            }
            c1086gP.U();
            c1086gP.L(-239156623);
            obj = InterfaceC1084f.a.f12980a;
            if (kVar2 == null) {
                objF5 = c1086gP.f();
                if (objF5 == obj) {
                    objF5 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF5);
                }
                kVar3 = (androidx.compose.foundation.interaction.k) objF5;
            } else {
                kVar3 = kVar2;
            }
            c1086gP.T(false);
            if (z11) {
                j = c1050eC.f12438a;
            } else {
                j = c1050eC.f12440c;
            }
            if (z11 != 0) {
                j10 = c1050eC.f12439b;
            } else {
                j10 = c1050eC.f12441d;
            }
            C1050e c1050e113 = c1050eC;
            c1086gP.L(-239150048);
            if (c1052gB == null) {
                j = j;
                l0VarA = l0VarA;
                i22 = i22;
                kVar3 = kVar3;
                c0908h = null;
                r10 = 0;
                z12 = z11;
                l13 = l12;
            } else {
                i23 = ((i22 >> 6) & 14) | ((i22 >> 9) & 896);
                objF = c1086gP.f();
                if (objF == obj) {
                    objF = new SnapshotStateList();
                    c1086gP.E(objF);
                }
                snapshotStateList = (SnapshotStateList) objF;
                zK = c1086gP.K(kVar3);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new ButtonElevation$animateElevation$1$1(kVar3, snapshotStateList, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, kVar3);
                iVar = (androidx.compose.foundation.interaction.i) kotlin.collections.q.W(snapshotStateList);
                if (z11 == 0) {
                    f10 = c1052gB.f12453e;
                } else if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                    f10 = c1052gB.f12450b;
                } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                    f10 = c1052gB.f12452d;
                } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                    f10 = c1052gB.f12451c;
                } else {
                    f10 = c1052gB.f12449a;
                }
                objF3 = c1086gP.f();
                if (objF3 == obj) {
                    objF3 = new Animatable(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
                    c1086gP.E(objF3);
                }
                animatable = (Animatable) objF3;
                p013b0.f fVar15 = new p013b0.f(f10);
                boolean zK17 = c1086gP.k(animatable) | c1086gP.g(f10);
                if (((i23 & 14) ^ 6) > 4) {
                    z12 = z11;
                    l13 = l12;
                    if (c1086gP.c(z12)) {
                        z13 = true;
                    }
                    zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK17 | z13 | c1086gP.k(iVar);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar15);
                    c0908h = animatable.f9338c;
                    r10 = 0;
                } else {
                    z12 = z11;
                    l13 = l12;
                }
                if ((i23 & 6) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zK2 = ((((i23 & 896) ^ 384) <= 256 && c1086gP.K(c1052gB)) || (i23 & 384) == 256) | zK17 | z13 | c1086gP.k(iVar);
                objF4 = c1086gP.f();
                if (zK2) {
                    objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                    c1086gP.E(objF4);
                } else {
                    objF4 = new ButtonElevation$animateElevation$2$1(animatable, f10, z12, c1052gB, iVar, null);
                    c1086gP.E(objF4);
                }
                androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, fVar15);
                c0908h = animatable.f9338c;
                r10 = 0;
            }
            c1086gP.T(r10);
            if (c0908h != null) {
                f11 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
            } else {
                f11 = (float) r10;
            }
            final androidx.compose.foundation.layout.L l119 = l13;
            int i2111111 = i22;
            boolean z119 = z12;
            SurfaceKt.c(aVar, androidx.compose.ui.semantics.p.b(hVar3, r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            }), z119, l0VarA, j, j10, 0.0f, f11, c0937i2, kVar3, androidx.compose.runtime.internal.a.b(956488494, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        long j11 = j10;
                        androidx.compose.ui.text.F f12 = ((q0) interfaceC1084f3.x(TypographyKt.f12404a)).f12699m;
                        final androidx.compose.foundation.layout.L l1110 = l119;
                        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                        ProvideContentColorTextStyleKt.a(j11, f12, androidx.compose.runtime.internal.a.b(1327513942, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.a(C1051f.f12446c, C1051f.f12447d, androidx.compose.ui.h.a.f13984b), l1110);
                                    C0945e.c cVar = C0945e.f10288e;
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f5, 54);
                                    int iF = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarE);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar2);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                    qVar3.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f5, 6);
                                    interfaceC1084f5.J();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 384);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i2111111 & 8078) | (234881024 & (i2111111 << 6)), 64);
            hVar4 = hVar3;
            c1052g2 = c1052gB;
            l14 = l119;
            z14 = z119;
            kVar4 = kVar2;
            c1050eC = c1050e113;
            l0Var2 = l0VarA;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final C1050e c1050e114 = c1050eC;
            final C1052g c1052g10 = c1052g2;
            final C0937i c0937i10 = c0937i2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ButtonKt.a(aVar, hVar4, z14, l0Var2, c1050e114, c1052g10, c0937i10, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0116  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018a  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:138:0x0196  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:156:0x0204  */
    /* JADX WARN: Code duplicated, block: B:158:0x020c  */
    /* JADX WARN: Code duplicated, block: B:159:0x020f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0213  */
    /* JADX WARN: Code duplicated, block: B:163:0x021a  */
    /* JADX WARN: Code duplicated, block: B:167:0x024e  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x0150, please report this as an issue */
    public static final void b(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.ui.graphics.l0 l0Var, C1050e c1050e, C1052g c1052g, C0937i c0937i, androidx.compose.foundation.layout.L l10, androidx.compose.foundation.interaction.k kVar, final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.l0 l0Var2;
        C1050e c1050e2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        final androidx.compose.ui.graphics.l0 l0VarA;
        C1050e c1050eD;
        C1052g c1052g2;
        C0937i c0937iA;
        androidx.compose.foundation.layout.L l11;
        androidx.compose.foundation.interaction.k kVar2;
        C1052g c1052g3;
        ColorSchemeKeyTokens colorSchemeKeyTokens;
        long jB;
        C0937i c0937i2;
        androidx.compose.foundation.interaction.k kVar3;
        final boolean z13;
        final C1050e c1050e3;
        final androidx.compose.ui.h hVar3;
        C1052g c1052g4;
        androidx.compose.foundation.layout.L l12;
        C1105p0 c1105p0V;
        int i22;
        C1086g c1086gP = interfaceC1084f.p(-1694808287);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = 2 & i11;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = 4 & i11;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0Var2 = l0Var;
                        int i24 = c1086gP.K(l0Var2) ? 2048 : 1024;
                        i12 |= i24;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i24;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1050e2 = c1050e;
                        int i25 = c1086gP.K(c1050e2) ? 16384 : 8192;
                        i12 |= i25;
                    } else {
                        c1050e2 = c1050e;
                    }
                    i12 |= i25;
                } else {
                    c1050e2 = c1050e;
                }
                i15 = 32 & i11;
                if (i15 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(c1052g)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0 || !c1086gP.K(c0937i)) {
                        i22 = 524288;
                    } else {
                        i22 = 1048576;
                    }
                    i12 |= i22;
                }
                i17 = 128 & i11;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                i19 = 256 & i11;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) == 306783378 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar2;
                            }
                            z12 = i13 == 0 ? z11 : true;
                            if ((i11 & 8) != 0) {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                float f10 = B.r.f1316a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                                i12 &= -7169;
                            } else {
                                l0VarA = l0Var2;
                            }
                            if ((16 & i11) != 0) {
                                androidx.compose.foundation.layout.N n11 = C1051f.f12444a;
                                c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 &= -57345;
                            } else {
                                c1050eD = c1050e2;
                            }
                            if (i15 != 0) {
                                c1052g2 = null;
                            } else {
                                c1052g2 = c1052g;
                            }
                            if ((i11 & 64) != 0) {
                                androidx.compose.foundation.layout.N n12 = C1051f.f12444a;
                                float f11 = B.r.f1316a;
                                colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                                if (z12) {
                                    c1086gP.L(-855870548);
                                    jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                    c1086gP.T(false);
                                } else {
                                    c1086gP.L(-855783004);
                                    jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                    c1086gP.T(false);
                                }
                                c0937iA = C1787c0.a(f11, jB);
                                i12 &= -3670017;
                            } else {
                                c1052g2 = c1052g2;
                                hVar2 = hVar2;
                                c0937iA = c0937i;
                            }
                            if (i17 != 0) {
                                l11 = C1051f.f12444a;
                            } else {
                                l11 = l10;
                            }
                            if (i19 != 0) {
                                kVar2 = null;
                            } else {
                                kVar2 = kVar;
                            }
                            c1052g3 = c1052g2;
                        } else {
                            c1086gP.w();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((16 & i11) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            c1052g3 = c1052g;
                            c0937iA = c0937i;
                            l11 = l10;
                            kVar2 = kVar;
                            z12 = z11;
                            l0VarA = l0Var2;
                            c1050eD = c1050e2;
                        }
                        c1086gP.U();
                        a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                        c0937i2 = c0937iA;
                        kVar3 = kVar2;
                        z13 = z12;
                        c1050e3 = c1050eD;
                        hVar3 = hVar2;
                        c1052g4 = c1052g3;
                        l12 = l11;
                    } else {
                        c1086gP.w();
                        c1052g4 = c1052g;
                        c0937i2 = c0937i;
                        hVar3 = hVar2;
                        z13 = z11;
                        l0VarA = l0Var2;
                        c1050e3 = c1050e2;
                        l12 = l10;
                        kVar3 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final C1052g c1052g5 = c1052g4;
                        final C0937i c0937i3 = c0937i2;
                        final androidx.compose.foundation.layout.L l13 = l12;
                        final androidx.compose.foundation.interaction.k kVar4 = kVar3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g5, c0937i3, l13, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n13 = C1051f.f12444a;
                            float f12 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n14 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n15 = C1051f.f12444a;
                            float f13 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f13, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n16 = C1051f.f12444a;
                            float f14 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n17 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n18 = C1051f.f12444a;
                            float f15 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f15, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    }
                    c1086gP.U();
                    a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i2 = c0937iA;
                    kVar3 = kVar2;
                    z13 = z12;
                    c1050e3 = c1050eD;
                    hVar3 = hVar2;
                    c1052g4 = c1052g3;
                    l12 = l11;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n19 = C1051f.f12444a;
                            float f16 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n110 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n111 = C1051f.f12444a;
                            float f17 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f17, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n112 = C1051f.f12444a;
                            float f18 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n113 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n114 = C1051f.f12444a;
                            float f19 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f19, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    }
                    c1086gP.U();
                    a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i2 = c0937iA;
                    kVar3 = kVar2;
                    z13 = z12;
                    c1050e3 = c1050eD;
                    hVar3 = hVar2;
                    c1052g4 = c1052g3;
                    l12 = l11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1052g c1052g6 = c1052g4;
                    final C0937i c0937i4 = c0937i2;
                    final androidx.compose.foundation.layout.L l14 = l12;
                    final androidx.compose.foundation.interaction.k kVar5 = kVar3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g6, c0937i4, l14, kVar5, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i24;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i24;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1050e2 = c1050e;
                    if (c1086gP.K(c1050e2)) {
                    }
                    i12 |= i25;
                } else {
                    c1050e2 = c1050e;
                }
                i12 |= i25;
            } else {
                c1050e2 = c1050e;
            }
            i15 = 32 & i11;
            if (i15 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(c1052g)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i17 = 128 & i11;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            i19 = 256 & i11;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n115 = C1051f.f12444a;
                            float f110 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n116 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n117 = C1051f.f12444a;
                            float f111 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f111, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n118 = C1051f.f12444a;
                            float f112 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n119 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n1110 = C1051f.f12444a;
                            float f113 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f113, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    }
                    c1086gP.U();
                    a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i2 = c0937iA;
                    kVar3 = kVar2;
                    z13 = z12;
                    c1050e3 = c1050eD;
                    hVar3 = hVar2;
                    c1052g4 = c1052g3;
                    l12 = l11;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n1111 = C1051f.f12444a;
                            float f114 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n1112 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n1113 = C1051f.f12444a;
                            float f115 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f115, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n1114 = C1051f.f12444a;
                            float f116 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n1115 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n1116 = C1051f.f12444a;
                            float f117 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f117, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    }
                    c1086gP.U();
                    a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i2 = c0937iA;
                    kVar3 = kVar2;
                    z13 = z12;
                    c1050e3 = c1050eD;
                    hVar3 = hVar2;
                    c1052g4 = c1052g3;
                    l12 = l11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1052g c1052g7 = c1052g4;
                    final C0937i c0937i5 = c0937i2;
                    final androidx.compose.foundation.layout.L l15 = l12;
                    final androidx.compose.foundation.interaction.k kVar6 = kVar3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g7, c0937i5, l15, kVar6, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1117 = C1051f.f12444a;
                        float f118 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1118 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n1119 = C1051f.f12444a;
                        float f119 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f119, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11110 = C1051f.f12444a;
                        float f1110 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11111 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n11112 = C1051f.f12444a;
                        float f1111 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f1111, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                }
                c1086gP.U();
                a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i2 = c0937iA;
                kVar3 = kVar2;
                z13 = z12;
                c1050e3 = c1050eD;
                hVar3 = hVar2;
                c1052g4 = c1052g3;
                l12 = l11;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11113 = C1051f.f12444a;
                        float f1112 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11114 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n11115 = C1051f.f12444a;
                        float f1113 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f1113, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11116 = C1051f.f12444a;
                        float f1114 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11117 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n11118 = C1051f.f12444a;
                        float f1115 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f1115, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                }
                c1086gP.U();
                a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i2 = c0937iA;
                kVar3 = kVar2;
                z13 = z12;
                c1050e3 = c1050eD;
                hVar3 = hVar2;
                c1052g4 = c1052g3;
                l12 = l11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1052g c1052g8 = c1052g4;
                final C0937i c0937i6 = c0937i2;
                final androidx.compose.foundation.layout.L l16 = l12;
                final androidx.compose.foundation.interaction.k kVar7 = kVar3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g8, c0937i6, l16, kVar7, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = 4 & i11;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i24;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i24;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1050e2 = c1050e;
                    if (c1086gP.K(c1050e2)) {
                    }
                    i12 |= i25;
                } else {
                    c1050e2 = c1050e;
                }
                i12 |= i25;
            } else {
                c1050e2 = c1050e;
            }
            i15 = 32 & i11;
            if (i15 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(c1052g)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i17 = 128 & i11;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            i19 = 256 & i11;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n11119 = C1051f.f12444a;
                            float f1116 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n111110 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n111111 = C1051f.f12444a;
                            float f1117 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f1117, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n111112 = C1051f.f12444a;
                            float f1118 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n111113 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n111114 = C1051f.f12444a;
                            float f1119 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f1119, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    }
                    c1086gP.U();
                    a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i2 = c0937iA;
                    kVar3 = kVar2;
                    z13 = z12;
                    c1050e3 = c1050eD;
                    hVar3 = hVar2;
                    c1052g4 = c1052g3;
                    l12 = l11;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n111115 = C1051f.f12444a;
                            float f11110 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n111116 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n111117 = C1051f.f12444a;
                            float f11111 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f11111, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n111118 = C1051f.f12444a;
                            float f11112 = B.r.f1316a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n111119 = C1051f.f12444a;
                            c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eD = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if ((i11 & 64) != 0) {
                            androidx.compose.foundation.layout.N n1111110 = C1051f.f12444a;
                            float f11113 = B.r.f1316a;
                            colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                            if (z12) {
                                c1086gP.L(-855870548);
                                jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-855783004);
                                jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                                c1086gP.T(false);
                            }
                            c0937iA = C1787c0.a(f11113, jB);
                            i12 &= -3670017;
                        } else {
                            c1052g2 = c1052g2;
                            hVar2 = hVar2;
                            c0937iA = c0937i;
                        }
                        if (i17 != 0) {
                            l11 = C1051f.f12444a;
                        } else {
                            l11 = l10;
                        }
                        if (i19 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        c1052g3 = c1052g2;
                    }
                    c1086gP.U();
                    a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i2 = c0937iA;
                    kVar3 = kVar2;
                    z13 = z12;
                    c1050e3 = c1050eD;
                    hVar3 = hVar2;
                    c1052g4 = c1052g3;
                    l12 = l11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1052g c1052g9 = c1052g4;
                    final C0937i c0937i7 = c0937i2;
                    final androidx.compose.foundation.layout.L l17 = l12;
                    final androidx.compose.foundation.interaction.k kVar8 = kVar3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g9, c0937i7, l17, kVar8, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1111111 = C1051f.f12444a;
                        float f11114 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1111112 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n1111113 = C1051f.f12444a;
                        float f11115 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f11115, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1111114 = C1051f.f12444a;
                        float f11116 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1111115 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n1111116 = C1051f.f12444a;
                        float f11117 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f11117, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                }
                c1086gP.U();
                a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i2 = c0937iA;
                kVar3 = kVar2;
                z13 = z12;
                c1050e3 = c1050eD;
                hVar3 = hVar2;
                c1052g4 = c1052g3;
                l12 = l11;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1111117 = C1051f.f12444a;
                        float f11118 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1111118 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n1111119 = C1051f.f12444a;
                        float f11119 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f11119, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11111110 = C1051f.f12444a;
                        float f111110 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11111111 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n11111112 = C1051f.f12444a;
                        float f111111 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f111111, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                }
                c1086gP.U();
                a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i2 = c0937iA;
                kVar3 = kVar2;
                z13 = z12;
                c1050e3 = c1050eD;
                hVar3 = hVar2;
                c1052g4 = c1052g3;
                l12 = l11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1052g c1052g10 = c1052g4;
                final C0937i c0937i8 = c0937i2;
                final androidx.compose.foundation.layout.L l18 = l12;
                final androidx.compose.foundation.interaction.k kVar9 = kVar3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g10, c0937i8, l18, kVar9, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i24;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i24;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                c1050e2 = c1050e;
                if (c1086gP.K(c1050e2)) {
                }
                i12 |= i25;
            } else {
                c1050e2 = c1050e;
            }
            i12 |= i25;
        } else {
            c1050e2 = c1050e;
        }
        i15 = 32 & i11;
        if (i15 != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.K(c1052g)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        i17 = 128 & i11;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.K(l10)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        i19 = 256 & i11;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(kVar)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((i12 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11111113 = C1051f.f12444a;
                        float f111112 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11111114 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n11111115 = C1051f.f12444a;
                        float f111113 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f111113, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11111116 = C1051f.f12444a;
                        float f111114 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11111117 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n11111118 = C1051f.f12444a;
                        float f111115 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f111115, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                }
                c1086gP.U();
                a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i2 = c0937iA;
                kVar3 = kVar2;
                z13 = z12;
                c1050e3 = c1050eD;
                hVar3 = hVar2;
                c1052g4 = c1052g3;
                l12 = l11;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11111119 = C1051f.f12444a;
                        float f111116 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111111110 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n111111111 = C1051f.f12444a;
                        float f111117 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f111117, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111111112 = C1051f.f12444a;
                        float f111118 = B.r.f1316a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111111113 = C1051f.f12444a;
                        c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eD = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if ((i11 & 64) != 0) {
                        androidx.compose.foundation.layout.N n111111114 = C1051f.f12444a;
                        float f111119 = B.r.f1316a;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                        if (z12) {
                            c1086gP.L(-855870548);
                            jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-855783004);
                            jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                            c1086gP.T(false);
                        }
                        c0937iA = C1787c0.a(f111119, jB);
                        i12 &= -3670017;
                    } else {
                        c1052g2 = c1052g2;
                        hVar2 = hVar2;
                        c0937iA = c0937i;
                    }
                    if (i17 != 0) {
                        l11 = C1051f.f12444a;
                    } else {
                        l11 = l10;
                    }
                    if (i19 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    c1052g3 = c1052g2;
                }
                c1086gP.U();
                a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i2 = c0937iA;
                kVar3 = kVar2;
                z13 = z12;
                c1050e3 = c1050eD;
                hVar3 = hVar2;
                c1052g4 = c1052g3;
                l12 = l11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1052g c1052g11 = c1052g4;
                final C0937i c0937i9 = c0937i2;
                final androidx.compose.foundation.layout.L l19 = l12;
                final androidx.compose.foundation.interaction.k kVar10 = kVar3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g11, c0937i9, l19, kVar10, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) == 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n111111115 = C1051f.f12444a;
                    float f1111110 = B.r.f1316a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n111111116 = C1051f.f12444a;
                    c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eD = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if ((i11 & 64) != 0) {
                    androidx.compose.foundation.layout.N n111111117 = C1051f.f12444a;
                    float f1111111 = B.r.f1316a;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                    if (z12) {
                        c1086gP.L(-855870548);
                        jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-855783004);
                        jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                        c1086gP.T(false);
                    }
                    c0937iA = C1787c0.a(f1111111, jB);
                    i12 &= -3670017;
                } else {
                    c1052g2 = c1052g2;
                    hVar2 = hVar2;
                    c0937iA = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                c1052g3 = c1052g2;
            } else {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n111111118 = C1051f.f12444a;
                    float f1111112 = B.r.f1316a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n111111119 = C1051f.f12444a;
                    c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eD = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if ((i11 & 64) != 0) {
                    androidx.compose.foundation.layout.N n1111111110 = C1051f.f12444a;
                    float f1111113 = B.r.f1316a;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                    if (z12) {
                        c1086gP.L(-855870548);
                        jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-855783004);
                        jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                        c1086gP.T(false);
                    }
                    c0937iA = C1787c0.a(f1111113, jB);
                    i12 &= -3670017;
                } else {
                    c1052g2 = c1052g2;
                    hVar2 = hVar2;
                    c0937iA = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                c1052g3 = c1052g2;
            }
            c1086gP.U();
            a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
            c0937i2 = c0937iA;
            kVar3 = kVar2;
            z13 = z12;
            c1050e3 = c1050eD;
            hVar3 = hVar2;
            c1052g4 = c1052g3;
            l12 = l11;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111111111 = C1051f.f12444a;
                    float f1111114 = B.r.f1316a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111111112 = C1051f.f12444a;
                    c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eD = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if ((i11 & 64) != 0) {
                    androidx.compose.foundation.layout.N n1111111113 = C1051f.f12444a;
                    float f1111115 = B.r.f1316a;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                    if (z12) {
                        c1086gP.L(-855870548);
                        jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-855783004);
                        jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                        c1086gP.T(false);
                    }
                    c0937iA = C1787c0.a(f1111115, jB);
                    i12 &= -3670017;
                } else {
                    c1052g2 = c1052g2;
                    hVar2 = hVar2;
                    c0937iA = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                c1052g3 = c1052g2;
            } else {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111111114 = C1051f.f12444a;
                    float f1111116 = B.r.f1316a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111111115 = C1051f.f12444a;
                    c1050eD = C1051f.d((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eD = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if ((i11 & 64) != 0) {
                    androidx.compose.foundation.layout.N n1111111116 = C1051f.f12444a;
                    float f1111117 = B.r.f1316a;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12719l;
                    if (z12) {
                        c1086gP.L(-855870548);
                        jB = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-855783004);
                        jB = androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP));
                        c1086gP.T(false);
                    }
                    c0937iA = C1787c0.a(f1111117, jB);
                    i12 &= -3670017;
                } else {
                    c1052g2 = c1052g2;
                    hVar2 = hVar2;
                    c0937iA = c0937i;
                }
                if (i17 != 0) {
                    l11 = C1051f.f12444a;
                } else {
                    l11 = l10;
                }
                if (i19 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                c1052g3 = c1052g2;
            }
            c1086gP.U();
            a(aVar, hVar2, z12, l0VarA, c1050eD, c1052g3, c0937iA, l11, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
            c0937i2 = c0937iA;
            kVar3 = kVar2;
            z13 = z12;
            c1050e3 = c1050eD;
            hVar3 = hVar2;
            c1052g4 = c1052g3;
            l12 = l11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final C1052g c1052g12 = c1052g4;
            final C0937i c0937i10 = c0937i2;
            final androidx.compose.foundation.layout.L l110 = l12;
            final androidx.compose.foundation.interaction.k kVar11 = kVar3;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$OutlinedButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ButtonKt.b(aVar, hVar3, z13, l0VarA, c1050e3, c1052g12, c0937i10, l110, kVar11, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x013a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0184  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0201  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x0152, please report this as an issue */
    public static final void c(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.ui.graphics.l0 l0Var, C1050e c1050e, C1052g c1052g, C0937i c0937i, androidx.compose.foundation.layout.L l10, androidx.compose.foundation.interaction.k kVar, final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.l0 l0Var2;
        C1050e c1050e2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.ui.h hVar3;
        boolean z12;
        final androidx.compose.ui.graphics.l0 l0VarA;
        C1050e c1050eE;
        C1052g c1052g2;
        C0937i c0937i2;
        androidx.compose.foundation.layout.L l11;
        androidx.compose.foundation.interaction.k kVar2;
        androidx.compose.foundation.layout.L l12;
        C0937i c0937i3;
        C0937i c0937i4;
        androidx.compose.foundation.interaction.k kVar3;
        androidx.compose.foundation.layout.L l13;
        C1052g c1052g3;
        final androidx.compose.ui.h hVar4;
        final boolean z13;
        final C1050e c1050e3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-2106428362);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = 2 & i11;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = 4 & i11;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0Var2 = l0Var;
                        int i25 = c1086gP.K(l0Var2) ? 2048 : 1024;
                        i12 |= i25;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i25;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1050e2 = c1050e;
                        int i26 = c1086gP.K(c1050e2) ? 16384 : 8192;
                        i12 |= i26;
                    } else {
                        c1050e2 = c1050e;
                    }
                    i12 |= i26;
                } else {
                    c1050e2 = c1050e;
                }
                i15 = 32 & i11;
                if (i15 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(c1052g)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = 128 & i11;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = 256 & i11;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((i12 & 306783379) == 306783378 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            z12 = i13 == 0 ? z11 : true;
                            if ((i11 & 8) != 0) {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                                i12 &= -7169;
                            } else {
                                l0VarA = l0Var2;
                            }
                            if ((16 & i11) != 0) {
                                androidx.compose.foundation.layout.N n11 = C1051f.f12444a;
                                c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 &= -57345;
                            } else {
                                c1050eE = c1050e2;
                            }
                            if (i15 != 0) {
                                c1052g2 = null;
                            } else {
                                c1052g2 = c1052g;
                            }
                            if (i17 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                            if (i19 != 0) {
                                l11 = C1051f.f12445b;
                            } else {
                                l11 = l10;
                            }
                            kVar2 = i21 == 0 ? kVar : null;
                            l12 = l11;
                            c0937i3 = c0937i2;
                        } else {
                            c1086gP.w();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((16 & i11) != 0) {
                                i12 &= -57345;
                            }
                            c1052g2 = c1052g;
                            c0937i3 = c0937i;
                            l12 = l10;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0VarA = l0Var2;
                            c1050eE = c1050e2;
                            kVar2 = kVar;
                        }
                        c1086gP.U();
                        a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                        c0937i4 = c0937i3;
                        kVar3 = kVar2;
                        l13 = l12;
                        C1050e c1050e4 = c1050eE;
                        c1052g3 = c1052g2;
                        hVar4 = hVar3;
                        z13 = z12;
                        c1050e3 = c1050e4;
                    } else {
                        c1086gP.w();
                        c1052g3 = c1052g;
                        c0937i4 = c0937i;
                        hVar4 = hVar2;
                        z13 = z11;
                        l0VarA = l0Var2;
                        c1050e3 = c1050e2;
                        l13 = l10;
                        kVar3 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final C1052g c1052g4 = c1052g3;
                        final C0937i c0937i5 = c0937i4;
                        final androidx.compose.foundation.layout.L l14 = l13;
                        final androidx.compose.foundation.interaction.k kVar4 = kVar3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g4, c0937i5, l14, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n12 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n13 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n14 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n15 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    }
                    c1086gP.U();
                    a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i4 = c0937i3;
                    kVar3 = kVar2;
                    l13 = l12;
                    C1050e c1050e5 = c1050eE;
                    c1052g3 = c1052g2;
                    hVar4 = hVar3;
                    z13 = z12;
                    c1050e3 = c1050e5;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n16 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n17 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n18 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n19 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    }
                    c1086gP.U();
                    a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i4 = c0937i3;
                    kVar3 = kVar2;
                    l13 = l12;
                    C1050e c1050e6 = c1050eE;
                    c1052g3 = c1052g2;
                    hVar4 = hVar3;
                    z13 = z12;
                    c1050e3 = c1050e6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1052g c1052g5 = c1052g3;
                    final C0937i c0937i6 = c0937i4;
                    final androidx.compose.foundation.layout.L l15 = l13;
                    final androidx.compose.foundation.interaction.k kVar5 = kVar3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g5, c0937i6, l15, kVar5, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i25;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i25;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1050e2 = c1050e;
                    if (c1086gP.K(c1050e2)) {
                    }
                    i12 |= i26;
                } else {
                    c1050e2 = c1050e;
                }
                i12 |= i26;
            } else {
                c1050e2 = c1050e;
            }
            i15 = 32 & i11;
            if (i15 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(c1052g)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = 128 & i11;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = 256 & i11;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((i12 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n110 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n111 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n112 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n113 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    }
                    c1086gP.U();
                    a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i4 = c0937i3;
                    kVar3 = kVar2;
                    l13 = l12;
                    C1050e c1050e7 = c1050eE;
                    c1052g3 = c1052g2;
                    hVar4 = hVar3;
                    z13 = z12;
                    c1050e3 = c1050e7;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n114 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n115 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n116 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n117 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    }
                    c1086gP.U();
                    a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i4 = c0937i3;
                    kVar3 = kVar2;
                    l13 = l12;
                    C1050e c1050e8 = c1050eE;
                    c1052g3 = c1052g2;
                    hVar4 = hVar3;
                    z13 = z12;
                    c1050e3 = c1050e8;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1052g c1052g6 = c1052g3;
                    final C0937i c0937i7 = c0937i4;
                    final androidx.compose.foundation.layout.L l16 = l13;
                    final androidx.compose.foundation.interaction.k kVar6 = kVar3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g6, c0937i7, l16, kVar6, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n118 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n119 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1110 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1111 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                }
                c1086gP.U();
                a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i4 = c0937i3;
                kVar3 = kVar2;
                l13 = l12;
                C1050e c1050e9 = c1050eE;
                c1052g3 = c1052g2;
                hVar4 = hVar3;
                z13 = z12;
                c1050e3 = c1050e9;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1112 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1113 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n1114 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n1115 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                }
                c1086gP.U();
                a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i4 = c0937i3;
                kVar3 = kVar2;
                l13 = l12;
                C1050e c1050e10 = c1050eE;
                c1052g3 = c1052g2;
                hVar4 = hVar3;
                z13 = z12;
                c1050e3 = c1050e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1052g c1052g7 = c1052g3;
                final C0937i c0937i8 = c0937i4;
                final androidx.compose.foundation.layout.L l17 = l13;
                final androidx.compose.foundation.interaction.k kVar7 = kVar3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g7, c0937i8, l17, kVar7, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = 4 & i11;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i25;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i25;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1050e2 = c1050e;
                    if (c1086gP.K(c1050e2)) {
                    }
                    i12 |= i26;
                } else {
                    c1050e2 = c1050e;
                }
                i12 |= i26;
            } else {
                c1050e2 = c1050e;
            }
            i15 = 32 & i11;
            if (i15 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(c1052g)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = 128 & i11;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = 256 & i11;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((i12 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n1116 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n1117 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n1118 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n1119 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    }
                    c1086gP.U();
                    a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i4 = c0937i3;
                    kVar3 = kVar2;
                    l13 = l12;
                    C1050e c1050e11 = c1050eE;
                    c1052g3 = c1052g2;
                    hVar4 = hVar3;
                    z13 = z12;
                    c1050e3 = c1050e11;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n11110 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n11111 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            androidx.compose.foundation.layout.N n11112 = C1051f.f12444a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n11113 = C1051f.f12444a;
                            c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 &= -57345;
                        } else {
                            c1050eE = c1050e2;
                        }
                        if (i15 != 0) {
                            c1052g2 = null;
                        } else {
                            c1052g2 = c1052g;
                        }
                        if (i17 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                        if (i19 != 0) {
                            l11 = C1051f.f12445b;
                        } else {
                            l11 = l10;
                        }
                        if (i21 == 0) {
                        }
                        l12 = l11;
                        c0937i3 = c0937i2;
                    }
                    c1086gP.U();
                    a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                    c0937i4 = c0937i3;
                    kVar3 = kVar2;
                    l13 = l12;
                    C1050e c1050e12 = c1050eE;
                    c1052g3 = c1052g2;
                    hVar4 = hVar3;
                    z13 = z12;
                    c1050e3 = c1050e12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final C1052g c1052g8 = c1052g3;
                    final C0937i c0937i9 = c0937i4;
                    final androidx.compose.foundation.layout.L l18 = l13;
                    final androidx.compose.foundation.interaction.k kVar8 = kVar3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g8, c0937i9, l18, kVar8, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11114 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11115 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11116 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11117 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                }
                c1086gP.U();
                a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i4 = c0937i3;
                kVar3 = kVar2;
                l13 = l12;
                C1050e c1050e13 = c1050eE;
                c1052g3 = c1052g2;
                hVar4 = hVar3;
                z13 = z12;
                c1050e3 = c1050e13;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n11118 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n11119 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111110 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111111 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                }
                c1086gP.U();
                a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i4 = c0937i3;
                kVar3 = kVar2;
                l13 = l12;
                C1050e c1050e14 = c1050eE;
                c1052g3 = c1052g2;
                hVar4 = hVar3;
                z13 = z12;
                c1050e3 = c1050e14;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1052g c1052g9 = c1052g3;
                final C0937i c0937i10 = c0937i4;
                final androidx.compose.foundation.layout.L l19 = l13;
                final androidx.compose.foundation.interaction.k kVar9 = kVar3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g9, c0937i10, l19, kVar9, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i25;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i25;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                c1050e2 = c1050e;
                if (c1086gP.K(c1050e2)) {
                }
                i12 |= i26;
            } else {
                c1050e2 = c1050e;
            }
            i12 |= i26;
        } else {
            c1050e2 = c1050e;
        }
        i15 = 32 & i11;
        if (i15 != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.K(c1052g)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.K(c0937i)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        i19 = 128 & i11;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.K(l10)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = 256 & i11;
        if (i21 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(kVar)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i12 |= i22;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((i12 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111112 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111113 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111114 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111115 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                }
                c1086gP.U();
                a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i4 = c0937i3;
                kVar3 = kVar2;
                l13 = l12;
                C1050e c1050e15 = c1050eE;
                c1052g3 = c1052g2;
                hVar4 = hVar3;
                z13 = z12;
                c1050e3 = c1050e15;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111116 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111117 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        androidx.compose.foundation.layout.N n111118 = C1051f.f12444a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111119 = C1051f.f12444a;
                        c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -57345;
                    } else {
                        c1050eE = c1050e2;
                    }
                    if (i15 != 0) {
                        c1052g2 = null;
                    } else {
                        c1052g2 = c1052g;
                    }
                    if (i17 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                    if (i19 != 0) {
                        l11 = C1051f.f12445b;
                    } else {
                        l11 = l10;
                    }
                    if (i21 == 0) {
                    }
                    l12 = l11;
                    c0937i3 = c0937i2;
                }
                c1086gP.U();
                a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
                c0937i4 = c0937i3;
                kVar3 = kVar2;
                l13 = l12;
                C1050e c1050e16 = c1050eE;
                c1052g3 = c1052g2;
                hVar4 = hVar3;
                z13 = z12;
                c1050e3 = c1050e16;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final C1052g c1052g10 = c1052g3;
                final C0937i c0937i11 = c0937i4;
                final androidx.compose.foundation.layout.L l110 = l13;
                final androidx.compose.foundation.interaction.k kVar10 = kVar3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g10, c0937i11, l110, kVar10, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) == 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111110 = C1051f.f12444a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111111 = C1051f.f12444a;
                    c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eE = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if (i17 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i19 != 0) {
                    l11 = C1051f.f12445b;
                } else {
                    l11 = l10;
                }
                if (i21 == 0) {
                }
                l12 = l11;
                c0937i3 = c0937i2;
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111112 = C1051f.f12444a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111113 = C1051f.f12444a;
                    c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eE = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if (i17 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i19 != 0) {
                    l11 = C1051f.f12445b;
                } else {
                    l11 = l10;
                }
                if (i21 == 0) {
                }
                l12 = l11;
                c0937i3 = c0937i2;
            }
            c1086gP.U();
            a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
            c0937i4 = c0937i3;
            kVar3 = kVar2;
            l13 = l12;
            C1050e c1050e17 = c1050eE;
            c1052g3 = c1052g2;
            hVar4 = hVar3;
            z13 = z12;
            c1050e3 = c1050e17;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111114 = C1051f.f12444a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111115 = C1051f.f12444a;
                    c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eE = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if (i17 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i19 != 0) {
                    l11 = C1051f.f12445b;
                } else {
                    l11 = l10;
                }
                if (i21 == 0) {
                }
                l12 = l11;
                c0937i3 = c0937i2;
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    androidx.compose.foundation.layout.N n1111116 = C1051f.f12444a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n1111117 = C1051f.f12444a;
                    c1050eE = C1051f.e((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -57345;
                } else {
                    c1050eE = c1050e2;
                }
                if (i15 != 0) {
                    c1052g2 = null;
                } else {
                    c1052g2 = c1052g;
                }
                if (i17 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
                if (i19 != 0) {
                    l11 = C1051f.f12445b;
                } else {
                    l11 = l10;
                }
                if (i21 == 0) {
                }
                l12 = l11;
                c0937i3 = c0937i2;
            }
            c1086gP.U();
            a(aVar, hVar3, z12, l0VarA, c1050eE, c1052g2, c0937i3, l12, kVar2, qVar, c1086gP, i12 & 2147483646, 0);
            c0937i4 = c0937i3;
            kVar3 = kVar2;
            l13 = l12;
            C1050e c1050e18 = c1050eE;
            c1052g3 = c1052g2;
            hVar4 = hVar3;
            z13 = z12;
            c1050e3 = c1050e18;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final C1052g c1052g11 = c1052g3;
            final C0937i c0937i12 = c0937i4;
            final androidx.compose.foundation.layout.L l111 = l13;
            final androidx.compose.foundation.interaction.k kVar11 = kVar3;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ButtonKt$TextButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ButtonKt.c(aVar, hVar4, z13, l0VarA, c1050e3, c1052g11, c0937i12, l111, kVar11, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
