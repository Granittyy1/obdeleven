package p127k1;

import p078g1.s;
import p241t7.b;

/* JADX INFO: compiled from: Mp4LocationData.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41395b;

    public c(float f10, float f11) {
        b.d("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f41394a = f10;
        this.f41395b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f41394a == cVar.f41394a && this.f41395b == cVar.f41395b;
    }

    public final int hashCode() {
        return Float.valueOf(this.f41395b).hashCode() + ((Float.valueOf(this.f41394a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f41394a + ", longitude=" + this.f41395b;
    }
}
