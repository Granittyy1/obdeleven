package Q2;

import A1.C0575j;

/* JADX INFO: renamed from: Q2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SystemIdInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0732i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5020c;

    public C0732i(String workSpecId, int i10, int i11) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f5018a = workSpecId;
        this.f5019b = i10;
        this.f5020c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0732i)) {
            return false;
        }
        C0732i c0732i = (C0732i) obj;
        return kotlin.jvm.internal.i.a(this.f5018a, c0732i.f5018a) && this.f5019b == c0732i.f5019b && this.f5020c == c0732i.f5020c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5020c) + p005a4.q.b(this.f5019b, this.f5018a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f5018a);
        sb2.append(", generation=");
        sb2.append(this.f5019b);
        sb2.append(", systemId=");
        return C0575j.b(sb2, this.f5020c, ')');
    }
}
