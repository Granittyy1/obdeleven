package com.facebook.appevents.ondeviceprocessing;

import I.b;
import Z3.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import p165n4.g;

/* JADX INFO: compiled from: RemoteServiceWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteServiceWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RemoteServiceWrapper f24959a = new RemoteServiceWrapper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f24960b;

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static EventType[] valuesCustom() {
            return (EventType[]) Arrays.copyOf(values(), 2);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.eventType;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    public static final class ServiceResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ServiceResult f24964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ServiceResult f24965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ServiceResult f24966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ServiceResult[] f24967e;

        static {
            ServiceResult serviceResult = new ServiceResult("OPERATION_SUCCESS", 0);
            f24964b = serviceResult;
            ServiceResult serviceResult2 = new ServiceResult("SERVICE_NOT_AVAILABLE", 1);
            f24965c = serviceResult2;
            ServiceResult serviceResult3 = new ServiceResult("SERVICE_ERROR", 2);
            f24966d = serviceResult3;
            f24967e = new ServiceResult[]{serviceResult, serviceResult2, serviceResult3};
        }

        public ServiceResult() {
            throw null;
        }

        public static ServiceResult valueOf(String value) {
            i.e(value, "value");
            return (ServiceResult) Enum.valueOf(ServiceResult.class, value);
        }

        public static ServiceResult[] values() {
            return (ServiceResult[]) Arrays.copyOf(f24967e, 3);
        }
    }

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f24968b = new CountDownLatch(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IBinder f24969c;

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName name) {
            i.e(name, "name");
            this.f24968b.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            i.e(name, "name");
            i.e(serviceBinder, "serviceBinder");
            this.f24969c = serviceBinder;
            this.f24968b.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            i.e(name, "name");
        }
    }

    public static Intent a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        Intent intent = new Intent("ReceiverService");
        intent.setPackage("com.facebook.katana");
        if (packageManager.resolveService(intent, 0) != null && g.a(context, "com.facebook.katana")) {
            return intent;
        }
        Intent intent2 = new Intent("ReceiverService");
        intent2.setPackage("com.facebook.wakizashi");
        if (packageManager.resolveService(intent2, 0) == null || !g.a(context, "com.facebook.wakizashi")) {
            return null;
        }
        return intent2;
    }

    public static ServiceResult b(EventType eventType, String str, List list) {
        ServiceResult serviceResult = ServiceResult.f24965c;
        Context contextA = q.a();
        Intent intentA = a(contextA);
        if (intentA == null) {
            return serviceResult;
        }
        a aVar = new a();
        boolean zBindService = contextA.bindService(intentA, aVar, 1);
        ServiceResult serviceResult2 = ServiceResult.f24966d;
        try {
            if (zBindService) {
                try {
                    aVar.f24968b.await(5L, TimeUnit.SECONDS);
                    IBinder iBinder = aVar.f24969c;
                    if (iBinder != null) {
                        p274w4.a aVarE = p274w4.a.AbstractBinderC0546a.e(iBinder);
                        Bundle bundleB = b.b(eventType, str, list);
                        if (bundleB != null) {
                            aVarE.h(bundleB);
                            i.k(bundleB, "Successfully sent events to the remote service: ");
                        }
                        serviceResult = ServiceResult.f24964b;
                    }
                    contextA.unbindService(aVar);
                    return serviceResult;
                } catch (RemoteException unused) {
                    q qVar = q.f7852a;
                    contextA.unbindService(aVar);
                    return serviceResult2;
                } catch (InterruptedException unused2) {
                    q qVar2 = q.f7852a;
                    contextA.unbindService(aVar);
                    return serviceResult2;
                }
            }
            return serviceResult2;
        } catch (Throwable th) {
            contextA.unbindService(aVar);
            q qVar3 = q.f7852a;
            throw th;
        }
    }
}
