package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y extends f0.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f0.e.d.AbstractC0015e> f806a;

    public Y() {
        throw null;
    }

    public Y(List list) {
        this.f806a = list;
    }

    @Override // A6.f0.e.d.f
    public final List<f0.e.d.AbstractC0015e> a() {
        return this.f806a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.f) {
            return this.f806a.equals(((f0.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f806a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f806a + "}";
    }
}
