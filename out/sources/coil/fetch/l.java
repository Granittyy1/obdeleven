package coil.fetch;

import coil.decode.DataSource;
import coil.decode.x;

/* JADX INFO: compiled from: FetchResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSource f22991c;

    public l(x xVar, String str, DataSource dataSource) {
        this.f22989a = xVar;
        this.f22990b = str;
        this.f22991c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (kotlin.jvm.internal.i.a(this.f22989a, lVar.f22989a) && kotlin.jvm.internal.i.a(this.f22990b, lVar.f22990b) && this.f22991c == lVar.f22991c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22989a.hashCode() * 31;
        String str = this.f22990b;
        return this.f22991c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
