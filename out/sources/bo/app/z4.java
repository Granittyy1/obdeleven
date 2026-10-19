package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f22261a;

    public z4(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f22261a = request;
    }

    public final d2 a() {
        return this.f22261a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4) && kotlin.jvm.internal.i.a(this.f22261a, ((z4) obj).f22261a);
    }

    public int hashCode() {
        return this.f22261a.hashCode();
    }

    public String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.f22261a + ')';
    }
}
