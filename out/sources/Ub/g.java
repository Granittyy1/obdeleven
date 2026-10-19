package Ub;

import A1.C0575j;

/* JADX INFO: compiled from: SLConfigDescriptor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6614c;

    public g() {
        this.f6597b = 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f6614c == ((g) obj).f6614c;
    }

    @Override // Ub.b
    public final int f() {
        return 1;
    }

    public final int hashCode() {
        return this.f6614c;
    }

    public final String toString() {
        return C0575j.b(new StringBuilder("SLConfigDescriptor{predefined="), this.f6614c, '}');
    }
}
