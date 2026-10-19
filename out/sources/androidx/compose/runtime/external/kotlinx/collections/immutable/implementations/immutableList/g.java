package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import A8.p;
import Ia.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.k;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SmallPersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g<E> extends AbstractPersistentList<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f12975c = new g(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f12976b;

    public g(Object[] objArr) {
        this.f12976b = objArr;
    }

    @Override // D.b
    public final D.b<E> E(int i10) {
        Object[] objArr = this.f12976b;
        p.i(i10, objArr.length);
        if (objArr.length == 1) {
            return f12975c;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        i.d(objArrCopyOf, "copyOf(...)");
        Q3.d.n(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new g(objArrCopyOf);
    }

    @Override // D.b
    public final D.b<E> F(l<? super E, Boolean> lVar) {
        Object[] objArr = this.f12976b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) ((AbstractPersistentList.AnonymousClass1) lVar).invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    i.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f12975c : new g(Q3.d.u(0, length, objArrCopyOf));
    }

    @Override // java.util.List, D.b
    public final D.b<E> add(int i10, E e10) {
        Object[] objArr = this.f12976b;
        p.l(i10, objArr.length);
        if (i10 == objArr.length) {
            return add((Object) e10);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            Q3.d.r(0, i10, 6, objArr, objArr2);
            Q3.d.n(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = e10;
            return new g(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        i.d(objArrCopyOf, "copyOf(...)");
        Q3.d.n(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = e10;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new c(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, D.b
    public final D.b<E> addAll(Collection<? extends E> collection) {
        Object[] objArr = this.f12976b;
        if (collection.size() + objArr.length > 32) {
            PersistentVectorBuilder persistentVectorBuilderI = i();
            persistentVectorBuilderI.addAll(collection);
            return persistentVectorBuilderI.q();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        i.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new g(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f12976b.length;
    }

    @Override // java.util.List
    public final E get(int i10) {
        p.i(i10, e());
        return (E) this.f12976b[i10];
    }

    @Override // D.b
    public final PersistentVectorBuilder i() {
        return new PersistentVectorBuilder(this, null, this.f12976b, 0);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final int indexOf(Object obj) {
        return k.T(obj, this.f12976b);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f12976b;
        i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i11 = length2 - 1;
                if (obj.equals(objArr[length2])) {
                    return length2;
                }
                if (i11 < 0) {
                    return -1;
                }
                length2 = i11;
            }
        }
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        p.l(i10, e());
        return new b(i10, e(), this.f12976b);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List, D.b
    public final D.b<E> set(int i10, E e10) {
        Object[] objArr = this.f12976b;
        p.i(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        i.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = e10;
        return new g(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, D.b
    public final D.b<E> add(E e10) {
        Object[] objArr = this.f12976b;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            i.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[objArr.length] = e10;
            return new g(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e10;
        return new c(objArr, objArr2, objArr.length + 1, 0);
    }
}
