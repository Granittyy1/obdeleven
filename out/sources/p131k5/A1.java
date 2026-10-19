package p131k5;

import com.google.android.gms.measurement.internal.h;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A1 implements Callable<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f41597b;

    public A1(BinderC2535l1 binderC2535l1, C2588z c2588z, String str) {
        this.f41597b = binderC2535l1;
    }

    @Override // java.util.concurrent.Callable
    public final byte[] call() throws Exception {
        BinderC2535l1 binderC2535l1 = this.f41597b;
        binderC2535l1.f42293c.Y();
        C2552p2 c2552p2 = binderC2535l1.f42293c.f26606h;
        h.y(c2552p2);
        c2552p2.p();
        ((C2523i1) c2552p2.f3968a).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
