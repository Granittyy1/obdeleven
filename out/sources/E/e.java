package E;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u<K, V, T>[] f2936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2938d = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.f2936b = uVarArr;
        uVarArr[0].a(Integer.bitCount(tVar.f2957a) * 2, 0, tVar.f2960d);
        this.f2937c = 0;
        a();
    }

    public final void a() {
        int i10 = this.f2937c;
        u<K, V, T>[] uVarArr = this.f2936b;
        u<K, V, T> uVar = uVarArr[i10];
        if (uVar.f2965d < uVar.f2964c) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                u<K, V, T> uVar2 = uVarArr[i10];
                int i11 = uVar2.f2965d;
                Object[] objArr = uVar2.f2963b;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    uVar2.f2965d = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f2937c = iB;
                return;
            }
            if (i10 > 0) {
                u<K, V, T> uVar3 = uVarArr[i10 - 1];
                int i12 = uVar3.f2965d;
                int length2 = uVar3.f2963b.length;
                uVar3.f2965d = i12 + 1;
            }
            uVarArr[i10].a(0, 0, t.f2956e.f2960d);
            i10--;
        }
        this.f2938d = false;
    }

    public final int b(int i10) {
        u<K, V, T>[] uVarArr = this.f2936b;
        u<K, V, T> uVar = uVarArr[i10];
        int i11 = uVar.f2965d;
        if (i11 < uVar.f2964c) {
            return i10;
        }
        Object[] objArr = uVar.f2963b;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        t tVar = (t) obj;
        if (i10 == 6) {
            u<K, V, T> uVar2 = uVarArr[i10 + 1];
            Object[] objArr2 = tVar.f2960d;
            uVar2.a(objArr2.length, 0, objArr2);
        } else {
            uVarArr[i10 + 1].a(Integer.bitCount(tVar.f2957a) * 2, 0, tVar.f2960d);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2938d;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f2938d) {
            throw new NoSuchElementException();
        }
        T next = this.f2936b[this.f2937c].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
