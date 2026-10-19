package G8;

/* JADX INFO: compiled from: DeviceBonusRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3524e;

    public m(String cpuId, String serialNumber, String mac, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.e(cpuId, "cpuId");
        kotlin.jvm.internal.i.e(serialNumber, "serialNumber");
        kotlin.jvm.internal.i.e(mac, "mac");
        this.f3520a = cpuId;
        this.f3521b = serialNumber;
        this.f3522c = mac;
        this.f3523d = z10;
        this.f3524e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.i.a(this.f3520a, mVar.f3520a) && kotlin.jvm.internal.i.a(this.f3521b, mVar.f3521b) && kotlin.jvm.internal.i.a(this.f3522c, mVar.f3522c) && this.f3523d == mVar.f3523d && this.f3524e == mVar.f3524e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3524e) + androidx.compose.animation.D.b(B1.a.b(this.f3522c, B1.a.b(this.f3521b, this.f3520a.hashCode() * 31, 31), 31), 31, this.f3523d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceBonusRequest(cpuId=");
        sb2.append(this.f3520a);
        sb2.append(", serialNumber=");
        sb2.append(this.f3521b);
        sb2.append(", mac=");
        sb2.append(this.f3522c);
        sb2.append(", consumePro=");
        sb2.append(this.f3523d);
        sb2.append(", consumeCredits=");
        return C4.v.f(sb2, this.f3524e, ")");
    }
}
