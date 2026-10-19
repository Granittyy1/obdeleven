package androidx.navigation.compose;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.Y;
import androidx.collection.Z;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.U;
import androidx.compose.runtime.X;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.m5.home.ui.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2749t;
import p293xa.r;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q {
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void a(final p141l2.H h8, final String str, androidx.compose.ui.h hVar, androidx.compose.ui.d dVar, String str2, Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar, Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar2, Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar3, Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar4, Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.y> lVar5, final Ia.l<? super p141l2.F, p293xa.r> lVar6, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        InterfaceC1084f.a.C0153a c0153a;
        androidx.compose.ui.h hVar3;
        Object objF;
        Object objF2;
        int i18;
        androidx.compose.ui.h hVar4;
        androidx.compose.ui.d dVar2;
        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar7;
        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar8;
        String str3;
        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.y> lVar9;
        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar10;
        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar11;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objF3;
        final androidx.compose.ui.h hVar5;
        final androidx.compose.ui.d dVar3;
        final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar12;
        final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar13;
        final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar14;
        final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar15;
        final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.y> lVar16;
        final String str4;
        C1105p0 c1105p0V;
        int i19;
        C1086g c1086gP = interfaceC1084f.p(1840250294);
        if ((i10 & 6) == 0) {
            i13 = (c1086gP.k(h8) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= c1086gP.K(str) ? 32 : 16;
        }
        int i20 = i12 & 4;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i13 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            i14 = 1797120 | i13;
            if ((12582912 & i10) == 0) {
                i14 = 5991424 | i13;
            }
            if ((100663296 & i10) == 0) {
                i14 |= 33554432;
            }
            i15 = 805306368 | i14;
            if ((i11 & 6) == 0) {
                if (c1086gP.k(lVar6)) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i16 = i11 | i19;
            } else {
                i16 = i11;
            }
            if ((306783379 & i15) != 306783378 && (i16 & 3) == 2 && c1086gP.s()) {
                c1086gP.w();
                dVar3 = dVar;
                lVar12 = lVar;
                lVar13 = lVar2;
                lVar14 = lVar3;
                lVar15 = lVar4;
                lVar16 = lVar5;
                hVar5 = hVar2;
                str4 = str2;
            } else {
                c1086gP.r0();
                i17 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i17 != 0 || c1086gP.a0()) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = new y(0);
                        c1086gP.E(objF);
                    }
                    Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar17 = (Ia.l) objF;
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new D(0);
                        c1086gP.E(objF2);
                    }
                    i18 = i15 & (-264241153);
                    hVar4 = hVar3;
                    dVar2 = fVar;
                    lVar7 = lVar17;
                    lVar8 = lVar7;
                    str3 = null;
                    lVar9 = null;
                    lVar10 = (Ia.l) objF2;
                    lVar11 = lVar10;
                } else {
                    c1086gP.w();
                    i18 = i15 & (-264241153);
                    dVar2 = dVar;
                    str3 = str2;
                    lVar7 = lVar;
                    lVar10 = lVar2;
                    lVar8 = lVar3;
                    lVar11 = lVar4;
                    lVar9 = lVar5;
                    hVar4 = hVar2;
                }
                c1086gP.U();
                if ((i18 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z10 | z11 | ((i16 & 14) == 4);
                objF3 = c1086gP.f();
                if (z12 || objF3 == c0153a) {
                    p141l2.F f10 = new p141l2.F(h8.f44310b.f44802s, str, str3);
                    lVar6.invoke(f10);
                    objF3 = f10.c();
                    c1086gP.E(objF3);
                }
                p141l2.E e10 = (p141l2.E) objF3;
                int i21 = i18 & 8078;
                int i22 = i18 >> 3;
                String str5 = str3;
                b(h8, e10, hVar4, dVar2, lVar7, lVar10, lVar8, lVar11, lVar9, c1086gP, (57344 & i22) | i21 | (458752 & i22) | (i22 & 234881024));
                hVar5 = hVar4;
                dVar3 = dVar2;
                lVar12 = lVar7;
                lVar13 = lVar10;
                lVar14 = lVar8;
                lVar15 = lVar11;
                lVar16 = lVar9;
                str4 = str5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: androidx.navigation.compose.E
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = L4.b.l(i10 | 1);
                        int iL2 = L4.b.l(i11);
                        Ia.l lVar18 = lVar6;
                        int i23 = i12;
                        Q.a(h8, str, hVar5, dVar3, str4, lVar12, lVar13, lVar14, lVar15, lVar16, lVar18, (InterfaceC1084f) obj, iL, iL2, i23);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        hVar2 = hVar;
        i14 = 1797120 | i13;
        if ((12582912 & i10) == 0) {
            i14 = 5991424 | i13;
        }
        if ((100663296 & i10) == 0) {
            i14 |= 33554432;
        }
        i15 = 805306368 | i14;
        if ((i11 & 6) == 0) {
            if (c1086gP.k(lVar6)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i16 = i11 | i19;
        } else {
            i16 = i11;
        }
        if ((306783379 & i15) != 306783378) {
            c1086gP.r0();
            i17 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            if (i17 != 0) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13335a;
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = new y(0);
                    c1086gP.E(objF);
                }
                Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar18 = (Ia.l) objF;
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new D(0);
                    c1086gP.E(objF2);
                }
                i18 = i15 & (-264241153);
                hVar4 = hVar3;
                dVar2 = fVar2;
                lVar7 = lVar18;
                lVar8 = lVar7;
                str3 = null;
                lVar9 = null;
                lVar10 = (Ia.l) objF2;
                lVar11 = lVar10;
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.f fVar3 = androidx.compose.ui.d.a.f13335a;
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = new y(0);
                    c1086gP.E(objF);
                }
                Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar19 = (Ia.l) objF;
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new D(0);
                    c1086gP.E(objF2);
                }
                i18 = i15 & (-264241153);
                hVar4 = hVar3;
                dVar2 = fVar3;
                lVar7 = lVar19;
                lVar8 = lVar7;
                str3 = null;
                lVar9 = null;
                lVar10 = (Ia.l) objF2;
                lVar11 = lVar10;
            }
            c1086gP.U();
            if ((i18 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10 | z11 | ((i16 & 14) == 4);
            objF3 = c1086gP.f();
            if (z12) {
                p141l2.F f11 = new p141l2.F(h8.f44310b.f44802s, str, str3);
                lVar6.invoke(f11);
                objF3 = f11.c();
                c1086gP.E(objF3);
            } else {
                p141l2.F f12 = new p141l2.F(h8.f44310b.f44802s, str, str3);
                lVar6.invoke(f12);
                objF3 = f12.c();
                c1086gP.E(objF3);
            }
            p141l2.E e11 = (p141l2.E) objF3;
            int i23 = i18 & 8078;
            int i24 = i18 >> 3;
            String str6 = str3;
            b(h8, e11, hVar4, dVar2, lVar7, lVar10, lVar8, lVar11, lVar9, c1086gP, (57344 & i24) | i23 | (458752 & i24) | (i24 & 234881024));
            hVar5 = hVar4;
            dVar3 = dVar2;
            lVar12 = lVar7;
            lVar13 = lVar10;
            lVar14 = lVar8;
            lVar15 = lVar11;
            lVar16 = lVar9;
            str4 = str6;
        } else {
            c1086gP.r0();
            i17 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            if (i17 != 0) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.f fVar4 = androidx.compose.ui.d.a.f13335a;
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = new y(0);
                    c1086gP.E(objF);
                }
                Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar110 = (Ia.l) objF;
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new D(0);
                    c1086gP.E(objF2);
                }
                i18 = i15 & (-264241153);
                hVar4 = hVar3;
                dVar2 = fVar4;
                lVar7 = lVar110;
                lVar8 = lVar7;
                str3 = null;
                lVar9 = null;
                lVar10 = (Ia.l) objF2;
                lVar11 = lVar10;
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.f fVar5 = androidx.compose.ui.d.a.f13335a;
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = new y(0);
                    c1086gP.E(objF);
                }
                Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar111 = (Ia.l) objF;
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new D(0);
                    c1086gP.E(objF2);
                }
                i18 = i15 & (-264241153);
                hVar4 = hVar3;
                dVar2 = fVar5;
                lVar7 = lVar111;
                lVar8 = lVar7;
                str3 = null;
                lVar9 = null;
                lVar10 = (Ia.l) objF2;
                lVar11 = lVar10;
            }
            c1086gP.U();
            if ((i18 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10 | z11 | ((i16 & 14) == 4);
            objF3 = c1086gP.f();
            if (z12) {
                p141l2.F f13 = new p141l2.F(h8.f44310b.f44802s, str, str3);
                lVar6.invoke(f13);
                objF3 = f13.c();
                c1086gP.E(objF3);
            } else {
                p141l2.F f14 = new p141l2.F(h8.f44310b.f44802s, str, str3);
                lVar6.invoke(f14);
                objF3 = f14.c();
                c1086gP.E(objF3);
            }
            p141l2.E e12 = (p141l2.E) objF3;
            int i25 = i18 & 8078;
            int i26 = i18 >> 3;
            String str7 = str3;
            b(h8, e12, hVar4, dVar2, lVar7, lVar10, lVar8, lVar11, lVar9, c1086gP, (57344 & i26) | i25 | (458752 & i26) | (i26 & 234881024));
            hVar5 = hVar4;
            dVar3 = dVar2;
            lVar12 = lVar7;
            lVar13 = lVar10;
            lVar14 = lVar8;
            lVar15 = lVar11;
            lVar16 = lVar9;
            str4 = str7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: androidx.navigation.compose.E
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = L4.b.l(i10 | 1);
                    int iL2 = L4.b.l(i11);
                    Ia.l lVar112 = lVar6;
                    int i27 = i12;
                    Q.a(h8, str, hVar5, dVar3, str4, lVar12, lVar13, lVar14, lVar15, lVar16, lVar112, (InterfaceC1084f) obj, iL, iL2, i27);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:291:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:360:0x07e8 A[PHI: r11 r33
      0x07e8: PHI (r11v18 Ia.l) = (r11v32 Ia.l), (r11v33 Ia.l) binds: [B:359:0x07e6, B:355:0x07da] A[DONT_GENERATE, DONT_INLINE]
      0x07e8: PHI (r33v1 n2.j) = (r33v3 n2.j), (r33v4 n2.j) binds: [B:359:0x07e6, B:355:0x07da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:364:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:365:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:371:0x0805  */
    /* JADX WARN: Code duplicated, block: B:374:0x081f  */
    /* JADX WARN: Code duplicated, block: B:377:0x0828  */
    /* JADX WARN: Code duplicated, block: B:380:0x082e A[PHI: r7
      0x082e: PHI (r7v21 Ia.l) = (r7v10 Ia.l), (r7v22 Ia.l) binds: [B:379:0x082c, B:375:0x0825] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:381:0x0830  */
    /* JADX WARN: Code duplicated, block: B:384:0x083a  */
    /* JADX WARN: Code duplicated, block: B:385:0x083c  */
    /* JADX WARN: Code duplicated, block: B:388:0x0844 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:391:0x084a  */
    /* JADX WARN: Code duplicated, block: B:394:0x085e  */
    /* JADX WARN: Code duplicated, block: B:395:0x0861  */
    /* JADX WARN: Code duplicated, block: B:398:0x0869 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:401:0x086f  */
    /* JADX WARN: Code duplicated, block: B:404:0x0888 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:405:0x088a  */
    /* JADX WARN: Code duplicated, block: B:408:0x089d  */
    /* JADX WARN: Code duplicated, block: B:411:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:413:0x08dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:416:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:418:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:420:0x0917 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:423:0x091c  */
    /* JADX WARN: Code duplicated, block: B:427:0x094c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:428:0x094e  */
    /* JADX WARN: Code duplicated, block: B:431:0x0970  */
    /* JADX WARN: Code duplicated, block: B:432:0x097a  */
    /* JADX WARN: Code duplicated, block: B:435:0x09d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:438:0x09de  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final p141l2.H h8, final p141l2.E graph, final androidx.compose.ui.h hVar, final androidx.compose.ui.d dVar, final Ia.l lVar, final Ia.l lVar2, final Ia.l lVar3, final Ia.l lVar4, final Ia.l lVar5, InterfaceC1084f interfaceC1084f, final int i10) {
        InterfaceC1376t interfaceC1376t;
        int i11;
        C1086g c1086g;
        p163n2.j jVar;
        C1423p c1423p;
        int i12;
        final Ia.l lVar6;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objF;
        final Ia.l lVar7;
        final Ia.l lVar8;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objF2;
        final Ia.l lVar9;
        boolean z16;
        Object objF3;
        final Ia.l lVar10;
        boolean zK;
        Object objF4;
        Object objF5;
        SeekableTransitionState seekableTransitionState;
        Transition transitionE;
        boolean zK2;
        Object objF6;
        C1423p c1423p2;
        boolean zK3;
        Object objF7;
        Object objF8;
        boolean zK4;
        Object objF9;
        boolean zK5;
        Object objF10;
        Activity activity;
        Intent intent;
        int[] intArray;
        int[] iArr;
        String strB;
        p141l2.C cA;
        int i13;
        p141l2.E e10;
        Bundle bundle;
        int i14;
        p141l2.C cA2;
        p141l2.E e11;
        C1086g c1086gP = interfaceC1084f.p(-1964664536);
        int i15 = (i10 & 6) == 0 ? (c1086gP.k(h8) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i15 |= c1086gP.k(graph) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i15 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i15 |= c1086gP.K(dVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i15 |= c1086gP.k(lVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i15 |= c1086gP.k(lVar2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i15 |= c1086gP.k(lVar3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i15 |= c1086gP.k(lVar4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i15 |= c1086gP.k(lVar5) ? 67108864 : 33554432;
        }
        int i16 = i15;
        if ((38347923 & i16) == 38347922 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            c1086gP.r0();
            int i17 = i10 & 1;
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (i17 != 0 && !c1086gP.a0()) {
                c1086gP.w();
            }
            c1086gP.U();
            InterfaceC1376t interfaceC1376t2 = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
            c0 c0VarA = p027c1.b.a(c1086gP);
            if (c0VarA == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            b0 viewModelStore = c0VarA.getViewModelStore();
            h8.getClass();
            kotlin.jvm.internal.i.e(viewModelStore, "viewModelStore");
            p163n2.j jVar2 = h8.f44310b;
            jVar2.getClass();
            if (!kotlin.jvm.internal.i.a(jVar2.f44798o, l2.x.a.a(viewModelStore))) {
                if (!jVar2.f44790f.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
                jVar2.f44798o = l2.x.a.a(viewModelStore);
            }
            kotlin.jvm.internal.i.e(graph, "graph");
            jVar2.getClass();
            kotlin.collections.i<C2749t> iVar = jVar2.f44790f;
            if (!iVar.isEmpty() && jVar2.j() == Lifecycle.State.f17749b) {
                throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            }
            if (kotlin.jvm.internal.i.a(jVar2.f44787c, graph)) {
                interfaceC1376t = interfaceC1376t2;
                i11 = i16;
                p163n2.m mVar = graph.f44235g;
                int iF = mVar.f44820b.f();
                for (int i18 = 0; i18 < iF; i18++) {
                    p141l2.C cG = mVar.f44820b.g(i18);
                    p141l2.E e12 = jVar2.f44787c;
                    kotlin.jvm.internal.i.b(e12);
                    int iD = e12.f44235g.f44820b.d(i18);
                    p141l2.E e13 = jVar2.f44787c;
                    kotlin.jvm.internal.i.b(e13);
                    Y<p141l2.C> y10 = e13.f44235g.f44820b;
                    if (y10.f9140b) {
                        Z.a(y10);
                    }
                    int iA = p233t.a.a(y10.f9143e, iD, y10.f9141c);
                    if (iA >= 0) {
                        Object[] objArr = y10.f9142d;
                        Object obj = objArr[iA];
                        objArr[iA] = cG;
                    }
                }
                for (C2749t c2749t : iVar) {
                    int i19 = p141l2.C.f44217f;
                    List listF = SequencesKt___SequencesKt.F(l2.C.a.c(c2749t.f44299c));
                    kotlin.jvm.internal.i.e(listF, "<this>");
                    kotlin.collections.z zVar = new kotlin.collections.z(listF);
                    p141l2.C cA3 = jVar2.f44787c;
                    kotlin.jvm.internal.i.b(cA3);
                    Iterator it = zVar.iterator();
                    while (true) {
                        ListIterator<T> listIterator = ((kotlin.collections.z.a) it).f43028b;
                        if (listIterator.hasPrevious()) {
                            p141l2.C c10 = (p141l2.C) listIterator.previous();
                            if (!kotlin.jvm.internal.i.a(c10, jVar2.f44787c) || !kotlin.jvm.internal.i.a(cA3, graph)) {
                                if (cA3 instanceof p141l2.E) {
                                    cA3 = ((p141l2.E) cA3).f44235g.a(c10.f44219c.f44813d);
                                    kotlin.jvm.internal.i.b(cA3);
                                }
                            }
                        }
                    }
                    kotlin.jvm.internal.i.e(cA3, "<set-?>");
                    c2749t.f44299c = cA3;
                }
            } else {
                p141l2.E e14 = jVar2.f44787c;
                LinkedHashMap linkedHashMap = jVar2.f44803t;
                if (e14 != null) {
                    Iterator it2 = new ArrayList(jVar2.f44795l.keySet()).iterator();
                    while (it2.hasNext()) {
                        Integer num = (Integer) it2.next();
                        kotlin.jvm.internal.i.b(num);
                        int iIntValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((l2.w.a) it3.next()).f44277d = true;
                            it2 = it2;
                        }
                        Iterator it4 = it2;
                        boolean zT = jVar2.t(iIntValue, null, Fa.d.e(new D(8)), null);
                        for (Iterator it5 = linkedHashMap.values().iterator(); it5.hasNext(); it5 = it5) {
                            ((l2.w.a) it5.next()).f44277d = false;
                        }
                        if (zT) {
                            jVar2.o(iIntValue, true, false);
                        }
                        it2 = it4;
                    }
                    jVar2.o(e14.f44219c.f44813d, true, false);
                }
                jVar2.f44787c = graph;
                Bundle bundle2 = jVar2.f44788d;
                p141l2.Q q10 = jVar2.f44802s;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        A8.A.g("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    for (String str : stringArrayList) {
                        q10.b(str);
                        if (bundle2.containsKey(str)) {
                            p248u2.b.b(bundle2, str);
                        }
                    }
                }
                Bundle[] bundleArr = jVar2.f44789e;
                final p141l2.w wVar = jVar2.f44785a;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i20 = 0;
                    while (i20 < length) {
                        int i21 = length;
                        Bundle state = bundleArr[i20];
                        Bundle[] bundleArr2 = bundleArr;
                        kotlin.jvm.internal.i.e(state, "state");
                        state.setClassLoader(p141l2.u.class.getClassLoader());
                        String string = state.getString("nav-entry-state:id");
                        if (string == null) {
                            A8.A.g("nav-entry-state:id");
                            throw null;
                        }
                        int iA2 = p248u2.b.a(state, "nav-entry-state:destination-id");
                        Bundle bundleB = p248u2.b.b(state, "nav-entry-state:args");
                        int i22 = i16;
                        Bundle bundleB2 = p248u2.b.b(state, "nav-entry-state:saved-state");
                        p141l2.C cD = jVar2.d(iA2, null);
                        if (cD == null) {
                            int i23 = p141l2.C.f44217f;
                            StringBuilder sbA = C7.g.a("Restoring the Navigation back stack failed: destination ", l2.C.a.b(wVar.f44311c, iA2), " cannot be found from the current destination ");
                            sbA.append(jVar2.h());
                            throw new IllegalStateException(sbA.toString());
                        }
                        p163n2.e context = wVar.f44311c;
                        Lifecycle.State hostLifecycleState = jVar2.j();
                        InterfaceC1376t interfaceC1376t3 = interfaceC1376t2;
                        p141l2.x xVar = jVar2.f44798o;
                        kotlin.jvm.internal.i.e(context, "context");
                        kotlin.jvm.internal.i.e(hostLifecycleState, "hostLifecycleState");
                        Context context2 = context.f44769a;
                        bundleB.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                        C2749t c2749t2 = new C2749t(context, cD, bundleB, hostLifecycleState, xVar, string, bundleB2);
                        p141l2.P pB = q10.b(cD.f44218b);
                        Object aVar = linkedHashMap.get(pB);
                        if (aVar == null) {
                            aVar = new l2.w.a(wVar, pB);
                            linkedHashMap.put(pB, aVar);
                        }
                        iVar.addLast(c2749t2);
                        ((l2.w.a) aVar).g(c2749t2);
                        p141l2.E e15 = c2749t2.f44299c.f44220d;
                        if (e15 != null) {
                            jVar2.l(c2749t2, jVar2.f(e15.f44219c.f44813d));
                        }
                        i20++;
                        length = i21;
                        bundleArr = bundleArr2;
                        i16 = i22;
                        interfaceC1376t2 = interfaceC1376t3;
                    }
                    interfaceC1376t = interfaceC1376t2;
                    i11 = i16;
                    jVar2.f44786b.invoke();
                    jVar2.f44789e = null;
                } else {
                    interfaceC1376t = interfaceC1376t2;
                    i11 = i16;
                }
                Collection collectionValues = kotlin.collections.y.x(q10.f44273a).values();
                ArrayList<p141l2.P> arrayList = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (!((p141l2.P) obj2).f44271b) {
                        arrayList.add(obj2);
                    }
                }
                for (p141l2.P navigator : arrayList) {
                    Object aVar2 = linkedHashMap.get(navigator);
                    if (aVar2 == null) {
                        wVar.getClass();
                        kotlin.jvm.internal.i.e(navigator, "navigator");
                        aVar2 = new l2.w.a(wVar, navigator);
                        linkedHashMap.put(navigator, aVar2);
                    }
                    navigator.getClass();
                    navigator.f44270a = (l2.w.a) aVar2;
                    navigator.f44271b = true;
                }
                if (jVar2.f44787c == null || !iVar.isEmpty()) {
                    jVar2.b();
                } else if (wVar.f44313e || (activity = wVar.f44312d) == null || (intent = activity.getIntent()) == null) {
                    p141l2.E e16 = jVar2.f44787c;
                    kotlin.jvm.internal.i.b(e16);
                    jVar2.n(e16, null, null, null);
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        try {
                            intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                        } catch (Exception e17) {
                            Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e17);
                            intArray = null;
                        }
                    } else {
                        intArray = null;
                    }
                    ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                    kotlin.collections.y.p();
                    Bundle bundleB3 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                    if (bundle3 != null) {
                        bundleB3.putAll(bundle3);
                    }
                    p163n2.j jVar3 = wVar.f44310b;
                    if (intArray == null || intArray.length == 0) {
                        p141l2.E eK = jVar3.k();
                        l2.C.b bVarA = eK.A(new p141l2.B(intent.getAction(), intent.getType(), intent.getData()), eK);
                        if (bVarA != null) {
                            p141l2.C c11 = bVarA.f44222b;
                            int[] iArrK = c11.k(null);
                            Bundle bundleE = c11.e(bVarA.f44223c);
                            if (bundleE != null) {
                                bundleB3.putAll(bundleE);
                            }
                            iArr = iArrK;
                            parcelableArrayList = null;
                        }
                        if (iArr != null || iArr.length == 0) {
                            p141l2.E e18 = jVar2.f44787c;
                            kotlin.jvm.internal.i.b(e18);
                            jVar2.n(e18, null, null, null);
                        } else {
                            jVar3.getClass();
                            p141l2.E e19 = jVar3.f44787c;
                            int length2 = iArr.length;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= length2) {
                                    strB = null;
                                    break;
                                }
                                int i25 = iArr[i24];
                                if (i24 == 0) {
                                    i14 = length2;
                                    p141l2.E e20 = jVar3.f44787c;
                                    kotlin.jvm.internal.i.b(e20);
                                    cA2 = e20.f44219c.f44813d == i25 ? jVar3.f44787c : null;
                                } else {
                                    i14 = length2;
                                    kotlin.jvm.internal.i.b(e19);
                                    cA2 = e19.f44235g.a(i25);
                                }
                                if (cA2 == null) {
                                    int i26 = p141l2.C.f44217f;
                                    strB = l2.C.a.b(jVar3.f44785a.f44311c, i25);
                                    break;
                                }
                                if (i24 != iArr.length - 1 && (cA2 instanceof p141l2.E)) {
                                    while (true) {
                                        e11 = (p141l2.E) cA2;
                                        kotlin.jvm.internal.i.b(e11);
                                        p163n2.m mVar2 = e11.f44235g;
                                        if (!(mVar2.a(mVar2.f44821c) instanceof p141l2.E)) {
                                            break;
                                        } else {
                                            cA2 = mVar2.a(mVar2.f44821c);
                                        }
                                    }
                                    e19 = e11;
                                }
                                i24++;
                                length2 = i14;
                            }
                            if (strB != null) {
                                String message = "Could not find destination " + strB + " in the navigation graph, ignoring the deep link from " + intent;
                                kotlin.jvm.internal.i.e(message, "message");
                                p141l2.E e110 = jVar2.f44787c;
                                kotlin.jvm.internal.i.b(e110);
                                jVar2.n(e110, null, null, null);
                            } else {
                                p248u2.f.b(intent, bundleB3);
                                int length3 = iArr.length;
                                Bundle[] bundleArr3 = new Bundle[length3];
                                int i27 = 0;
                                while (i27 < length3) {
                                    kotlin.collections.y.p();
                                    int i28 = length3;
                                    Bundle bundleB4 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                    bundleB4.putAll(bundleB3);
                                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i27)) != null) {
                                        bundleB4.putAll(bundle);
                                    }
                                    bundleArr3[i27] = bundleB4;
                                    i27++;
                                    length3 = i28;
                                }
                                int flags = intent.getFlags();
                                int i29 = 268435456 & flags;
                                if (i29 == 0 || (flags & 32768) != 0) {
                                    boolean z17 = i29 != 0;
                                    p163n2.e eVar = wVar.f44311c;
                                    if (z17) {
                                        if (!jVar3.f44790f.isEmpty()) {
                                            p141l2.E e21 = jVar3.f44787c;
                                            kotlin.jvm.internal.i.b(e21);
                                            jVar3.o(e21.f44219c.f44813d, true, false);
                                        }
                                        int i30 = 0;
                                        while (i30 < iArr.length) {
                                            int i31 = iArr[i30];
                                            int i32 = i30 + 1;
                                            Bundle bundle4 = bundleArr3[i30];
                                            final p141l2.C cD2 = jVar3.d(i31, null);
                                            if (cD2 == null) {
                                                int i33 = p141l2.C.f44217f;
                                                StringBuilder sbA2 = C7.g.a("Deep Linking failed: destination ", l2.C.a.b(eVar, i31), " cannot be found from the current destination ");
                                                sbA2.append(jVar3.h());
                                                throw new IllegalStateException(sbA2.toString());
                                            }
                                            jVar3.n(cD2, bundle4, Fa.d.e(new Ia.l() { // from class: l2.v
                                                @Override // Ia.l
                                                public final Object invoke(Object obj3) {
                                                    C c12;
                                                    C cH;
                                                    K navOptions = (K) obj3;
                                                    i.e(navOptions, "$this$navOptions");
                                                    r rVar = r.f47939a;
                                                    J.a aVar3 = navOptions.f44257a;
                                                    aVar3.f44255g = 0;
                                                    aVar3.f44256h = 0;
                                                    C c13 = cD2;
                                                    if (c13 instanceof E) {
                                                        int i34 = C.f44217f;
                                                        Iterator it6 = C.a.c(c13).iterator();
                                                        do {
                                                            boolean zHasNext = it6.hasNext();
                                                            w wVar2 = wVar;
                                                            if (!zHasNext) {
                                                                int i35 = E.f44234h;
                                                                navOptions.f44260d = ((C) SequencesKt___SequencesKt.E(SequencesKt__SequencesKt.z(wVar2.f44310b.i(), new b(2)))).f44219c.f44813d;
                                                                navOptions.f44262f = false;
                                                                T t8 = new T();
                                                                t8.f44281b = true;
                                                                r rVar2 = r.f47939a;
                                                                navOptions.f44262f = t8.f44280a;
                                                                navOptions.f44263g = true;
                                                                break;
                                                            }
                                                            c12 = (C) it6.next();
                                                            cH = wVar2.f44310b.h();
                                                        } while (!i.a(c12, cH != null ? cH.f44220d : null));
                                                    }
                                                    return r.f47939a;
                                                }
                                            }), null);
                                            i30 = i32;
                                        }
                                        wVar.f44313e = true;
                                    } else {
                                        p141l2.E e22 = jVar3.f44787c;
                                        int length4 = iArr.length;
                                        int i34 = 0;
                                        while (i34 < length4) {
                                            int i35 = iArr[i34];
                                            Bundle bundle5 = bundleArr3[i34];
                                            if (i34 == 0) {
                                                cA = jVar3.f44787c;
                                            } else {
                                                kotlin.jvm.internal.i.b(e22);
                                                cA = e22.f44235g.a(i35);
                                            }
                                            if (cA == null) {
                                                int i36 = p141l2.C.f44217f;
                                                throw new IllegalStateException("Deep Linking failed: destination " + l2.C.a.b(eVar, i35) + " cannot be found in graph " + e22);
                                            }
                                            if (i34 != iArr.length - 1) {
                                                if (cA instanceof p141l2.E) {
                                                    while (true) {
                                                        e10 = (p141l2.E) cA;
                                                        kotlin.jvm.internal.i.b(e10);
                                                        p163n2.m mVar3 = e10.f44235g;
                                                        if (!(mVar3.a(mVar3.f44821c) instanceof p141l2.E)) {
                                                            break;
                                                        } else {
                                                            cA = mVar3.a(mVar3.f44821c);
                                                        }
                                                    }
                                                    iArr = iArr;
                                                    e22 = e10;
                                                    i13 = 1;
                                                }
                                                i34 += i13;
                                                iArr = iArr;
                                            } else {
                                                p141l2.E e23 = jVar3.f44787c;
                                                kotlin.jvm.internal.i.b(e23);
                                                jVar3.n(cA, bundle5, new p141l2.J(false, false, e23.f44219c.f44813d, true, false, 0, 0), null);
                                            }
                                            i13 = 1;
                                            i34 += i13;
                                            iArr = iArr;
                                        }
                                        wVar.f44313e = true;
                                    }
                                } else {
                                    intent.addFlags(32768);
                                    androidx.core.app.J j = new androidx.core.app.J(wVar.f44309a);
                                    ComponentName component = intent.getComponent();
                                    if (component == null) {
                                        component = intent.resolveActivity(j.f16694c.getPackageManager());
                                    }
                                    if (component != null) {
                                        j.d(component);
                                    }
                                    j.f16693b.add(intent);
                                    j.e();
                                    activity.finish();
                                    activity.overridePendingTransition(0, 0);
                                }
                            }
                        }
                    }
                    iArr = intArray;
                    if (iArr != null) {
                        p141l2.E e111 = jVar2.f44787c;
                        kotlin.jvm.internal.i.b(e111);
                        jVar2.n(e111, null, null, null);
                    } else {
                        p141l2.E e112 = jVar2.f44787c;
                        kotlin.jvm.internal.i.b(e112);
                        jVar2.n(e112, null, null, null);
                    }
                }
            }
            p141l2.P pB2 = jVar2.f44802s.b("composable");
            final C1412e c1412e = pB2 instanceof C1412e ? (C1412e) pB2 : null;
            if (c1412e == null) {
                C1105p0 c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: androidx.navigation.compose.I
                        @Override // Ia.p
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iL = L4.b.l(i10 | 1);
                            Ia.l lVar11 = lVar4;
                            Ia.l lVar12 = lVar5;
                            Q.b(h8, graph, hVar, dVar, lVar, lVar2, lVar3, lVar11, lVar12, (InterfaceC1084f) obj3, iL);
                            return p293xa.r.f47939a;
                        }
                    };
                    return;
                }
                return;
            }
            X xA = J0.a(c1412e.b().f44278e, c1086gP, 0);
            Object objF11 = c1086gP.f();
            if (objF11 == c0153a) {
                objF11 = new C1079c0(0.0f);
                c1086gP.E(objF11);
            }
            U u10 = (U) objF11;
            Object objF12 = c1086gP.f();
            if (objF12 == c0153a) {
                objF12 = J0.f(Boolean.FALSE);
                c1086gP.E(objF12);
            }
            final X x10 = (X) objF12;
            boolean z18 = ((List) xA.getValue()).size() > 1;
            boolean zK6 = c1086gP.K(xA) | c1086gP.k(c1412e);
            Object objF13 = c1086gP.f();
            if (zK6 || objF13 == c0153a) {
                NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(c1412e, xA, u10, x10, null);
                c1086gP.E(navHostKt$NavHost$25$1);
                objF13 = navHostKt$NavHost$25$1;
            }
            C.e.a(z18, (Ia.p) objF13, c1086gP, 0);
            InterfaceC1376t interfaceC1376t4 = interfaceC1376t;
            boolean zK7 = c1086gP.k(h8) | c1086gP.k(interfaceC1376t4);
            Object objF14 = c1086gP.f();
            if (zK7 || objF14 == c0153a) {
                objF14 = new J(h8, 0, interfaceC1376t4);
                c1086gP.E(objF14);
            }
            androidx.compose.runtime.E.a(interfaceC1376t4, (Ia.l) objF14, c1086gP);
            SaveableStateHolderImpl saveableStateHolderImplA = androidx.compose.runtime.saveable.e.a(c1086gP);
            X xA2 = J0.a(jVar2.f44793i, c1086gP, 0);
            Object objF15 = c1086gP.f();
            if (objF15 == c0153a) {
                objF15 = J0.d(new K(0, xA2));
                c1086gP.E(objF15);
            }
            final N0 n10 = (N0) objF15;
            C2749t c2749t3 = (C2749t) kotlin.collections.q.W((List) n10.getValue());
            Object objF16 = c1086gP.f();
            if (objF16 == c0153a) {
                int i37 = androidx.collection.N.f9102a;
                objF16 = new androidx.collection.G((Object) null);
                c1086gP.E(objF16);
            }
            final androidx.collection.G g10 = (androidx.collection.G) objF16;
            if (c2749t3 != null) {
                c1086gP.L(-1797897130);
                boolean zK8 = c1086gP.k(c1412e);
                if (((i11 & 3670016) ^ 1572864) > 1048576) {
                    lVar6 = lVar3;
                    jVar = jVar2;
                    if (c1086gP.K(lVar6)) {
                        z10 = true;
                    }
                    boolean z19 = z10 | zK8;
                    if ((i11 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z19 | z11;
                    objF = c1086gP.f();
                    if (z12 || objF == c0153a) {
                        objF = new Ia.l() { // from class: androidx.navigation.compose.L
                            /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                androidx.compose.animation.m mVarInvoke;
                                androidx.compose.animation.m mVarInvoke2;
                                InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                                p141l2.C c12 = interfaceC0927e.h().f44299c;
                                kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                C1412e.a aVar3 = (C1412e.a) c12;
                                androidx.compose.animation.m mVar4 = null;
                                if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                    int i38 = p141l2.C.f44217f;
                                    for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                        if (c13 instanceof C1412e.a) {
                                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar11 = ((C1412e.a) c13).j;
                                            mVarInvoke = lVar11 != null ? lVar11.invoke(interfaceC0927e) : null;
                                            if (mVarInvoke != null) {
                                                mVar4 = mVarInvoke;
                                                break;
                                            }
                                        } else if (c13 instanceof C1411d.a) {
                                            ((C1411d.a) c13).getClass();
                                        }
                                        if (mVarInvoke != null) {
                                            mVar4 = mVarInvoke;
                                            break;
                                        }
                                    }
                                    return mVar4 == null ? (androidx.compose.animation.m) lVar6.invoke(interfaceC0927e) : mVar4;
                                }
                                int i39 = p141l2.C.f44217f;
                                for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                    if (c14 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar12 = ((C1412e.a) c14).f19156h;
                                        mVarInvoke2 = lVar12 != null ? lVar12.invoke(interfaceC0927e) : null;
                                        if (mVarInvoke2 != null) {
                                            mVar4 = mVarInvoke2;
                                            break;
                                        }
                                    } else if (c14 instanceof C1411d.a) {
                                        ((C1411d.a) c14).getClass();
                                    }
                                    if (mVarInvoke2 != null) {
                                        mVar4 = mVarInvoke2;
                                        break;
                                    }
                                }
                                return mVar4 == null ? (androidx.compose.animation.m) lVar.invoke(interfaceC0927e) : mVar4;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    lVar7 = (Ia.l) objF;
                    boolean zK9 = c1086gP.k(c1412e);
                    if (((i11 & 29360128) ^ 12582912) > 8388608) {
                        lVar8 = lVar4;
                        if (!c1086gP.K(lVar8)) {
                            z13 = true;
                        }
                        boolean z20 = z13 | zK9;
                        if ((i11 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z20 | z14;
                        objF2 = c1086gP.f();
                        if (z15 || objF2 == c0153a) {
                            objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                                /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.l
                                public final Object invoke(Object obj3) {
                                    androidx.compose.animation.o oVarInvoke;
                                    androidx.compose.animation.o oVarInvoke2;
                                    InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                                    p141l2.C c12 = interfaceC0927e.c().f44299c;
                                    kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    C1412e.a aVar3 = (C1412e.a) c12;
                                    androidx.compose.animation.o oVar = null;
                                    if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                        int i38 = p141l2.C.f44217f;
                                        for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                            if (c13 instanceof C1412e.a) {
                                                Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar11 = ((C1412e.a) c13).f19158k;
                                                oVarInvoke = lVar11 != null ? lVar11.invoke(interfaceC0927e) : null;
                                                if (oVarInvoke != null) {
                                                    oVar = oVarInvoke;
                                                    break;
                                                }
                                            } else if (c13 instanceof C1411d.a) {
                                                ((C1411d.a) c13).getClass();
                                            }
                                            if (oVarInvoke != null) {
                                                oVar = oVarInvoke;
                                                break;
                                            }
                                        }
                                        return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                                    }
                                    int i39 = p141l2.C.f44217f;
                                    for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                        if (c14 instanceof C1412e.a) {
                                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar12 = ((C1412e.a) c14).f19157i;
                                            oVarInvoke2 = lVar12 != null ? lVar12.invoke(interfaceC0927e) : null;
                                            if (oVarInvoke2 != null) {
                                                oVar = oVarInvoke2;
                                                break;
                                            }
                                        } else if (c14 instanceof C1411d.a) {
                                            ((C1411d.a) c14).getClass();
                                        }
                                        if (oVarInvoke2 != null) {
                                            oVar = oVarInvoke2;
                                            break;
                                        }
                                    }
                                    return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        lVar9 = (Ia.l) objF2;
                        if ((i11 & 234881024) == 67108864) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z16 || objF3 == c0153a) {
                            objF3 = new A(0, lVar5);
                            c1086gP.E(objF3);
                        }
                        lVar10 = (Ia.l) objF3;
                        Boolean bool = Boolean.TRUE;
                        zK = c1086gP.k(c1412e);
                        objF4 = c1086gP.f();
                        if (zK || objF4 == c0153a) {
                            objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                                @Override // Ia.l
                                public final Object invoke(Object obj3) {
                                    return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.a(bool, (Ia.l) objF4, c1086gP);
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new SeekableTransitionState(c2749t3);
                            c1086gP.E(objF5);
                        }
                        seekableTransitionState = (SeekableTransitionState) objF5;
                        C0909i c0909i = SeekableTransitionState.f9403r;
                        transitionE = TransitionKt.e(seekableTransitionState, "entry", c1086gP, 56);
                        if (((Boolean) x10.getValue()).booleanValue()) {
                            c1086gP.L(-1795663766);
                            Float fValueOf = Float.valueOf(u10.j());
                            zK5 = c1086gP.K(xA) | c1086gP.k(seekableTransitionState);
                            objF10 = c1086gP.f();
                            if (zK5 || objF10 == c0153a) {
                                objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                                c1086gP.E(objF10);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF10, c1086gP, fValueOf);
                            c1086gP.T(false);
                            c1423p2 = null;
                        } else {
                            x10 = x10;
                            c1086gP.L(-1795408729);
                            zK2 = c1086gP.k(seekableTransitionState) | c1086gP.k(c2749t3) | c1086gP.K(transitionE);
                            objF6 = c1086gP.f();
                            if (!zK2 || objF6 == c0153a) {
                                c1423p2 = null;
                                objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                                c1086gP.E(objF6);
                            } else {
                                c1423p2 = null;
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF6, c1086gP, c2749t3);
                            c1086gP.T(false);
                        }
                        zK3 = c1086gP.k(g10) | c1086gP.k(c1412e) | c1086gP.K(lVar7) | c1086gP.K(lVar9) | c1086gP.K(lVar10);
                        objF7 = c1086gP.f();
                        if (zK3 || objF7 == c0153a) {
                            final C1412e c1412e2 = c1412e;
                            final X x11 = x10;
                            objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.l
                                public final Object invoke(Object obj3) {
                                    float f10;
                                    InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                                    if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                        return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                                    }
                                    String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                                    androidx.collection.G g11 = g10;
                                    int iA3 = g11.a(str2);
                                    if (iA3 >= 0) {
                                        f10 = g11.f9091c[iA3];
                                    } else {
                                        g11.e(0.0f, str2);
                                        f10 = 0.0f;
                                    }
                                    if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                        f10 = (((Boolean) c1412e2.f19154c.getValue()).booleanValue() || ((Boolean) x11.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                                    }
                                    g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                                    return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                                }
                            };
                            c1086gP.E(objF7);
                        }
                        Ia.l lVar11 = (Ia.l) objF7;
                        objF8 = c1086gP.f();
                        if (objF8 == c0153a) {
                            i12 = 0;
                            objF8 = new F(0);
                            c1086gP.E(objF8);
                        } else {
                            i12 = 0;
                        }
                        AnimatedContentKt.a(transitionE, hVar, lVar11, dVar, (Ia.l) objF8, androidx.compose.runtime.internal.a.b(820763100, new O(seekableTransitionState, c2749t3, saveableStateHolderImplA, x10, n10), c1086gP), c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 221184 | (i11 & 7168), 0);
                        Object objA = transitionE.f9429a.a();
                        T value = transitionE.f9432d.getValue();
                        zK4 = c1086gP.K(transitionE) | c1086gP.k(h8) | c1086gP.k(c1412e) | c1086gP.k(g10);
                        objF9 = c1086gP.f();
                        if (!zK4 || objF9 == c0153a) {
                            c1423p = c1423p2;
                            c1086g = c1086gP;
                            NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                            c1086g.E(navHostKt$NavHost$33$1);
                            objF9 = navHostKt$NavHost$33$1;
                        } else {
                            c1423p = c1423p2;
                            c1086g = c1086gP;
                        }
                        androidx.compose.runtime.E.e(objA, value, (Ia.p) objF9, c1086g);
                        c1086g.T(i12);
                    } else {
                        lVar8 = lVar4;
                    }
                    if ((i11 & 12582912) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z21 = z13 | zK9;
                    if ((i11 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z21 | z14;
                    objF2 = c1086gP.f();
                    if (z15) {
                        objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                            /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                androidx.compose.animation.o oVarInvoke;
                                androidx.compose.animation.o oVarInvoke2;
                                InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                                p141l2.C c12 = interfaceC0927e.c().f44299c;
                                kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                C1412e.a aVar3 = (C1412e.a) c12;
                                androidx.compose.animation.o oVar = null;
                                if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                    int i38 = p141l2.C.f44217f;
                                    for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                        if (c13 instanceof C1412e.a) {
                                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar12 = ((C1412e.a) c13).f19158k;
                                            oVarInvoke = lVar12 != null ? lVar12.invoke(interfaceC0927e) : null;
                                            if (oVarInvoke != null) {
                                                oVar = oVarInvoke;
                                                break;
                                            }
                                        } else if (c13 instanceof C1411d.a) {
                                            ((C1411d.a) c13).getClass();
                                        }
                                        if (oVarInvoke != null) {
                                            oVar = oVarInvoke;
                                            break;
                                        }
                                    }
                                    return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                                }
                                int i39 = p141l2.C.f44217f;
                                for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                    if (c14 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar13 = ((C1412e.a) c14).f19157i;
                                        oVarInvoke2 = lVar13 != null ? lVar13.invoke(interfaceC0927e) : null;
                                        if (oVarInvoke2 != null) {
                                            oVar = oVarInvoke2;
                                            break;
                                        }
                                    } else if (c14 instanceof C1411d.a) {
                                        ((C1411d.a) c14).getClass();
                                    }
                                    if (oVarInvoke2 != null) {
                                        oVar = oVarInvoke2;
                                        break;
                                    }
                                }
                                return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                            /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                androidx.compose.animation.o oVarInvoke;
                                androidx.compose.animation.o oVarInvoke2;
                                InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                                p141l2.C c12 = interfaceC0927e.c().f44299c;
                                kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                C1412e.a aVar3 = (C1412e.a) c12;
                                androidx.compose.animation.o oVar = null;
                                if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                    int i38 = p141l2.C.f44217f;
                                    for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                        if (c13 instanceof C1412e.a) {
                                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar12 = ((C1412e.a) c13).f19158k;
                                            oVarInvoke = lVar12 != null ? lVar12.invoke(interfaceC0927e) : null;
                                            if (oVarInvoke != null) {
                                                oVar = oVarInvoke;
                                                break;
                                            }
                                        } else if (c13 instanceof C1411d.a) {
                                            ((C1411d.a) c13).getClass();
                                        }
                                        if (oVarInvoke != null) {
                                            oVar = oVarInvoke;
                                            break;
                                        }
                                    }
                                    return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                                }
                                int i39 = p141l2.C.f44217f;
                                for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                    if (c14 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar13 = ((C1412e.a) c14).f19157i;
                                        oVarInvoke2 = lVar13 != null ? lVar13.invoke(interfaceC0927e) : null;
                                        if (oVarInvoke2 != null) {
                                            oVar = oVarInvoke2;
                                            break;
                                        }
                                    } else if (c14 instanceof C1411d.a) {
                                        ((C1411d.a) c14).getClass();
                                    }
                                    if (oVarInvoke2 != null) {
                                        oVar = oVarInvoke2;
                                        break;
                                    }
                                }
                                return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    lVar9 = (Ia.l) objF2;
                    if ((i11 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z16) {
                        objF3 = new A(0, lVar5);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new A(0, lVar5);
                        c1086gP.E(objF3);
                    }
                    lVar10 = (Ia.l) objF3;
                    Boolean bool2 = Boolean.TRUE;
                    zK = c1086gP.k(c1412e);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.a(bool2, (Ia.l) objF4, c1086gP);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new SeekableTransitionState(c2749t3);
                        c1086gP.E(objF5);
                    }
                    seekableTransitionState = (SeekableTransitionState) objF5;
                    C0909i c0909i2 = SeekableTransitionState.f9403r;
                    transitionE = TransitionKt.e(seekableTransitionState, "entry", c1086gP, 56);
                    if (((Boolean) x10.getValue()).booleanValue()) {
                        c1086gP.L(-1795663766);
                        Float fValueOf2 = Float.valueOf(u10.j());
                        zK5 = c1086gP.K(xA) | c1086gP.k(seekableTransitionState);
                        objF10 = c1086gP.f();
                        if (zK5) {
                            objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                            c1086gP.E(objF10);
                        } else {
                            objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                            c1086gP.E(objF10);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF10, c1086gP, fValueOf2);
                        c1086gP.T(false);
                        c1423p2 = null;
                    } else {
                        x10 = x10;
                        c1086gP.L(-1795408729);
                        zK2 = c1086gP.k(seekableTransitionState) | c1086gP.k(c2749t3) | c1086gP.K(transitionE);
                        objF6 = c1086gP.f();
                        if (zK2) {
                            c1423p2 = null;
                            objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                            c1086gP.E(objF6);
                        } else {
                            c1423p2 = null;
                            objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                            c1086gP.E(objF6);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF6, c1086gP, c2749t3);
                        c1086gP.T(false);
                    }
                    zK3 = c1086gP.k(g10) | c1086gP.k(c1412e) | c1086gP.K(lVar7) | c1086gP.K(lVar9) | c1086gP.K(lVar10);
                    objF7 = c1086gP.f();
                    if (zK3) {
                        final C1412e c1412e3 = c1412e;
                        final X x12 = x10;
                        objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                float f10;
                                InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                                if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                    return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                                }
                                String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                                androidx.collection.G g11 = g10;
                                int iA3 = g11.a(str2);
                                if (iA3 >= 0) {
                                    f10 = g11.f9091c[iA3];
                                } else {
                                    g11.e(0.0f, str2);
                                    f10 = 0.0f;
                                }
                                if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                    f10 = (((Boolean) c1412e3.f19154c.getValue()).booleanValue() || ((Boolean) x12.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                                }
                                g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                                return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                            }
                        };
                        c1086gP.E(objF7);
                    } else {
                        final C1412e c1412e4 = c1412e;
                        final X x13 = x10;
                        objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                float f10;
                                InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                                if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                    return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                                }
                                String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                                androidx.collection.G g11 = g10;
                                int iA3 = g11.a(str2);
                                if (iA3 >= 0) {
                                    f10 = g11.f9091c[iA3];
                                } else {
                                    g11.e(0.0f, str2);
                                    f10 = 0.0f;
                                }
                                if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                    f10 = (((Boolean) c1412e4.f19154c.getValue()).booleanValue() || ((Boolean) x13.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                                }
                                g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                                return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                            }
                        };
                        c1086gP.E(objF7);
                    }
                    Ia.l lVar12 = (Ia.l) objF7;
                    objF8 = c1086gP.f();
                    if (objF8 == c0153a) {
                        i12 = 0;
                        objF8 = new F(0);
                        c1086gP.E(objF8);
                    } else {
                        i12 = 0;
                    }
                    AnimatedContentKt.a(transitionE, hVar, lVar12, dVar, (Ia.l) objF8, androidx.compose.runtime.internal.a.b(820763100, new O(seekableTransitionState, c2749t3, saveableStateHolderImplA, x10, n10), c1086gP), c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 221184 | (i11 & 7168), 0);
                    Object objA2 = transitionE.f9429a.a();
                    T value2 = transitionE.f9432d.getValue();
                    zK4 = c1086gP.K(transitionE) | c1086gP.k(h8) | c1086gP.k(c1412e) | c1086gP.k(g10);
                    objF9 = c1086gP.f();
                    if (zK4) {
                        c1423p = c1423p2;
                        c1086g = c1086gP;
                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$2 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                        c1086g.E(navHostKt$NavHost$33$2);
                        objF9 = navHostKt$NavHost$33$2;
                    } else {
                        c1423p = c1423p2;
                        c1086g = c1086gP;
                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$3 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                        c1086g.E(navHostKt$NavHost$33$3);
                        objF9 = navHostKt$NavHost$33$3;
                    }
                    androidx.compose.runtime.E.e(objA2, value2, (Ia.p) objF9, c1086g);
                    c1086g.T(i12);
                } else {
                    lVar6 = lVar3;
                    jVar = jVar2;
                }
                if ((i11 & 1572864) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = z10 | zK8;
                if ((i11 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z110 | z11;
                objF = c1086gP.f();
                if (z12) {
                    objF = new Ia.l() { // from class: androidx.navigation.compose.L
                        /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            androidx.compose.animation.m mVarInvoke;
                            androidx.compose.animation.m mVarInvoke2;
                            InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                            p141l2.C c12 = interfaceC0927e.h().f44299c;
                            kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                            C1412e.a aVar3 = (C1412e.a) c12;
                            androidx.compose.animation.m mVar4 = null;
                            if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                int i38 = p141l2.C.f44217f;
                                for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                    if (c13 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar13 = ((C1412e.a) c13).j;
                                        mVarInvoke = lVar13 != null ? lVar13.invoke(interfaceC0927e) : null;
                                        if (mVarInvoke != null) {
                                            mVar4 = mVarInvoke;
                                            break;
                                        }
                                    } else if (c13 instanceof C1411d.a) {
                                        ((C1411d.a) c13).getClass();
                                    }
                                    if (mVarInvoke != null) {
                                        mVar4 = mVarInvoke;
                                        break;
                                    }
                                }
                                return mVar4 == null ? (androidx.compose.animation.m) lVar6.invoke(interfaceC0927e) : mVar4;
                            }
                            int i39 = p141l2.C.f44217f;
                            for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                if (c14 instanceof C1412e.a) {
                                    Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar14 = ((C1412e.a) c14).f19156h;
                                    mVarInvoke2 = lVar14 != null ? lVar14.invoke(interfaceC0927e) : null;
                                    if (mVarInvoke2 != null) {
                                        mVar4 = mVarInvoke2;
                                        break;
                                    }
                                } else if (c14 instanceof C1411d.a) {
                                    ((C1411d.a) c14).getClass();
                                }
                                if (mVarInvoke2 != null) {
                                    mVar4 = mVarInvoke2;
                                    break;
                                }
                            }
                            return mVar4 == null ? (androidx.compose.animation.m) lVar.invoke(interfaceC0927e) : mVar4;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.l() { // from class: androidx.navigation.compose.L
                        /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            androidx.compose.animation.m mVarInvoke;
                            androidx.compose.animation.m mVarInvoke2;
                            InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                            p141l2.C c12 = interfaceC0927e.h().f44299c;
                            kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                            C1412e.a aVar3 = (C1412e.a) c12;
                            androidx.compose.animation.m mVar4 = null;
                            if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                int i38 = p141l2.C.f44217f;
                                for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                    if (c13 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar13 = ((C1412e.a) c13).j;
                                        mVarInvoke = lVar13 != null ? lVar13.invoke(interfaceC0927e) : null;
                                        if (mVarInvoke != null) {
                                            mVar4 = mVarInvoke;
                                            break;
                                        }
                                    } else if (c13 instanceof C1411d.a) {
                                        ((C1411d.a) c13).getClass();
                                    }
                                    if (mVarInvoke != null) {
                                        mVar4 = mVarInvoke;
                                        break;
                                    }
                                }
                                return mVar4 == null ? (androidx.compose.animation.m) lVar6.invoke(interfaceC0927e) : mVar4;
                            }
                            int i39 = p141l2.C.f44217f;
                            for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                if (c14 instanceof C1412e.a) {
                                    Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> lVar14 = ((C1412e.a) c14).f19156h;
                                    mVarInvoke2 = lVar14 != null ? lVar14.invoke(interfaceC0927e) : null;
                                    if (mVarInvoke2 != null) {
                                        mVar4 = mVarInvoke2;
                                        break;
                                    }
                                } else if (c14 instanceof C1411d.a) {
                                    ((C1411d.a) c14).getClass();
                                }
                                if (mVarInvoke2 != null) {
                                    mVar4 = mVarInvoke2;
                                    break;
                                }
                            }
                            return mVar4 == null ? (androidx.compose.animation.m) lVar.invoke(interfaceC0927e) : mVar4;
                        }
                    };
                    c1086gP.E(objF);
                }
                lVar7 = (Ia.l) objF;
                boolean zK10 = c1086gP.k(c1412e);
                if (((i11 & 29360128) ^ 12582912) > 8388608) {
                    lVar8 = lVar4;
                    if (!c1086gP.K(lVar8)) {
                        z13 = true;
                    }
                    boolean z22 = z13 | zK10;
                    if ((i11 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z22 | z14;
                    objF2 = c1086gP.f();
                    if (z15) {
                        objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                            /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                androidx.compose.animation.o oVarInvoke;
                                androidx.compose.animation.o oVarInvoke2;
                                InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                                p141l2.C c12 = interfaceC0927e.c().f44299c;
                                kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                C1412e.a aVar3 = (C1412e.a) c12;
                                androidx.compose.animation.o oVar = null;
                                if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                    int i38 = p141l2.C.f44217f;
                                    for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                        if (c13 instanceof C1412e.a) {
                                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar13 = ((C1412e.a) c13).f19158k;
                                            oVarInvoke = lVar13 != null ? lVar13.invoke(interfaceC0927e) : null;
                                            if (oVarInvoke != null) {
                                                oVar = oVarInvoke;
                                                break;
                                            }
                                        } else if (c13 instanceof C1411d.a) {
                                            ((C1411d.a) c13).getClass();
                                        }
                                        if (oVarInvoke != null) {
                                            oVar = oVarInvoke;
                                            break;
                                        }
                                    }
                                    return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                                }
                                int i39 = p141l2.C.f44217f;
                                for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                    if (c14 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar14 = ((C1412e.a) c14).f19157i;
                                        oVarInvoke2 = lVar14 != null ? lVar14.invoke(interfaceC0927e) : null;
                                        if (oVarInvoke2 != null) {
                                            oVar = oVarInvoke2;
                                            break;
                                        }
                                    } else if (c14 instanceof C1411d.a) {
                                        ((C1411d.a) c14).getClass();
                                    }
                                    if (oVarInvoke2 != null) {
                                        oVar = oVarInvoke2;
                                        break;
                                    }
                                }
                                return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                            /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                androidx.compose.animation.o oVarInvoke;
                                androidx.compose.animation.o oVarInvoke2;
                                InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                                p141l2.C c12 = interfaceC0927e.c().f44299c;
                                kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                C1412e.a aVar3 = (C1412e.a) c12;
                                androidx.compose.animation.o oVar = null;
                                if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                    int i38 = p141l2.C.f44217f;
                                    for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                        if (c13 instanceof C1412e.a) {
                                            Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar13 = ((C1412e.a) c13).f19158k;
                                            oVarInvoke = lVar13 != null ? lVar13.invoke(interfaceC0927e) : null;
                                            if (oVarInvoke != null) {
                                                oVar = oVarInvoke;
                                                break;
                                            }
                                        } else if (c13 instanceof C1411d.a) {
                                            ((C1411d.a) c13).getClass();
                                        }
                                        if (oVarInvoke != null) {
                                            oVar = oVarInvoke;
                                            break;
                                        }
                                    }
                                    return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                                }
                                int i39 = p141l2.C.f44217f;
                                for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                    if (c14 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar14 = ((C1412e.a) c14).f19157i;
                                        oVarInvoke2 = lVar14 != null ? lVar14.invoke(interfaceC0927e) : null;
                                        if (oVarInvoke2 != null) {
                                            oVar = oVarInvoke2;
                                            break;
                                        }
                                    } else if (c14 instanceof C1411d.a) {
                                        ((C1411d.a) c14).getClass();
                                    }
                                    if (oVarInvoke2 != null) {
                                        oVar = oVarInvoke2;
                                        break;
                                    }
                                }
                                return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    lVar9 = (Ia.l) objF2;
                    if ((i11 & 234881024) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z16) {
                        objF3 = new A(0, lVar5);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new A(0, lVar5);
                        c1086gP.E(objF3);
                    }
                    lVar10 = (Ia.l) objF3;
                    Boolean bool3 = Boolean.TRUE;
                    zK = c1086gP.k(c1412e);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    androidx.compose.runtime.E.a(bool3, (Ia.l) objF4, c1086gP);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new SeekableTransitionState(c2749t3);
                        c1086gP.E(objF5);
                    }
                    seekableTransitionState = (SeekableTransitionState) objF5;
                    C0909i c0909i3 = SeekableTransitionState.f9403r;
                    transitionE = TransitionKt.e(seekableTransitionState, "entry", c1086gP, 56);
                    if (((Boolean) x10.getValue()).booleanValue()) {
                        c1086gP.L(-1795663766);
                        Float fValueOf3 = Float.valueOf(u10.j());
                        zK5 = c1086gP.K(xA) | c1086gP.k(seekableTransitionState);
                        objF10 = c1086gP.f();
                        if (zK5) {
                            objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                            c1086gP.E(objF10);
                        } else {
                            objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                            c1086gP.E(objF10);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF10, c1086gP, fValueOf3);
                        c1086gP.T(false);
                        c1423p2 = null;
                    } else {
                        x10 = x10;
                        c1086gP.L(-1795408729);
                        zK2 = c1086gP.k(seekableTransitionState) | c1086gP.k(c2749t3) | c1086gP.K(transitionE);
                        objF6 = c1086gP.f();
                        if (zK2) {
                            c1423p2 = null;
                            objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                            c1086gP.E(objF6);
                        } else {
                            c1423p2 = null;
                            objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                            c1086gP.E(objF6);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF6, c1086gP, c2749t3);
                        c1086gP.T(false);
                    }
                    zK3 = c1086gP.k(g10) | c1086gP.k(c1412e) | c1086gP.K(lVar7) | c1086gP.K(lVar9) | c1086gP.K(lVar10);
                    objF7 = c1086gP.f();
                    if (zK3) {
                        final C1412e c1412e5 = c1412e;
                        final X x14 = x10;
                        objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                float f10;
                                InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                                if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                    return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                                }
                                String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                                androidx.collection.G g11 = g10;
                                int iA3 = g11.a(str2);
                                if (iA3 >= 0) {
                                    f10 = g11.f9091c[iA3];
                                } else {
                                    g11.e(0.0f, str2);
                                    f10 = 0.0f;
                                }
                                if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                    f10 = (((Boolean) c1412e5.f19154c.getValue()).booleanValue() || ((Boolean) x14.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                                }
                                g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                                return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                            }
                        };
                        c1086gP.E(objF7);
                    } else {
                        final C1412e c1412e6 = c1412e;
                        final X x15 = x10;
                        objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.l
                            public final Object invoke(Object obj3) {
                                float f10;
                                InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                                if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                    return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                                }
                                String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                                androidx.collection.G g11 = g10;
                                int iA3 = g11.a(str2);
                                if (iA3 >= 0) {
                                    f10 = g11.f9091c[iA3];
                                } else {
                                    g11.e(0.0f, str2);
                                    f10 = 0.0f;
                                }
                                if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                    f10 = (((Boolean) c1412e6.f19154c.getValue()).booleanValue() || ((Boolean) x15.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                                }
                                g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                                return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                            }
                        };
                        c1086gP.E(objF7);
                    }
                    Ia.l lVar13 = (Ia.l) objF7;
                    objF8 = c1086gP.f();
                    if (objF8 == c0153a) {
                        i12 = 0;
                        objF8 = new F(0);
                        c1086gP.E(objF8);
                    } else {
                        i12 = 0;
                    }
                    AnimatedContentKt.a(transitionE, hVar, lVar13, dVar, (Ia.l) objF8, androidx.compose.runtime.internal.a.b(820763100, new O(seekableTransitionState, c2749t3, saveableStateHolderImplA, x10, n10), c1086gP), c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 221184 | (i11 & 7168), 0);
                    Object objA3 = transitionE.f9429a.a();
                    T value3 = transitionE.f9432d.getValue();
                    zK4 = c1086gP.K(transitionE) | c1086gP.k(h8) | c1086gP.k(c1412e) | c1086gP.k(g10);
                    objF9 = c1086gP.f();
                    if (zK4) {
                        c1423p = c1423p2;
                        c1086g = c1086gP;
                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$4 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                        c1086g.E(navHostKt$NavHost$33$4);
                        objF9 = navHostKt$NavHost$33$4;
                    } else {
                        c1423p = c1423p2;
                        c1086g = c1086gP;
                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$5 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                        c1086g.E(navHostKt$NavHost$33$5);
                        objF9 = navHostKt$NavHost$33$5;
                    }
                    androidx.compose.runtime.E.e(objA3, value3, (Ia.p) objF9, c1086g);
                    c1086g.T(i12);
                } else {
                    lVar8 = lVar4;
                }
                if ((i11 & 12582912) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z23 = z13 | zK10;
                if ((i11 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z23 | z14;
                objF2 = c1086gP.f();
                if (z15) {
                    objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                        /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            androidx.compose.animation.o oVarInvoke;
                            androidx.compose.animation.o oVarInvoke2;
                            InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                            p141l2.C c12 = interfaceC0927e.c().f44299c;
                            kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                            C1412e.a aVar3 = (C1412e.a) c12;
                            androidx.compose.animation.o oVar = null;
                            if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                int i38 = p141l2.C.f44217f;
                                for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                    if (c13 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar14 = ((C1412e.a) c13).f19158k;
                                        oVarInvoke = lVar14 != null ? lVar14.invoke(interfaceC0927e) : null;
                                        if (oVarInvoke != null) {
                                            oVar = oVarInvoke;
                                            break;
                                        }
                                    } else if (c13 instanceof C1411d.a) {
                                        ((C1411d.a) c13).getClass();
                                    }
                                    if (oVarInvoke != null) {
                                        oVar = oVarInvoke;
                                        break;
                                    }
                                }
                                return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                            }
                            int i39 = p141l2.C.f44217f;
                            for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                if (c14 instanceof C1412e.a) {
                                    Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar15 = ((C1412e.a) c14).f19157i;
                                    oVarInvoke2 = lVar15 != null ? lVar15.invoke(interfaceC0927e) : null;
                                    if (oVarInvoke2 != null) {
                                        oVar = oVarInvoke2;
                                        break;
                                    }
                                } else if (c14 instanceof C1411d.a) {
                                    ((C1411d.a) c14).getClass();
                                }
                                if (oVarInvoke2 != null) {
                                    oVar = oVarInvoke2;
                                    break;
                                }
                            }
                            return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l() { // from class: androidx.navigation.compose.z
                        /* JADX WARN: Code duplicated, block: B:40:0x0066 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:8:0x003b->B:44:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:1: B:24:0x007d->B:49:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            androidx.compose.animation.o oVarInvoke;
                            androidx.compose.animation.o oVarInvoke2;
                            InterfaceC0927e<C2749t> interfaceC0927e = (InterfaceC0927e) obj3;
                            p141l2.C c12 = interfaceC0927e.c().f44299c;
                            kotlin.jvm.internal.i.c(c12, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                            C1412e.a aVar3 = (C1412e.a) c12;
                            androidx.compose.animation.o oVar = null;
                            if (((Boolean) c1412e.f19154c.getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                                int i38 = p141l2.C.f44217f;
                                for (p141l2.C c13 : l2.C.a.c(aVar3)) {
                                    if (c13 instanceof C1412e.a) {
                                        Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar14 = ((C1412e.a) c13).f19158k;
                                        oVarInvoke = lVar14 != null ? lVar14.invoke(interfaceC0927e) : null;
                                        if (oVarInvoke != null) {
                                            oVar = oVarInvoke;
                                            break;
                                        }
                                    } else if (c13 instanceof C1411d.a) {
                                        ((C1411d.a) c13).getClass();
                                    }
                                    if (oVarInvoke != null) {
                                        oVar = oVarInvoke;
                                        break;
                                    }
                                }
                                return oVar == null ? (androidx.compose.animation.o) lVar8.invoke(interfaceC0927e) : oVar;
                            }
                            int i39 = p141l2.C.f44217f;
                            for (p141l2.C c14 : l2.C.a.c(aVar3)) {
                                if (c14 instanceof C1412e.a) {
                                    Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> lVar15 = ((C1412e.a) c14).f19157i;
                                    oVarInvoke2 = lVar15 != null ? lVar15.invoke(interfaceC0927e) : null;
                                    if (oVarInvoke2 != null) {
                                        oVar = oVarInvoke2;
                                        break;
                                    }
                                } else if (c14 instanceof C1411d.a) {
                                    ((C1411d.a) c14).getClass();
                                }
                                if (oVarInvoke2 != null) {
                                    oVar = oVarInvoke2;
                                    break;
                                }
                            }
                            return oVar == null ? (androidx.compose.animation.o) lVar2.invoke(interfaceC0927e) : oVar;
                        }
                    };
                    c1086gP.E(objF2);
                }
                lVar9 = (Ia.l) objF2;
                if ((i11 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objF3 = c1086gP.f();
                if (z16) {
                    objF3 = new A(0, lVar5);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new A(0, lVar5);
                    c1086gP.E(objF3);
                }
                lVar10 = (Ia.l) objF3;
                Boolean bool4 = Boolean.TRUE;
                zK = c1086gP.k(c1412e);
                objF4 = c1086gP.f();
                if (zK) {
                    objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.l() { // from class: androidx.navigation.compose.B
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            return new androidx.compose.animation.core.Y(n10, 2, c1412e);
                        }
                    };
                    c1086gP.E(objF4);
                }
                androidx.compose.runtime.E.a(bool4, (Ia.l) objF4, c1086gP);
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = new SeekableTransitionState(c2749t3);
                    c1086gP.E(objF5);
                }
                seekableTransitionState = (SeekableTransitionState) objF5;
                C0909i c0909i4 = SeekableTransitionState.f9403r;
                transitionE = TransitionKt.e(seekableTransitionState, "entry", c1086gP, 56);
                if (((Boolean) x10.getValue()).booleanValue()) {
                    c1086gP.L(-1795663766);
                    Float fValueOf4 = Float.valueOf(u10.j());
                    zK5 = c1086gP.K(xA) | c1086gP.k(seekableTransitionState);
                    objF10 = c1086gP.f();
                    if (zK5) {
                        objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                        c1086gP.E(objF10);
                    } else {
                        objF10 = new NavHostKt$NavHost$28$1(seekableTransitionState, xA, u10, null);
                        c1086gP.E(objF10);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF10, c1086gP, fValueOf4);
                    c1086gP.T(false);
                    c1423p2 = null;
                } else {
                    x10 = x10;
                    c1086gP.L(-1795408729);
                    zK2 = c1086gP.k(seekableTransitionState) | c1086gP.k(c2749t3) | c1086gP.K(transitionE);
                    objF6 = c1086gP.f();
                    if (zK2) {
                        c1423p2 = null;
                        objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                        c1086gP.E(objF6);
                    } else {
                        c1423p2 = null;
                        objF6 = new NavHostKt$NavHost$29$1(seekableTransitionState, c2749t3, transitionE, null);
                        c1086gP.E(objF6);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF6, c1086gP, c2749t3);
                    c1086gP.T(false);
                }
                zK3 = c1086gP.k(g10) | c1086gP.k(c1412e) | c1086gP.K(lVar7) | c1086gP.K(lVar9) | c1086gP.K(lVar10);
                objF7 = c1086gP.f();
                if (zK3) {
                    final C1412e c1412e7 = c1412e;
                    final X x16 = x10;
                    objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            float f10;
                            InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                            if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                            }
                            String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                            androidx.collection.G g11 = g10;
                            int iA3 = g11.a(str2);
                            if (iA3 >= 0) {
                                f10 = g11.f9091c[iA3];
                            } else {
                                g11.e(0.0f, str2);
                                f10 = 0.0f;
                            }
                            if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                f10 = (((Boolean) c1412e7.f19154c.getValue()).booleanValue() || ((Boolean) x16.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                            }
                            g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                            return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                        }
                    };
                    c1086gP.E(objF7);
                } else {
                    final C1412e c1412e8 = c1412e;
                    final X x17 = x10;
                    objF7 = new Ia.l() { // from class: androidx.navigation.compose.C
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            float f10;
                            InterfaceC0927e interfaceC0927e = (InterfaceC0927e) obj3;
                            if (!((List) n10.getValue()).contains(interfaceC0927e.c())) {
                                return AnimatedContentKt.c(androidx.compose.animation.m.f9657a, androidx.compose.animation.o.f9659a);
                            }
                            String str2 = ((C2749t) interfaceC0927e.c()).f44303g;
                            androidx.collection.G g11 = g10;
                            int iA3 = g11.a(str2);
                            if (iA3 >= 0) {
                                f10 = g11.f9091c[iA3];
                            } else {
                                g11.e(0.0f, str2);
                                f10 = 0.0f;
                            }
                            if (!kotlin.jvm.internal.i.a(((C2749t) interfaceC0927e.h()).f44303g, ((C2749t) interfaceC0927e.c()).f44303g)) {
                                f10 = (((Boolean) c1412e8.f19154c.getValue()).booleanValue() || ((Boolean) x17.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                            }
                            g11.e(f10, ((C2749t) interfaceC0927e.h()).f44303g);
                            return new androidx.compose.animation.j((androidx.compose.animation.m) lVar7.invoke(interfaceC0927e), (androidx.compose.animation.o) lVar9.invoke(interfaceC0927e), f10, (androidx.compose.animation.y) lVar10.invoke(interfaceC0927e));
                        }
                    };
                    c1086gP.E(objF7);
                }
                Ia.l lVar14 = (Ia.l) objF7;
                objF8 = c1086gP.f();
                if (objF8 == c0153a) {
                    i12 = 0;
                    objF8 = new F(0);
                    c1086gP.E(objF8);
                } else {
                    i12 = 0;
                }
                AnimatedContentKt.a(transitionE, hVar, lVar14, dVar, (Ia.l) objF8, androidx.compose.runtime.internal.a.b(820763100, new O(seekableTransitionState, c2749t3, saveableStateHolderImplA, x10, n10), c1086gP), c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 221184 | (i11 & 7168), 0);
                Object objA4 = transitionE.f9429a.a();
                T value4 = transitionE.f9432d.getValue();
                zK4 = c1086gP.K(transitionE) | c1086gP.k(h8) | c1086gP.k(c1412e) | c1086gP.k(g10);
                objF9 = c1086gP.f();
                if (zK4) {
                    c1423p = c1423p2;
                    c1086g = c1086gP;
                    NavHostKt$NavHost$33$1 navHostKt$NavHost$33$6 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                    c1086g.E(navHostKt$NavHost$33$6);
                    objF9 = navHostKt$NavHost$33$6;
                } else {
                    c1423p = c1423p2;
                    c1086g = c1086gP;
                    NavHostKt$NavHost$33$1 navHostKt$NavHost$33$7 = new NavHostKt$NavHost$33$1(transitionE, h8, g10, n10, c1412e, null);
                    c1086g.E(navHostKt$NavHost$33$7);
                    objF9 = navHostKt$NavHost$33$7;
                }
                androidx.compose.runtime.E.e(objA4, value4, (Ia.p) objF9, c1086g);
                c1086g.T(i12);
            } else {
                c1086g = c1086gP;
                jVar = jVar2;
                c1423p = null;
                i12 = 0;
                c1086g.L(-1790236038);
                c1086g.T(false);
            }
            p141l2.P pB3 = jVar.f44802s.b("dialog");
            C1423p c1423p3 = pB3 instanceof C1423p ? (C1423p) pB3 : c1423p;
            if (c1423p3 == null) {
                C1105p0 c1105p0V2 = c1086g.V();
                if (c1105p0V2 != null) {
                    c1105p0V2.f13109d = new Ia.p() { // from class: androidx.navigation.compose.G
                        @Override // Ia.p
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iL = L4.b.l(i10 | 1);
                            Ia.l lVar15 = lVar4;
                            Ia.l lVar16 = lVar5;
                            Q.b(h8, graph, hVar, dVar, lVar, lVar2, lVar3, lVar15, lVar16, (InterfaceC1084f) obj3, iL);
                            return p293xa.r.f47939a;
                        }
                    };
                    return;
                }
                return;
            }
            DialogHostKt.a(c1423p3, c1086g, i12);
        }
        C1105p0 c1105p0V3 = c1086g.V();
        if (c1105p0V3 != null) {
            c1105p0V3.f13109d = new Ia.p() { // from class: androidx.navigation.compose.H
                @Override // Ia.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iL = L4.b.l(i10 | 1);
                    Ia.l lVar15 = lVar4;
                    Ia.l lVar16 = lVar5;
                    Q.b(h8, graph, hVar, dVar, lVar, lVar2, lVar3, lVar15, lVar16, (InterfaceC1084f) obj3, iL);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
