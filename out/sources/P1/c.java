package P1;

import p078g1.s;

/* JADX INFO: compiled from: SmtaMetadataEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4894b;

    public c(float f10, int i10) {
        this.f4893a = f10;
        this.f4894b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4893a == cVar.f4893a && this.f4894b == cVar.f4894b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f4893a).hashCode() + 527) * 31) + this.f4894b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f4893a + ", svcTemporalLayerCount=" + this.f4894b;
    }
}
