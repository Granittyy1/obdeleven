package p078g1;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import p114j1.A;

/* JADX INFO: compiled from: TrackSelectionOverride.java */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f35496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<Integer> f35497b;

    static {
        A.B(0);
        A.B(1);
    }

    public z(y yVar, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= yVar.f35491a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f35496a = yVar;
        this.f35497b = ImmutableList.G(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f35496a.equals(zVar.f35496a) && this.f35497b.equals(zVar.f35497b);
    }

    public final int hashCode() {
        return (this.f35497b.hashCode() * 31) + this.f35496a.hashCode();
    }
}
