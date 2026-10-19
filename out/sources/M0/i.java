package M0;

import android.view.Choreographer;

/* JADX INFO: compiled from: ViewDataBinding.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4504b;

    public i(h hVar) {
        this.f4504b = hVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4504b.f4485a.run();
    }
}
