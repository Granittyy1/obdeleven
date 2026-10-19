package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends f0.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.e.d.a f721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0.e.d.c f722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0.e.d.AbstractC0014d f723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0.e.d.f f724f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class a extends f0.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f0.e.d.a f727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f0.e.d.c f728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f0.e.d.AbstractC0014d f729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f0.e.d.f f730f;

        public final K a() {
            String strB = this.f725a == null ? " timestamp" : "";
            if (this.f726b == null) {
                strB = strB.concat(" type");
            }
            if (this.f727c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " app");
            }
            if (this.f728d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " device");
            }
            if (strB.isEmpty()) {
                return new K(this.f725a.longValue(), this.f726b, this.f727c, this.f728d, this.f729e, this.f730f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public K(long j, String str, f0.e.d.a aVar, f0.e.d.c cVar, f0.e.d.AbstractC0014d abstractC0014d, f0.e.d.f fVar) {
        this.f719a = j;
        this.f720b = str;
        this.f721c = aVar;
        this.f722d = cVar;
        this.f723e = abstractC0014d;
        this.f724f = fVar;
    }

    @Override // A6.f0.e.d
    public final f0.e.d.a a() {
        return this.f721c;
    }

    @Override // A6.f0.e.d
    public final f0.e.d.c b() {
        return this.f722d;
    }

    @Override // A6.f0.e.d
    public final f0.e.d.AbstractC0014d c() {
        return this.f723e;
    }

    @Override // A6.f0.e.d
    public final f0.e.d.f d() {
        return this.f724f;
    }

    @Override // A6.f0.e.d
    public final long e() {
        return this.f719a;
    }

    public final boolean equals(Object obj) {
        f0.e.d.AbstractC0014d abstractC0014d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d)) {
            return false;
        }
        f0.e.d dVar = (f0.e.d) obj;
        if (this.f719a == dVar.e() && this.f720b.equals(dVar.f()) && this.f721c.equals(dVar.a()) && this.f722d.equals(dVar.b()) && ((abstractC0014d = this.f723e) != null ? abstractC0014d.equals(dVar.c()) : dVar.c() == null)) {
            f0.e.d.f fVar = this.f724f;
            if (fVar == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.f0.e.d
    public final String f() {
        return this.f720b;
    }

    public final a g() {
        a aVar = new a();
        aVar.f725a = Long.valueOf(this.f719a);
        aVar.f726b = this.f720b;
        aVar.f727c = this.f721c;
        aVar.f728d = this.f722d;
        aVar.f729e = this.f723e;
        aVar.f730f = this.f724f;
        return aVar;
    }

    public final int hashCode() {
        long j = this.f719a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f720b.hashCode()) * 1000003) ^ this.f721c.hashCode()) * 1000003) ^ this.f722d.hashCode()) * 1000003;
        f0.e.d.AbstractC0014d abstractC0014d = this.f723e;
        int iHashCode2 = (iHashCode ^ (abstractC0014d == null ? 0 : abstractC0014d.hashCode())) * 1000003;
        f0.e.d.f fVar = this.f724f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f719a + ", type=" + this.f720b + ", app=" + this.f721c + ", device=" + this.f722d + ", log=" + this.f723e + ", rollouts=" + this.f724f + "}";
    }
}
