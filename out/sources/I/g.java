package I;

import kotlinx.coroutines.C;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3768h;

    static {
        C.d(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public g(float f10, float f11, float f12, float f13, long j, long j10, long j11, long j12) {
        this.f3761a = f10;
        this.f3762b = f11;
        this.f3763c = f12;
        this.f3764d = f13;
        this.f3765e = j;
        this.f3766f = j10;
        this.f3767g = j11;
        this.f3768h = j12;
    }

    public final float a() {
        return this.f3764d - this.f3762b;
    }

    public final float b() {
        return this.f3763c - this.f3761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f3761a, gVar.f3761a) == 0 && Float.compare(this.f3762b, gVar.f3762b) == 0 && Float.compare(this.f3763c, gVar.f3763c) == 0 && Float.compare(this.f3764d, gVar.f3764d) == 0 && a.a(this.f3765e, gVar.f3765e) && a.a(this.f3766f, gVar.f3766f) && a.a(this.f3767g, gVar.f3767g) && a.a(this.f3768h, gVar.f3768h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f3768h) + C4.b.c(this.f3767g, C4.b.c(this.f3766f, C4.b.c(this.f3765e, O.a.d(this.f3764d, O.a.d(this.f3763c, O.a.d(this.f3762b, Float.hashCode(this.f3761a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = b.p(this.f3761a) + ", " + b.p(this.f3762b) + ", " + b.p(this.f3763c) + ", " + b.p(this.f3764d);
        long j = this.f3765e;
        long j10 = this.f3766f;
        boolean zA = a.a(j, j10);
        long j11 = this.f3767g;
        long j12 = this.f3768h;
        if (!zA || !a.a(j10, j11) || !a.a(j11, j12)) {
            StringBuilder sbA = C7.g.a("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) a.b(j));
            sbA.append(", topRight=");
            sbA.append((Object) a.b(j10));
            sbA.append(", bottomRight=");
            sbA.append((Object) a.b(j11));
            sbA.append(", bottomLeft=");
            sbA.append((Object) a.b(j12));
            sbA.append(')');
            return sbA.toString();
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbA2 = C7.g.a("RoundRect(rect=", str, ", radius=");
            sbA2.append(b.p(Float.intBitsToFloat(i10)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = C7.g.a("RoundRect(rect=", str, ", x=");
        sbA3.append(b.p(Float.intBitsToFloat(i10)));
        sbA3.append(", y=");
        sbA3.append(b.p(Float.intBitsToFloat(i11)));
        sbA3.append(')');
        return sbA3.toString();
    }
}
