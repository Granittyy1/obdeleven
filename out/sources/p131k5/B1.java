package p131k5;

import com.google.android.gms.measurement.internal.h;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B1 implements Callable<List<w3>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f41721c;

    public B1(BinderC2535l1 binderC2535l1, String str) {
        this.f41720b = str;
        this.f41721c = binderC2535l1;
    }

    @Override // java.util.concurrent.Callable
    public final List<w3> call() throws Exception {
        h hVar = this.f41721c.f42293c;
        hVar.Y();
        C2529k c2529k = hVar.f26601c;
        h.y(c2529k);
        return c2529k.l0(this.f41720b);
    }
}
