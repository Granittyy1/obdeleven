package io.grpc.internal;

import io.grpc.Status;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageDeframer implements Closeable, InterfaceC2247u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f37397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0 f37399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U0 f37400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D9.k f37401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f37402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public State f37404i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f37406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f37407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f37408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f37410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f37412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f37413s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f37414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f37415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ State[] f37416d;

        static {
            State state = new State("HEADER", 0);
            f37414b = state;
            State state2 = new State("BODY", 1);
            f37415c = state2;
            f37416d = new State[]{state, state2};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f37416d.clone();
        }
    }

    public interface a {
        void a(Q0.a aVar);

        void c(boolean z10);

        void d(int i10);
    }

    public static class b implements Q0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InputStream f37417a;

        @Override // io.grpc.internal.Q0.a
        public final InputStream next() {
            InputStream inputStream = this.f37417a;
            this.f37417a = null;
            return inputStream;
        }
    }

    public MessageDeframer(AbstractC2216e.a aVar, int i10, O0 o10, U0 u10) {
        D9.e.b bVar = D9.e.b.f2879a;
        this.f37404i = State.f37414b;
        this.j = 5;
        this.f37407m = new r();
        this.f37409o = false;
        this.f37410p = -1;
        this.f37412r = false;
        this.f37413s = false;
        this.f37397b = aVar;
        this.f37401f = bVar;
        this.f37398c = i10;
        this.f37399d = o10;
        A8.p.j(u10, "transportTracer");
        this.f37400e = u10;
    }

    @Override // io.grpc.internal.InterfaceC2247u
    public final void b() {
        if (isClosed()) {
            return;
        }
        if (this.f37407m.f37683d == 0) {
            close();
        } else {
            this.f37412r = true;
        }
    }

    @Override // io.grpc.internal.InterfaceC2247u
    public final void c(int i10) {
        this.f37398c = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.InterfaceC2247u
    public final void close() {
        if (isClosed()) {
            return;
        }
        r rVar = this.f37406l;
        boolean z10 = false;
        if (rVar != null && rVar.f37683d > 0) {
            z10 = true;
        }
        try {
            r rVar2 = this.f37407m;
            if (rVar2 != null) {
                rVar2.close();
            }
            r rVar3 = this.f37406l;
            if (rVar3 != null) {
                rVar3.close();
            }
            this.f37407m = null;
            this.f37406l = null;
            this.f37397b.c(z10);
        } catch (Throwable th) {
            this.f37407m = null;
            this.f37406l = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC2247u
    public final void h(D9.k kVar) {
        A8.p.p("Already set full stream decompressor", true);
        this.f37401f = kVar;
    }

    @Override // io.grpc.internal.InterfaceC2247u
    public final void i(E9.f fVar) throws Throwable {
        boolean z10;
        Throwable th;
        try {
            if (!isClosed() && !this.f37412r) {
                z10 = false;
                this.f37407m.c(fVar);
                try {
                    j();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (z10) {
                        fVar.close();
                    }
                    throw th;
                }
            }
            fVar.close();
        } catch (Throwable th3) {
            z10 = true;
            th = th3;
        }
    }

    public final boolean isClosed() {
        return this.f37407m == null;
    }

    public final void j() {
        if (this.f37409o) {
            return;
        }
        boolean z10 = true;
        this.f37409o = true;
        while (!this.f37413s && this.f37408n > 0 && s()) {
            try {
                int iOrdinal = this.f37404i.ordinal();
                if (iOrdinal == 0) {
                    p();
                } else {
                    if (iOrdinal != 1) {
                        throw new AssertionError("Invalid state: " + this.f37404i);
                    }
                    k();
                    this.f37408n--;
                }
            } catch (Throwable th) {
                this.f37409o = false;
                throw th;
            }
        }
        if (this.f37413s) {
            close();
            this.f37409o = false;
            return;
        }
        if (this.f37412r) {
            if (this.f37407m.f37683d != 0) {
                z10 = false;
            }
            if (z10) {
                close();
            }
        }
        this.f37409o = false;
    }

    public final void k() {
        InputStream cVar;
        int i10 = this.f37410p;
        long j = this.f37411q;
        O0 o10 = this.f37399d;
        for (C.g gVar : o10.f37429a) {
            gVar.V(i10, j);
        }
        this.f37411q = 0;
        if (this.f37405k) {
            D9.k kVar = this.f37401f;
            if (kVar == D9.e.b.f2879a) {
                throw Status.f36904k.h("Can't decode compressed gRPC message as compression not configured").a();
            }
            try {
                r rVar = this.f37406l;
                y0.b bVar = y0.f37743a;
                y0.a aVar = new y0.a();
                A8.p.j(rVar, "buffer");
                aVar.f37744b = rVar;
                cVar = new c(kVar.c(aVar), this.f37398c, o10);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            long j10 = this.f37406l.f37683d;
            for (C.g gVar2 : o10.f37429a) {
                gVar2.W(j10);
            }
            r rVar2 = this.f37406l;
            y0.b bVar2 = y0.f37743a;
            y0.a aVar2 = new y0.a();
            A8.p.j(rVar2, "buffer");
            aVar2.f37744b = rVar2;
            cVar = aVar2;
        }
        this.f37406l = null;
        a aVar3 = this.f37397b;
        b bVar3 = new b();
        bVar3.f37417a = cVar;
        aVar3.a(bVar3);
        this.f37404i = State.f37414b;
        this.j = 5;
    }

    public final void p() {
        int unsignedByte = this.f37406l.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw Status.f36904k.h("gRPC frame header malformed: reserved bits not zero").a();
        }
        this.f37405k = (unsignedByte & 1) != 0;
        r rVar = this.f37406l;
        rVar.b(4);
        int unsignedByte2 = rVar.readUnsignedByte() | (rVar.readUnsignedByte() << 24) | (rVar.readUnsignedByte() << 16) | (rVar.readUnsignedByte() << 8);
        this.j = unsignedByte2;
        if (unsignedByte2 < 0 || unsignedByte2 > this.f37398c) {
            Status status = Status.j;
            Locale locale = Locale.US;
            throw status.h("gRPC message exceeds maximum size " + this.f37398c + ": " + unsignedByte2).a();
        }
        int i10 = this.f37410p + 1;
        this.f37410p = i10;
        for (C.g gVar : this.f37399d.f37429a) {
            gVar.U(i10);
        }
        U0 u10 = this.f37400e;
        u10.f37489b.a();
        u10.f37488a.a();
        this.f37404i = State.f37415c;
    }

    @Override // io.grpc.internal.InterfaceC2247u
    public final void request() {
        if (isClosed()) {
            return;
        }
        this.f37408n += (long) 2;
        j();
    }

    public final boolean s() throws Throwable {
        State state = State.f37415c;
        O0 o10 = this.f37399d;
        int i10 = 0;
        try {
            if (this.f37406l == null) {
                this.f37406l = new r();
            }
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.j - this.f37406l.f37683d;
                    if (i12 <= 0) {
                        if (i11 <= 0) {
                            return true;
                        }
                        this.f37397b.d(i11);
                        if (this.f37404i != state) {
                            return true;
                        }
                        o10.a(i11);
                        this.f37411q += i11;
                        return true;
                    }
                    int i13 = this.f37407m.f37683d;
                    if (i13 == 0) {
                        if (i11 > 0) {
                            this.f37397b.d(i11);
                            if (this.f37404i == state) {
                                o10.a(i11);
                                this.f37411q += i11;
                            }
                        }
                        return false;
                    }
                    int iMin = Math.min(i12, i13);
                    i11 += iMin;
                    this.f37406l.c(this.f37407m.w(iMin));
                } catch (Throwable th) {
                    int i14 = i11;
                    th = th;
                    i10 = i14;
                    if (i10 > 0) {
                        this.f37397b.d(i10);
                        if (this.f37404i == state) {
                            o10.a(i10);
                            this.f37411q += i10;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final class c extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final O0 f37419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f37420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f37421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f37422f;

        public c(InputStream inputStream, int i10, O0 o10) {
            super(inputStream);
            this.f37422f = -1L;
            this.f37418b = i10;
            this.f37419c = o10;
        }

        public final void b() {
            long j = this.f37421e;
            long j10 = this.f37420d;
            if (j > j10) {
                long j11 = j - j10;
                for (C.g gVar : this.f37419c.f37429a) {
                    gVar.W(j11);
                }
                this.f37420d = this.f37421e;
            }
        }

        public final void c() {
            long j = this.f37421e;
            int i10 = this.f37418b;
            if (j <= i10) {
                return;
            }
            throw Status.j.h("Decompressed gRPC message exceeds maximum size " + i10).a();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f37422f = this.f37421e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f37421e++;
            }
            c();
            b();
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f37422f == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f37421e = this.f37422f;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j);
            this.f37421e += jSkip;
            c();
            b();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f37421e += (long) i12;
            }
            c();
            b();
            return i12;
        }
    }
}
