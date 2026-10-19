package androidx.work.impl.constraints;

import Z3.o;

/* JADX INFO: compiled from: NetworkState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20395d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f20392a = z10;
        this.f20393b = z11;
        this.f20394c = z12;
        this.f20395d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f20392a == cVar.f20392a && this.f20393b == cVar.f20393b && this.f20394c == cVar.f20394c && this.f20395d == cVar.f20395d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z10 = this.f20392a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.f20393b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f20394c;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.f20395d;
        return i12 + (z13 ? 1 : z13);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f20392a);
        sb2.append(", isValidated=");
        sb2.append(this.f20393b);
        sb2.append(", isMetered=");
        sb2.append(this.f20394c);
        sb2.append(", isNotRoaming=");
        return o.d(sb2, this.f20395d, ')');
    }
}
