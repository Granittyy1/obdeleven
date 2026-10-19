package p191p5;

import I4.r;
import U4.C0804l;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.voltasit.obdeleven.data.providers.PlayIntegrityProvider;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class B<TResult> extends g<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45805a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f45806b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f45808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f45809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f45810f;

    @Override // p191p5.g
    public final void a(Executor executor, InterfaceC2756b interfaceC2756b) {
        this.f45806b.a(new p(executor, interfaceC2756b));
        w();
    }

    @Override // p191p5.g
    public final void b(Executor executor, c cVar) {
        this.f45806b.a(new r(executor, cVar));
        w();
    }

    @Override // p191p5.g
    public final void c(c cVar) {
        this.f45806b.a(new r(i.f45812a, cVar));
        w();
    }

    @Override // p191p5.g
    public final B d(Executor executor, d dVar) {
        this.f45806b.a(new t(executor, dVar));
        w();
        return this;
    }

    @Override // p191p5.g
    public final B e(PlayIntegrityProvider.c cVar) {
        f(i.f45812a, cVar);
        return this;
    }

    @Override // p191p5.g
    public final B f(Executor executor, e eVar) {
        this.f45806b.a(new u(executor, eVar));
        w();
        return this;
    }

    @Override // p191p5.g
    public final <TContinuationResult> g<TContinuationResult> g(Executor executor, InterfaceC2755a<TResult, TContinuationResult> interfaceC2755a) {
        B b10 = new B();
        this.f45806b.a(new n(executor, interfaceC2755a, b10));
        w();
        return b10;
    }

    @Override // p191p5.g
    public final void h(r rVar) {
        g(i.f45812a, rVar);
    }

    @Override // p191p5.g
    public final <TContinuationResult> g<TContinuationResult> i(Executor executor, InterfaceC2755a<TResult, g<TContinuationResult>> interfaceC2755a) {
        B b10 = new B();
        this.f45806b.a(new o(executor, interfaceC2755a, b10));
        w();
        return b10;
    }

    @Override // p191p5.g
    public final Exception j() {
        Exception exc;
        synchronized (this.f45805a) {
            exc = this.f45810f;
        }
        return exc;
    }

    @Override // p191p5.g
    public final TResult k() {
        TResult tresult;
        synchronized (this.f45805a) {
            try {
                C0804l.j("Task is not yet complete", this.f45807c);
                if (this.f45808d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f45810f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f45809e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // p191p5.g
    public final Object l() throws Throwable {
        Object obj;
        synchronized (this.f45805a) {
            try {
                C0804l.j("Task is not yet complete", this.f45807c);
                if (this.f45808d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (IOException.class.isInstance(this.f45810f)) {
                    throw ((Throwable) IOException.class.cast(this.f45810f));
                }
                Exception exc = this.f45810f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f45809e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // p191p5.g
    public final boolean m() {
        return this.f45808d;
    }

    @Override // p191p5.g
    public final boolean n() {
        boolean z10;
        synchronized (this.f45805a) {
            z10 = this.f45807c;
        }
        return z10;
    }

    @Override // p191p5.g
    public final boolean o() {
        boolean z10;
        synchronized (this.f45805a) {
            try {
                z10 = false;
                if (this.f45807c && !this.f45808d && this.f45810f == null) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // p191p5.g
    public final <TContinuationResult> g<TContinuationResult> p(Executor executor, f<TResult, TContinuationResult> fVar) {
        B b10 = new B();
        this.f45806b.a(new v(executor, fVar, b10));
        w();
        return b10;
    }

    @Override // p191p5.g
    public final <TContinuationResult> g<TContinuationResult> q(f<TResult, TContinuationResult> fVar) {
        z zVar = i.f45812a;
        B b10 = new B();
        this.f45806b.a(new v(zVar, fVar, b10));
        w();
        return b10;
    }

    public final B r(d dVar) {
        d(i.f45812a, dVar);
        return this;
    }

    public final void s(Exception exc) {
        C0804l.i(exc, "Exception must not be null");
        synchronized (this.f45805a) {
            v();
            this.f45807c = true;
            this.f45810f = exc;
        }
        this.f45806b.b(this);
    }

    public final void t(Object obj) {
        synchronized (this.f45805a) {
            v();
            this.f45807c = true;
            this.f45809e = obj;
        }
        this.f45806b.b(this);
    }

    public final void u() {
        synchronized (this.f45805a) {
            try {
                if (this.f45807c) {
                    return;
                }
                this.f45807c = true;
                this.f45808d = true;
                this.f45806b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        String strConcat;
        if (this.f45807c) {
            int i10 = DuplicateTaskCompletionException.f26657b;
            if (!n()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excJ = j();
            if (excJ != null) {
                strConcat = "failure";
            } else if (o()) {
                strConcat = "result ".concat(String.valueOf(k()));
            } else {
                strConcat = this.f45808d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void w() {
        synchronized (this.f45805a) {
            try {
                if (this.f45807c) {
                    this.f45806b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
