package p237t3;

import C.e;
import android.app.Activity;
import com.google.android.gms.internal.play_billing.C2018x;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2788a {

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class C0535a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile e f47156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f47157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile InterfaceC2794g f47158c;

        public /* synthetic */ C0535a(Activity activity) {
            this.f47157b = activity;
        }

        public final C2789b a() {
            Activity activity = this.f47157b;
            if (activity == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f47158c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f47156a == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            this.f47156a.getClass();
            if (this.f47158c == null) {
                e eVar = this.f47156a;
                return b() ? new B(eVar, activity, this) : new C2789b(eVar, activity, this);
            }
            e eVar2 = this.f47156a;
            InterfaceC2794g interfaceC2794g = this.f47158c;
            return b() ? new B(eVar2, activity, interfaceC2794g, this) : new C2789b(eVar2, activity, interfaceC2794g, this);
        }

        public final boolean b() {
            try {
                Activity activity = this.f47157b;
                return activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception unused) {
                C2018x.i("BillingClient");
                return false;
            }
        }
    }
}
