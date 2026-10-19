package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.voltasit.obdeleven.domain.usecases.device.u;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TrieIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h<E> extends a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f12978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12979f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public h(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f12977d = i12;
        Object[] objArr2 = new Object[i12];
        this.f12978e = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f12979f = r10;
        objArr2[0] = objArr;
        b(i10 - r10, 1);
    }

    public final E a() {
        int i10 = this.f12961b & 31;
        Object obj = this.f12978e[this.f12977d - 1];
        i.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f12977d - i11) * 5;
        while (i11 < this.f12977d) {
            Object[] objArr = this.f12978e;
            Object obj = objArr[i11 - 1];
            i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[u.i(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (u.i(this.f12961b, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f12961b, ((this.f12977d - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eA = a();
        int i10 = this.f12961b + 1;
        this.f12961b = i10;
        if (i10 == this.f12962c) {
            this.f12979f = true;
            return eA;
        }
        c(0);
        return eA;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f12961b--;
        if (this.f12979f) {
            this.f12979f = false;
            return a();
        }
        c(31);
        return a();
    }
}
