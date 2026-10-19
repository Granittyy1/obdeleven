package G8;

import com.voltasit.obdeleven.domain.models.ControlUnitStatus;

/* JADX INFO: compiled from: TranslatedControlUnit.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f3406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ControlUnitStatus f3409d;

    public C(short s10, String str, String str2, ControlUnitStatus status) {
        kotlin.jvm.internal.i.e(status, "status");
        this.f3406a = s10;
        this.f3407b = str;
        this.f3408c = str2;
        this.f3409d = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f3406a == c10.f3406a && kotlin.jvm.internal.i.a(this.f3407b, c10.f3407b) && kotlin.jvm.internal.i.a(this.f3408c, c10.f3408c) && this.f3409d == c10.f3409d;
    }

    public final int hashCode() {
        return this.f3409d.hashCode() + B1.a.b(this.f3408c, B1.a.b(this.f3407b, Short.hashCode(this.f3406a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = C7.g.a("TranslatedControlUnit(id=", p293xa.p.a(this.f3406a), ", imageUrl=");
        sbA.append(this.f3407b);
        sbA.append(", name=");
        sbA.append(this.f3408c);
        sbA.append(", status=");
        sbA.append(this.f3409d);
        sbA.append(")");
        return sbA.toString();
    }
}
