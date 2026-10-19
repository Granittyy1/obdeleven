package M2;

import K2.I;
import K2.InterfaceC0711d;
import K2.J;
import K2.K;
import K2.r;
import Q2.C0738o;
import R2.F;
import R2.t;
import R2.x;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: SystemAlarmDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0711d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f4546l = k.d("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S2.b f4548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f4549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f4550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K f4551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M2.b f4552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f4554i;
    public SystemAlarmService j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I f4555k;

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            S2.c.a aVarB;
            c cVar;
            synchronized (g.this.f4553h) {
                g gVar = g.this;
                gVar.f4554i = (Intent) gVar.f4553h.get(0);
            }
            Intent intent = g.this.f4554i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f4554i.getIntExtra("KEY_START_ID", 0);
                k kVarC = k.c();
                String str = g.f4546l;
                Objects.toString(g.this.f4554i);
                kVarC.getClass();
                PowerManager.WakeLock wakeLockA = x.a(g.this.f4547b, action + " (" + intExtra + ")");
                try {
                    k kVarC2 = k.c();
                    wakeLockA.toString();
                    kVarC2.getClass();
                    wakeLockA.acquire();
                    g gVar2 = g.this;
                    gVar2.f4552g.a(intExtra, gVar2, gVar2.f4554i);
                    k kVarC3 = k.c();
                    wakeLockA.toString();
                    kVarC3.getClass();
                    wakeLockA.release();
                    aVarB = g.this.f4548c.b();
                    cVar = new c(g.this);
                } catch (Throwable th) {
                    try {
                        k.c().b(g.f4546l, "Unexpected error in onHandleIntent", th);
                        k kVarC4 = k.c();
                        wakeLockA.toString();
                        kVarC4.getClass();
                        wakeLockA.release();
                        aVarB = g.this.f4548c.b();
                        cVar = new c(g.this);
                    } catch (Throwable th2) {
                        k kVarC5 = k.c();
                        String str2 = g.f4546l;
                        wakeLockA.toString();
                        kVarC5.getClass();
                        wakeLockA.release();
                        g.this.f4548c.b().execute(new c(g.this));
                        throw th2;
                    }
                }
                aVarB.execute(cVar);
            }
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f4557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Intent f4558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4559d;

        public b(int i10, g gVar, Intent intent) {
            this.f4557b = gVar;
            this.f4558c = intent;
            this.f4559d = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f4558c;
            this.f4557b.a(this.f4559d, intent);
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f4560b;

        public c(g gVar) {
            this.f4560b = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0012, B:6:0x0016, B:8:0x0033, B:11:0x0039, B:12:0x0040, B:13:0x0041, B:14:0x004b, B:18:0x0055, B:20:0x005d, B:21:0x005f, B:25:0x0069, B:27:0x0074, B:35:0x0086, B:31:0x007a, B:32:0x007b, B:34:0x0083, B:39:0x008a, B:22:0x0060, B:23:0x0066, B:15:0x004c, B:16:0x0052), top: B:42:0x0012, inners: #1, #2 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0083 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0012, B:6:0x0016, B:8:0x0033, B:11:0x0039, B:12:0x0040, B:13:0x0041, B:14:0x004b, B:18:0x0055, B:20:0x005d, B:21:0x005f, B:25:0x0069, B:27:0x0074, B:35:0x0086, B:31:0x007a, B:32:0x007b, B:34:0x0083, B:39:0x008a, B:22:0x0060, B:23:0x0066, B:15:0x004c, B:16:0x0052), top: B:42:0x0012, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zIsEmpty;
            boolean zIsEmpty2;
            g gVar = this.f4560b;
            gVar.getClass();
            k.c().getClass();
            g.c();
            synchronized (gVar.f4553h) {
                try {
                    if (gVar.f4554i != null) {
                        k kVarC = k.c();
                        Objects.toString(gVar.f4554i);
                        kVarC.getClass();
                        if (!((Intent) gVar.f4553h.remove(0)).equals(gVar.f4554i)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        gVar.f4554i = null;
                    }
                    t tVarC = gVar.f4548c.c();
                    M2.b bVar = gVar.f4552g;
                    synchronized (bVar.f4522d) {
                        zIsEmpty = bVar.f4521c.isEmpty();
                    }
                    if (zIsEmpty && gVar.f4553h.isEmpty()) {
                        synchronized (tVarC.f5237e) {
                            zIsEmpty2 = tVarC.f5234b.isEmpty();
                        }
                        if (zIsEmpty2) {
                            k.c().getClass();
                            SystemAlarmService systemAlarmService = gVar.j;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!gVar.f4553h.isEmpty()) {
                            gVar.d();
                        }
                    } else if (!gVar.f4553h.isEmpty()) {
                        gVar.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f4547b = applicationContext;
        G6.a aVar = new G6.a();
        K kB = K.b(systemAlarmService);
        this.f4551f = kB;
        this.f4552g = new M2.b(applicationContext, kB.f4145b.f20331c, aVar);
        this.f4549d = new F(kB.f4145b.f20334f);
        r rVar = kB.f4149f;
        this.f4550e = rVar;
        S2.b bVar = kB.f4147d;
        this.f4548c = bVar;
        this.f4555k = new J(rVar, bVar);
        rVar.a(this);
        this.f4553h = new ArrayList();
        this.f4554i = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i10, Intent intent) {
        k kVarC = k.c();
        Objects.toString(intent);
        kVarC.getClass();
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.c().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f4553h) {
                try {
                    Iterator it = this.f4553h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f4553h) {
            try {
                boolean zIsEmpty = this.f4553h.isEmpty();
                this.f4553h.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // K2.InterfaceC0711d
    public final void b(C0738o c0738o, boolean z10) {
        S2.c.a aVarB = this.f4548c.b();
        String str = M2.b.f4519g;
        Intent intent = new Intent(this.f4547b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        M2.b.d(intent, c0738o);
        aVarB.execute(new b(0, this, intent));
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = x.a(this.f4547b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f4551f.f4147d.d(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
