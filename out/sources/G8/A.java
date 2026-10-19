package G8;

import java.util.List;

/* JADX INFO: compiled from: SubscriptionProductTranslations.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3403d;

    public A(String str, String str2, String str3, List bulletPoints) {
        kotlin.jvm.internal.i.e(bulletPoints, "bulletPoints");
        this.f3400a = str;
        this.f3401b = str2;
        this.f3402c = bulletPoints;
        this.f3403d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f3400a.equals(a10.f3400a) && this.f3401b.equals(a10.f3401b) && kotlin.jvm.internal.i.a(this.f3402c, a10.f3402c) && this.f3403d.equals(a10.f3403d);
    }

    public final int hashCode() {
        return this.f3403d.hashCode() + ((this.f3402c.hashCode() + B1.a.b(this.f3401b, this.f3400a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionProductTranslations(title=");
        sb2.append(this.f3400a);
        sb2.append(", subtitle=");
        sb2.append(this.f3401b);
        sb2.append(", bulletPoints=");
        sb2.append(this.f3402c);
        sb2.append(", subscriptionDuration=");
        return Q8.d.a(sb2, this.f3403d, ")");
    }
}
