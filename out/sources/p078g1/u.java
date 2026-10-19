package p078g1;

import java.util.Locale;
import p114j1.A;
import p241t7.b;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f35451d = new u(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35454c;

    static {
        A.B(0);
        A.B(1);
    }

    public u(float f10, float f11) {
        b.e(f10 > 0.0f);
        b.e(f11 > 0.0f);
        this.f35452a = f10;
        this.f35453b = f11;
        this.f35454c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f35452a == uVar.f35452a && this.f35453b == uVar.f35453b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f35453b) + ((Float.floatToRawIntBits(this.f35452a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f35452a), Float.valueOf(this.f35453b)};
        int i10 = A.f40996a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
