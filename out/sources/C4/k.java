package C4;

/* JADX INFO: compiled from: AutoValue_SendRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p311z4.a f2377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p311z4.f<?, byte[]> f2378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p311z4.c f2379e;

    public k(l lVar, String str, p311z4.a aVar, p311z4.f fVar, p311z4.c cVar) {
        this.f2375a = lVar;
        this.f2376b = str;
        this.f2377c = aVar;
        this.f2378d = fVar;
        this.f2379e = cVar;
    }

    @Override // C4.s
    public final p311z4.c a() {
        return this.f2379e;
    }

    @Override // C4.s
    public final p311z4.d<?> b() {
        return this.f2377c;
    }

    @Override // C4.s
    public final p311z4.f<?, byte[]> c() {
        return this.f2378d;
    }

    @Override // C4.s
    public final t d() {
        return this.f2375a;
    }

    @Override // C4.s
    public final String e() {
        return this.f2376b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2375a.equals(sVar.d()) && this.f2376b.equals(sVar.e()) && this.f2377c.equals(sVar.b()) && this.f2378d.equals(sVar.c()) && this.f2379e.equals(sVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f2375a.hashCode() ^ 1000003) * 1000003) ^ this.f2376b.hashCode()) * 1000003) ^ this.f2377c.hashCode()) * 1000003) ^ this.f2378d.hashCode()) * 1000003) ^ this.f2379e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f2375a + ", transportName=" + this.f2376b + ", event=" + this.f2377c + ", transformer=" + this.f2378d + ", encoding=" + this.f2379e + "}";
    }
}
