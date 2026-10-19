package p068f4;

import Z3.q;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        i.e(name, "name");
        i.e(service, "service");
        e eVar = e.f34938a;
        HashMap<String, Method> map = j.f34977a;
        e.f34946i = j.e(q.a(), "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        i.e(name, "name");
    }
}
