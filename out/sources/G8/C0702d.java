package G8;

/* JADX INFO: renamed from: G8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BluetoothFirmwareVersion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0702d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3450c;

    public C0702d(String str, String str2, String str3) {
        this.f3448a = str;
        this.f3449b = str2;
        this.f3450c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0702d)) {
            return false;
        }
        C0702d c0702d = (C0702d) obj;
        return kotlin.jvm.internal.i.a(this.f3448a, c0702d.f3448a) && kotlin.jvm.internal.i.a(this.f3449b, c0702d.f3449b) && kotlin.jvm.internal.i.a(this.f3450c, c0702d.f3450c);
    }

    public final int hashCode() {
        return this.f3450c.hashCode() + B1.a.b(this.f3449b, this.f3448a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BluetoothFirmwareVersion(prefix=");
        sb2.append(this.f3448a);
        sb2.append(", version=");
        sb2.append(this.f3449b);
        sb2.append(", firmwareObjectId=");
        return Q8.d.a(sb2, this.f3450c, ")");
    }
}
