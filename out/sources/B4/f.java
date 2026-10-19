package B4;

/* JADX INFO: compiled from: AutoValue_AndroidClientInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1562i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1564l;

    public f(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1554a = num;
        this.f1555b = str;
        this.f1556c = str2;
        this.f1557d = str3;
        this.f1558e = str4;
        this.f1559f = str5;
        this.f1560g = str6;
        this.f1561h = str7;
        this.f1562i = str8;
        this.j = str9;
        this.f1563k = str10;
        this.f1564l = str11;
    }

    @Override // B4.a
    public final String a() {
        return this.f1564l;
    }

    @Override // B4.a
    public final String b() {
        return this.j;
    }

    @Override // B4.a
    public final String c() {
        return this.f1557d;
    }

    @Override // B4.a
    public final String d() {
        return this.f1561h;
    }

    @Override // B4.a
    public final String e() {
        return this.f1556c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f1554a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f1555b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f1556c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f1557d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f1558e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f1559f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f1560g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f1561h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f1562i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f1563k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f1564l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // B4.a
    public final String f() {
        return this.f1562i;
    }

    @Override // B4.a
    public final String g() {
        return this.f1560g;
    }

    @Override // B4.a
    public final String h() {
        return this.f1563k;
    }

    public final int hashCode() {
        Integer num = this.f1554a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1555b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1556c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1557d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1558e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1559f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1560g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f1561h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f1562i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1563k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1564l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    @Override // B4.a
    public final String i() {
        return this.f1555b;
    }

    @Override // B4.a
    public final String j() {
        return this.f1559f;
    }

    @Override // B4.a
    public final String k() {
        return this.f1558e;
    }

    @Override // B4.a
    public final Integer l() {
        return this.f1554a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f1554a);
        sb2.append(", model=");
        sb2.append(this.f1555b);
        sb2.append(", hardware=");
        sb2.append(this.f1556c);
        sb2.append(", device=");
        sb2.append(this.f1557d);
        sb2.append(", product=");
        sb2.append(this.f1558e);
        sb2.append(", osBuild=");
        sb2.append(this.f1559f);
        sb2.append(", manufacturer=");
        sb2.append(this.f1560g);
        sb2.append(", fingerprint=");
        sb2.append(this.f1561h);
        sb2.append(", locale=");
        sb2.append(this.f1562i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.f1563k);
        sb2.append(", applicationBuild=");
        return Q8.d.a(sb2, this.f1564l, "}");
    }
}
