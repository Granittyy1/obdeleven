package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import A8.p;
import Ia.l;
import androidx.compose.runtime.C1091i0;
import com.voltasit.obdeleven.domain.usecases.device.u;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c<E> extends AbstractPersistentList<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f12964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f12965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12967e;

    public c(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f12964b = objArr;
        this.f12965c = objArr2;
        this.f12966d = i10;
        this.f12967e = i11;
        if (!(e() > 32)) {
            C1091i0.a("Trie-based persistent vector should have at least 33 elements, got " + e());
        }
        int length = objArr2.length;
    }

    public static Object[] J(Object[] objArr, int i10, int i11, Object obj) {
        int i12 = u.i(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        i.d(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[i12] = obj;
        } else {
            Object obj2 = objArrCopyOf[i12];
            i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[i12] = J((Object[]) obj2, i10 - 5, i11, obj);
        }
        return objArrCopyOf;
    }

    public static Object[] k(Object[] objArr, int i10, int i11, Object obj, F6.a aVar) {
        Object[] objArrCopyOf;
        int i12 = u.i(i11, i10);
        if (i10 == 0) {
            if (i12 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                i.d(objArrCopyOf, "copyOf(...)");
            }
            Q3.d.n(i12 + 1, i12, 31, objArr, objArrCopyOf);
            aVar.f3259c = objArr[31];
            objArrCopyOf[i12] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        i.d(objArrCopyOf2, "copyOf(...)");
        int i13 = i10 - 5;
        Object obj2 = objArr[i12];
        i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i12] = k((Object[]) obj2, i13, i11, obj, aVar);
        while (true) {
            i12++;
            if (i12 >= 32 || objArrCopyOf2[i12] == null) {
                break;
            }
            Object obj3 = objArr[i12];
            i.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i12] = k((Object[]) obj3, i13, 0, aVar.f3259c, aVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] v(Object[] objArr, int i10, int i11, F6.a aVar) {
        Object[] objArrV;
        int i12 = u.i(i11, i10);
        if (i10 == 5) {
            aVar.f3259c = objArr[i12];
            objArrV = null;
        } else {
            Object obj = objArr[i12];
            i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrV = v((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArrV == null && i12 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        i.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i12] = objArrV;
        return objArrCopyOf;
    }

    public final c<E> A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f12966d;
        int i11 = i10 >> 5;
        int i12 = this.f12967e;
        if (i11 <= (1 << i12)) {
            return new c<>(B(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new c<>(B(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    public final Object[] B(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int i11 = u.i(e() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            i.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[i11] = objArr2;
        } else {
            objArrCopyOf[i11] = B(i10 - 5, (Object[]) objArrCopyOf[i11], objArr2);
        }
        return objArrCopyOf;
    }

    public final Object[] C(Object[] objArr, int i10, int i11, F6.a aVar) {
        Object[] objArrCopyOf;
        int i12 = u.i(i11, i10);
        if (i10 == 0) {
            if (i12 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                i.d(objArrCopyOf, "copyOf(...)");
            }
            Q3.d.n(i12, i12 + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.f3259c;
            aVar.f3259c = objArr[i12];
            return objArrCopyOf;
        }
        int i13 = objArr[31] == null ? u.i(I() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        i.d(objArrCopyOf2, "copyOf(...)");
        int i14 = i10 - 5;
        int i15 = i12 + 1;
        if (i15 <= i13) {
            while (true) {
                Object obj = objArrCopyOf2[i13];
                i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[i13] = C((Object[]) obj, i14, 0, aVar);
                if (i13 == i15) {
                    break;
                }
                i13--;
            }
        }
        Object obj2 = objArrCopyOf2[i12];
        i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i12] = C((Object[]) obj2, i14, i11, aVar);
        return objArrCopyOf2;
    }

    @Override // D.b
    public final D.b<E> E(int i10) {
        p.i(i10, this.f12966d);
        int I10 = I();
        Object[] objArr = this.f12964b;
        int i11 = this.f12967e;
        return i10 >= I10 ? G(objArr, I10, i11, i10 - I10) : G(C(objArr, i11, i10, new F6.a(this.f12965c[0])), I10, i11, 0);
    }

    @Override // D.b
    public final D.b<E> F(l<? super E, Boolean> lVar) {
        PersistentVectorBuilder persistentVectorBuilder = new PersistentVectorBuilder(this, this.f12964b, this.f12965c, this.f12967e);
        persistentVectorBuilder.Y(lVar);
        return persistentVectorBuilder.q();
    }

    public final AbstractPersistentList G(Object[] objArr, int i10, int i11, int i12) {
        c cVar;
        int i13 = this.f12966d - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f12965c;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            i.d(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                Q3.d.n(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new c(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                i.d(objArr, "copyOf(...)");
            }
            return new g(objArr);
        }
        F6.a aVar = new F6.a((Object) null);
        Object[] objArrV = v(objArr, i11, i10 - 1, aVar);
        i.b(objArrV);
        Object obj = aVar.f3259c;
        i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrV[1] == null) {
            Object obj2 = objArrV[0];
            i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            cVar = new c((Object[]) obj2, objArr3, i10, i11 - 5);
        } else {
            cVar = new c(objArrV, objArr3, i10, i11);
        }
        return cVar;
    }

    public final int I() {
        return (this.f12966d - 1) & (-32);
    }

    @Override // java.util.Collection, java.util.List, D.b
    public final D.b<E> add(E e10) {
        int I10 = I();
        int i10 = this.f12966d;
        int i11 = i10 - I10;
        Object[] objArr = this.f12964b;
        Object[] objArr2 = this.f12965c;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = e10;
            return A(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        i.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = e10;
        return new c(objArr, objArrCopyOf, i10 + 1, this.f12967e);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f12966d;
    }

    @Override // java.util.List
    public final E get(int i10) {
        Object[] objArr;
        p.i(i10, e());
        if (I() <= i10) {
            objArr = this.f12965c;
        } else {
            objArr = this.f12964b;
            for (int i11 = this.f12967e; i11 > 0; i11 -= 5) {
                Object obj = objArr[u.i(i10, i11)];
                i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    @Override // D.b
    public final PersistentVectorBuilder i() {
        return new PersistentVectorBuilder(this, this.f12964b, this.f12965c, this.f12967e);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        p.l(i10, e());
        return new d(i10, e(), (this.f12967e / 5) + 1, this.f12964b, this.f12965c);
    }

    public final c q(int i10, Object obj, Object[] objArr) {
        int I10 = I();
        int i11 = this.f12966d;
        int i12 = i11 - I10;
        Object[] objArr2 = this.f12965c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        i.d(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            Q3.d.n(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new c(objArr, objArrCopyOf, i11 + 1, this.f12967e);
        }
        Object obj2 = objArr2[31];
        Q3.d.n(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return A(objArr, objArrCopyOf, objArr3);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List, D.b
    public final D.b<E> set(int i10, E e10) {
        int i11 = this.f12966d;
        p.i(i10, i11);
        int I10 = I();
        Object[] objArr = this.f12964b;
        Object[] objArr2 = this.f12965c;
        int i12 = this.f12967e;
        if (I10 > i10) {
            return new c(J(objArr, i12, i10, e10), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        i.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = e10;
        return new c(objArr, objArrCopyOf, i11, i12);
    }

    @Override // java.util.List, D.b
    public final D.b<E> add(int i10, E e10) {
        int i11 = this.f12966d;
        p.l(i10, i11);
        if (i10 == i11) {
            return add((Object) e10);
        }
        int I10 = I();
        Object[] objArr = this.f12964b;
        if (i10 >= I10) {
            return q(i10 - I10, e10, objArr);
        }
        F6.a aVar = new F6.a((Object) null);
        return q(0, aVar.f3259c, k(objArr, this.f12967e, i10, e10, aVar));
    }
}
