package p083g7;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_RateLimit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35608a = "APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35610c;

    public b(long j, long j10) {
        this.f35609b = j;
        this.f35610c = j10;
    }

    @Override // p083g7.m
    public final long a() {
        return this.f35609b;
    }

    @Override // p083g7.m
    public final String b() {
        return this.f35608a;
    }

    @Override // p083g7.m
    public final long c() {
        return this.f35610c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f35608a.equals(mVar.b()) && this.f35609b == mVar.a() && this.f35610c == mVar.c();
    }

    public final int hashCode() {
        int iHashCode = (this.f35608a.hashCode() ^ 1000003) * 1000003;
        long j = this.f35609b;
        long j10 = this.f35610c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateLimit{limiterKey=");
        sb2.append(this.f35608a);
        sb2.append(", limit=");
        sb2.append(this.f35609b);
        sb2.append(", timeToLiveMillis=");
        return o.d(this.f35610c, "}", sb2);
    }
}
