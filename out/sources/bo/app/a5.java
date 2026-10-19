package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f20722a;

    public a5(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f20722a = request;
    }

    public final d2 a() {
        return this.f20722a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && kotlin.jvm.internal.i.a(this.f20722a, ((a5) obj).f20722a);
    }

    public int hashCode() {
        return this.f20722a.hashCode();
    }

    public String toString() {
        return "RequestDispatchStartedEvent(request=" + this.f20722a + ')';
    }
}
