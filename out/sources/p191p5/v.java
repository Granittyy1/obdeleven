package p191p5;

import java.util.concurrent.Executor;
import p131k5.RunnableC2494c2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class v<TResult, TContinuationResult> implements e<TContinuationResult>, d, InterfaceC2756b, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f45848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f45849d;

    public v(Executor executor, f fVar, B b10) {
        this.f45847b = executor;
        this.f45848c = fVar;
        this.f45849d = b10;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        this.f45847b.execute(new RunnableC2494c2(this, 1, gVar));
    }

    @Override // p191p5.InterfaceC2756b
    public final void b() {
        this.f45849d.u();
    }

    @Override // p191p5.d
    public final void d(Exception exc) {
        this.f45849d.s(exc);
    }

    @Override // p191p5.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f45849d.t(tcontinuationresult);
    }

    @Override // p191p5.w
    public final void y() {
        throw new UnsupportedOperationException();
    }
}
