package androidx.compose.ui.layout;

import androidx.collection.C0880h;
import androidx.compose.foundation.layout.C0961v;
import androidx.compose.foundation.layout.C0962w;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.FlowMeasurePolicy;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: MultiContentMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowMeasurePolicy f14190a;

    public L(FlowMeasurePolicy flowMeasurePolicy) {
        this.f14190a = flowMeasurePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && kotlin.jvm.internal.i.a(this.f14190a, ((L) obj).f14190a);
    }

    @Override // androidx.compose.ui.layout.E
    public final F g(H h8, List<? extends D> list, long j) {
        return this.f14190a.h(h8, androidx.compose.ui.node.G.a(h8), j);
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayListA = androidx.compose.ui.node.G.a(interfaceC1167m);
        FlowMeasurePolicy flowMeasurePolicy = this.f14190a;
        flowMeasurePolicy.getClass();
        List list2 = (List) kotlin.collections.q.Q(1, arrayListA);
        InterfaceC1166l interfaceC1166l = list2 != null ? (InterfaceC1166l) kotlin.collections.q.P(list2) : null;
        List list3 = (List) kotlin.collections.q.Q(2, arrayListA);
        flowMeasurePolicy.f10141h.b(interfaceC1166l, list3 != null ? (InterfaceC1166l) kotlin.collections.q.P(list3) : null, p013b0.b.b(0, i10, 7));
        List list4 = (List) kotlin.collections.q.P(arrayListA);
        if (list4 == null) {
            list4 = EmptyList.f42983b;
        }
        int iE1 = interfaceC1167m.e1(flowMeasurePolicy.f10136c);
        flowMeasurePolicy.getClass();
        int size = list4.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iJ = ((InterfaceC1166l) list4.get(i11)).J(i10) + iE1;
            int i14 = i11 + 1;
            if (i14 - i12 == flowMeasurePolicy.f10139f || i14 == list4.size()) {
                iMax = Math.max(iMax, (i13 + iJ) - iE1);
                i13 = 0;
                i12 = i11;
            } else {
                i13 += iJ;
            }
            i11 = i14;
        }
        return iMax;
    }

    public final int hashCode() {
        return this.f14190a.hashCode();
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayListA = androidx.compose.ui.node.G.a(interfaceC1167m);
        FlowMeasurePolicy flowMeasurePolicy = this.f14190a;
        flowMeasurePolicy.getClass();
        List list2 = (List) kotlin.collections.q.Q(1, arrayListA);
        InterfaceC1166l interfaceC1166l = list2 != null ? (InterfaceC1166l) kotlin.collections.q.P(list2) : null;
        List list3 = (List) kotlin.collections.q.Q(2, arrayListA);
        flowMeasurePolicy.f10141h.b(interfaceC1166l, list3 != null ? (InterfaceC1166l) kotlin.collections.q.P(list3) : null, p013b0.b.b(i10, 0, 13));
        List<? extends InterfaceC1166l> list4 = (List) kotlin.collections.q.P(arrayListA);
        if (list4 == null) {
            list4 = EmptyList.f42983b;
        }
        return flowMeasurePolicy.g(list4, i10, interfaceC1167m.e1(flowMeasurePolicy.f10136c), interfaceC1167m.e1(flowMeasurePolicy.f10138e), flowMeasurePolicy.f10139f, flowMeasurePolicy.f10140g, flowMeasurePolicy.f10141h);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0306  */
    /* JADX WARN: Code duplicated, block: B:162:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int i11;
        int i12;
        boolean z10;
        long jA;
        int i13;
        int i14;
        FlowLayoutOverflow.OverflowType overflowType;
        ArrayList arrayListA = androidx.compose.ui.node.G.a(interfaceC1167m);
        FlowMeasurePolicy flowMeasurePolicy = this.f14190a;
        flowMeasurePolicy.getClass();
        List list2 = (List) kotlin.collections.q.Q(1, arrayListA);
        InterfaceC1166l interfaceC1166l = list2 != null ? (InterfaceC1166l) kotlin.collections.q.P(list2) : null;
        List list3 = (List) kotlin.collections.q.Q(2, arrayListA);
        flowMeasurePolicy.f10141h.b(interfaceC1166l, list3 != null ? (InterfaceC1166l) kotlin.collections.q.P(list3) : null, p013b0.b.b(0, i10, 7));
        List list4 = (List) kotlin.collections.q.P(arrayListA);
        if (list4 == null) {
            list4 = EmptyList.f42983b;
        }
        int iE1 = interfaceC1167m.e1(flowMeasurePolicy.f10136c);
        int iE2 = interfaceC1167m.e1(flowMeasurePolicy.f10138e);
        int i15 = flowMeasurePolicy.f10140g;
        int i16 = flowMeasurePolicy.f10139f;
        C0962w c0962w = flowMeasurePolicy.f10141h;
        flowMeasurePolicy.getClass();
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        List list5 = list4;
        int size3 = list5.size();
        for (int i17 = 0; i17 < size3; i17++) {
            InterfaceC1166l interfaceC1166l2 = (InterfaceC1166l) list4.get(i17);
            int I10 = interfaceC1166l2.I(i10);
            iArr[i17] = I10;
            iArr2[i17] = interfaceC1166l2.k0(I10);
        }
        int i18 = (i15 == Integer.MAX_VALUE || i16 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i16 * i15;
        if (i18 >= list4.size() || ((overflowType = c0962w.f10337a) != FlowLayoutOverflow.OverflowType.f10131d && overflowType != FlowLayoutOverflow.OverflowType.f10132e)) {
            if (i18 >= list4.size() && i15 >= c0962w.f10338b) {
                i11 = c0962w.f10337a == FlowLayoutOverflow.OverflowType.f10132e ? 1 : 0;
            }
        }
        int iMin = Math.min(i18 - i11, list4.size());
        int i19 = 0;
        for (int i20 = 0; i20 < size; i20++) {
            i19 += iArr[i20];
        }
        int size4 = ((list4.size() - 1) * iE1) + i19;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr2[0];
        Na.h it = new Na.i(1, size2 - 1, 1).iterator();
        int i22 = i21;
        while (it.f4692d) {
            int i23 = iArr2[it.a()];
            if (i22 < i23) {
                i22 = i23;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i24 = iArr[0];
        int i25 = size4;
        Na.h it2 = new Na.i(1, size - 1, 1).iterator();
        while (it2.f4692d) {
            int i26 = iArr[it2.a()];
            if (i24 < i26) {
                i24 = i26;
            }
        }
        int i27 = i24;
        int i28 = i25;
        while (i27 <= i28 && i22 != i10) {
            i25 = (i27 + i28) / 2;
            int i29 = FlowLayoutKt.f10123a;
            if (list4.isEmpty()) {
                jA = C0880h.a(0, 0);
                iArr2 = iArr2;
                iArr = iArr;
                i16 = i16;
                c0962w = c0962w;
                i15 = i15;
            } else {
                iArr2 = iArr2;
                iArr = iArr;
                i16 = i16;
                C0962w c0962w2 = c0962w;
                i15 = i15;
                C0961v c0961v = new C0961v(i16, c0962w, p013b0.b.a(0, i25, 0, BrazeLogger.SUPPRESS), i15, iE1, iE2);
                InterfaceC1166l interfaceC1166l3 = (InterfaceC1166l) kotlin.collections.q.Q(0, list4);
                int i30 = interfaceC1166l3 != null ? iArr2[0] : 0;
                int i31 = interfaceC1166l3 != null ? iArr[0] : 0;
                if (list4.size() > 1) {
                    i12 = BrazeLogger.SUPPRESS;
                    z10 = true;
                } else {
                    i12 = BrazeLogger.SUPPRESS;
                    z10 = false;
                }
                if (c0961v.b(z10, 0, C0880h.a(i25, i12), interfaceC1166l3 == null ? null : new C0880h(C0880h.a(i31, i30)), 0, 0, 0, false, false).f10336b) {
                    C0880h c0880hA = c0962w2.a(0, 0, interfaceC1166l3 != null);
                    jA = C0880h.a(c0880hA != null ? (int) (c0880hA.f9182a & 4294967295L) : 0, 0);
                    c0962w = c0962w2;
                } else {
                    C0962w c0962w3 = c0962w2;
                    int size5 = list5.size();
                    int i32 = i25;
                    int i33 = i31;
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    int iMax = 0;
                    int i38 = i30;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= size5) {
                            i27 = i27;
                            i28 = i28;
                            i25 = i25;
                            c0962w = c0962w3;
                            break;
                        }
                        int i40 = i32 - i33;
                        i27 = i27;
                        int i41 = i39 + 1;
                        iMax = Math.max(iMax, i38);
                        InterfaceC1166l interfaceC1166l4 = (InterfaceC1166l) kotlin.collections.q.Q(i41, list4);
                        int i42 = interfaceC1166l4 != null ? iArr2[i41] : 0;
                        int i43 = interfaceC1166l4 != null ? iArr[i41] + iE1 : 0;
                        c0962w = c0962w3;
                        boolean z11 = i39 + 2 < list4.size();
                        int i44 = i41 - i36;
                        C0961v.b bVarB = c0961v.b(z11, i44, C0880h.a(i40, BrazeLogger.SUPPRESS), interfaceC1166l4 == null ? null : new C0880h(C0880h.a(i43, i42)), i35, i34, iMax, false, false);
                        if (bVarB.f10335a) {
                            int i45 = iMax + iE2 + i34;
                            C0961v.a aVarA = c0961v.a(bVarB, interfaceC1166l4 != null, i35, i45, i40, i44);
                            i43 -= iE1;
                            i35++;
                            if (bVarB.f10336b) {
                                if (aVarA != null && !aVarA.f10334d) {
                                    i45 += ((int) (aVarA.f10333c & 4294967295L)) + iE2;
                                }
                                i34 = i45;
                                i37 = i41;
                                break;
                            }
                            i36 = i41;
                            i34 = i45;
                            i32 = i25;
                            iMax = 0;
                        } else {
                            i32 = i40;
                        }
                        i28 = i28;
                        i39 = i41;
                        i37 = i39;
                        i38 = i42;
                        i27 = i27;
                        c0962w3 = c0962w;
                        i25 = i25;
                        i33 = i43;
                        size5 = size5;
                    }
                    jA = C0880h.a(i34 - iE2, i37);
                }
                i22 = (int) (jA >> 32);
                int i46 = (int) (jA & 4294967295L);
                if (i22 <= i10 || i46 < iMin) {
                    i13 = i25 + 1;
                    i14 = i28;
                    i27 = i13;
                    if (i13 > i14) {
                        return i27;
                    }
                    i28 = i14;
                } else {
                    if (i22 >= i10) {
                        return i25;
                    }
                    i28 = i25 - 1;
                    i27 = i27;
                }
            }
            i22 = (int) (jA >> 32);
            int i47 = (int) (jA & 4294967295L);
            if (i22 <= i10) {
            }
            i13 = i25 + 1;
            i14 = i28;
            i27 = i13;
            if (i13 > i14) {
                return i27;
            }
            i28 = i14;
        }
        return i25;
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        ArrayList arrayListA = androidx.compose.ui.node.G.a(interfaceC1167m);
        FlowMeasurePolicy flowMeasurePolicy = this.f14190a;
        flowMeasurePolicy.getClass();
        List list2 = (List) kotlin.collections.q.Q(1, arrayListA);
        InterfaceC1166l interfaceC1166l = list2 != null ? (InterfaceC1166l) kotlin.collections.q.P(list2) : null;
        List list3 = (List) kotlin.collections.q.Q(2, arrayListA);
        flowMeasurePolicy.f10141h.b(interfaceC1166l, list3 != null ? (InterfaceC1166l) kotlin.collections.q.P(list3) : null, p013b0.b.b(i10, 0, 13));
        List<? extends InterfaceC1166l> list4 = (List) kotlin.collections.q.P(arrayListA);
        if (list4 == null) {
            list4 = EmptyList.f42983b;
        }
        return flowMeasurePolicy.g(list4, i10, interfaceC1167m.e1(flowMeasurePolicy.f10136c), interfaceC1167m.e1(flowMeasurePolicy.f10138e), flowMeasurePolicy.f10139f, flowMeasurePolicy.f10140g, flowMeasurePolicy.f10141h);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f14190a + ')';
    }
}
