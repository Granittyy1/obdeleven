package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C1293h;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<I.h, p293xa.r> f12262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f12265d;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(Ia.l<? super I.h, p293xa.r> lVar, boolean z10, float f10, androidx.compose.foundation.layout.L l10) {
        this.f12262a = lVar;
        this.f12263b = z10;
        this.f12264c = f10;
        this.f12265d = l10;
    }

    public final int a(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10, Ia.p<? super InterfaceC1166l, ? super Integer, Integer> pVar) {
        InterfaceC1166l interfaceC1166l;
        int i11;
        int iIntValue;
        InterfaceC1166l interfaceC1166l2;
        int iIntValue2;
        InterfaceC1166l interfaceC1166l3;
        InterfaceC1166l interfaceC1166l4;
        int iIntValue3;
        InterfaceC1166l interfaceC1166l5;
        int i12;
        InterfaceC1166l interfaceC1166l6;
        InterfaceC1166l interfaceC1166l7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                interfaceC1166l = null;
                break;
            }
            interfaceC1166l = list.get(i13);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l), "Leading")) {
                break;
            }
            i13++;
        }
        InterfaceC1166l interfaceC1166l8 = interfaceC1166l;
        if (interfaceC1166l8 != null) {
            int iJ = interfaceC1166l8.J(BrazeLogger.SUPPRESS);
            float f10 = OutlinedTextFieldKt.f12258a;
            i11 = i10 == Integer.MAX_VALUE ? i10 : i10 - iJ;
            iIntValue = pVar.invoke(interfaceC1166l8, Integer.valueOf(i10)).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                interfaceC1166l2 = null;
                break;
            }
            interfaceC1166l2 = list.get(i14);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l2), "Trailing")) {
                break;
            }
            i14++;
        }
        InterfaceC1166l interfaceC1166l9 = interfaceC1166l2;
        if (interfaceC1166l9 != null) {
            int iJ2 = interfaceC1166l9.J(BrazeLogger.SUPPRESS);
            float f11 = OutlinedTextFieldKt.f12258a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ2;
            }
            iIntValue2 = pVar.invoke(interfaceC1166l9, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                interfaceC1166l3 = null;
                break;
            }
            interfaceC1166l3 = list.get(i15);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l3), "Label")) {
                break;
            }
            i15++;
        }
        InterfaceC1166l interfaceC1166l10 = interfaceC1166l3;
        int iIntValue4 = interfaceC1166l10 != null ? pVar.invoke(interfaceC1166l10, Integer.valueOf(D9.o.o(this.f12264c, i11, i10))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                interfaceC1166l4 = null;
                break;
            }
            interfaceC1166l4 = list.get(i16);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l4), "Prefix")) {
                break;
            }
            i16++;
        }
        InterfaceC1166l interfaceC1166l11 = interfaceC1166l4;
        if (interfaceC1166l11 != null) {
            iIntValue3 = pVar.invoke(interfaceC1166l11, Integer.valueOf(i11)).intValue();
            int iJ3 = interfaceC1166l11.J(BrazeLogger.SUPPRESS);
            float f12 = OutlinedTextFieldKt.f12258a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                interfaceC1166l5 = null;
                break;
            }
            interfaceC1166l5 = list.get(i17);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l5), "Suffix")) {
                break;
            }
            i17++;
        }
        InterfaceC1166l interfaceC1166l12 = interfaceC1166l5;
        if (interfaceC1166l12 != null) {
            int iIntValue5 = pVar.invoke(interfaceC1166l12, Integer.valueOf(i11)).intValue();
            int iJ4 = interfaceC1166l12.J(BrazeLogger.SUPPRESS);
            float f13 = OutlinedTextFieldKt.f12258a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ4;
            }
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            InterfaceC1166l interfaceC1166l13 = list.get(i18);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l13), "TextField")) {
                int iIntValue6 = pVar.invoke(interfaceC1166l13, Integer.valueOf(i11)).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        interfaceC1166l6 = null;
                        break;
                    }
                    interfaceC1166l6 = list.get(i19);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                InterfaceC1166l interfaceC1166l14 = interfaceC1166l6;
                int iIntValue7 = interfaceC1166l14 != null ? pVar.invoke(interfaceC1166l14, Integer.valueOf(i11)).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        interfaceC1166l7 = null;
                        break;
                    }
                    InterfaceC1166l interfaceC1166l15 = list.get(i20);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l15), "Supporting")) {
                        interfaceC1166l7 = interfaceC1166l15;
                        break;
                    }
                    i20++;
                }
                InterfaceC1166l interfaceC1166l16 = interfaceC1166l7;
                return OutlinedTextFieldKt.c(iIntValue, iIntValue2, iIntValue3, i12, iIntValue6, iIntValue4, iIntValue7, interfaceC1166l16 != null ? pVar.invoke(interfaceC1166l16, Integer.valueOf(i10)).intValue() : 0, this.f12264c, TextFieldImplKt.f12497a, interfaceC1167m.getDensity(), this.f12265d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10, Ia.p<? super InterfaceC1166l, ? super Integer, Integer> pVar) {
        InterfaceC1166l interfaceC1166l;
        InterfaceC1166l interfaceC1166l2;
        InterfaceC1166l interfaceC1166l3;
        InterfaceC1166l interfaceC1166l4;
        InterfaceC1166l interfaceC1166l5;
        InterfaceC1166l interfaceC1166l6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1166l interfaceC1166l7 = list.get(i11);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l7), "TextField")) {
                int iIntValue = pVar.invoke(interfaceC1166l7, Integer.valueOf(i10)).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    interfaceC1166l = null;
                    if (i12 >= size2) {
                        interfaceC1166l2 = null;
                        break;
                    }
                    interfaceC1166l2 = list.get(i12);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC1166l interfaceC1166l8 = interfaceC1166l2;
                int iIntValue2 = interfaceC1166l8 != null ? pVar.invoke(interfaceC1166l8, Integer.valueOf(i10)).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        interfaceC1166l3 = null;
                        break;
                    }
                    interfaceC1166l3 = list.get(i13);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC1166l interfaceC1166l9 = interfaceC1166l3;
                int iIntValue3 = interfaceC1166l9 != null ? pVar.invoke(interfaceC1166l9, Integer.valueOf(i10)).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        interfaceC1166l4 = null;
                        break;
                    }
                    interfaceC1166l4 = list.get(i14);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC1166l interfaceC1166l10 = interfaceC1166l4;
                int iIntValue4 = interfaceC1166l10 != null ? pVar.invoke(interfaceC1166l10, Integer.valueOf(i10)).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        interfaceC1166l5 = null;
                        break;
                    }
                    interfaceC1166l5 = list.get(i15);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l5), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC1166l interfaceC1166l11 = interfaceC1166l5;
                int iIntValue5 = interfaceC1166l11 != null ? pVar.invoke(interfaceC1166l11, Integer.valueOf(i10)).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        interfaceC1166l6 = null;
                        break;
                    }
                    interfaceC1166l6 = list.get(i16);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l6), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC1166l interfaceC1166l12 = interfaceC1166l6;
                int iIntValue6 = interfaceC1166l12 != null ? pVar.invoke(interfaceC1166l12, Integer.valueOf(i10)).intValue() : 0;
                int size7 = list.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    InterfaceC1166l interfaceC1166l13 = list.get(i17);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l13), "Hint")) {
                        interfaceC1166l = interfaceC1166l13;
                        break;
                    }
                }
                InterfaceC1166l interfaceC1166l14 = interfaceC1166l;
                return OutlinedTextFieldKt.d(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC1166l14 != null ? pVar.invoke(interfaceC1166l14, Integer.valueOf(i10)).intValue() : 0, this.f12264c, TextFieldImplKt.f12497a, interfaceC1167m.getDensity(), this.f12265d);
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
        androidx.compose.ui.layout.Y y10;
        androidx.compose.ui.layout.D d14;
        androidx.compose.ui.layout.D d15;
        androidx.compose.ui.layout.D d16;
        androidx.compose.foundation.layout.L l10 = this.f12265d;
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
        androidx.compose.ui.layout.D d17 = d10;
        androidx.compose.ui.layout.Y yQ = d17 != null ? d17.Q(jA) : null;
        int i11 = TextFieldImplKt.i(yQ);
        int iMax = Math.max(0, TextFieldImplKt.g(yQ));
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                d11 = null;
                break;
            }
            d11 = list.get(i12);
            if (kotlin.jvm.internal.i.a(C1171q.a(d11), "Trailing")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.D d18 = d11;
        androidx.compose.ui.layout.Y yQ2 = d18 != null ? d18.Q(p013b0.b.j(-i11, 0, 2, jA)) : null;
        int i13 = TextFieldImplKt.i(yQ2) + i11;
        int iMax2 = Math.max(iMax, TextFieldImplKt.g(yQ2));
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                d12 = null;
                break;
            }
            d12 = list.get(i14);
            if (kotlin.jvm.internal.i.a(C1171q.a(d12), "Prefix")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.D d19 = d12;
        final androidx.compose.ui.layout.Y yQ3 = d19 != null ? d19.Q(p013b0.b.j(-i13, 0, 2, jA)) : null;
        int i15 = TextFieldImplKt.i(yQ3) + i13;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.g(yQ3));
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                d13 = null;
                break;
            }
            d13 = list.get(i16);
            int i17 = size4;
            if (kotlin.jvm.internal.i.a(C1171q.a(d13), "Suffix")) {
                break;
            }
            i16++;
            size4 = i17;
        }
        androidx.compose.ui.layout.D d20 = d13;
        androidx.compose.ui.layout.Y yQ4 = d20 != null ? d20.Q(p013b0.b.j(-i15, 0, 2, jA)) : null;
        int i18 = TextFieldImplKt.i(yQ4) + i15;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.g(yQ4));
        androidx.compose.ui.layout.H h10 = h8;
        int iE2 = h10.e1(l10.c(h8.getLayoutDirection())) + h10.e1(l10.b(h8.getLayoutDirection()));
        int i19 = -i18;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        int iO = D9.o.o(outlinedTextFieldMeasurePolicy.f12264c, i19 - iE2, -iE2);
        int i20 = -iE1;
        androidx.compose.ui.layout.Y y11 = yQ4;
        long jI = p013b0.b.i(jA, iO, i20);
        int size5 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                y10 = y11;
                d14 = null;
                break;
            }
            d14 = list.get(i21);
            int i22 = size5;
            y10 = y11;
            if (kotlin.jvm.internal.i.a(C1171q.a(d14), "Label")) {
                break;
            }
            i21++;
            y11 = y10;
            size5 = i22;
        }
        androidx.compose.ui.layout.D d21 = d14;
        final androidx.compose.ui.layout.Y yQ5 = d21 != null ? d21.Q(jI) : null;
        outlinedTextFieldMeasurePolicy.f12262a.invoke(new I.h(yQ5 != null ? Cb.a.b(yQ5.f14220b, yQ5.f14221c) : 0L));
        int size6 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                d15 = null;
                break;
            }
            d15 = list.get(i23);
            int i24 = size6;
            if (kotlin.jvm.internal.i.a(C1171q.a(d15), "Supporting")) {
                break;
            }
            i23++;
            size6 = i24;
        }
        androidx.compose.ui.layout.D d22 = d15;
        int iK0 = d22 != null ? d22.k0(p013b0.a.j(j)) : 0;
        int iMax5 = Math.max(TextFieldImplKt.g(yQ5) / 2, h10.e1(l10.d()));
        long jA2 = p013b0.a.a(p013b0.b.i(j, i19, (i20 - iMax5) - iK0), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i25 = 0;
        while (i25 < size7) {
            int i26 = size7;
            androidx.compose.ui.layout.D d23 = list.get(i25);
            int i27 = i25;
            if (kotlin.jvm.internal.i.a(C1171q.a(d23), "TextField")) {
                final androidx.compose.ui.layout.Y yQ6 = d23.Q(jA2);
                long jA3 = p013b0.a.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size8) {
                        d16 = null;
                        break;
                    }
                    d16 = list.get(i28);
                    int i29 = size8;
                    if (kotlin.jvm.internal.i.a(C1171q.a(d16), "Hint")) {
                        break;
                    }
                    i28++;
                    size8 = i29;
                }
                androidx.compose.ui.layout.D d24 = d16;
                androidx.compose.ui.layout.Y yQ7 = d24 != null ? d24.Q(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(TextFieldImplKt.g(yQ6), TextFieldImplKt.g(yQ7)) + iMax5 + iE1);
                final int iD = OutlinedTextFieldKt.d(TextFieldImplKt.i(yQ), TextFieldImplKt.i(yQ2), TextFieldImplKt.i(yQ3), TextFieldImplKt.i(y10), yQ6.f14220b, TextFieldImplKt.i(yQ5), TextFieldImplKt.i(yQ7), outlinedTextFieldMeasurePolicy.f12264c, j, h8.getDensity(), outlinedTextFieldMeasurePolicy.f12265d);
                androidx.compose.ui.layout.Y yQ8 = d22 != null ? d22.Q(p013b0.a.a(p013b0.b.j(0, -iMax6, 1, jA), 0, iD, 0, 0, 9)) : null;
                int iG = TextFieldImplKt.g(yQ8);
                final int iC = OutlinedTextFieldKt.c(TextFieldImplKt.g(yQ), TextFieldImplKt.g(yQ2), TextFieldImplKt.g(yQ3), TextFieldImplKt.g(y10), yQ6.f14221c, TextFieldImplKt.g(yQ5), TextFieldImplKt.g(yQ7), TextFieldImplKt.g(yQ8), outlinedTextFieldMeasurePolicy.f12264c, j, h8.getDensity(), outlinedTextFieldMeasurePolicy.f12265d);
                int i30 = iC - iG;
                int size9 = list.size();
                for (int i31 = 0; i31 < size9; i31++) {
                    androidx.compose.ui.layout.D d25 = list.get(i31);
                    if (kotlin.jvm.internal.i.a(C1171q.a(d25), "Container")) {
                        final androidx.compose.ui.layout.Y yQ9 = d25.Q(p013b0.b.a(iD != Integer.MAX_VALUE ? iD : 0, iD, i30 != Integer.MAX_VALUE ? i30 : 0, i30));
                        final androidx.compose.ui.layout.Y y12 = yQ;
                        final androidx.compose.ui.layout.Y y13 = yQ2;
                        final androidx.compose.ui.layout.Y y14 = y10;
                        final androidx.compose.ui.layout.Y y15 = yQ7;
                        final androidx.compose.ui.layout.Y y16 = yQ8;
                        return h8.y1(iD, iC, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                                int iF;
                                float fI;
                                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                                int i32 = iC;
                                int i33 = iD;
                                androidx.compose.ui.layout.Y y17 = y12;
                                androidx.compose.ui.layout.Y y18 = y13;
                                androidx.compose.ui.layout.Y y19 = yQ3;
                                androidx.compose.ui.layout.Y y20 = y14;
                                androidx.compose.ui.layout.Y y21 = yQ6;
                                androidx.compose.ui.layout.Y y22 = yQ5;
                                androidx.compose.ui.layout.Y y23 = y15;
                                androidx.compose.ui.layout.Y y24 = yQ9;
                                androidx.compose.ui.layout.Y y25 = y16;
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = this;
                                float f10 = outlinedTextFieldMeasurePolicy2.f12264c;
                                float density = h8.getDensity();
                                LayoutDirection layoutDirection = h8.getLayoutDirection();
                                androidx.compose.foundation.layout.L l11 = this.f12265d;
                                float f11 = OutlinedTextFieldKt.f12258a;
                                androidx.compose.ui.layout.Y.a.f(aVar2, y24, 0L);
                                int iG2 = i32 - TextFieldImplKt.g(y25);
                                int iB = Ka.a.b(l11.d() * density);
                                int iB2 = Ka.a.b(PaddingKt.d(l11, layoutDirection) * density);
                                float f12 = TextFieldImplKt.f12499c * density;
                                if (y17 != null) {
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y17, 0, C1293h.f(1, 0.0f, (iG2 - y17.f14221c) / 2.0f));
                                }
                                boolean z10 = outlinedTextFieldMeasurePolicy2.f12263b;
                                if (y22 != null) {
                                    if (z10) {
                                        iF = C1293h.f(1, 0.0f, (iG2 - y22.f14221c) / 2.0f);
                                    } else {
                                        iF = iB;
                                    }
                                    int iO2 = D9.o.o(f10, iF, -(y22.f14221c / 2));
                                    if (y17 == null) {
                                        fI = 0.0f;
                                    } else {
                                        fI = (1 - f10) * (TextFieldImplKt.i(y17) - f12);
                                    }
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y22, Ka.a.b(fI) + iB2, iO2);
                                }
                                if (y19 != null) {
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y19, TextFieldImplKt.i(y17), OutlinedTextFieldKt.f(z10, iG2, iB, y22, y19));
                                }
                                int i34 = TextFieldImplKt.i(y19) + TextFieldImplKt.i(y17);
                                androidx.compose.ui.layout.Y.a.g(aVar2, y21, i34, OutlinedTextFieldKt.f(z10, iG2, iB, y22, y21));
                                if (y23 != null) {
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y23, i34, OutlinedTextFieldKt.f(z10, iG2, iB, y22, y23));
                                }
                                if (y20 != null) {
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y20, (i33 - TextFieldImplKt.i(y18)) - y20.f14220b, OutlinedTextFieldKt.f(z10, iG2, iB, y22, y20));
                                }
                                if (y18 != null) {
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y18, i33 - y18.f14220b, C1293h.f(1, 0.0f, (iG2 - y18.f14221c) / 2.0f));
                                }
                                if (y25 != null) {
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y25, 0, iG2);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i25 = i27 + 1;
            size7 = i26;
            outlinedTextFieldMeasurePolicy = this;
            h10 = h10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.J(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.k0(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.I(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.s(num.intValue()));
            }
        });
    }
}
