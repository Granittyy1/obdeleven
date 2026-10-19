package p033c7;

import p108i7.f;

/* JADX INFO: renamed from: c7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoValue_InstallationIdResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1491d extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f22435b;

    public C1491d(String str, f fVar) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f22434a = str;
        if (fVar == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f22435b = fVar;
    }

    @Override // p033c7.J
    public final String a() {
        return this.f22434a;
    }

    @Override // p033c7.J
    public final f b() {
        return this.f22435b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return this.f22434a.equals(j.a()) && this.f22435b.equals(j.b());
    }

    public final int hashCode() {
        return ((this.f22434a.hashCode() ^ 1000003) * 1000003) ^ this.f22435b.hashCode();
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.f22434a + ", installationTokenResult=" + this.f22435b + "}";
    }
}
