package p294xb;

import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.jvm.internal.i;
import okhttp3.D;
import okhttp3.E;
import okhttp3.Protocol;
import okhttp3.internal.connection.g;
import okhttp3.u;
import okhttp3.z;
import okio.ByteString;
import p005a4.o;
import p293xa.r;
import p318zb.B;
import p318zb.C;
import p318zb.C2839f;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements D {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List<Protocol> f47949w = M1.k(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f47950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f47951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f47953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public okhttp3.internal.connection.e f47956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0552d f47957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f47958i;
    public j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p184ob.c f47959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f47960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f47961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque<ByteString> f47962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque<Object> f47963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f47964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f47966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f47967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f47968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f47969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f47970v;

    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f47972b;

        public a(int i10, ByteString byteString) {
            this.f47971a = i10;
            this.f47972b = byteString;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteString f47974b;

        public b(int i10, ByteString byteString) {
            this.f47973a = i10;
            this.f47974b = byteString;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    public static abstract class c implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f47975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B f47976c;

        public c(C source, B sink) {
            i.e(source, "source");
            i.e(sink, "sink");
            this.f47975b = source;
            this.f47976c = sink;
        }
    }

    /* JADX INFO: renamed from: xb.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RealWebSocket.kt */
    public final class C0552d extends p184ob.a {
        public C0552d() {
            super(Q8.d.a(new StringBuilder(), d.this.f47960l, " writer"), true);
        }

        @Override // p184ob.a
        public final long a() {
            d dVar = d.this;
            try {
                return dVar.f() ? 0L : -1L;
            } catch (IOException e10) {
                dVar.b(e10, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class e extends p184ob.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f47978e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, d dVar) {
            super(str, true);
            this.f47978e = dVar;
        }

        @Override // p184ob.a
        public final long a() {
            okhttp3.internal.connection.e eVar = this.f47978e.f47956g;
            i.b(eVar);
            eVar.cancel();
            return -1L;
        }
    }

    public d(p184ob.d taskRunner, u originalRequest, E listener, Random random, long j, long j10) {
        i.e(taskRunner, "taskRunner");
        i.e(originalRequest, "originalRequest");
        i.e(listener, "listener");
        this.f47950a = listener;
        this.f47951b = random;
        this.f47952c = j;
        this.f47953d = null;
        this.f47954e = j10;
        this.f47959k = taskRunner.e();
        this.f47962n = new ArrayDeque<>();
        this.f47963o = new ArrayDeque<>();
        this.f47966r = -1;
        String str = originalRequest.f45662b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(B7.b.c("Request must be GET: ", str).toString());
        }
        ByteString byteString = ByteString.f45705d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        r rVar = r.f47939a;
        this.f47955f = ByteString.a.d(bArr).a();
    }

    public final void a(z zVar, okhttp3.internal.connection.c cVar) throws IOException {
        int i10 = zVar.f45683e;
        if (i10 != 101) {
            StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
            sb2.append(i10);
            sb2.append(' ');
            throw new ProtocolException(B7.b.g(sb2, zVar.f45682d, '\''));
        }
        String strC = z.c("Connection", zVar);
        if (!"Upgrade".equalsIgnoreCase(strC)) {
            throw new ProtocolException(o.c('\'', "Expected 'Connection' header value 'Upgrade' but was '", strC));
        }
        String strC2 = z.c("Upgrade", zVar);
        if (!"websocket".equalsIgnoreCase(strC2)) {
            throw new ProtocolException(o.c('\'', "Expected 'Upgrade' header value 'websocket' but was '", strC2));
        }
        String strC3 = z.c("Sec-WebSocket-Accept", zVar);
        ByteString byteString = ByteString.f45705d;
        String strA = ByteString.a.c(this.f47955f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (i.a(strA, strC3)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strC3 + '\'');
    }

    public final void b(Exception exc, z zVar) {
        synchronized (this) {
            if (this.f47968t) {
                return;
            }
            this.f47968t = true;
            g gVar = this.f47961m;
            this.f47961m = null;
            i iVar = this.f47958i;
            this.f47958i = null;
            j jVar = this.j;
            this.j = null;
            this.f47959k.f();
            r rVar = r.f47939a;
            try {
                this.f47950a.onFailure(this, exc, zVar);
            } finally {
                if (gVar != null) {
                    p172nb.b.c(gVar);
                }
                if (iVar != null) {
                    p172nb.b.c(iVar);
                }
                if (jVar != null) {
                    p172nb.b.c(jVar);
                }
            }
        }
    }

    public final void c(String name, g gVar) throws IOException {
        i.e(name, "name");
        g gVar2 = this.f47953d;
        i.b(gVar2);
        synchronized (this) {
            try {
                this.f47960l = name;
                this.f47961m = gVar;
                this.j = new j(gVar.f47976c, this.f47951b, gVar2.f47983a, gVar2.f47985c, this.f47954e);
                this.f47957h = new C0552d();
                long j = this.f47952c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.f47959k.c(new f(name.concat(" ping"), this, nanos), nanos);
                }
                if (!this.f47963o.isEmpty()) {
                    e();
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f47958i = new i(gVar.f47975b, this, gVar2.f47983a, gVar2.f47987e);
    }

    @Override // okhttp3.D
    public final boolean close(int i10, String str) {
        String str2;
        synchronized (this) {
            ByteString byteStringC = null;
            try {
                if (i10 < 1000 || i10 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i10;
                } else if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i10 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    ByteString byteString = ByteString.f45705d;
                    byteStringC = ByteString.a.c(str);
                    if (byteStringC.e() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f47968t && !this.f47965q) {
                    this.f47965q = true;
                    this.f47963o.add(new a(i10, byteStringC));
                    e();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() throws IOException {
        while (this.f47966r == -1) {
            i iVar = this.f47958i;
            i.b(iVar);
            iVar.c();
            if (iVar.j) {
                iVar.b();
            } else {
                int i10 = iVar.f47994g;
                if (i10 != 1 && i10 != 2) {
                    byte[] bArr = p172nb.b.f45026a;
                    String hexString = Integer.toHexString(i10);
                    i.d(hexString, "toHexString(this)");
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (true) {
                    if (!iVar.f47993f) {
                        long j = iVar.f47995h;
                        C2839f buffer = iVar.f47999m;
                        if (j > 0) {
                            iVar.f47989b.j(buffer, j);
                        }
                        if (iVar.f47996i) {
                            if (iVar.f47997k) {
                                p294xb.c cVar = iVar.f48000n;
                                if (cVar == null) {
                                    cVar = new p294xb.c(iVar.f47992e);
                                    iVar.f48000n = cVar;
                                }
                                i.e(buffer, "buffer");
                                C2839f c2839f = cVar.f47946c;
                                if (c2839f.f49074c != 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                Inflater inflater = cVar.f47947d;
                                if (cVar.f47945b) {
                                    inflater.reset();
                                }
                                c2839f.k0(buffer);
                                c2839f.c1(65535);
                                long bytesRead = inflater.getBytesRead() + c2839f.f49074c;
                                do {
                                    cVar.f47948e.b(buffer, Long.MAX_VALUE);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            d dVar = iVar.f47990c;
                            E e10 = dVar.f47950a;
                            if (i10 != 1) {
                                ByteString bytes = buffer.R(buffer.f49074c);
                                i.e(bytes, "bytes");
                                e10.onMessage(dVar, bytes);
                                break;
                            }
                            e10.onMessage(dVar, buffer.r0());
                            break;
                        }
                        while (!iVar.f47993f) {
                            iVar.c();
                            if (!iVar.j) {
                                break;
                            } else {
                                iVar.b();
                            }
                        }
                        if (iVar.f47994g != 0) {
                            int i11 = iVar.f47994g;
                            byte[] bArr2 = p172nb.b.f45026a;
                            String hexString2 = Integer.toHexString(i11);
                            i.d(hexString2, "toHexString(this)");
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    } else {
                        throw new IOException(MetricTracker.Action.CLOSED);
                    }
                }
            }
        }
    }

    public final void e() {
        byte[] bArr = p172nb.b.f45026a;
        C0552d c0552d = this.f47957h;
        if (c0552d != null) {
            this.f47959k.c(c0552d, 0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0116 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0128 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x0137  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0144 A[Catch: all -> 0x0088, TryCatch #2 {all -> 0x0088, blocks: (B:29:0x007c, B:32:0x008b, B:34:0x008f, B:35:0x009b, B:37:0x00a8, B:40:0x00ac, B:41:0x00ad, B:42:0x00ae, B:44:0x00b2, B:74:0x0124, B:76:0x0128, B:85:0x0141, B:86:0x0143, B:62:0x00dd, B:66:0x0102, B:67:0x010b, B:63:0x00f1, B:68:0x010c, B:70:0x0116, B:71:0x0119, B:87:0x0144, B:88:0x0149, B:73:0x0121, B:36:0x009c), top: B:102:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00f1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean f() throws IOException {
        Object objPoll;
        String str;
        int i10;
        ?? r10;
        ?? r11;
        ?? r12;
        int i11;
        ByteString byteString;
        ByteString byteStringR;
        C2839f c2839f;
        b bVar;
        synchronized (this) {
            try {
                if (this.f47968t) {
                    return false;
                }
                j jVar = this.j;
                ByteString byteStringPoll = this.f47962n.poll();
                String str2 = null;
                try {
                    if (byteStringPoll == null) {
                        objPoll = this.f47963o.poll();
                        if (objPoll instanceof a) {
                            i10 = this.f47966r;
                            str = this.f47967s;
                            if (i10 != -1) {
                                g gVar = this.f47961m;
                                this.f47961m = null;
                                i iVar = this.f47958i;
                                this.f47958i = null;
                                j jVar2 = this.j;
                                this.j = null;
                                this.f47959k.f();
                                r10 = gVar;
                                r12 = iVar;
                                r11 = jVar2;
                            } else {
                                ((a) objPoll).getClass();
                                this.f47959k.c(new e(this.f47960l + " cancel", this), TimeUnit.MILLISECONDS.toNanos(60000L));
                                r10 = 0;
                                r12 = 0;
                                r11 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        r rVar = r.f47939a;
                        if (byteStringPoll != null) {
                            i.b(jVar);
                            jVar.b(10, byteStringPoll);
                        } else if (objPoll instanceof b) {
                            bVar = (b) objPoll;
                            i.b(jVar);
                            jVar.c(bVar.f47973a, bVar.f47974b);
                            synchronized (this) {
                                this.f47964p -= (long) bVar.f47974b.e();
                            }
                        } else {
                            if (objPoll instanceof a) {
                                throw new AssertionError();
                            }
                            a aVar = (a) objPoll;
                            i.b(jVar);
                            i11 = aVar.f47971a;
                            byteString = aVar.f47972b;
                            byteStringR = ByteString.f45705d;
                            if (i11 == 0 || byteString != null) {
                                if (i11 != 0) {
                                    if (i11 >= 1000 || i11 >= 5000) {
                                        str2 = "Code must be in range [1000,5000): " + i11;
                                    } else if ((1004 <= i11 && i11 < 1007) || (1015 <= i11 && i11 < 3000)) {
                                        str2 = "Code " + i11 + " is reserved and may not be used.";
                                    }
                                    if (str2 != null) {
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                }
                                c2839f = new C2839f();
                                c2839f.d1(i11);
                                if (byteString != null) {
                                    c2839f.K0(byteString);
                                }
                                byteStringR = c2839f.R(c2839f.f49074c);
                            }
                            try {
                                jVar.b(8, byteStringR);
                                jVar.f48009i = true;
                                if (r10 != 0) {
                                    E e10 = this.f47950a;
                                    i.b(str);
                                    e10.onClosed(this, i10, str);
                                }
                            } catch (Throwable th) {
                                jVar.f48009i = true;
                                throw th;
                            }
                        }
                        if (r10 != 0) {
                            p172nb.b.c(r10);
                        }
                        if (r12 != 0) {
                            p172nb.b.c(r12);
                        }
                        if (r11 != 0) {
                            p172nb.b.c(r11);
                        }
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (byteStringPoll != null) {
                        i.b(jVar);
                        jVar.b(10, byteStringPoll);
                    } else if (objPoll instanceof b) {
                        bVar = (b) objPoll;
                        i.b(jVar);
                        jVar.c(bVar.f47973a, bVar.f47974b);
                        synchronized (this) {
                            this.f47964p -= (long) bVar.f47974b.e();
                        }
                    } else {
                        if (objPoll instanceof a) {
                            throw new AssertionError();
                        }
                        a aVar2 = (a) objPoll;
                        i.b(jVar);
                        i11 = aVar2.f47971a;
                        byteString = aVar2.f47972b;
                        byteStringR = ByteString.f45705d;
                        if (i11 == 0) {
                            if (i11 != 0) {
                                if (i11 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            c2839f = new C2839f();
                            c2839f.d1(i11);
                            if (byteString != null) {
                                c2839f.K0(byteString);
                            }
                            byteStringR = c2839f.R(c2839f.f49074c);
                        } else {
                            if (i11 != 0) {
                                if (i11 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i11;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            c2839f = new C2839f();
                            c2839f.d1(i11);
                            if (byteString != null) {
                                c2839f.K0(byteString);
                            }
                            byteStringR = c2839f.R(c2839f.f49074c);
                        }
                        jVar.b(8, byteStringR);
                        jVar.f48009i = true;
                        if (r10 != 0) {
                            E e11 = this.f47950a;
                            i.b(str);
                            e11.onClosed(this, i10, str);
                        }
                    }
                    if (r10 != 0) {
                        p172nb.b.c(r10);
                    }
                    if (r12 != 0) {
                        p172nb.b.c(r12);
                    }
                    if (r11 != 0) {
                        p172nb.b.c(r11);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (r10 != 0) {
                        p172nb.b.c(r10);
                    }
                    if (r12 != 0) {
                        p172nb.b.c(r12);
                    }
                    if (r11 != 0) {
                        p172nb.b.c(r11);
                    }
                    throw th2;
                }
                String str3 = str;
                String str4 = str3;
                i10 = -1;
                r10 = str4;
                r12 = str3;
                r11 = str4;
                r rVar2 = r.f47939a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // okhttp3.D
    public final boolean send(String text) {
        i.e(text, "text");
        ByteString byteString = ByteString.f45705d;
        ByteString byteStringC = ByteString.a.c(text);
        synchronized (this) {
            if (!this.f47968t && !this.f47965q) {
                if (this.f47964p + ((long) byteStringC.e()) <= 16777216) {
                    this.f47964p += (long) byteStringC.e();
                    this.f47963o.add(new b(1, byteStringC));
                    e();
                    return true;
                }
                close(1001, null);
            }
            return false;
        }
    }
}
