package p237t3;

import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.InterfaceC1974i;
import com.google.android.gms.internal.play_billing.w2;
import com.google.android.gms.internal.play_billing.zzie;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47256b;

    public /* synthetic */ x(B b10, int i10) {
        this.f47256b = b10;
        this.f47255a = i10;
    }

    public boolean a(int i10) {
        return ((1 << i10) & this.f47255a) != 0;
    }

    public void b(int i10, int i11) {
        int[] iArr = (int[]) this.f47256b;
        if (i10 >= iArr.length) {
            return;
        }
        this.f47255a = (1 << i10) | this.f47255a;
        iArr[i10] = i11;
    }

    public String c(w2 w2Var) {
        String str;
        B b10 = (B) this.f47256b;
        int i10 = this.f47255a;
        try {
            if (b10.f47132F == null) {
                throw null;
            }
            InterfaceC1974i interfaceC1974i = b10.f47132F;
            String packageName = b10.f47130D.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            interfaceC1974i.O(packageName, str, new z(w2Var));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception unused) {
            b10.F(28, b.f23572p, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            C2018x.i("BillingClientTesting");
            w2Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public x() {
        this.f47256b = new int[10];
    }
}
