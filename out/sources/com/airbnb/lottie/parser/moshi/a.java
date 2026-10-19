package com.airbnb.lottie.parser.moshi;

import java.io.EOFException;
import java.io.IOException;
import me.zhanghai.android.materialprogressbar.R;
import okio.ByteString;
import p318zb.C;
import p318zb.C2839f;

/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends JsonReader {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ByteString f23528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ByteString f23529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ByteString f23530o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f23531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2839f f23532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23533i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f23535l;

    static {
        ByteString byteString = ByteString.f45705d;
        f23528m = ByteString.a.c("'\\");
        f23529n = ByteString.a.c("\"\\");
        f23530o = ByteString.a.c("{}[]:, \n\t\r\f/\\;#=");
        ByteString.a.c("\n\r");
        ByteString.a.c("*/");
    }

    public a(C c10) {
        this.f23513c = new int[32];
        this.f23514d = new String[32];
        this.f23515e = new int[32];
        this.f23533i = 0;
        this.f23531g = c10;
        this.f23532h = c10.f49038c;
        M(6);
    }

    public final char A0() throws IOException {
        int i10;
        C c10 = this.f23531g;
        if (!c10.g(1L)) {
            U("Unterminated escape sequence");
            throw null;
        }
        C2839f c2839f = this.f23532h;
        byte b10 = c2839f.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            U("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!c10.g(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + j());
        }
        char c11 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bP = c2839f.p(i11);
            char c12 = (char) (c11 << 4);
            if (bP >= 48 && bP <= 57) {
                i10 = bP - 48;
            } else if (bP >= 97 && bP <= 102) {
                i10 = bP - 87;
            } else {
                if (bP < 65 || bP > 70) {
                    U("\\u".concat(c2839f.o0(4L, kotlin.text.a.f43120b)));
                    throw null;
                }
                i10 = bP - 55;
            }
            c11 = (char) (i10 + c12);
        }
        c2839f.skip(4L);
        return c11;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String B() throws IOException {
        String strO0;
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 10) {
            strO0 = y0();
        } else if (iJ0 == 9) {
            strO0 = s0(f23529n);
        } else if (iJ0 == 8) {
            strO0 = s0(f23528m);
        } else if (iJ0 == 11) {
            strO0 = this.f23535l;
            this.f23535l = null;
        } else if (iJ0 == 16) {
            strO0 = Long.toString(this.j);
        } else {
            if (iJ0 != 17) {
                throw new JsonDataException("Expected a string but was " + C() + " at path " + j());
            }
            long j = this.f23534k;
            C2839f c2839f = this.f23532h;
            c2839f.getClass();
            strO0 = c2839f.o0(j, kotlin.text.a.f43120b);
        }
        this.f23533i = 0;
        int[] iArr = this.f23515e;
        int i10 = this.f23512b - 1;
        iArr[i10] = iArr[i10] + 1;
        return strO0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token C() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        switch (iJ0) {
            case 1:
                return JsonReader.Token.f23518d;
            case 2:
                return JsonReader.Token.f23519e;
            case 3:
                return JsonReader.Token.f23516b;
            case 4:
                return JsonReader.Token.f23517c;
            case 5:
            case 6:
                return JsonReader.Token.f23523i;
            case 7:
                return JsonReader.Token.j;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.f23521g;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.f23520f;
            case 16:
            case 17:
                return JsonReader.Token.f23522h;
            case 18:
                return JsonReader.Token.f23524k;
            default:
                throw new AssertionError();
        }
    }

    public final void I0(ByteString byteString) throws IOException {
        while (true) {
            long jH = this.f23531g.h(byteString);
            if (jH == -1) {
                U("Unterminated string");
                throw null;
            }
            C2839f c2839f = this.f23532h;
            if (c2839f.p(jH) != 92) {
                c2839f.skip(jH + 1);
                return;
            } else {
                c2839f.skip(jH + 1);
                A0();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int N(JsonReader.a aVar) throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 < 12 || iJ0 > 15) {
            return -1;
        }
        if (iJ0 == 15) {
            return m0(this.f23535l, aVar);
        }
        int iH = this.f23531g.H(aVar.f23527b);
        if (iH != -1) {
            this.f23533i = 0;
            this.f23514d[this.f23512b - 1] = aVar.f23526a[iH];
            return iH;
        }
        String str = this.f23514d[this.f23512b - 1];
        String strO0 = o0();
        int iM0 = m0(strO0, aVar);
        if (iM0 == -1) {
            this.f23533i = 15;
            this.f23535l = strO0;
            this.f23514d[this.f23512b - 1] = str;
        }
        return iM0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void R() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 14) {
            long jH = this.f23531g.h(f23530o);
            C2839f c2839f = this.f23532h;
            if (jH == -1) {
                jH = c2839f.f49074c;
            }
            c2839f.skip(jH);
        } else if (iJ0 == 13) {
            I0(f23529n);
        } else if (iJ0 == 12) {
            I0(f23528m);
        } else if (iJ0 != 15) {
            throw new JsonDataException("Expected a name but was " + C() + " at path " + j());
        }
        this.f23533i = 0;
        this.f23514d[this.f23512b - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void S() throws IOException {
        int i10 = 0;
        do {
            int iJ0 = this.f23533i;
            if (iJ0 == 0) {
                iJ0 = j0();
            }
            if (iJ0 == 3) {
                M(1);
            } else {
                if (iJ0 == 1) {
                    M(3);
                } else if (iJ0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + C() + " at path " + j());
                    }
                    this.f23512b--;
                } else if (iJ0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + C() + " at path " + j());
                    }
                    this.f23512b--;
                } else {
                    C2839f c2839f = this.f23532h;
                    if (iJ0 == 14 || iJ0 == 10) {
                        long jH = this.f23531g.h(f23530o);
                        if (jH == -1) {
                            jH = c2839f.f49074c;
                        }
                        c2839f.skip(jH);
                    } else if (iJ0 == 9 || iJ0 == 13) {
                        I0(f23529n);
                    } else if (iJ0 == 8 || iJ0 == 12) {
                        I0(f23528m);
                    } else if (iJ0 == 17) {
                        c2839f.skip(this.f23534k);
                    } else if (iJ0 == 18) {
                        throw new JsonDataException("Expected a value but was " + C() + " at path " + j());
                    }
                }
                this.f23533i = 0;
            }
            i10++;
            this.f23533i = 0;
        } while (i10 != 0);
        int[] iArr = this.f23515e;
        int i11 = this.f23512b - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f23514d[i11] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void b() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 3) {
            M(1);
            this.f23515e[this.f23512b - 1] = 0;
            this.f23533i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + C() + " at path " + j());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void c() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 1) {
            M(3);
            this.f23533i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + C() + " at path " + j());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f23533i = 0;
        this.f23513c[0] = 8;
        this.f23512b = 1;
        this.f23532h.b();
        this.f23531g.close();
    }

    public final void f0() throws IOException {
        U("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void h() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + C() + " at path " + j());
        }
        int i10 = this.f23512b;
        this.f23512b = i10 - 1;
        int[] iArr = this.f23515e;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f23533i = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void i() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + C() + " at path " + j());
        }
        int i10 = this.f23512b;
        int i11 = i10 - 1;
        this.f23512b = i11;
        this.f23514d[i11] = null;
        int[] iArr = this.f23515e;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f23533i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:163:0x01df  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0201  */
    /* JADX WARN: Code duplicated, block: B:178:0x0208  */
    /* JADX WARN: Code duplicated, block: B:180:0x020d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0215  */
    /* JADX WARN: Code duplicated, block: B:185:0x021c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0234  */
    /* JADX WARN: Code duplicated, block: B:196:0x0239  */
    /* JADX WARN: Code duplicated, block: B:231:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x00b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    public final int j0() throws IOException {
        int iR0;
        byte bP;
        C c10;
        int i10;
        String str;
        String str2;
        int length;
        int i11;
        int i12;
        char cP;
        char c11;
        int i13;
        int i14;
        int i15;
        int i16;
        byte bP2;
        char c12;
        int[] iArr = this.f23513c;
        int i17 = this.f23512b - 1;
        int i18 = iArr[i17];
        C2839f c2839f = this.f23532h;
        if (i18 == 1) {
            iArr[i17] = 2;
        } else if (i18 == 2) {
            int iR1 = r0(true);
            c2839f.readByte();
            if (iR1 != 44) {
                if (iR1 == 59) {
                    f0();
                    throw null;
                }
                if (iR1 == 93) {
                    this.f23533i = 4;
                    return 4;
                }
                U("Unterminated array");
                throw null;
            }
        } else {
            if (i18 == 3 || i18 == 5) {
                iArr[i17] = 4;
                if (i18 == 5) {
                    int iR2 = r0(true);
                    c2839f.readByte();
                    if (iR2 != 44) {
                        if (iR2 == 59) {
                            f0();
                            throw null;
                        }
                        if (iR2 == 125) {
                            this.f23533i = 2;
                            return 2;
                        }
                        U("Unterminated object");
                        throw null;
                    }
                }
                int iR3 = r0(true);
                if (iR3 == 34) {
                    c2839f.readByte();
                    this.f23533i = 13;
                    return 13;
                }
                if (iR3 == 39) {
                    c2839f.readByte();
                    f0();
                    throw null;
                }
                if (iR3 != 125) {
                    f0();
                    throw null;
                }
                if (i18 == 5) {
                    U("Expected name");
                    throw null;
                }
                c2839f.readByte();
                this.f23533i = 2;
                return 2;
            }
            if (i18 != 4) {
                if (i18 == 6) {
                    iArr[i17] = 7;
                } else {
                    if (i18 == 7) {
                        if (r0(false) == -1) {
                            this.f23533i = 18;
                            return 18;
                        }
                        f0();
                        throw null;
                    }
                    if (i18 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iR0 = r0(true);
                if (iR0 != 34) {
                    c2839f.readByte();
                    this.f23533i = 9;
                    return 9;
                }
                if (iR0 != 39) {
                    f0();
                    throw null;
                }
                if (iR0 != 44 && iR0 != 59) {
                    if (iR0 != 91) {
                        c2839f.readByte();
                        this.f23533i = 3;
                        return 3;
                    }
                    if (iR0 != 93) {
                        if (iR0 != 123) {
                            c2839f.readByte();
                            this.f23533i = 1;
                            return 1;
                        }
                        bP = c2839f.p(0L);
                        c10 = this.f23531g;
                        if (bP != 116 || bP == 84) {
                            i10 = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bP != 102 && bP != 70) {
                                if (bP != 110 && bP != 78) {
                                    i10 = 0;
                                    break;
                                }
                                i10 = 7;
                                str2 = "null";
                                str = "NULL";
                                if (i10 != 0) {
                                    return i10;
                                }
                                long j = 0;
                                boolean z10 = true;
                                c11 = 0;
                                i13 = 0;
                                boolean z11 = false;
                                while (true) {
                                    i14 = i13 + 1;
                                    if (c10.g(i14)) {
                                        bP2 = c2839f.p(i13);
                                        if (bP2 != 43) {
                                            if (bP2 != 69 || bP2 == 101) {
                                                if (c11 != 2 || c11 == 4) {
                                                    c11 = 5;
                                                    i13 = i14;
                                                } else {
                                                    i16 = 0;
                                                }
                                            } else if (bP2 == 45) {
                                                c12 = 6;
                                                if (c11 == 0) {
                                                    c11 = 1;
                                                    z11 = true;
                                                } else {
                                                    if (c11 != 5) {
                                                        i16 = 0;
                                                    }
                                                    c11 = c12;
                                                }
                                                i13 = i14;
                                            } else if (bP2 != 46) {
                                                if (bP2 >= 48 && bP2 <= 57) {
                                                    if (c11 == 1 || c11 == 0) {
                                                        j = -(bP2 - 48);
                                                        c11 = 2;
                                                    } else {
                                                        if (c11 == 2) {
                                                            if (j != 0) {
                                                                long j10 = (10 * j) - ((long) (bP2 - 48));
                                                                z10 &= j > -922337203685477580L || (j == -922337203685477580L && j10 < j);
                                                                j = j10;
                                                            }
                                                        } else if (c11 == 3) {
                                                            c11 = 4;
                                                        } else if (c11 == 5 || c11 == 6) {
                                                            c11 = 7;
                                                        }
                                                        i13 = i14;
                                                    }
                                                    i13 = i14;
                                                } else if (!n0(bP2)) {
                                                }
                                                i16 = 0;
                                            } else if (c11 == 2) {
                                                c11 = 3;
                                                i13 = i14;
                                            } else {
                                                i16 = 0;
                                            }
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (n0(c2839f.p(0L))) {
                                                f0();
                                                throw null;
                                            }
                                            U("Expected value");
                                            throw null;
                                        }
                                        c12 = 6;
                                        if (c11 != 5) {
                                            i16 = 0;
                                            if (i16 != 0) {
                                                return i16;
                                            }
                                            if (n0(c2839f.p(0L))) {
                                                U("Expected value");
                                                throw null;
                                            }
                                            f0();
                                            throw null;
                                        }
                                        c11 = c12;
                                        i13 = i14;
                                    }
                                    if (c11 == 2 || !z10 || ((j == Long.MIN_VALUE && !z11) || (j == 0 && z11))) {
                                        if (c11 != 2 || c11 == 4 || c11 == 7) {
                                            this.f23534k = i13;
                                            i15 = 17;
                                            this.f23533i = 17;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (i16 != 0) {
                                            return i16;
                                        }
                                        if (n0(c2839f.p(0L))) {
                                            U("Expected value");
                                            throw null;
                                        }
                                        f0();
                                        throw null;
                                    }
                                    if (!z11) {
                                        j = -j;
                                    }
                                    this.j = j;
                                    c2839f.skip(i13);
                                    i15 = 16;
                                    this.f23533i = 16;
                                    i16 = i15;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (n0(c2839f.p(0L))) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    f0();
                                    throw null;
                                }
                            }
                            i10 = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        length = str2.length();
                        i11 = 1;
                        while (true) {
                            if (i11 >= length) {
                                if (c10.g(length + 1) || !n0(c2839f.p(length))) {
                                    c2839f.skip(length);
                                    this.f23533i = i10;
                                    break;
                                }
                            } else {
                                i12 = i11 + 1;
                                if (!c10.g(i12) && ((cP = c2839f.p(i11)) == str2.charAt(i11) || cP == str.charAt(i11))) {
                                    i11 = i12;
                                }
                            }
                            i10 = 0;
                            break;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        long j11 = 0;
                        boolean z12 = true;
                        c11 = 0;
                        i13 = 0;
                        boolean z13 = false;
                        while (true) {
                            i14 = i13 + 1;
                            if (c10.g(i14)) {
                                bP2 = c2839f.p(i13);
                                if (bP2 != 43) {
                                    if (bP2 != 69) {
                                        if (c11 != 2) {
                                        }
                                        c11 = 5;
                                        i13 = i14;
                                    } else {
                                        if (c11 != 2) {
                                        }
                                        c11 = 5;
                                        i13 = i14;
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (n0(c2839f.p(0L))) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    f0();
                                    throw null;
                                }
                                c12 = 6;
                                if (c11 != 5) {
                                    i16 = 0;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (n0(c2839f.p(0L))) {
                                        U("Expected value");
                                        throw null;
                                    }
                                    f0();
                                    throw null;
                                }
                                c11 = c12;
                                i13 = i14;
                            }
                            if (c11 == 2) {
                                if (c11 != 2) {
                                }
                                this.f23534k = i13;
                                i15 = 17;
                                this.f23533i = 17;
                            } else {
                                if (c11 != 2) {
                                }
                                this.f23534k = i13;
                                i15 = 17;
                                this.f23533i = 17;
                            }
                            i16 = i15;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n0(c2839f.p(0L))) {
                                U("Expected value");
                                throw null;
                            }
                            f0();
                            throw null;
                        }
                    }
                    if (i18 == 1) {
                        c2839f.readByte();
                        this.f23533i = 4;
                        return 4;
                    }
                }
                if (i18 != 1 || i18 == 2) {
                    f0();
                    throw null;
                }
                U("Unexpected value");
                throw null;
            }
            iArr[i17] = 5;
            int iR4 = r0(true);
            c2839f.readByte();
            if (iR4 != 58) {
                if (iR4 != 61) {
                    U("Expected ':'");
                    throw null;
                }
                f0();
                throw null;
            }
        }
        iR0 = r0(true);
        if (iR0 != 34) {
            c2839f.readByte();
            this.f23533i = 9;
            return 9;
        }
        if (iR0 != 39) {
            f0();
            throw null;
        }
        if (iR0 != 44) {
            if (iR0 != 91) {
                c2839f.readByte();
                this.f23533i = 3;
                return 3;
            }
            if (iR0 != 93) {
                if (iR0 != 123) {
                    c2839f.readByte();
                    this.f23533i = 1;
                    return 1;
                }
                bP = c2839f.p(0L);
                c10 = this.f23531g;
                if (bP != 116) {
                    i10 = 5;
                    str2 = "true";
                    str = "TRUE";
                    length = str2.length();
                    i11 = 1;
                    while (true) {
                        if (i11 >= length) {
                            if (c10.g(length + 1)) {
                            }
                            c2839f.skip(length);
                            this.f23533i = i10;
                            break;
                        }
                        i12 = i11 + 1;
                        if (!c10.g(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 != 0) {
                        return i10;
                    }
                    long j12 = 0;
                    boolean z14 = true;
                    c11 = 0;
                    i13 = 0;
                    boolean z15 = false;
                    while (true) {
                        i14 = i13 + 1;
                        if (c10.g(i14)) {
                            bP2 = c2839f.p(i13);
                            if (bP2 != 43) {
                                if (bP2 != 69) {
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i13 = i14;
                                } else {
                                    if (c11 != 2) {
                                    }
                                    c11 = 5;
                                    i13 = i14;
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (n0(c2839f.p(0L))) {
                                    U("Expected value");
                                    throw null;
                                }
                                f0();
                                throw null;
                            }
                            c12 = 6;
                            if (c11 != 5) {
                                i16 = 0;
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (n0(c2839f.p(0L))) {
                                    U("Expected value");
                                    throw null;
                                }
                                f0();
                                throw null;
                            }
                            c11 = c12;
                            i13 = i14;
                        }
                        if (c11 == 2) {
                            if (c11 != 2) {
                            }
                            this.f23534k = i13;
                            i15 = 17;
                            this.f23533i = 17;
                        } else {
                            if (c11 != 2) {
                            }
                            this.f23534k = i13;
                            i15 = 17;
                            this.f23533i = 17;
                        }
                        i16 = i15;
                        if (i16 != 0) {
                            return i16;
                        }
                        if (n0(c2839f.p(0L))) {
                            U("Expected value");
                            throw null;
                        }
                        f0();
                        throw null;
                    }
                }
                i10 = 5;
                str2 = "true";
                str = "TRUE";
                length = str2.length();
                i11 = 1;
                while (true) {
                    if (i11 >= length) {
                        if (c10.g(length + 1)) {
                        }
                        c2839f.skip(length);
                        this.f23533i = i10;
                        break;
                    }
                    i12 = i11 + 1;
                    if (!c10.g(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != 0) {
                    return i10;
                }
                long j13 = 0;
                boolean z16 = true;
                c11 = 0;
                i13 = 0;
                boolean z17 = false;
                while (true) {
                    i14 = i13 + 1;
                    if (c10.g(i14)) {
                        bP2 = c2839f.p(i13);
                        if (bP2 != 43) {
                            if (bP2 != 69) {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            } else {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n0(c2839f.p(0L))) {
                                U("Expected value");
                                throw null;
                            }
                            f0();
                            throw null;
                        }
                        c12 = 6;
                        if (c11 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n0(c2839f.p(0L))) {
                                U("Expected value");
                                throw null;
                            }
                            f0();
                            throw null;
                        }
                        c11 = c12;
                        i13 = i14;
                    }
                    if (c11 == 2) {
                        if (c11 != 2) {
                        }
                        this.f23534k = i13;
                        i15 = 17;
                        this.f23533i = 17;
                    } else {
                        if (c11 != 2) {
                        }
                        this.f23534k = i13;
                        i15 = 17;
                        this.f23533i = 17;
                    }
                    i16 = i15;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (n0(c2839f.p(0L))) {
                        U("Expected value");
                        throw null;
                    }
                    f0();
                    throw null;
                }
                i10 = 0;
                if (i10 != 0) {
                    return i10;
                }
                long j14 = 0;
                boolean z18 = true;
                c11 = 0;
                i13 = 0;
                boolean z19 = false;
                while (true) {
                    i14 = i13 + 1;
                    if (c10.g(i14)) {
                        bP2 = c2839f.p(i13);
                        if (bP2 != 43) {
                            if (bP2 != 69) {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            } else {
                                if (c11 != 2) {
                                }
                                c11 = 5;
                                i13 = i14;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n0(c2839f.p(0L))) {
                                U("Expected value");
                                throw null;
                            }
                            f0();
                            throw null;
                        }
                        c12 = 6;
                        if (c11 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (n0(c2839f.p(0L))) {
                                U("Expected value");
                                throw null;
                            }
                            f0();
                            throw null;
                        }
                        c11 = c12;
                        i13 = i14;
                    }
                    if (c11 == 2) {
                        if (c11 != 2) {
                        }
                        this.f23534k = i13;
                        i15 = 17;
                        this.f23533i = 17;
                    } else {
                        if (c11 != 2) {
                        }
                        this.f23534k = i13;
                        i15 = 17;
                        this.f23533i = 17;
                    }
                    i16 = i15;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (n0(c2839f.p(0L))) {
                        U("Expected value");
                        throw null;
                    }
                    f0();
                    throw null;
                }
            }
            if (i18 == 1) {
                c2839f.readByte();
                this.f23533i = 4;
                return 4;
            }
        }
        if (i18 != 1) {
        }
        f0();
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean k() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        return (iJ0 == 2 || iJ0 == 4 || iJ0 == 18) ? false : true;
    }

    public final int m0(String str, JsonReader.a aVar) {
        int length = aVar.f23526a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f23526a[i10])) {
                this.f23533i = 0;
                this.f23514d[this.f23512b - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean n0(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            return false;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f0();
        throw null;
    }

    public final String o0() throws IOException {
        String strS0;
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 14) {
            strS0 = y0();
        } else if (iJ0 == 13) {
            strS0 = s0(f23529n);
        } else if (iJ0 == 12) {
            strS0 = s0(f23528m);
        } else {
            if (iJ0 != 15) {
                throw new JsonDataException("Expected a name but was " + C() + " at path " + j());
            }
            strS0 = this.f23535l;
        }
        this.f23533i = 0;
        this.f23514d[this.f23512b - 1] = strS0;
        return strS0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean p() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 5) {
            this.f23533i = 0;
            int[] iArr = this.f23515e;
            int i10 = this.f23512b - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iJ0 == 6) {
            this.f23533i = 0;
            int[] iArr2 = this.f23515e;
            int i11 = this.f23512b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + C() + " at path " + j());
    }

    public final int r0(boolean z10) throws IOException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            C c10 = this.f23531g;
            if (!c10.g(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i10;
            C2839f c2839f = this.f23532h;
            byte bP = c2839f.p(j);
            if (bP != 10 && bP != 32 && bP != 13 && bP != 9) {
                c2839f.skip(j);
                if (bP == 47) {
                    if (!c10.g(2L)) {
                        return bP;
                    }
                    f0();
                    throw null;
                }
                if (bP != 35) {
                    return bP;
                }
                f0();
                throw null;
            }
            i10 = i11;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double s() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 16) {
            this.f23533i = 0;
            int[] iArr = this.f23515e;
            int i10 = this.f23512b - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.j;
        }
        if (iJ0 == 17) {
            long j = this.f23534k;
            C2839f c2839f = this.f23532h;
            c2839f.getClass();
            this.f23535l = c2839f.o0(j, kotlin.text.a.f43120b);
        } else if (iJ0 == 9) {
            this.f23535l = s0(f23529n);
        } else if (iJ0 == 8) {
            this.f23535l = s0(f23528m);
        } else if (iJ0 == 10) {
            this.f23535l = y0();
        } else if (iJ0 != 11) {
            throw new JsonDataException("Expected a double but was " + C() + " at path " + j());
        }
        this.f23533i = 11;
        try {
            double d10 = Double.parseDouble(this.f23535l);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + j());
            }
            this.f23535l = null;
            this.f23533i = 0;
            int[] iArr2 = this.f23515e;
            int i11 = this.f23512b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f23535l + " at path " + j());
        }
    }

    public final String s0(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jH = this.f23531g.h(byteString);
            if (jH == -1) {
                U("Unterminated string");
                throw null;
            }
            C2839f c2839f = this.f23532h;
            if (c2839f.p(jH) != 92) {
                if (sb2 == null) {
                    String strO0 = c2839f.o0(jH, kotlin.text.a.f43120b);
                    c2839f.readByte();
                    return strO0;
                }
                sb2.append(c2839f.o0(jH, kotlin.text.a.f43120b));
                c2839f.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c2839f.o0(jH, kotlin.text.a.f43120b));
            c2839f.readByte();
            sb2.append(A0());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f23531g + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int x() throws IOException {
        int iJ0 = this.f23533i;
        if (iJ0 == 0) {
            iJ0 = j0();
        }
        if (iJ0 == 16) {
            long j = this.j;
            int i10 = (int) j;
            if (j == i10) {
                this.f23533i = 0;
                int[] iArr = this.f23515e;
                int i11 = this.f23512b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.j + " at path " + j());
        }
        if (iJ0 == 17) {
            long j10 = this.f23534k;
            C2839f c2839f = this.f23532h;
            c2839f.getClass();
            this.f23535l = c2839f.o0(j10, kotlin.text.a.f43120b);
        } else if (iJ0 == 9 || iJ0 == 8) {
            String strS0 = iJ0 == 9 ? s0(f23529n) : s0(f23528m);
            this.f23535l = strS0;
            try {
                int i12 = Integer.parseInt(strS0);
                this.f23533i = 0;
                int[] iArr2 = this.f23515e;
                int i13 = this.f23512b - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iJ0 != 11) {
            throw new JsonDataException("Expected an int but was " + C() + " at path " + j());
        }
        this.f23533i = 11;
        try {
            double d10 = Double.parseDouble(this.f23535l);
            int i14 = (int) d10;
            if (i14 != d10) {
                throw new JsonDataException("Expected an int but was " + this.f23535l + " at path " + j());
            }
            this.f23535l = null;
            this.f23533i = 0;
            int[] iArr3 = this.f23515e;
            int i15 = this.f23512b - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f23535l + " at path " + j());
        }
    }

    public final String y0() throws IOException {
        long jH = this.f23531g.h(f23530o);
        C2839f c2839f = this.f23532h;
        if (jH == -1) {
            return c2839f.r0();
        }
        c2839f.getClass();
        return c2839f.o0(jH, kotlin.text.a.f43120b);
    }
}
