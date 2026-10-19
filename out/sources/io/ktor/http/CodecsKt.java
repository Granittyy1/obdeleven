package io.ktor.http;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: Codecs.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CodecsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Byte> f40457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Character> f40458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<Character> f40459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f40460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<Character> f40461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayList f40462f;

    static {
        ArrayList arrayListC0 = kotlin.collections.q.c0(kotlin.collections.q.b0(new Na.c('a', 'z'), new Na.c('A', 'Z')), new Na.c('0', '9'));
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(arrayListC0, 10));
        Iterator it = arrayListC0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f40457a = kotlin.collections.q.s0(arrayList);
        f40458b = kotlin.collections.q.s0(kotlin.collections.q.c0(kotlin.collections.q.b0(new Na.c('a', 'z'), new Na.c('A', 'Z')), new Na.c('0', '9')));
        f40459c = kotlin.collections.q.s0(kotlin.collections.q.c0(kotlin.collections.q.b0(new Na.c('a', 'f'), new Na.c('A', 'F')), new Na.c('0', '9')));
        Set setC = kotlin.collections.B.C(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(setC, 10));
        Iterator it2 = setC.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f40460d = arrayList2;
        f40461e = kotlin.collections.B.C(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        kotlin.collections.B.A(f40458b, kotlin.collections.B.C('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        List listS = kotlin.collections.l.s('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(listS, 10));
        Iterator it3 = listS.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f40462f = arrayList3;
    }

    public static final String a(byte b10) {
        int i10 = (b10 & 255) >> 4;
        int i11 = b10 & 15;
        return new String(new char[]{'%', (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48), (char) ((i11 < 0 || i11 >= 10) ? ((char) (i11 + 65)) - '\n' : i11 + 48)});
    }

    public static final int b(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    public static final String c(String str, int i10, int i11, boolean z10, Charset charset) throws URLDecodeException {
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z10 && cCharAt == '+')) {
                int i13 = i11 - i10;
                if (i13 > 255) {
                    i13 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i13);
                if (i12 > i10) {
                    sb2.append((CharSequence) str, i10, i12);
                }
                byte[] bArr = null;
                while (i12 < i11) {
                    char cCharAt2 = str.charAt(i12);
                    if (z10 && cCharAt2 == '+') {
                        sb2.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i11 - i12) / 3];
                        }
                        int i14 = 0;
                        while (i12 < i11 && str.charAt(i12) == '%') {
                            int i15 = i12 + 2;
                            if (i15 >= i11) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i12, str.length()).toString() + ", in " + ((Object) str) + " at " + i12);
                            }
                            int i16 = i12 + 1;
                            int iB = b(str.charAt(i16));
                            int iB2 = b(str.charAt(i15));
                            if (iB == -1 || iB2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i16) + str.charAt(i15) + ", in " + ((Object) str) + ", at " + i12);
                            }
                            bArr[i14] = (byte) ((iB * 16) + iB2);
                            i12 += 3;
                            i14++;
                        }
                        sb2.append(new String(bArr, 0, i14, charset));
                    } else {
                        sb2.append(cCharAt2);
                    }
                    i12++;
                }
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "sb.toString()");
                return string;
            }
            i12++;
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String d(String str) {
        int length = str.length();
        Charset charset = kotlin.text.a.f43120b;
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(charset, "charset");
        return c(str, 0, length, false, charset);
    }

    public static String e(String str, int i10, int i11, boolean z10, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        Charset charset = kotlin.text.a.f43120b;
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(charset, "charset");
        return c(str, i10, i11, z10, charset);
    }

    public static final String f(String str, final boolean z10) {
        kotlin.jvm.internal.i.e(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = kotlin.text.a.f43120b.newEncoder();
        kotlin.jvm.internal.i.d(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        g(S4.o.f(charsetEncoderNewEncoder, str, 0, str.length()), new Ia.l<Byte, p293xa.r>() { // from class: io.ktor.http.CodecsKt$encodeURLParameter$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Byte b10) {
                byte bByteValue = b10.byteValue();
                if (CodecsKt.f40457a.contains(Byte.valueOf(bByteValue)) || CodecsKt.f40462f.contains(Byte.valueOf(bByteValue))) {
                    sb2.append((char) bByteValue);
                } else if (z10 && bByteValue == 32) {
                    sb2.append('+');
                } else {
                    sb2.append(CodecsKt.a(bByteValue));
                }
                return p293xa.r.f47939a;
            }
        });
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void g(p061ea.d dVar, Ia.l<? super Byte, p293xa.r> lVar) {
        boolean z10 = true;
        p074fa.a aVarB = p074fa.b.b(dVar, 1);
        if (aVarB == null) {
            return;
        }
        while (true) {
            try {
                int i10 = aVarB.f34857c;
                int i11 = aVarB.f34856b;
                if (i10 > i11) {
                    if (i11 == i10) {
                        throw new EOFException("No readable bytes available.");
                    }
                    aVarB.f34856b = i11 + 1;
                    lVar.invoke(Byte.valueOf(aVarB.f34855a.get(i11)));
                    if (z10) {
                        p074fa.b.a(dVar, aVarB);
                    }
                    throw th;
                }
                try {
                    aVarB = p074fa.b.c(dVar, aVarB);
                    if (aVarB == null) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    z10 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
