package G8;

/* JADX INFO: renamed from: G8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Country.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0705g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3497c;

    public C0705g(String str, String phoneCode, String countryCode) {
        kotlin.jvm.internal.i.e(phoneCode, "phoneCode");
        kotlin.jvm.internal.i.e(countryCode, "countryCode");
        this.f3495a = str;
        this.f3496b = phoneCode;
        this.f3497c = countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0705g)) {
            return false;
        }
        C0705g c0705g = (C0705g) obj;
        return kotlin.jvm.internal.i.a(this.f3495a, c0705g.f3495a) && kotlin.jvm.internal.i.a(this.f3496b, c0705g.f3496b) && kotlin.jvm.internal.i.a(this.f3497c, c0705g.f3497c);
    }

    public final int hashCode() {
        return this.f3497c.hashCode() + B1.a.b(this.f3496b, this.f3495a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country(title=");
        sb2.append(this.f3495a);
        sb2.append(", phoneCode=");
        sb2.append(this.f3496b);
        sb2.append(", countryCode=");
        return Q8.d.a(sb2, this.f3497c, ")");
    }
}
