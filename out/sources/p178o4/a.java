package p178o4;

import Z3.o;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: GateKeeper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45215b;

    public a(String name, boolean z10) {
        i.e(name, "name");
        this.f45214a = name;
        this.f45215b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f45214a, aVar.f45214a) && this.f45215b == aVar.f45215b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f45214a.hashCode() * 31;
        boolean z10 = this.f45215b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.f45214a);
        sb2.append(", value=");
        return o.d(sb2, this.f45215b, ')');
    }
}
