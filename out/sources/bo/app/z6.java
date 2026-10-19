package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x2 f22264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c3 f22265b;

    public z6(x2 originalTriggerEvent, c3 failedTriggeredAction) {
        kotlin.jvm.internal.i.e(originalTriggerEvent, "originalTriggerEvent");
        kotlin.jvm.internal.i.e(failedTriggeredAction, "failedTriggeredAction");
        this.f22264a = originalTriggerEvent;
        this.f22265b = failedTriggeredAction;
    }

    public final x2 a() {
        return this.f22264a;
    }

    public final c3 b() {
        return this.f22265b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return kotlin.jvm.internal.i.a(this.f22264a, z6Var.f22264a) && kotlin.jvm.internal.i.a(this.f22265b, z6Var.f22265b);
    }

    public int hashCode() {
        return this.f22265b.hashCode() + (this.f22264a.hashCode() * 31);
    }

    public String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f22264a + ", failedTriggeredAction=" + this.f22265b + ')';
    }
}
