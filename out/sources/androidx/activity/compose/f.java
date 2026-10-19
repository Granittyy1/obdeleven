package androidx.activity.compose;

import Ia.p;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedChannel f8218b = kotlinx.coroutines.channels.g.a(-2, 4, BufferOverflow.f43243b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f8219c;

    public f(A a10, boolean z10, p pVar, g gVar) {
        this.f8217a = z10;
        this.f8219c = C2680e.c(a10, null, null, new OnBackInstance$job$1(gVar, pVar, this, null), 3);
    }

    public final void a() {
        this.f8218b.p(new CancellationException("onBack cancelled"));
        this.f8219c.i(null);
    }
}
