package p302y6;

import Q8.d;

/* JADX INFO: renamed from: y6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2807c extends N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48365b;

    public C2807c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f48364a = str;
        this.f48365b = str2;
    }

    @Override // p302y6.N
    public final String a() {
        return this.f48364a;
    }

    @Override // p302y6.N
    public final String b() {
        return this.f48365b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (this.f48364a.equals(n10.a())) {
            String str = this.f48365b;
            if (str == null) {
                if (n10.b() == null) {
                    return true;
                }
            } else if (str.equals(n10.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f48364a.hashCode() ^ 1000003) * 1000003;
        String str = this.f48365b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f48364a);
        sb2.append(", firebaseInstallationId=");
        return d.a(sb2, this.f48365b, "}");
    }
}
