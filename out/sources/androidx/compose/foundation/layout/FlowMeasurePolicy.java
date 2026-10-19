package androidx.compose.foundation.layout;

import androidx.collection.C0880h;
import androidx.collection.C0884l;
import androidx.compose.ui.layout.InterfaceC1166l;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlowMeasurePolicy implements InterfaceC0963x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0945e.InterfaceC0129e f10134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0945e.l f10135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r.e f10137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0962w f10141h;

    public FlowMeasurePolicy(C0945e.InterfaceC0129e interfaceC0129e, C0945e.l lVar, float f10, r.e eVar, float f11, int i10, int i11, C0962w c0962w) {
        this.f10134a = interfaceC0129e;
        this.f10135b = lVar;
        this.f10136c = f10;
        this.f10137d = eVar;
        this.f10138e = f11;
        this.f10139f = i10;
        this.f10140g = i11;
        this.f10141h = c0962w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        flowMeasurePolicy.getClass();
        return this.f10134a.equals(flowMeasurePolicy.f10134a) && this.f10135b.equals(flowMeasurePolicy.f10135b) && p013b0.f.a(this.f10136c, flowMeasurePolicy.f10136c) && this.f10137d.equals(flowMeasurePolicy.f10137d) && p013b0.f.a(this.f10138e, flowMeasurePolicy.f10138e) && this.f10139f == flowMeasurePolicy.f10139f && this.f10140g == flowMeasurePolicy.f10140g && kotlin.jvm.internal.i.a(this.f10141h, flowMeasurePolicy.f10141h);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0963x
    public final r f() {
        return this.f10137d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int g(List<? extends InterfaceC1166l> list, int i10, int i11, int i12, int i13, int i14, C0962w c0962w) {
        long jA;
        int i15 = 0;
        if (list.isEmpty()) {
            jA = C0880h.a(0, 0);
        } else {
            int i16 = BrazeLogger.SUPPRESS;
            C0961v c0961v = new C0961v(i13, c0962w, p013b0.b.a(0, i10, 0, BrazeLogger.SUPPRESS), i14, i11, i12);
            InterfaceC1166l interfaceC1166l = (InterfaceC1166l) kotlin.collections.q.Q(0, list);
            int iK0 = interfaceC1166l != null ? interfaceC1166l.k0(i10) : 0;
            int I10 = interfaceC1166l != null ? interfaceC1166l.I(iK0) : 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            if (c0961v.b(list.size() > 1, 0, C0880h.a(i10, BrazeLogger.SUPPRESS), interfaceC1166l == null ? null : new C0880h(C0880h.a(I10, iK0)), 0, 0, 0, false, false).f10336b) {
                C0880h c0880hA = c0962w.a(0, 0, interfaceC1166l != null);
                jA = C0880h.a(c0880hA != null ? (int) (c0880hA.f9182a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i20 = i10;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size) {
                    int i24 = i20 - I10;
                    int i25 = i21 + 1;
                    int iMax = Math.max(i19, iK0);
                    InterfaceC1166l interfaceC1166l2 = (InterfaceC1166l) kotlin.collections.q.Q(i25, list);
                    int iK1 = interfaceC1166l2 != null ? interfaceC1166l2.k0(i10) : i15;
                    int I11 = interfaceC1166l2 != null ? interfaceC1166l2.I(iK1) + i11 : i15;
                    int i26 = i21 + 2 < list.size() ? 1 : i15;
                    int i27 = i25 - i23;
                    long jA2 = C0880h.a(i24, i16);
                    C0880h c0880h = interfaceC1166l2 == null ? null : new C0880h(C0880h.a(I11, iK1));
                    int i28 = I11;
                    boolean z10 = i26;
                    int i29 = iK1;
                    C0961v.b bVarB = c0961v.b(z10, i27, jA2, c0880h, i17, i18, iMax, false, false);
                    if (bVarB.f10335a) {
                        int i30 = iMax + i12 + i18;
                        C0961v.a aVarA = c0961v.a(bVarB, interfaceC1166l2 != null, i17, i30, i24, i27);
                        int i31 = i28 - i11;
                        i17++;
                        if (bVarB.f10336b) {
                            if (aVarA != null && !aVarA.f10334d) {
                                i30 += ((int) (aVarA.f10333c & 4294967295L)) + i12;
                            }
                            i18 = i30;
                            i22 = i25;
                            break;
                        }
                        i18 = i30;
                        I10 = i31;
                        i23 = i25;
                        i19 = 0;
                        i20 = i10;
                    } else {
                        i19 = iMax;
                        i20 = i24;
                        I10 = i28;
                    }
                    iK0 = i29;
                    i21 = i25;
                    i22 = i21;
                    i15 = 0;
                    i16 = BrazeLogger.SUPPRESS;
                }
                jA = C0880h.a(i18 - i12, i22);
            }
        }
        return (int) (jA >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.layout.F h(androidx.compose.ui.layout.H h8, List<? extends List<? extends androidx.compose.ui.layout.D>> list, long j) {
        C.e eVar;
        FlowMeasurePolicy flowMeasurePolicy;
        C0880h c0880h;
        int i10;
        androidx.collection.B b10;
        int i11;
        C0962w c0962w;
        androidx.compose.ui.layout.D d10;
        T t8;
        long j10;
        FlowMeasurePolicy flowMeasurePolicy2;
        C0880h c0880h2;
        C0880h c0880h3;
        androidx.collection.A a10;
        androidx.collection.A a11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f10140g != 0 && this.f10139f != 0 && !((ArrayList) list).isEmpty()) {
            int iG = p013b0.a.g(j);
            final C0962w c0962w2 = this.f10141h;
            if (iG != 0 || c0962w2.f10337a == FlowLayoutOverflow.OverflowType.f10129b) {
                List list2 = (List) kotlin.collections.q.O(list);
                if (list2.isEmpty()) {
                    return h8.y1(0, 0, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$2
                        @Override // Ia.l
                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                            return p293xa.r.f47939a;
                        }
                    });
                }
                List list3 = (List) kotlin.collections.q.Q(1, list);
                androidx.compose.ui.layout.D d11 = list3 != null ? (androidx.compose.ui.layout.D) kotlin.collections.q.P(list3) : null;
                List list4 = (List) kotlin.collections.q.Q(2, list);
                androidx.compose.ui.layout.D d12 = list4 != null ? (androidx.compose.ui.layout.D) kotlin.collections.q.P(list4) : null;
                list2.size();
                c0962w2.getClass();
                LayoutOrientation layoutOrientation = LayoutOrientation.f10163b;
                long jC = K.c(K.b(10, K.a(j, layoutOrientation)), layoutOrientation);
                if (d11 != null) {
                    FlowLayoutKt.c(d11, this, jC, new Ia.l<androidx.compose.ui.layout.Y, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.layout.Y y10) {
                            int iC;
                            int iE;
                            androidx.compose.ui.layout.Y y11 = y10;
                            if (y11 != null) {
                                InterfaceC0963x interfaceC0963x = this;
                                iC = interfaceC0963x.c(y11);
                                iE = interfaceC0963x.e(y11);
                            } else {
                                iC = 0;
                                iE = 0;
                            }
                            c0962w2.f10344h = new C0880h(C0880h.a(iC, iE));
                            c0962w2.f10341e = y11;
                            return p293xa.r.f47939a;
                        }
                    });
                    c0962w2.f10340d = d11;
                }
                if (d12 != null) {
                    FlowLayoutKt.c(d12, this, jC, new Ia.l<androidx.compose.ui.layout.Y, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.layout.Y y10) {
                            int iC;
                            int iE;
                            androidx.compose.ui.layout.Y y11 = y10;
                            if (y11 != null) {
                                InterfaceC0963x interfaceC0963x = this;
                                iC = interfaceC0963x.c(y11);
                                iE = interfaceC0963x.e(y11);
                            } else {
                                iC = 0;
                                iE = 0;
                            }
                            c0962w2.f10345i = new C0880h(C0880h.a(iC, iE));
                            c0962w2.f10343g = y11;
                            return p293xa.r.f47939a;
                        }
                    });
                    c0962w2.f10342f = d12;
                }
                Iterator it = list2.iterator();
                long jA = K.a(j, layoutOrientation);
                int i17 = FlowLayoutKt.f10123a;
                androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.layout.F[16]);
                int iH = p013b0.a.h(jA);
                int iJ = p013b0.a.j(jA);
                int iG2 = p013b0.a.g(jA);
                androidx.collection.B b11 = C0884l.f9191a;
                androidx.collection.B b12 = new androidx.collection.B();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(h8.T0(this.f10136c));
                int iCeil2 = (int) Math.ceil(h8.T0(this.f10138e));
                long jA2 = p013b0.b.a(0, iH, 0, iG2);
                long jC2 = K.c(K.b(14, jA2), layoutOrientation);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (it instanceof C0957q) {
                    h8.u(iH);
                    h8.u(iG2);
                    eVar = new C.e();
                } else {
                    eVar = null;
                }
                androidx.compose.ui.layout.D d13 = !it.hasNext() ? null : FlowLayoutKt.d(it, eVar);
                if (d13 != null) {
                    flowMeasurePolicy = this;
                    c0880h = new C0880h(FlowLayoutKt.c(d13, flowMeasurePolicy, jC2, new Ia.l<androidx.compose.ui.layout.Y, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.layout.Y] */
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.layout.Y y10) {
                            ref$ObjectRef.element = y10;
                            return p293xa.r.f47939a;
                        }
                    }));
                } else {
                    flowMeasurePolicy = this;
                    c0880h = null;
                }
                long j11 = jC2;
                Integer numValueOf = c0880h != null ? Integer.valueOf((int) (c0880h.f9182a >> 32)) : null;
                Integer numValueOf2 = c0880h != null ? Integer.valueOf((int) (c0880h.f9182a & 4294967295L)) : null;
                androidx.collection.A a12 = new androidx.collection.A();
                androidx.collection.A a13 = new androidx.collection.A();
                androidx.compose.ui.layout.D d14 = d13;
                int i18 = flowMeasurePolicy.f10140g;
                Integer num = numValueOf;
                int i19 = flowMeasurePolicy.f10139f;
                Integer num2 = numValueOf2;
                C0962w c0962w3 = flowMeasurePolicy.f10141h;
                C0961v c0961v = new C0961v(i19, c0962w3, jA, i18, iCeil, iCeil2);
                C0961v.b bVarB = c0961v.b(it.hasNext(), 0, C0880h.a(iH, iG2), c0880h, 0, 0, 0, false, false);
                androidx.collection.A a14 = a12;
                C0961v.a aVarA = bVarB.f10336b ? c0961v.a(bVarB, c0880h != null, -1, 0, iH, 0) : null;
                int i20 = iJ;
                int i21 = iH;
                int i22 = i21;
                int i23 = iG2;
                C0961v.a aVar = aVarA;
                androidx.compose.ui.layout.D d15 = d14;
                int iMax = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                androidx.collection.A a15 = a13;
                int i28 = 0;
                while (!bVarB.f10336b && d15 != null) {
                    kotlin.jvm.internal.i.b(num);
                    int iIntValue = num.intValue();
                    kotlin.jvm.internal.i.b(num2);
                    int i29 = i20;
                    int i30 = i24 + iIntValue;
                    iMax = Math.max(iMax, num2.intValue());
                    int i31 = i21 - iIntValue;
                    int i32 = i28 + 1;
                    c0962w3.getClass();
                    arrayList.add(d15);
                    b12.h(i28, ref$ObjectRef.element);
                    int i33 = i32 - i25;
                    boolean z10 = i33 < i19;
                    if (eVar != null) {
                        if (z10) {
                            i15 = i31 - iCeil;
                            c0962w = c0962w3;
                            if (i15 < 0) {
                                i15 = 0;
                            }
                        } else {
                            c0962w = c0962w3;
                            i15 = i22;
                        }
                        h8.u(i15);
                        if (z10) {
                            i16 = i23;
                        } else {
                            i16 = (i23 - iMax) - iCeil2;
                            if (i16 < 0) {
                                i16 = 0;
                            }
                        }
                        h8.u(i16);
                    } else {
                        c0962w = c0962w3;
                    }
                    if (it.hasNext()) {
                        d10 = FlowLayoutKt.d(it, eVar);
                        t8 = 0;
                    } else {
                        t8 = 0;
                        d10 = null;
                    }
                    ref$ObjectRef.element = t8;
                    if (d10 != null) {
                        flowMeasurePolicy2 = this;
                        long j12 = j11;
                        j10 = j12;
                        c0880h2 = new C0880h(FlowLayoutKt.c(d10, flowMeasurePolicy2, j12, new Ia.l<androidx.compose.ui.layout.Y, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.layout.Y] */
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.layout.Y y10) {
                                ref$ObjectRef.element = y10;
                                return p293xa.r.f47939a;
                            }
                        }));
                    } else {
                        j10 = j11;
                        flowMeasurePolicy2 = this;
                        c0880h2 = null;
                    }
                    Integer numValueOf3 = c0880h2 != null ? Integer.valueOf(((int) (c0880h2.f9182a >> 32)) + iCeil) : null;
                    i28 = i32;
                    Integer numValueOf4 = c0880h2 != null ? Integer.valueOf((int) (c0880h2.f9182a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jA3 = C0880h.a(i31, i23);
                    if (c0880h2 == null) {
                        c0880h3 = null;
                    } else {
                        kotlin.jvm.internal.i.b(numValueOf3);
                        int iIntValue2 = numValueOf3.intValue();
                        kotlin.jvm.internal.i.b(numValueOf4);
                        c0880h3 = new C0880h(C0880h.a(iIntValue2, numValueOf4.intValue()));
                    }
                    C0961v.b bVarB2 = c0961v.b(zHasNext, i33, jA3, c0880h3, i27, i26, iMax, false, false);
                    if (bVarB2.f10335a) {
                        int iMax2 = Math.max(i29, i30);
                        i12 = i22;
                        int iMin = Math.min(iMax2, i12);
                        int i34 = i26 + iMax;
                        C0961v.a aVarA2 = c0961v.a(bVarB2, c0880h2 != null, i27, i34, i31, i33);
                        a11 = a15;
                        a11.c(iMax);
                        int i35 = (iG2 - i34) - iCeil2;
                        a10 = a14;
                        a10.c(i28);
                        numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - iCeil) : null;
                        i27++;
                        i26 = i34 + iCeil2;
                        aVar = aVarA2;
                        i14 = i12;
                        i25 = i28;
                        i24 = 0;
                        i13 = iMin;
                        i23 = i35;
                        iMax = 0;
                    } else {
                        a10 = a14;
                        a11 = a15;
                        i12 = i22;
                        i13 = i29;
                        i23 = i23;
                        i24 = r16;
                        i14 = i31;
                    }
                    a14 = a10;
                    i22 = i12;
                    flowMeasurePolicy = flowMeasurePolicy2;
                    i21 = i14;
                    a15 = a11;
                    d15 = d10;
                    b12 = b12;
                    c0962w3 = c0962w;
                    eVar = eVar;
                    ref$ObjectRef = ref$ObjectRef;
                    i20 = i13;
                    num2 = numValueOf4;
                    num = numValueOf3;
                    iCeil2 = iCeil2;
                    i19 = i19;
                    j11 = j10;
                    bVarB = bVarB2;
                    it = it;
                }
                androidx.collection.B b13 = b12;
                FlowMeasurePolicy flowMeasurePolicy3 = flowMeasurePolicy;
                int i36 = i20;
                androidx.collection.A a16 = a14;
                androidx.collection.A a17 = a15;
                C0961v.a aVar2 = aVar;
                if (aVar2 != null) {
                    arrayList.add(aVar2.f10331a);
                    b10 = b13;
                    b10.h(arrayList.size() - 1, aVar2.f10332b);
                    int i37 = a16.f9184b - 1;
                    boolean z11 = aVar2.f10334d;
                    long j13 = aVar2.f10333c;
                    if (z11) {
                        a17.f(i37, Math.max(a17.a(i37), (int) (j13 & 4294967295L)));
                        i10 = 1;
                        a16.f(i37, a16.b() + 1);
                    } else {
                        i10 = 1;
                        a17.c((int) (j13 & 4294967295L));
                        a16.c(a16.b() + 1);
                    }
                } else {
                    i10 = 1;
                    b10 = b13;
                }
                int size = arrayList.size();
                Object[] objArr = new androidx.compose.ui.layout.Y[size];
                for (int i38 = 0; i38 < size; i38 += i10) {
                    objArr[i38] = b10.b(i38);
                }
                int i39 = a16.f9184b;
                int[] iArr = new int[i39];
                int[] iArr2 = new int[i39];
                int[] iArr3 = a16.f9183a;
                int iMax3 = i36;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                while (i40 < i39) {
                    int i43 = iArr3[i40];
                    int i44 = i40;
                    int[] iArr4 = iArr2;
                    Object[] objArr2 = objArr;
                    androidx.compose.runtime.collection.c cVar2 = cVar;
                    androidx.compose.ui.layout.F fO = C1787c0.o(this, iMax3, p013b0.a.i(jA2), p013b0.a.h(jA2), a17.a(i40), iCeil, h8, arrayList, objArr, i41, i43, iArr, i44);
                    int width = fO.getWidth();
                    int height = fO.getHeight();
                    iArr4[i44] = height;
                    i42 += height;
                    iMax3 = Math.max(iMax3, width);
                    cVar2.b(fO);
                    i40 = i44 + 1;
                    flowMeasurePolicy3 = this;
                    cVar = cVar2;
                    iArr2 = iArr4;
                    arrayList = arrayList;
                    i41 = i43;
                    i39 = i39;
                    iArr3 = iArr3;
                    iCeil = iCeil;
                    objArr = objArr2;
                    a17 = a17;
                    iArr = iArr;
                    jA2 = jA2;
                }
                final androidx.compose.runtime.collection.c cVar3 = cVar;
                int i45 = iMax3;
                int[] iArr5 = iArr2;
                int[] iArr6 = iArr;
                if (cVar3.f12945d == 0) {
                    i11 = 0;
                    i42 = 0;
                } else {
                    i11 = i45;
                }
                C0945e.l lVar = this.f10135b;
                int iE1 = ((cVar3.f12945d - 1) * h8.e1(lVar.mo1getSpacingD9Ej5fM())) + i42;
                int i46 = p013b0.a.i(jA);
                int iG3 = p013b0.a.g(jA);
                if (iE1 < i46) {
                    iE1 = i46;
                }
                if (iE1 <= iG3) {
                    iG3 = iE1;
                }
                lVar.arrange(h8, iG3, iArr5, iArr6);
                int iJ2 = p013b0.a.j(jA);
                int iH2 = p013b0.a.h(jA);
                if (i11 < iJ2) {
                    i11 = iJ2;
                }
                if (i11 <= iH2) {
                    iH2 = i11;
                }
                return h8.y1(iH2, iG3, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar3) {
                        androidx.compose.runtime.collection.c<androidx.compose.ui.layout.F> cVar4 = cVar3;
                        androidx.compose.ui.layout.F[] fArr = cVar4.f12943b;
                        int i47 = cVar4.f12945d;
                        for (int i48 = 0; i48 < i47; i48++) {
                            fArr[i48].p();
                        }
                        return p293xa.r.f47939a;
                    }
                });
            }
        }
        return h8.y1(0, 0, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar3) {
                return p293xa.r.f47939a;
            }
        });
    }

    public final int hashCode() {
        return this.f10141h.hashCode() + p005a4.q.b(this.f10140g, p005a4.q.b(this.f10139f, O.a.d(this.f10138e, (this.f10137d.f10318b.hashCode() + O.a.d(this.f10136c, (this.f10135b.hashCode() + ((this.f10134a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0963x
    public final C0945e.InterfaceC0129e k() {
        return this.f10134a;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0963x
    public final C0945e.l l() {
        return this.f10135b;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0963x
    public final boolean n() {
        return true;
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f10134a + ", verticalArrangement=" + this.f10135b + ", mainAxisSpacing=" + ((Object) p013b0.f.b(this.f10136c)) + ", crossAxisAlignment=" + this.f10137d + ", crossAxisArrangementSpacing=" + ((Object) p013b0.f.b(this.f10138e)) + ", maxItemsInMainAxis=" + this.f10139f + ", maxLines=" + this.f10140g + ", overflow=" + this.f10141h + ')';
    }
}
