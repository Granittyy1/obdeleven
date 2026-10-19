package A6;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_AppData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p264v6.e f840f;

    public c0(String str, String str2, String str3, String str4, int i10, p264v6.e eVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f835a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f836b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f837c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f838d = str4;
        this.f839e = i10;
        this.f840f = eVar;
    }

    @Override // A6.g0.a
    public final String a() {
        return this.f835a;
    }

    @Override // A6.g0.a
    public final int b() {
        return this.f839e;
    }

    @Override // A6.g0.a
    public final p264v6.e c() {
        return this.f840f;
    }

    @Override // A6.g0.a
    public final String d() {
        return this.f838d;
    }

    @Override // A6.g0.a
    public final String e() {
        return this.f836b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        return this.f835a.equals(aVar.a()) && this.f836b.equals(aVar.e()) && this.f837c.equals(aVar.f()) && this.f838d.equals(aVar.d()) && this.f839e == aVar.b() && this.f840f.equals(aVar.c());
    }

    @Override // A6.g0.a
    public final String f() {
        return this.f837c;
    }

    public final int hashCode() {
        return ((((((((((this.f835a.hashCode() ^ 1000003) * 1000003) ^ this.f836b.hashCode()) * 1000003) ^ this.f837c.hashCode()) * 1000003) ^ this.f838d.hashCode()) * 1000003) ^ this.f839e) * 1000003) ^ this.f840f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f835a + ", versionCode=" + this.f836b + ", versionName=" + this.f837c + ", installUuid=" + this.f838d + ", deliveryMechanism=" + this.f839e + ", developmentPlatformProvider=" + this.f840f + "}";
    }
}
