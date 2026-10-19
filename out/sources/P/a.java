package P;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4880b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4879a == aVar.f4879a && Float.compare(this.f4880b, aVar.f4880b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4880b) + (Long.hashCode(this.f4879a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f4879a);
        sb2.append(", dataPoint=");
        return B7.b.d(sb2, this.f4880b, ')');
    }
}
