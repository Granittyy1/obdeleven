package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okio.ByteString;
import p318zb.C2839f;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f45593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f45594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f45595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f45596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f45597i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteString f45598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f45599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f45600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45601d;

    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteString f45602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f45603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f45604c;

        public a() {
            String strC = androidx.compose.animation.D.c("randomUUID().toString()");
            ByteString byteString = ByteString.f45705d;
            this.f45602a = ByteString.a.c(strC);
            this.f45603b = s.f45593e;
            this.f45604c = new ArrayList();
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class b {
        public static void a(StringBuilder sb2, String key) {
            kotlin.jvm.internal.i.e(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f45605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f45606b;

        /* JADX INFO: compiled from: MultipartBody.kt */
        public static final class a {
            public static c a(String str, String value) {
                kotlin.jvm.internal.i.e(value, "value");
                y.Companion.getClass();
                return b(str, null, y.a.a(value, null));
            }

            public static c b(String str, String str2, y yVar) {
                StringBuilder sbE = C4.b.e("form-data; name=");
                r rVar = s.f45593e;
                b.a(sbE, str);
                if (str2 != null) {
                    sbE.append("; filename=");
                    b.a(sbE, str2);
                }
                String string = sbE.toString();
                kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
                o.a aVar = new o.a();
                aVar.d("Content-Disposition", string);
                o oVarE = aVar.e();
                if (oVarE.e("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (oVarE.e("Content-Length") == null) {
                    return new c(oVarE, yVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public c(o oVar, y yVar) {
            this.f45605a = oVar;
            this.f45606b = yVar;
        }
    }

    static {
        Pattern pattern = r.f45588d;
        f45593e = r.a.a("multipart/mixed");
        r.a.a("multipart/alternative");
        r.a.a("multipart/digest");
        r.a.a("multipart/parallel");
        f45594f = r.a.a("multipart/form-data");
        f45595g = new byte[]{58, 32};
        f45596h = new byte[]{13, 10};
        f45597i = new byte[]{45, 45};
    }

    public s(ByteString boundaryByteString, r type, List<c> list) {
        kotlin.jvm.internal.i.e(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.i.e(type, "type");
        this.f45598a = boundaryByteString;
        this.f45599b = list;
        Pattern pattern = r.f45588d;
        this.f45600c = r.a.a(type + "; boundary=" + boundaryByteString.v());
        this.f45601d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(InterfaceC2840g interfaceC2840g, boolean z10) throws IOException {
        C2839f c2839f;
        InterfaceC2840g c2839f2;
        if (z10) {
            c2839f2 = new C2839f();
            c2839f = c2839f2;
        } else {
            c2839f = 0;
            c2839f2 = interfaceC2840g;
        }
        List<c> list = this.f45599b;
        int size = list.size();
        long j = 0;
        int i10 = 0;
        while (true) {
            ByteString byteString = this.f45598a;
            byte[] bArr = f45597i;
            byte[] bArr2 = f45596h;
            if (i10 >= size) {
                kotlin.jvm.internal.i.b(c2839f2);
                c2839f2.w0(bArr);
                c2839f2.z0(byteString);
                c2839f2.w0(bArr);
                c2839f2.w0(bArr2);
                if (!z10) {
                    return j;
                }
                kotlin.jvm.internal.i.b(c2839f);
                long j10 = j + c2839f.f49074c;
                c2839f.b();
                return j10;
            }
            c cVar = list.get(i10);
            o oVar = cVar.f45605a;
            kotlin.jvm.internal.i.b(c2839f2);
            c2839f2.w0(bArr);
            c2839f2.z0(byteString);
            c2839f2.w0(bArr2);
            int size2 = oVar.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c2839f2.Z(oVar.k(i11)).w0(f45595g).Z(oVar.v(i11)).w0(bArr2);
            }
            y yVar = cVar.f45606b;
            r rVarContentType = yVar.contentType();
            if (rVarContentType != null) {
                c2839f2.Z("Content-Type: ").Z(rVarContentType.f45590a).w0(bArr2);
            }
            long jContentLength = yVar.contentLength();
            if (jContentLength != -1) {
                c2839f2.Z("Content-Length: ").Q0(jContentLength).w0(bArr2);
            } else if (z10) {
                kotlin.jvm.internal.i.b(c2839f);
                c2839f.b();
                return -1L;
            }
            c2839f2.w0(bArr2);
            if (z10) {
                j += jContentLength;
            } else {
                yVar.writeTo(c2839f2);
            }
            c2839f2.w0(bArr2);
            i10++;
        }
    }

    @Override // okhttp3.y
    public final long contentLength() throws IOException {
        long j = this.f45601d;
        if (j != -1) {
            return j;
        }
        long jA = a(null, true);
        this.f45601d = jA;
        return jA;
    }

    @Override // okhttp3.y
    public final r contentType() {
        return this.f45600c;
    }

    @Override // okhttp3.y
    public final void writeTo(InterfaceC2840g sink) throws IOException {
        kotlin.jvm.internal.i.e(sink, "sink");
        a(sink, false);
    }
}
