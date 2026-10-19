package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x2 f21919a;

    public s6(x2 triggerEvent) {
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        this.f21919a = triggerEvent;
    }

    public final x2 a() {
        return this.f21919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6) && kotlin.jvm.internal.i.a(this.f21919a, ((s6) obj).f21919a);
    }

    public int hashCode() {
        return this.f21919a.hashCode();
    }

    public String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f21919a + ')';
    }
}
