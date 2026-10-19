package E;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import p114j1.C2479a;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f<K, V> f2945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f2946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2948h;

    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.f2941d, uVarArr);
        this.f2945e = fVar;
        this.f2948h = fVar.f2943f;
    }

    public final void c(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        u<K, V, T>[] uVarArr = this.f2936b;
        if (i12 <= 30) {
            int iK = 1 << C2479a.k(i10, i12);
            if (tVar.h(iK)) {
                uVarArr[i11].a(Integer.bitCount(tVar.f2957a) * 2, tVar.f(iK), tVar.f2960d);
                this.f2937c = i11;
                return;
            }
            int iT = tVar.t(iK);
            t<?, ?> tVarS = tVar.s(iT);
            uVarArr[i11].a(Integer.bitCount(tVar.f2957a) * 2, iT, tVar.f2960d);
            c(i10, tVarS, k10, i11 + 1);
            return;
        }
        u<K, V, T> uVar = uVarArr[i11];
        Object[] objArr = tVar.f2960d;
        uVar.a(objArr.length, 0, objArr);
        while (true) {
            u<K, V, T> uVar2 = uVarArr[i11];
            if (kotlin.jvm.internal.i.a(uVar2.f2963b[uVar2.f2965d], k10)) {
                this.f2937c = i11;
                return;
            } else {
                uVarArr[i11].f2965d += 2;
            }
        }
    }

    @Override // E.e, java.util.Iterator
    public final T next() {
        if (this.f2945e.f2943f != this.f2948h) {
            throw new ConcurrentModificationException();
        }
        if (!this.f2938d) {
            throw new NoSuchElementException();
        }
        u<K, V, T> uVar = this.f2936b[this.f2937c];
        this.f2946f = (K) uVar.f2963b[uVar.f2965d];
        this.f2947g = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E.e, java.util.Iterator
    public final void remove() {
        if (!this.f2947g) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f2938d;
        f<K, V> fVar = this.f2945e;
        if (!z10) {
            kotlin.jvm.internal.o.c(fVar).remove(this.f2946f);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            u<K, V, T> uVar = this.f2936b[this.f2937c];
            Object obj = uVar.f2963b[uVar.f2965d];
            kotlin.jvm.internal.o.c(fVar).remove(this.f2946f);
            c(obj != null ? obj.hashCode() : 0, fVar.f2941d, obj, 0);
        }
        this.f2946f = null;
        this.f2947g = false;
        this.f2948h = fVar.f2943f;
    }
}
