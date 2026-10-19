package p318zb;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import okio.ByteString;
import okio.internal.c;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Comparable<z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f49122c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteString f49123b;

    /* JADX INFO: compiled from: Path.kt */
    public static final class a {
        public static z a(String str, boolean z10) {
            i.e(str, "<this>");
            ByteString byteString = c.f45714a;
            C2839f c2839f = new C2839f();
            c2839f.f1(str);
            return c.d(c2839f, z10);
        }

        public static z b(File file) {
            String str = z.f49122c;
            i.e(file, "<this>");
            String string = file.toString();
            i.d(string, "toString(...)");
            return a(string, false);
        }
    }

    static {
        String separator = File.separator;
        i.d(separator, "separator");
        f49122c = separator;
    }

    public z(ByteString bytes) {
        i.e(bytes, "bytes");
        this.f49123b = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = c.a(this);
        ByteString byteString = this.f49123b;
        if (iA == -1) {
            iA = 0;
        } else if (iA < byteString.e() && byteString.k(iA) == 92) {
            iA++;
        }
        int iE = byteString.e();
        int i10 = iA;
        while (iA < iE) {
            if (byteString.k(iA) == 47 || byteString.k(iA) == 92) {
                arrayList.add(byteString.r(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < byteString.e()) {
            arrayList.add(byteString.r(i10, byteString.e()));
        }
        return arrayList;
    }

    public final z b() {
        ByteString byteString = c.f45717d;
        ByteString byteString2 = this.f49123b;
        if (i.a(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = c.f45714a;
        if (i.a(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = c.f45715b;
        if (i.a(byteString2, byteString4)) {
            return null;
        }
        ByteString suffix = c.f45718e;
        byteString2.getClass();
        i.e(suffix, "suffix");
        if (byteString2.p(byteString2.e() - suffix.e(), suffix, suffix.e()) && (byteString2.e() == 2 || byteString2.p(byteString2.e() - 3, byteString3, 1) || byteString2.p(byteString2.e() - 3, byteString4, 1))) {
            return null;
        }
        int iM = ByteString.m(byteString2, byteString3);
        if (iM == -1) {
            iM = ByteString.m(byteString2, byteString4);
        }
        if (iM == 2 && g() != null) {
            if (byteString2.e() == 3) {
                return null;
            }
            return new z(ByteString.s(byteString2, 0, 3, 1));
        }
        if (iM == 1 && byteString2.q(byteString4)) {
            return null;
        }
        if (iM != -1 || g() == null) {
            if (iM == -1) {
                return new z(byteString);
            }
            return iM == 0 ? new z(ByteString.s(byteString2, 0, 1, 1)) : new z(ByteString.s(byteString2, 0, iM, 1));
        }
        if (byteString2.e() == 2) {
            return null;
        }
        return new z(ByteString.s(byteString2, 0, 2, 1));
    }

    public final z c(z other) {
        i.e(other, "other");
        int iA = c.a(this);
        ByteString byteString = this.f49123b;
        z zVar = iA == -1 ? null : new z(byteString.r(0, iA));
        int iA2 = c.a(other);
        ByteString byteString2 = other.f49123b;
        if (!i.a(zVar, iA2 != -1 ? new z(byteString2.r(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && i.a(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && byteString.e() == byteString2.e()) {
            return a.a(".", false);
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(c.f45718e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        C2839f c2839f = new C2839f();
        ByteString byteStringC = c.c(other);
        if (byteStringC == null && (byteStringC = c.c(this)) == null) {
            byteStringC = c.f(f49122c);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c2839f.K0(c.f45718e);
            c2839f.K0(byteStringC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            c2839f.K0((ByteString) arrayListA.get(i10));
            c2839f.K0(byteStringC);
            i10++;
        }
        return c.d(c2839f, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(z zVar) {
        z other = zVar;
        i.e(other, "other");
        return this.f49123b.compareTo(other.f49123b);
    }

    public final z d(String child) {
        i.e(child, "child");
        C2839f c2839f = new C2839f();
        c2839f.f1(child);
        return c.b(this, c.d(c2839f, false), false);
    }

    public final File e() {
        return new File(this.f49123b.v());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && i.a(((z) obj).f49123b, this.f49123b);
    }

    public final Path f() {
        Path path = Paths.get(this.f49123b.v(), new String[0]);
        i.d(path, "get(...)");
        return path;
    }

    public final Character g() {
        ByteString byteString = c.f45714a;
        ByteString byteString2 = this.f49123b;
        if (ByteString.i(byteString2, byteString) != -1 || byteString2.e() < 2 || byteString2.k(1) != 58) {
            return null;
        }
        char cK = (char) byteString2.k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    public final int hashCode() {
        return this.f49123b.hashCode();
    }

    public final String toString() {
        return this.f49123b.v();
    }
}
