package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t5 f22151a;

    public w5(t5 sealedSession) {
        kotlin.jvm.internal.i.e(sealedSession, "sealedSession");
        this.f22151a = sealedSession;
    }

    public final t5 a() {
        return this.f22151a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && kotlin.jvm.internal.i.a(this.f22151a, ((w5) obj).f22151a);
    }

    public int hashCode() {
        return this.f22151a.hashCode();
    }

    public String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f22151a + ')';
    }
}
