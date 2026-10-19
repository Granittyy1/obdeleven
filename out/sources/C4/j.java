package C4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_EventInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f2365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f2368f;

    /* JADX INFO: compiled from: AutoValue_EventInternal.java */
    public static final class a extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f2370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n f2371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f2372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f2373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f2374f;

        public final j b() {
            String strB = this.f2369a == null ? " transportName" : "";
            if (this.f2371c == null) {
                strB = strB.concat(" encodedPayload");
            }
            if (this.f2372d == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " eventMillis");
            }
            if (this.f2373e == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " uptimeMillis");
            }
            if (this.f2374f == null) {
                strB = androidx.compose.ui.text.font.s.b(strB, " autoMetadata");
            }
            if (strB.isEmpty()) {
                return new j(this.f2369a, this.f2370b, this.f2371c, this.f2372d.longValue(), this.f2373e.longValue(), this.f2374f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strB));
        }
    }

    public j(String str, Integer num, n nVar, long j, long j10, HashMap map) {
        this.f2363a = str;
        this.f2364b = num;
        this.f2365c = nVar;
        this.f2366d = j;
        this.f2367e = j10;
        this.f2368f = map;
    }

    @Override // C4.o
    public final Map<String, String> b() {
        return this.f2368f;
    }

    @Override // C4.o
    public final Integer c() {
        return this.f2364b;
    }

    @Override // C4.o
    public final n d() {
        return this.f2365c;
    }

    @Override // C4.o
    public final long e() {
        return this.f2366d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f2363a.equals(oVar.g()) && ((num = this.f2364b) != null ? num.equals(oVar.c()) : oVar.c() == null) && this.f2365c.equals(oVar.d()) && this.f2366d == oVar.e() && this.f2367e == oVar.h() && this.f2368f.equals(oVar.b());
    }

    @Override // C4.o
    public final String g() {
        return this.f2363a;
    }

    @Override // C4.o
    public final long h() {
        return this.f2367e;
    }

    public final int hashCode() {
        int iHashCode = (this.f2363a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2364b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f2365c.hashCode()) * 1000003;
        long j = this.f2366d;
        int i10 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f2367e;
        return ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f2368f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f2363a + ", code=" + this.f2364b + ", encodedPayload=" + this.f2365c + ", eventMillis=" + this.f2366d + ", uptimeMillis=" + this.f2367e + ", autoMetadata=" + this.f2368f + "}";
    }
}
