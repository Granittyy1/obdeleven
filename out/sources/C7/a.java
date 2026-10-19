package C7;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: AutoValue_ConfigUpdate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f2425a;

    public a(HashSet hashSet) {
        this.f2425a = hashSet;
    }

    @Override // C7.b
    public final Set<String> a() {
        return this.f2425a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f2425a.equals(((b) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2425a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f2425a + "}";
    }
}
