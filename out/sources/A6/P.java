package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends f0.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f761c;

    public P(String str, String str2, long j) {
        this.f759a = str;
        this.f760b = str2;
        this.f761c = j;
    }

    @Override // A6.f0.e.d.a.b.c
    public final long a() {
        return this.f761c;
    }

    @Override // A6.f0.e.d.a.b.c
    public final String b() {
        return this.f760b;
    }

    @Override // A6.f0.e.d.a.b.c
    public final String c() {
        return this.f759a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.c)) {
            return false;
        }
        f0.e.d.a.b.c cVar = (f0.e.d.a.b.c) obj;
        return this.f759a.equals(cVar.c()) && this.f760b.equals(cVar.b()) && this.f761c == cVar.a();
    }

    public final int hashCode() {
        int iHashCode = (((this.f759a.hashCode() ^ 1000003) * 1000003) ^ this.f760b.hashCode()) * 1000003;
        long j = this.f761c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f759a);
        sb2.append(", code=");
        sb2.append(this.f760b);
        sb2.append(", address=");
        return p005a4.o.d(this.f761c, "}", sb2);
    }
}
