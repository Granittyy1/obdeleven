package I8;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OriginalCommandValue.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3930b;

    public e(int i10, String value) {
        i.e(value, "value");
        this.f3929a = i10;
        this.f3930b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3929a == eVar.f3929a && i.a(this.f3930b, eVar.f3930b);
    }

    public final int hashCode() {
        return this.f3930b.hashCode() + (Integer.hashCode(this.f3929a) * 31);
    }

    public final String toString() {
        return "OriginalCommandValue(index=" + this.f3929a + ", value=" + this.f3930b + ")";
    }
}
