package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C1293h;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<I.h, p293xa.r> f11780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f11783d;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(Ia.l<? super I.h, p293xa.r> lVar, boolean z10, float f10, androidx.compose.foundation.layout.L l10) {
        this.f11780a = lVar;
        this.f11781b = z10;
        this.f11782c = f10;
        this.f11783d = l10;
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
            float f10 = OutlinedTextFieldKt.f11778a;
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
            float f11 = OutlinedTextFieldKt.f11778a;
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
        int iIntValue3 = interfaceC1166l7 != null ? pVar.invoke(interfaceC1166l7, Integer.valueOf(D9.o.o(this.f11782c, i11, i10))).intValue() : 0;
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
                return OutlinedTextFieldKt.b(iIntValue, iIntValue2, iIntValue4, iIntValue3, interfaceC1166l10 != null ? pVar.invoke(interfaceC1166l10, Integer.valueOf(i11)).intValue() : 0, this.f11782c, p013b0.b.b(0, 0, 15), interfaceC1167m.getDensity(), this.f11783d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10, Ia.p<? super InterfaceC1166l, ? super Integer, Integer> pVar) {
        InterfaceC1166l interfaceC1166l;
        InterfaceC1166l interfaceC1166l2;
        InterfaceC1166l interfaceC1166l3;
        InterfaceC1166l interfaceC1166l4;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1166l interfaceC1166l5 = list.get(i11);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l5), "TextField")) {
                int iIntValue = pVar.invoke(interfaceC1166l5, Integer.valueOf(i10)).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    interfaceC1166l = null;
                    if (i12 >= size2) {
                        interfaceC1166l2 = null;
                        break;
                    }
                    interfaceC1166l2 = list.get(i12);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC1166l interfaceC1166l6 = interfaceC1166l2;
                int iIntValue2 = interfaceC1166l6 != null ? pVar.invoke(interfaceC1166l6, Integer.valueOf(i10)).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        interfaceC1166l3 = null;
                        break;
                    }
                    interfaceC1166l3 = list.get(i13);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC1166l interfaceC1166l7 = interfaceC1166l3;
                int iIntValue3 = interfaceC1166l7 != null ? pVar.invoke(interfaceC1166l7, Integer.valueOf(i10)).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        interfaceC1166l4 = null;
                        break;
                    }
                    interfaceC1166l4 = list.get(i14);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC1166l interfaceC1166l8 = interfaceC1166l4;
                int iIntValue4 = interfaceC1166l8 != null ? pVar.invoke(interfaceC1166l8, Integer.valueOf(i10)).intValue() : 0;
                int size5 = list.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    InterfaceC1166l interfaceC1166l9 = list.get(i15);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.c(interfaceC1166l9), "Hint")) {
                        interfaceC1166l = interfaceC1166l9;
                        break;
                    }
                }
                InterfaceC1166l interfaceC1166l10 = interfaceC1166l;
                return OutlinedTextFieldKt.c(iIntValue4, iIntValue3, iIntValue, iIntValue2, interfaceC1166l10 != null ? pVar.invoke(interfaceC1166l10, Integer.valueOf(i10)).intValue() : 0, this.f11782c, p013b0.b.b(0, 0, 15), interfaceC1167m.getDensity(), this.f11783d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        androidx.compose.ui.layout.D d10;
        androidx.compose.ui.layout.D d11;
        androidx.compose.ui.layout.D d12;
        androidx.compose.ui.layout.D d13;
        androidx.compose.foundation.layout.L l10 = this.f11783d;
        int iE1 = h8.e1(l10.a());
        long jA = p013b0.a.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                d10 = null;
                break;
            }
            d10 = list.get(i10);
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
            d11 = list.get(i11);
            if (kotlin.jvm.internal.i.a(C1171q.a(d11), "Trailing")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.D d15 = d11;
        Y yQ2 = d15 != null ? d15.Q(p013b0.b.j(-iE, 0, 2, jA)) : null;
        int iE2 = TextFieldImplKt.e(yQ2) + iE;
        int iE3 = h8.e1(l10.c(h8.getLayoutDirection())) + h8.e1(l10.b(h8.getLayoutDirection()));
        int i12 = -iE2;
        int i13 = -iE1;
        long jI = p013b0.b.i(jA, D9.o.o(this.f11782c, i12 - iE3, -iE3), i13);
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                d12 = null;
                break;
            }
            d12 = list.get(i14);
            if (kotlin.jvm.internal.i.a(C1171q.a(d12), "Label")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.D d16 = d12;
        final Y yQ3 = d16 != null ? d16.Q(jI) : null;
        this.f11780a.invoke(new I.h(yQ3 != null ? Cb.a.b(yQ3.f14220b, yQ3.f14221c) : 0L));
        long jA2 = p013b0.a.a(p013b0.b.i(j, i12, i13 - Math.max(TextFieldImplKt.d(yQ3) / 2, h8.e1(l10.d()))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        for (int i15 = 0; i15 < size4; i15++) {
            androidx.compose.ui.layout.D d17 = list.get(i15);
            if (kotlin.jvm.internal.i.a(C1171q.a(d17), "TextField")) {
                final Y yQ4 = d17.Q(jA2);
                long jA3 = p013b0.a.a(jA2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        d13 = null;
                        break;
                    }
                    d13 = list.get(i16);
                    if (kotlin.jvm.internal.i.a(C1171q.a(d13), "Hint")) {
                        break;
                    }
                    i16++;
                }
                androidx.compose.ui.layout.D d18 = d13;
                Y yQ5 = d18 != null ? d18.Q(jA3) : null;
                final int iC = OutlinedTextFieldKt.c(TextFieldImplKt.e(yQ), TextFieldImplKt.e(yQ2), yQ4.f14220b, TextFieldImplKt.e(yQ3), TextFieldImplKt.e(yQ5), this.f11782c, j, h8.getDensity(), this.f11783d);
                final int iB = OutlinedTextFieldKt.b(TextFieldImplKt.d(yQ), TextFieldImplKt.d(yQ2), yQ4.f14221c, TextFieldImplKt.d(yQ3), TextFieldImplKt.d(yQ5), this.f11782c, j, h8.getDensity(), this.f11783d);
                int size6 = list.size();
                for (int i17 = 0; i17 < size6; i17++) {
                    androidx.compose.ui.layout.D d19 = list.get(i17);
                    if (kotlin.jvm.internal.i.a(C1171q.a(d19), "border")) {
                        final Y yQ6 = d19.Q(p013b0.b.a(iC != Integer.MAX_VALUE ? iC : 0, iC, iB != Integer.MAX_VALUE ? iB : 0, iB));
                        final Y y10 = yQ;
                        final Y y11 = yQ2;
                        final Y y12 = yQ5;
                        return h8.y1(iC, iB, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Y.a aVar) {
                                int iF;
                                int iF2;
                                int iF3;
                                Y.a aVar2 = aVar;
                                int i18 = iB;
                                int i19 = iC;
                                Y y13 = y10;
                                Y y14 = y11;
                                Y y15 = yQ4;
                                Y y16 = yQ3;
                                Y y17 = y12;
                                Y y18 = yQ6;
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
                                float f10 = outlinedTextFieldMeasurePolicy.f11782c;
                                float density = h8.getDensity();
                                LayoutDirection layoutDirection = h8.getLayoutDirection();
                                androidx.compose.foundation.layout.L l11 = this.f11783d;
                                float f11 = OutlinedTextFieldKt.f11778a;
                                int iB2 = Ka.a.b(l11.d() * density);
                                int iB3 = Ka.a.b(PaddingKt.d(l11, layoutDirection) * density);
                                float f12 = TextFieldImplKt.f11840b * density;
                                if (y13 != null) {
                                    Y.a.g(aVar2, y13, 0, C1293h.f(1, 0.0f, (i18 - y13.f14221c) / 2.0f));
                                }
                                if (y14 != null) {
                                    Y.a.g(aVar2, y14, i19 - y14.f14220b, C1293h.f(1, 0.0f, (i18 - y14.f14221c) / 2.0f));
                                }
                                boolean z10 = outlinedTextFieldMeasurePolicy.f11781b;
                                if (y16 != null) {
                                    if (z10) {
                                        iF3 = C1293h.f(1, 0.0f, (i18 - y16.f14221c) / 2.0f);
                                    } else {
                                        iF3 = iB2;
                                    }
                                    Y.a.g(aVar2, y16, Ka.a.b(y13 == null ? 0.0f : (TextFieldImplKt.e(y13) - f12) * (1 - f10)) + iB3, D9.o.o(f10, iF3, -(y16.f14221c / 2)));
                                }
                                if (z10) {
                                    iF = C1293h.f(1, 0.0f, (i18 - y15.f14221c) / 2.0f);
                                } else {
                                    iF = iB2;
                                }
                                Y.a.g(aVar2, y15, TextFieldImplKt.e(y13), Math.max(iF, TextFieldImplKt.d(y16) / 2));
                                if (y17 != null) {
                                    if (z10) {
                                        iF2 = C1293h.f(1, 0.0f, (i18 - y17.f14221c) / 2.0f);
                                    } else {
                                        iF2 = iB2;
                                    }
                                    Y.a.g(aVar2, y17, TextFieldImplKt.e(y13), Math.max(iF2, TextFieldImplKt.d(y16) / 2));
                                }
                                Y.a.f(aVar2, y18, 0L);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.J(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.k0(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.I(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.s(num.intValue()));
            }
        });
    }
}
