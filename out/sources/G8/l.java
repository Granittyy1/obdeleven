package G8;

import com.voltasit.obdeleven.domain.models.SubscriptionType;

/* JADX INFO: compiled from: DeviceBonus.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubscriptionType f3517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3519d;

    public l(String deviceId, SubscriptionType subscriptionType, int i10, boolean z10) {
        kotlin.jvm.internal.i.e(deviceId, "deviceId");
        this.f3516a = deviceId;
        this.f3517b = subscriptionType;
        this.f3518c = i10;
        this.f3519d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.i.a(this.f3516a, lVar.f3516a) && this.f3517b == lVar.f3517b && this.f3518c == lVar.f3518c && this.f3519d == lVar.f3519d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3519d) + p005a4.q.b(this.f3518c, (this.f3517b.hashCode() + (this.f3516a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "DeviceBonus(deviceId=" + this.f3516a + ", subscriptionBonusType=" + this.f3517b + ", credits=" + this.f3518c + ", isPinSet=" + this.f3519d + ")";
    }
}
