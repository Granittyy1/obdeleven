package G7;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3391f;

    /* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
    public static final class a extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f3396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f3397f;

        public final b a() {
            if (this.f3397f == 1 && this.f3392a != null && this.f3393b != null && this.f3394c != null && this.f3395d != null) {
                return new b(this.f3392a, this.f3393b, this.f3394c, this.f3395d, this.f3396e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f3392a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f3393b == null) {
                sb2.append(" variantId");
            }
            if (this.f3394c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f3395d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f3397f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }
    }

    public b(String str, String str2, String str3, String str4, long j) {
        this.f3387b = str;
        this.f3388c = str2;
        this.f3389d = str3;
        this.f3390e = str4;
        this.f3391f = j;
    }

    @Override // G7.d
    public final String a() {
        return this.f3389d;
    }

    @Override // G7.d
    public final String b() {
        return this.f3390e;
    }

    @Override // G7.d
    public final String c() {
        return this.f3387b;
    }

    @Override // G7.d
    public final long d() {
        return this.f3391f;
    }

    @Override // G7.d
    public final String e() {
        return this.f3388c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3387b.equals(dVar.c()) && this.f3388c.equals(dVar.e()) && this.f3389d.equals(dVar.a()) && this.f3390e.equals(dVar.b()) && this.f3391f == dVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f3387b.hashCode() ^ 1000003) * 1000003) ^ this.f3388c.hashCode()) * 1000003) ^ this.f3389d.hashCode()) * 1000003) ^ this.f3390e.hashCode()) * 1000003;
        long j = this.f3391f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f3387b);
        sb2.append(", variantId=");
        sb2.append(this.f3388c);
        sb2.append(", parameterKey=");
        sb2.append(this.f3389d);
        sb2.append(", parameterValue=");
        sb2.append(this.f3390e);
        sb2.append(", templateVersion=");
        return o.d(this.f3391f, "}", sb2);
    }
}
