package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.layout.C0958s;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12291a = 16;

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:133:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x019d  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:166:0x0204  */
    /* JADX WARN: Code duplicated, block: B:172:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0218  */
    /* JADX WARN: Code duplicated, block: B:176:0x022b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0231  */
    /* JADX WARN: Code duplicated, block: B:184:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x029a  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public static final void a(androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, int i10, long j, long j10, androidx.compose.foundation.layout.a0 a0Var, final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        androidx.compose.ui.h hVar2;
        int i13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        int i14;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        int i15;
        int i16;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        int i17;
        int i18;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        int i19;
        int i20;
        int i21;
        int i22;
        androidx.compose.ui.h hVar3;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        int i23;
        long j11;
        long jB;
        final androidx.compose.foundation.layout.a0 a0Var2;
        int i24;
        long j12;
        boolean z10;
        Object objF;
        final androidx.compose.material3.internal.z zVar;
        boolean zK;
        Object objF2;
        final long j13;
        androidx.compose.foundation.layout.a0 a0Var3;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        final androidx.compose.ui.h hVar4;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        int i25;
        C1105p0 c1105p0V;
        int i26;
        C1086g c1086gP = interfaceC1084f.p(-1219521777);
        int i27 = i12 & 1;
        if (i27 != 0) {
            i13 = i11 | 6;
            hVar2 = hVar;
        } else if ((i11 & 6) == 0) {
            hVar2 = hVar;
            i13 = (c1086gP.K(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i11 & 48) == 0) {
                pVar5 = pVar;
                i13 |= c1086gP.k(pVar5) ? 32 : 16;
            }
            i14 = 4 & i12;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    pVar6 = pVar2;
                    if (c1086gP.k(pVar6)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        pVar7 = pVar3;
                        if (c1086gP.k(pVar7)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = 16 & i12;
                    if (i18 != 0) {
                        if ((i11 & 24576) == 0) {
                            pVar8 = pVar4;
                            if (c1086gP.k(pVar8)) {
                                i19 = 16384;
                            } else {
                                i19 = 8192;
                            }
                            i13 |= i19;
                        }
                        i20 = 32 & i12;
                        if (i20 != 0) {
                            i13 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            if (c1086gP.h(i10)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                        if ((i11 & 1572864) != 0) {
                            if ((i12 & 64) == 0 || !c1086gP.i(j)) {
                                i26 = 524288;
                            } else {
                                i26 = 1048576;
                            }
                            i13 |= i26;
                        }
                        if ((i11 & 12582912) != 0) {
                            i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                        }
                        if ((i11 & 100663296) != 0) {
                            i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                        }
                        if ((i12 & 512) != 0) {
                            if ((i11 & 805306368) == 0) {
                                if (c1086gP.k(qVar)) {
                                    i22 = 536870912;
                                } else {
                                    i22 = 268435456;
                                }
                                i13 |= i22;
                            }
                            if ((i13 & 306783379) == 306783378 || !c1086gP.s()) {
                                c1086gP.r0();
                                if ((i11 & 1) != 0 || c1086gP.a0()) {
                                    if (i27 != 0) {
                                        hVar3 = androidx.compose.ui.h.a.f13984b;
                                    } else {
                                        hVar3 = hVar2;
                                    }
                                    if (i28 != 0) {
                                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                    } else {
                                        pVar9 = pVar5;
                                    }
                                    if (i14 != 0) {
                                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                    } else {
                                        pVar10 = pVar6;
                                    }
                                    if (i16 != 0) {
                                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                    }
                                    if (i18 != 0) {
                                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                    }
                                    if (i20 != 0) {
                                        i23 = 2;
                                    } else {
                                        i23 = i10;
                                    }
                                    if ((i12 & 64) != 0) {
                                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                        i13 &= -3670017;
                                    } else {
                                        j11 = j;
                                    }
                                    if ((128 & i12) != 0) {
                                        jB = ColorSchemeKt.b(j11, c1086gP);
                                        i13 &= -29360129;
                                    } else {
                                        jB = j10;
                                    }
                                    if ((256 & i12) != 0) {
                                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap = androidx.compose.foundation.layout.c0.f10254v;
                                        i13 &= -234881025;
                                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                    } else {
                                        a0Var2 = a0Var;
                                    }
                                    long j14 = jB;
                                    i24 = i13;
                                    j12 = j14;
                                } else {
                                    c1086gP.w();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((128 & i12) != 0) {
                                        i13 &= -29360129;
                                    }
                                    if ((256 & i12) != 0) {
                                        i13 &= -234881025;
                                    }
                                    i23 = i10;
                                    a0Var2 = a0Var;
                                    hVar3 = hVar2;
                                    pVar9 = pVar5;
                                    pVar10 = pVar6;
                                    j11 = j;
                                    i24 = i13;
                                    j12 = j10;
                                }
                                c1086gP.U();
                                int i29 = (i24 & 234881024) ^ 100663296;
                                z10 = (i29 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864;
                                objF = c1086gP.f();
                                long j15 = j12;
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (z10 || objF == c0153a) {
                                    objF = new androidx.compose.material3.internal.z(a0Var2);
                                    c1086gP.E(objF);
                                }
                                zVar = (androidx.compose.material3.internal.z) objF;
                                zK = c1086gP.K(zVar) | ((i29 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                                objF2 = c1086gP.f();
                                if (zK || objF2 == c0153a) {
                                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var4) {
                                            androidx.compose.material3.internal.z zVar2 = zVar;
                                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var4));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF2);
                                }
                                final int i30 = i23;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar9;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar7;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar8;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar10;
                                int i31 = i24 >> 12;
                                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j15, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                            ScaffoldKt.b(i30, pVar14, qVar, pVar15, pVar16, zVar, pVar17, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP), c1086gP, (i31 & 896) | 12582912 | (i31 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                                j13 = j15;
                                a0Var3 = a0Var2;
                                pVar11 = pVar10;
                                hVar4 = hVar3;
                                pVar12 = pVar9;
                                pVar13 = pVar7;
                                i25 = i23;
                            } else {
                                c1086gP.w();
                                i25 = i10;
                                a0Var3 = a0Var;
                                pVar13 = pVar7;
                                hVar4 = hVar2;
                                pVar12 = pVar5;
                                pVar11 = pVar6;
                                j11 = j;
                                j13 = j10;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar8;
                                final int i32 = i25;
                                final long j16 = j11;
                                final androidx.compose.foundation.layout.a0 a0Var4 = a0Var3;
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar18, i32, j16, j13, a0Var4, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i13 |= 805306368;
                        if ((i13 & 306783379) == 306783378) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap2 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j17 = jB;
                                i24 = i13;
                                j12 = j17;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap3 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j18 = jB;
                                i24 = i13;
                                j12 = j18;
                            }
                            c1086gP.U();
                            int i210 = (i24 & 234881024) ^ 100663296;
                            if (i210 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j19 = j12;
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i210 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var5) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var5));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var5) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var5));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i33 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar10;
                            int i34 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j19, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i33, pVar19, qVar, pVar110, pVar111, zVar, pVar112, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i34 & 896) | 12582912 | (i34 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j19;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        } else {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap4 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j110 = jB;
                                i24 = i13;
                                j12 = j110;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap5 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j111 = jB;
                                i24 = i13;
                                j12 = j111;
                            }
                            c1086gP.U();
                            int i211 = (i24 & 234881024) ^ 100663296;
                            if (i211 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j112 = j12;
                            InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i211 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var5) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var5));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var5) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var5));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i35 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar10;
                            int i36 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i35, pVar113, qVar, pVar114, pVar115, zVar, pVar116, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i36 & 896) | 12582912 | (i36 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j112;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar8;
                            final int i37 = i25;
                            final long j113 = j11;
                            final androidx.compose.foundation.layout.a0 a0Var5 = a0Var3;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar117, i37, j113, j13, a0Var5, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 24576;
                    pVar8 = pVar4;
                    i20 = 32 & i12;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.h(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c1086gP.k(qVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap6 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j114 = jB;
                                i24 = i13;
                                j12 = j114;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap7 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j115 = jB;
                                i24 = i13;
                                j12 = j115;
                            }
                            c1086gP.U();
                            int i212 = (i24 & 234881024) ^ 100663296;
                            if (i212 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j116 = j12;
                            InterfaceC1084f.a.C0153a c0153a4 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i212 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var6) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var6));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var6) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var6));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i38 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar10;
                            int i39 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j116, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i38, pVar118, qVar, pVar119, pVar1110, zVar, pVar1111, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i39 & 896) | 12582912 | (i39 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j116;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        } else {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap8 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j117 = jB;
                                i24 = i13;
                                j12 = j117;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap9 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j118 = jB;
                                i24 = i13;
                                j12 = j118;
                            }
                            c1086gP.U();
                            int i213 = (i24 & 234881024) ^ 100663296;
                            if (i213 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j119 = j12;
                            InterfaceC1084f.a.C0153a c0153a5 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i213 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var6) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var6));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var6) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var6));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i310 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar10;
                            int i311 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j119, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i310, pVar1112, qVar, pVar1113, pVar1114, zVar, pVar1115, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i311 & 896) | 12582912 | (i311 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j119;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar8;
                            final int i312 = i25;
                            final long j1110 = j11;
                            final androidx.compose.foundation.layout.a0 a0Var6 = a0Var3;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1116, i312, j1110, j13, a0Var6, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap10 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111 = jB;
                            i24 = i13;
                            j12 = j1111;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1112 = jB;
                            i24 = i13;
                            j12 = j1112;
                        }
                        c1086gP.U();
                        int i214 = (i24 & 234881024) ^ 100663296;
                        if (i214 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1113 = j12;
                        InterfaceC1084f.a.C0153a c0153a6 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i214 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var7) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var7));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var7) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var7));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i313 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar10;
                        int i314 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1113, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i313, pVar1117, qVar, pVar1118, pVar1119, zVar, pVar11110, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i314 & 896) | 12582912 | (i314 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1113;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap12 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1114 = jB;
                            i24 = i13;
                            j12 = j1114;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap13 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1115 = jB;
                            i24 = i13;
                            j12 = j1115;
                        }
                        c1086gP.U();
                        int i215 = (i24 & 234881024) ^ 100663296;
                        if (i215 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1116 = j12;
                        InterfaceC1084f.a.C0153a c0153a7 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i215 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var7) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var7));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var7) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var7));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i315 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11112 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11113 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11114 = pVar10;
                        int i316 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1116, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i315, pVar11111, qVar, pVar11112, pVar11113, zVar, pVar11114, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i316 & 896) | 12582912 | (i316 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1116;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11115 = pVar8;
                        final int i317 = i25;
                        final long j1117 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var7 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11115, i317, j1117, j13, a0Var7, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 3072;
                pVar7 = pVar3;
                i18 = 16 & i12;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (c1086gP.k(pVar8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = 32 & i12;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.h(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c1086gP.k(qVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap14 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1118 = jB;
                                i24 = i13;
                                j12 = j1118;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap15 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1119 = jB;
                                i24 = i13;
                                j12 = j1119;
                            }
                            c1086gP.U();
                            int i216 = (i24 & 234881024) ^ 100663296;
                            if (i216 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j11110 = j12;
                            InterfaceC1084f.a.C0153a c0153a8 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i216 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var8) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var8));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var8) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var8));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i318 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11116 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11117 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11118 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11119 = pVar10;
                            int i319 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11110, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i318, pVar11116, qVar, pVar11117, pVar11118, zVar, pVar11119, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i319 & 896) | 12582912 | (i319 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j11110;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        } else {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap16 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j11111 = jB;
                                i24 = i13;
                                j12 = j11111;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap17 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j11112 = jB;
                                i24 = i13;
                                j12 = j11112;
                            }
                            c1086gP.U();
                            int i217 = (i24 & 234881024) ^ 100663296;
                            if (i217 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j11113 = j12;
                            InterfaceC1084f.a.C0153a c0153a9 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i217 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var8) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var8));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var8) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var8));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i3110 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111110 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111112 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111113 = pVar10;
                            int i3111 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11113, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i3110, pVar111110, qVar, pVar111111, pVar111112, zVar, pVar111113, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i3111 & 896) | 12582912 | (i3111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j11113;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111114 = pVar8;
                            final int i3112 = i25;
                            final long j11114 = j11;
                            final androidx.compose.foundation.layout.a0 a0Var8 = a0Var3;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111114, i3112, j11114, j13, a0Var8, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap18 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11115 = jB;
                            i24 = i13;
                            j12 = j11115;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap19 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11116 = jB;
                            i24 = i13;
                            j12 = j11116;
                        }
                        c1086gP.U();
                        int i218 = (i24 & 234881024) ^ 100663296;
                        if (i218 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j11117 = j12;
                        InterfaceC1084f.a.C0153a c0153a10 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i218 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var9) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var9));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var9) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var9));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3113 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111115 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111116 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111117 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111118 = pVar10;
                        int i3114 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11117, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3113, pVar111115, qVar, pVar111116, pVar111117, zVar, pVar111118, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3114 & 896) | 12582912 | (i3114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j11117;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap110 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11118 = jB;
                            i24 = i13;
                            j12 = j11118;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11119 = jB;
                            i24 = i13;
                            j12 = j11119;
                        }
                        c1086gP.U();
                        int i219 = (i24 & 234881024) ^ 100663296;
                        if (i219 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j111110 = j12;
                        InterfaceC1084f.a.C0153a c0153a11 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i219 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var9) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var9));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var9) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var9));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3115 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111119 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111110 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111112 = pVar10;
                        int i3116 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111110, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3115, pVar111119, qVar, pVar1111110, pVar1111111, zVar, pVar1111112, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3116 & 896) | 12582912 | (i3116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j111110;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111113 = pVar8;
                        final int i3117 = i25;
                        final long j111111 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var9 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111113, i3117, j111111, j13, a0Var9, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                pVar8 = pVar4;
                i20 = 32 & i12;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.h(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap112 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111112 = jB;
                            i24 = i13;
                            j12 = j111112;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap113 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111113 = jB;
                            i24 = i13;
                            j12 = j111113;
                        }
                        c1086gP.U();
                        int i2110 = (i24 & 234881024) ^ 100663296;
                        if (i2110 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j111114 = j12;
                        InterfaceC1084f.a.C0153a c0153a12 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2110 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var10) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var10) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3118 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111114 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111115 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111116 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111117 = pVar10;
                        int i3119 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111114, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3118, pVar1111114, qVar, pVar1111115, pVar1111116, zVar, pVar1111117, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3119 & 896) | 12582912 | (i3119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j111114;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap114 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111115 = jB;
                            i24 = i13;
                            j12 = j111115;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap115 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111116 = jB;
                            i24 = i13;
                            j12 = j111116;
                        }
                        c1086gP.U();
                        int i2111 = (i24 & 234881024) ^ 100663296;
                        if (i2111 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j111117 = j12;
                        InterfaceC1084f.a.C0153a c0153a13 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2111 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var10) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var10) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var10));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i31110 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111118 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111119 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111110 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111 = pVar10;
                        int i31111 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111117, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i31110, pVar1111118, qVar, pVar1111119, pVar11111110, zVar, pVar11111111, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i31111 & 896) | 12582912 | (i31111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j111117;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111112 = pVar8;
                        final int i31112 = i25;
                        final long j111118 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var10 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111112, i31112, j111118, j13, a0Var10, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap116 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111119 = jB;
                        i24 = i13;
                        j12 = j111119;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap117 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111110 = jB;
                        i24 = i13;
                        j12 = j1111110;
                    }
                    c1086gP.U();
                    int i2112 = (i24 & 234881024) ^ 100663296;
                    if (i2112 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j1111111 = j12;
                    InterfaceC1084f.a.C0153a c0153a14 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2112 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var11) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var11));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var11) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var11));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31113 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111113 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111114 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111115 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111116 = pVar10;
                    int i31114 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31113, pVar11111113, qVar, pVar11111114, pVar11111115, zVar, pVar11111116, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31114 & 896) | 12582912 | (i31114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j1111111;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap118 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111112 = jB;
                        i24 = i13;
                        j12 = j1111112;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap119 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111113 = jB;
                        i24 = i13;
                        j12 = j1111113;
                    }
                    c1086gP.U();
                    int i2113 = (i24 & 234881024) ^ 100663296;
                    if (i2113 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j1111114 = j12;
                    InterfaceC1084f.a.C0153a c0153a15 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2113 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var11) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var11));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var11) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var11));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31115 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111117 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111118 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111119 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111110 = pVar10;
                    int i31116 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111114, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31115, pVar11111117, qVar, pVar11111118, pVar11111119, zVar, pVar111111110, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31116 & 896) | 12582912 | (i31116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j1111114;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111 = pVar8;
                    final int i31117 = i25;
                    final long j1111115 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var11 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111, i31117, j1111115, j13, a0Var11, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 384;
            pVar6 = pVar2;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    pVar7 = pVar3;
                    if (c1086gP.k(pVar7)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = 16 & i12;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (c1086gP.k(pVar8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = 32 & i12;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.h(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c1086gP.k(qVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1110 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111116 = jB;
                                i24 = i13;
                                j12 = j1111116;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111117 = jB;
                                i24 = i13;
                                j12 = j1111117;
                            }
                            c1086gP.U();
                            int i2114 = (i24 & 234881024) ^ 100663296;
                            if (i2114 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j1111118 = j12;
                            InterfaceC1084f.a.C0153a c0153a16 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i2114 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var12) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var12));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var12) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var12));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i31118 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111112 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111113 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111114 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111115 = pVar10;
                            int i31119 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111118, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i31118, pVar111111112, qVar, pVar111111113, pVar111111114, zVar, pVar111111115, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i31119 & 896) | 12582912 | (i31119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j1111118;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        } else {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1112 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111119 = jB;
                                i24 = i13;
                                j12 = j1111119;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1113 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j11111110 = jB;
                                i24 = i13;
                                j12 = j11111110;
                            }
                            c1086gP.U();
                            int i2115 = (i24 & 234881024) ^ 100663296;
                            if (i2115 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j11111111 = j12;
                            InterfaceC1084f.a.C0153a c0153a17 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i2115 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var12) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var12));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var12) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var12));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i311110 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111116 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111117 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111118 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111119 = pVar10;
                            int i311111 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i311110, pVar111111116, qVar, pVar111111117, pVar111111118, zVar, pVar111111119, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i311111 & 896) | 12582912 | (i311111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j11111111;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111110 = pVar8;
                            final int i311112 = i25;
                            final long j11111112 = j11;
                            final androidx.compose.foundation.layout.a0 a0Var12 = a0Var3;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111110, i311112, j11111112, j13, a0Var12, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1114 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111113 = jB;
                            i24 = i13;
                            j12 = j11111113;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1115 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111114 = jB;
                            i24 = i13;
                            j12 = j11111114;
                        }
                        c1086gP.U();
                        int i2116 = (i24 & 234881024) ^ 100663296;
                        if (i2116 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j11111115 = j12;
                        InterfaceC1084f.a.C0153a c0153a18 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2116 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var13) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var13));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var13) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var13));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i311113 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111112 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111113 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111114 = pVar10;
                        int i311114 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111115, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i311113, pVar1111111111, qVar, pVar1111111112, pVar1111111113, zVar, pVar1111111114, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i311114 & 896) | 12582912 | (i311114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j11111115;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1116 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111116 = jB;
                            i24 = i13;
                            j12 = j11111116;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1117 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111117 = jB;
                            i24 = i13;
                            j12 = j11111117;
                        }
                        c1086gP.U();
                        int i2117 = (i24 & 234881024) ^ 100663296;
                        if (i2117 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j11111118 = j12;
                        InterfaceC1084f.a.C0153a c0153a19 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2117 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var13) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var13));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var13) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var13));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i311115 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111115 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111116 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111117 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111118 = pVar10;
                        int i311116 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111118, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i311115, pVar1111111115, qVar, pVar1111111116, pVar1111111117, zVar, pVar1111111118, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i311116 & 896) | 12582912 | (i311116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j11111118;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111119 = pVar8;
                        final int i311117 = i25;
                        final long j11111119 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var13 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111119, i311117, j11111119, j13, a0Var13, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                pVar8 = pVar4;
                i20 = 32 & i12;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.h(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1118 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111110 = jB;
                            i24 = i13;
                            j12 = j111111110;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1119 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111111 = jB;
                            i24 = i13;
                            j12 = j111111111;
                        }
                        c1086gP.U();
                        int i2118 = (i24 & 234881024) ^ 100663296;
                        if (i2118 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j111111112 = j12;
                        InterfaceC1084f.a.C0153a c0153a110 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2118 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var14) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var14));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var14) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var14));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i311118 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111110 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111112 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111113 = pVar10;
                        int i311119 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i311118, pVar11111111110, qVar, pVar11111111111, pVar11111111112, zVar, pVar11111111113, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i311119 & 896) | 12582912 | (i311119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j111111112;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11110 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111113 = jB;
                            i24 = i13;
                            j12 = j111111113;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111114 = jB;
                            i24 = i13;
                            j12 = j111111114;
                        }
                        c1086gP.U();
                        int i2119 = (i24 & 234881024) ^ 100663296;
                        if (i2119 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j111111115 = j12;
                        InterfaceC1084f.a.C0153a c0153a111 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2119 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var14) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var14));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var14) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var14));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3111110 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111114 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111115 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111116 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111117 = pVar10;
                        int i3111111 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111115, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3111110, pVar11111111114, qVar, pVar11111111115, pVar11111111116, zVar, pVar11111111117, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3111111 & 896) | 12582912 | (i3111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j111111115;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111118 = pVar8;
                        final int i3111112 = i25;
                        final long j111111116 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var14 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111118, i3111112, j111111116, j13, a0Var14, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11112 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111117 = jB;
                        i24 = i13;
                        j12 = j111111117;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11113 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111118 = jB;
                        i24 = i13;
                        j12 = j111111118;
                    }
                    c1086gP.U();
                    int i21110 = (i24 & 234881024) ^ 100663296;
                    if (i21110 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j111111119 = j12;
                    InterfaceC1084f.a.C0153a c0153a112 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21110 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var15) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var15));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var15) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var15));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i3111113 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111119 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111110 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111112 = pVar10;
                    int i3111114 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111119, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i3111113, pVar11111111119, qVar, pVar111111111110, pVar111111111111, zVar, pVar111111111112, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i3111114 & 896) | 12582912 | (i3111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j111111119;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11114 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111110 = jB;
                        i24 = i13;
                        j12 = j1111111110;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11115 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111 = jB;
                        i24 = i13;
                        j12 = j1111111111;
                    }
                    c1086gP.U();
                    int i21111 = (i24 & 234881024) ^ 100663296;
                    if (i21111 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j1111111112 = j12;
                    InterfaceC1084f.a.C0153a c0153a113 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21111 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var15) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var15));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var15) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var15));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i3111115 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111113 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111114 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111115 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111116 = pVar10;
                    int i3111116 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i3111115, pVar111111111113, qVar, pVar111111111114, pVar111111111115, zVar, pVar111111111116, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i3111116 & 896) | 12582912 | (i3111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j1111111112;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111117 = pVar8;
                    final int i3111117 = i25;
                    final long j1111111113 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var15 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111117, i3111117, j1111111113, j13, a0Var15, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            pVar7 = pVar3;
            i18 = 16 & i12;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (c1086gP.k(pVar8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = 32 & i12;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.h(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11116 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111114 = jB;
                            i24 = i13;
                            j12 = j1111111114;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11117 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111115 = jB;
                            i24 = i13;
                            j12 = j1111111115;
                        }
                        c1086gP.U();
                        int i21112 = (i24 & 234881024) ^ 100663296;
                        if (i21112 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1111111116 = j12;
                        InterfaceC1084f.a.C0153a c0153a114 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i21112 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var16) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var16));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var16) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var16));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3111118 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111118 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111119 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111110 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111 = pVar10;
                        int i3111119 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111116, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3111118, pVar111111111118, qVar, pVar111111111119, pVar1111111111110, zVar, pVar1111111111111, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3111119 & 896) | 12582912 | (i3111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1111111116;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11118 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111117 = jB;
                            i24 = i13;
                            j12 = j1111111117;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11119 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111118 = jB;
                            i24 = i13;
                            j12 = j1111111118;
                        }
                        c1086gP.U();
                        int i21113 = (i24 & 234881024) ^ 100663296;
                        if (i21113 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1111111119 = j12;
                        InterfaceC1084f.a.C0153a c0153a115 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i21113 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var16) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var16));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var16) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var16));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i31111110 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111112 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111113 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111114 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111115 = pVar10;
                        int i31111111 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111119, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i31111110, pVar1111111111112, qVar, pVar1111111111113, pVar1111111111114, zVar, pVar1111111111115, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i31111111 & 896) | 12582912 | (i31111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1111111119;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111116 = pVar8;
                        final int i31111112 = i25;
                        final long j11111111110 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var16 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111116, i31111112, j11111111110, j13, a0Var16, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111110 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111 = jB;
                        i24 = i13;
                        j12 = j11111111111;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111112 = jB;
                        i24 = i13;
                        j12 = j11111111112;
                    }
                    c1086gP.U();
                    int i21114 = (i24 & 234881024) ^ 100663296;
                    if (i21114 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111113 = j12;
                    InterfaceC1084f.a.C0153a c0153a116 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21114 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var17) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var17));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var17) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var17));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111113 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111117 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111118 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111119 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111110 = pVar10;
                    int i31111114 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111113, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111113, pVar1111111111117, qVar, pVar1111111111118, pVar1111111111119, zVar, pVar11111111111110, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111114 & 896) | 12582912 | (i31111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111113;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111112 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111114 = jB;
                        i24 = i13;
                        j12 = j11111111114;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111113 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111115 = jB;
                        i24 = i13;
                        j12 = j11111111115;
                    }
                    c1086gP.U();
                    int i21115 = (i24 & 234881024) ^ 100663296;
                    if (i21115 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111116 = j12;
                    InterfaceC1084f.a.C0153a c0153a117 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21115 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var17) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var17));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var17) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var17));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111115 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111112 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111113 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111114 = pVar10;
                    int i31111116 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111116, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111115, pVar11111111111111, qVar, pVar11111111111112, pVar11111111111113, zVar, pVar11111111111114, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111116 & 896) | 12582912 | (i31111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111116;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111115 = pVar8;
                    final int i31111117 = i25;
                    final long j11111111117 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var17 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111111115, i31111117, j11111111117, j13, a0Var17, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            pVar8 = pVar4;
            i20 = 32 & i12;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.h(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111114 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111118 = jB;
                        i24 = i13;
                        j12 = j11111111118;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111115 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111119 = jB;
                        i24 = i13;
                        j12 = j11111111119;
                    }
                    c1086gP.U();
                    int i21116 = (i24 & 234881024) ^ 100663296;
                    if (i21116 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j111111111110 = j12;
                    InterfaceC1084f.a.C0153a c0153a118 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21116 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var18) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var18));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var18) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var18));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111118 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111116 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111117 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111118 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111119 = pVar10;
                    int i31111119 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111110, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111118, pVar11111111111116, qVar, pVar11111111111117, pVar11111111111118, zVar, pVar11111111111119, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111119 & 896) | 12582912 | (i31111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j111111111110;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111116 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111 = jB;
                        i24 = i13;
                        j12 = j111111111111;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111117 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111112 = jB;
                        i24 = i13;
                        j12 = j111111111112;
                    }
                    c1086gP.U();
                    int i21117 = (i24 & 234881024) ^ 100663296;
                    if (i21117 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j111111111113 = j12;
                    InterfaceC1084f.a.C0153a c0153a119 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21117 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var18) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var18));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var18) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var18));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i311111110 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111110 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111112 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111113 = pVar10;
                    int i311111111 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111113, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i311111110, pVar111111111111110, qVar, pVar111111111111111, pVar111111111111112, zVar, pVar111111111111113, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i311111111 & 896) | 12582912 | (i311111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j111111111113;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111114 = pVar8;
                    final int i311111112 = i25;
                    final long j111111111114 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var18 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111111114, i311111112, j111111111114, j13, a0Var18, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111118 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111115 = jB;
                    i24 = i13;
                    j12 = j111111111115;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111119 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111116 = jB;
                    i24 = i13;
                    j12 = j111111111116;
                }
                c1086gP.U();
                int i21118 = (i24 & 234881024) ^ 100663296;
                if (i21118 <= 67108864) {
                }
                objF = c1086gP.f();
                long j111111111117 = j12;
                InterfaceC1084f.a.C0153a c0153a1110 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21118 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var19) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var19));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var19) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var19));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i311111113 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111115 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111116 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111117 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111118 = pVar10;
                int i311111114 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111117, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i311111113, pVar111111111111115, qVar, pVar111111111111116, pVar111111111111117, zVar, pVar111111111111118, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i311111114 & 896) | 12582912 | (i311111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j111111111117;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111110 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111118 = jB;
                    i24 = i13;
                    j12 = j111111111118;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111119 = jB;
                    i24 = i13;
                    j12 = j111111111119;
                }
                c1086gP.U();
                int i21119 = (i24 & 234881024) ^ 100663296;
                if (i21119 <= 67108864) {
                }
                objF = c1086gP.f();
                long j1111111111110 = j12;
                InterfaceC1084f.a.C0153a c0153a1111 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21119 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var19) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var19));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var19) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var19));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i311111115 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111119 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111110 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111112 = pVar10;
                int i311111116 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111110, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i311111115, pVar111111111111119, qVar, pVar1111111111111110, pVar1111111111111111, zVar, pVar1111111111111112, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i311111116 & 896) | 12582912 | (i311111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j1111111111110;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111113 = pVar8;
                final int i311111117 = i25;
                final long j1111111111111 = j11;
                final androidx.compose.foundation.layout.a0 a0Var19 = a0Var3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111113, i311111117, j1111111111111, j13, a0Var19, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        pVar5 = pVar;
        i14 = 4 & i12;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                pVar6 = pVar2;
                if (c1086gP.k(pVar6)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    pVar7 = pVar3;
                    if (c1086gP.k(pVar7)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = 16 & i12;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (c1086gP.k(pVar8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = 32 & i12;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.h(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 1572864) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                    }
                    if ((i11 & 100663296) != 0) {
                        i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i11 & 805306368) == 0) {
                            if (c1086gP.k(qVar)) {
                                i22 = 536870912;
                            } else {
                                i22 = 268435456;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111112 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111111111112 = jB;
                                i24 = i13;
                                j12 = j1111111111112;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111113 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111111111113 = jB;
                                i24 = i13;
                                j12 = j1111111111113;
                            }
                            c1086gP.U();
                            int i211110 = (i24 & 234881024) ^ 100663296;
                            if (i211110 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j1111111111114 = j12;
                            InterfaceC1084f.a.C0153a c0153a1112 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i211110 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var110) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var110));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var110) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var110));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i311111118 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111114 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111115 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111116 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111117 = pVar10;
                            int i311111119 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111114, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i311111118, pVar1111111111111114, qVar, pVar1111111111111115, pVar1111111111111116, zVar, pVar1111111111111117, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i311111119 & 896) | 12582912 | (i311111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j1111111111114;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        } else {
                            c1086gP.r0();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111114 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111111111115 = jB;
                                i24 = i13;
                                j12 = j1111111111115;
                            } else {
                                if (i27 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i28 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                                } else {
                                    pVar9 = pVar5;
                                }
                                if (i14 != 0) {
                                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                                } else {
                                    pVar10 = pVar6;
                                }
                                if (i16 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                                }
                                if (i20 != 0) {
                                    i23 = 2;
                                } else {
                                    i23 = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                    i13 &= -3670017;
                                } else {
                                    j11 = j;
                                }
                                if ((128 & i12) != 0) {
                                    jB = ColorSchemeKt.b(j11, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    jB = j10;
                                }
                                if ((256 & i12) != 0) {
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111115 = androidx.compose.foundation.layout.c0.f10254v;
                                    i13 &= -234881025;
                                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                                } else {
                                    a0Var2 = a0Var;
                                }
                                long j1111111111116 = jB;
                                i24 = i13;
                                j12 = j1111111111116;
                            }
                            c1086gP.U();
                            int i211111 = (i24 & 234881024) ^ 100663296;
                            if (i211111 <= 67108864) {
                            }
                            objF = c1086gP.f();
                            long j1111111111117 = j12;
                            InterfaceC1084f.a.C0153a c0153a1113 = InterfaceC1084f.a.f12980a;
                            if (z10) {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.material3.internal.z(a0Var2);
                                c1086gP.E(objF);
                            }
                            zVar = (androidx.compose.material3.internal.z) objF;
                            zK = c1086gP.K(zVar) | ((i211111 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var110) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var110));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var110) {
                                        androidx.compose.material3.internal.z zVar2 = zVar;
                                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var110));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF2);
                            }
                            final int i3111111110 = i23;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111118 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111119 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111110 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111 = pVar10;
                            int i3111111111 = i24 >> 12;
                            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111117, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                        ScaffoldKt.b(i3111111110, pVar1111111111111118, qVar, pVar1111111111111119, pVar11111111111111110, zVar, pVar11111111111111111, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i3111111111 & 896) | 12582912 | (i3111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                            j13 = j1111111111117;
                            a0Var3 = a0Var2;
                            pVar11 = pVar10;
                            hVar4 = hVar3;
                            pVar12 = pVar9;
                            pVar13 = pVar7;
                            i25 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111112 = pVar8;
                            final int i3111111112 = i25;
                            final long j1111111111118 = j11;
                            final androidx.compose.foundation.layout.a0 a0Var110 = a0Var3;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111111111112, i3111111112, j1111111111118, j13, a0Var110, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 805306368;
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111116 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111119 = jB;
                            i24 = i13;
                            j12 = j1111111111119;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111117 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111111111110 = jB;
                            i24 = i13;
                            j12 = j11111111111110;
                        }
                        c1086gP.U();
                        int i211112 = (i24 & 234881024) ^ 100663296;
                        if (i211112 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j11111111111111 = j12;
                        InterfaceC1084f.a.C0153a c0153a1114 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i211112 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var111) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var111));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var111) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var111));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3111111113 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111113 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111114 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111115 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111116 = pVar10;
                        int i3111111114 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3111111113, pVar11111111111111113, qVar, pVar11111111111111114, pVar11111111111111115, zVar, pVar11111111111111116, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3111111114 & 896) | 12582912 | (i3111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j11111111111111;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111118 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111111111112 = jB;
                            i24 = i13;
                            j12 = j11111111111112;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111119 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111111111113 = jB;
                            i24 = i13;
                            j12 = j11111111111113;
                        }
                        c1086gP.U();
                        int i211113 = (i24 & 234881024) ^ 100663296;
                        if (i211113 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j11111111111114 = j12;
                        InterfaceC1084f.a.C0153a c0153a1115 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i211113 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var111) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var111));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var111) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var111));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3111111115 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111117 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111118 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111119 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111110 = pVar10;
                        int i3111111116 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111114, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3111111115, pVar11111111111111117, qVar, pVar11111111111111118, pVar11111111111111119, zVar, pVar111111111111111110, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3111111116 & 896) | 12582912 | (i3111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j11111111111114;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111 = pVar8;
                        final int i3111111117 = i25;
                        final long j11111111111115 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var111 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111111111111, i3111111117, j11111111111115, j13, a0Var111, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                pVar8 = pVar4;
                i20 = 32 & i12;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.h(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111110 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111111111116 = jB;
                            i24 = i13;
                            j12 = j11111111111116;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111111111117 = jB;
                            i24 = i13;
                            j12 = j11111111111117;
                        }
                        c1086gP.U();
                        int i211114 = (i24 & 234881024) ^ 100663296;
                        if (i211114 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j11111111111118 = j12;
                        InterfaceC1084f.a.C0153a c0153a1116 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i211114 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var112) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var112));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var112) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var112));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3111111118 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111112 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111113 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111114 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111115 = pVar10;
                        int i3111111119 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111118, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3111111118, pVar111111111111111112, qVar, pVar111111111111111113, pVar111111111111111114, zVar, pVar111111111111111115, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3111111119 & 896) | 12582912 | (i3111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j11111111111118;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111112 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j11111111111119 = jB;
                            i24 = i13;
                            j12 = j11111111111119;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111113 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111111111110 = jB;
                            i24 = i13;
                            j12 = j111111111111110;
                        }
                        c1086gP.U();
                        int i211115 = (i24 & 234881024) ^ 100663296;
                        if (i211115 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j111111111111111 = j12;
                        InterfaceC1084f.a.C0153a c0153a1117 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i211115 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var112) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var112));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var112) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var112));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i31111111110 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111116 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111117 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111118 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111119 = pVar10;
                        int i31111111111 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i31111111110, pVar111111111111111116, qVar, pVar111111111111111117, pVar111111111111111118, zVar, pVar111111111111111119, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i31111111111 & 896) | 12582912 | (i31111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j111111111111111;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111110 = pVar8;
                        final int i31111111112 = i25;
                        final long j111111111111112 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var112 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111111110, i31111111112, j111111111111112, j13, a0Var112, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111114 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111113 = jB;
                        i24 = i13;
                        j12 = j111111111111113;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111115 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111114 = jB;
                        i24 = i13;
                        j12 = j111111111111114;
                    }
                    c1086gP.U();
                    int i211116 = (i24 & 234881024) ^ 100663296;
                    if (i211116 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j111111111111115 = j12;
                    InterfaceC1084f.a.C0153a c0153a1118 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i211116 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var113) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var113));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var113) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var113));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111111113 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111112 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111113 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111114 = pVar10;
                    int i31111111114 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111115, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111111113, pVar1111111111111111111, qVar, pVar1111111111111111112, pVar1111111111111111113, zVar, pVar1111111111111111114, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111111114 & 896) | 12582912 | (i31111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j111111111111115;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111116 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111116 = jB;
                        i24 = i13;
                        j12 = j111111111111116;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111117 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111117 = jB;
                        i24 = i13;
                        j12 = j111111111111117;
                    }
                    c1086gP.U();
                    int i211117 = (i24 & 234881024) ^ 100663296;
                    if (i211117 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j111111111111118 = j12;
                    InterfaceC1084f.a.C0153a c0153a1119 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i211117 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var113) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var113));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var113) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var113));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111111115 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111115 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111116 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111117 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111118 = pVar10;
                    int i31111111116 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111118, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111111115, pVar1111111111111111115, qVar, pVar1111111111111111116, pVar1111111111111111117, zVar, pVar1111111111111111118, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111111116 & 896) | 12582912 | (i31111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j111111111111118;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111119 = pVar8;
                    final int i31111111117 = i25;
                    final long j111111111111119 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var113 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111111119, i31111111117, j111111111111119, j13, a0Var113, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            pVar7 = pVar3;
            i18 = 16 & i12;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (c1086gP.k(pVar8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = 32 & i12;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.h(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111118 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111111110 = jB;
                            i24 = i13;
                            j12 = j1111111111111110;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111119 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111111111 = jB;
                            i24 = i13;
                            j12 = j1111111111111111;
                        }
                        c1086gP.U();
                        int i211118 = (i24 & 234881024) ^ 100663296;
                        if (i211118 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1111111111111112 = j12;
                        InterfaceC1084f.a.C0153a c0153a11110 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i211118 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var114) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var114));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var114) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var114));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i31111111118 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111110 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111112 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111113 = pVar10;
                        int i31111111119 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i31111111118, pVar11111111111111111110, qVar, pVar11111111111111111111, pVar11111111111111111112, zVar, pVar11111111111111111113, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i31111111119 & 896) | 12582912 | (i31111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1111111111111112;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111110 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111111113 = jB;
                            i24 = i13;
                            j12 = j1111111111111113;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111111114 = jB;
                            i24 = i13;
                            j12 = j1111111111111114;
                        }
                        c1086gP.U();
                        int i211119 = (i24 & 234881024) ^ 100663296;
                        if (i211119 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1111111111111115 = j12;
                        InterfaceC1084f.a.C0153a c0153a11111 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i211119 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var114) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var114));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var114) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var114));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i311111111110 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111114 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111115 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111116 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111117 = pVar10;
                        int i311111111111 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111115, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i311111111110, pVar11111111111111111114, qVar, pVar11111111111111111115, pVar11111111111111111116, zVar, pVar11111111111111111117, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i311111111111 & 896) | 12582912 | (i311111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1111111111111115;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111118 = pVar8;
                        final int i311111111112 = i25;
                        final long j1111111111111116 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var114 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111111111111118, i311111111112, j1111111111111116, j13, a0Var114, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111112 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111117 = jB;
                        i24 = i13;
                        j12 = j1111111111111117;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111113 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111118 = jB;
                        i24 = i13;
                        j12 = j1111111111111118;
                    }
                    c1086gP.U();
                    int i2111110 = (i24 & 234881024) ^ 100663296;
                    if (i2111110 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j1111111111111119 = j12;
                    InterfaceC1084f.a.C0153a c0153a11112 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2111110 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var115) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var115));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var115) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var115));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i311111111113 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111119 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111110 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111112 = pVar10;
                    int i311111111114 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111119, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i311111111113, pVar11111111111111111119, qVar, pVar111111111111111111110, pVar111111111111111111111, zVar, pVar111111111111111111112, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i311111111114 & 896) | 12582912 | (i311111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j1111111111111119;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111114 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111110 = jB;
                        i24 = i13;
                        j12 = j11111111111111110;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111115 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111111 = jB;
                        i24 = i13;
                        j12 = j11111111111111111;
                    }
                    c1086gP.U();
                    int i2111111 = (i24 & 234881024) ^ 100663296;
                    if (i2111111 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111111111112 = j12;
                    InterfaceC1084f.a.C0153a c0153a11113 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2111111 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var115) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var115));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var115) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var115));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i311111111115 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111113 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111114 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111115 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111116 = pVar10;
                    int i311111111116 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i311111111115, pVar111111111111111111113, qVar, pVar111111111111111111114, pVar111111111111111111115, zVar, pVar111111111111111111116, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i311111111116 & 896) | 12582912 | (i311111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111111111112;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111117 = pVar8;
                    final int i311111111117 = i25;
                    final long j11111111111111113 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var115 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111111111111117, i311111111117, j11111111111111113, j13, a0Var115, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            pVar8 = pVar4;
            i20 = 32 & i12;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.h(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111116 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111114 = jB;
                        i24 = i13;
                        j12 = j11111111111111114;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111117 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111115 = jB;
                        i24 = i13;
                        j12 = j11111111111111115;
                    }
                    c1086gP.U();
                    int i2111112 = (i24 & 234881024) ^ 100663296;
                    if (i2111112 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111111111116 = j12;
                    InterfaceC1084f.a.C0153a c0153a11114 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2111112 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var116) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var116));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var116) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var116));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i311111111118 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111118 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111119 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111110 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111 = pVar10;
                    int i311111111119 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111116, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i311111111118, pVar111111111111111111118, qVar, pVar111111111111111111119, pVar1111111111111111111110, zVar, pVar1111111111111111111111, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i311111111119 & 896) | 12582912 | (i311111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111111111116;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111118 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111117 = jB;
                        i24 = i13;
                        j12 = j11111111111111117;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111119 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111118 = jB;
                        i24 = i13;
                        j12 = j11111111111111118;
                    }
                    c1086gP.U();
                    int i2111113 = (i24 & 234881024) ^ 100663296;
                    if (i2111113 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111111111119 = j12;
                    InterfaceC1084f.a.C0153a c0153a11115 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2111113 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var116) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var116));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var116) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var116));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i3111111111110 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111112 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111113 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111114 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111115 = pVar10;
                    int i3111111111111 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111119, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i3111111111110, pVar1111111111111111111112, qVar, pVar1111111111111111111113, pVar1111111111111111111114, zVar, pVar1111111111111111111115, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i3111111111111 & 896) | 12582912 | (i3111111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111111111119;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111116 = pVar8;
                    final int i3111111111112 = i25;
                    final long j111111111111111110 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var116 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111111111116, i3111111111112, j111111111111111110, j13, a0Var116, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111110 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111111 = jB;
                    i24 = i13;
                    j12 = j111111111111111111;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111112 = jB;
                    i24 = i13;
                    j12 = j111111111111111112;
                }
                c1086gP.U();
                int i2111114 = (i24 & 234881024) ^ 100663296;
                if (i2111114 <= 67108864) {
                }
                objF = c1086gP.f();
                long j111111111111111113 = j12;
                InterfaceC1084f.a.C0153a c0153a11116 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i2111114 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var117) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var117));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var117) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var117));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i3111111111113 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111117 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111118 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111119 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111110 = pVar10;
                int i3111111111114 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111113, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i3111111111113, pVar1111111111111111111117, qVar, pVar1111111111111111111118, pVar1111111111111111111119, zVar, pVar11111111111111111111110, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i3111111111114 & 896) | 12582912 | (i3111111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j111111111111111113;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111112 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111114 = jB;
                    i24 = i13;
                    j12 = j111111111111111114;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111113 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111115 = jB;
                    i24 = i13;
                    j12 = j111111111111111115;
                }
                c1086gP.U();
                int i2111115 = (i24 & 234881024) ^ 100663296;
                if (i2111115 <= 67108864) {
                }
                objF = c1086gP.f();
                long j111111111111111116 = j12;
                InterfaceC1084f.a.C0153a c0153a11117 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i2111115 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var117) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var117));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var117) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var117));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i3111111111115 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111112 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111113 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111114 = pVar10;
                int i3111111111116 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111116, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i3111111111115, pVar11111111111111111111111, qVar, pVar11111111111111111111112, pVar11111111111111111111113, zVar, pVar11111111111111111111114, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i3111111111116 & 896) | 12582912 | (i3111111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j111111111111111116;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111115 = pVar8;
                final int i3111111111117 = i25;
                final long j111111111111111117 = j11;
                final androidx.compose.foundation.layout.a0 a0Var117 = a0Var3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111111111111111115, i3111111111117, j111111111111111117, j13, a0Var117, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        pVar6 = pVar2;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                pVar7 = pVar3;
                if (c1086gP.k(pVar7)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = 16 & i12;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (c1086gP.k(pVar8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = 32 & i12;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.h(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
                }
                if ((i11 & 100663296) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
                }
                if ((i12 & 512) != 0) {
                    if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111114 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111111111111118 = jB;
                            i24 = i13;
                            j12 = j111111111111111118;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111115 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j111111111111111119 = jB;
                            i24 = i13;
                            j12 = j111111111111111119;
                        }
                        c1086gP.U();
                        int i2111116 = (i24 & 234881024) ^ 100663296;
                        if (i2111116 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1111111111111111110 = j12;
                        InterfaceC1084f.a.C0153a c0153a11118 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2111116 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var118) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var118));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var118) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var118));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i3111111111118 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111116 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111117 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111118 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111119 = pVar10;
                        int i3111111111119 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111111110, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i3111111111118, pVar11111111111111111111116, qVar, pVar11111111111111111111117, pVar11111111111111111111118, zVar, pVar11111111111111111111119, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i3111111111119 & 896) | 12582912 | (i3111111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1111111111111111110;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111116 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111111111111 = jB;
                            i24 = i13;
                            j12 = j1111111111111111111;
                        } else {
                            if (i27 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i28 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                            } else {
                                pVar9 = pVar5;
                            }
                            if (i14 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                            } else {
                                pVar10 = pVar6;
                            }
                            if (i16 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                            }
                            if (i20 != 0) {
                                i23 = 2;
                            } else {
                                i23 = i10;
                            }
                            if ((i12 & 64) != 0) {
                                j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                                i13 &= -3670017;
                            } else {
                                j11 = j;
                            }
                            if ((128 & i12) != 0) {
                                jB = ColorSchemeKt.b(j11, c1086gP);
                                i13 &= -29360129;
                            } else {
                                jB = j10;
                            }
                            if ((256 & i12) != 0) {
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111117 = androidx.compose.foundation.layout.c0.f10254v;
                                i13 &= -234881025;
                                a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                            } else {
                                a0Var2 = a0Var;
                            }
                            long j1111111111111111112 = jB;
                            i24 = i13;
                            j12 = j1111111111111111112;
                        }
                        c1086gP.U();
                        int i2111117 = (i24 & 234881024) ^ 100663296;
                        if (i2111117 <= 67108864) {
                        }
                        objF = c1086gP.f();
                        long j1111111111111111113 = j12;
                        InterfaceC1084f.a.C0153a c0153a11119 = InterfaceC1084f.a.f12980a;
                        if (z10) {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.material3.internal.z(a0Var2);
                            c1086gP.E(objF);
                        }
                        zVar = (androidx.compose.material3.internal.z) objF;
                        zK = c1086gP.K(zVar) | ((i2111117 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var118) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var118));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var118) {
                                    androidx.compose.material3.internal.z zVar2 = zVar;
                                    zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var118));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        final int i31111111111110 = i23;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111110 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111112 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111113 = pVar10;
                        int i31111111111111 = i24 >> 12;
                        SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111111113, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                    ScaffoldKt.b(i31111111111110, pVar111111111111111111111110, qVar, pVar111111111111111111111111, pVar111111111111111111111112, zVar, pVar111111111111111111111113, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i31111111111111 & 896) | 12582912 | (i31111111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                        j13 = j1111111111111111113;
                        a0Var3 = a0Var2;
                        pVar11 = pVar10;
                        hVar4 = hVar3;
                        pVar12 = pVar9;
                        pVar13 = pVar7;
                        i25 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111114 = pVar8;
                        final int i31111111111112 = i25;
                        final long j1111111111111111114 = j11;
                        final androidx.compose.foundation.layout.a0 a0Var118 = a0Var3;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111111111111111114, i31111111111112, j1111111111111111114, j13, a0Var118, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 805306368;
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111118 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111111115 = jB;
                        i24 = i13;
                        j12 = j1111111111111111115;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111119 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111111116 = jB;
                        i24 = i13;
                        j12 = j1111111111111111116;
                    }
                    c1086gP.U();
                    int i2111118 = (i24 & 234881024) ^ 100663296;
                    if (i2111118 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j1111111111111111117 = j12;
                    InterfaceC1084f.a.C0153a c0153a111110 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2111118 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var119) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var119));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var119) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var119));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111111111113 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111115 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111116 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111117 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111118 = pVar10;
                    int i31111111111114 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111111117, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111111111113, pVar111111111111111111111115, qVar, pVar111111111111111111111116, pVar111111111111111111111117, zVar, pVar111111111111111111111118, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111111111114 & 896) | 12582912 | (i31111111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j1111111111111111117;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111110 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111111118 = jB;
                        i24 = i13;
                        j12 = j1111111111111111118;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111111 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111111119 = jB;
                        i24 = i13;
                        j12 = j1111111111111111119;
                    }
                    c1086gP.U();
                    int i2111119 = (i24 & 234881024) ^ 100663296;
                    if (i2111119 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111111111111110 = j12;
                    InterfaceC1084f.a.C0153a c0153a111111 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i2111119 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var119) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var119));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var119) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var119));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111111111115 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111119 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111110 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111112 = pVar10;
                    int i31111111111116 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111111110, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111111111115, pVar111111111111111111111119, qVar, pVar1111111111111111111111110, pVar1111111111111111111111111, zVar, pVar1111111111111111111111112, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111111111116 & 896) | 12582912 | (i31111111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111111111111110;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111113 = pVar8;
                    final int i31111111111117 = i25;
                    final long j11111111111111111111 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var119 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111111111111113, i31111111111117, j11111111111111111111, j13, a0Var119, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            pVar8 = pVar4;
            i20 = 32 & i12;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.h(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111112 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111111112 = jB;
                        i24 = i13;
                        j12 = j11111111111111111112;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111113 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111111113 = jB;
                        i24 = i13;
                        j12 = j11111111111111111113;
                    }
                    c1086gP.U();
                    int i21111110 = (i24 & 234881024) ^ 100663296;
                    if (i21111110 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111111111111114 = j12;
                    InterfaceC1084f.a.C0153a c0153a111112 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21111110 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1110) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1110));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1110) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1110));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i31111111111118 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111114 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111115 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111116 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111117 = pVar10;
                    int i31111111111119 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111111114, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i31111111111118, pVar1111111111111111111111114, qVar, pVar1111111111111111111111115, pVar1111111111111111111111116, zVar, pVar1111111111111111111111117, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i31111111111119 & 896) | 12582912 | (i31111111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111111111111114;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111114 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111111115 = jB;
                        i24 = i13;
                        j12 = j11111111111111111115;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111115 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j11111111111111111116 = jB;
                        i24 = i13;
                        j12 = j11111111111111111116;
                    }
                    c1086gP.U();
                    int i21111111 = (i24 & 234881024) ^ 100663296;
                    if (i21111111 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j11111111111111111117 = j12;
                    InterfaceC1084f.a.C0153a c0153a111113 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21111111 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1110) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1110));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1110) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1110));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i311111111111110 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111118 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111119 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111110 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111 = pVar10;
                    int i311111111111111 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111111117, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i311111111111110, pVar1111111111111111111111118, qVar, pVar1111111111111111111111119, pVar11111111111111111111111110, zVar, pVar11111111111111111111111111, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i311111111111111 & 896) | 12582912 | (i311111111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j11111111111111111117;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111112 = pVar8;
                    final int i311111111111112 = i25;
                    final long j11111111111111111118 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var1110 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111111111111111111112, i311111111111112, j11111111111111111118, j13, a0Var1110, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111116 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j11111111111111111119 = jB;
                    i24 = i13;
                    j12 = j11111111111111111119;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111117 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111111110 = jB;
                    i24 = i13;
                    j12 = j111111111111111111110;
                }
                c1086gP.U();
                int i21111112 = (i24 & 234881024) ^ 100663296;
                if (i21111112 <= 67108864) {
                }
                objF = c1086gP.f();
                long j111111111111111111111 = j12;
                InterfaceC1084f.a.C0153a c0153a111114 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21111112 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1111) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1111));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1111) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1111));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i311111111111113 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111113 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111114 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111115 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111116 = pVar10;
                int i311111111111114 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111111111, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i311111111111113, pVar11111111111111111111111113, qVar, pVar11111111111111111111111114, pVar11111111111111111111111115, zVar, pVar11111111111111111111111116, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i311111111111114 & 896) | 12582912 | (i311111111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j111111111111111111111;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111118 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111111112 = jB;
                    i24 = i13;
                    j12 = j111111111111111111112;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111111119 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j111111111111111111113 = jB;
                    i24 = i13;
                    j12 = j111111111111111111113;
                }
                c1086gP.U();
                int i21111113 = (i24 & 234881024) ^ 100663296;
                if (i21111113 <= 67108864) {
                }
                objF = c1086gP.f();
                long j111111111111111111114 = j12;
                InterfaceC1084f.a.C0153a c0153a111115 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21111113 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1111) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1111));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1111) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1111));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i311111111111115 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111117 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111118 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111119 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111110 = pVar10;
                int i311111111111116 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111111114, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i311111111111115, pVar11111111111111111111111117, qVar, pVar11111111111111111111111118, pVar11111111111111111111111119, zVar, pVar111111111111111111111111110, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i311111111111116 & 896) | 12582912 | (i311111111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j111111111111111111114;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111 = pVar8;
                final int i311111111111117 = i25;
                final long j111111111111111111115 = j11;
                final androidx.compose.foundation.layout.a0 a0Var1111 = a0Var3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111111111111111111111, i311111111111117, j111111111111111111115, j13, a0Var1111, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        pVar7 = pVar3;
        i18 = 16 & i12;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                pVar8 = pVar4;
                if (c1086gP.k(pVar8)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            i20 = 32 & i12;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.h(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
            }
            if ((i11 & 100663296) != 0) {
                i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
            }
            if ((i12 & 512) != 0) {
                if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                if ((i13 & 306783379) == 306783378) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111110 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111111111116 = jB;
                        i24 = i13;
                        j12 = j111111111111111111116;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111111 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111111111117 = jB;
                        i24 = i13;
                        j12 = j111111111111111111117;
                    }
                    c1086gP.U();
                    int i21111114 = (i24 & 234881024) ^ 100663296;
                    if (i21111114 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j111111111111111111118 = j12;
                    InterfaceC1084f.a.C0153a c0153a111116 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21111114 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1112) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1112));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1112) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1112));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i311111111111118 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111112 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111113 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111114 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111115 = pVar10;
                    int i311111111111119 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111111118, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i311111111111118, pVar111111111111111111111111112, qVar, pVar111111111111111111111111113, pVar111111111111111111111111114, zVar, pVar111111111111111111111111115, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i311111111111119 & 896) | 12582912 | (i311111111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j111111111111111111118;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111112 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j111111111111111111119 = jB;
                        i24 = i13;
                        j12 = j111111111111111111119;
                    } else {
                        if (i27 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i28 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                        } else {
                            pVar9 = pVar5;
                        }
                        if (i14 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                        } else {
                            pVar10 = pVar6;
                        }
                        if (i16 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                        }
                        if (i20 != 0) {
                            i23 = 2;
                        } else {
                            i23 = i10;
                        }
                        if ((i12 & 64) != 0) {
                            j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                            i13 &= -3670017;
                        } else {
                            j11 = j;
                        }
                        if ((128 & i12) != 0) {
                            jB = ColorSchemeKt.b(j11, c1086gP);
                            i13 &= -29360129;
                        } else {
                            jB = j10;
                        }
                        if ((256 & i12) != 0) {
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111113 = androidx.compose.foundation.layout.c0.f10254v;
                            i13 &= -234881025;
                            a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                        } else {
                            a0Var2 = a0Var;
                        }
                        long j1111111111111111111110 = jB;
                        i24 = i13;
                        j12 = j1111111111111111111110;
                    }
                    c1086gP.U();
                    int i21111115 = (i24 & 234881024) ^ 100663296;
                    if (i21111115 <= 67108864) {
                    }
                    objF = c1086gP.f();
                    long j1111111111111111111111 = j12;
                    InterfaceC1084f.a.C0153a c0153a111117 = InterfaceC1084f.a.f12980a;
                    if (z10) {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.material3.internal.z(a0Var2);
                        c1086gP.E(objF);
                    }
                    zVar = (androidx.compose.material3.internal.z) objF;
                    zK = c1086gP.K(zVar) | ((i21111115 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1112) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1112));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1112) {
                                androidx.compose.material3.internal.z zVar2 = zVar;
                                zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1112));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    final int i3111111111111110 = i23;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111116 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111117 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111118 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111119 = pVar10;
                    int i3111111111111111 = i24 >> 12;
                    SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111111111111, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                                ScaffoldKt.b(i3111111111111110, pVar111111111111111111111111116, qVar, pVar111111111111111111111111117, pVar111111111111111111111111118, zVar, pVar111111111111111111111111119, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i3111111111111111 & 896) | 12582912 | (i3111111111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                    j13 = j1111111111111111111111;
                    a0Var3 = a0Var2;
                    pVar11 = pVar10;
                    hVar4 = hVar3;
                    pVar12 = pVar9;
                    pVar13 = pVar7;
                    i25 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111110 = pVar8;
                    final int i3111111111111112 = i25;
                    final long j1111111111111111111112 = j11;
                    final androidx.compose.foundation.layout.a0 a0Var1112 = a0Var3;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111111111111111110, i3111111111111112, j1111111111111111111112, j13, a0Var1112, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 805306368;
            if ((i13 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111114 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j1111111111111111111113 = jB;
                    i24 = i13;
                    j12 = j1111111111111111111113;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111115 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j1111111111111111111114 = jB;
                    i24 = i13;
                    j12 = j1111111111111111111114;
                }
                c1086gP.U();
                int i21111116 = (i24 & 234881024) ^ 100663296;
                if (i21111116 <= 67108864) {
                }
                objF = c1086gP.f();
                long j1111111111111111111115 = j12;
                InterfaceC1084f.a.C0153a c0153a111118 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21111116 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1113) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1113));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1113) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1113));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i3111111111111113 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111111 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111112 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111113 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111114 = pVar10;
                int i3111111111111114 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111111111115, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i3111111111111113, pVar1111111111111111111111111111, qVar, pVar1111111111111111111111111112, pVar1111111111111111111111111113, zVar, pVar1111111111111111111111111114, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i3111111111111114 & 896) | 12582912 | (i3111111111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j1111111111111111111115;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111116 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j1111111111111111111116 = jB;
                    i24 = i13;
                    j12 = j1111111111111111111116;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111117 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j1111111111111111111117 = jB;
                    i24 = i13;
                    j12 = j1111111111111111111117;
                }
                c1086gP.U();
                int i21111117 = (i24 & 234881024) ^ 100663296;
                if (i21111117 <= 67108864) {
                }
                objF = c1086gP.f();
                long j1111111111111111111118 = j12;
                InterfaceC1084f.a.C0153a c0153a111119 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21111117 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1113) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1113));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1113) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1113));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i3111111111111115 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111115 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111116 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111117 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111118 = pVar10;
                int i3111111111111116 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j1111111111111111111118, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i3111111111111115, pVar1111111111111111111111111115, qVar, pVar1111111111111111111111111116, pVar1111111111111111111111111117, zVar, pVar1111111111111111111111111118, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i3111111111111116 & 896) | 12582912 | (i3111111111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j1111111111111111111118;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111111111111111111111119 = pVar8;
                final int i3111111111111117 = i25;
                final long j1111111111111111111119 = j11;
                final androidx.compose.foundation.layout.a0 a0Var1113 = a0Var3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar1111111111111111111111111119, i3111111111111117, j1111111111111111111119, j13, a0Var1113, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        pVar8 = pVar4;
        i20 = 32 & i12;
        if (i20 != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (c1086gP.h(i10)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        if ((i11 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i13 |= i26;
        }
        if ((i11 & 12582912) != 0) {
            i13 |= ((i12 & 128) == 0 || !c1086gP.i(j10)) ? 4194304 : 8388608;
        }
        if ((i11 & 100663296) != 0) {
            i13 |= ((i12 & 256) == 0 || !c1086gP.K(a0Var)) ? 33554432 : 67108864;
        }
        if ((i12 & 512) != 0) {
            if ((i11 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            if ((i13 & 306783379) == 306783378) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111118 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j11111111111111111111110 = jB;
                    i24 = i13;
                    j12 = j11111111111111111111110;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111111119 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j11111111111111111111111 = jB;
                    i24 = i13;
                    j12 = j11111111111111111111111;
                }
                c1086gP.U();
                int i21111118 = (i24 & 234881024) ^ 100663296;
                if (i21111118 <= 67108864) {
                }
                objF = c1086gP.f();
                long j11111111111111111111112 = j12;
                InterfaceC1084f.a.C0153a c0153a1111110 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21111118 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1114) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1114));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1114) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1114));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i3111111111111118 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111110 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111111 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111112 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111113 = pVar10;
                int i3111111111111119 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111111111112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i3111111111111118, pVar11111111111111111111111111110, qVar, pVar11111111111111111111111111111, pVar11111111111111111111111111112, zVar, pVar11111111111111111111111111113, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i3111111111111119 & 896) | 12582912 | (i3111111111111119 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j11111111111111111111112;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111110 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j11111111111111111111113 = jB;
                    i24 = i13;
                    j12 = j11111111111111111111113;
                } else {
                    if (i27 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i28 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                    } else {
                        pVar9 = pVar5;
                    }
                    if (i14 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                    } else {
                        pVar10 = pVar6;
                    }
                    if (i16 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                    }
                    if (i20 != 0) {
                        i23 = 2;
                    } else {
                        i23 = i10;
                    }
                    if ((i12 & 64) != 0) {
                        j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                        i13 &= -3670017;
                    } else {
                        j11 = j;
                    }
                    if ((128 & i12) != 0) {
                        jB = ColorSchemeKt.b(j11, c1086gP);
                        i13 &= -29360129;
                    } else {
                        jB = j10;
                    }
                    if ((256 & i12) != 0) {
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111111 = androidx.compose.foundation.layout.c0.f10254v;
                        i13 &= -234881025;
                        a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                    } else {
                        a0Var2 = a0Var;
                    }
                    long j11111111111111111111114 = jB;
                    i24 = i13;
                    j12 = j11111111111111111111114;
                }
                c1086gP.U();
                int i21111119 = (i24 & 234881024) ^ 100663296;
                if (i21111119 <= 67108864) {
                }
                objF = c1086gP.f();
                long j11111111111111111111115 = j12;
                InterfaceC1084f.a.C0153a c0153a1111111 = InterfaceC1084f.a.f12980a;
                if (z10) {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                } else {
                    objF = new androidx.compose.material3.internal.z(a0Var2);
                    c1086gP.E(objF);
                }
                zVar = (androidx.compose.material3.internal.z) objF;
                zK = c1086gP.K(zVar) | ((i21111119 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1114) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1114));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1114) {
                            androidx.compose.material3.internal.z zVar2 = zVar;
                            zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1114));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                final int i31111111111111110 = i23;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111114 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111115 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111116 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111117 = pVar10;
                int i31111111111111111 = i24 >> 12;
                SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111111111115, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                            ScaffoldKt.b(i31111111111111110, pVar11111111111111111111111111114, qVar, pVar11111111111111111111111111115, pVar11111111111111111111111111116, zVar, pVar11111111111111111111111111117, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i31111111111111111 & 896) | 12582912 | (i31111111111111111 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
                j13 = j11111111111111111111115;
                a0Var3 = a0Var2;
                pVar11 = pVar10;
                hVar4 = hVar3;
                pVar12 = pVar9;
                pVar13 = pVar7;
                i25 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111118 = pVar8;
                final int i31111111111111112 = i25;
                final long j11111111111111111111116 = j11;
                final androidx.compose.foundation.layout.a0 a0Var1114 = a0Var3;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar11111111111111111111111111118, i31111111111111112, j11111111111111111111116, j13, a0Var1114, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 805306368;
        if ((i13 & 306783379) == 306783378) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i28 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                } else {
                    pVar9 = pVar5;
                }
                if (i14 != 0) {
                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                } else {
                    pVar10 = pVar6;
                }
                if (i16 != 0) {
                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                }
                if (i18 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                }
                if (i20 != 0) {
                    i23 = 2;
                } else {
                    i23 = i10;
                }
                if ((i12 & 64) != 0) {
                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                    i13 &= -3670017;
                } else {
                    j11 = j;
                }
                if ((128 & i12) != 0) {
                    jB = ColorSchemeKt.b(j11, c1086gP);
                    i13 &= -29360129;
                } else {
                    jB = j10;
                }
                if ((256 & i12) != 0) {
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111112 = androidx.compose.foundation.layout.c0.f10254v;
                    i13 &= -234881025;
                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                } else {
                    a0Var2 = a0Var;
                }
                long j11111111111111111111117 = jB;
                i24 = i13;
                j12 = j11111111111111111111117;
            } else {
                if (i27 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i28 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                } else {
                    pVar9 = pVar5;
                }
                if (i14 != 0) {
                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                } else {
                    pVar10 = pVar6;
                }
                if (i16 != 0) {
                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                }
                if (i18 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                }
                if (i20 != 0) {
                    i23 = 2;
                } else {
                    i23 = i10;
                }
                if ((i12 & 64) != 0) {
                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                    i13 &= -3670017;
                } else {
                    j11 = j;
                }
                if ((128 & i12) != 0) {
                    jB = ColorSchemeKt.b(j11, c1086gP);
                    i13 &= -29360129;
                } else {
                    jB = j10;
                }
                if ((256 & i12) != 0) {
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111113 = androidx.compose.foundation.layout.c0.f10254v;
                    i13 &= -234881025;
                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                } else {
                    a0Var2 = a0Var;
                }
                long j11111111111111111111118 = jB;
                i24 = i13;
                j12 = j11111111111111111111118;
            }
            c1086gP.U();
            int i211111110 = (i24 & 234881024) ^ 100663296;
            if (i211111110 <= 67108864) {
            }
            objF = c1086gP.f();
            long j11111111111111111111119 = j12;
            InterfaceC1084f.a.C0153a c0153a1111112 = InterfaceC1084f.a.f12980a;
            if (z10) {
                objF = new androidx.compose.material3.internal.z(a0Var2);
                c1086gP.E(objF);
            } else {
                objF = new androidx.compose.material3.internal.z(a0Var2);
                c1086gP.E(objF);
            }
            zVar = (androidx.compose.material3.internal.z) objF;
            zK = c1086gP.K(zVar) | ((i211111110 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
            objF2 = c1086gP.f();
            if (zK) {
                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1115) {
                        androidx.compose.material3.internal.z zVar2 = zVar;
                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1115));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1115) {
                        androidx.compose.material3.internal.z zVar2 = zVar;
                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1115));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            final int i31111111111111113 = i23;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111111111111111111111119 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111110 = pVar7;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111111 = pVar8;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111112 = pVar10;
            int i31111111111111114 = i24 >> 12;
            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j11111111111111111111119, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                        ScaffoldKt.b(i31111111111111113, pVar11111111111111111111111111119, qVar, pVar111111111111111111111111111110, pVar111111111111111111111111111111, zVar, pVar111111111111111111111111111112, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i31111111111111114 & 896) | 12582912 | (i31111111111111114 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
            j13 = j11111111111111111111119;
            a0Var3 = a0Var2;
            pVar11 = pVar10;
            hVar4 = hVar3;
            pVar12 = pVar9;
            pVar13 = pVar7;
            i25 = i23;
        } else {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i28 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                } else {
                    pVar9 = pVar5;
                }
                if (i14 != 0) {
                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                } else {
                    pVar10 = pVar6;
                }
                if (i16 != 0) {
                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                }
                if (i18 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                }
                if (i20 != 0) {
                    i23 = 2;
                } else {
                    i23 = i10;
                }
                if ((i12 & 64) != 0) {
                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                    i13 &= -3670017;
                } else {
                    j11 = j;
                }
                if ((128 & i12) != 0) {
                    jB = ColorSchemeKt.b(j11, c1086gP);
                    i13 &= -29360129;
                } else {
                    jB = j10;
                }
                if ((256 & i12) != 0) {
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111114 = androidx.compose.foundation.layout.c0.f10254v;
                    i13 &= -234881025;
                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                } else {
                    a0Var2 = a0Var;
                }
                long j111111111111111111111110 = jB;
                i24 = i13;
                j12 = j111111111111111111111110;
            } else {
                if (i27 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i28 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f12109a;
                } else {
                    pVar9 = pVar5;
                }
                if (i14 != 0) {
                    pVar10 = ComposableSingletons$ScaffoldKt.f12110b;
                } else {
                    pVar10 = pVar6;
                }
                if (i16 != 0) {
                    pVar7 = ComposableSingletons$ScaffoldKt.f12111c;
                }
                if (i18 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f12112d;
                }
                if (i20 != 0) {
                    i23 = 2;
                } else {
                    i23 = i10;
                }
                if ((i12 & 64) != 0) {
                    j11 = ((C1061m) c1086gP.x(ColorSchemeKt.f12087a)).f12632n;
                    i13 &= -3670017;
                } else {
                    j11 = j;
                }
                if ((128 & i12) != 0) {
                    jB = ColorSchemeKt.b(j11, c1086gP);
                    i13 &= -29360129;
                } else {
                    jB = j10;
                }
                if ((256 & i12) != 0) {
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111111115 = androidx.compose.foundation.layout.c0.f10254v;
                    i13 &= -234881025;
                    a0Var2 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g;
                } else {
                    a0Var2 = a0Var;
                }
                long j111111111111111111111111 = jB;
                i24 = i13;
                j12 = j111111111111111111111111;
            }
            c1086gP.U();
            int i211111111 = (i24 & 234881024) ^ 100663296;
            if (i211111111 <= 67108864) {
            }
            objF = c1086gP.f();
            long j111111111111111111111112 = j12;
            InterfaceC1084f.a.C0153a c0153a1111113 = InterfaceC1084f.a.f12980a;
            if (z10) {
                objF = new androidx.compose.material3.internal.z(a0Var2);
                c1086gP.E(objF);
            } else {
                objF = new androidx.compose.material3.internal.z(a0Var2);
                c1086gP.E(objF);
            }
            zVar = (androidx.compose.material3.internal.z) objF;
            zK = c1086gP.K(zVar) | ((i211111111 <= 67108864 && c1086gP.K(a0Var2)) || (i24 & 100663296) == 67108864);
            objF2 = c1086gP.f();
            if (zK) {
                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1115) {
                        androidx.compose.material3.internal.z zVar2 = zVar;
                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1115));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.l<androidx.compose.foundation.layout.a0, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.foundation.layout.a0 a0Var1115) {
                        androidx.compose.material3.internal.z zVar2 = zVar;
                        zVar2.f12586a.setValue(new C0958s(a0Var2, a0Var1115));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            final int i31111111111111115 = i23;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111113 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111114 = pVar7;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111115 = pVar8;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111116 = pVar10;
            int i31111111111111116 = i24 >> 12;
            SurfaceKt.a(WindowInsetsPaddingKt.b(hVar3, (Ia.l) objF2), null, j11, j111111111111111111111112, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1979205334, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                        ScaffoldKt.b(i31111111111111115, pVar111111111111111111111111111113, qVar, pVar111111111111111111111111111114, pVar111111111111111111111111111115, zVar, pVar111111111111111111111111111116, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i31111111111111116 & 896) | 12582912 | (i31111111111111116 & 7168), R.styleable.AppCompatTheme_tooltipForegroundColor);
            j13 = j111111111111111111111112;
            a0Var3 = a0Var2;
            pVar11 = pVar10;
            hVar4 = hVar3;
            pVar12 = pVar9;
            pVar13 = pVar7;
            i25 = i23;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111111111111111111111111117 = pVar8;
            final int i31111111111111117 = i25;
            final long j111111111111111111111113 = j11;
            final androidx.compose.foundation.layout.a0 a0Var1115 = a0Var3;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ScaffoldKt.a(hVar4, pVar12, pVar11, pVar13, pVar111111111111111111111111111117, i31111111111111117, j111111111111111111111113, j13, a0Var1115, qVar, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final int i10, final Ia.p pVar, final Ia.q qVar, final Ia.p pVar2, final Ia.p pVar3, final androidx.compose.foundation.layout.a0 a0Var, final Ia.p pVar4, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.k(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c1086gP.k(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c1086gP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c1086gP.K(a0Var) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c1086gP.k(pVar4) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean z10 = ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.p<androidx.compose.ui.layout.e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.e0 e0Var, p013b0.a aVar) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        F f10;
                        Object obj4;
                        ArrayList arrayList;
                        Integer numValueOf;
                        int iIntValue;
                        int iE1;
                        int iB;
                        Object obj5;
                        Object obj6;
                        int iE2;
                        int iE3;
                        final androidx.compose.ui.layout.e0 e0Var2 = e0Var;
                        long j = aVar.f20475a;
                        final int iH = p013b0.a.h(j);
                        int iG = p013b0.a.g(j);
                        long jA = p013b0.a.a(j, 0, 0, 0, 0, 10);
                        List<androidx.compose.ui.layout.D> listR0 = e0Var2.R0(ScaffoldLayoutContent.f12292b, pVar);
                        final ArrayList arrayList2 = new ArrayList(listR0.size());
                        int size = listR0.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            arrayList2.add(listR0.get(i13).Q(jA));
                        }
                        if (!arrayList2.isEmpty()) {
                            obj = arrayList2.get(0);
                            int i14 = ((androidx.compose.ui.layout.Y) obj).f14221c;
                            int iR = kotlin.collections.l.r(arrayList2);
                            if (1 <= iR) {
                                int i15 = 1;
                                while (true) {
                                    Object obj7 = arrayList2.get(i15);
                                    int i16 = ((androidx.compose.ui.layout.Y) obj7).f14221c;
                                    if (i14 < i16) {
                                        obj = obj7;
                                        i14 = i16;
                                    }
                                    if (i15 == iR) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                        } else {
                            obj = null;
                        }
                        androidx.compose.ui.layout.Y y10 = (androidx.compose.ui.layout.Y) obj;
                        final int i17 = y10 != null ? y10.f14221c : 0;
                        List<androidx.compose.ui.layout.D> listR1 = e0Var2.R0(ScaffoldLayoutContent.f12294d, pVar2);
                        androidx.compose.foundation.layout.a0 a0Var2 = a0Var;
                        ArrayList arrayList3 = new ArrayList(listR1.size());
                        int i18 = 0;
                        for (int size2 = listR1.size(); i18 < size2; size2 = size2) {
                            arrayList3.add(listR1.get(i18).Q(p013b0.b.i(jA, (-a0Var2.a(e0Var2, e0Var2.getLayoutDirection())) - a0Var2.c(e0Var2, e0Var2.getLayoutDirection()), -a0Var2.b(e0Var2))));
                            i18++;
                            a0Var2 = a0Var2;
                            listR1 = listR1;
                        }
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList3.get(0);
                            int i19 = ((androidx.compose.ui.layout.Y) obj2).f14221c;
                            int iR2 = kotlin.collections.l.r(arrayList3);
                            if (1 <= iR2) {
                                Object obj8 = obj2;
                                int i20 = i19;
                                int i21 = 1;
                                while (true) {
                                    Object obj9 = arrayList3.get(i21);
                                    int i22 = ((androidx.compose.ui.layout.Y) obj9).f14221c;
                                    if (i20 < i22) {
                                        obj8 = obj9;
                                        i20 = i22;
                                    }
                                    if (i21 == iR2) {
                                        break;
                                    }
                                    i21++;
                                }
                                obj2 = obj8;
                            }
                        }
                        androidx.compose.ui.layout.Y y11 = (androidx.compose.ui.layout.Y) obj2;
                        int i23 = y11 != null ? y11.f14221c : 0;
                        if (arrayList3.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList3.get(0);
                            int i24 = ((androidx.compose.ui.layout.Y) obj3).f14220b;
                            int iR3 = kotlin.collections.l.r(arrayList3);
                            if (1 <= iR3) {
                                Object obj10 = obj3;
                                int i25 = i24;
                                int i26 = 1;
                                while (true) {
                                    Object obj11 = arrayList3.get(i26);
                                    int i27 = ((androidx.compose.ui.layout.Y) obj11).f14220b;
                                    if (i25 < i27) {
                                        obj10 = obj11;
                                        i25 = i27;
                                    }
                                    if (i26 == iR3) {
                                        break;
                                    }
                                    i26++;
                                }
                                obj3 = obj10;
                            }
                        }
                        androidx.compose.ui.layout.Y y12 = (androidx.compose.ui.layout.Y) obj3;
                        int i28 = y12 != null ? y12.f14220b : 0;
                        List<androidx.compose.ui.layout.D> listR2 = e0Var2.R0(ScaffoldLayoutContent.f12295e, pVar3);
                        androidx.compose.foundation.layout.a0 a0Var3 = a0Var;
                        ArrayList arrayList4 = new ArrayList(listR2.size());
                        int size3 = listR2.size();
                        int i29 = 0;
                        while (i29 < size3) {
                            List<androidx.compose.ui.layout.D> list = listR2;
                            int i30 = size3;
                            ArrayList arrayList5 = arrayList3;
                            int i31 = iG;
                            androidx.compose.foundation.layout.a0 a0Var4 = a0Var3;
                            androidx.compose.ui.layout.Y yQ = listR2.get(i29).Q(p013b0.b.i(jA, (-a0Var3.a(e0Var2, e0Var2.getLayoutDirection())) - a0Var3.c(e0Var2, e0Var2.getLayoutDirection()), -a0Var3.b(e0Var2)));
                            if (yQ.f14221c == 0 || yQ.f14220b == 0) {
                                yQ = null;
                            }
                            if (yQ != null) {
                                arrayList4.add(yQ);
                            }
                            i29++;
                            a0Var3 = a0Var4;
                            size3 = i30;
                            listR2 = list;
                            arrayList3 = arrayList5;
                            iG = i31;
                        }
                        final ArrayList arrayList6 = arrayList3;
                        final int i32 = iG;
                        if (arrayList4.isEmpty()) {
                            f10 = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList4.get(0);
                                int i33 = ((androidx.compose.ui.layout.Y) obj5).f14220b;
                                int iR4 = kotlin.collections.l.r(arrayList4);
                                if (1 <= iR4) {
                                    Object obj12 = obj5;
                                    int i34 = i33;
                                    int i35 = 1;
                                    while (true) {
                                        Object obj13 = arrayList4.get(i35);
                                        int i36 = ((androidx.compose.ui.layout.Y) obj13).f14220b;
                                        if (i34 < i36) {
                                            i34 = i36;
                                            obj12 = obj13;
                                        }
                                        if (i35 == iR4) {
                                            break;
                                        }
                                        i35++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            kotlin.jvm.internal.i.b(obj5);
                            int i37 = ((androidx.compose.ui.layout.Y) obj5).f14220b;
                            if (arrayList4.isEmpty()) {
                                obj6 = null;
                            } else {
                                obj6 = arrayList4.get(0);
                                int i38 = ((androidx.compose.ui.layout.Y) obj6).f14221c;
                                int iR5 = kotlin.collections.l.r(arrayList4);
                                if (1 <= iR5) {
                                    Object obj14 = obj6;
                                    int i39 = i38;
                                    int i40 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i40);
                                        Object obj16 = obj14;
                                        int i41 = ((androidx.compose.ui.layout.Y) obj15).f14221c;
                                        if (i39 < i41) {
                                            i39 = i41;
                                            obj14 = obj15;
                                        } else {
                                            obj14 = obj16;
                                        }
                                        if (i40 == iR5) {
                                            break;
                                        }
                                        i40++;
                                    }
                                    obj6 = obj14;
                                }
                            }
                            kotlin.jvm.internal.i.b(obj6);
                            int i42 = ((androidx.compose.ui.layout.Y) obj6).f14221c;
                            int i43 = i10;
                            if (i43 == 0) {
                                if (e0Var2.getLayoutDirection() == LayoutDirection.f15717b) {
                                    iE2 = e0Var2.e1(ScaffoldKt.f12291a);
                                } else {
                                    iE3 = e0Var2.e1(ScaffoldKt.f12291a);
                                    iE2 = (iH - iE3) - i37;
                                }
                            } else if (i43 != 2 && i43 != 3) {
                                iE2 = (iH - i37) / 2;
                            } else if (e0Var2.getLayoutDirection() == LayoutDirection.f15717b) {
                                iE3 = e0Var2.e1(ScaffoldKt.f12291a);
                                iE2 = (iH - iE3) - i37;
                            } else {
                                iE2 = e0Var2.e1(ScaffoldKt.f12291a);
                            }
                            f10 = new F(iE2, i42);
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.f12296f;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar4;
                        List<androidx.compose.ui.layout.D> listR3 = e0Var2.R0(scaffoldLayoutContent, new ComposableLambdaImpl(true, -2146438447, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
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
                                    pVar5.invoke(interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        final ArrayList arrayList7 = new ArrayList(listR3.size());
                        int size4 = listR3.size();
                        for (int i44 = 0; i44 < size4; i44++) {
                            arrayList7.add(listR3.get(i44).Q(jA));
                        }
                        if (!arrayList7.isEmpty()) {
                            obj4 = arrayList7.get(0);
                            int i45 = ((androidx.compose.ui.layout.Y) obj4).f14221c;
                            int iR6 = kotlin.collections.l.r(arrayList7);
                            arrayList = arrayList4;
                            if (1 <= iR6) {
                                int i46 = 1;
                                while (true) {
                                    Object obj17 = arrayList7.get(i46);
                                    int i47 = ((androidx.compose.ui.layout.Y) obj17).f14221c;
                                    if (i45 < i47) {
                                        i45 = i47;
                                        obj4 = obj17;
                                    }
                                    if (i46 == iR6) {
                                        break;
                                    }
                                    i46++;
                                }
                            }
                        } else {
                            arrayList = arrayList4;
                            obj4 = null;
                        }
                        androidx.compose.ui.layout.Y y13 = (androidx.compose.ui.layout.Y) obj4;
                        Integer numValueOf2 = y13 != null ? Integer.valueOf(y13.f14221c) : null;
                        if (f10 != null) {
                            int i48 = i10;
                            androidx.compose.foundation.layout.a0 a0Var5 = a0Var;
                            int i49 = f10.f12175b;
                            if (numValueOf2 == null || i48 == 3) {
                                iE1 = e0Var2.e1(ScaffoldKt.f12291a) + i49;
                                iB = a0Var5.b(e0Var2);
                            } else {
                                iE1 = numValueOf2.intValue() + i49;
                                iB = e0Var2.e1(ScaffoldKt.f12291a);
                            }
                            numValueOf = Integer.valueOf(iB + iE1);
                        } else {
                            numValueOf = null;
                        }
                        if (i23 != 0) {
                            iIntValue = i23 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : a0Var.b(e0Var2));
                        } else {
                            iIntValue = 0;
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.f12293c;
                        final androidx.compose.foundation.layout.a0 a0Var6 = a0Var;
                        final Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        final int i50 = i28;
                        final Integer num = numValueOf2;
                        List<androidx.compose.ui.layout.D> listR4 = e0Var2.R0(scaffoldLayoutContent2, new ComposableLambdaImpl(true, -1213360416, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                                Integer num3;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.foundation.layout.D d10 = new androidx.compose.foundation.layout.D(a0Var6, e0Var2);
                                    qVar2.invoke(new androidx.compose.foundation.layout.N(PaddingKt.d(d10, e0Var2.getLayoutDirection()), arrayList2.isEmpty() ? d10.d() : e0Var2.u(i17), PaddingKt.c(d10, e0Var2.getLayoutDirection()), (arrayList7.isEmpty() || (num3 = num) == null) ? d10.a() : e0Var2.u(num3.intValue())), interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        final ArrayList arrayList8 = new ArrayList(listR4.size());
                        int size5 = listR4.size();
                        for (int i51 = 0; i51 < size5; i51++) {
                            arrayList8.add(listR4.get(i51).Q(jA));
                        }
                        final androidx.compose.foundation.layout.a0 a0Var7 = a0Var;
                        final F f11 = f10;
                        final int i52 = iIntValue;
                        final Integer num2 = numValueOf2;
                        final ArrayList arrayList9 = arrayList;
                        final Integer num3 = numValueOf;
                        return e0Var2.y1(iH, i32, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar2) {
                                androidx.compose.ui.layout.Y.a aVar3 = aVar2;
                                List<androidx.compose.ui.layout.Y> list2 = arrayList8;
                                int size6 = list2.size();
                                for (int i53 = 0; i53 < size6; i53++) {
                                    aVar3.d(list2.get(i53), 0, 0, 0.0f);
                                }
                                List<androidx.compose.ui.layout.Y> list3 = arrayList2;
                                int size7 = list3.size();
                                for (int i54 = 0; i54 < size7; i54++) {
                                    aVar3.d(list3.get(i54), 0, 0, 0.0f);
                                }
                                List<androidx.compose.ui.layout.Y> list4 = arrayList6;
                                int i55 = iH;
                                int i56 = i50;
                                androidx.compose.foundation.layout.a0 a0Var8 = a0Var7;
                                androidx.compose.ui.layout.e0 e0Var3 = e0Var2;
                                int i57 = i32;
                                int i58 = i52;
                                int size8 = list4.size();
                                for (int i59 = 0; i59 < size8; i59++) {
                                    aVar3.d(list4.get(i59), a0Var8.a(e0Var3, e0Var3.getLayoutDirection()) + ((i55 - i56) / 2), i57 - i58, 0.0f);
                                }
                                List<androidx.compose.ui.layout.Y> list5 = arrayList7;
                                int i60 = i32;
                                Integer num4 = num2;
                                int size9 = list5.size();
                                for (int i61 = 0; i61 < size9; i61++) {
                                    aVar3.d(list5.get(i61), 0, i60 - (num4 != null ? num4.intValue() : 0), 0.0f);
                                }
                                F f12 = f11;
                                if (f12 != null) {
                                    List<androidx.compose.ui.layout.Y> list6 = arrayList9;
                                    int i62 = i32;
                                    Integer num5 = num3;
                                    int size10 = list6.size();
                                    for (int i63 = 0; i63 < size10; i63++) {
                                        androidx.compose.ui.layout.Y y14 = list6.get(i63);
                                        kotlin.jvm.internal.i.b(num5);
                                        aVar3.d(y14, f12.f12174a, i62 - num5.intValue(), 0.0f);
                                    }
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF);
            }
            SubcomposeLayoutKt.a(null, (Ia.p) objF, c1086gP, 0, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ScaffoldKt.b(i10, pVar, qVar, pVar2, pVar3, a0Var, pVar4, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
