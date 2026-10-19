package okio.internal;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import okio.ByteString;
import p318zb.C2839f;
import p318zb.z;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteString f45714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f45715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteString f45716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteString f45717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteString f45718e;

    static {
        ByteString byteString = ByteString.f45705d;
        f45714a = ByteString.a.c("/");
        f45715b = ByteString.a.c("\\");
        f45716c = ByteString.a.c("/\\");
        f45717d = ByteString.a.c(".");
        f45718e = ByteString.a.c("..");
    }

    public static final int a(z zVar) {
        if (zVar.f49123b.e() == 0) {
            return -1;
        }
        ByteString byteString = zVar.f49123b;
        if (byteString.k(0) != 47) {
            if (byteString.k(0) != 92) {
                if (byteString.e() <= 2 || byteString.k(1) != 58 || byteString.k(2) != 92) {
                    return -1;
                }
                char cK = (char) byteString.k(0);
                return (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) ? -1 : 3;
            }
            if (byteString.e() > 2 && byteString.k(1) == 92) {
                int iG = byteString.g(2, f45715b);
                return iG == -1 ? byteString.e() : iG;
            }
        }
        return 1;
    }

    public static final z b(z zVar, z child, boolean z10) {
        i.e(zVar, "<this>");
        i.e(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        ByteString byteStringC = c(zVar);
        if (byteStringC == null && (byteStringC = c(child)) == null) {
            byteStringC = f(z.f49122c);
        }
        C2839f c2839f = new C2839f();
        c2839f.K0(zVar.f49123b);
        if (c2839f.f49074c > 0) {
            c2839f.K0(byteStringC);
        }
        c2839f.K0(child.f49123b);
        return d(c2839f, z10);
    }

    public static final ByteString c(z zVar) {
        ByteString byteString = zVar.f49123b;
        ByteString byteString2 = f45714a;
        if (ByteString.i(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = f45715b;
        if (ByteString.i(zVar.f49123b, byteString3) != -1) {
            return byteString3;
        }
        return null;
    }

    public static final z d(C2839f c2839f, boolean z10) throws EOFException {
        ByteString byteString;
        char cP;
        ByteString byteString2;
        ByteString byteStringR;
        C2839f c2839f2 = new C2839f();
        ByteString byteStringE = null;
        int i10 = 0;
        while (true) {
            if (!c2839f.c0(0L, f45714a)) {
                byteString = f45715b;
                if (!c2839f.c0(0L, byteString)) {
                    break;
                }
            }
            byte b10 = c2839f.readByte();
            if (byteStringE == null) {
                byteStringE = e(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && i.a(byteStringE, byteString);
        ByteString byteString3 = f45716c;
        if (z11) {
            i.b(byteStringE);
            c2839f2.K0(byteStringE);
            c2839f2.K0(byteStringE);
        } else if (i10 > 0) {
            i.b(byteStringE);
            c2839f2.K0(byteStringE);
        } else {
            long jB = c2839f.B(byteString3);
            if (byteStringE == null) {
                byteStringE = jB == -1 ? f(z.f49122c) : e(c2839f.p(jB));
            }
            if (i.a(byteStringE, byteString) && c2839f.f49074c >= 2 && c2839f.p(1L) == 58 && (('a' <= (cP = (char) c2839f.p(0L)) && cP < '{') || ('A' <= cP && cP < '['))) {
                if (jB == 2) {
                    c2839f2.t0(c2839f, 3L);
                } else {
                    c2839f2.t0(c2839f, 2L);
                }
            }
        }
        boolean z12 = c2839f2.f49074c > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zJ = c2839f.j();
            byteString2 = f45717d;
            if (zJ) {
                break;
            }
            long jB2 = c2839f.B(byteString3);
            if (jB2 == -1) {
                byteStringR = c2839f.R(c2839f.f49074c);
            } else {
                byteStringR = c2839f.R(jB2);
                c2839f.readByte();
            }
            ByteString byteString4 = f45718e;
            if (i.a(byteStringR, byteString4)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || i.a(q.V(arrayList), byteString4)))) {
                        arrayList.add(byteStringR);
                    } else if (!z11 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(l.r(arrayList));
                        }
                    }
                }
            } else if (!i.a(byteStringR, byteString2) && !i.a(byteStringR, ByteString.f45705d)) {
                arrayList.add(byteStringR);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c2839f2.K0(byteStringE);
            }
            c2839f2.K0((ByteString) arrayList.get(i11));
        }
        if (c2839f2.f49074c == 0) {
            c2839f2.K0(byteString2);
        }
        return new z(c2839f2.R(c2839f2.f49074c));
    }

    public static final ByteString e(byte b10) {
        if (b10 == 47) {
            return f45714a;
        }
        if (b10 == 92) {
            return f45715b;
        }
        throw new IllegalArgumentException(J4.i.b(b10, "not a directory separator: "));
    }

    public static final ByteString f(String str) {
        if (i.a(str, "/")) {
            return f45714a;
        }
        if (i.a(str, "\\")) {
            return f45715b;
        }
        throw new IllegalArgumentException(B7.b.c("not a directory separator: ", str));
    }
}
