package p270w;

import p013b0.c;
import p013b0.f;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47678a;

    public d(float f10) {
        this.f47678a = f10;
    }

    @Override // p270w.b
    public final float a(long j, c cVar) {
        return cVar.T0(this.f47678a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && f.a(this.f47678a, ((d) obj).f47678a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f47678a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f47678a + ".dp)";
    }
}
