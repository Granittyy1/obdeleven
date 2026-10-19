package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21917a;

    public s4(long j) {
        this.f21917a = j;
    }

    public final long a() {
        return this.f21917a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4) && this.f21917a == ((s4) obj).f21917a;
    }

    public int hashCode() {
        return Long.hashCode(this.f21917a);
    }

    public String toString() {
        return C4.a.h(new StringBuilder("PushMaxRequestSuccessEvent(lastUpdateTime="), this.f21917a, ')');
    }
}
