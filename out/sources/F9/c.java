package F9;

import okio.ByteString;

/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteString f3283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteString f3284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteString f3285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ByteString f3286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ByteString f3287h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteString f3288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f3289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3290c;

    static {
        ByteString byteString = ByteString.f45705d;
        f3283d = ByteString.a.c(":status");
        f3284e = ByteString.a.c(":method");
        f3285f = ByteString.a.c(":path");
        f3286g = ByteString.a.c(":scheme");
        f3287h = ByteString.a.c(":authority");
        ByteString.a.c(":host");
        ByteString.a.c(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(ByteString.a.c(str), ByteString.a.c(str2));
        ByteString byteString = ByteString.f45705d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3288a.equals(cVar.f3288a) && this.f3289b.equals(cVar.f3289b);
    }

    public final int hashCode() {
        return this.f3289b.hashCode() + ((this.f3288a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return O.a.f(this.f3288a.v(), ": ", this.f3289b.v());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ByteString byteString, String str) {
        this(byteString, ByteString.a.c(str));
        ByteString byteString2 = ByteString.f45705d;
    }

    public c(ByteString byteString, ByteString byteString2) {
        this.f3288a = byteString;
        this.f3289b = byteString2;
        this.f3290c = byteString2.e() + byteString.e() + 32;
    }
}
