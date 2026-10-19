package p294xb;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.g;
import okio.ByteString;
import p172nb.b;
import p293xa.r;
import p318zb.C;
import p318zb.C2839f;
import p318zb.H;

/* JADX INFO: compiled from: WebSocketReader.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f47989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f47990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f47995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47996i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f47997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2839f f47998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2839f f47999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f48000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f48001o;

    public i(C source, d dVar, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f47989b = source;
        this.f47990c = dVar;
        this.f47991d = z10;
        this.f47992e = z11;
        this.f47998l = new C2839f();
        this.f47999m = new C2839f();
        this.f48001o = null;
    }

    public final void b() throws IOException {
        String strR0;
        short sN0;
        i iVar;
        j jVar;
        String strB;
        long j = this.f47995h;
        C2839f c2839f = this.f47998l;
        if (j > 0) {
            this.f47989b.j(c2839f, j);
        }
        int i10 = this.f47994g;
        d dVar = this.f47990c;
        switch (i10) {
            case 8:
                long j10 = c2839f.f49074c;
                if (j10 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                g gVar = null;
                if (j10 != 0) {
                    sN0 = c2839f.n0();
                    strR0 = c2839f.r0();
                    if (sN0 < 1000 || sN0 >= 5000) {
                        strB = J4.i.b(sN0, "Code must be in range [1000,5000): ");
                    } else {
                        strB = ((1004 > sN0 || sN0 >= 1007) && (1015 > sN0 || sN0 >= 3000)) ? null : J4.i.c(sN0, "Code ", " is reserved and may not be used.");
                    }
                    if (strB != null) {
                        throw new ProtocolException(strB);
                    }
                } else {
                    strR0 = "";
                    sN0 = 1005;
                }
                if (sN0 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (dVar) {
                    try {
                        if (dVar.f47966r != -1) {
                            throw new IllegalStateException("already closed");
                        }
                        dVar.f47966r = sN0;
                        dVar.f47967s = strR0;
                        if (dVar.f47965q && dVar.f47963o.isEmpty()) {
                            g gVar2 = dVar.f47961m;
                            dVar.f47961m = null;
                            iVar = dVar.f47958i;
                            dVar.f47958i = null;
                            jVar = dVar.j;
                            dVar.j = null;
                            dVar.f47959k.f();
                            gVar = gVar2;
                        } else {
                            iVar = null;
                            jVar = null;
                        }
                        r rVar = r.f47939a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    dVar.f47950a.onClosing(dVar, sN0, strR0);
                    if (gVar != null) {
                        dVar.f47950a.onClosed(dVar, sN0, strR0);
                        break;
                    }
                    if (gVar != null) {
                        b.c(gVar);
                    }
                    if (iVar != null) {
                        b.c(iVar);
                    }
                    if (jVar != null) {
                        b.c(jVar);
                    }
                    this.f47993f = true;
                    return;
                } catch (Throwable th2) {
                    if (gVar != null) {
                        b.c(gVar);
                    }
                    if (iVar != null) {
                        b.c(iVar);
                    }
                    if (jVar != null) {
                        b.c(jVar);
                    }
                    throw th2;
                }
            case 9:
                ByteString payload = c2839f.R(c2839f.f49074c);
                synchronized (dVar) {
                    try {
                        kotlin.jvm.internal.i.e(payload, "payload");
                        if (!dVar.f47968t && (!dVar.f47965q || !dVar.f47963o.isEmpty())) {
                            dVar.f47962n.add(payload);
                            dVar.e();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 10:
                ByteString payload2 = c2839f.R(c2839f.f49074c);
                synchronized (dVar) {
                    kotlin.jvm.internal.i.e(payload2, "payload");
                    dVar.f47970v = false;
                }
                return;
            default:
                int i11 = this.f47994g;
                byte[] bArr = b.f45026a;
                String hexString = Integer.toHexString(i11);
                kotlin.jvm.internal.i.d(hexString, "toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void c() throws IOException {
        boolean z10;
        if (this.f47993f) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        C c10 = this.f47989b;
        long jH = c10.f49037b.timeout().h();
        H h8 = c10.f49037b;
        h8.timeout().b();
        try {
            byte b10 = c10.readByte();
            byte[] bArr = b.f45026a;
            h8.timeout().g(jH, TimeUnit.NANOSECONDS);
            int i10 = b10 & 15;
            this.f47994g = i10;
            int i11 = 0;
            boolean z11 = (b10 & 128) != 0;
            this.f47996i = z11;
            boolean z12 = (b10 & 8) != 0;
            this.j = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (b10 & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f47991d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f47997k = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b10 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b10 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b11 = c10.readByte();
            boolean z14 = (b11 & 128) != 0;
            if (z14) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b11 & 127;
            this.f47995h = j;
            C2839f c2839f = c10.f49038c;
            if (j == 126) {
                this.f47995h = c10.p() & 65535;
            } else if (j == 127) {
                c10.N0(8L);
                long jM0 = c2839f.m0();
                this.f47995h = jM0;
                if (jM0 < 0) {
                    StringBuilder sb2 = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f47995h);
                    kotlin.jvm.internal.i.d(hexString, "toHexString(this)");
                    sb2.append(hexString);
                    sb2.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb2.toString());
                }
            }
            if (this.j && this.f47995h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z14) {
                return;
            }
            byte[] bArr2 = this.f48001o;
            kotlin.jvm.internal.i.b(bArr2);
            try {
                c10.N0(bArr2.length);
                c2839f.U(bArr2);
            } catch (EOFException e10) {
                while (true) {
                    long j10 = c2839f.f49074c;
                    if (j10 <= 0) {
                        throw e10;
                    }
                    int i12 = c2839f.read(bArr2, i11, (int) j10);
                    if (i12 == -1) {
                        throw new AssertionError();
                    }
                    i11 += i12;
                }
            }
        } catch (Throwable th) {
            h8.timeout().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c cVar = this.f48000n;
        if (cVar != null) {
            cVar.close();
        }
    }
}
