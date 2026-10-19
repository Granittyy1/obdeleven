package androidx.work.impl.background.systemalarm;

import M2.g;
import R2.x;
import R2.y;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.ServiceC1380x;
import androidx.work.k;
import java.util.LinkedHashMap;
import java.util.Map;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends ServiceC1380x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f20378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20379d;

    static {
        k.d("SystemAlarmService");
    }

    public final void a() {
        this.f20379d = true;
        k.c().getClass();
        int i10 = x.f5247a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (y.f5248a) {
            linkedHashMap.putAll(y.f5249b);
            r rVar = r.f47939a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                k.c().getClass();
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC1380x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f20378c = gVar;
        if (gVar.j != null) {
            k.c().a(g.f4546l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            gVar.j = this;
        }
        this.f20379d = false;
    }

    @Override // androidx.lifecycle.ServiceC1380x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f20379d = true;
        g gVar = this.f20378c;
        gVar.getClass();
        k.c().getClass();
        gVar.f4550e.e(gVar);
        gVar.j = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f20379d) {
            k.c().getClass();
            g gVar = this.f20378c;
            gVar.getClass();
            k.c().getClass();
            gVar.f4550e.e(gVar);
            gVar.j = null;
            g gVar2 = new g(this);
            this.f20378c = gVar2;
            if (gVar2.j != null) {
                k.c().a(g.f4546l, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                gVar2.j = this;
            }
            this.f20379d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f20378c.a(i11, intent);
        return 3;
    }
}
