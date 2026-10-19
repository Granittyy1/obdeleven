package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends f0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0.e.a f679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0.e.f f680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0.e.AbstractC0016e f681i;
    public final f0.e.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<f0.e.d> f682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f683l;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class a extends f0.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f0.e.a f690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f0.e.f f691h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f0.e.AbstractC0016e f692i;
        public f0.e.c j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<f0.e.d> f693k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f694l;

        public final G a() {
            String strB = this.f684a == null ? " generator" : "";
            if (this.f685b == null) {
                strB = strB.concat(" identifier");
            }
            if (this.f687d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " startedAt");
            }
            if (this.f689f == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " crashed");
            }
            if (this.f690g == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " app");
            }
            if (this.f694l == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " generatorType");
            }
            if (strB.isEmpty()) {
                return new G(this.f684a, this.f685b, this.f686c, this.f687d.longValue(), this.f688e, this.f689f.booleanValue(), this.f690g, this.f691h, this.f692i, this.j, this.f693k, this.f694l.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public G() {
        throw null;
    }

    public G(String str, String str2, String str3, long j, Long l10, boolean z10, f0.e.a aVar, f0.e.f fVar, f0.e.AbstractC0016e abstractC0016e, f0.e.c cVar, List list, int i10) {
        this.f673a = str;
        this.f674b = str2;
        this.f675c = str3;
        this.f676d = j;
        this.f677e = l10;
        this.f678f = z10;
        this.f679g = aVar;
        this.f680h = fVar;
        this.f681i = abstractC0016e;
        this.j = cVar;
        this.f682k = list;
        this.f683l = i10;
    }

    @Override // A6.f0.e
    public final f0.e.a a() {
        return this.f679g;
    }

    @Override // A6.f0.e
    public final String b() {
        return this.f675c;
    }

    @Override // A6.f0.e
    public final f0.e.c c() {
        return this.j;
    }

    @Override // A6.f0.e
    public final Long d() {
        return this.f677e;
    }

    @Override // A6.f0.e
    public final List<f0.e.d> e() {
        return this.f682k;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        f0.e.f fVar;
        f0.e.AbstractC0016e abstractC0016e;
        f0.e.c cVar;
        List<f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e)) {
            return false;
        }
        f0.e eVar = (f0.e) obj;
        return this.f673a.equals(eVar.f()) && this.f674b.equals(eVar.h()) && ((str = this.f675c) != null ? str.equals(eVar.b()) : eVar.b() == null) && this.f676d == eVar.j() && ((l10 = this.f677e) != null ? l10.equals(eVar.d()) : eVar.d() == null) && this.f678f == eVar.l() && this.f679g.equals(eVar.a()) && ((fVar = this.f680h) != null ? fVar.equals(eVar.k()) : eVar.k() == null) && ((abstractC0016e = this.f681i) != null ? abstractC0016e.equals(eVar.i()) : eVar.i() == null) && ((cVar = this.j) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((list = this.f682k) != null ? list.equals(eVar.e()) : eVar.e() == null) && this.f683l == eVar.g();
    }

    @Override // A6.f0.e
    public final String f() {
        return this.f673a;
    }

    @Override // A6.f0.e
    public final int g() {
        return this.f683l;
    }

    @Override // A6.f0.e
    public final String h() {
        return this.f674b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f673a.hashCode() ^ 1000003) * 1000003) ^ this.f674b.hashCode()) * 1000003;
        String str = this.f675c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f676d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l10 = this.f677e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f678f ? 1231 : 1237)) * 1000003) ^ this.f679g.hashCode()) * 1000003;
        f0.e.f fVar = this.f680h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e.AbstractC0016e abstractC0016e = this.f681i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0016e == null ? 0 : abstractC0016e.hashCode())) * 1000003;
        f0.e.c cVar = this.j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d> list = this.f682k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f683l;
    }

    @Override // A6.f0.e
    public final f0.e.AbstractC0016e i() {
        return this.f681i;
    }

    @Override // A6.f0.e
    public final long j() {
        return this.f676d;
    }

    @Override // A6.f0.e
    public final f0.e.f k() {
        return this.f680h;
    }

    @Override // A6.f0.e
    public final boolean l() {
        return this.f678f;
    }

    @Override // A6.f0.e
    public final a m() {
        a aVar = new a();
        aVar.f684a = this.f673a;
        aVar.f685b = this.f674b;
        aVar.f686c = this.f675c;
        aVar.f687d = Long.valueOf(this.f676d);
        aVar.f688e = this.f677e;
        aVar.f689f = Boolean.valueOf(this.f678f);
        aVar.f690g = this.f679g;
        aVar.f691h = this.f680h;
        aVar.f692i = this.f681i;
        aVar.j = this.j;
        aVar.f693k = this.f682k;
        aVar.f694l = Integer.valueOf(this.f683l);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f673a);
        sb2.append(", identifier=");
        sb2.append(this.f674b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f675c);
        sb2.append(", startedAt=");
        sb2.append(this.f676d);
        sb2.append(", endedAt=");
        sb2.append(this.f677e);
        sb2.append(", crashed=");
        sb2.append(this.f678f);
        sb2.append(", app=");
        sb2.append(this.f679g);
        sb2.append(", user=");
        sb2.append(this.f680h);
        sb2.append(", os=");
        sb2.append(this.f681i);
        sb2.append(", device=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.f682k);
        sb2.append(", generatorType=");
        return p005a4.q.c(sb2, this.f683l, "}");
    }
}
