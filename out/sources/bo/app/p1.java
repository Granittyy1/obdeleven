package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f21716a;

    public p1(q1 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f21716a = request;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && kotlin.jvm.internal.i.a(this.f21716a, ((p1) obj).f21716a);
    }

    public int hashCode() {
        return this.f21716a.hashCode();
    }

    public String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.f21716a + ')';
    }
}
