package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21780a;

    public q0(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f21780a = request;
    }

    public final d2 a() {
        return this.f21780a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && kotlin.jvm.internal.i.a(this.f21780a, ((q0) obj).f21780a);
    }

    public int hashCode() {
        return this.f21780a.hashCode();
    }

    public String toString() {
        return "DispatchSucceededEvent(request=" + this.f21780a + ')';
    }
}
