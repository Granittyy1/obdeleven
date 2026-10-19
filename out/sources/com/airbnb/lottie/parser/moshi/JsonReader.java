package com.airbnb.lottie.parser.moshi;

import C4.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import p318zb.C2839f;
import p318zb.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f23511f = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f23513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f23514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f23515e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Token f23516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Token f23517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Token f23518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Token f23519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Token f23520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Token f23521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Token f23522h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Token f23523i;
        public static final Token j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Token f23524k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ Token[] f23525l;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            f23516b = token;
            Token token2 = new Token("END_ARRAY", 1);
            f23517c = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            f23518d = token3;
            Token token4 = new Token("END_OBJECT", 3);
            f23519e = token4;
            Token token5 = new Token("NAME", 4);
            f23520f = token5;
            Token token6 = new Token("STRING", 5);
            f23521g = token6;
            Token token7 = new Token("NUMBER", 6);
            f23522h = token7;
            Token token8 = new Token("BOOLEAN", 7);
            f23523i = token8;
            Token token9 = new Token("NULL", 8);
            j = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            f23524k = token10;
            f23525l = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public Token() {
            throw null;
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) f23525l.clone();
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f23526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f23527b;

        public a(String[] strArr, x xVar) {
            this.f23526a = strArr;
            this.f23527b = xVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:27:0x005d), top: B:31:0x0000 }] */
        public static a a(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C2839f c2839f = new C2839f();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str2 = strArr[i10];
                    String[] strArr2 = JsonReader.f23511f;
                    c2839f.Z0(34);
                    int length = str2.length();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        char cCharAt = str2.charAt(i12);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i11 < i12) {
                                    c2839f.g1(str2, i11, i12);
                                }
                                c2839f.f1(str);
                                i11 = i12 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i11 < i12) {
                                c2839f.g1(str2, i11, i12);
                            }
                            c2839f.f1(str);
                            i11 = i12 + 1;
                        }
                    }
                    if (i11 < length) {
                        c2839f.g1(str2, i11, length);
                    }
                    c2839f.Z0(34);
                    c2839f.readByte();
                    byteStringArr[i10] = c2839f.R(c2839f.f49074c);
                }
                return new a((String[]) strArr.clone(), x.a.b(byteStringArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f23511f[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f23511f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract String B() throws IOException;

    public abstract Token C() throws IOException;

    public final void M(int i10) {
        int i11 = this.f23512b;
        int[] iArr = this.f23513c;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + j());
            }
            this.f23513c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f23514d;
            this.f23514d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f23515e;
            this.f23515e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f23513c;
        int i12 = this.f23512b;
        this.f23512b = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int N(a aVar) throws IOException;

    public abstract void R() throws IOException;

    public abstract void S() throws IOException;

    public final void U(String str) throws JsonEncodingException {
        StringBuilder sbF = b.f(str, " at path ");
        sbF.append(j());
        throw new JsonEncodingException(sbF.toString());
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void h() throws IOException;

    public abstract void i() throws IOException;

    public final String j() {
        int i10 = this.f23512b;
        int[] iArr = this.f23513c;
        String[] strArr = this.f23514d;
        int[] iArr2 = this.f23515e;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean k() throws IOException;

    public abstract boolean p() throws IOException;

    public abstract double s() throws IOException;

    public abstract int x() throws IOException;
}
