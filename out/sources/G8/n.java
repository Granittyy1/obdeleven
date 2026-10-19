package G8;

/* JADX INFO: compiled from: DeviceBonusWithSerialNumber.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f3525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3526b;

    public n(l lVar, String serialNumber) {
        kotlin.jvm.internal.i.e(serialNumber, "serialNumber");
        this.f3525a = lVar;
        this.f3526b = serialNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.i.a(this.f3525a, nVar.f3525a) && kotlin.jvm.internal.i.a(this.f3526b, nVar.f3526b);
    }

    public final int hashCode() {
        return this.f3526b.hashCode() + (this.f3525a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceBonusWithSerialNumber(deviceBonus=" + this.f3525a + ", serialNumber=" + this.f3526b + ")";
    }
}
