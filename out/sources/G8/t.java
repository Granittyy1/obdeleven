package G8;

/* JADX INFO: compiled from: PersonalInfoUpdate.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3542b;

    public t(boolean z10, boolean z11) {
        this.f3541a = z10;
        this.f3542b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3541a == tVar.f3541a && this.f3542b == tVar.f3542b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3542b) + (Boolean.hashCode(this.f3541a) * 31);
    }

    public final String toString() {
        return "PersonalInfoUpdate(personalInfoUpdateSoon=" + this.f3541a + ", personalInfoUpdateRequired=" + this.f3542b + ")";
    }
}
