package p013b0;

import B7.b;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20477c;

    public d(float f10, float f11) {
        this.f20476b = f10;
        this.f20477c = f11;
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f20477c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f20476b, dVar.f20476b) == 0 && Float.compare(this.f20477c, dVar.f20477c) == 0;
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f20476b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20477c) + (Float.hashCode(this.f20476b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f20476b);
        sb2.append(", fontScale=");
        return b.d(sb2, this.f20477c, ')');
    }
}
