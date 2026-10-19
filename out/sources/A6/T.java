package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends f0.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f778d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    public static final class a extends f0.e.d.a.c.AbstractC0013a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f782d;

        public final T a() {
            String strB = this.f779a == null ? " processName" : "";
            if (this.f780b == null) {
                strB = strB.concat(" pid");
            }
            if (this.f781c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " importance");
            }
            if (this.f782d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " defaultProcess");
            }
            if (strB.isEmpty()) {
                return new T(this.f780b.intValue(), this.f781c.intValue(), this.f779a, this.f782d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public T(int i10, int i11, String str, boolean z10) {
        this.f775a = str;
        this.f776b = i10;
        this.f777c = i11;
        this.f778d = z10;
    }

    @Override // A6.f0.e.d.a.c
    public final int a() {
        return this.f777c;
    }

    @Override // A6.f0.e.d.a.c
    public final int b() {
        return this.f776b;
    }

    @Override // A6.f0.e.d.a.c
    public final String c() {
        return this.f775a;
    }

    @Override // A6.f0.e.d.a.c
    public final boolean d() {
        return this.f778d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.c)) {
            return false;
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        return this.f775a.equals(cVar.c()) && this.f776b == cVar.b() && this.f777c == cVar.a() && this.f778d == cVar.d();
    }

    public final int hashCode() {
        return ((((((this.f775a.hashCode() ^ 1000003) * 1000003) ^ this.f776b) * 1000003) ^ this.f777c) * 1000003) ^ (this.f778d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f775a);
        sb2.append(", pid=");
        sb2.append(this.f776b);
        sb2.append(", importance=");
        sb2.append(this.f777c);
        sb2.append(", defaultProcess=");
        return C4.v.f(sb2, this.f778d, "}");
    }
}
