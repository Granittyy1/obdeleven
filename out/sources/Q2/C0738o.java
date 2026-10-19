package Q2;

import A1.C0575j;

/* JADX INFO: renamed from: Q2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0738o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5026b;

    public C0738o(String workSpecId, int i10) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f5025a = workSpecId;
        this.f5026b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0738o)) {
            return false;
        }
        C0738o c0738o = (C0738o) obj;
        return kotlin.jvm.internal.i.a(this.f5025a, c0738o.f5025a) && this.f5026b == c0738o.f5026b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5026b) + (this.f5025a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f5025a);
        sb2.append(", generation=");
        return C0575j.b(sb2, this.f5026b, ')');
    }
}
