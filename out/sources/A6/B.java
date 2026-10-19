package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<f0.a.AbstractC0005a> f654i;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    public static final class a extends f0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f661g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f662h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<f0.a.AbstractC0005a> f663i;

        public final B a() {
            String strB = this.f655a == null ? " pid" : "";
            if (this.f656b == null) {
                strB = strB.concat(" processName");
            }
            if (this.f657c == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " reasonCode");
            }
            if (this.f658d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " importance");
            }
            if (this.f659e == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " pss");
            }
            if (this.f660f == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " rss");
            }
            if (this.f661g == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " timestamp");
            }
            if (strB.isEmpty()) {
                return new B(this.f655a.intValue(), this.f656b, this.f657c.intValue(), this.f658d.intValue(), this.f659e.longValue(), this.f660f.longValue(), this.f661g.longValue(), this.f662h, this.f663i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public B() {
        throw null;
    }

    public B(int i10, String str, int i11, int i12, long j, long j10, long j11, String str2, List list) {
        this.f646a = i10;
        this.f647b = str;
        this.f648c = i11;
        this.f649d = i12;
        this.f650e = j;
        this.f651f = j10;
        this.f652g = j11;
        this.f653h = str2;
        this.f654i = list;
    }

    @Override // A6.f0.a
    public final List<f0.a.AbstractC0005a> a() {
        return this.f654i;
    }

    @Override // A6.f0.a
    public final int b() {
        return this.f649d;
    }

    @Override // A6.f0.a
    public final int c() {
        return this.f646a;
    }

    @Override // A6.f0.a
    public final String d() {
        return this.f647b;
    }

    @Override // A6.f0.a
    public final long e() {
        return this.f650e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (this.f646a == aVar.c() && this.f647b.equals(aVar.d()) && this.f648c == aVar.f() && this.f649d == aVar.b() && this.f650e == aVar.e() && this.f651f == aVar.g() && this.f652g == aVar.h() && ((str = this.f653h) != null ? str.equals(aVar.i()) : aVar.i() == null)) {
            List<f0.a.AbstractC0005a> list = this.f654i;
            if (list == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (list.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.f0.a
    public final int f() {
        return this.f648c;
    }

    @Override // A6.f0.a
    public final long g() {
        return this.f651f;
    }

    @Override // A6.f0.a
    public final long h() {
        return this.f652g;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f646a ^ 1000003) * 1000003) ^ this.f647b.hashCode()) * 1000003) ^ this.f648c) * 1000003) ^ this.f649d) * 1000003;
        long j = this.f650e;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f651f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f652g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f653h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC0005a> list = this.f654i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // A6.f0.a
    public final String i() {
        return this.f653h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f646a + ", processName=" + this.f647b + ", reasonCode=" + this.f648c + ", importance=" + this.f649d + ", pss=" + this.f650e + ", rss=" + this.f651f + ", timestamp=" + this.f652g + ", traceFile=" + this.f653h + ", buildIdMappingForArch=" + this.f654i + "}";
    }
}
