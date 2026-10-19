package G7;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: AutoValue_RolloutsState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f3398a;

    public c(HashSet hashSet) {
        this.f3398a = hashSet;
    }

    @Override // G7.e
    public final Set<d> a() {
        return this.f3398a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f3398a.equals(((e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3398a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f3398a + "}";
    }
}
