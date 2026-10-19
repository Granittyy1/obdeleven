package p131k5;

import com.google.android.gms.measurement.internal.h;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: k5.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2562s1 implements Callable<List<w3>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42450e;

    public CallableC2562s1(BinderC2535l1 binderC2535l1, String str, String str2, String str3) {
        this.f42447b = str;
        this.f42448c = str2;
        this.f42449d = str3;
        this.f42450e = binderC2535l1;
    }

    @Override // java.util.concurrent.Callable
    public final List<w3> call() throws Exception {
        BinderC2535l1 binderC2535l1 = this.f42450e;
        binderC2535l1.f42293c.Y();
        C2529k c2529k = binderC2535l1.f42293c.f26601c;
        h.y(c2529k);
        return c2529k.a0(this.f42447b, this.f42448c, this.f42449d);
    }
}
