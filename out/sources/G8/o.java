package G8;

/* JADX INFO: compiled from: DeviceFirmwareVersion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3528b;

    public o(int i10, String objectId) {
        kotlin.jvm.internal.i.e(objectId, "objectId");
        this.f3527a = i10;
        this.f3528b = objectId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3527a == oVar.f3527a && kotlin.jvm.internal.i.a(this.f3528b, oVar.f3528b);
    }

    public final int hashCode() {
        return this.f3528b.hashCode() + (Integer.hashCode(this.f3527a) * 31);
    }

    public final String toString() {
        return "DeviceFirmwareVersion(gen=" + this.f3527a + ", objectId=" + this.f3528b + ")";
    }
}
