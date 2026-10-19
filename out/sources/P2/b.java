package P2;

import K2.InterfaceC0711d;
import K2.K;
import K2.r;
import K2.x;
import Q2.C0738o;
import Q2.z;
import R2.v;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.e;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.work.impl.constraints.d, InterfaceC0711d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f4898k = k.d("SystemFgDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f4899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S2.b f4900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4901d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0738o f4902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f4904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f4905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WorkConstraintsTracker f4906i;
    public SystemForegroundService j;

    public b(Context context) {
        K kB = K.b(context);
        this.f4899b = kB;
        this.f4900c = kB.f4147d;
        this.f4902e = null;
        this.f4903f = new LinkedHashMap();
        this.f4905h = new HashMap();
        this.f4904g = new HashMap();
        this.f4906i = new WorkConstraintsTracker(kB.j);
        kB.f4149f.a(this);
    }

    public static Intent c(Context context, C0738o c0738o, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.f20355a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.f20356b);
        intent.putExtra("KEY_NOTIFICATION", eVar.f20357c);
        intent.putExtra("KEY_WORKSPEC_ID", c0738o.f5025a);
        intent.putExtra("KEY_GENERATION", c0738o.f5026b);
        return intent;
    }

    public static Intent d(Context context, C0738o c0738o, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c0738o.f5025a);
        intent.putExtra("KEY_GENERATION", c0738o.f5026b);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.f20355a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.f20356b);
        intent.putExtra("KEY_NOTIFICATION", eVar.f20357c);
        return intent;
    }

    @Override // androidx.work.impl.constraints.d
    public final void a(z zVar, androidx.work.impl.constraints.b bVar) {
        if (bVar instanceof androidx.work.impl.constraints.b.C0202b) {
            String str = zVar.f5036a;
            k.c().getClass();
            C0738o c0738oG = Lb.a.g(zVar);
            K k10 = this.f4899b;
            k10.getClass();
            x xVar = new x(c0738oG);
            r processor = k10.f4149f;
            i.e(processor, "processor");
            k10.f4147d.d(new v(processor, xVar, true, -512));
        }
    }

    @Override // K2.InterfaceC0711d
    public final void b(C0738o c0738o, boolean z10) {
        Map.Entry entry;
        synchronized (this.f4901d) {
            try {
                InterfaceC2694i0 interfaceC2694i0 = ((z) this.f4904g.remove(c0738o)) != null ? (InterfaceC2694i0) this.f4905h.remove(c0738o) : null;
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) this.f4903f.remove(c0738o);
        if (c0738o.equals(this.f4902e)) {
            if (this.f4903f.size() > 0) {
                Iterator it = this.f4903f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f4902e = (C0738o) entry.getKey();
                if (this.j != null) {
                    e eVar2 = (e) entry.getValue();
                    SystemForegroundService systemForegroundService = this.j;
                    systemForegroundService.f20409c.post(new androidx.work.impl.foreground.a(systemForegroundService, eVar2.f20355a, eVar2.f20357c, eVar2.f20356b));
                    SystemForegroundService systemForegroundService2 = this.j;
                    systemForegroundService2.f20409c.post(new d(systemForegroundService2, eVar2.f20355a));
                }
            } else {
                this.f4902e = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.j;
        if (eVar == null || systemForegroundService3 == null) {
            return;
        }
        k kVarC = k.c();
        c0738o.toString();
        kVarC.getClass();
        systemForegroundService3.f20409c.post(new d(systemForegroundService3, eVar.f20355a));
    }

    public final void e(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C0738o c0738o = new C0738o(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k.c().getClass();
        if (notification == null || this.j == null) {
            return;
        }
        e eVar = new e(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f4903f;
        linkedHashMap.put(c0738o, eVar);
        if (this.f4902e == null) {
            this.f4902e = c0738o;
            SystemForegroundService systemForegroundService = this.j;
            systemForegroundService.f20409c.post(new androidx.work.impl.foreground.a(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.j;
        systemForegroundService2.f20409c.post(new c(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((e) ((Map.Entry) it.next()).getValue()).f20356b;
        }
        e eVar2 = (e) linkedHashMap.get(this.f4902e);
        if (eVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.j;
            systemForegroundService3.f20409c.post(new androidx.work.impl.foreground.a(systemForegroundService3, eVar2.f20355a, eVar2.f20357c, i10));
        }
    }

    public final void f() {
        this.j = null;
        synchronized (this.f4901d) {
            try {
                Iterator it = this.f4905h.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC2694i0) it.next()).i(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4899b.f4149f.e(this);
    }
}
