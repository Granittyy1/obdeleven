package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import A8.A;
import A8.p;
import Ia.l;
import androidx.compose.runtime.C1091i0;
import com.voltasit.obdeleven.domain.usecases.device.u;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends kotlin.collections.d<E> implements Collection, Ja.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D.b<? extends E> f12953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f12955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f12957f = new A();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f12958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f12959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12960i;

    public PersistentVectorBuilder(AbstractPersistentList abstractPersistentList, Object[] objArr, Object[] objArr2, int i10) {
        this.f12953b = abstractPersistentList;
        this.f12954c = objArr;
        this.f12955d = objArr2;
        this.f12956e = i10;
        this.f12958g = objArr;
        this.f12959h = objArr2;
        this.f12960i = abstractPersistentList.e();
    }

    public static void v(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final int A() {
        return ((AbstractList) this).modCount;
    }

    public final void B(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f12958g == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarJ = J(b0() >> 5);
        int i14 = i12;
        Object[] objArrL = objArr2;
        while (aVarJ.f12961b - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarJ.previous();
            Q3.d.n(0, 32 - i11, 32, objArr3, objArrL);
            objArrL = L(i11, objArr3);
            i14--;
            objArr[i14] = objArrL;
        }
        Object[] objArr4 = (Object[]) aVarJ.previous();
        int iB0 = i12 - (((b0() >> 5) - 1) - i13);
        if (iB0 < i12) {
            objArr2 = objArr[iB0];
            i.b(objArr2);
        }
        d0(collection, i10, objArr4, 32, objArr, iB0, objArr2);
    }

    public final Object[] C(Object[] objArr, int i10, int i11, Object obj, F6.a aVar) {
        Object obj2;
        int i12 = u.i(i11, i10);
        if (i10 == 0) {
            aVar.f3259c = objArr[31];
            Object[] objArrK = K(objArr);
            Q3.d.n(i12 + 1, i12, 31, objArr, objArrK);
            objArrK[i12] = obj;
            return objArrK;
        }
        Object[] objArrK2 = K(objArr);
        int i13 = i10 - 5;
        Object obj3 = objArrK2[i12];
        i.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrK2[i12] = C((Object[]) obj3, i13, i11, obj, aVar);
        while (true) {
            i12++;
            if (i12 >= 32 || (obj2 = objArrK2[i12]) == null) {
                break;
            }
            objArrK2[i12] = C((Object[]) obj2, i13, 0, aVar.f3259c, aVar);
        }
        return objArrK2;
    }

    public final void G(int i10, Object obj, Object[] objArr) {
        int iE0 = e0();
        Object[] objArrK = K(this.f12959h);
        if (iE0 >= 32) {
            Object[] objArr2 = this.f12959h;
            Object obj2 = objArr2[31];
            Q3.d.n(i10 + 1, i10, 31, objArr2, objArrK);
            objArrK[i10] = obj;
            T(objArr, objArrK, N(obj2));
            return;
        }
        Q3.d.n(i10 + 1, i10, iE0, this.f12959h, objArrK);
        objArrK[i10] = obj;
        this.f12958g = objArr;
        this.f12959h = objArrK;
        this.f12960i++;
    }

    public final boolean I(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f12957f;
    }

    public final a J(int i10) {
        Object[] objArr = this.f12958g;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iB0 = b0() >> 5;
        p.l(i10, iB0);
        int i11 = this.f12956e;
        return i11 == 0 ? new f(i10, objArr) : new h(objArr, i10, iB0, i11 / 5);
    }

    public final Object[] K(Object[] objArr) {
        if (objArr == null) {
            return M();
        }
        if (I(objArr)) {
            return objArr;
        }
        Object[] objArrM = M();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        Q3.d.r(0, length, 6, objArr, objArrM);
        return objArrM;
    }

    public final Object[] L(int i10, Object[] objArr) {
        if (I(objArr)) {
            Q3.d.n(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrM = M();
        Q3.d.n(i10, 0, 32 - i10, objArr, objArrM);
        return objArrM;
    }

    public final Object[] M() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f12957f;
        return objArr;
    }

    public final Object[] N(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f12957f;
        return objArr;
    }

    public final Object[] O(int i10, int i11, Object[] objArr) {
        if (i11 < 0) {
            C1091i0.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int i12 = u.i(i10, i11);
        Object obj = objArr[i12];
        i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objO = O(i10, i11 - 5, (Object[]) obj);
        if (i12 < 31) {
            int i13 = i12 + 1;
            if (objArr[i13] != null) {
                if (I(objArr)) {
                    Arrays.fill(objArr, i13, 32, (Object) null);
                }
                Object[] objArrM = M();
                Q3.d.n(0, 0, i13, objArr, objArrM);
                objArr = objArrM;
            }
        }
        if (objO == objArr[i12]) {
            return objArr;
        }
        Object[] objArrK = K(objArr);
        objArrK[i12] = objO;
        return objArrK;
    }

    public final Object[] P(Object[] objArr, int i10, int i11, F6.a aVar) {
        Object[] objArrP;
        int i12 = u.i(i11 - 1, i10);
        if (i10 == 5) {
            aVar.f3259c = objArr[i12];
            objArrP = null;
        } else {
            Object obj = objArr[i12];
            i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP = P((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArrP == null && i12 == 0) {
            return null;
        }
        Object[] objArrK = K(objArr);
        objArrK[i12] = objArrP;
        return objArrK;
    }

    public final void Q(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.f12958g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f12959h = objArr;
            this.f12960i = i10;
            this.f12956e = i11;
            return;
        }
        F6.a aVar = new F6.a((Object) null);
        i.b(objArr);
        Object[] objArrP = P(objArr, i11, i10, aVar);
        i.b(objArrP);
        Object obj = aVar.f3259c;
        i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f12959h = (Object[]) obj;
        this.f12960i = i10;
        if (objArrP[1] == null) {
            this.f12958g = (Object[]) objArrP[0];
            this.f12956e = i11 - 5;
        } else {
            this.f12958g = objArrP;
            this.f12956e = i11;
        }
    }

    public final Object[] R(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            C1091i0.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            C1091i0.a("negative shift");
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrK = K(objArr);
        int i12 = u.i(i10, i11);
        int i13 = i11 - 5;
        objArrK[i12] = R((Object[]) objArrK[i12], i10, i13, it);
        while (true) {
            i12++;
            if (i12 >= 32 || !it.hasNext()) {
                break;
            }
            objArrK[i12] = R((Object[]) objArrK[i12], 0, i13, it);
        }
        return objArrK;
    }

    public final Object[] S(Object[] objArr, int i10, Object[][] objArr2) {
        kotlin.jvm.internal.a aVarM = I2.e.m(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f12956e;
        Object[] objArrR = i11 < (1 << i12) ? R(objArr, i10, i12, aVarM) : K(objArr);
        while (aVarM.hasNext()) {
            this.f12956e += 5;
            objArrR = N(objArrR);
            int i13 = this.f12956e;
            R(objArrR, 1 << i13, i13, aVarM);
        }
        return objArrR;
    }

    public final void T(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f12960i;
        int i11 = i10 >> 5;
        int i12 = this.f12956e;
        if (i11 > (1 << i12)) {
            this.f12958g = U(this.f12956e + 5, N(objArr), objArr2);
            this.f12959h = objArr3;
            this.f12956e += 5;
            this.f12960i++;
            return;
        }
        if (objArr == null) {
            this.f12958g = objArr2;
            this.f12959h = objArr3;
            this.f12960i = i10 + 1;
        } else {
            this.f12958g = U(i12, objArr, objArr2);
            this.f12959h = objArr3;
            this.f12960i++;
        }
    }

    public final Object[] U(int i10, Object[] objArr, Object[] objArr2) {
        int i11 = u.i(e() - 1, i10);
        Object[] objArrK = K(objArr);
        if (i10 == 5) {
            objArrK[i11] = objArr2;
        } else {
            objArrK[i11] = U(i10 - 5, (Object[]) objArrK[i11], objArr2);
        }
        return objArrK;
    }

    public final int V(l lVar, Object[] objArr, int i10, int i11, F6.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (I(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f3259c;
        i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrM = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : M();
                    i11 = 0;
                }
                objArrM[i11] = obj2;
                i11++;
            }
        }
        aVar.f3259c = objArrM;
        if (objArr2 != objArrM) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int W(l<? super E, Boolean> lVar, Object[] objArr, int i10, F6.a aVar) {
        Object[] objArrK = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrK = K(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrK[i11] = obj;
                i11++;
            }
        }
        aVar.f3259c = objArrK;
        return i11;
    }

    public final int X(l<? super E, Boolean> lVar, int i10, F6.a aVar) {
        int iW = W(lVar, this.f12959h, i10, aVar);
        if (iW == i10) {
            return i10;
        }
        Object obj = aVar.f3259c;
        i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iW, i10, (Object) null);
        this.f12959h = objArr;
        this.f12960i -= i10 - iW;
        return iW;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public final boolean Y(l<? super E, Boolean> lVar) {
        Object[] objArrR;
        int i10;
        int iE0 = e0();
        Object[] objArrO = null;
        F6.a aVar = new F6.a((Object) null);
        boolean z10 = false;
        if (this.f12958g != null) {
            a aVarJ = J(0);
            int i11 = 32;
            int iW = 32;
            while (iW == 32 && aVarJ.hasNext()) {
                iW = W(lVar, (Object[]) aVarJ.next(), 32, aVar);
            }
            if (iW == 32) {
                int iX = X(lVar, iE0, aVar);
                if (iX == 0) {
                    Q(this.f12960i, this.f12956e, this.f12958g);
                }
                if (iX != iE0) {
                    z10 = true;
                }
            } else {
                int i12 = (aVarJ.f12961b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iV = iW;
                while (aVarJ.hasNext()) {
                    iV = V(lVar, (Object[]) aVarJ.next(), 32, iV, aVar, arrayList2, arrayList);
                    i12 = i12;
                    i11 = i11;
                }
                int i13 = i12;
                int iV2 = V(lVar, this.f12959h, iE0, iV, aVar, arrayList2, arrayList);
                Object obj = aVar.f3259c;
                i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iV2, i11, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrR = this.f12958g;
                    i.b(objArrR);
                } else {
                    objArrR = R(this.f12958g, i13, this.f12956e, arrayList.iterator());
                }
                int size = i13 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C1091i0.a("invalid size");
                }
                if (size == 0) {
                    this.f12956e = 0;
                } else {
                    int i14 = size - 1;
                    while (true) {
                        i10 = this.f12956e;
                        if ((i14 >> i10) != 0) {
                            break;
                        }
                        this.f12956e = i10 - 5;
                        Object[] objArr2 = objArrR[0];
                        i.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrR = objArr2;
                    }
                    objArrO = O(i14, i10, objArrR);
                }
                this.f12958g = objArrO;
                this.f12959h = objArr;
                this.f12960i = size + iV2;
                z10 = true;
            }
        } else if (X(lVar, iE0, aVar) != iE0) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] Z(Object[] objArr, int i10, int i11, F6.a aVar) {
        int i12 = u.i(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[i12];
            Object[] objArrK = K(objArr);
            Q3.d.n(i12, i12 + 1, 32, objArr, objArrK);
            objArrK[31] = aVar.f3259c;
            aVar.f3259c = obj;
            return objArrK;
        }
        int i13 = objArr[31] == null ? u.i(b0() - 1, i10) : 31;
        Object[] objArrK2 = K(objArr);
        int i14 = i10 - 5;
        int i15 = i12 + 1;
        if (i15 <= i13) {
            while (true) {
                Object obj2 = objArrK2[i13];
                i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrK2[i13] = Z((Object[]) obj2, i14, 0, aVar);
                if (i13 == i15) {
                    break;
                }
                i13--;
            }
        }
        Object obj3 = objArrK2[i12];
        i.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrK2[i12] = Z((Object[]) obj3, i14, i11, aVar);
        return objArrK2;
    }

    public final Object a0(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f12960i - i10;
        if (i13 == 1) {
            Object obj = this.f12959h[0];
            Q(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f12959h;
        Object obj2 = objArr2[i12];
        Object[] objArrK = K(objArr2);
        Q3.d.n(i12, i12 + 1, i13, objArr2, objArrK);
        objArrK[i13 - 1] = null;
        this.f12958g = objArr;
        this.f12959h = objArrK;
        this.f12960i = (i10 + i13) - 1;
        this.f12956e = i11;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        p.l(i10, e());
        if (i10 == e()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iB0 = b0();
        if (i10 >= iB0) {
            G(i10 - iB0, e10, this.f12958g);
            return;
        }
        F6.a aVar = new F6.a((Object) null);
        Object[] objArr = this.f12958g;
        i.b(objArr);
        G(0, aVar.f3259c, C(objArr, this.f12956e, i10, e10, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] objArrM;
        p.l(i10, this.f12960i);
        if (i10 == this.f12960i) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f12960i - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f12959h;
            Object[] objArrK = K(objArr);
            Q3.d.n(size2 + 1, i12, e0(), objArr, objArrK);
            v(objArrK, i12, collection.iterator());
            this.f12959h = objArrK;
            this.f12960i = collection.size() + this.f12960i;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iE0 = e0();
        int size3 = collection.size() + this.f12960i;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= b0()) {
            objArrM = M();
            d0(collection, i10, this.f12959h, iE0, objArr2, size, objArrM);
        } else if (size3 > iE0) {
            int i13 = size3 - iE0;
            objArrM = L(i13, this.f12959h);
            B(collection, i10, i13, objArr2, size, objArrM);
        } else {
            Object[] objArr3 = this.f12959h;
            objArrM = M();
            int i14 = iE0 - size3;
            Q3.d.n(0, i14, iE0, objArr3, objArrM);
            int i15 = 32 - i14;
            Object[] objArrL = L(i15, this.f12959h);
            int i16 = size - 1;
            objArr2[i16] = objArrL;
            B(collection, i10, i15, objArr2, i16, objArrL);
        }
        this.f12958g = S(this.f12958g, i11, objArr2);
        this.f12959h = objArrM;
        this.f12960i = collection.size() + this.f12960i;
        return true;
    }

    public final int b0() {
        int i10 = this.f12960i;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] c0(Object[] objArr, int i10, int i11, E e10, F6.a aVar) {
        int i12 = u.i(i11, i10);
        Object[] objArrK = K(objArr);
        if (i10 != 0) {
            Object obj = objArrK[i12];
            i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrK[i12] = c0((Object[]) obj, i10 - 5, i11, e10, aVar);
            return objArrK;
        }
        if (objArrK != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f3259c = objArrK[i12];
        objArrK[i12] = e10;
        return objArrK;
    }

    public final void d0(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrM;
        if (i12 < 1) {
            C1091i0.a("requires at least one nullBuffer");
        }
        Object[] objArrK = K(objArr);
        objArr2[0] = objArrK;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            Q3.d.n(size + 1, i13, i11, objArrK, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrM = objArrK;
            } else {
                objArrM = M();
                i12--;
                objArr2[i12] = objArrM;
            }
            int i16 = i11 - i15;
            Q3.d.n(0, i16, i11, objArrK, objArr3);
            Q3.d.n(size + 1, i13, i16, objArrK, objArrM);
            objArr3 = objArrM;
        }
        Iterator<? extends E> it = collection.iterator();
        v(objArrK, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrM2 = M();
            v(objArrM2, 0, it);
            objArr2[i17] = objArrM2;
        }
        v(objArr3, 0, it);
    }

    @Override // kotlin.collections.d
    public final int e() {
        return this.f12960i;
    }

    public final int e0() {
        int i10 = this.f12960i;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        Object[] objArr;
        p.i(i10, e());
        if (b0() <= i10) {
            objArr = this.f12959h;
        } else {
            objArr = this.f12958g;
            i.b(objArr);
            for (int i11 = this.f12956e; i11 > 0; i11 -= 5) {
                Object obj = objArr[u.i(i10, i11)];
                i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.d
    public final E k(int i10) {
        p.i(i10, e());
        ((AbstractList) this).modCount++;
        int iB0 = b0();
        if (i10 >= iB0) {
            return (E) a0(this.f12958g, iB0, this.f12956e, i10 - iB0);
        }
        F6.a aVar = new F6.a(this.f12959h[0]);
        Object[] objArr = this.f12958g;
        i.b(objArr);
        a0(Z(objArr, this.f12956e, i10, aVar), iB0, this.f12956e, 0);
        return (E) aVar.f3259c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        p.l(i10, e());
        return new e(this, i10);
    }

    public final D.b<E> q() {
        c cVar;
        Object[] objArr = this.f12958g;
        if (objArr == this.f12954c && this.f12959h == this.f12955d) {
            cVar = this.f12953b;
        } else {
            this.f12957f = new A();
            this.f12954c = objArr;
            Object[] objArr2 = this.f12959h;
            this.f12955d = objArr2;
            if (objArr != null) {
                cVar = new c(objArr, objArr2, this.f12960i, this.f12956e);
            } else if (objArr2.length == 0) {
                cVar = g.f12975c;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f12959h, this.f12960i);
                i.d(objArrCopyOf, "copyOf(...)");
                cVar = new g(objArrCopyOf);
            }
        }
        this.f12953b = cVar;
        return (D.b<E>) cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<? extends Object> collection) {
        return Y(new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        p.i(i10, e());
        if (b0() > i10) {
            F6.a aVar = new F6.a((Object) null);
            Object[] objArr = this.f12958g;
            i.b(objArr);
            this.f12958g = c0(objArr, this.f12956e, i10, e10, aVar);
            return (E) aVar.f3259c;
        }
        Object[] objArrK = K(this.f12959h);
        if (objArrK != this.f12959h) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrK[i11];
        objArrK[i11] = e10;
        this.f12959h = objArrK;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iE0 = e0();
        if (iE0 < 32) {
            Object[] objArrK = K(this.f12959h);
            objArrK[iE0] = e10;
            this.f12959h = objArrK;
            this.f12960i = e() + 1;
        } else {
            T(this.f12958g, this.f12959h, N(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iE0 = e0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iE0 >= collection.size()) {
            Object[] objArrK = K(this.f12959h);
            v(objArrK, iE0, it);
            this.f12959h = objArrK;
            this.f12960i = collection.size() + this.f12960i;
        } else {
            int size = ((collection.size() + iE0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrK2 = K(this.f12959h);
            v(objArrK2, iE0, it);
            objArr[0] = objArrK2;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] objArrM = M();
                v(objArrM, 0, it);
                objArr[i10] = objArrM;
            }
            this.f12958g = S(this.f12958g, b0(), objArr);
            Object[] objArrM2 = M();
            v(objArrM2, 0, it);
            this.f12959h = objArrM2;
            this.f12960i = collection.size() + this.f12960i;
        }
        return true;
    }
}
