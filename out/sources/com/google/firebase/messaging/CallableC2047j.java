package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.utils.HistoryUtils;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.firebase.messaging.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC2047j implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28377d;

    public /* synthetic */ CallableC2047j(Object obj, int i10, Object obj2) {
        this.f28375b = i10;
        this.f28376c = obj;
        this.f28377d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        switch (this.f28375b) {
            case 0:
                Context context = (Context) this.f28376c;
                Intent intent = (Intent) this.f28377d;
                I iA = I.a();
                iA.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                iA.f28284d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (iA) {
                    try {
                        str = iA.f28281a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    iA.f28281a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    iA.f28281a = serviceInfo.name;
                                }
                                str = iA.f28281a;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if ((iA.c(context) ? S.c(context, intent2) : context.startService(intent2)) == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 1:
                HistoryUtils.UDSDataType uDSDataType = HistoryUtils.UDSDataType.f34227b;
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f28376c;
                ControlUnit controlUnit = hVar.f31925q;
                return HistoryUtils.c(uDSDataType, controlUnit.f29321c.f42726c, controlUnit, hVar.f31930v.getCOMPUCONST().getVT().getValue(), hVar.f31930v.getCOMPUCONST().getVT().getTI(), (HashMap) this.f28377d);
            default:
                H2.b bVar = (H2.b) this.f28376c;
                CountDownLatch countDownLatch = (CountDownLatch) bVar.f3627c;
                try {
                    bVar.f3626b = ((Z3.m) this.f28377d).call();
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
        }
    }
}
