package androidx.work.impl.foreground;

import K2.K;
import R2.C0749b;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ServiceC1380x;
import androidx.work.k;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends ServiceC1380x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20408g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f20409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public P2.b f20411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NotificationManager f20412f;

    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                k kVarC = k.c();
                int i12 = SystemForegroundService.f20408g;
                kVarC.getClass();
            } catch (SecurityException unused2) {
                k kVarC2 = k.c();
                int i13 = SystemForegroundService.f20408g;
                kVarC2.getClass();
            }
        }
    }

    static {
        k.d("SystemFgService");
    }

    public final void a() {
        this.f20409c = new Handler(Looper.getMainLooper());
        this.f20412f = (NotificationManager) getApplicationContext().getSystemService("notification");
        P2.b bVar = new P2.b(getApplicationContext());
        this.f20411e = bVar;
        if (bVar.j != null) {
            k.c().a(P2.b.f4898k, "A callback already exists.");
        } else {
            bVar.j = this;
        }
    }

    @Override // androidx.lifecycle.ServiceC1380x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.ServiceC1380x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f20411e.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f20410d) {
            k.c().getClass();
            this.f20411e.f();
            a();
            this.f20410d = false;
        }
        if (intent == null) {
            return 3;
        }
        P2.b bVar = this.f20411e;
        bVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            k kVarC = k.c();
            Objects.toString(intent);
            kVarC.getClass();
            bVar.f4900c.d(new P2.a(bVar, 0, intent.getStringExtra("KEY_WORKSPEC_ID")));
            bVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            k.c().getClass();
            SystemForegroundService systemForegroundService = bVar.j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f20410d = true;
            k.c().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        k kVarC2 = k.c();
        Objects.toString(intent);
        kVarC2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        K k10 = bVar.f4899b;
        k10.getClass();
        k10.f4147d.d(new C0749b(k10, uuidFromString));
        return 3;
    }
}
