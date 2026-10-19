package com.google.android.gms.measurement;

import N6.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import p131k5.B0;
import p131k5.C2523i1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends Y0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f26530c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f26530c == null) {
            this.f26530c = new d(this);
        }
        d dVar = this.f26530c;
        dVar.getClass();
        B0 b10 = C2523i1.c(context, null, null).f42220i;
        C2523i1.g(b10);
        if (intent == null) {
            b10.f41715i.c("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        b10.f41719n.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                b10.f41715i.c("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        b10.f41719n.c("Starting wakeful intent.");
        ((AppMeasurementReceiver) dVar.f4653b).getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = Y0.a.f7477a;
        synchronized (sparseArray) {
            try {
                int i10 = Y0.a.f7478b;
                int i11 = i10 + 1;
                Y0.a.f7478b = i11;
                if (i11 <= 0) {
                    Y0.a.f7478b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
