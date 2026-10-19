package G8;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3512e;

    public j(int i10, String str, String str2, String str3, String str4) {
        this.f3508a = str;
        this.f3509b = str2;
        this.f3510c = str3;
        this.f3511d = str4;
        this.f3512e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(this.f3508a, jVar.f3508a) && kotlin.jvm.internal.i.a(this.f3509b, jVar.f3509b) && kotlin.jvm.internal.i.a(this.f3510c, jVar.f3510c) && kotlin.jvm.internal.i.a(this.f3511d, jVar.f3511d) && this.f3512e == jVar.f3512e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3512e) + B1.a.b(this.f3511d, B1.a.b(this.f3510c, B1.a.b(this.f3509b, this.f3508a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(mac=");
        sb2.append(this.f3508a);
        sb2.append(", serialNumber=");
        sb2.append(this.f3509b);
        sb2.append(", cpuId=");
        sb2.append(this.f3510c);
        sb2.append(", version=");
        sb2.append(this.f3511d);
        sb2.append(", gen=");
        return p005a4.q.c(sb2, this.f3512e, ")");
    }
}
