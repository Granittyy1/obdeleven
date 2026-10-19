package rb;

import okio.ByteString;

/* JADX INFO: compiled from: Header.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteString f46516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteString f46517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteString f46518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ByteString f46519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ByteString f46520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ByteString f46521i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteString f46522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f46523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46524c;

    static {
        ByteString byteString = ByteString.f45705d;
        f46516d = ByteString.a.c(":");
        f46517e = ByteString.a.c(":status");
        f46518f = ByteString.a.c(":method");
        f46519g = ByteString.a.c(":path");
        f46520h = ByteString.a.c(":scheme");
        f46521i = ByteString.a.c(":authority");
    }

    public a(ByteString name, ByteString value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f46522a = name;
        this.f46523b = value;
        this.f46524c = value.e() + name.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.i.a(this.f46522a, aVar.f46522a) && kotlin.jvm.internal.i.a(this.f46523b, aVar.f46523b);
    }

    public final int hashCode() {
        return this.f46523b.hashCode() + (this.f46522a.hashCode() * 31);
    }

    public final String toString() {
        return this.f46522a.v() + ": " + this.f46523b.v();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String name, String value) {
        this(ByteString.a.c(name), ByteString.a.c(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        ByteString byteString = ByteString.f45705d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ByteString name, String value) {
        this(name, ByteString.a.c(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        ByteString byteString = ByteString.f45705d;
    }
}
