package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import okhttp3.internal.cache.DiskLruCache;
import okio.ByteString;
import p318zb.C2839f;
import p318zb.C2839f.b;
import p318zb.F;
import p318zb.H;
import p318zb.InterfaceC2841h;

/* JADX INFO: renamed from: okhttp3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2752c implements Closeable, Flushable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DiskLruCache f45311b;

    /* JADX INFO: renamed from: okhttp3.c$a */
    /* JADX INFO: compiled from: Cache.kt */
    public static final class a extends A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DiskLruCache.b f45312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f45313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f45314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p318zb.C f45315f;

        /* JADX INFO: renamed from: okhttp3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class C0514a extends p318zb.n {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f45316c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0514a(H h8, a aVar) {
                super(h8);
                this.f45316c = aVar;
            }

            @Override // p318zb.n, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.f45316c.f45312c.close();
                super.close();
            }
        }

        public a(DiskLruCache.b bVar, String str, String str2) {
            this.f45312c = bVar;
            this.f45313d = str;
            this.f45314e = str2;
            this.f45315f = p318zb.v.b(new C0514a((H) bVar.f45430d.get(1), this));
        }

        @Override // okhttp3.A
        public final long b() {
            String str = this.f45314e;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = p172nb.b.f45026a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.A
        public final r c() {
            String str = this.f45313d;
            if (str == null) {
                return null;
            }
            Pattern pattern = r.f45588d;
            return r.a.b(str);
        }

        @Override // okhttp3.A
        public final InterfaceC2841h h() {
            return this.f45315f;
        }
    }

    /* JADX INFO: renamed from: okhttp3.c$b */
    /* JADX INFO: compiled from: Cache.kt */
    public static final class b {
        public static String a(p url) {
            kotlin.jvm.internal.i.e(url, "url");
            ByteString byteString = ByteString.f45705d;
            return ByteString.a.c(url.f45579i).c("MD5").f();
        }

        public static int b(p318zb.C c10) throws IOException {
            C2839f c2839f;
            try {
                c10.N0(1L);
                long j = 0;
                while (true) {
                    long j10 = j + 1;
                    boolean zG = c10.g(j10);
                    c2839f = c10.f49038c;
                    if (!zG) {
                        break;
                    }
                    byte bP = c2839f.p(j);
                    if ((bP >= 48 && bP <= 57) || (j == 0 && bP == 45)) {
                        j = j10;
                    }
                    if (j != 0) {
                        break;
                    }
                    O.h.c(16);
                    String string = Integer.toString(bP, 16);
                    kotlin.jvm.internal.i.d(string, "toString(...)");
                    throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                }
                long jS = c2839f.S();
                String strX = c10.x(Long.MAX_VALUE);
                if (jS >= 0 && jS <= 2147483647L && strX.length() <= 0) {
                    return (int) jS;
                }
                throw new IOException("expected an int but was \"" + jS + strX + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static Set c(o oVar) {
            int size = oVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if ("Vary".equalsIgnoreCase(oVar.k(i10))) {
                    String strV = oVar.v(i10);
                    if (treeSet == null) {
                        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                        kotlin.jvm.internal.i.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                        treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = kotlin.text.n.f0(strV, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(kotlin.text.n.p0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? EmptySet.f42985b : treeSet;
        }
    }

    /* JADX INFO: renamed from: okhttp3.c$d */
    /* JADX INFO: compiled from: Cache.kt */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f45328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F f45329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f45330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45331d;

        /* JADX INFO: renamed from: okhttp3.c$d$a */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class a extends p318zb.m {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2752c f45333c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d f45334d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2752c c2752c, d dVar, F f10) {
                super(f10);
                this.f45333c = c2752c;
                this.f45334d = dVar;
            }

            @Override // p318zb.m, p318zb.F, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                C2752c c2752c = this.f45333c;
                d dVar = this.f45334d;
                synchronized (c2752c) {
                    if (dVar.f45331d) {
                        return;
                    }
                    dVar.f45331d = true;
                    super.close();
                    this.f45334d.f45328a.b();
                }
            }
        }

        public d(DiskLruCache.Editor editor) {
            this.f45328a = editor;
            F fD = editor.d(1);
            this.f45329b = fD;
            this.f45330c = new a(C2752c.this, this, fD);
        }

        public final void a() {
            synchronized (C2752c.this) {
                if (this.f45331d) {
                    return;
                }
                this.f45331d = true;
                p172nb.b.c(this.f45329b);
                try {
                    this.f45328a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public C2752c(File file) {
        this.f45311b = new DiskLruCache(file, p184ob.d.f45260h);
    }

    public final void b(u request) throws IOException {
        kotlin.jvm.internal.i.e(request, "request");
        DiskLruCache diskLruCache = this.f45311b;
        String key = b.a(request.f45661a);
        synchronized (diskLruCache) {
            kotlin.jvm.internal.i.e(key, "key");
            diskLruCache.j();
            diskLruCache.b();
            DiskLruCache.N(key);
            DiskLruCache.a aVar = diskLruCache.f45405h.get(key);
            if (aVar == null) {
                return;
            }
            diskLruCache.C(aVar);
            if (diskLruCache.f45403f <= 10485760) {
                diskLruCache.f45410n = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f45311b.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.f45311b.flush();
    }

    /* JADX INFO: renamed from: okhttp3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cache.kt */
    public static final class C0515c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f45317k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f45318l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f45319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f45320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f45321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Protocol f45322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f45324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o f45325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Handshake f45326h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f45327i;
        public final long j;

        static {
            p244tb.h hVar = p244tb.h.f47384a;
            p244tb.h.f47384a.getClass();
            f45317k = "OkHttp-Sent-Millis";
            p244tb.h.f47384a.getClass();
            f45318l = "OkHttp-Received-Millis";
        }

        public C0515c(H rawSource) throws IOException {
            p pVarA;
            kotlin.jvm.internal.i.e(rawSource, "rawSource");
            try {
                p318zb.C cB = p318zb.v.b(rawSource);
                String strX = cB.x(Long.MAX_VALUE);
                try {
                    p.a aVar = new p.a();
                    aVar.c(null, strX);
                    pVarA = aVar.a();
                } catch (IllegalArgumentException unused) {
                    pVarA = null;
                }
                if (pVarA == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strX));
                    p244tb.h hVar = p244tb.h.f47384a;
                    p244tb.h.f47384a.getClass();
                    p244tb.h.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f45319a = pVarA;
                this.f45321c = cB.x(Long.MAX_VALUE);
                o.a aVar2 = new o.a();
                int iB = b.b(cB);
                for (int i10 = 0; i10 < iB; i10++) {
                    aVar2.b(cB.x(Long.MAX_VALUE));
                }
                this.f45320b = aVar2.e();
                p197pb.i iVarA = pb.i.a.a(cB.x(Long.MAX_VALUE));
                this.f45322d = iVarA.f45956a;
                this.f45323e = iVarA.f45957b;
                this.f45324f = iVarA.f45958c;
                o.a aVar3 = new o.a();
                int iB2 = b.b(cB);
                for (int i11 = 0; i11 < iB2; i11++) {
                    aVar3.b(cB.x(Long.MAX_VALUE));
                }
                String str = f45317k;
                String strF = aVar3.f(str);
                String str2 = f45318l;
                String strF2 = aVar3.f(str2);
                aVar3.g(str);
                aVar3.g(str2);
                this.f45327i = strF != null ? Long.parseLong(strF) : 0L;
                this.j = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.f45325g = aVar3.e();
                if (kotlin.jvm.internal.i.a(this.f45319a.f45571a, "https")) {
                    String strX2 = cB.x(Long.MAX_VALUE);
                    if (strX2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strX2 + '\"');
                    }
                    g gVarB = g.f45353b.b(cB.x(Long.MAX_VALUE));
                    List peerCertificates = a(cB);
                    List localCertificates = a(cB);
                    TlsVersion tlsVersionA = !cB.b() ? TlsVersion.a.a(cB.x(Long.MAX_VALUE)) : TlsVersion.SSL_3_0;
                    kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
                    kotlin.jvm.internal.i.e(localCertificates, "localCertificates");
                    final List listX = p172nb.b.x(peerCertificates);
                    this.f45326h = new Handshake(tlsVersionA, gVarB, p172nb.b.x(localCertificates), new Ia.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final List<? extends Certificate> invoke() {
                            return listX;
                        }
                    });
                } else {
                    this.f45326h = null;
                }
                p293xa.r rVar = p293xa.r.f47939a;
                p241t7.b.n(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(rawSource, th);
                    throw th2;
                }
            }
        }

        public static List a(p318zb.C c10) throws IOException {
            int iB = b.b(c10);
            if (iB == -1) {
                return EmptyList.f42983b;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iB);
                for (int i10 = 0; i10 < iB; i10++) {
                    String strX = c10.x(Long.MAX_VALUE);
                    C2839f c2839f = new C2839f();
                    ByteString byteString = ByteString.f45705d;
                    ByteString byteStringA = ByteString.a.a(strX);
                    if (byteStringA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c2839f.K0(byteStringA);
                    arrayList.add(certificateFactory.generateCertificate(c2839f.new b()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static void b(p318zb.B b10, List list) throws IOException {
            try {
                b10.Q0(list.size());
                b10.E(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    ByteString byteString = ByteString.f45705d;
                    kotlin.jvm.internal.i.d(bytes, "bytes");
                    b10.Z(ByteString.a.d(bytes).a());
                    b10.E(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void c(DiskLruCache.Editor editor) throws IOException {
            p pVar = this.f45319a;
            Handshake handshake = this.f45326h;
            o oVar = this.f45325g;
            o oVar2 = this.f45320b;
            p318zb.B bA = p318zb.v.a(editor.d(0));
            try {
                bA.Z(pVar.f45579i);
                bA.E(10);
                bA.Z(this.f45321c);
                bA.E(10);
                bA.Q0(oVar2.size());
                bA.E(10);
                int size = oVar2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bA.Z(oVar2.k(i10));
                    bA.Z(": ");
                    bA.Z(oVar2.v(i10));
                    bA.E(10);
                }
                Protocol protocol = this.f45322d;
                int i11 = this.f45323e;
                String message = this.f45324f;
                kotlin.jvm.internal.i.e(protocol, "protocol");
                kotlin.jvm.internal.i.e(message, "message");
                StringBuilder sb2 = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(i11);
                sb2.append(' ');
                sb2.append(message);
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
                bA.Z(string);
                bA.E(10);
                bA.Q0(oVar.size() + 2);
                bA.E(10);
                int size2 = oVar.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    bA.Z(oVar.k(i12));
                    bA.Z(": ");
                    bA.Z(oVar.v(i12));
                    bA.E(10);
                }
                bA.Z(f45317k);
                bA.Z(": ");
                bA.Q0(this.f45327i);
                bA.E(10);
                bA.Z(f45318l);
                bA.Z(": ");
                bA.Q0(this.j);
                bA.E(10);
                if (kotlin.jvm.internal.i.a(pVar.f45571a, "https")) {
                    bA.E(10);
                    kotlin.jvm.internal.i.b(handshake);
                    bA.Z(handshake.f45285b.f45371a);
                    bA.E(10);
                    b(bA, handshake.a());
                    b(bA, handshake.f45286c);
                    bA.Z(handshake.f45284a.a());
                    bA.E(10);
                }
                p293xa.r rVar = p293xa.r.f47939a;
                p241t7.b.n(bA, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p241t7.b.n(bA, th);
                    throw th2;
                }
            }
        }

        public C0515c(z zVar) {
            o oVarE;
            u uVar = zVar.f45680b;
            this.f45319a = uVar.f45661a;
            z zVar2 = zVar.f45687i;
            kotlin.jvm.internal.i.b(zVar2);
            o oVar = zVar2.f45680b.f45663c;
            o oVar2 = zVar.f45685g;
            Set setC = b.c(oVar2);
            if (setC.isEmpty()) {
                oVarE = p172nb.b.f45027b;
            } else {
                o.a aVar = new o.a();
                int size = oVar.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strK = oVar.k(i10);
                    if (setC.contains(strK)) {
                        aVar.a(strK, oVar.v(i10));
                    }
                }
                oVarE = aVar.e();
            }
            this.f45320b = oVarE;
            this.f45321c = uVar.f45662b;
            this.f45322d = zVar.f45681c;
            this.f45323e = zVar.f45683e;
            this.f45324f = zVar.f45682d;
            this.f45325g = oVar2;
            this.f45326h = zVar.f45684f;
            this.f45327i = zVar.f45689l;
            this.j = zVar.f45690m;
        }
    }
}
