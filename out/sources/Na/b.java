package Na;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4684e;

    public b(char c10, char c11, int i10) {
        this.f4681b = i10;
        this.f4682c = c11;
        boolean z10 = false;
        if (i10 <= 0 ? kotlin.jvm.internal.i.g(c10, c11) >= 0 : kotlin.jvm.internal.i.g(c10, c11) <= 0) {
            z10 = true;
        }
        this.f4683d = z10;
        this.f4684e = z10 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4683d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f4684e;
        if (i10 != this.f4682c) {
            this.f4684e = this.f4681b + i10;
        } else {
            if (!this.f4683d) {
                throw new NoSuchElementException();
            }
            this.f4683d = false;
        }
        return Character.valueOf((char) i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
