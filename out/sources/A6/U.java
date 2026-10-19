package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class U extends f0.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f788f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    public static final class a extends f0.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f794f;

        public final U a() {
            String strB = this.f790b == null ? " batteryVelocity" : "";
            if (this.f791c == null) {
                strB = strB.concat(" proximityOn");
            }
            if (this.f792d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " orientation");
            }
            if (this.f793e == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " ramUsed");
            }
            if (this.f794f == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " diskUsed");
            }
            if (strB.isEmpty()) {
                return new U(this.f789a, this.f790b.intValue(), this.f791c.booleanValue(), this.f792d.intValue(), this.f793e.longValue(), this.f794f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public U(Double d10, int i10, boolean z10, int i11, long j, long j10) {
        this.f783a = d10;
        this.f784b = i10;
        this.f785c = z10;
        this.f786d = i11;
        this.f787e = j;
        this.f788f = j10;
    }

    @Override // A6.f0.e.d.c
    public final Double a() {
        return this.f783a;
    }

    @Override // A6.f0.e.d.c
    public final int b() {
        return this.f784b;
    }

    @Override // A6.f0.e.d.c
    public final long c() {
        return this.f788f;
    }

    @Override // A6.f0.e.d.c
    public final int d() {
        return this.f786d;
    }

    @Override // A6.f0.e.d.c
    public final long e() {
        return this.f787e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.c)) {
            return false;
        }
        f0.e.d.c cVar = (f0.e.d.c) obj;
        Double d10 = this.f783a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f784b == cVar.b() && this.f785c == cVar.f() && this.f786d == cVar.d() && this.f787e == cVar.e() && this.f788f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.f0.e.d.c
    public final boolean f() {
        return this.f785c;
    }

    public final int hashCode() {
        Double d10 = this.f783a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f784b) * 1000003) ^ (this.f785c ? 1231 : 1237)) * 1000003) ^ this.f786d) * 1000003;
        long j = this.f787e;
        long j10 = this.f788f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f783a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f784b);
        sb2.append(", proximityOn=");
        sb2.append(this.f785c);
        sb2.append(", orientation=");
        sb2.append(this.f786d);
        sb2.append(", ramUsed=");
        sb2.append(this.f787e);
        sb2.append(", diskUsed=");
        return p005a4.o.d(this.f788f, "}", sb2);
    }
}
