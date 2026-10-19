package G8;

import com.voltasit.obdeleven.domain.models.SubscriptionType;

/* JADX INFO: compiled from: UserDetails.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionType f3410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3412c;

    public /* synthetic */ D() {
        this(SubscriptionType.None, "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f3410a == d10.f3410a && kotlin.jvm.internal.i.a(this.f3411b, d10.f3411b) && this.f3412c == d10.f3412c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3412c) + B1.a.b(this.f3411b, this.f3410a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserDetails(subscriptionType=");
        sb2.append(this.f3410a);
        sb2.append(", expirationDate=");
        sb2.append(this.f3411b);
        sb2.append(", isPasswordWeak=");
        return C4.v.f(sb2, this.f3412c, ")");
    }

    public D(SubscriptionType subscriptionType, String str, boolean z10) {
        this.f3410a = subscriptionType;
        this.f3411b = str;
        this.f3412c = z10;
    }
}
