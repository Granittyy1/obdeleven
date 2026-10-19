package p237t3;

import A0.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f47257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f47258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f47259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47260d;

    public y(B b10, int i10, a aVar, Runnable runnable) {
        this.f47260d = i10;
        this.f47257a = aVar;
        this.f47258b = runnable;
        Objects.requireNonNull(b10);
        this.f47259c = b10;
    }

    public final void a(Throwable th) {
        boolean z10 = th instanceof TimeoutException;
        B b10 = this.f47259c;
        if (z10) {
            b10.F(28, b.f23572p, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            C2018x.i("BillingClientTesting");
        } else {
            b10.F(28, b.f23572p, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            C2018x.i("BillingClientTesting");
        }
        this.f47258b.run();
    }
}
