package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LifecycleService.kt */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC1380x extends Service implements InterfaceC1376t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f17836b = new U(this);

    @Override // androidx.lifecycle.InterfaceC1376t
    public final Lifecycle getLifecycle() {
        return this.f17836b.f17784a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        U u10 = this.f17836b;
        u10.getClass();
        u10.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        U u10 = this.f17836b;
        u10.getClass();
        u10.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        U u10 = this.f17836b;
        u10.getClass();
        u10.a(Lifecycle.Event.ON_STOP);
        u10.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @p293xa.d
    public final void onStart(Intent intent, int i10) {
        U u10 = this.f17836b;
        u10.getClass();
        u10.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i10);
    }
}
