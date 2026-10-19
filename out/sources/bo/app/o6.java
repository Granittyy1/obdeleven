package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21712a;

    public o6(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f21712a = request;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6) && kotlin.jvm.internal.i.a(this.f21712a, ((o6) obj).f21712a);
    }

    public int hashCode() {
        return this.f21712a.hashCode();
    }

    public String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f21712a + ')';
    }
}
