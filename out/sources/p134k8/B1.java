package p134k8;

import com.obdeleven.service.odx.model.ODX;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OdxData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ODX f42572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42573b;

    public B1(ODX odx, String platform) {
        i.e(platform, "platform");
        this.f42572a = odx;
        this.f42573b = platform;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b10 = (B1) obj;
        return i.a(this.f42572a, b10.f42572a) && i.a(this.f42573b, b10.f42573b);
    }

    public final int hashCode() {
        return this.f42573b.hashCode() + (this.f42572a.hashCode() * 31);
    }

    public final String toString() {
        return "OdxData(data=" + this.f42572a + ", platform=" + this.f42573b + ")";
    }
}
