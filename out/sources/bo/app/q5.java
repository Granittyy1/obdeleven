package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p5 f21794a;

    public q5(p5 serverConfig) {
        kotlin.jvm.internal.i.e(serverConfig, "serverConfig");
        this.f21794a = serverConfig;
    }

    public final p5 a() {
        return this.f21794a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5) && kotlin.jvm.internal.i.a(this.f21794a, ((q5) obj).f21794a);
    }

    public int hashCode() {
        return this.f21794a.hashCode();
    }

    public String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f21794a + ')';
    }
}
