package p302y6;

import A6.A;
import A6.f0;
import java.io.File;

/* JADX INFO: renamed from: y6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2806b extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f48361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f48363c;

    public C2806b(A a10, String str, File file) {
        this.f48361a = a10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f48362b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f48363c = file;
    }

    @Override // p302y6.G
    public final f0 a() {
        return this.f48361a;
    }

    @Override // p302y6.G
    public final File b() {
        return this.f48363c;
    }

    @Override // p302y6.G
    public final String c() {
        return this.f48362b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f48361a.equals(g10.a()) && this.f48362b.equals(g10.c()) && this.f48363c.equals(g10.b());
    }

    public final int hashCode() {
        return ((((this.f48361a.hashCode() ^ 1000003) * 1000003) ^ this.f48362b.hashCode()) * 1000003) ^ this.f48363c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f48361a + ", sessionId=" + this.f48362b + ", reportFile=" + this.f48363c + "}";
    }
}
