package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f22000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t3 f22001b;

    public u3(t3 oldNetworkLevel, t3 newNetworkLevel) {
        kotlin.jvm.internal.i.e(oldNetworkLevel, "oldNetworkLevel");
        kotlin.jvm.internal.i.e(newNetworkLevel, "newNetworkLevel");
        this.f22000a = oldNetworkLevel;
        this.f22001b = newNetworkLevel;
    }

    public final t3 a() {
        return this.f22001b;
    }

    public final t3 b() {
        return this.f22000a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.f22000a == u3Var.f22000a && this.f22001b == u3Var.f22001b;
    }

    public int hashCode() {
        return this.f22001b.hashCode() + (this.f22000a.hashCode() * 31);
    }

    public String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f22000a + ", newNetworkLevel=" + this.f22001b + ')';
    }
}
