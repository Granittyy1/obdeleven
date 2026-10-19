package p191p5;

import I4.r;
import com.voltasit.obdeleven.data.providers.PlayIntegrityProvider;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g<TResult> {
    public void a(Executor executor, InterfaceC2756b interfaceC2756b) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void b(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void c(c cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract B d(Executor executor, d dVar);

    public abstract B e(PlayIntegrityProvider.c cVar);

    public abstract B f(Executor executor, e eVar);

    public <TContinuationResult> g<TContinuationResult> g(Executor executor, InterfaceC2755a<TResult, TContinuationResult> interfaceC2755a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public void h(r rVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> i(Executor executor, InterfaceC2755a<TResult, g<TContinuationResult>> interfaceC2755a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract Object l() throws Throwable;

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public <TContinuationResult> g<TContinuationResult> p(Executor executor, f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> q(f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
