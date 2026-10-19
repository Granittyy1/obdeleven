package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.E;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final i a(s sVar, b bVar) {
        boolean z10 = sVar.b() == CrossStatus.f11530b;
        h hVar = sVar.f11623c;
        return new i(c(hVar, z10, true, 1, bVar), c(hVar, z10, false, 1, bVar), z10);
    }

    public static final i.a b(final s sVar, final h hVar, i.a aVar) {
        CrossStatus crossStatus;
        boolean z10 = sVar.f11621a;
        final int i10 = z10 ? hVar.f11598a : hVar.f11599b;
        hVar.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42973d;
        final p293xa.g gVarB = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final Integer invoke() {
                B b10 = hVar.f11601d;
                return Integer.valueOf(b10.f15301b.d(i10));
            }
        });
        int i11 = hVar.f11598a;
        int i12 = hVar.f11599b;
        final int i13 = z10 ? i12 : i11;
        final int i14 = i10;
        p293xa.g gVarB2 = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<i.a>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final i.a invoke() {
                h hVar2 = hVar;
                int iIntValue = gVarB.getValue().intValue();
                int i15 = i14;
                int i16 = i13;
                boolean zA = sVar.a();
                boolean z11 = sVar.b() == CrossStatus.f11530b;
                long j = hVar2.f11601d.j(i15);
                int i17 = E.f15315c;
                int iG = (int) (j >> 32);
                B b10 = hVar2.f11601d;
                int iD = b10.f15301b.d(iG);
                C1268i c1268i = b10.f15301b;
                int i18 = c1268i.f15475f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i18 ? b10.g(i18 - 1) : b10.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (c1268i.d(iC) != iIntValue) {
                    iC = iIntValue >= i18 ? c1268i.c(i18 - 1, false) : c1268i.c(iIntValue, false);
                }
                if (iG == i16) {
                    return hVar2.a(iC);
                }
                if (iC == i16) {
                    return hVar2.a(iG);
                }
                if (!(zA ^ z11) ? i15 >= iG : i15 > iC) {
                    iG = iC;
                }
                return hVar2.a(iG);
            }
        });
        if (1 != aVar.f11607c) {
            return (i.a) gVarB2.getValue();
        }
        int i15 = hVar.f11600c;
        if (i10 == i15) {
            return aVar;
        }
        B b10 = hVar.f11601d;
        if (((Number) gVarB.getValue()).intValue() != b10.f15301b.d(i15)) {
            return (i.a) gVarB2.getValue();
        }
        int i16 = aVar.f11606b;
        long j = b10.j(i16);
        if (i15 != -1) {
            if (i10 != i15) {
                if (i11 < i12) {
                    crossStatus = CrossStatus.f11531c;
                } else {
                    crossStatus = i11 > i12 ? CrossStatus.f11530b : CrossStatus.f11532d;
                }
                if (!(z10 ^ (crossStatus == CrossStatus.f11530b))) {
                }
            }
            return hVar.a(i10);
        }
        int i17 = E.f15315c;
        return (i16 == ((int) (j >> 32)) || i16 == ((int) (j & 4294967295L))) ? (i.a) gVarB2.getValue() : hVar.a(i10);
    }

    public static final i.a c(h hVar, boolean z10, boolean z11, int i10, b bVar) {
        long j;
        int i11 = z11 ? hVar.f11598a : hVar.f11599b;
        hVar.getClass();
        if (i10 != 1) {
            return hVar.a(i11);
        }
        long jA = bVar.a(hVar, i11);
        if (z10 ^ z11) {
            int i12 = E.f15315c;
            j = jA >> 32;
        } else {
            int i13 = E.f15315c;
            j = 4294967295L & jA;
        }
        return hVar.a((int) j);
    }

    public static final i.a d(i.a aVar, h hVar, int i10) {
        return new i.a(hVar.f11601d.a(i10), i10, aVar.f11607c);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    public static final i e(i iVar, s sVar) {
        boolean z10;
        boolean z11 = false;
        h hVar = sVar.f11623c;
        if (iVar == null) {
            z10 = true;
        } else {
            i.a aVar = iVar.f11602a;
            long j = aVar.f11607c;
            i.a aVar2 = iVar.f11603b;
            if (j != aVar2.f11607c) {
                boolean z12 = iVar.f11604c;
                if ((z12 ? aVar : aVar2).f11606b == 0) {
                    if (z12) {
                        aVar = aVar2;
                    }
                    if (hVar.f11601d.f15300a.f15276a.f15408c.length() == aVar.f11606b) {
                        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        new Ia.l<h, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.SelectionLayoutKt$isCollapsed$1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(h hVar2) {
                                if (hVar2.f11601d.f15300a.f15276a.f15408c.length() > 0) {
                                    ref$BooleanRef.element = false;
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        z10 = ref$BooleanRef.element;
                    }
                }
            } else if (aVar.f11606b == aVar2.f11606b) {
                z10 = true;
            }
            z10 = false;
        }
        if (!z10) {
            return iVar;
        }
        String str = hVar.f11601d.f15300a.f15276a.f15408c;
        i iVar2 = sVar.f11622b;
        if (iVar2 == null) {
            return iVar;
        }
        if (str.length() == 0) {
            return iVar;
        }
        String str2 = hVar.f11601d.f15300a.f15276a.f15408c;
        int length = str2.length();
        boolean z13 = sVar.f11621a;
        int i10 = hVar.f11598a;
        if (i10 == 0) {
            int iO = p241t7.b.o(0, str2);
            return z13 ? i.a(iVar, d(iVar.f11602a, hVar, iO), null, true, 2) : i.a(iVar, null, d(iVar.f11603b, hVar, iO), false, 1);
        }
        if (i10 == length) {
            int iQ = p241t7.b.q(length, str2);
            return z13 ? i.a(iVar, d(iVar.f11602a, hVar, iQ), null, false, 2) : i.a(iVar, null, d(iVar.f11603b, hVar, iQ), true, 1);
        }
        if (iVar2 != null && iVar2.f11604c) {
            z11 = true;
        }
        int iQ2 = z13 ^ z11 ? p241t7.b.q(i10, str2) : p241t7.b.o(i10, str2);
        return z13 ? i.a(iVar, d(iVar.f11602a, hVar, iQ2), null, z11, 2) : i.a(iVar, null, d(iVar.f11603b, hVar, iQ2), z11, 1);
    }
}
