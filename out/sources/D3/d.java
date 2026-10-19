package D3;

import java.security.MessageDigest;

/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements A3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3.b f2719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A3.b f2720c;

    public d(A3.b bVar, A3.b bVar2) {
        this.f2719b = bVar;
        this.f2720c = bVar2;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        this.f2719b.a(messageDigest);
        this.f2720c.a(messageDigest);
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2719b.equals(dVar.f2719b) && this.f2720c.equals(dVar.f2720c);
    }

    @Override // A3.b
    public final int hashCode() {
        return this.f2720c.hashCode() + (this.f2719b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f2719b + ", signature=" + this.f2720c + '}';
    }
}
