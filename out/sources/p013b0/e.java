package p013b0;

import kotlin.jvm.internal.i;
import p026c0.a;

/* JADX INFO: compiled from: AndroidDensity.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20480d;

    public e(float f10, float f11, a aVar) {
        this.f20478b = f10;
        this.f20479c = f11;
        this.f20480d = aVar;
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f20479c;
    }

    @Override // p013b0.c
    public final long W(float f10) {
        return G0.a.i(this.f20480d.a(f10), 4294967296L);
    }

    @Override // p013b0.c
    public final float e0(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.f20480d.b(n.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f20478b, eVar.f20478b) == 0 && Float.compare(this.f20479c, eVar.f20479c) == 0 && i.a(this.f20480d, eVar.f20480d);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f20478b;
    }

    public final int hashCode() {
        return this.f20480d.hashCode() + O.a.d(this.f20479c, Float.hashCode(this.f20478b) * 31, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f20478b + ", fontScale=" + this.f20479c + ", converter=" + this.f20480d + ')';
    }
}
