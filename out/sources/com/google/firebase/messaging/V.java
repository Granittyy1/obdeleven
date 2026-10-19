package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WithinAppServiceConnection.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f28337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f28339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public T f28340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28341g;

    /* JADX INFO: compiled from: WithinAppServiceConnection.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f28342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p191p5.h<Void> f28343b = new p191p5.h<>();

        public a(Intent intent) {
            this.f28342a = intent;
        }
    }

    public V(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f28339e = new ArrayDeque();
        this.f28341g = false;
        Context applicationContext = context.getApplicationContext();
        this.f28336b = applicationContext;
        this.f28337c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f28338d = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f28339e.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                T t8 = this.f28340f;
                if (t8 == null || !t8.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f28341g) {
                        this.f28341g = true;
                        try {
                            if (!X4.b.b().a(this.f28336b, this.f28337c, this, 65)) {
                                Log.e("FirebaseMessaging", "binding to the service failed");
                                this.f28341g = false;
                                while (true) {
                                    ArrayDeque arrayDeque = this.f28339e;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else {
                                        ((a) arrayDeque.poll()).f28343b.d(null);
                                    }
                                }
                            }
                        } catch (SecurityException e10) {
                            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.f28340f.a((a) this.f28339e.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized p191p5.B b(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseMessaging", 3);
        aVar = new a(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f28338d;
        aVar.f28343b.f45811a.b(scheduledThreadPoolExecutor, new F1.a(4, scheduledThreadPoolExecutor.schedule(new U(0, aVar), 20L, TimeUnit.SECONDS)));
        this.f28339e.add(aVar);
        a();
        return aVar.f28343b.f45811a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f28341g = false;
            if (iBinder instanceof T) {
                this.f28340f = (T) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f28339e;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((a) arrayDeque.poll()).f28343b.d(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
