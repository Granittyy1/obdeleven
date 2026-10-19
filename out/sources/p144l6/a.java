package p144l6;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_StartupTime.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44382c;

    public a(long j, long j10, long j11) {
        this.f44380a = j;
        this.f44381b = j10;
        this.f44382c = j11;
    }

    @Override // p144l6.g
    public final long a() {
        return this.f44381b;
    }

    @Override // p144l6.g
    public final long b() {
        return this.f44380a;
    }

    @Override // p144l6.g
    public final long c() {
        return this.f44382c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f44380a == gVar.b() && this.f44381b == gVar.a() && this.f44382c == gVar.c();
    }

    public final int hashCode() {
        long j = this.f44380a;
        long j10 = this.f44381b;
        int i10 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f44382c;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f44380a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f44381b);
        sb2.append(", uptimeMillis=");
        return o.d(this.f44382c, "}", sb2);
    }
}
