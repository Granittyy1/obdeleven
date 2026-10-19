package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z extends f0.e.AbstractC0016e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f810d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class a extends f0.e.AbstractC0016e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f814d;

        public final Z a() {
            String strB = this.f811a == null ? " platform" : "";
            if (this.f812b == null) {
                strB = strB.concat(" version");
            }
            if (this.f813c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " buildVersion");
            }
            if (this.f814d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " jailbroken");
            }
            if (strB.isEmpty()) {
                return new Z(this.f812b, this.f813c, this.f811a.intValue(), this.f814d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public Z(String str, String str2, int i10, boolean z10) {
        this.f807a = i10;
        this.f808b = str;
        this.f809c = str2;
        this.f810d = z10;
    }

    @Override // A6.f0.e.AbstractC0016e
    public final String a() {
        return this.f809c;
    }

    @Override // A6.f0.e.AbstractC0016e
    public final int b() {
        return this.f807a;
    }

    @Override // A6.f0.e.AbstractC0016e
    public final String c() {
        return this.f808b;
    }

    @Override // A6.f0.e.AbstractC0016e
    public final boolean d() {
        return this.f810d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.AbstractC0016e)) {
            return false;
        }
        f0.e.AbstractC0016e abstractC0016e = (f0.e.AbstractC0016e) obj;
        return this.f807a == abstractC0016e.b() && this.f808b.equals(abstractC0016e.c()) && this.f809c.equals(abstractC0016e.a()) && this.f810d == abstractC0016e.d();
    }

    public final int hashCode() {
        return ((((((this.f807a ^ 1000003) * 1000003) ^ this.f808b.hashCode()) * 1000003) ^ this.f809c.hashCode()) * 1000003) ^ (this.f810d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f807a);
        sb2.append(", version=");
        sb2.append(this.f808b);
        sb2.append(", buildVersion=");
        sb2.append(this.f809c);
        sb2.append(", jailbroken=");
        return C4.v.f(sb2, this.f810d, "}");
    }
}
