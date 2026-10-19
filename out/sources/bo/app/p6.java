package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21760a;

    public p6(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f21760a = request;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6) && kotlin.jvm.internal.i.a(this.f21760a, ((p6) obj).f21760a);
    }

    public int hashCode() {
        return this.f21760a.hashCode();
    }

    public String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f21760a + ')';
    }
}
