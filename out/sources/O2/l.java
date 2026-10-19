package O2;

import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: StorageNotLowTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends e<Boolean> {
    @Override // O2.h
    public final Object a() {
        Intent intentRegisterReceiver = this.f4780b.registerReceiver(null, e());
        boolean z10 = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z10 = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // O2.e
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // O2.e
    public final void f(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.k kVarC = androidx.work.k.c();
        int i10 = m.f4789a;
        intent.getAction();
        kVarC.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    b(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                b(Boolean.TRUE);
            }
        }
    }
}
