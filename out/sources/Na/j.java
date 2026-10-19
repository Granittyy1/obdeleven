package Na;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Iterator, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4698e;

    public j(long j, long j10, long j11) {
        this.f4695b = j11;
        this.f4696c = j10;
        boolean z10 = false;
        if (j11 <= 0 ? j >= j10 : j <= j10) {
            z10 = true;
        }
        this.f4697d = z10;
        this.f4698e = z10 ? j : j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4697d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f4698e;
        if (j != this.f4696c) {
            this.f4698e = this.f4695b + j;
        } else {
            if (!this.f4697d) {
                throw new NoSuchElementException();
            }
            this.f4697d = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
