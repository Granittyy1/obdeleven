package p175o1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f45158b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f45158b.post(runnable);
    }
}
