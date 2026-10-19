package p179o5;

import D3.b;
import U4.C0804l;
import Y4.c;
import Y4.g;
import Y4.i;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f45216n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f45217o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f45218p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f45220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f45222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f45224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p081g5.a f45226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f45227i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f45228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f45229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f45230m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f45219a = new Object();
        this.f45221c = 0;
        this.f45224f = new HashSet();
        this.f45225g = true;
        this.f45227i = c.f7603a;
        this.f45228k = new HashMap();
        this.f45229l = new AtomicInteger(0);
        C0804l.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f45226h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f45220b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = i.f7610a;
        synchronized (i.class) {
            Boolean bool = i.f7614e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = p186p0.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                i.f7614e = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i10 = g.f7609a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = p006a5.c.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i11 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        Method method2 = i.f7611b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method3 = i.f7610a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f45220b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f45217o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f45218p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f45217o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f45217o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f45230m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j) {
        this.f45229l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f45216n), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f45219a) {
            try {
                if (!b()) {
                    this.f45226h = p081g5.a.f35602b;
                    this.f45220b.acquire();
                    this.f45227i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f45221c++;
                if (this.f45225g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f45228k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f45228k.put(null, bVar);
                }
                bVar.f45231a++;
                this.f45227i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j10 > this.f45223e) {
                    this.f45223e = j10;
                    ScheduledFuture scheduledFuture = this.f45222d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f45222d = this.f45230m.schedule(new b(1, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f45219a) {
            z10 = this.f45221c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f45229l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f45219a) {
            try {
                if (this.f45225g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f45228k.containsKey(null)) {
                    b bVar = (b) this.f45228k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f45231a - 1;
                        bVar.f45231a = i10;
                        if (i10 == 0) {
                            this.f45228k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f45224f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void e() {
        synchronized (this.f45219a) {
            try {
                if (b()) {
                    if (this.f45225g) {
                        int i10 = this.f45221c - 1;
                        this.f45221c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f45221c = 0;
                    }
                    d();
                    Iterator it = this.f45228k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f45231a = 0;
                    }
                    this.f45228k.clear();
                    ScheduledFuture scheduledFuture = this.f45222d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f45222d = null;
                        this.f45223e = 0L;
                    }
                    if (this.f45220b.isHeld()) {
                        try {
                            try {
                                this.f45220b.release();
                                if (this.f45226h != null) {
                                    this.f45226h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e10);
                                if (this.f45226h != null) {
                                    this.f45226h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f45226h != null) {
                                this.f45226h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
