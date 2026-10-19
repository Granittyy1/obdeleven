package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2 f21918a;

    public s5(r2 responseError) {
        kotlin.jvm.internal.i.e(responseError, "responseError");
        this.f21918a = responseError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5) && kotlin.jvm.internal.i.a(this.f21918a, ((s5) obj).f21918a);
    }

    public int hashCode() {
        return this.f21918a.hashCode();
    }

    public String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f21918a + ')';
    }
}
