package F9;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.ByteArrayOutputStream;
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

/* JADX INFO: compiled from: Hpack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteString f3291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c[] f3292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<ByteString, Integer> f3293c;

    /* JADX INFO: compiled from: Hpack.java */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f3295b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f3294a = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f3298e = new c[8];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3299f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3300g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3301h = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3296c = 4096;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3297d = 4096;

        public a(e.a aVar) {
            this.f3295b = v.b(aVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f3298e.length;
                while (true) {
                    length--;
                    i11 = this.f3299f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f3298e[length].f3290c;
                    i10 -= i13;
                    this.f3301h -= i13;
                    this.f3300g--;
                    i12++;
                }
                c[] cVarArr = this.f3298e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f3300g);
                this.f3299f += i12;
            }
            return i12;
        }

        public final ByteString b(int i10) throws IOException {
            if (i10 >= 0) {
                c[] cVarArr = d.f3292b;
                if (i10 <= cVarArr.length - 1) {
                    return cVarArr[i10].f3288a;
                }
            }
            int length = this.f3299f + 1 + (i10 - d.f3292b.length);
            if (length >= 0) {
                c[] cVarArr2 = this.f3298e;
                if (length < cVarArr2.length) {
                    return cVarArr2[length].f3288a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void c(c cVar) {
            this.f3294a.add(cVar);
            int i10 = this.f3297d;
            int i11 = cVar.f3290c;
            if (i11 > i10) {
                Arrays.fill(this.f3298e, (Object) null);
                this.f3299f = this.f3298e.length - 1;
                this.f3300g = 0;
                this.f3301h = 0;
                return;
            }
            a((this.f3301h + i11) - i10);
            int i12 = this.f3300g + 1;
            c[] cVarArr = this.f3298e;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f3299f = this.f3298e.length - 1;
                this.f3298e = cVarArr2;
            }
            int i13 = this.f3299f;
            this.f3299f = i13 - 1;
            this.f3298e[i13] = cVar;
            this.f3300g++;
            this.f3301h += i11;
        }

        public final ByteString d() throws IOException {
            int i10;
            C c10 = this.f3295b;
            byte b10 = c10.readByte();
            int i11 = b10 & 255;
            boolean z10 = (b10 & 128) == 128;
            int iE = e(i11, 127);
            if (!z10) {
                return c10.i(iE);
            }
            f fVar = f.f3328d;
            long j = iE;
            c10.N0(j);
            byte[] bArrN = c10.f49038c.N(j);
            fVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f.a aVar = fVar.f3329a;
            f.a aVar2 = aVar;
            int i12 = 0;
            int i13 = 0;
            for (byte b11 : bArrN) {
                i12 = (i12 << 8) | (b11 & 255);
                i13 += 8;
                while (i13 >= 8) {
                    aVar2 = aVar2.f3330a[(i12 >>> (i13 - 8)) & 255];
                    if (aVar2.f3330a == null) {
                        byteArrayOutputStream.write(aVar2.f3331b);
                        i13 -= aVar2.f3332c;
                        aVar2 = aVar;
                    } else {
                        i13 -= 8;
                    }
                }
            }
            while (i13 > 0) {
                f.a aVar3 = aVar2.f3330a[(i12 << (8 - i13)) & 255];
                if (aVar3.f3330a != null || (i10 = aVar3.f3332c) > i13) {
                    break;
                }
                byteArrayOutputStream.write(aVar3.f3331b);
                i13 -= i10;
                aVar2 = aVar;
            }
            return ByteString.n(byteArrayOutputStream.toByteArray());
        }

        public final int e(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte b10 = this.f3295b.readByte();
                int i14 = b10 & 255;
                if ((b10 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (b10 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: Hpack.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2839f f3302a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3304c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3306e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c[] f3303b = new c[8];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3305d = 7;

        public b(C2839f c2839f) {
            this.f3302a = c2839f;
        }

        public final void a(c cVar) {
            int i10;
            int i11 = cVar.f3290c;
            if (i11 > 4096) {
                Arrays.fill(this.f3303b, (Object) null);
                this.f3305d = this.f3303b.length - 1;
                this.f3304c = 0;
                this.f3306e = 0;
                return;
            }
            int i12 = (this.f3306e + i11) - 4096;
            if (i12 > 0) {
                int length = this.f3303b.length - 1;
                int i13 = 0;
                while (true) {
                    i10 = this.f3305d;
                    if (length < i10 || i12 <= 0) {
                        break;
                    }
                    int i14 = this.f3303b[length].f3290c;
                    i12 -= i14;
                    this.f3306e -= i14;
                    this.f3304c--;
                    i13++;
                    length--;
                }
                c[] cVarArr = this.f3303b;
                int i15 = i10 + 1;
                System.arraycopy(cVarArr, i15, cVarArr, i15 + i13, this.f3304c);
                this.f3305d += i13;
            }
            int i16 = this.f3304c + 1;
            c[] cVarArr2 = this.f3303b;
            if (i16 > cVarArr2.length) {
                c[] cVarArr3 = new c[cVarArr2.length * 2];
                System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
                this.f3305d = this.f3303b.length - 1;
                this.f3303b = cVarArr3;
            }
            int i17 = this.f3305d;
            this.f3305d = i17 - 1;
            this.f3303b[i17] = cVar;
            this.f3304c++;
            this.f3306e += i11;
        }

        public final void b(ByteString byteString) throws IOException {
            c(byteString.e(), 127, 0);
            this.f3302a.K0(byteString);
        }

        public final void c(int i10, int i11, int i12) throws IOException {
            C2839f c2839f = this.f3302a;
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
        ByteString byteString = ByteString.f45705d;
        f3291a = ByteString.a.c(":");
        c cVar = new c(c.f3287h, "");
        ByteString byteString2 = c.f3284e;
        c cVar2 = new c(byteString2, "GET");
        c cVar3 = new c(byteString2, "POST");
        ByteString byteString3 = c.f3285f;
        c cVar4 = new c(byteString3, "/");
        c cVar5 = new c(byteString3, "/index.html");
        ByteString byteString4 = c.f3286g;
        c cVar6 = new c(byteString4, "http");
        c cVar7 = new c(byteString4, "https");
        ByteString byteString5 = c.f3283d;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(byteString5, "200"), new c(byteString5, "204"), new c(byteString5, "206"), new c(byteString5, "304"), new c(byteString5, "400"), new c(byteString5, "404"), new c(byteString5, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c(AttributeType.DATE, ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(TicketDetailDestinationKt.LAUNCHED_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c(ActionType.LINK, ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f3292b = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(cVarArr[i10].f3288a)) {
                linkedHashMap.put(cVarArr[i10].f3288a, Integer.valueOf(i10));
            }
        }
        f3293c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(ByteString byteString) throws IOException {
        int iE = byteString.e();
        for (int i10 = 0; i10 < iE; i10++) {
            byte bK = byteString.k(i10);
            if (bK >= 65 && bK <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.v()));
            }
        }
    }
}
