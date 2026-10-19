package B4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_BatchedLogRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1565a;

    public g(ArrayList arrayList) {
        this.f1565a = arrayList;
    }

    @Override // B4.k
    public final List<m> a() {
        return this.f1565a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f1565a.equals(((k) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1565a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f1565a + "}";
    }
}
