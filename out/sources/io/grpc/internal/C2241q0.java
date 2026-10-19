package io.grpc.internal;

import io.grpc.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: io.grpc.internal.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: MessageFramer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2241q0 implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2208a f37662a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V0 f37664c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C.e f37668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O0 f37669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37670i;
    public int j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f37672l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37663b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D9.f f37665d = D9.e.b.f2879a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f37666e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteBuffer f37667f = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37671k = -1;

    /* JADX INFO: renamed from: io.grpc.internal.q0$b */
    /* JADX INFO: compiled from: MessageFramer.java */
    public class b extends OutputStream {
        public b() {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            C2241q0.this.f(bArr, i10, i11);
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }
    }

    public C2241q0(AbstractC2208a abstractC2208a, C.e eVar, O0 o10) {
        this.f37662a = abstractC2208a;
        this.f37668g = eVar;
        this.f37669h = o10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int g(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof D9.m) {
            return ((D9.m) inputStream).b(outputStream);
        }
        int i10 = p082g6.a.f35603a;
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                break;
            }
            outputStream.write(bArr, 0, i11);
            j += (long) i11;
        }
        A8.p.d(j, "Message size overflow: %s", j <= 2147483647L);
        return (int) j;
    }

    @Override // io.grpc.internal.M
    public final M a(D9.f fVar) {
        this.f37665d = fVar;
        return this;
    }

    @Override // io.grpc.internal.M
    public final void b(InputStream inputStream) {
        if (this.f37670i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.j++;
        int i10 = this.f37671k + 1;
        this.f37671k = i10;
        this.f37672l = 0L;
        O0 o10 = this.f37669h;
        for (C.g gVar : o10.f37429a) {
            gVar.b0(i10);
        }
        boolean z10 = this.f37665d != D9.e.b.f2879a;
        try {
            int iAvailable = ((inputStream instanceof D9.s) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            int iH = (iAvailable == 0 || !z10) ? h(inputStream, iAvailable) : e(inputStream);
            if (iAvailable != -1 && iH != iAvailable) {
                throw Status.f36904k.h(A8.f.d(iH, iAvailable, "Message length inaccurate ", " != ")).a();
            }
            long j = iH;
            C.g[] gVarArr = o10.f37429a;
            for (C.g gVar2 : gVarArr) {
                gVar2.d0(j);
            }
            long j10 = this.f37672l;
            for (C.g gVar3 : gVarArr) {
                gVar3.e0(j10);
            }
            int i11 = this.f37671k;
            long j11 = this.f37672l;
            for (C.g gVar4 : o10.f37429a) {
                gVar4.c0(i11, j11, j);
            }
        } catch (IOException e10) {
            throw Status.f36904k.h("Failed to frame message").g(e10).a();
        } catch (RuntimeException e11) {
            throw Status.f36904k.h("Failed to frame message").g(e11).a();
        }
    }

    public final void c(a aVar, boolean z10) {
        ArrayList arrayList = aVar.f37673b;
        Iterator it = arrayList.iterator();
        int iE = 0;
        while (it.hasNext()) {
            iE += ((V0) it.next()).e();
        }
        ByteBuffer byteBuffer = this.f37667f;
        byteBuffer.clear();
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0).putInt(iE);
        E9.h hVarE = this.f37668g.e(5);
        hVarE.a(byteBuffer.array(), 0, byteBuffer.position());
        if (iE == 0) {
            this.f37664c = hVarE;
            return;
        }
        int i10 = this.j - 1;
        AbstractC2208a abstractC2208a = this.f37662a;
        abstractC2208a.o(hVarE, false, false, i10);
        this.j = 1;
        for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
            abstractC2208a.o((V0) arrayList.get(i11), false, false, 0);
        }
        this.f37664c = (V0) Z3.n.f(1, arrayList);
        this.f37672l = iE;
    }

    @Override // io.grpc.internal.M
    public final void close() {
        if (this.f37670i) {
            return;
        }
        this.f37670i = true;
        V0 v0 = this.f37664c;
        if (v0 != null && v0.e() == 0 && this.f37664c != null) {
            this.f37664c = null;
        }
        V0 v10 = this.f37664c;
        this.f37664c = null;
        this.f37662a.o(v10, true, true, this.j);
        this.j = 0;
    }

    @Override // io.grpc.internal.M
    public final void d(int i10) {
        A8.p.p("max size already set", this.f37663b == -1);
        this.f37663b = i10;
    }

    public final int e(InputStream inputStream) throws IOException {
        a aVar = new a();
        OutputStream outputStreamB = this.f37665d.b(aVar);
        try {
            int iG = g(inputStream, outputStreamB);
            outputStreamB.close();
            int i10 = this.f37663b;
            if (i10 < 0 || iG <= i10) {
                c(aVar, true);
                return iG;
            }
            Status status = Status.j;
            Locale locale = Locale.US;
            throw status.h("message too large " + iG + " > " + i10).a();
        } catch (Throwable th) {
            outputStreamB.close();
            throw th;
        }
    }

    public final void f(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            V0 v0 = this.f37664c;
            if (v0 != null && v0.c() == 0) {
                V0 v10 = this.f37664c;
                this.f37664c = null;
                this.f37662a.o(v10, false, false, this.j);
                this.j = 0;
            }
            if (this.f37664c == null) {
                this.f37664c = this.f37668g.e(i11);
            }
            int iMin = Math.min(i11, this.f37664c.c());
            this.f37664c.a(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    @Override // io.grpc.internal.M
    public final void flush() {
        V0 v0 = this.f37664c;
        if (v0 == null || v0.e() <= 0) {
            return;
        }
        V0 v10 = this.f37664c;
        this.f37664c = null;
        this.f37662a.o(v10, false, true, this.j);
        this.j = 0;
    }

    public final int h(InputStream inputStream, int i10) throws IOException {
        if (i10 == -1) {
            a aVar = new a();
            int iG = g(inputStream, aVar);
            int i11 = this.f37663b;
            if (i11 < 0 || iG <= i11) {
                c(aVar, false);
                return iG;
            }
            Status status = Status.j;
            Locale locale = Locale.US;
            throw status.h("message too large " + iG + " > " + i11).a();
        }
        this.f37672l = i10;
        int i12 = this.f37663b;
        if (i12 >= 0 && i10 > i12) {
            Status status2 = Status.j;
            Locale locale2 = Locale.US;
            throw status2.h("message too large " + i10 + " > " + i12).a();
        }
        ByteBuffer byteBuffer = this.f37667f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i10);
        if (this.f37664c == null) {
            this.f37664c = this.f37668g.e(byteBuffer.position() + i10);
        }
        f(byteBuffer.array(), 0, byteBuffer.position());
        return g(inputStream, this.f37666e);
    }

    @Override // io.grpc.internal.M
    public final boolean isClosed() {
        return this.f37670i;
    }

    /* JADX INFO: renamed from: io.grpc.internal.q0$a */
    /* JADX INFO: compiled from: MessageFramer.java */
    public final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f37673b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V0 f37674c;

        public a() {
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            V0 v0 = this.f37674c;
            if (v0 == null || v0.c() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f37674c.b((byte) i10);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            V0 v0 = this.f37674c;
            ArrayList arrayList = this.f37673b;
            C2241q0 c2241q0 = C2241q0.this;
            if (v0 == null) {
                E9.h hVarE = c2241q0.f37668g.e(i11);
                this.f37674c = hVarE;
                arrayList.add(hVarE);
            }
            while (i11 > 0) {
                int iMin = Math.min(i11, this.f37674c.c());
                if (iMin == 0) {
                    E9.h hVarE2 = c2241q0.f37668g.e(Math.max(i11, this.f37674c.e() * 2));
                    this.f37674c = hVarE2;
                    arrayList.add(hVarE2);
                } else {
                    this.f37674c.a(bArr, i10, iMin);
                    i10 += iMin;
                    i11 -= iMin;
                }
            }
        }
    }
}
