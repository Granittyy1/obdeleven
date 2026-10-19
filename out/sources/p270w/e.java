package p270w;

import I.h;
import p245u.c;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47679a;

    public e(float f10) {
        this.f47679a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            c.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p270w.b
    public final float a(long j, p013b0.c cVar) {
        return (this.f47679a / 100.0f) * h.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f47679a, ((e) obj).f47679a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47679a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f47679a + "%)";
    }
}
