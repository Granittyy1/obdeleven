package p131k5;

import java.util.Iterator;

/* JADX INFO: renamed from: k5.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2580x implements Iterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<String> f42524b;

    public C2580x(C2568u c2568u) {
        this.f42524b = c2568u.f42473b.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42524b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f42524b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
