package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Iterable<Pair<? extends String, ? extends String>>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f45568b;

    /* JADX INFO: compiled from: Headers.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45569a = new ArrayList(20);

        public final void a(String name, String value) {
            kotlin.jvm.internal.i.e(name, "name");
            kotlin.jvm.internal.i.e(value, "value");
            b.a(name);
            b.b(value, name);
            c(name, value);
        }

        public final void b(String str) {
            int iP = kotlin.text.n.P(str, ':', 1, false, 4);
            if (iP != -1) {
                String strSubstring = str.substring(0, iP);
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iP + 1);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return;
            }
            if (str.charAt(0) != ':') {
                c("", str);
                return;
            }
            String strSubstring3 = str.substring(1);
            kotlin.jvm.internal.i.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
        }

        public final void c(String name, String value) {
            kotlin.jvm.internal.i.e(name, "name");
            kotlin.jvm.internal.i.e(value, "value");
            ArrayList arrayList = this.f45569a;
            arrayList.add(name);
            arrayList.add(kotlin.text.n.p0(value).toString());
        }

        public final void d(String name, String value) {
            kotlin.jvm.internal.i.e(name, "name");
            kotlin.jvm.internal.i.e(value, "value");
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(p172nb.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), name).toString());
                }
            }
            c(name, value);
        }

        public final o e() {
            return new o((String[]) this.f45569a.toArray(new String[0]));
        }

        public final String f(String name) {
            kotlin.jvm.internal.i.e(name, "name");
            ArrayList arrayList = this.f45569a;
            int size = arrayList.size() - 2;
            int iN = kotlinx.coroutines.C.n(size, 0, -2);
            if (iN > size) {
                return null;
            }
            while (!name.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == iN) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void g(String name) {
            kotlin.jvm.internal.i.e(name, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f45569a;
                if (i10 >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }

        public final void h(String name, String value) {
            kotlin.jvm.internal.i.e(name, "name");
            kotlin.jvm.internal.i.e(value, "value");
            b.a(name);
            b.b(value, name);
            g(name);
            c(name, value);
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    public static final class b {
        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(p172nb.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(p172nb.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(p172nb.b.q(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public static o c(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i11] = kotlin.text.n.p0(str).toString();
            }
            int iN = kotlinx.coroutines.C.n(0, strArr2.length - 1, 2);
            if (iN >= 0) {
                while (true) {
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    a(str2);
                    b(str3, str2);
                    if (i10 == iN) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new o(strArr2);
        }
    }

    public o(String[] strArr) {
        this.f45568b = strArr;
    }

    public final List<String> A(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (name.equalsIgnoreCase(k(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(v(i10));
            }
        }
        if (arrayList == null) {
            return EmptyList.f42983b;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.i.d(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final String e(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        String[] strArr = this.f45568b;
        int length = strArr.length - 2;
        int iN = kotlinx.coroutines.C.n(length, 0, -2);
        if (iN <= length) {
            while (!kotlin.text.m.D(name, strArr[length], true)) {
                if (length != iN) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (Arrays.equals(this.f45568b, ((o) obj).f45568b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45568b);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = new Pair(k(i10), v(i10));
        }
        return I2.e.m(pairArr);
    }

    public final String k(int i10) {
        return this.f45568b[i10 * 2];
    }

    public final a q() {
        a aVar = new a();
        kotlin.collections.p.A(aVar.f45569a, this.f45568b);
        return aVar;
    }

    public final int size() {
        return this.f45568b.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strK = k(i10);
            String strV = v(i10);
            sb2.append(strK);
            sb2.append(": ");
            if (p172nb.b.q(strK)) {
                strV = "██";
            }
            sb2.append(strV);
            sb2.append("\n");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String v(int i10) {
        return this.f45568b[(i10 * 2) + 1];
    }
}
