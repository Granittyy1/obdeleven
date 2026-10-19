package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import coil.RealImageLoader;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: SystemCallbacks.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<RealImageLoader> f23179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f23180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y2.e f23181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23183f = true;

    public v(RealImageLoader realImageLoader) {
        this.f23179b = new WeakReference<>(realImageLoader);
    }

    public final synchronized void a() {
        Y2.e bVar;
        try {
            RealImageLoader realImageLoader = this.f23179b.get();
            if (realImageLoader == null) {
                b();
            } else if (this.f23181d == null) {
                if (realImageLoader.f22693d.f23172b) {
                    Context context = realImageLoader.f22690a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) p0.a.b.b(context, ConnectivityManager.class);
                    if (connectivityManager == null || p186p0.a.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        bVar = new L4.b();
                    } else {
                        try {
                            bVar = new Y2.g(connectivityManager, this);
                        } catch (Exception unused) {
                            bVar = new L4.b();
                        }
                    }
                } else {
                    bVar = new L4.b();
                }
                this.f23181d = bVar;
                this.f23183f = bVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f23182e) {
                return;
            }
            this.f23182e = true;
            Context context = this.f23180c;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            Y2.e eVar = this.f23181d;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.f23179b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (this.f23179b.get() == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        X2.b value;
        RealImageLoader realImageLoader = this.f23179b.get();
        if (realImageLoader != null) {
            p293xa.g<X2.b> gVar = realImageLoader.f22692c;
            if (gVar != null && (value = gVar.getValue()) != null) {
                value.a(i10);
            }
        } else {
            b();
        }
    }
}
