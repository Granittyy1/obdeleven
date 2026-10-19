package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G implements Iterator<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0 f12839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12842e;

    public G(A0 a10, int i10, int i11) {
        this.f12839b = a10;
        this.f12840c = i11;
        this.f12841d = i10;
        this.f12842e = a10.f12777i;
        if (a10.f12776h) {
            C0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12841d < this.f12840c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        A0 a10 = this.f12839b;
        int i10 = a10.f12777i;
        int i11 = this.f12842e;
        if (i10 != i11) {
            C0.f();
        }
        int i12 = this.f12841d;
        this.f12841d = C0.a(a10.f12770b, i12) + i12;
        return new B0(a10, i12, i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
