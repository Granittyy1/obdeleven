package p131k5;

import com.google.android.gms.measurement.internal.h;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: k5.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2570u1 implements Callable<List<C2496d>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42477e;

    public CallableC2570u1(BinderC2535l1 binderC2535l1, String str, String str2, String str3) {
        this.f42474b = str;
        this.f42475c = str2;
        this.f42476d = str3;
        this.f42477e = binderC2535l1;
    }

    @Override // java.util.concurrent.Callable
    public final List<C2496d> call() throws Exception {
        BinderC2535l1 binderC2535l1 = this.f42477e;
        binderC2535l1.f42293c.Y();
        C2529k c2529k = binderC2535l1.f42293c.f26601c;
        h.y(c2529k);
        return c2529k.G(this.f42474b, this.f42475c, this.f42476d);
    }
}
