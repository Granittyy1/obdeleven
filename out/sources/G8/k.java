package G8;

import com.obdeleven.service.interfaces.IDevice;

/* JADX INFO: compiled from: DeviceAndConnectionState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDevice f3513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f3515c;

    public k(int i10, IDevice device, Throwable th) {
        kotlin.jvm.internal.i.e(device, "device");
        this.f3513a = device;
        this.f3514b = i10;
        this.f3515c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.i.a(this.f3513a, kVar.f3513a) && this.f3514b == kVar.f3514b && kotlin.jvm.internal.i.a(this.f3515c, kVar.f3515c);
    }

    public final int hashCode() {
        int iB = p005a4.q.b(this.f3514b, this.f3513a.hashCode() * 31, 31);
        Throwable th = this.f3515c;
        return iB + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "DeviceAndConnectionState(device=" + this.f3513a + ", state=" + this.f3514b + ", exception=" + this.f3515c + ")";
    }
}
