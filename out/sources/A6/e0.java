package A6;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_OsData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends g0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f866c;

    public e0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f864a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f865b = str2;
        this.f866c = z10;
    }

    @Override // A6.g0.c
    public final boolean a() {
        return this.f866c;
    }

    @Override // A6.g0.c
    public final String b() {
        return this.f865b;
    }

    @Override // A6.g0.c
    public final String c() {
        return this.f864a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.c)) {
            return false;
        }
        g0.c cVar = (g0.c) obj;
        return this.f864a.equals(cVar.c()) && this.f865b.equals(cVar.b()) && this.f866c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.f864a.hashCode() ^ 1000003) * 1000003) ^ this.f865b.hashCode()) * 1000003) ^ (this.f866c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(this.f864a);
        sb2.append(", osCodeName=");
        sb2.append(this.f865b);
        sb2.append(", isRooted=");
        return C4.v.f(sb2, this.f866c, "}");
    }
}
