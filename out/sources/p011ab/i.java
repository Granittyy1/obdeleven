package p011ab;

import Ja.a;
import java.util.Iterator;
import p037cb.C1551x;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Iterator<String>, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1551x f8119c;

    public i(C1551x c1551x) {
        this.f8119c = c1551x;
        this.f8118b = c1551x.f22628c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8118b > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        C1551x c1551x = this.f8119c;
        int i10 = this.f8118b;
        this.f8118b = i10 - 1;
        return c1551x.f22630e[c1551x.f22628c - i10];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
