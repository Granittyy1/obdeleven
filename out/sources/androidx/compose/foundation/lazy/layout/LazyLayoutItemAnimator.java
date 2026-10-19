package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0987w f10627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10628c;
    public a j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> f10626a = androidx.collection.U.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.collection.L<Object> f10629d = androidx.collection.V.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10630e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f10631f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10632g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10633h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f10634i = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.h f10635k = new DisplayingDisappearingItemsElement(this);

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    public static final class DisplayingDisappearingItemsElement extends androidx.compose.ui.node.H<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LazyLayoutItemAnimator<?> f10636b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f10636b = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.H
        public final androidx.compose.ui.h.c a() {
            a aVar = new a();
            aVar.f10645p = this.f10636b;
            return aVar;
        }

        @Override // androidx.compose.ui.node.H
        public final void e(androidx.compose.ui.h.c cVar) {
            a aVar = (a) cVar;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = aVar.f10645p;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator2 = this.f10636b;
            if (kotlin.jvm.internal.i.a(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !aVar.f13985b.f13997o) {
                return;
            }
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator3 = aVar.f10645p;
            lazyLayoutItemAnimator3.e();
            lazyLayoutItemAnimator3.f10627b = null;
            lazyLayoutItemAnimator3.f10628c = -1;
            lazyLayoutItemAnimator2.j = aVar;
            aVar.f10645p = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && kotlin.jvm.internal.i.a(this.f10636b, ((DisplayingDisappearingItemsElement) obj).f10636b);
        }

        public final int hashCode() {
            return this.f10636b.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f10636b + ')';
        }
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    public final class ItemInfo {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p013b0.a f10638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10640d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10643g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LazyLayoutItemAnimation[] f10637a = C0982q.f10730a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10641e = 1;

        public ItemInfo() {
        }

        public static void b(ItemInfo itemInfo, z zVar, kotlinx.coroutines.A a10, androidx.compose.ui.graphics.S s10, int i10, int i11) {
            LazyLayoutItemAnimator.this.getClass();
            long jN = zVar.n(0);
            itemInfo.a(zVar, a10, s10, i10, i11, (int) (!zVar.l() ? jN & 4294967295L : jN >> 32));
        }

        public final void a(T t8, kotlinx.coroutines.A a10, androidx.compose.ui.graphics.S s10, int i10, int i11, int i12) {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = this.f10637a;
            int length = lazyLayoutItemAnimationArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    this.f10642f = i10;
                    this.f10643g = i11;
                    break;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i13];
                    if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.f10615f) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            int length2 = this.f10637a.length;
            for (int iB = t8.b(); iB < length2; iB++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.f10637a[iB];
                if (lazyLayoutItemAnimation2 != null) {
                    lazyLayoutItemAnimation2.d();
                }
            }
            if (this.f10637a.length != t8.b()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f10637a, t8.b());
                kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
                this.f10637a = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.f10638b = new p013b0.a(t8.c());
            this.f10639c = i12;
            this.f10640d = t8.d();
            this.f10641e = t8.i();
            int iB2 = t8.b();
            for (int i14 = 0; i14 < iB2; i14++) {
                Object objJ = t8.j(i14);
                C0972g c0972g = objJ instanceof C0972g ? (C0972g) objJ : null;
                if (c0972g == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.f10637a[i14];
                    if (lazyLayoutItemAnimation3 != null) {
                        lazyLayoutItemAnimation3.d();
                    }
                    this.f10637a[i14] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation4 = this.f10637a[i14];
                    if (lazyLayoutItemAnimation4 == null) {
                        final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
                        lazyLayoutItemAnimation4 = new LazyLayoutItemAnimation(a10, s10, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                LazyLayoutItemAnimator.a aVar = lazyLayoutItemAnimator.j;
                                if (aVar != null) {
                                    C1192m.a(aVar);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                        this.f10637a[i14] = lazyLayoutItemAnimation4;
                    }
                    lazyLayoutItemAnimation4.f10613d = c0972g.f10718p;
                    lazyLayoutItemAnimation4.f10614e = c0972g.f10719q;
                }
            }
        }
    }

    /* JADX INFO: compiled from: LazyLayoutItemAnimator.kt */
    public static final class a extends androidx.compose.ui.h.c implements InterfaceC1191l {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public LazyLayoutItemAnimator<?> f10645p;

        public a() {
            throw null;
        }

        @Override // androidx.compose.ui.h.c
        public final void I1() {
            this.f10645p.j = this;
        }

        @Override // androidx.compose.ui.h.c
        public final void J1() {
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.f10645p;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f10627b = null;
            lazyLayoutItemAnimator.f10628c = -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f10645p, ((a) obj).f10645p);
        }

        public final int hashCode() {
            return this.f10645p.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f10645p + ')';
        }

        @Override // androidx.compose.ui.node.InterfaceC1191l
        public final void x(C1202x c1202x) {
            ArrayList arrayList = this.f10645p.f10634i;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) arrayList.get(i10);
                androidx.compose.ui.graphics.layer.b bVar = lazyLayoutItemAnimation.f10621m;
                if (bVar != null) {
                    long j = lazyLayoutItemAnimation.f10620l;
                    long j10 = bVar.f13679t;
                    float f10 = ((int) (j >> 32)) - ((int) (j10 >> 32));
                    float f11 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j10));
                    J.a aVar = c1202x.f14624b;
                    aVar.f3941c.f3948a.g(f10, f11);
                    try {
                        androidx.compose.ui.graphics.layer.c.a(c1202x, bVar);
                        aVar.f3941c.f3948a.g(-f10, -f11);
                    } catch (Throwable th) {
                        aVar.f3941c.f3948a.g(-f10, -f11);
                        throw th;
                    }
                }
            }
            c1202x.A1();
        }
    }

    public static void c(z zVar, int i10, ItemInfo itemInfo) {
        int i11 = 0;
        long jN = zVar.n(0);
        long jA = zVar.l() ? p013b0.j.a(0, i10, 1, jN) : p013b0.j.a(i10, 0, 2, jN);
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = itemInfo.f10637a;
        int length = lazyLayoutItemAnimationArr.length;
        int i12 = 0;
        while (i11 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i11];
            int i13 = i12 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.f10619k = p013b0.j.d(jA, p013b0.j.c(zVar.n(i12), jN));
            }
            i11++;
            i12 = i13;
        }
    }

    public static int h(int[] iArr, z zVar) {
        int iD = zVar.d();
        int i10 = zVar.i() + iD;
        int iMax = 0;
        while (iD < i10) {
            int iG = zVar.g() + iArr[iD];
            iArr[iD] = iG;
            iMax = Math.max(iMax, iG);
            iD++;
        }
        return iMax;
    }

    public final LazyLayoutItemAnimation a(int i10, Object obj) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoD = this.f10626a.d(obj);
        if (itemInfoD == null || (lazyLayoutItemAnimationArr = itemInfoD.f10637a) == null) {
            return null;
        }
        return lazyLayoutItemAnimationArr[i10];
    }

    public final long b() {
        ArrayList arrayList = this.f10634i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) arrayList.get(i10);
            androidx.compose.ui.graphics.layer.b bVar = lazyLayoutItemAnimation.f10621m;
            if (bVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (lazyLayoutItemAnimation.f10619k >> 32)) + ((int) (bVar.f13680u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (lazyLayoutItemAnimation.f10619k & 4294967295L)) + ((int) (bVar.f13680u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x03cc  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i10, int i11, int i12, ArrayList arrayList, InterfaceC0987w interfaceC0987w, C c10, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, kotlinx.coroutines.A a10, androidx.compose.ui.graphics.S s10) {
        androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k10;
        long j;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z13;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        androidx.collection.L<Object> l10;
        androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k11;
        int i16;
        int i17;
        int[] iArr2;
        androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k12;
        InterfaceC0987w interfaceC0987w2;
        androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k13;
        int iG;
        int i18;
        int i19;
        Object[] objArr;
        boolean z14;
        Object[] objArr2;
        int i20;
        int i21;
        androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k14;
        int i22;
        int i23;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i24;
        int i25;
        int i26;
        long j10;
        int i27;
        long j11;
        long[] jArr;
        ArrayList arrayList7 = arrayList;
        InterfaceC0987w interfaceC0987w3 = this.f10627b;
        this.f10627b = interfaceC0987w;
        int size = arrayList.size();
        int i28 = 0;
        loop0: while (true) {
            k10 = this.f10626a;
            if (i28 >= size) {
                if (!k10.e()) {
                    break;
                }
                e();
                return;
            }
            z zVar = (z) arrayList7.get(i28);
            int iB = zVar.b();
            for (int i29 = 0; i29 < iB; i29++) {
                Object objJ = zVar.j(i29);
                if ((objJ instanceof C0972g ? (C0972g) objJ : null) != null) {
                    break loop0;
                }
            }
            i28++;
        }
        int i30 = this.f10628c;
        z zVar2 = (z) kotlin.collections.q.P(arrayList);
        this.f10628c = zVar2 != null ? zVar2.getIndex() : 0;
        long j12 = z10 ? (((long) i10) & 4294967295L) | (((long) 0) << 32) : (((long) i10) << 32) | (((long) 0) & 4294967295L);
        boolean z15 = z11 || !z12;
        Object[] objArr3 = k10.f9128b;
        long[] jArr2 = k10.f9127a;
        int length = jArr2.length - 2;
        androidx.collection.L<Object> l11 = this.f10629d;
        if (length >= 0) {
            int i31 = 0;
            while (true) {
                long j13 = jArr2[i31];
                j = j12;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i32 = 8 - ((~(i31 - length)) >>> 31);
                    int i33 = 0;
                    while (i33 < i32) {
                        if ((j13 & 255) < 128) {
                            l11.d(objArr3[(i31 << 3) + i33]);
                        }
                        j13 >>= 8;
                        i33++;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i32 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i31 == length) {
                    break;
                }
                i31++;
                j12 = j;
                jArr2 = jArr;
            }
        } else {
            j = j12;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (true) {
            arrayList2 = this.f10634i;
            arrayList3 = this.f10631f;
            arrayList4 = this.f10630e;
            if (i34 >= size2) {
                break;
            }
            z zVar3 = (z) arrayList7.get(i34);
            l11.l(zVar3.getKey());
            int iB2 = zVar3.b();
            int i35 = 0;
            while (true) {
                if (i35 >= iB2) {
                    i26 = size2;
                    i30 = i30;
                    j10 = j;
                    i27 = 1;
                    f(zVar3.getKey());
                    break;
                }
                i26 = size2;
                Object objJ2 = zVar3.j(i35);
                int i36 = iB2;
                if ((objJ2 instanceof C0972g ? (C0972g) objJ2 : null) != null) {
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfoD = k10.d(zVar3.getKey());
                    int iE = interfaceC0987w3 != null ? interfaceC0987w3.e(zVar3.getKey()) : -1;
                    boolean z16 = iE == -1 && interfaceC0987w3 != null;
                    if (itemInfoD != null) {
                        i30 = i30;
                        if (!z15) {
                            i27 = 1;
                            j10 = j;
                            break;
                        }
                        ItemInfo.b(itemInfoD, zVar3, a10, s10, i14, i15);
                        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = itemInfoD.f10637a;
                        int length2 = lazyLayoutItemAnimationArr2.length;
                        int i37 = 0;
                        while (i37 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr2[i37];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr3 = lazyLayoutItemAnimationArr2;
                            int i38 = length2;
                            if (lazyLayoutItemAnimation == null || p013b0.j.b(lazyLayoutItemAnimation.f10619k, LazyLayoutItemAnimation.f10608r)) {
                                j11 = j;
                            } else {
                                j11 = j;
                                lazyLayoutItemAnimation.f10619k = p013b0.j.d(lazyLayoutItemAnimation.f10619k, j11);
                            }
                            i37++;
                            j = j11;
                            lazyLayoutItemAnimationArr2 = lazyLayoutItemAnimationArr3;
                            length2 = i38;
                        }
                        long j14 = j;
                        if (z16) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation2 : itemInfoD.f10637a) {
                                if (lazyLayoutItemAnimation2 != null) {
                                    if (lazyLayoutItemAnimation2.c()) {
                                        arrayList2.remove(lazyLayoutItemAnimation2);
                                        a aVar = this.j;
                                        if (aVar != null) {
                                            C1192m.a(aVar);
                                            p293xa.r rVar = p293xa.r.f47939a;
                                        }
                                    }
                                    lazyLayoutItemAnimation2.a();
                                }
                            }
                        }
                        i27 = 1;
                        g(zVar3, false);
                        j10 = j14;
                        break;
                    }
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfo = new ItemInfo();
                    ItemInfo.b(itemInfo, zVar3, a10, s10, i14, i15);
                    k10.l(zVar3.getKey(), itemInfo);
                    if (zVar3.getIndex() == iE || iE == -1) {
                        long jN = zVar3.n(0);
                        c(zVar3, zVar3.l() ? (int) (jN & 4294967295L) : (int) (jN >> 32), itemInfo);
                        if (z16) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.f10637a) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    lazyLayoutItemAnimation3.a();
                                    p293xa.r rVar2 = p293xa.r.f47939a;
                                }
                            }
                        }
                    } else {
                        if (iE < i30) {
                            arrayList4.add(zVar3);
                        } else {
                            arrayList3.add(zVar3);
                        }
                        i30 = i30;
                    }
                    j10 = j;
                    i27 = 1;
                    break;
                }
                i35++;
                iB2 = i36;
                size2 = i26;
            }
            i34 += i27;
            arrayList7 = arrayList;
            j = j10;
            size2 = i26;
            i30 = i30;
        }
        int i39 = i13;
        int[] iArr3 = new int[i39];
        if (z15 && interfaceC0987w3 != null) {
            if (arrayList4.isEmpty()) {
                i25 = 1;
            } else {
                if (arrayList4.size() > 1) {
                    kotlin.collections.p.G(arrayList4, new C0980o(interfaceC0987w3));
                }
                int size3 = arrayList4.size();
                for (int i40 = 0; i40 < size3; i40++) {
                    z zVar4 = (z) arrayList4.get(i40);
                    int iH = i14 - h(iArr3, zVar4);
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfoD2 = k10.d(zVar4.getKey());
                    kotlin.jvm.internal.i.b(itemInfoD2);
                    c(zVar4, iH, itemInfoD2);
                    g(zVar4, false);
                }
                i25 = 1;
                Q3.d.x(0, 0, 6, iArr3);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i25) {
                    kotlin.collections.p.G(arrayList3, new C0978m(interfaceC0987w3));
                }
                int size4 = arrayList3.size();
                for (int i41 = 0; i41 < size4; i41++) {
                    z zVar5 = (z) arrayList3.get(i41);
                    int iH2 = (h(iArr3, zVar5) + i15) - zVar5.g();
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfoD3 = k10.d(zVar5.getKey());
                    kotlin.jvm.internal.i.b(itemInfoD3);
                    c(zVar5, iH2, itemInfoD3);
                    g(zVar5, false);
                }
                Q3.d.x(0, 0, 6, iArr3);
            }
        }
        Object[] objArr4 = l11.f9123b;
        long[] jArr3 = l11.f9122a;
        int length3 = jArr3.length - 2;
        ArrayList arrayList8 = this.f10633h;
        ArrayList arrayList9 = this.f10632g;
        if (length3 >= 0) {
            arrayList6 = arrayList4;
            l10 = l11;
            int i42 = 0;
            while (true) {
                long j15 = jArr3[i42];
                long[] jArr4 = jArr3;
                arrayList5 = arrayList3;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i43 = 8 - ((~(i42 - length3)) >>> 31);
                    int i44 = 0;
                    while (i44 < i43) {
                        if ((j15 & 255) < 128) {
                            z14 = z15;
                            Object obj = objArr4[(i42 << 3) + i44];
                            objArr2 = objArr4;
                            LazyLayoutItemAnimator<T>.ItemInfo itemInfoD4 = k10.d(obj);
                            if (itemInfoD4 != 0) {
                                iArr3 = iArr3;
                                k14 = k10;
                                int iE2 = interfaceC0987w.e(obj);
                                int iMin = Math.min(i39, itemInfoD4.f10641e);
                                itemInfoD4.f10641e = iMin;
                                itemInfoD4.f10640d = Math.min(i39 - iMin, itemInfoD4.f10640d);
                                if (iE2 == -1) {
                                    LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr4 = itemInfoD4.f10637a;
                                    int length4 = lazyLayoutItemAnimationArr4.length;
                                    int i45 = 0;
                                    boolean z17 = false;
                                    int i46 = 0;
                                    while (i45 < length4) {
                                        int i47 = length4;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = lazyLayoutItemAnimationArr4[i45];
                                        int i48 = i46 + 1;
                                        if (lazyLayoutItemAnimation4 != null) {
                                            if (lazyLayoutItemAnimation4.c()) {
                                                i42 = i42;
                                                lazyLayoutItemAnimationArr = lazyLayoutItemAnimationArr4;
                                                i43 = i43;
                                                length3 = length3;
                                                i24 = 1;
                                            } else {
                                                lazyLayoutItemAnimationArr = lazyLayoutItemAnimationArr4;
                                                if (((Boolean) lazyLayoutItemAnimation4.j.getValue()).booleanValue()) {
                                                    lazyLayoutItemAnimation4.d();
                                                    itemInfoD4.f10637a[i46] = null;
                                                    arrayList2.remove(lazyLayoutItemAnimation4);
                                                    a aVar2 = this.j;
                                                    if (aVar2 != null) {
                                                        C1192m.a(aVar2);
                                                        p293xa.r rVar3 = p293xa.r.f47939a;
                                                    }
                                                } else {
                                                    androidx.compose.ui.graphics.layer.b bVar = lazyLayoutItemAnimation4.f10621m;
                                                    i42 = i42;
                                                    if (bVar != null) {
                                                        androidx.compose.animation.core.P p10 = lazyLayoutItemAnimation4.f10614e;
                                                        if (!lazyLayoutItemAnimation4.c() && p10 != null) {
                                                            lazyLayoutItemAnimation4.f(true);
                                                            C2680e.c(lazyLayoutItemAnimation4.f10610a, null, null, new LazyLayoutItemAnimation$animateDisappearance$1(lazyLayoutItemAnimation4, p10, bVar, null), 3);
                                                        }
                                                    }
                                                    if (lazyLayoutItemAnimation4.c()) {
                                                        arrayList2.add(lazyLayoutItemAnimation4);
                                                        a aVar3 = this.j;
                                                        if (aVar3 != null) {
                                                            C1192m.a(aVar3);
                                                            p293xa.r rVar4 = p293xa.r.f47939a;
                                                        }
                                                        i24 = 1;
                                                    } else {
                                                        lazyLayoutItemAnimation4.d();
                                                        itemInfoD4.f10637a[i46] = null;
                                                    }
                                                }
                                                i24 = 1;
                                                i45 += i24;
                                                length4 = i47;
                                                i46 = i48;
                                                lazyLayoutItemAnimationArr4 = lazyLayoutItemAnimationArr;
                                                i42 = i42;
                                                length3 = length3;
                                                i43 = i43;
                                            }
                                            z17 = true;
                                            i45 += i24;
                                            length4 = i47;
                                            i46 = i48;
                                            lazyLayoutItemAnimationArr4 = lazyLayoutItemAnimationArr;
                                            i42 = i42;
                                            length3 = length3;
                                            i43 = i43;
                                        } else {
                                            lazyLayoutItemAnimationArr = lazyLayoutItemAnimationArr4;
                                        }
                                        i43 = i43;
                                        length3 = length3;
                                        i24 = 1;
                                        i45 += i24;
                                        length4 = i47;
                                        i46 = i48;
                                        lazyLayoutItemAnimationArr4 = lazyLayoutItemAnimationArr;
                                        i42 = i42;
                                        length3 = length3;
                                        i43 = i43;
                                    }
                                    i42 = i42;
                                    i20 = i43;
                                    i21 = length3;
                                    if (!z17) {
                                        f(obj);
                                    }
                                    i22 = i44;
                                } else {
                                    i42 = i42;
                                    i20 = i43;
                                    i21 = length3;
                                    p013b0.a aVar4 = itemInfoD4.f10638b;
                                    kotlin.jvm.internal.i.b(aVar4);
                                    i22 = i44;
                                    z zVarA = c10.a(iE2, itemInfoD4.f10640d, itemInfoD4.f10641e, aVar4.f20475a);
                                    zVarA.m();
                                    LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr5 = itemInfoD4.f10637a;
                                    int length5 = lazyLayoutItemAnimationArr5.length;
                                    int i49 = 0;
                                    while (true) {
                                        if (i49 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = lazyLayoutItemAnimationArr5[i49];
                                            if (lazyLayoutItemAnimation5 != null) {
                                                i23 = 1;
                                                if (((Boolean) lazyLayoutItemAnimation5.f10616g.getValue()).booleanValue()) {
                                                }
                                            } else {
                                                i23 = 1;
                                            }
                                            i49 += i23;
                                        } else if (interfaceC0987w3 != null && iE2 == interfaceC0987w3.e(obj)) {
                                            f(obj);
                                        }
                                        itemInfoD4.a(zVarA, a10, s10, i14, i15, itemInfoD4.f10639c);
                                        if (iE2 < this.f10628c) {
                                            arrayList9.add(zVarA);
                                        } else {
                                            arrayList8.add(zVarA);
                                        }
                                    }
                                }
                            }
                            j15 >>= 8;
                            i44 = i22 + 1;
                            z15 = z14;
                            i39 = i13;
                            objArr4 = objArr2;
                            iArr3 = iArr3;
                            k10 = k14;
                            i42 = i42;
                            length3 = i21;
                            i43 = i20;
                        } else {
                            z14 = z15;
                            objArr2 = objArr4;
                        }
                        i20 = i43;
                        i22 = i44;
                        i21 = length3;
                        k14 = k10;
                        j15 >>= 8;
                        i44 = i22 + 1;
                        z15 = z14;
                        i39 = i13;
                        objArr4 = objArr2;
                        iArr3 = iArr3;
                        k10 = k14;
                        i42 = i42;
                        length3 = i21;
                        i43 = i20;
                    }
                    z13 = z15;
                    iArr = iArr3;
                    int i50 = i42;
                    objArr = objArr4;
                    int i51 = length3;
                    k11 = k10;
                    i16 = 1;
                    if (i43 != 8) {
                        break;
                    }
                    i42 = i50;
                    length3 = i51;
                } else {
                    z13 = z15;
                    iArr = iArr3;
                    objArr = objArr4;
                    k11 = k10;
                    i16 = 1;
                }
                if (i42 == length3) {
                    break;
                }
                i42 += i16;
                z15 = z13;
                i39 = i13;
                arrayList3 = arrayList5;
                jArr3 = jArr4;
                objArr4 = objArr;
                iArr3 = iArr;
                k10 = k11;
            }
        } else {
            z13 = z15;
            iArr = iArr3;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            l10 = l11;
            k11 = k10;
            i16 = 1;
        }
        if (arrayList9.isEmpty()) {
            i17 = i16;
            iArr2 = iArr;
            k12 = k11;
            interfaceC0987w2 = interfaceC0987w;
        } else {
            if (arrayList9.size() > i16) {
                interfaceC0987w2 = interfaceC0987w;
                kotlin.collections.p.G(arrayList9, new C0981p(interfaceC0987w2));
            } else {
                interfaceC0987w2 = interfaceC0987w;
            }
            int size5 = arrayList9.size();
            int i52 = 0;
            while (i52 < size5) {
                z zVar6 = (z) arrayList9.get(i52);
                androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k15 = k11;
                LazyLayoutItemAnimator<T>.ItemInfo itemInfoD5 = k15.d(zVar6.getKey());
                kotlin.jvm.internal.i.b(itemInfoD5);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = itemInfoD5;
                int[] iArr4 = iArr;
                int iH3 = h(iArr4, zVar6);
                if (z11) {
                    z zVar7 = (z) kotlin.collections.q.O(arrayList);
                    long jN2 = zVar7.n(0);
                    i19 = zVar7.l() ? (int) (jN2 & 4294967295L) : (int) (jN2 >> 32);
                } else {
                    i19 = itemInfo2.f10642f;
                }
                zVar6.f(i19 - iH3, itemInfo2.f10639c, i11, i12);
                if (z13) {
                    g(zVar6, true);
                }
                i52++;
                k11 = k15;
                iArr = iArr4;
            }
            iArr2 = iArr;
            k12 = k11;
            i17 = 1;
            Q3.d.x(0, 0, 6, iArr2);
        }
        if (!arrayList8.isEmpty()) {
            if (arrayList8.size() > i17) {
                kotlin.collections.p.G(arrayList8, new C0979n(interfaceC0987w2));
            }
            int size6 = arrayList8.size();
            int i53 = 0;
            while (i53 < size6) {
                z zVar8 = (z) arrayList8.get(i53);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfoD6 = k12.d(zVar8.getKey());
                kotlin.jvm.internal.i.b(itemInfoD6);
                LazyLayoutItemAnimator<T>.ItemInfo itemInfo3 = itemInfoD6;
                int iH4 = h(iArr2, zVar8);
                if (z11) {
                    z zVar9 = (z) kotlin.collections.q.V(arrayList);
                    long jN3 = zVar9.n(0);
                    if (zVar9.l()) {
                        i18 = (int) (jN3 & 4294967295L);
                        k13 = k12;
                    } else {
                        k13 = k12;
                        i18 = (int) (jN3 >> 32);
                    }
                    iG = zVar9.g() + i18;
                } else {
                    k13 = k12;
                    iArr2 = iArr2;
                    arrayList8 = arrayList8;
                    iG = itemInfo3.f10643g;
                }
                zVar8.f((iG - zVar8.g()) + iH4, itemInfo3.f10639c, i11, i12);
                if (z13) {
                    g(zVar8, true);
                }
                i53++;
                arrayList8 = arrayList8;
                k12 = k13;
                iArr2 = iArr2;
            }
        }
        ArrayList arrayList10 = arrayList8;
        Collections.reverse(arrayList9);
        p293xa.r rVar5 = p293xa.r.f47939a;
        arrayList.addAll(0, arrayList9);
        arrayList.addAll(arrayList10);
        arrayList6.clear();
        arrayList5.clear();
        arrayList9.clear();
        arrayList10.clear();
        l10.e();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[LOOP:0: B:7:0x0011->B:22:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[EDGE_INSN: B:26:0x0058->B:23:0x0058 BREAK  A[LOOP:0: B:7:0x0011->B:22:0x0055], SYNTHETIC] */
    public final void e() {
        androidx.collection.K<Object, LazyLayoutItemAnimator<T>.ItemInfo> k10 = this.f10626a;
        if (k10.f9131e != 0) {
            Object[] objArr = k10.f9129c;
            long[] jArr = k10.f9127a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i10 << 3) + i12]).f10637a) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            k10.f();
        }
    }

    public final void f(Object obj) {
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoJ = this.f10626a.j(obj);
        if (itemInfoJ == null || (lazyLayoutItemAnimationArr = itemInfoJ.f10637a) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : lazyLayoutItemAnimationArr) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.d();
            }
        }
    }

    public final void g(T t8, boolean z10) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfoD = this.f10626a.d(t8.getKey());
        kotlin.jvm.internal.i.b(itemInfoD);
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr = itemInfoD.f10637a;
        int length = lazyLayoutItemAnimationArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[i10];
            int i12 = i11 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jN = t8.n(i11);
                long j = lazyLayoutItemAnimation.f10619k;
                long j10 = LazyLayoutItemAnimation.f10608r;
                lazyLayoutItemAnimation.f10619k = jN;
            }
            i10++;
            i11 = i12;
        }
    }
}
