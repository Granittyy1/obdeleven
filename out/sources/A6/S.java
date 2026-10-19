package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* JADX INFO: loaded from: classes3.dex */
public final class S extends f0.e.d.a.b.AbstractC0010d.AbstractC0011a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f769e;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class a extends f0.e.d.a.b.AbstractC0010d.AbstractC0011a.AbstractC0012a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f774e;

        public final S a() {
            String strB = this.f770a == null ? " pc" : "";
            if (this.f771b == null) {
                strB = strB.concat(" symbol");
            }
            if (this.f773d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " offset");
            }
            if (this.f774e == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " importance");
            }
            if (strB.isEmpty()) {
                return new S(this.f770a.longValue(), this.f771b, this.f772c, this.f773d.longValue(), this.f774e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public S(long j, String str, String str2, long j10, int i10) {
        this.f765a = j;
        this.f766b = str;
        this.f767c = str2;
        this.f768d = j10;
        this.f769e = i10;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d.AbstractC0011a
    public final String a() {
        return this.f767c;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d.AbstractC0011a
    public final int b() {
        return this.f769e;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d.AbstractC0011a
    public final long c() {
        return this.f768d;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d.AbstractC0011a
    public final long d() {
        return this.f765a;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d.AbstractC0011a
    public final String e() {
        return this.f766b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0010d.AbstractC0011a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0010d.AbstractC0011a abstractC0011a = (f0.e.d.a.b.AbstractC0010d.AbstractC0011a) obj;
        return this.f765a == abstractC0011a.d() && this.f766b.equals(abstractC0011a.e()) && ((str = this.f767c) != null ? str.equals(abstractC0011a.a()) : abstractC0011a.a() == null) && this.f768d == abstractC0011a.c() && this.f769e == abstractC0011a.b();
    }

    public final int hashCode() {
        long j = this.f765a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f766b.hashCode()) * 1000003;
        String str = this.f767c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f768d;
        return ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f769e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f765a);
        sb2.append(", symbol=");
        sb2.append(this.f766b);
        sb2.append(", file=");
        sb2.append(this.f767c);
        sb2.append(", offset=");
        sb2.append(this.f768d);
        sb2.append(", importance=");
        return p005a4.q.c(sb2, this.f769e, "}");
    }
}
