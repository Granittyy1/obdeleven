package p072f8;

import kotlin.jvm.internal.i;
import p255u9.v;

/* JADX INFO: compiled from: UdsDtc.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f34998b;

    public a(String code, v vVar) {
        i.e(code, "code");
        this.f34997a = code;
        this.f34998b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f34997a, aVar.f34997a) && i.a(this.f34998b, aVar.f34998b);
    }

    public final int hashCode() {
        return this.f34998b.hashCode() + (this.f34997a.hashCode() * 31);
    }

    public final String toString() {
        return "UdsDtc(code=" + this.f34997a + ", dCode=" + this.f34998b + ")";
    }
}
