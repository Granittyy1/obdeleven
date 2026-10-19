package J4;

/* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3974f;

    public a(long j, int i10, int i11, long j10, int i12) {
        this.f3970b = j;
        this.f3971c = i10;
        this.f3972d = i11;
        this.f3973e = j10;
        this.f3974f = i12;
    }

    @Override // J4.e
    public final int a() {
        return this.f3972d;
    }

    @Override // J4.e
    public final long b() {
        return this.f3973e;
    }

    @Override // J4.e
    public final int c() {
        return this.f3971c;
    }

    @Override // J4.e
    public final int d() {
        return this.f3974f;
    }

    @Override // J4.e
    public final long e() {
        return this.f3970b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3970b == eVar.e() && this.f3971c == eVar.c() && this.f3972d == eVar.a() && this.f3973e == eVar.b() && this.f3974f == eVar.d();
    }

    public final int hashCode() {
        long j = this.f3970b;
        int i10 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3971c) * 1000003) ^ this.f3972d) * 1000003;
        long j10 = this.f3973e;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f3974f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f3970b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f3971c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f3972d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f3973e);
        sb2.append(", maxBlobByteSizePerRow=");
        return p005a4.q.c(sb2, this.f3974f, "}");
    }
}
