package okhttp3.internal.publicsuffix;

import D2.V;
import com.google.android.gms.internal.measurement.M1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlin.sequences.c;
import kotlin.sequences.g;
import kotlin.text.n;
import p172nb.b;
import p244tb.h;
import p293xa.r;
import p318zb.C;
import p318zb.p;
import p318zb.v;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f45538e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f45539f = M1.k("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f45540g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f45541a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f45542b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f45543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f45544d;

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:30:0x0063  */
        public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            int i14 = -1;
            byte[] bArr3 = PublicSuffixDatabase.f45538e;
            int length = bArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = (i15 + length) / 2;
                while (i16 > i14 && bArr[i16] != 10) {
                    i16 += i14;
                }
                int i17 = i16 + 1;
                int i18 = 1;
                while (true) {
                    i11 = i17 + i18;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i18++;
                }
                int i19 = i11 - i17;
                int i20 = i10;
                boolean z11 = false;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i20][i21];
                        byte[] bArr4 = b.f45026a;
                        int i23 = b10 & 255;
                        z10 = z11;
                        i12 = i23;
                    }
                    byte b11 = bArr[i17 + i22];
                    byte[] bArr5 = b.f45026a;
                    i13 = i12 - (b11 & 255);
                    if (i13 != 0) {
                        break;
                    }
                    i22++;
                    i21++;
                    if (i22 == i19) {
                        break;
                    }
                    if (bArr2[i20].length != i21) {
                        z11 = z10;
                    } else {
                        if (i20 == bArr2.length - 1) {
                            break;
                        }
                        i20++;
                        z11 = true;
                        i21 = -1;
                    }
                }
                if (i13 >= 0) {
                    if (i13 <= 0) {
                        int i24 = i19 - i22;
                        int length2 = bArr2[i20].length - i21;
                        int length3 = bArr2.length;
                        for (int i25 = i20 + 1; i25 < length3; i25++) {
                            length2 += bArr2[i25].length;
                        }
                        if (length2 < i24) {
                            length = i16;
                        } else if (length2 <= i24) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            i.d(UTF_8, "UTF_8");
                            return new String(bArr, i17, i19, UTF_8);
                        }
                    }
                    i15 = i11 + 1;
                } else {
                    length = i16;
                }
                i14 = -1;
            }
            return null;
        }
    }

    public static List c(String str) {
        List listF0 = n.f0(str, new char[]{'.'});
        return i.a(q.V(listF0), "") ? q.L(listF0) : listF0;
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List<String> listF0;
        int size;
        int size2;
        int i10 = 0;
        String unicodeDomain = IDN.toUnicode(str);
        i.d(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        if (this.f45541a.get() || !this.f45541a.compareAndSet(false, true)) {
            try {
                this.f45542b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e10) {
                        h hVar = h.f47384a;
                        h.f47384a.getClass();
                        h.i(5, "Failed to read public suffix list", e10);
                        if (z10) {
                        }
                    }
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f45543c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i11 = 0; i11 < size3; i11++) {
            String str2 = (String) listC.get(i11);
            Charset UTF_8 = StandardCharsets.UTF_8;
            i.d(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            i.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.f45543c;
            if (bArr2 == null) {
                i.m("publicSuffixListBytes");
                throw null;
            }
            strA = a.a(bArr2, bArr, i12);
            if (strA != null) {
                break;
            }
            i12++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                strA2 = null;
                break;
            }
            bArr3[i13] = f45538e;
            byte[] bArr4 = this.f45543c;
            if (bArr4 == null) {
                i.m("publicSuffixListBytes");
                throw null;
            }
            strA2 = a.a(bArr4, bArr3, i13);
            if (strA2 != null) {
                break;
            }
            i13++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i14 = size3 - 1;
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                strA3 = null;
                break;
            }
            byte[] bArr5 = this.f45544d;
            if (bArr5 == null) {
                i.m("publicSuffixExceptionListBytes");
                throw null;
            }
            strA3 = a.a(bArr5, bArr, i15);
            if (strA3 != null) {
                break;
            }
            i15++;
        }
        if (strA3 != null) {
            listF0 = n.f0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listF0 = f45539f;
        } else {
            List<String> listF1 = strA != null ? n.f0(strA, new char[]{'.'}) : EmptyList.f42983b;
            listF0 = strA2 != null ? n.f0(strA2, new char[]{'.'}) : EmptyList.f42983b;
            if (listF1.size() > listF0.size()) {
                listF0 = listF1;
            }
        }
        if (listC.size() == listF0.size() && listF0.get(0).charAt(0) != '!') {
            return null;
        }
        if (listF0.get(0).charAt(0) == '!') {
            size = listC.size();
            size2 = listF0.size();
        } else {
            size = listC.size();
            size2 = listF0.size() + 1;
        }
        int i16 = size - size2;
        g gVarH = q.H(c(str));
        if (i16 < 0) {
            throw new IllegalArgumentException(J4.i.c(i16, "Requested element count ", " is less than zero.").toString());
        }
        if (i16 != 0) {
            gVarH = gVarH instanceof c ? ((c) gVarH).a(i16) : new kotlin.sequences.b(gVarH, i16);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : gVarH) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ".");
            }
            V.f(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() throws IOException {
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                this.f45542b.countDown();
                return;
            }
            C cB = v.b(new p(v.g(resourceAsStream)));
            try {
                long jK = cB.k();
                cB.N0(jK);
                ref$ObjectRef.element = cB.f49038c.N(jK);
                long jK2 = cB.k();
                cB.N0(jK2);
                ref$ObjectRef2.element = cB.f49038c.N(jK2);
                r rVar = r.f47939a;
                p241t7.b.n(cB, null);
                synchronized (this) {
                    T t8 = ref$ObjectRef.element;
                    i.b(t8);
                    this.f45543c = (byte[]) t8;
                    T t10 = ref$ObjectRef2.element;
                    i.b(t10);
                    this.f45544d = (byte[]) t10;
                }
                this.f45542b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(cB, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f45542b.countDown();
            throw th3;
        }
    }
}
