package O4;

import S4.ServiceConnectionC0759a;
import U4.C0804l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p044d5.d;
import p044d5.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceConnectionC0759a f4845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f4846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4848d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f4849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f4850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4851g;

    /* JADX INFO: renamed from: O4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class C0072a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4853b;

        @Deprecated
        public C0072a(String str, boolean z10) {
            this.f4852a = str;
            this.f4853b = z10;
        }

        public final String toString() {
            String str = this.f4852a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(this.f4853b);
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public a(Context context) {
        C0804l.h(context);
        Context applicationContext = context.getApplicationContext();
        this.f4850f = applicationContext != null ? applicationContext : context;
        this.f4847c = false;
        this.f4851g = -1L;
    }

    public static C0072a a(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            C0072a c0072aE = aVar.e();
            d(c0072aE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.b();
            return c0072aE;
        } catch (Throwable th) {
            try {
                d(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                aVar.b();
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public static void d(C0072a c0072a, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c0072a != null) {
                map.put("limit_ad_tracking", true != c0072a.f4853b ? "0" : "1");
                String str = c0072a.f4852a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new b(map).start();
        }
    }

    public final void b() {
        C0804l.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f4850f == null || this.f4845a == null) {
                    return;
                }
                try {
                    if (this.f4847c) {
                        X4.b.b().c(this.f4850f, this.f4845a);
                    }
                } catch (Throwable unused) {
                }
                this.f4847c = false;
                this.f4846b = null;
                this.f4845a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void c() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        C0804l.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f4847c) {
                    b();
                }
                Context context = this.f4850f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = com.google.android.gms.common.a.f25299b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0759a serviceConnectionC0759a = new ServiceConnectionC0759a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!X4.b.b().a(context, intent, serviceConnectionC0759a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f4845a = serviceConnectionC0759a;
                        try {
                            IBinder iBinderA = serviceConnectionC0759a.a(TimeUnit.MILLISECONDS);
                            int i10 = d.f34568c;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f4846b = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new p044d5.c(iBinderA);
                            this.f4847c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final C0072a e() throws IOException {
        C0072a c0072a;
        C0804l.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f4847c) {
                    synchronized (this.f4848d) {
                        c cVar = this.f4849e;
                        if (cVar == null || !cVar.f4858e) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f4847c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                C0804l.h(this.f4845a);
                C0804l.h(this.f4846b);
                try {
                    c0072a = new C0072a(this.f4846b.y(), this.f4846b.z());
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4848d) {
            c cVar2 = this.f4849e;
            if (cVar2 != null) {
                cVar2.f4857d.countDown();
                try {
                    this.f4849e.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j = this.f4851g;
            if (j > 0) {
                this.f4849e = new c(this, j);
            }
        }
        return c0072a;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
