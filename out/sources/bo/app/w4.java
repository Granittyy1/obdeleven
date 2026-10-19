package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x4 f22149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22150b;

    public w4(x4 pathType, String remoteUrl) {
        kotlin.jvm.internal.i.e(pathType, "pathType");
        kotlin.jvm.internal.i.e(remoteUrl, "remoteUrl");
        this.f22149a = pathType;
        this.f22150b = remoteUrl;
    }

    public final x4 a() {
        return this.f22149a;
    }

    public final String b() {
        return this.f22150b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return this.f22149a == w4Var.f22149a && kotlin.jvm.internal.i.a(this.f22150b, w4Var.f22150b);
    }

    public int hashCode() {
        return this.f22150b.hashCode() + (this.f22149a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemotePath(pathType=");
        sb2.append(this.f22149a);
        sb2.append(", remoteUrl=");
        return B7.b.g(sb2, this.f22150b, ')');
    }
}
