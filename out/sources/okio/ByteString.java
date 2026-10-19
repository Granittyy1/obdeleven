package okio;

import A1.C0575j;
import Q3.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import okio.internal.b;
import p005a4.o;
import p293xa.r;
import p318zb.C2834a;
import p318zb.C2839f;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteString f45705d = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f45706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f45707c;
    private final byte[] data;

    /* JADX INFO: compiled from: ByteString.kt */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
        public static ByteString a(String str) {
            int i10;
            char cCharAt;
            i.e(str, "<this>");
            byte[] bArr = okio.a.f45710a;
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i11 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i11];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i12 >= length) {
                    int i16 = i13 % 4;
                    if (i16 != 1) {
                        if (i16 == 2) {
                            bArrCopyOf[i15] = (byte) ((i14 << 12) >> 16);
                            i15 = 1 + i15;
                        } else if (i16 == 3) {
                            int i17 = i14 << 6;
                            int i18 = 1 + i15;
                            bArrCopyOf[i15] = (byte) (i17 >> 16);
                            i15 += 2;
                            bArrCopyOf[i18] = (byte) (i17 >> 8);
                        }
                        if (i15 != i11) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                            i.d(bArrCopyOf, "copyOf(...)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new ByteString(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i12);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i10 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i10 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i10 = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i10 = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                    } else {
                        i10 = 63;
                    }
                    i12++;
                }
                int i19 = i10 | (i14 << 6);
                i13++;
                if (i13 % 4 == 0) {
                    bArrCopyOf[i15] = (byte) (i19 >> 16);
                    int i20 = i15 + 2;
                    bArrCopyOf[i15 + 1] = (byte) (i19 >> 8);
                    i15 += 3;
                    bArrCopyOf[i20] = (byte) i19;
                }
                i14 = i19;
                i12++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new ByteString(bArrCopyOf);
            }
            return null;
        }

        public static ByteString b(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (b.a(str.charAt(i11 + 1)) + (b.a(str.charAt(i11)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString c(String str) {
            i.e(str, "<this>");
            byte[] bytes = str.getBytes(kotlin.text.a.f43120b);
            i.d(bytes, "getBytes(...)");
            ByteString byteString = new ByteString(bytes);
            byteString.f45707c = str;
            return byteString;
        }

        public static ByteString d(byte[] bArr) {
            int length = C2834a.f49061b;
            if (length == C2834a.f49061b) {
                length = bArr.length;
            }
            C2834a.b(bArr.length, 0, length);
            return new ByteString(d.t(bArr, 0, length + 0));
        }
    }

    public ByteString(byte[] data) {
        i.e(data, "data");
        this.data = data;
    }

    public static int i(ByteString byteString, ByteString other) {
        byteString.getClass();
        i.e(other, "other");
        return byteString.h(0, other.data);
    }

    public static int m(ByteString byteString, ByteString other) {
        int i10 = C2834a.f49061b;
        byteString.getClass();
        i.e(other, "other");
        return byteString.l(i10, other.data);
    }

    public static final ByteString n(byte... data) {
        i.e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        i.d(bArrCopyOf, "copyOf(...)");
        return new ByteString(bArrCopyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = objectInputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static ByteString s(ByteString byteString, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = C2834a.f49061b;
        }
        return byteString.r(i10, i11);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public String a() {
        byte[] bArr = this.data;
        byte[] map = okio.a.f45710a;
        i.e(bArr, "<this>");
        i.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & 255) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & 255) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return new String(bArr2, kotlin.text.a.f43120b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.i.e(r10, r0)
            int r0 = r9.e()
            int r1 = r10.e()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.k(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.k(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public ByteString c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, e());
        byte[] bArrDigest = messageDigest.digest();
        i.b(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final byte[] d() {
        return this.data;
    }

    public int e() {
        return this.data.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iE = byteString.e();
            byte[] bArr = this.data;
            if (iE == bArr.length && byteString.o(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = b.f45713a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public final int g(int i10, ByteString other) {
        i.e(other, "other");
        return h(i10, other.data);
    }

    public int h(int i10, byte[] other) {
        i.e(other, "other");
        int length = this.data.length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!C2834a.a(iMax, 0, other.length, this.data, other)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public int hashCode() {
        int i10 = this.f45706b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.f45706b = iHashCode;
        return iHashCode;
    }

    public byte[] j() {
        return this.data;
    }

    public byte k(int i10) {
        return this.data[i10];
    }

    public int l(int i10, byte[] other) {
        i.e(other, "other");
        for (int iMin = Math.min(C2834a.c(i10, this), this.data.length - other.length); -1 < iMin; iMin--) {
            if (C2834a.a(iMin, 0, other.length, this.data, other)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean o(int i10, int i11, int i12, byte[] other) {
        i.e(other, "other");
        if (i10 >= 0) {
            byte[] bArr = this.data;
            if (i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && C2834a.a(i10, i11, i12, bArr, other)) {
                return true;
            }
        }
        return false;
    }

    public boolean p(int i10, ByteString other, int i11) {
        i.e(other, "other");
        return other.o(0, i10, i11, this.data);
    }

    public final boolean q(ByteString prefix) {
        i.e(prefix, "prefix");
        return p(0, prefix, prefix.e());
    }

    public ByteString r(int i10, int i11) {
        int iC = C2834a.c(i11, this);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.data;
        if (iC > bArr.length) {
            throw new IllegalArgumentException(C0575j.b(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (iC - i10 >= 0) {
            return (i10 == 0 && iC == bArr.length) ? this : new ByteString(d.t(bArr, i10, iC));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public ByteString t() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d A[EDGE_INSN: B:22:0x003d->B:183:0x01b5 BREAK  A[LOOP:0: B:6:0x0010->B:246:0x0010]] */
    public String toString() {
        byte b10;
        int i10;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b11 = bArr[i11];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b12 = bArr[i11 + 1];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b13 = bArr[i11 + 2];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b14 = bArr[i14];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    r rVar = r.f47939a;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b15 = bArr[i11 + 1];
                            if ((b15 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b16 = bArr[i16];
                            if ((b16 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b15 << 6) ^ (b16 ^ (-123008))) ^ (b11 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 < 57344) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                r rVar2 = r.f47939a;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b17 = bArr[i18];
                        if ((b17 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b17 ^ 3968) ^ (b11 << 6);
                        if (i19 >= 128) {
                            int i20 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            r rVar3 = r.f47939a;
                            i11 += 2;
                            i13 = i20;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i21 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i12 += b11 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i21;
                        if (i11 < length && (b10 = bArr[i11]) >= 0) {
                            i11++;
                            i21 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                                i12 += b10 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strV = v();
            String strSubstring = strV.substring(0, i12);
            i.d(strSubstring, "substring(...)");
            String strG = m.G(m.G(m.G(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strV.length()) {
                return o.c(']', "[text=", strG);
            }
            return "[size=" + this.data.length + " text=" + strG + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + f() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.data.length);
        sb2.append(" hex=");
        int iC = C2834a.c(64, this);
        byte[] bArr2 = this.data;
        if (iC > bArr2.length) {
            throw new IllegalArgumentException(C0575j.b(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (iC < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((iC == bArr2.length ? this : new ByteString(d.t(bArr2, 0, iC))).f());
        sb2.append("…]");
        return sb2.toString();
    }

    public byte[] u() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        i.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String v() {
        String str = this.f45707c;
        if (str != null) {
            return str;
        }
        byte[] bArrJ = j();
        i.e(bArrJ, "<this>");
        String str2 = new String(bArrJ, kotlin.text.a.f43120b);
        this.f45707c = str2;
        return str2;
    }

    public void w(C2839f buffer, int i10) {
        i.e(buffer, "buffer");
        buffer.S0(this.data, 0, i10);
    }
}
