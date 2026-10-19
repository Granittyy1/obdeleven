package J4;

/* JADX INFO: compiled from: AutoValue_PersistedEvent.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.t f3976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.o f3977c;

    public b(long j, C4.t tVar, C4.o oVar) {
        this.f3975a = j;
        if (tVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f3976b = tVar;
        if (oVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f3977c = oVar;
    }

    @Override // J4.h
    public final C4.o a() {
        return this.f3977c;
    }

    @Override // J4.h
    public final long b() {
        return this.f3975a;
    }

    @Override // J4.h
    public final C4.t c() {
        return this.f3976b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3975a == hVar.b() && this.f3976b.equals(hVar.c()) && this.f3977c.equals(hVar.a());
    }

    public final int hashCode() {
        long j = this.f3975a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f3976b.hashCode()) * 1000003) ^ this.f3977c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f3975a + ", transportContext=" + this.f3976b + ", event=" + this.f3977c + "}";
    }
}
