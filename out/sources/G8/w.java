package G8;

/* JADX INFO: compiled from: SfdProtectionStatus.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3555c;

    public w(int i10, boolean z10, boolean z11) {
        this.f3553a = z10;
        this.f3554b = i10;
        this.f3555c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f3553a == wVar.f3553a && this.f3554b == wVar.f3554b && this.f3555c == wVar.f3555c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3555c) + p005a4.q.b(this.f3554b, Boolean.hashCode(this.f3553a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SfdProtectionStatus(isUnlocked=");
        sb2.append(this.f3553a);
        sb2.append(", unlockedTimeRemaining=");
        sb2.append(this.f3554b);
        sb2.append(", isUnlockedFor200Km=");
        return C4.v.f(sb2, this.f3555c, ")");
    }
}
