package bo.app;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f21715b;

    public p0(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f21714a = request;
        this.f21715b = request.d();
    }

    public final d2 a() {
        return this.f21714a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && kotlin.jvm.internal.i.a(this.f21714a, ((p0) obj).f21714a);
    }

    public int hashCode() {
        return this.f21714a.hashCode();
    }

    public String toString() {
        return "DispatchFailedEvent(request=" + this.f21714a + ')';
    }
}
