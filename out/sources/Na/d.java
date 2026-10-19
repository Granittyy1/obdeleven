package Na;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4686c;

    public d(float f10, float f11) {
        this.f4685b = f10;
        this.f4686c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Na.e
    public final boolean e(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f4685b != dVar.f4685b || this.f4686c != dVar.f4686c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f4685b) * 31) + Float.hashCode(this.f4686c);
    }

    @Override // Na.f
    public final boolean isEmpty() {
        return this.f4685b > this.f4686c;
    }

    @Override // Na.f
    public final Comparable k() {
        return Float.valueOf(this.f4685b);
    }

    @Override // Na.f
    public final Comparable q() {
        return Float.valueOf(this.f4686c);
    }

    public final String toString() {
        return this.f4685b + ".." + this.f4686c;
    }
}
