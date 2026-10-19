package rb;

import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;
import p318zb.C;
import p318zb.C2839f;
import p318zb.v;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rb.a[] f46525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<ByteString, Integer> f46526b;

    /* JADX INFO: compiled from: Hpack.kt */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C f46529c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f46533g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46527a = 4096;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f46528b = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public rb.a[] f46530d = new rb.a[8];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46531e = 7;

        public a(o.b bVar) {
            this.f46529c = v.b(bVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f46530d.length;
                while (true) {
                    length--;
                    i11 = this.f46531e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    rb.a aVar = this.f46530d[length];
                    kotlin.jvm.internal.i.b(aVar);
                    int i13 = aVar.f46524c;
                    i10 -= i13;
                    this.f46533g -= i13;
                    this.f46532f--;
                    i12++;
                }
                rb.a[] aVarArr = this.f46530d;
                System.arraycopy(aVarArr, i11 + 1, aVarArr, i11 + 1 + i12, this.f46532f);
                this.f46531e += i12;
            }
            return i12;
        }

        public final ByteString b(int i10) throws IOException {
            if (i10 >= 0) {
                rb.a[] aVarArr = b.f46525a;
                if (i10 <= aVarArr.length - 1) {
                    return aVarArr[i10].f46522a;
                }
            }
            int length = this.f46531e + 1 + (i10 - b.f46525a.length);
            if (length >= 0) {
                rb.a[] aVarArr2 = this.f46530d;
                if (length < aVarArr2.length) {
                    rb.a aVar = aVarArr2[length];
                    kotlin.jvm.internal.i.b(aVar);
                    return aVar.f46522a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void c(rb.a aVar) {
            this.f46528b.add(aVar);
            int i10 = this.f46527a;
            int i11 = aVar.f46524c;
            if (i11 > i10) {
                rb.a[] aVarArr = this.f46530d;
                Q3.d.w(aVarArr, null, 0, aVarArr.length);
                this.f46531e = this.f46530d.length - 1;
                this.f46532f = 0;
                this.f46533g = 0;
                return;
            }
            a((this.f46533g + i11) - i10);
            int i12 = this.f46532f + 1;
            rb.a[] aVarArr2 = this.f46530d;
            if (i12 > aVarArr2.length) {
                rb.a[] aVarArr3 = new rb.a[aVarArr2.length * 2];
                System.arraycopy(aVarArr2, 0, aVarArr3, aVarArr2.length, aVarArr2.length);
                this.f46531e = this.f46530d.length - 1;
                this.f46530d = aVarArr3;
            }
            int i13 = this.f46531e;
            this.f46531e = i13 - 1;
            this.f46530d[i13] = aVar;
            this.f46532f++;
            this.f46533g += i11;
        }

        public final ByteString d() throws IOException {
            int i10;
            C source = this.f46529c;
            byte b10 = source.readByte();
            byte[] bArr = p172nb.b.f45026a;
            int i11 = b10 & 255;
            int i12 = 0;
            boolean z10 = (b10 & 128) == 128;
            long jE = e(i11, 127);
            if (!z10) {
                return source.i(jE);
            }
            C2839f c2839f = new C2839f();
            int[] iArr = r.f46659a;
            kotlin.jvm.internal.i.e(source, "source");
            r.a aVar = r.f46661c;
            r.a aVar2 = aVar;
            int i13 = 0;
            for (long j = 0; j < jE; j++) {
                byte b11 = source.readByte();
                byte[] bArr2 = p172nb.b.f45026a;
                i12 = (i12 << 8) | (b11 & 255);
                i13 += 8;
                while (i13 >= 8) {
                    r.a[] aVarArr = aVar2.f46662a;
                    kotlin.jvm.internal.i.b(aVarArr);
                    aVar2 = aVarArr[(i12 >>> (i13 - 8)) & 255];
                    kotlin.jvm.internal.i.b(aVar2);
                    if (aVar2.f46662a == null) {
                        c2839f.Z0(aVar2.f46663b);
                        i13 -= aVar2.f46664c;
                        aVar2 = aVar;
                    } else {
                        i13 -= 8;
                    }
                }
            }
            while (i13 > 0) {
                r.a[] aVarArr2 = aVar2.f46662a;
                kotlin.jvm.internal.i.b(aVarArr2);
                r.a aVar3 = aVarArr2[(i12 << (8 - i13)) & 255];
                kotlin.jvm.internal.i.b(aVar3);
                if (aVar3.f46662a != null || (i10 = aVar3.f46664c) > i13) {
                    break;
                }
                c2839f.Z0(aVar3.f46663b);
                i13 -= i10;
                aVar2 = aVar;
            }
            return c2839f.R(c2839f.f49074c);
        }

        public final int e(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte b10 = this.f46529c.readByte();
                byte[] bArr = p172nb.b.f45026a;
                int i14 = b10 & 255;
                if ((b10 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (b10 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: rb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Hpack.kt */
    public static final class C0526b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2839f f46535b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46537d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f46541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f46542i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46534a = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46536c = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46538e = 4096;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public rb.a[] f46539f = new rb.a[8];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f46540g = 7;

        public C0526b(C2839f c2839f) {
            this.f46535b = c2839f;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f46539f.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f46540g;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    rb.a aVar = this.f46539f[length];
                    kotlin.jvm.internal.i.b(aVar);
                    i10 -= aVar.f46524c;
                    int i13 = this.f46542i;
                    rb.a aVar2 = this.f46539f[length];
                    kotlin.jvm.internal.i.b(aVar2);
                    this.f46542i = i13 - aVar2.f46524c;
                    this.f46541h--;
                    i12++;
                    length--;
                }
                rb.a[] aVarArr = this.f46539f;
                int i14 = i11 + 1;
                System.arraycopy(aVarArr, i14, aVarArr, i14 + i12, this.f46541h);
                rb.a[] aVarArr2 = this.f46539f;
                int i15 = this.f46540g + 1;
                Arrays.fill(aVarArr2, i15, i15 + i12, (Object) null);
                this.f46540g += i12;
            }
        }

        public final void b(rb.a aVar) {
            int i10 = this.f46538e;
            int i11 = aVar.f46524c;
            if (i11 > i10) {
                rb.a[] aVarArr = this.f46539f;
                Q3.d.w(aVarArr, null, 0, aVarArr.length);
                this.f46540g = this.f46539f.length - 1;
                this.f46541h = 0;
                this.f46542i = 0;
                return;
            }
            a((this.f46542i + i11) - i10);
            int i12 = this.f46541h + 1;
            rb.a[] aVarArr2 = this.f46539f;
            if (i12 > aVarArr2.length) {
                rb.a[] aVarArr3 = new rb.a[aVarArr2.length * 2];
                System.arraycopy(aVarArr2, 0, aVarArr3, aVarArr2.length, aVarArr2.length);
                this.f46540g = this.f46539f.length - 1;
                this.f46539f = aVarArr3;
            }
            int i13 = this.f46540g;
            this.f46540g = i13 - 1;
            this.f46539f[i13] = aVar;
            this.f46541h++;
            this.f46542i += i11;
        }

        public final void c(ByteString data) throws IOException {
            kotlin.jvm.internal.i.e(data, "data");
            C2839f c2839f = this.f46535b;
            if (this.f46534a) {
                int[] iArr = r.f46659a;
                int iE = data.e();
                long j = 0;
                for (int i10 = 0; i10 < iE; i10++) {
                    byte bK = data.k(i10);
                    byte[] bArr = p172nb.b.f45026a;
                    j += (long) r.f46660b[bK & 255];
                }
                if (((int) ((j + ((long) 7)) >> 3)) < data.e()) {
                    C2839f c2839f2 = new C2839f();
                    int[] iArr2 = r.f46659a;
                    int iE2 = data.e();
                    long j10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < iE2; i12++) {
                        byte bK2 = data.k(i12);
                        byte[] bArr2 = p172nb.b.f45026a;
                        int i13 = bK2 & 255;
                        int i14 = r.f46659a[i13];
                        byte b10 = r.f46660b[i13];
                        j10 = (j10 << b10) | ((long) i14);
                        i11 += b10;
                        while (i11 >= 8) {
                            i11 -= 8;
                            c2839f2.Z0((int) (j10 >> i11));
                        }
                    }
                    if (i11 > 0) {
                        c2839f2.Z0((int) ((255 >>> i11) | (j10 << (8 - i11))));
                    }
                    ByteString byteStringR = c2839f2.R(c2839f2.f49074c);
                    e(byteStringR.e(), 127, 128);
                    c2839f.K0(byteStringR);
                    return;
                }
            }
            e(data.e(), 127, 0);
            c2839f.K0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        public final void d(ArrayList arrayList) throws IOException {
            int length;
            int length2;
            if (this.f46537d) {
                int i10 = this.f46536c;
                if (i10 < this.f46538e) {
                    e(i10, 31, 32);
                }
                this.f46537d = false;
                this.f46536c = BrazeLogger.SUPPRESS;
                e(this.f46538e, 31, 32);
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                rb.a aVar = (rb.a) arrayList.get(i11);
                ByteString byteStringT = aVar.f46522a.t();
                Integer num = b.f46526b.get(byteStringT);
                ByteString byteString = aVar.f46523b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        rb.a[] aVarArr = b.f46525a;
                        if (kotlin.jvm.internal.i.a(aVarArr[iIntValue].f46523b, byteString)) {
                            length = length2;
                        } else if (kotlin.jvm.internal.i.a(aVarArr[length2].f46523b, byteString)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f46539f.length;
                    for (int i12 = this.f46540g + 1; i12 < length3; i12++) {
                        rb.a aVar2 = this.f46539f[i12];
                        kotlin.jvm.internal.i.b(aVar2);
                        if (kotlin.jvm.internal.i.a(aVar2.f46522a, byteStringT)) {
                            rb.a aVar3 = this.f46539f[i12];
                            kotlin.jvm.internal.i.b(aVar3);
                            if (kotlin.jvm.internal.i.a(aVar3.f46523b, byteString)) {
                                length2 = b.f46525a.length + (i12 - this.f46540g);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f46540g) + b.f46525a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    e(length2, 127, 128);
                } else if (length == -1) {
                    this.f46535b.Z0(64);
                    c(byteStringT);
                    c(byteString);
                    b(aVar);
                } else if (!byteStringT.q(rb.a.f46516d) || kotlin.jvm.internal.i.a(rb.a.f46521i, byteStringT)) {
                    e(length, 63, 64);
                    c(byteString);
                    b(aVar);
                } else {
                    e(length, 15, 0);
                    c(byteString);
                }
            }
        }

        public final void e(int i10, int i11, int i12) {
            C2839f c2839f = this.f46535b;
            if (i10 < i11) {
                c2839f.Z0(i10 | i12);
                return;
            }
            c2839f.Z0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                c2839f.Z0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            c2839f.Z0(i13);
        }
    }

    static {
        rb.a aVar = new rb.a(rb.a.f46521i, "");
        ByteString byteString = rb.a.f46518f;
        rb.a aVar2 = new rb.a(byteString, "GET");
        rb.a aVar3 = new rb.a(byteString, "POST");
        ByteString byteString2 = rb.a.f46519g;
        rb.a aVar4 = new rb.a(byteString2, "/");
        rb.a aVar5 = new rb.a(byteString2, "/index.html");
        ByteString byteString3 = rb.a.f46520h;
        rb.a aVar6 = new rb.a(byteString3, "http");
        rb.a aVar7 = new rb.a(byteString3, "https");
        ByteString byteString4 = rb.a.f46517e;
        rb.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new rb.a(byteString4, "200"), new rb.a(byteString4, "204"), new rb.a(byteString4, "206"), new rb.a(byteString4, "304"), new rb.a(byteString4, "400"), new rb.a(byteString4, "404"), new rb.a(byteString4, "500"), new rb.a("accept-charset", ""), new rb.a("accept-encoding", "gzip, deflate"), new rb.a("accept-language", ""), new rb.a("accept-ranges", ""), new rb.a("accept", ""), new rb.a("access-control-allow-origin", ""), new rb.a("age", ""), new rb.a("allow", ""), new rb.a("authorization", ""), new rb.a("cache-control", ""), new rb.a("content-disposition", ""), new rb.a("content-encoding", ""), new rb.a("content-language", ""), new rb.a("content-length", ""), new rb.a("content-location", ""), new rb.a("content-range", ""), new rb.a("content-type", ""), new rb.a("cookie", ""), new rb.a(AttributeType.DATE, ""), new rb.a("etag", ""), new rb.a("expect", ""), new rb.a("expires", ""), new rb.a(TicketDetailDestinationKt.LAUNCHED_FROM, ""), new rb.a("host", ""), new rb.a("if-match", ""), new rb.a("if-modified-since", ""), new rb.a("if-none-match", ""), new rb.a("if-range", ""), new rb.a("if-unmodified-since", ""), new rb.a("last-modified", ""), new rb.a(ActionType.LINK, ""), new rb.a("location", ""), new rb.a("max-forwards", ""), new rb.a("proxy-authenticate", ""), new rb.a("proxy-authorization", ""), new rb.a("range", ""), new rb.a("referer", ""), new rb.a("refresh", ""), new rb.a("retry-after", ""), new rb.a("server", ""), new rb.a("set-cookie", ""), new rb.a("strict-transport-security", ""), new rb.a("transfer-encoding", ""), new rb.a("user-agent", ""), new rb.a("vary", ""), new rb.a("via", ""), new rb.a("www-authenticate", "")};
        f46525a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(aVarArr[i10].f46522a)) {
                linkedHashMap.put(aVarArr[i10].f46522a, Integer.valueOf(i10));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.i.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f46526b = mapUnmodifiableMap;
    }

    public static void a(ByteString name) throws IOException {
        kotlin.jvm.internal.i.e(name, "name");
        int iE = name.e();
        for (int i10 = 0; i10 < iE; i10++) {
            byte bK = name.k(i10);
            if (65 <= bK && bK < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.v()));
            }
        }
    }
}
