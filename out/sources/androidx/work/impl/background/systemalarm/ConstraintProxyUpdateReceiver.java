package androidx.work.impl.background.systemalarm;

import K2.K;
import R2.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.k;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20373a = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f20374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f20375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f20376d;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f20374b = intent;
            this.f20375c = context;
            this.f20376d = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f20376d;
            Context context = this.f20375c;
            Intent intent = this.f20374b;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                k kVarC = k.c();
                int i10 = ConstraintProxyUpdateReceiver.f20373a;
                kVarC.getClass();
                q.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                q.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                q.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                q.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    static {
        k.d("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            K.b(context).f4147d.d(new a(intent, context, goAsync()));
        } else {
            k.c().getClass();
        }
    }
}
