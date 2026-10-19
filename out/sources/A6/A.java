package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f633i;
    public final f0.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f0.d f634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0.a f635l;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
    public static final class a extends f0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f642g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f643h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f0.e f644i;
        public f0.d j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public f0.a f645k;

        public final A a() {
            String strB = this.f636a == null ? " sdkVersion" : "";
            if (this.f637b == null) {
                strB = strB.concat(" gmpAppId");
            }
            if (this.f638c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " platform");
            }
            if (this.f639d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " installationUuid");
            }
            if (this.f642g == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " buildVersion");
            }
            if (this.f643h == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " displayVersion");
            }
            if (strB.isEmpty()) {
                return new A(this.f636a, this.f637b, this.f638c.intValue(), this.f639d, this.f640e, this.f641f, this.f642g, this.f643h, this.f644i, this.j, this.f645k);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public A(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, f0.e eVar, f0.d dVar, f0.a aVar) {
        this.f626b = str;
        this.f627c = str2;
        this.f628d = i10;
        this.f629e = str3;
        this.f630f = str4;
        this.f631g = str5;
        this.f632h = str6;
        this.f633i = str7;
        this.j = eVar;
        this.f634k = dVar;
        this.f635l = aVar;
    }

    @Override // A6.f0
    public final f0.a a() {
        return this.f635l;
    }

    @Override // A6.f0
    public final String b() {
        return this.f631g;
    }

    @Override // A6.f0
    public final String c() {
        return this.f632h;
    }

    @Override // A6.f0
    public final String d() {
        return this.f633i;
    }

    @Override // A6.f0
    public final String e() {
        return this.f630f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        f0.e eVar;
        f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f626b.equals(f0Var.j()) && this.f627c.equals(f0Var.f()) && this.f628d == f0Var.i() && this.f629e.equals(f0Var.g()) && ((str = this.f630f) != null ? str.equals(f0Var.e()) : f0Var.e() == null) && ((str2 = this.f631g) != null ? str2.equals(f0Var.b()) : f0Var.b() == null) && this.f632h.equals(f0Var.c()) && this.f633i.equals(f0Var.d()) && ((eVar = this.j) != null ? eVar.equals(f0Var.k()) : f0Var.k() == null) && ((dVar = this.f634k) != null ? dVar.equals(f0Var.h()) : f0Var.h() == null)) {
            f0.a aVar = this.f635l;
            if (aVar == null) {
                if (f0Var.a() == null) {
                    return true;
                }
            } else if (aVar.equals(f0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.f0
    public final String f() {
        return this.f627c;
    }

    @Override // A6.f0
    public final String g() {
        return this.f629e;
    }

    @Override // A6.f0
    public final f0.d h() {
        return this.f634k;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f626b.hashCode() ^ 1000003) * 1000003) ^ this.f627c.hashCode()) * 1000003) ^ this.f628d) * 1000003) ^ this.f629e.hashCode()) * 1000003;
        String str = this.f630f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f631g;
        int iHashCode3 = (((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f632h.hashCode()) * 1000003) ^ this.f633i.hashCode()) * 1000003;
        f0.e eVar = this.j;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.d dVar = this.f634k;
        int iHashCode5 = (iHashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.a aVar = this.f635l;
        return iHashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // A6.f0
    public final int i() {
        return this.f628d;
    }

    @Override // A6.f0
    public final String j() {
        return this.f626b;
    }

    @Override // A6.f0
    public final f0.e k() {
        return this.j;
    }

    @Override // A6.f0
    public final a l() {
        a aVar = new a();
        aVar.f636a = this.f626b;
        aVar.f637b = this.f627c;
        aVar.f638c = Integer.valueOf(this.f628d);
        aVar.f639d = this.f629e;
        aVar.f640e = this.f630f;
        aVar.f641f = this.f631g;
        aVar.f642g = this.f632h;
        aVar.f643h = this.f633i;
        aVar.f644i = this.j;
        aVar.j = this.f634k;
        aVar.f645k = this.f635l;
        return aVar;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f626b + ", gmpAppId=" + this.f627c + ", platform=" + this.f628d + ", installationUuid=" + this.f629e + ", firebaseInstallationId=" + this.f630f + ", appQualitySessionId=" + this.f631g + ", buildVersion=" + this.f632h + ", displayVersion=" + this.f633i + ", session=" + this.j + ", ndkPayload=" + this.f634k + ", appExitInfo=" + this.f635l + "}";
    }
}
