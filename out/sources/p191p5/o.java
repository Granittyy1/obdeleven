package p191p5;

import java.util.concurrent.Executor;
import p131k5.RunnableC2545o;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class o<TResult, TContinuationResult> implements e<TContinuationResult>, d, InterfaceC2756b, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2755a f45829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f45830d;

    public o(Executor executor, InterfaceC2755a interfaceC2755a, B b10) {
        this.f45828b = executor;
        this.f45829c = interfaceC2755a;
        this.f45830d = b10;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        this.f45828b.execute(new RunnableC2545o(this, 2, gVar));
    }

    @Override // p191p5.InterfaceC2756b
    public final void b() {
        this.f45830d.u();
    }

    @Override // p191p5.d
    public final void d(Exception exc) {
        this.f45830d.s(exc);
    }

    @Override // p191p5.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f45830d.t(tcontinuationresult);
    }

    @Override // p191p5.w
    public final void y() {
        throw new UnsupportedOperationException();
    }
}
