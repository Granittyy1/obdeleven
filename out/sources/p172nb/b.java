package p172nb;

import I2.e;
import com.braze.support.BrazeLogger;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.n;
import okhttp3.B;
import okhttp3.o;
import okhttp3.p;
import okhttp3.t;
import okhttp3.y;
import okhttp3.z;
import okio.ByteString;
import p318zb.C;
import p318zb.C2839f;
import p318zb.H;
import p318zb.InterfaceC2841h;
import p318zb.x;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f45026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f45027b = o.b.c(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f45028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f45029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f45030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Regex f45031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f45032g;

    static {
        byte[] bArr = new byte[0];
        f45026a = bArr;
        C2839f c2839f = new C2839f();
        c2839f.P0(bArr);
        f45028c = new B(null, 0, c2839f);
        y.a.c(y.Companion, bArr, null, 0, 7);
        ByteString byteString = ByteString.f45705d;
        f45029d = x.a.b(ByteString.a.b("efbbbf"), ByteString.a.b("feff"), ByteString.a.b("fffe"), ByteString.a.b("0000ffff"), ByteString.a.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        i.b(timeZone);
        f45030e = timeZone;
        f45031f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f45032g = n.a0(n.Z(t.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(p pVar, p other) {
        i.e(pVar, "<this>");
        i.e(other, "other");
        return i.a(pVar.f45574d, other.f45574d) && pVar.f45575e == other.f45575e && i.a(pVar.f45571a, other.f45571a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) {
        i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!i.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i10, int i11, String str, String str2) {
        i.e(str, "<this>");
        while (i10 < i11) {
            if (n.K(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, char c10, int i10, int i11) {
        i.e(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int g(String str, char c10, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return f(str, c10, i10, i11);
    }

    public static final boolean h(H h8, TimeUnit timeUnit) {
        i.e(timeUnit, "timeUnit");
        try {
            return u(h8, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... objArr) {
        i.e(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                a aVarM = e.m(strArr2);
                while (aVarM.hasNext()) {
                    if (comparator.compare(str, (String) aVarM.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(z zVar) {
        String strE = zVar.f45685g.e("Content-Length");
        if (strE == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> l(T... elements) {
        i.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(l.s(Arrays.copyOf(objArr, objArr.length)));
        i.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (i.g(cCharAt, 31) <= 0 || i.g(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int n(String str, int i10, int i11) {
        i.e(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int o(String str, int i10, int i11) {
        i.e(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator<? super String> comparator) {
        i.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String name) {
        i.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset s(InterfaceC2841h interfaceC2841h, Charset charset) throws IOException {
        Charset charsetForName;
        i.e(interfaceC2841h, "<this>");
        i.e(charset, "default");
        int iH = interfaceC2841h.H(f45029d);
        if (iH == -1) {
            return charset;
        }
        if (iH == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            i.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iH == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            i.d(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iH == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            i.d(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iH == 3) {
            kotlin.text.a.f43119a.getClass();
            charsetForName = kotlin.text.a.f43124f;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                i.d(charsetForName, "forName(...)");
                kotlin.text.a.f43124f = charsetForName;
            }
        } else {
            if (iH != 4) {
                throw new AssertionError();
            }
            kotlin.text.a.f43119a.getClass();
            charsetForName = kotlin.text.a.f43123e;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                i.d(charsetForName, "forName(...)");
                kotlin.text.a.f43123e = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int t(C c10) throws IOException {
        i.e(c10, "<this>");
        return (c10.readByte() & 255) | ((c10.readByte() & 255) << 16) | ((c10.readByte() & 255) << 8);
    }

    public static final boolean u(H h8, int i10, TimeUnit timeUnit) throws IOException {
        i.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = h8.timeout().e() ? h8.timeout().c() - jNanoTime : Long.MAX_VALUE;
        h8.timeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C2839f c2839f = new C2839f();
            while (h8.l0(c2839f, 8192L) != -1) {
                c2839f.b();
            }
            if (jC == Long.MAX_VALUE) {
                h8.timeout().a();
            } else {
                h8.timeout().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                h8.timeout().a();
            } else {
                h8.timeout().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                h8.timeout().a();
            } else {
                h8.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final o v(List<rb.a> list) {
        i.e(list, "<this>");
        o.a aVar = new o.a();
        for (rb.a aVar2 : list) {
            aVar.c(aVar2.f46522a.v(), aVar2.f46523b.v());
        }
        return aVar.e();
    }

    public static final String w(p pVar, boolean z10) {
        int i10;
        i.e(pVar, "<this>");
        String strC = pVar.f45574d;
        if (n.J(strC, ":", false)) {
            strC = p005a4.o.c(']', "[", strC);
        }
        int i11 = pVar.f45575e;
        if (!z10) {
            String scheme = pVar.f45571a;
            i.e(scheme, "scheme");
            if (scheme.equals("http")) {
                i10 = 80;
            } else {
                i10 = scheme.equals("https") ? 443 : -1;
            }
            if (i11 == i10) {
                return strC;
            }
        }
        return strC + ':' + i11;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        i.e(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(q.p0(list));
        i.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return BrazeLogger.SUPPRESS;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String z(String str, int i10, int i11) {
        int iN = n(str, i10, i11);
        String strSubstring = str.substring(iN, o(str, iN, i11));
        i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
