package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.Y;
import androidx.core.view.C1293h;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f11846c;

    public TextFieldMeasurePolicy(boolean z10, float f10, androidx.compose.foundation.layout.L l10) {
        this.f11844a = z10;
        this.f11845b = f10;
        this.f11846c = l10;
    }

    public static int b(List list, int i10, Ia.p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj5 = list.get(i11);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.c((InterfaceC1166l) obj5), "TextField")) {
                int iIntValue = ((Number) pVar.invoke(obj5, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c((InterfaceC1166l) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC1166l interfaceC1166l = (InterfaceC1166l) obj2;
                int iIntValue2 = interfaceC1166l != null ? ((Number) pVar.invoke(interfaceC1166l, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c((InterfaceC1166l) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC1166l interfaceC1166l2 = (InterfaceC1166l) obj3;
                int iIntValue3 = interfaceC1166l2 != null ? ((Number) pVar.invoke(interfaceC1166l2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c((InterfaceC1166l) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC1166l interfaceC1166l3 = (InterfaceC1166l) obj4;
                int iIntValue4 = interfaceC1166l3 != null ? ((Number) pVar.invoke(interfaceC1166l3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    Object obj6 = list.get(i15);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c((InterfaceC1166l) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                }
                InterfaceC1166l interfaceC1166l4 = (InterfaceC1166l) obj;
                int iIntValue5 = interfaceC1166l4 != null ? ((Number) pVar.invoke(interfaceC1166l4, Integer.valueOf(i10))).intValue() : 0;
                long jB = p013b0.b.b(0, 0, 15);
                float f10 = TextFieldKt.f11841a;
                return p013b0.b.g(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, jB);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int a(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10, Ia.p<? super InterfaceC1166l, ? super Integer, Integer> pVar) {
        InterfaceC1166l interfaceC1166l;
        InterfaceC1166l interfaceC1166l2;
        int i11;
        int iIntValue;
        InterfaceC1166l interfaceC1166l3;
        int iIntValue2;
        InterfaceC1166l interfaceC1166l4;
        int size = list.size();
        int i12 = 0;
        while (true) {
            interfaceC1166l = null;
            if (i12 >= size) {
                interfaceC1166l2 = null;
                break;
            }
            interfaceC1166l2 = list.get(i12);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l2), "Leading")) {
                break;
            }
            i12++;
        }
        InterfaceC1166l interfaceC1166l5 = interfaceC1166l2;
        if (interfaceC1166l5 != null) {
            int iJ = interfaceC1166l5.J(BrazeLogger.SUPPRESS);
            float f10 = TextFieldKt.f11841a;
            i11 = i10 == Integer.MAX_VALUE ? i10 : i10 - iJ;
            iIntValue = pVar.invoke(interfaceC1166l5, Integer.valueOf(i10)).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                interfaceC1166l3 = null;
                break;
            }
            interfaceC1166l3 = list.get(i13);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l3), "Trailing")) {
                break;
            }
            i13++;
        }
        InterfaceC1166l interfaceC1166l6 = interfaceC1166l3;
        if (interfaceC1166l6 != null) {
            int iJ2 = interfaceC1166l6.J(BrazeLogger.SUPPRESS);
            float f11 = TextFieldKt.f11841a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ2;
            }
            iIntValue2 = pVar.invoke(interfaceC1166l6, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                interfaceC1166l4 = null;
                break;
            }
            interfaceC1166l4 = list.get(i14);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l4), "Label")) {
                break;
            }
            i14++;
        }
        InterfaceC1166l interfaceC1166l7 = interfaceC1166l4;
        int iIntValue3 = interfaceC1166l7 != null ? pVar.invoke(interfaceC1166l7, Integer.valueOf(i11)).intValue() : 0;
        int size4 = list.size();
        for (int i15 = 0; i15 < size4; i15++) {
            InterfaceC1166l interfaceC1166l8 = list.get(i15);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l8), "TextField")) {
                int iIntValue4 = pVar.invoke(interfaceC1166l8, Integer.valueOf(i11)).intValue();
                int size5 = list.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    InterfaceC1166l interfaceC1166l9 = list.get(i16);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l9), "Hint")) {
                        interfaceC1166l = interfaceC1166l9;
                        break;
                    }
                }
                InterfaceC1166l interfaceC1166l10 = interfaceC1166l;
                return TextFieldKt.c(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, interfaceC1166l10 != null ? pVar.invoke(interfaceC1166l10, Integer.valueOf(i11)).intValue() : 0, p013b0.b.b(0, 0, 15), interfaceC1167m.getDensity(), this.f11846c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        androidx.compose.ui.layout.D d10;
        androidx.compose.ui.layout.D d11;
        androidx.compose.ui.layout.D d12;
        int iV;
        androidx.compose.ui.layout.D d13;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        List<? extends androidx.compose.ui.layout.D> list2 = list;
        androidx.compose.foundation.layout.L l10 = textFieldMeasurePolicy.f11846c;
        final int iE1 = h8.e1(l10.d());
        int iE2 = h8.e1(l10.a());
        final int iE3 = h8.e1(TextFieldKt.f11843c);
        long jA = p013b0.a.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                d10 = null;
                break;
            }
            d10 = list2.get(i10);
            if (kotlin.jvm.internal.i.a(C1171q.a(d10), "Leading")) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.layout.D d14 = d10;
        Y yQ = d14 != null ? d14.Q(jA) : null;
        int iE = TextFieldImplKt.e(yQ);
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                d11 = null;
                break;
            }
            d11 = list2.get(i11);
            if (kotlin.jvm.internal.i.a(C1171q.a(d11), "Trailing")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.D d15 = d11;
        Y yQ2 = d15 != null ? d15.Q(p013b0.b.j(-iE, 0, 2, jA)) : null;
        int iE4 = TextFieldImplKt.e(yQ2) + iE;
        int i12 = -iE2;
        int i13 = -iE4;
        long jI = p013b0.b.i(jA, i13, i12);
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                d12 = null;
                break;
            }
            d12 = list2.get(i14);
            int i15 = size3;
            if (kotlin.jvm.internal.i.a(C1171q.a(d12), "Label")) {
                break;
            }
            i14++;
            size3 = i15;
        }
        androidx.compose.ui.layout.D d16 = d12;
        Y yQ3 = d16 != null ? d16.Q(jI) : null;
        if (yQ3 != null) {
            iV = yQ3.V(AlignmentLineKt.f14166b);
            if (iV == Integer.MIN_VALUE) {
                iV = yQ3.f14221c;
            }
        } else {
            iV = 0;
        }
        final int iMax = Math.max(iV, iE1);
        long jI2 = p013b0.b.i(p013b0.a.a(j, 0, 0, 0, 0, 11), i13, yQ3 != null ? (i12 - iE3) - iMax : (-iE1) - iE2);
        int size4 = list.size();
        int i16 = 0;
        while (i16 < size4) {
            androidx.compose.ui.layout.D d17 = list2.get(i16);
            if (kotlin.jvm.internal.i.a(C1171q.a(d17), "TextField")) {
                final Y yQ4 = d17.Q(jI2);
                long jA2 = p013b0.a.a(jI2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        d13 = null;
                        break;
                    }
                    d13 = list2.get(i17);
                    if (kotlin.jvm.internal.i.a(C1171q.a(d13), "Hint")) {
                        break;
                    }
                    i17++;
                    list2 = list;
                }
                androidx.compose.ui.layout.D d18 = d13;
                Y yQ5 = d18 != null ? d18.Q(jA2) : null;
                final int iG = p013b0.b.g(Math.max(yQ4.f14220b, Math.max(TextFieldImplKt.e(yQ3), TextFieldImplKt.e(yQ5))) + TextFieldImplKt.e(yQ) + TextFieldImplKt.e(yQ2), j);
                final int iC = TextFieldKt.c(yQ4.f14221c, yQ3 != null, iMax, TextFieldImplKt.d(yQ), TextFieldImplKt.d(yQ2), TextFieldImplKt.d(yQ5), j, h8.getDensity(), textFieldMeasurePolicy.f11846c);
                final Y y10 = yQ3;
                final int i18 = iV;
                final Y y11 = yQ5;
                final Y y12 = yQ;
                final Y y13 = yQ2;
                return h8.y1(iG, iC, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Y.a aVar) {
                        int iF;
                        int iB;
                        Y.a aVar2 = aVar;
                        Y y14 = y10;
                        if (y14 != null) {
                            int i19 = iE1 - i18;
                            if (i19 < 0) {
                                i19 = 0;
                            }
                            int i20 = iG;
                            int i21 = iC;
                            Y y15 = yQ4;
                            Y y16 = y11;
                            Y y17 = y12;
                            Y y18 = y13;
                            TextFieldMeasurePolicy textFieldMeasurePolicy2 = this;
                            boolean z10 = textFieldMeasurePolicy2.f11844a;
                            int i22 = iMax + iE3;
                            float density = h8.getDensity();
                            float f10 = TextFieldKt.f11841a;
                            if (y17 != null) {
                                Y.a.g(aVar2, y17, 0, C1293h.f(1, 0.0f, (i21 - y17.f14221c) / 2.0f));
                            }
                            if (y18 != null) {
                                Y.a.g(aVar2, y18, i20 - y18.f14220b, C1293h.f(1, 0.0f, (i21 - y18.f14221c) / 2.0f));
                            }
                            if (z10) {
                                iB = C1293h.f(1, 0.0f, (i21 - y14.f14221c) / 2.0f);
                            } else {
                                iB = Ka.a.b(TextFieldImplKt.f11839a * density);
                            }
                            Y.a.g(aVar2, y14, TextFieldImplKt.e(y17), iB - Ka.a.b((iB - i19) * textFieldMeasurePolicy2.f11845b));
                            Y.a.g(aVar2, y15, TextFieldImplKt.e(y17), i22);
                            if (y16 != null) {
                                Y.a.g(aVar2, y16, TextFieldImplKt.e(y17), i22);
                            }
                        } else {
                            int i23 = iG;
                            int i24 = iC;
                            Y y19 = yQ4;
                            Y y20 = y11;
                            Y y21 = y12;
                            Y y22 = y13;
                            boolean z11 = this.f11844a;
                            float density2 = h8.getDensity();
                            androidx.compose.foundation.layout.L l11 = this.f11846c;
                            float f11 = TextFieldKt.f11841a;
                            int iB2 = Ka.a.b(l11.d() * density2);
                            if (y21 != null) {
                                Y.a.g(aVar2, y21, 0, C1293h.f(1, 0.0f, (i24 - y21.f14221c) / 2.0f));
                            }
                            if (y22 != null) {
                                Y.a.g(aVar2, y22, i23 - y22.f14220b, C1293h.f(1, 0.0f, (i24 - y22.f14221c) / 2.0f));
                            }
                            if (z11) {
                                iF = C1293h.f(1, 0.0f, (i24 - y19.f14221c) / 2.0f);
                            } else {
                                iF = iB2;
                            }
                            Y.a.g(aVar2, y19, TextFieldImplKt.e(y21), iF);
                            if (y20 != null) {
                                if (z11) {
                                    iB2 = C1293h.f(1, 0.0f, (i24 - y20.f14221c) / 2.0f);
                                }
                                Y.a.g(aVar2, y20, TextFieldImplKt.e(y21), iB2);
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                });
            }
            i16++;
            textFieldMeasurePolicy = this;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.J(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.k0(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.I(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.s(num.intValue()));
            }
        });
    }
}
