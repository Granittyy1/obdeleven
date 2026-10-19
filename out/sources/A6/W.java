package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class W extends f0.e.d.AbstractC0015e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f799d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    public static final class a extends f0.e.d.AbstractC0015e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public X f800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f803d;

        public final W a() {
            String strB = this.f800a == null ? " rolloutVariant" : "";
            if (this.f801b == null) {
                strB = strB.concat(" parameterKey");
            }
            if (this.f802c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " parameterValue");
            }
            if (this.f803d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " templateVersion");
            }
            if (strB.isEmpty()) {
                return new W(this.f800a, this.f801b, this.f802c, this.f803d.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public W(X x10, String str, String str2, long j) {
        this.f796a = x10;
        this.f797b = str;
        this.f798c = str2;
        this.f799d = j;
    }

    @Override // A6.f0.e.d.AbstractC0015e
    public final String a() {
        return this.f797b;
    }

    @Override // A6.f0.e.d.AbstractC0015e
    public final String b() {
        return this.f798c;
    }

    @Override // A6.f0.e.d.AbstractC0015e
    public final f0.e.d.AbstractC0015e.b c() {
        return this.f796a;
    }

    @Override // A6.f0.e.d.AbstractC0015e
    public final long d() {
        return this.f799d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0015e)) {
            return false;
        }
        f0.e.d.AbstractC0015e abstractC0015e = (f0.e.d.AbstractC0015e) obj;
        return this.f796a.equals(abstractC0015e.c()) && this.f797b.equals(abstractC0015e.a()) && this.f798c.equals(abstractC0015e.b()) && this.f799d == abstractC0015e.d();
    }

    public final int hashCode() {
        int iHashCode = (((((this.f796a.hashCode() ^ 1000003) * 1000003) ^ this.f797b.hashCode()) * 1000003) ^ this.f798c.hashCode()) * 1000003;
        long j = this.f799d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f796a);
        sb2.append(", parameterKey=");
        sb2.append(this.f797b);
        sb2.append(", parameterValue=");
        sb2.append(this.f798c);
        sb2.append(", templateVersion=");
        return p005a4.o.d(this.f799d, "}", sb2);
    }
}
