package T4;

import android.content.Intent;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.C2018x;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements p063f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5887b;

    @Override // p063f.b
    public void b(Object obj) {
        p063f.a aVar = (p063f.a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f5887b;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f34887c;
        int i10 = C2018x.e(intent, "ProxyBillingActivityV2").f23552a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f23546e;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        if (aVar.f34886b != -1 || i10 != 0) {
            Log.isLoggable("ProxyBillingActivityV2", 5);
        }
        proxyBillingActivityV2.finish();
    }

    public S() {
        this.f5887b = new LinkedHashMap((int) ((8 / 0.75f) + 1.0f));
    }
}
