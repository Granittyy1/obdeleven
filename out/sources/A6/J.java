package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends f0.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f709i;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class a extends f0.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f717h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f718i;

        public final J a() {
            String strB = this.f710a == null ? " arch" : "";
            if (this.f711b == null) {
                strB = strB.concat(" model");
            }
            if (this.f712c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " cores");
            }
            if (this.f713d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " ram");
            }
            if (this.f714e == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " diskSpace");
            }
            if (this.f715f == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " simulator");
            }
            if (this.f716g == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " state");
            }
            if (this.f717h == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " manufacturer");
            }
            if (this.f718i == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " modelClass");
            }
            if (strB.isEmpty()) {
                return new J(this.f710a.intValue(), this.f711b, this.f712c.intValue(), this.f713d.longValue(), this.f714e.longValue(), this.f715f.booleanValue(), this.f716g.intValue(), this.f717h, this.f718i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public J(int i10, String str, int i11, long j, long j10, boolean z10, int i12, String str2, String str3) {
        this.f701a = i10;
        this.f702b = str;
        this.f703c = i11;
        this.f704d = j;
        this.f705e = j10;
        this.f706f = z10;
        this.f707g = i12;
        this.f708h = str2;
        this.f709i = str3;
    }

    @Override // A6.f0.e.c
    public final int a() {
        return this.f701a;
    }

    @Override // A6.f0.e.c
    public final int b() {
        return this.f703c;
    }

    @Override // A6.f0.e.c
    public final long c() {
        return this.f705e;
    }

    @Override // A6.f0.e.c
    public final String d() {
        return this.f708h;
    }

    @Override // A6.f0.e.c
    public final String e() {
        return this.f702b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.c)) {
            return false;
        }
        f0.e.c cVar = (f0.e.c) obj;
        return this.f701a == cVar.a() && this.f702b.equals(cVar.e()) && this.f703c == cVar.b() && this.f704d == cVar.g() && this.f705e == cVar.c() && this.f706f == cVar.i() && this.f707g == cVar.h() && this.f708h.equals(cVar.d()) && this.f709i.equals(cVar.f());
    }

    @Override // A6.f0.e.c
    public final String f() {
        return this.f709i;
    }

    @Override // A6.f0.e.c
    public final long g() {
        return this.f704d;
    }

    @Override // A6.f0.e.c
    public final int h() {
        return this.f707g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f701a ^ 1000003) * 1000003) ^ this.f702b.hashCode()) * 1000003) ^ this.f703c) * 1000003;
        long j = this.f704d;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f705e;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f706f ? 1231 : 1237)) * 1000003) ^ this.f707g) * 1000003) ^ this.f708h.hashCode()) * 1000003) ^ this.f709i.hashCode();
    }

    @Override // A6.f0.e.c
    public final boolean i() {
        return this.f706f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f701a);
        sb2.append(", model=");
        sb2.append(this.f702b);
        sb2.append(", cores=");
        sb2.append(this.f703c);
        sb2.append(", ram=");
        sb2.append(this.f704d);
        sb2.append(", diskSpace=");
        sb2.append(this.f705e);
        sb2.append(", simulator=");
        sb2.append(this.f706f);
        sb2.append(", state=");
        sb2.append(this.f707g);
        sb2.append(", manufacturer=");
        sb2.append(this.f708h);
        sb2.append(", modelClass=");
        return Q8.d.a(sb2, this.f709i, "}");
    }
}
