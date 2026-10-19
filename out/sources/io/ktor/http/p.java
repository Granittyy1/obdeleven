package io.ktor.http;

/* JADX INFO: compiled from: HttpProtocolVersion.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f40489d = new p("HTTP", 2, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f40490e = new p("HTTP", 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f40491f = new p("HTTP", 1, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f40492g = new p("SPDY", 3, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f40493h = new p("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40496c;

    public p(String str, int i10, int i11) {
        this.f40494a = str;
        this.f40495b = i10;
        this.f40496c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f40494a.equals(pVar.f40494a) && this.f40495b == pVar.f40495b && this.f40496c == pVar.f40496c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40496c) + p005a4.q.b(this.f40495b, this.f40494a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f40494a + '/' + this.f40495b + '.' + this.f40496c;
    }
}
