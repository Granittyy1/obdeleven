package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends f0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f0.d.a> f669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f670b;

    public E() {
        throw null;
    }

    public E(List list, String str) {
        this.f669a = list;
        this.f670b = str;
    }

    @Override // A6.f0.d
    public final List<f0.d.a> a() {
        return this.f669a;
    }

    @Override // A6.f0.d
    public final String b() {
        return this.f670b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d)) {
            return false;
        }
        f0.d dVar = (f0.d) obj;
        if (this.f669a.equals(dVar.a())) {
            String str = this.f670b;
            if (str == null) {
                if (dVar.b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f669a.hashCode() ^ 1000003) * 1000003;
        String str = this.f670b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f669a);
        sb2.append(", orgId=");
        return Q8.d.a(sb2, this.f670b, "}");
    }
}
