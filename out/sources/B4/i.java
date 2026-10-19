package B4;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_LogRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.cct.internal.c f1582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final QosTier f1586g;

    public i() {
        throw null;
    }

    public i(long j, long j10, com.google.android.datatransport.cct.internal.c cVar, Integer num, String str, ArrayList arrayList) {
        QosTier qosTier = QosTier.DEFAULT;
        this.f1580a = j;
        this.f1581b = j10;
        this.f1582c = cVar;
        this.f1583d = num;
        this.f1584e = str;
        this.f1585f = arrayList;
        this.f1586g = qosTier;
    }

    @Override // B4.m
    public final ClientInfo a() {
        return this.f1582c;
    }

    @Override // B4.m
    public final List<l> b() {
        return this.f1585f;
    }

    @Override // B4.m
    public final Integer c() {
        return this.f1583d;
    }

    @Override // B4.m
    public final String d() {
        return this.f1584e;
    }

    @Override // B4.m
    public final QosTier e() {
        return this.f1586g;
    }

    public final boolean equals(Object obj) {
        com.google.android.datatransport.cct.internal.c cVar;
        Integer num;
        String str;
        ArrayList arrayList;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f1580a == mVar.f() && this.f1581b == mVar.g() && ((cVar = this.f1582c) != null ? cVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f1583d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f1584e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((arrayList = this.f1585f) != null ? arrayList.equals(mVar.b()) : mVar.b() == null)) {
            QosTier qosTier = this.f1586g;
            if (qosTier == null) {
                if (mVar.e() == null) {
                    return true;
                }
            } else if (qosTier.equals(mVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // B4.m
    public final long f() {
        return this.f1580a;
    }

    @Override // B4.m
    public final long g() {
        return this.f1581b;
    }

    public final int hashCode() {
        long j = this.f1580a;
        long j10 = this.f1581b;
        int i10 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        com.google.android.datatransport.cct.internal.c cVar = this.f1582c;
        int iHashCode = (i10 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        Integer num = this.f1583d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1584e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f1585f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        QosTier qosTier = this.f1586g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1580a + ", requestUptimeMs=" + this.f1581b + ", clientInfo=" + this.f1582c + ", logSource=" + this.f1583d + ", logSourceName=" + this.f1584e + ", logEvents=" + this.f1585f + ", qosTier=" + this.f1586g + "}";
    }
}
