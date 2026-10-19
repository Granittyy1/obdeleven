package G8;

/* JADX INFO: compiled from: Vehicle.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3433g;

    public H(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f3427a = str;
        this.f3428b = str2;
        this.f3429c = str3;
        this.f3430d = str4;
        this.f3431e = str5;
        this.f3432f = str6;
        this.f3433g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        return kotlin.jvm.internal.i.a(this.f3427a, h8.f3427a) && kotlin.jvm.internal.i.a(this.f3428b, h8.f3428b) && kotlin.jvm.internal.i.a(this.f3429c, h8.f3429c) && kotlin.jvm.internal.i.a(this.f3430d, h8.f3430d) && kotlin.jvm.internal.i.a(this.f3431e, h8.f3431e) && kotlin.jvm.internal.i.a(this.f3432f, h8.f3432f) && kotlin.jvm.internal.i.a(this.f3433g, h8.f3433g);
    }

    public final int hashCode() {
        return this.f3433g.hashCode() + B1.a.b(this.f3432f, B1.a.b(this.f3431e, B1.a.b(this.f3430d, B1.a.b(this.f3429c, B1.a.b(this.f3428b, this.f3427a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vehicle(id=");
        sb2.append(this.f3427a);
        sb2.append(", vin=");
        sb2.append(this.f3428b);
        sb2.append(", make=");
        sb2.append(this.f3429c);
        sb2.append(", model=");
        sb2.append(this.f3430d);
        sb2.append(", year=");
        sb2.append(this.f3431e);
        sb2.append(", picture=");
        sb2.append(this.f3432f);
        sb2.append(", vehicleBaseId=");
        return Q8.d.a(sb2, this.f3433g, ")");
    }
}
