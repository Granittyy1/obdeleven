package com.google.common.io;

import A8.A;
import A8.p;
import I.e;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f27996a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f27997b;

    public static final class DecodingException extends IOException {
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final char[] f28007f;

        public b(a aVar) {
            super(aVar, (Character) null);
            this.f28007f = new char[512];
            char[] cArr = aVar.f27999b;
            p.g(cArr.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                char[] cArr2 = this.f28007f;
                cArr2[i10] = cArr[i10 >>> 4];
                cArr2[i10 | 256] = cArr[i10 & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                char cCharAt = charSequence.charAt(i10);
                a aVar = this.f28008c;
                bArr[i11] = (byte) ((aVar.a(cCharAt) << 4) | aVar.a(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final void d(StringBuilder sb2, byte[] bArr, int i10) throws IOException {
            p.m(0, i10, bArr.length);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = bArr[i11] & 255;
                char[] cArr = this.f28007f;
                sb2.append(cArr[i12]);
                sb2.append(cArr[i12 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public final BaseEncoding g(a aVar, Character ch) {
            return new b(aVar);
        }
    }

    public static final class c extends d {
        public c(String str, String str2) {
            this(new a(str, str2.toCharArray()), (Character) '=');
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceE = e(charSequence);
            int length = charSequenceE.length();
            a aVar = this.f28008c;
            if (!aVar.f28005h[length % aVar.f28002e]) {
                throw new DecodingException("Invalid input length " + charSequenceE.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceE.length()) {
                int i12 = i10 + 2;
                int iA = (aVar.a(charSequenceE.charAt(i10 + 1)) << 12) | (aVar.a(charSequenceE.charAt(i10)) << 18);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (iA >>> 16);
                if (i12 < charSequenceE.length()) {
                    int i14 = i10 + 3;
                    int iA2 = iA | (aVar.a(charSequenceE.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((iA2 >>> 8) & 255);
                    if (i14 < charSequenceE.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iA2 | aVar.a(charSequenceE.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        public final void d(StringBuilder sb2, byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            p.m(0, i10, bArr.length);
            for (int i12 = i10; i12 >= 3; i12 -= 3) {
                int i13 = i11 + 2;
                int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
                i11 += 3;
                int i15 = i14 | (bArr[i13] & 255);
                a aVar = this.f28008c;
                sb2.append(aVar.f27999b[i15 >>> 18]);
                char[] cArr = aVar.f27999b;
                sb2.append(cArr[(i15 >>> 12) & 63]);
                sb2.append(cArr[(i15 >>> 6) & 63]);
                sb2.append(cArr[i15 & 63]);
            }
            if (i11 < i10) {
                f(sb2, bArr, i11, i10 - i11);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        public final BaseEncoding g(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            p.g(aVar.f27999b.length == 64);
        }
    }

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f27997b = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] a(String str) {
        try {
            CharSequence charSequenceE = e(str);
            int length = (int) (((((long) ((d) this).f28008c.f28001d) * ((long) charSequenceE.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceE);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (DecodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence) throws DecodingException;

    public final String c(byte[] bArr) {
        int length = bArr.length;
        p.m(0, length, bArr.length);
        a aVar = ((d) this).f28008c;
        StringBuilder sb2 = new StringBuilder(p095h6.b.b(length, aVar.f28003f, RoundingMode.CEILING) * aVar.f28002e);
        try {
            d(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void d(StringBuilder sb2, byte[] bArr, int i10) throws IOException;

    public abstract CharSequence e(CharSequence charSequence);

    public static class d extends BaseEncoding {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f28008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Character f28009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile BaseEncoding f28010e;

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        public d(a aVar, Character ch) {
            boolean z10;
            aVar.getClass();
            this.f28008c = aVar;
            if (ch != null) {
                char cCharValue = ch.charValue();
                byte[] bArr = aVar.f28004g;
                if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = true;
            }
            p.e(ch, "Padding character %s was already in alphabet", z10);
            this.f28009d = ch;
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            int i10;
            int i11;
            CharSequence charSequenceE = e(charSequence);
            int length = charSequenceE.length();
            a aVar = this.f28008c;
            if (!aVar.f28005h[length % aVar.f28002e]) {
                throw new DecodingException("Invalid input length " + charSequenceE.length());
            }
            int i12 = 0;
            int i13 = 0;
            while (i12 < charSequenceE.length()) {
                long jA = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    i10 = aVar.f28001d;
                    i11 = aVar.f28002e;
                    if (i14 >= i11) {
                        break;
                    }
                    jA <<= i10;
                    if (i12 + i14 < charSequenceE.length()) {
                        jA |= (long) aVar.a(charSequenceE.charAt(i15 + i12));
                        i15++;
                    }
                    i14++;
                }
                int i16 = aVar.f28003f;
                int i17 = (i16 * 8) - (i15 * i10);
                int i18 = (i16 - 1) * 8;
                while (i18 >= i17) {
                    bArr[i13] = (byte) ((jA >>> i18) & 255);
                    i18 -= 8;
                    i13++;
                }
                i12 += i11;
            }
            return i13;
        }

        @Override // com.google.common.io.BaseEncoding
        public void d(StringBuilder sb2, byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            p.m(0, i10, bArr.length);
            while (i11 < i10) {
                a aVar = this.f28008c;
                f(sb2, bArr, i11, Math.min(aVar.f28003f, i10 - i11));
                i11 += aVar.f28003f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence e(CharSequence charSequence) {
            Character ch = this.f28009d;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f28008c.equals(dVar.f28008c) && Objects.equals(this.f28009d, dVar.f28009d);
        }

        public final void f(StringBuilder sb2, byte[] bArr, int i10, int i11) throws IOException {
            p.m(i10, i10 + i11, bArr.length);
            a aVar = this.f28008c;
            int i12 = 0;
            p.g(i11 <= aVar.f28003f);
            long j = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j = (j | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = aVar.f28001d;
            int i15 = ((i11 + 1) * 8) - i14;
            while (i12 < i11 * 8) {
                sb2.append(aVar.f27999b[((int) (j >>> (i15 - i12))) & aVar.f28000c]);
                i12 += i14;
            }
            Character ch = this.f28009d;
            if (ch != null) {
                while (i12 < aVar.f28003f * 8) {
                    sb2.append(ch.charValue());
                    i12 += i14;
                }
            }
        }

        public BaseEncoding g(a aVar, Character ch) {
            return new d(aVar, ch);
        }

        public final BaseEncoding h() {
            int i10;
            boolean z10;
            BaseEncoding baseEncodingG = this.f28010e;
            if (baseEncodingG == null) {
                a aVar = this.f28008c;
                char[] cArr = aVar.f27999b;
                for (char c10 : cArr) {
                    if (e.i(c10)) {
                        int length = cArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                z10 = false;
                                break;
                            }
                            char c11 = cArr[i11];
                            if (c11 >= 'A' && c11 <= 'Z') {
                                z10 = true;
                                break;
                            }
                            i11++;
                        }
                        p.p("Cannot call upperCase() on a mixed-case alphabet", !z10);
                        char[] cArr2 = new char[cArr.length];
                        for (int i12 = 0; i12 < cArr.length; i12++) {
                            char c12 = cArr[i12];
                            if (e.i(c12)) {
                                c12 = (char) (c12 ^ ' ');
                            }
                            cArr2[i12] = c12;
                        }
                        a aVar2 = new a(Q8.d.a(new StringBuilder(), aVar.f27998a, ".upperCase()"), cArr2);
                        if (aVar.f28006i && !aVar2.f28006i) {
                            byte[] bArr = aVar2.f28004g;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            for (i10 = 65; i10 <= 90; i10++) {
                                int i13 = i10 | 32;
                                byte b10 = bArr[i10];
                                byte b11 = bArr[i13];
                                if (b10 == -1) {
                                    bArrCopyOf[i10] = b11;
                                } else {
                                    char c13 = (char) i10;
                                    char c14 = (char) i13;
                                    if (!(b11 == -1)) {
                                        throw new IllegalStateException(A.h("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                    }
                                    bArrCopyOf[i13] = b10;
                                }
                            }
                            aVar2 = new a(Q8.d.a(new StringBuilder(), aVar2.f27998a, ".ignoreCase()"), aVar2.f27999b, bArrCopyOf, true);
                        }
                        aVar = aVar2;
                        break;
                    }
                }
                baseEncodingG = aVar == this.f28008c ? this : g(aVar, this.f28009d);
                this.f28010e = baseEncodingG;
            }
            return baseEncodingG;
        }

        public final int hashCode() {
            return this.f28008c.hashCode() ^ Objects.hashCode(this.f28009d);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            a aVar = this.f28008c;
            sb2.append(aVar);
            if (8 % aVar.f28001d != 0) {
                Character ch = this.f28009d;
                if (ch == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(ch);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        public d(String str, String str2) {
            this(new a(str, str2.toCharArray()), (Character) '=');
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char[] f27999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f28000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f28001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f28002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f28003f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f28004g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean[] f28005h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f28006i;

        public a(String str, char[] cArr, byte[] bArr, boolean z10) {
            str.getClass();
            this.f27998a = str;
            cArr.getClass();
            this.f27999b = cArr;
            try {
                int iC = p095h6.b.c(cArr.length, RoundingMode.UNNECESSARY);
                this.f28001d = iC;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iC);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f28002e = i10;
                this.f28003f = iC >> iNumberOfTrailingZeros;
                this.f28000c = cArr.length - 1;
                this.f28004g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f28003f; i11++) {
                    zArr[p095h6.b.b(i11 * 8, this.f28001d, RoundingMode.CEILING)] = true;
                }
                this.f28005h = zArr;
                this.f28006i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }

        public final int a(char c10) throws DecodingException {
            if (c10 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f28004g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new DecodingException("Unrecognized character: " + c10);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28006i == aVar.f28006i && Arrays.equals(this.f27999b, aVar.f27999b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f27999b) + (this.f28006i ? 1231 : 1237);
        }

        public final String toString() {
            return this.f27998a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                if (c10 < 128) {
                    if (bArr[c10] == -1) {
                        bArr[c10] = (byte) i10;
                    } else {
                        throw new IllegalArgumentException(A.h("Duplicate character: %s", Character.valueOf(c10)));
                    }
                } else {
                    throw new IllegalArgumentException(A.h("Non-ASCII character: %s", Character.valueOf(c10)));
                }
            }
            this(str, cArr, bArr, false);
        }
    }
}
