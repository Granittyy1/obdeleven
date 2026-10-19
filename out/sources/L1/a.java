package L1;

import java.util.Arrays;
import java.util.Objects;
import p078g1.n;
import p078g1.s;
import p078g1.t;

/* JADX INFO: compiled from: EventMessage.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f4424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f4425h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4431f;

    static {
        n.a aVar = new n.a();
        aVar.f35338m = t.m("application/id3");
        f4424g = new n(aVar);
        n.a aVar2 = new n.a();
        aVar2.f35338m = t.m("application/x-scte35");
        f4425h = new n(aVar2);
    }

    public a(String str, String str2, long j, long j10, byte[] bArr) {
        this.f4426a = str;
        this.f4427b = str2;
        this.f4428c = j;
        this.f4429d = j10;
        this.f4430e = bArr;
    }

    @Override // g1.s.a
    public final n a() {
        String str = this.f4426a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f4425h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f4424g;
            default:
                return null;
        }
    }

    @Override // g1.s.a
    public final byte[] c() {
        if (a() != null) {
            return this.f4430e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4428c == aVar.f4428c && this.f4429d == aVar.f4429d && Objects.equals(this.f4426a, aVar.f4426a) && Objects.equals(this.f4427b, aVar.f4427b) && Arrays.equals(this.f4430e, aVar.f4430e);
    }

    public final int hashCode() {
        if (this.f4431f == 0) {
            String str = this.f4426a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4427b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f4428c;
            int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j10 = this.f4429d;
            this.f4431f = Arrays.hashCode(this.f4430e) + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f4431f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f4426a + ", id=" + this.f4429d + ", durationMs=" + this.f4428c + ", value=" + this.f4427b;
    }
}
