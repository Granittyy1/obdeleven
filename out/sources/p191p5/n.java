package p191p5;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2755a f45826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f45827d;

    public n(Executor executor, InterfaceC2755a interfaceC2755a, B b10) {
        this.f45825b = executor;
        this.f45826c = interfaceC2755a;
        this.f45827d = b10;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        this.f45825b.execute(new m(this, gVar));
    }

    @Override // p191p5.w
    public final void y() {
        throw new UnsupportedOperationException();
    }
}
