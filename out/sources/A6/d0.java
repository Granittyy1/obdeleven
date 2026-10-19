package A6;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f860i;

    public d0(int i10, String str, int i11, long j, long j10, boolean z10, int i12, String str2, String str3) {
        this.f852a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f853b = str;
        this.f854c = i11;
        this.f855d = j;
        this.f856e = j10;
        this.f857f = z10;
        this.f858g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f859h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f860i = str3;
    }

    @Override // A6.g0.b
    public final int a() {
        return this.f852a;
    }

    @Override // A6.g0.b
    public final int b() {
        return this.f854c;
    }

    @Override // A6.g0.b
    public final long c() {
        return this.f856e;
    }

    @Override // A6.g0.b
    public final boolean d() {
        return this.f857f;
    }

    @Override // A6.g0.b
    public final String e() {
        return this.f859h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f852a == bVar.a() && this.f853b.equals(bVar.f()) && this.f854c == bVar.b() && this.f855d == bVar.i() && this.f856e == bVar.c() && this.f857f == bVar.d() && this.f858g == bVar.h() && this.f859h.equals(bVar.e()) && this.f860i.equals(bVar.g());
    }

    @Override // A6.g0.b
    public final String f() {
        return this.f853b;
    }

    @Override // A6.g0.b
    public final String g() {
        return this.f860i;
    }

    @Override // A6.g0.b
    public final int h() {
        return this.f858g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f852a ^ 1000003) * 1000003) ^ this.f853b.hashCode()) * 1000003) ^ this.f854c) * 1000003;
        long j = this.f855d;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f856e;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f857f ? 1231 : 1237)) * 1000003) ^ this.f858g) * 1000003) ^ this.f859h.hashCode()) * 1000003) ^ this.f860i.hashCode();
    }

    @Override // A6.g0.b
    public final long i() {
        return this.f855d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f852a);
        sb2.append(", model=");
        sb2.append(this.f853b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f854c);
        sb2.append(", totalRam=");
        sb2.append(this.f855d);
        sb2.append(", diskSpace=");
        sb2.append(this.f856e);
        sb2.append(", isEmulator=");
        sb2.append(this.f857f);
        sb2.append(", state=");
        sb2.append(this.f858g);
        sb2.append(", manufacturer=");
        sb2.append(this.f859h);
        sb2.append(", modelClass=");
        return Q8.d.a(sb2, this.f860i, "}");
    }
}
