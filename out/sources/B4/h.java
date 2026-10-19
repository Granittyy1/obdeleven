package B4;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_LogEvent.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.datatransport.cct.internal.d f1572g;

    /* JADX INFO: compiled from: AutoValue_LogEvent.java */
    public static final class a extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f1573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f1574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f1575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f1576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f1577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f1578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.google.android.datatransport.cct.internal.d f1579g;
    }

    public h(long j, Integer num, long j10, byte[] bArr, String str, long j11, com.google.android.datatransport.cct.internal.d dVar) {
        this.f1566a = j;
        this.f1567b = num;
        this.f1568c = j10;
        this.f1569d = bArr;
        this.f1570e = str;
        this.f1571f = j11;
        this.f1572g = dVar;
    }

    @Override // B4.l
    public final Integer a() {
        return this.f1567b;
    }

    @Override // B4.l
    public final long b() {
        return this.f1566a;
    }

    @Override // B4.l
    public final long c() {
        return this.f1568c;
    }

    @Override // B4.l
    public final NetworkConnectionInfo d() {
        return this.f1572g;
    }

    @Override // B4.l
    public final byte[] e() {
        return this.f1569d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f1566a == lVar.b() && ((num = this.f1567b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f1568c == lVar.c()) {
            if (Arrays.equals(this.f1569d, lVar instanceof h ? ((h) lVar).f1569d : lVar.e()) && ((str = this.f1570e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f1571f == lVar.g()) {
                com.google.android.datatransport.cct.internal.d dVar = this.f1572g;
                if (dVar == null) {
                    if (lVar.d() == null) {
                        return true;
                    }
                } else if (dVar.equals(lVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // B4.l
    public final String f() {
        return this.f1570e;
    }

    @Override // B4.l
    public final long g() {
        return this.f1571f;
    }

    public final int hashCode() {
        long j = this.f1566a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1567b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j10 = this.f1568c;
        int iHashCode2 = (((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1569d)) * 1000003;
        String str = this.f1570e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f1571f;
        int i11 = (iHashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        com.google.android.datatransport.cct.internal.d dVar = this.f1572g;
        return i11 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1566a + ", eventCode=" + this.f1567b + ", eventUptimeMs=" + this.f1568c + ", sourceExtension=" + Arrays.toString(this.f1569d) + ", sourceExtensionJsonProto3=" + this.f1570e + ", timezoneOffsetSeconds=" + this.f1571f + ", networkConnectionInfo=" + this.f1572g + "}";
    }
}
