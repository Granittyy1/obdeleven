package p108i7;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36761c;

    public a(String str, long j, long j10) {
        this.f36759a = str;
        this.f36760b = j;
        this.f36761c = j10;
    }

    @Override // p108i7.f
    public final String a() {
        return this.f36759a;
    }

    @Override // p108i7.f
    public final long b() {
        return this.f36761c;
    }

    @Override // p108i7.f
    public final long c() {
        return this.f36760b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f36759a.equals(fVar.a()) && this.f36760b == fVar.c() && this.f36761c == fVar.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f36759a.hashCode() ^ 1000003) * 1000003;
        long j = this.f36760b;
        long j10 = this.f36761c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f36759a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f36760b);
        sb2.append(", tokenCreationTimestamp=");
        return o.d(this.f36761c, "}", sb2);
    }
}
