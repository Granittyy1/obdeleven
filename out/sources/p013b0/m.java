package p013b0;

import B7.b;
import p026c0.a;

/* JADX INFO: compiled from: AndroidDensity.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20491a;

    public m(float f10) {
        this.f20491a = f10;
    }

    @Override // p026c0.a
    public final float a(float f10) {
        return f10 / this.f20491a;
    }

    @Override // p026c0.a
    public final float b(float f10) {
        return f10 * this.f20491a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f20491a, ((m) obj).f20491a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20491a);
    }

    public final String toString() {
        return b.d(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f20491a, ')');
    }
}
