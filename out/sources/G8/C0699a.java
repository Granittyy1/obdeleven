package G8;

import com.voltasit.obdeleven.domain.models.AgreementType;

/* JADX INFO: renamed from: G8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Agreement.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0699a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgreementType f3439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3441c;

    public C0699a(AgreementType agreementType, boolean z10, String agreementUrl) {
        kotlin.jvm.internal.i.e(agreementUrl, "agreementUrl");
        this.f3439a = agreementType;
        this.f3440b = z10;
        this.f3441c = agreementUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0699a)) {
            return false;
        }
        C0699a c0699a = (C0699a) obj;
        return this.f3439a == c0699a.f3439a && this.f3440b == c0699a.f3440b && kotlin.jvm.internal.i.a(this.f3441c, c0699a.f3441c);
    }

    public final int hashCode() {
        return this.f3441c.hashCode() + androidx.compose.animation.D.b(this.f3439a.hashCode() * 31, 31, this.f3440b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Agreement(type=");
        sb2.append(this.f3439a);
        sb2.append(", isAgreementSigned=");
        sb2.append(this.f3440b);
        sb2.append(", agreementUrl=");
        return Q8.d.a(sb2, this.f3441c, ")");
    }
}
