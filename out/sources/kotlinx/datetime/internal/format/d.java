package kotlinx.datetime.internal.format;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Builder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements p063f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43882b;

    public void a(n nVar) {
        boolean z10 = nVar instanceof p;
        ArrayList arrayList = (ArrayList) this.f43882b;
        if (z10) {
            arrayList.add(nVar);
        } else if (nVar instanceof h) {
            Iterator it = ((h) nVar).f43888a.iterator();
            while (it.hasNext()) {
                arrayList.add((p) it.next());
            }
        }
    }

    @Override // p063f.b
    public void b(Object obj) {
        p063f.a aVar = (p063f.a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f43882b;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f34887c;
        Bundle extras = intent == null ? null : intent.getExtras();
        int i10 = aVar.f34886b;
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            int i11 = C2018x.f26297a;
            Log.isLoggable("ProxyBillingActivityV2", 5);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.ERROR_IN_ACTIVITY_RESULT.a());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i12 = C2018x.e(intent, "ProxyBillingActivityV2").f23552a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f23548g;
        if (resultReceiver != null) {
            resultReceiver.send(i12, extras);
        } else {
            Log.isLoggable("ProxyBillingActivityV2", 5);
        }
        if (i12 != 0) {
            Log.isLoggable("ProxyBillingActivityV2", 5);
        }
        proxyBillingActivityV2.finish();
    }

    public d() {
        this.f43882b = new ArrayList();
    }
}
