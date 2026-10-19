package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EnhancedIntentService.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractServiceC2046i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    /* JADX INFO: renamed from: com.google.firebase.messaging.i$a */
    /* JADX INFO: compiled from: EnhancedIntentService.java */
    public class a {
        public a() {
        }
    }

    public AbstractServiceC2046i() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z4.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            S.b(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, p191p5.g gVar) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, p191p5.h hVar) {
        try {
            handleIntent(intent);
        } finally {
            hVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p191p5.g<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return p191p5.j.e(null);
        }
        p191p5.h hVar = new p191p5.h();
        this.executor.execute(new RunnableC2045h(this, intent, hVar, 0));
        return hVar.f45811a;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable(TAG, 3);
            if (this.binder == null) {
                this.binder = new T(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        p191p5.g<Void> gVarProcessIntent = processIntent(startCommandIntent);
        if (gVarProcessIntent.n()) {
            finishTask(intent);
            return 2;
        }
        gVarProcessIntent.b(new p188p2.b(), new I4.i(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
