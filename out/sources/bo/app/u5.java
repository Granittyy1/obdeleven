package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t5 f22008a;

    public u5(t5 session) {
        kotlin.jvm.internal.i.e(session, "session");
        this.f22008a = session;
        if (session.y()) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.");
        }
    }

    public final t5 a() {
        return this.f22008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5) && kotlin.jvm.internal.i.a(this.f22008a, ((u5) obj).f22008a);
    }

    public int hashCode() {
        return this.f22008a.hashCode();
    }

    public String toString() {
        return "SessionCreatedEvent(session=" + this.f22008a + ')';
    }
}
