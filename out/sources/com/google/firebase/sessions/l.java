package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28727d;

    public l(int i10, int i11, String str, boolean z10) {
        this.f28724a = str;
        this.f28725b = i10;
        this.f28726c = i11;
        this.f28727d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.i.a(this.f28724a, lVar.f28724a) && this.f28725b == lVar.f28725b && this.f28726c == lVar.f28726c && this.f28727d == lVar.f28727d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iB = p005a4.q.b(this.f28726c, p005a4.q.b(this.f28725b, this.f28724a.hashCode() * 31, 31), 31);
        boolean z10 = this.f28727d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iB + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f28724a);
        sb2.append(", pid=");
        sb2.append(this.f28725b);
        sb2.append(", importance=");
        sb2.append(this.f28726c);
        sb2.append(", isDefaultProcess=");
        return Z3.o.d(sb2, this.f28727d, ')');
    }
}
