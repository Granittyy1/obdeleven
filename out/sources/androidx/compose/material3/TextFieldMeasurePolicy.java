package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.core.view.C1293h;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f12378c;

    public TextFieldMeasurePolicy(boolean z10, float f10, androidx.compose.foundation.layout.L l10) {
        this.f12376a = z10;
        this.f12377b = f10;
        this.f12378c = l10;
    }

    public static int b(List list, int i10, Ia.p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj7), "TextField")) {
                int iIntValue = ((Number) pVar.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj2), "Label")) {
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
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj3), "Trailing")) {
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
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj4), "Prefix")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC1166l interfaceC1166l3 = (InterfaceC1166l) obj4;
                int iIntValue4 = interfaceC1166l3 != null ? ((Number) pVar.invoke(interfaceC1166l3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj5), "Suffix")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC1166l interfaceC1166l4 = (InterfaceC1166l) obj5;
                int iIntValue5 = interfaceC1166l4 != null ? ((Number) pVar.invoke(interfaceC1166l4, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj6), "Leading")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC1166l interfaceC1166l5 = (InterfaceC1166l) obj6;
                int iIntValue6 = interfaceC1166l5 != null ? ((Number) pVar.invoke(interfaceC1166l5, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    Object obj8 = list.get(i17);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f((InterfaceC1166l) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC1166l interfaceC1166l6 = (InterfaceC1166l) obj;
                int iIntValue7 = interfaceC1166l6 != null ? ((Number) pVar.invoke(interfaceC1166l6, Integer.valueOf(i10))).intValue() : 0;
                long j = TextFieldImplKt.f12497a;
                float f10 = TextFieldKt.f12375a;
                int i18 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i18, Math.max(iIntValue7 + i18, iIntValue2)) + iIntValue6 + iIntValue3, p013b0.a.j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int a(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10, Ia.p<? super InterfaceC1166l, ? super Integer, Integer> pVar) {
        InterfaceC1166l interfaceC1166l;
        int i11;
        int iIntValue;
        InterfaceC1166l interfaceC1166l2;
        int iIntValue2;
        InterfaceC1166l interfaceC1166l3;
        InterfaceC1166l interfaceC1166l4;
        int i12;
        InterfaceC1166l interfaceC1166l5;
        int i13;
        InterfaceC1166l interfaceC1166l6;
        InterfaceC1166l interfaceC1166l7;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                interfaceC1166l = null;
                break;
            }
            interfaceC1166l = list.get(i14);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l), "Leading")) {
                break;
            }
            i14++;
        }
        InterfaceC1166l interfaceC1166l8 = interfaceC1166l;
        if (interfaceC1166l8 != null) {
            int iJ = interfaceC1166l8.J(BrazeLogger.SUPPRESS);
            float f10 = TextFieldKt.f12375a;
            i11 = i10 == Integer.MAX_VALUE ? i10 : i10 - iJ;
            iIntValue = pVar.invoke(interfaceC1166l8, Integer.valueOf(i10)).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                interfaceC1166l2 = null;
                break;
            }
            interfaceC1166l2 = list.get(i15);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l2), "Trailing")) {
                break;
            }
            i15++;
        }
        InterfaceC1166l interfaceC1166l9 = interfaceC1166l2;
        if (interfaceC1166l9 != null) {
            int iJ2 = interfaceC1166l9.J(BrazeLogger.SUPPRESS);
            float f11 = TextFieldKt.f12375a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ2;
            }
            iIntValue2 = pVar.invoke(interfaceC1166l9, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                interfaceC1166l3 = null;
                break;
            }
            interfaceC1166l3 = list.get(i16);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l3), "Label")) {
                break;
            }
            i16++;
        }
        InterfaceC1166l interfaceC1166l10 = interfaceC1166l3;
        int iIntValue3 = interfaceC1166l10 != null ? pVar.invoke(interfaceC1166l10, Integer.valueOf(i11)).intValue() : 0;
        int size4 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                interfaceC1166l4 = null;
                break;
            }
            interfaceC1166l4 = list.get(i17);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l4), "Prefix")) {
                break;
            }
            i17++;
        }
        InterfaceC1166l interfaceC1166l11 = interfaceC1166l4;
        if (interfaceC1166l11 != null) {
            int iIntValue4 = pVar.invoke(interfaceC1166l11, Integer.valueOf(i11)).intValue();
            int iJ3 = interfaceC1166l11.J(BrazeLogger.SUPPRESS);
            float f12 = TextFieldKt.f12375a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ3;
            }
            i12 = iIntValue4;
        } else {
            i12 = 0;
        }
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                interfaceC1166l5 = null;
                break;
            }
            interfaceC1166l5 = list.get(i18);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l5), "Suffix")) {
                break;
            }
            i18++;
        }
        InterfaceC1166l interfaceC1166l12 = interfaceC1166l5;
        if (interfaceC1166l12 != null) {
            int iIntValue5 = pVar.invoke(interfaceC1166l12, Integer.valueOf(i11)).intValue();
            int iJ4 = interfaceC1166l12.J(BrazeLogger.SUPPRESS);
            float f13 = TextFieldKt.f12375a;
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iJ4;
            }
            i13 = iIntValue5;
        } else {
            i13 = 0;
        }
        int size6 = list.size();
        for (int i19 = 0; i19 < size6; i19++) {
            InterfaceC1166l interfaceC1166l13 = list.get(i19);
            if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l13), "TextField")) {
                int iIntValue6 = pVar.invoke(interfaceC1166l13, Integer.valueOf(i11)).intValue();
                int size7 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size7) {
                        interfaceC1166l6 = null;
                        break;
                    }
                    interfaceC1166l6 = list.get(i20);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l6), "Hint")) {
                        break;
                    }
                    i20++;
                }
                InterfaceC1166l interfaceC1166l14 = interfaceC1166l6;
                int iIntValue7 = interfaceC1166l14 != null ? pVar.invoke(interfaceC1166l14, Integer.valueOf(i11)).intValue() : 0;
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        interfaceC1166l7 = null;
                        break;
                    }
                    InterfaceC1166l interfaceC1166l15 = list.get(i21);
                    if (kotlin.jvm.internal.i.a(TextFieldImplKt.f(interfaceC1166l15), "Supporting")) {
                        interfaceC1166l7 = interfaceC1166l15;
                        break;
                    }
                    i21++;
                }
                InterfaceC1166l interfaceC1166l16 = interfaceC1166l7;
                return TextFieldKt.c(iIntValue6, iIntValue3, iIntValue, iIntValue2, i12, i13, iIntValue7, interfaceC1166l16 != null ? pVar.invoke(interfaceC1166l16, Integer.valueOf(i10)).intValue() : 0, this.f12377b, TextFieldImplKt.f12497a, interfaceC1167m.getDensity(), this.f12378c);
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
        androidx.compose.ui.layout.D d14;
        androidx.compose.ui.layout.D d15;
        androidx.compose.ui.layout.D d16;
        List<? extends androidx.compose.ui.layout.D> list2 = list;
        androidx.compose.foundation.layout.L l10 = this.f12378c;
        final int iE1 = h8.e1(l10.d());
        int iE2 = h8.e1(l10.a());
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
            d11 = list2.get(i12);
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
            d12 = list2.get(i14);
            if (kotlin.jvm.internal.i.a(C1171q.a(d12), "Prefix")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.D d19 = d12;
        androidx.compose.ui.layout.Y yQ3 = d19 != null ? d19.Q(p013b0.b.j(-i13, 0, 2, jA)) : null;
        int i15 = TextFieldImplKt.i(yQ3) + i13;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.g(yQ3));
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                d13 = null;
                break;
            }
            androidx.compose.ui.layout.D d20 = list2.get(i16);
            if (kotlin.jvm.internal.i.a(C1171q.a(d20), "Suffix")) {
                d13 = d20;
                break;
            }
            i16++;
        }
        androidx.compose.ui.layout.D d21 = d13;
        androidx.compose.ui.layout.Y yQ4 = d21 != null ? d21.Q(p013b0.b.j(-i15, 0, 2, jA)) : null;
        int i17 = TextFieldImplKt.i(yQ4) + i15;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.g(yQ4));
        int i18 = -iE2;
        int i19 = -i17;
        long jI = p013b0.b.i(jA, i19, i18);
        int size5 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size5) {
                d14 = null;
                break;
            }
            androidx.compose.ui.layout.D d22 = list2.get(i20);
            int i21 = size5;
            d14 = d22;
            if (kotlin.jvm.internal.i.a(C1171q.a(d22), "Label")) {
                break;
            }
            i20++;
            size5 = i21;
        }
        androidx.compose.ui.layout.D d23 = d14;
        androidx.compose.ui.layout.Y yQ5 = d23 != null ? d23.Q(jI) : null;
        int size6 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size6) {
                d15 = null;
                break;
            }
            d15 = list2.get(i22);
            int i23 = size6;
            if (kotlin.jvm.internal.i.a(C1171q.a(d15), "Supporting")) {
                break;
            }
            i22++;
            size6 = i23;
        }
        androidx.compose.ui.layout.D d24 = d15;
        int iK0 = d24 != null ? d24.k0(p013b0.a.j(j)) : 0;
        int iG = TextFieldImplKt.g(yQ5) + iE1;
        long jI2 = p013b0.b.i(p013b0.a.a(j, 0, 0, 0, 0, 11), i19, ((-iG) - iE2) - iK0);
        int size7 = list.size();
        int i24 = 0;
        while (i24 < size7) {
            int i25 = size7;
            androidx.compose.ui.layout.D d25 = list2.get(i24);
            int i26 = i24;
            if (kotlin.jvm.internal.i.a(C1171q.a(d25), "TextField")) {
                final androidx.compose.ui.layout.Y yQ6 = d25.Q(jI2);
                long jA2 = p013b0.a.a(jI2, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size8) {
                        d16 = null;
                        break;
                    }
                    d16 = list2.get(i27);
                    int i28 = size8;
                    if (kotlin.jvm.internal.i.a(C1171q.a(d16), "Hint")) {
                        break;
                    }
                    i27++;
                    list2 = list;
                    size8 = i28;
                }
                androidx.compose.ui.layout.D d26 = d16;
                androidx.compose.ui.layout.Y yQ7 = d26 != null ? d26.Q(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(TextFieldImplKt.g(yQ6), TextFieldImplKt.g(yQ7)) + iG + iE2);
                int i29 = TextFieldImplKt.i(yQ);
                int i30 = TextFieldImplKt.i(yQ2);
                int i31 = TextFieldImplKt.i(yQ3);
                int i32 = TextFieldImplKt.i(yQ4);
                int i33 = yQ6.f14220b;
                int i34 = TextFieldImplKt.i(yQ5);
                int i35 = TextFieldImplKt.i(yQ7);
                float f10 = TextFieldKt.f12375a;
                int i36 = i31 + i32;
                final int iMax6 = Math.max(Math.max(i33 + i36, Math.max(i35 + i36, i34)) + i29 + i30, p013b0.a.j(j));
                androidx.compose.ui.layout.Y yQ8 = d24 != null ? d24.Q(p013b0.a.a(p013b0.b.j(0, -iMax5, 1, jA), 0, iMax6, 0, 0, 9)) : null;
                int iG2 = TextFieldImplKt.g(yQ8);
                final int iC = TextFieldKt.c(yQ6.f14221c, TextFieldImplKt.g(yQ5), TextFieldImplKt.g(yQ), TextFieldImplKt.g(yQ2), TextFieldImplKt.g(yQ3), TextFieldImplKt.g(yQ4), TextFieldImplKt.g(yQ7), TextFieldImplKt.g(yQ8), this.f12377b, j, h8.getDensity(), this.f12378c);
                int i37 = iC - iG2;
                int size9 = list.size();
                int i38 = 0;
                while (i38 < size9) {
                    androidx.compose.ui.layout.D d27 = list.get(i38);
                    int i39 = size9;
                    if (kotlin.jvm.internal.i.a(C1171q.a(d27), "Container")) {
                        final androidx.compose.ui.layout.Y yQ9 = d27.Q(p013b0.b.a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i37 != Integer.MAX_VALUE ? i37 : 0, i37));
                        final androidx.compose.ui.layout.Y y10 = yQ5;
                        final androidx.compose.ui.layout.Y y11 = yQ7;
                        final androidx.compose.ui.layout.Y y12 = yQ;
                        final androidx.compose.ui.layout.Y y13 = yQ2;
                        final androidx.compose.ui.layout.Y y14 = yQ3;
                        final androidx.compose.ui.layout.Y y15 = yQ4;
                        final androidx.compose.ui.layout.Y y16 = yQ8;
                        return h8.y1(iMax6, iC, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                                int iB;
                                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                                androidx.compose.ui.layout.Y y17 = y10;
                                if (y17 != null) {
                                    int i40 = iMax6;
                                    int i41 = iC;
                                    androidx.compose.ui.layout.Y y18 = yQ6;
                                    androidx.compose.ui.layout.Y y19 = y11;
                                    androidx.compose.ui.layout.Y y20 = y12;
                                    androidx.compose.ui.layout.Y y21 = y13;
                                    androidx.compose.ui.layout.Y y22 = y14;
                                    androidx.compose.ui.layout.Y y23 = y15;
                                    androidx.compose.ui.layout.Y y24 = yQ9;
                                    androidx.compose.ui.layout.Y y25 = y16;
                                    TextFieldMeasurePolicy textFieldMeasurePolicy = this;
                                    boolean z10 = textFieldMeasurePolicy.f12376a;
                                    int i42 = iE1;
                                    int i43 = y17.f14221c + i42;
                                    float density = h8.getDensity();
                                    float f11 = TextFieldKt.f12375a;
                                    androidx.compose.ui.layout.Y.a.f(aVar2, y24, 0L);
                                    int iG3 = i41 - TextFieldImplKt.g(y25);
                                    if (y20 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y20, 0, C1293h.f(1, 0.0f, (iG3 - y20.f14221c) / 2.0f));
                                    }
                                    if (z10) {
                                        iB = C1293h.f(1, 0.0f, (iG3 - y17.f14221c) / 2.0f);
                                    } else {
                                        iB = Ka.a.b(TextFieldImplKt.f12498b * density);
                                    }
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y17, TextFieldImplKt.i(y20), iB - Ka.a.b((iB - i42) * textFieldMeasurePolicy.f12377b));
                                    if (y22 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y22, TextFieldImplKt.i(y20), i43);
                                    }
                                    int i44 = TextFieldImplKt.i(y22) + TextFieldImplKt.i(y20);
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y18, i44, i43);
                                    if (y19 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y19, i44, i43);
                                    }
                                    if (y23 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y23, (i40 - TextFieldImplKt.i(y21)) - y23.f14220b, i43);
                                    }
                                    if (y21 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y21, i40 - y21.f14220b, C1293h.f(1, 0.0f, (iG3 - y21.f14221c) / 2.0f));
                                    }
                                    if (y25 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y25, 0, iG3);
                                    }
                                } else {
                                    int i45 = iMax6;
                                    int i46 = iC;
                                    androidx.compose.ui.layout.Y y26 = yQ6;
                                    androidx.compose.ui.layout.Y y27 = y11;
                                    androidx.compose.ui.layout.Y y28 = y12;
                                    androidx.compose.ui.layout.Y y29 = y13;
                                    androidx.compose.ui.layout.Y y30 = y14;
                                    androidx.compose.ui.layout.Y y31 = y15;
                                    androidx.compose.ui.layout.Y y32 = yQ9;
                                    androidx.compose.ui.layout.Y y33 = y16;
                                    boolean z11 = this.f12376a;
                                    float density2 = h8.getDensity();
                                    androidx.compose.foundation.layout.L l11 = this.f12378c;
                                    float f12 = TextFieldKt.f12375a;
                                    androidx.compose.ui.layout.Y.a.f(aVar2, y32, 0L);
                                    int iG4 = i46 - TextFieldImplKt.g(y33);
                                    int iB2 = Ka.a.b(l11.d() * density2);
                                    if (y28 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y28, 0, C1293h.f(1, 0.0f, (iG4 - y28.f14221c) / 2.0f));
                                    }
                                    if (y30 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y30, TextFieldImplKt.i(y28), TextFieldKt.d(z11, iG4, iB2, y30));
                                    }
                                    int i47 = TextFieldImplKt.i(y30) + TextFieldImplKt.i(y28);
                                    androidx.compose.ui.layout.Y.a.g(aVar2, y26, i47, TextFieldKt.d(z11, iG4, iB2, y26));
                                    if (y27 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y27, i47, TextFieldKt.d(z11, iG4, iB2, y27));
                                    }
                                    if (y31 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y31, (i45 - TextFieldImplKt.i(y29)) - y31.f14220b, TextFieldKt.d(z11, iG4, iB2, y31));
                                    }
                                    if (y29 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y29, i45 - y29.f14220b, C1293h.f(1, 0.0f, (iG4 - y29.f14221c) / 2.0f));
                                    }
                                    if (y33 != null) {
                                        androidx.compose.ui.layout.Y.a.g(aVar2, y33, 0, iG4);
                                    }
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    i38++;
                    size9 = i39;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i24 = i26 + 1;
            size7 = i25;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.J(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.k0(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return b(list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.I(num.intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        return a(interfaceC1167m, list, i10, new Ia.p<InterfaceC1166l, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // Ia.p
            public final Integer invoke(InterfaceC1166l interfaceC1166l, Integer num) {
                return Integer.valueOf(interfaceC1166l.s(num.intValue()));
            }
        });
    }
}
