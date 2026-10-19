package O2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4778d;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f4776b = i10;
        this.f4777c = obj;
        this.f4778d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4776b) {
            case 0:
                List listenersList = (List) this.f4777c;
                kotlin.jvm.internal.i.e(listenersList, "$listenersList");
                h this$0 = (h) this.f4778d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Iterator it = listenersList.iterator();
                while (it.hasNext()) {
                    ((androidx.work.impl.constraints.a) it.next()).a(this$0.f4783e);
                }
                break;
            default:
                Context context = (Context) this.f4777c;
                p005a4.n nVar = (p005a4.n) this.f4778d;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = i10 + 1;
                    String str = strArr[i10];
                    String str2 = strArr2[i10];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i11 |= 1 << i10;
                    } catch (ClassNotFoundException unused) {
                    }
                    if (i12 > 10) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                            sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                            nVar.a("fb_sdk_initialize", null, bundle, true, p093h4.e.b());
                        }
                    } else {
                        i10 = i12;
                    }
                    break;
                }
                break;
        }
    }
}
