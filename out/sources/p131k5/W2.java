package p131k5;

import A8.p;
import android.util.Log;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.measurement.internal.h;
import java.util.ArrayList;
import java.util.concurrent.Future;
import kotlin.b;
import kotlin.coroutines.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class W2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42036d;

    public /* synthetic */ W2(Object obj, int i10, Object obj2) {
        this.f42034b = i10;
        this.f42035c = obj;
        this.f42036d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj = this.f42036d;
        Object obj2 = this.f42035c;
        switch (this.f42034b) {
            case 0:
                h hVar = (h) obj2;
                hVar.Y();
                hVar.i().p();
                if (hVar.f26613p == null) {
                    hVar.f26613p = new ArrayList();
                }
                hVar.f26613p.add((Runnable) obj);
                hVar.a0();
                break;
            case 1:
                p.y((c) obj2).resumeWith(b.a((Throwable) obj));
                break;
            default:
                Future future = (Future) obj2;
                if (!future.isDone() && !future.isCancelled()) {
                    future.cancel(true);
                    int i10 = C2018x.f26297a;
                    Log.isLoggable("BillingClient", 5);
                    Runnable runnable = (Runnable) obj;
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
                }
                break;
        }
    }
}
