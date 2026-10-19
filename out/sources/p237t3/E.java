package p237t3;

import C4.v;
import C4.w;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.i2;
import p311z4.a;
import p311z4.g;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f47138b;

    public final void a(i2 i2Var) {
        if (this.f47137a) {
            int i10 = C2018x.f26297a;
            Log.isLoggable("BillingLogger", 5);
            return;
        }
        try {
            ((w) this.f47138b).a(new a(i2Var, Priority.f25231b, null), new v(0));
        } catch (Throwable unused) {
            int i11 = C2018x.f26297a;
            Log.isLoggable("BillingLogger", 5);
        }
    }
}
