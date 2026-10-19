package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.B;
import okhttp3.InterfaceC2754e;
import p318zb.C;
import p318zb.C2839f;
import p318zb.I;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: OkHttpCall.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f46709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f46711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2754e.a f46712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h<okhttp3.A, T> f46713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f46714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2754e f46715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f46716i;
    public boolean j;

    /* JADX INFO: compiled from: OkHttpCall.java */
    public class a implements okhttp3.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f46717b;

        public a(f fVar) {
            this.f46717b = fVar;
        }

        @Override // okhttp3.f
        public final void onFailure(InterfaceC2754e interfaceC2754e, IOException iOException) {
            try {
                this.f46717b.onFailure(m.this, iOException);
            } catch (Throwable th) {
                A.n(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.f
        public final void onResponse(InterfaceC2754e interfaceC2754e, okhttp3.z zVar) {
            f fVar = this.f46717b;
            m mVar = m.this;
            try {
                try {
                    fVar.onResponse(mVar, mVar.c(zVar));
                } catch (Throwable th) {
                    A.n(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                A.n(th2);
                try {
                    fVar.onFailure(mVar, th2);
                } catch (Throwable th3) {
                    A.n(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class b extends okhttp3.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final okhttp3.A f46719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C f46720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IOException f46721e;

        /* JADX INFO: compiled from: OkHttpCall.java */
        public class a extends p318zb.n {
            public a(InterfaceC2841h interfaceC2841h) {
                super(interfaceC2841h);
            }

            @Override // p318zb.n, p318zb.H
            public final long l0(C2839f c2839f, long j) throws IOException {
                try {
                    return super.l0(c2839f, j);
                } catch (IOException e10) {
                    b.this.f46721e = e10;
                    throw e10;
                }
            }
        }

        public b(okhttp3.A a10) {
            this.f46719c = a10;
            this.f46720d = p318zb.v.b(new a(a10.h()));
        }

        @Override // okhttp3.A
        public final long b() {
            return this.f46719c.b();
        }

        @Override // okhttp3.A
        public final okhttp3.r c() {
            return this.f46719c.c();
        }

        @Override // okhttp3.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f46719c.close();
        }

        @Override // okhttp3.A
        public final InterfaceC2841h h() {
            return this.f46720d;
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class c extends okhttp3.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final okhttp3.r f46723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f46724d;

        public c(okhttp3.r rVar, long j) {
            this.f46723c = rVar;
            this.f46724d = j;
        }

        @Override // okhttp3.A
        public final long b() {
            return this.f46724d;
        }

        @Override // okhttp3.A
        public final okhttp3.r c() {
            return this.f46723c;
        }

        @Override // okhttp3.A
        public final InterfaceC2841h h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public m(u uVar, Object obj, Object[] objArr, InterfaceC2754e.a aVar, h<okhttp3.A, T> hVar) {
        this.f46709b = uVar;
        this.f46710c = obj;
        this.f46711d = objArr;
        this.f46712e = aVar;
        this.f46713f = hVar;
    }

    public final InterfaceC2754e a() throws IOException {
        okhttp3.p pVarA;
        u uVar = this.f46709b;
        uVar.getClass();
        Object[] objArr = this.f46711d;
        int length = objArr.length;
        q<?>[] qVarArr = uVar.f46795k;
        if (length != qVarArr.length) {
            throw new IllegalArgumentException(p005a4.q.c(A8.f.e(length, "Argument count (", ") doesn't match expected count ("), qVarArr.length, ")"));
        }
        t tVar = new t(uVar.f46789d, uVar.f46788c, uVar.f46790e, uVar.f46791f, uVar.f46792g, uVar.f46793h, uVar.f46794i, uVar.j);
        if (uVar.f46796l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            qVarArr[i10].a(tVar, objArr[i10]);
        }
        okhttp3.p.a aVar = tVar.f46777d;
        if (aVar != null) {
            pVarA = aVar.a();
        } else {
            String link = tVar.f46776c;
            okhttp3.p pVar = tVar.f46775b;
            pVar.getClass();
            kotlin.jvm.internal.i.e(link, "link");
            okhttp3.p.a aVarG = pVar.g(link);
            pVarA = aVarG != null ? aVarG.a() : null;
            if (pVarA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + pVar + ", Relative: " + tVar.f46776c);
            }
        }
        okhttp3.y aVar2 = tVar.f46783k;
        if (aVar2 == null) {
            okhttp3.n.a aVar3 = tVar.j;
            if (aVar3 != null) {
                aVar2 = new okhttp3.n(aVar3.f45566b, aVar3.f45567c);
            } else {
                okhttp3.s.a aVar4 = tVar.f46782i;
                if (aVar4 != null) {
                    ArrayList arrayList2 = aVar4.f45604c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    aVar2 = new okhttp3.s(aVar4.f45602a, aVar4.f45603b, p172nb.b.x(arrayList2));
                } else if (tVar.f46781h) {
                    aVar2 = okhttp3.y.create((okhttp3.r) null, new byte[0]);
                }
            }
        }
        okhttp3.r rVar = tVar.f46780g;
        okhttp3.o.a aVar5 = tVar.f46779f;
        if (rVar != null) {
            if (aVar2 != null) {
                aVar2 = new t.a(aVar2, rVar);
            } else {
                aVar5.a("Content-Type", rVar.f45590a);
            }
        }
        okhttp3.u.a aVar6 = tVar.f46778e;
        aVar6.getClass();
        aVar6.f45667a = pVarA;
        aVar6.d(aVar5.e());
        aVar6.e(tVar.f46774a, aVar2);
        aVar6.f(l.class, new l(uVar.f46786a, this.f46710c, uVar.f46787b, arrayList));
        return this.f46712e.a(aVar6.a());
    }

    public final InterfaceC2754e b() throws IOException {
        InterfaceC2754e interfaceC2754e = this.f46715h;
        if (interfaceC2754e != null) {
            return interfaceC2754e;
        }
        Throwable th = this.f46716i;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC2754e interfaceC2754eA = a();
            this.f46715h = interfaceC2754eA;
            return interfaceC2754eA;
        } catch (IOException | Error | RuntimeException e10) {
            A.n(e10);
            this.f46716i = e10;
            throw e10;
        }
    }

    public final v<T> c(okhttp3.z zVar) throws IOException {
        okhttp3.z.a aVarI = zVar.i();
        okhttp3.A a10 = zVar.f45686h;
        aVarI.f45699g = new c(a10.c(), a10.b());
        okhttp3.z zVarA = aVarI.a();
        int i10 = zVarA.f45683e;
        if (i10 < 200 || i10 >= 300) {
            try {
                C2839f c2839f = new C2839f();
                a10.h().o(c2839f);
                B b10 = new B(a10.c(), a10.b(), c2839f);
                if (zVarA.h()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                v<T> vVar = new v<>(zVarA, null, b10);
                a10.close();
                return vVar;
            } catch (Throwable th) {
                a10.close();
                throw th;
            }
        }
        if (i10 == 204 || i10 == 205) {
            a10.close();
            return v.b(null, zVarA);
        }
        b bVar = new b(a10);
        try {
            return v.b(this.f46713f.b(bVar), zVarA);
        } catch (RuntimeException e10) {
            IOException iOException = bVar.f46721e;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.d
    public final void cancel() {
        InterfaceC2754e interfaceC2754e;
        this.f46714g = true;
        synchronized (this) {
            interfaceC2754e = this.f46715h;
        }
        if (interfaceC2754e != null) {
            interfaceC2754e.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new m(this.f46709b, this.f46710c, this.f46711d, this.f46712e, this.f46713f);
    }

    @Override // retrofit2.d
    public final void enqueue(f<T> fVar) {
        InterfaceC2754e interfaceC2754e;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.j) {
                    throw new IllegalStateException("Already executed.");
                }
                this.j = true;
                interfaceC2754e = this.f46715h;
                th = this.f46716i;
                if (interfaceC2754e == null && th == null) {
                    try {
                        InterfaceC2754e interfaceC2754eA = a();
                        this.f46715h = interfaceC2754eA;
                        interfaceC2754e = interfaceC2754eA;
                    } catch (Throwable th2) {
                        th = th2;
                        A.n(th);
                        this.f46716i = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            fVar.onFailure(this, th);
            return;
        }
        if (this.f46714g) {
            interfaceC2754e.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(interfaceC2754e, new a(fVar));
    }

    @Override // retrofit2.d
    public final boolean isCanceled() {
        boolean z10 = true;
        if (this.f46714g) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC2754e interfaceC2754e = this.f46715h;
                if (interfaceC2754e == null || !interfaceC2754e.isCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // retrofit2.d
    public final synchronized boolean isExecuted() {
        return this.j;
    }

    @Override // retrofit2.d
    public final synchronized okhttp3.u request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().request();
    }

    @Override // retrofit2.d
    public final synchronized I timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return b().timeout();
    }

    @Override // retrofit2.d
    /* JADX INFO: renamed from: clone */
    public final d m58clone() {
        return new m(this.f46709b, this.f46710c, this.f46711d, this.f46712e, this.f46713f);
    }
}
