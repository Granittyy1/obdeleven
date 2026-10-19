package Q3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.e.b f5064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5067f = new a();

    /* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar = c.this;
            boolean z10 = cVar.f5065d;
            cVar.f5065d = c.l(context);
            if (z10 != c.this.f5065d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    boolean z11 = c.this.f5065d;
                }
                c cVar2 = c.this;
                com.bumptech.glide.e.b bVar = cVar2.f5064c;
                if (!cVar2.f5065d) {
                    bVar.getClass();
                    return;
                }
                synchronized (com.bumptech.glide.e.this) {
                    k kVar = bVar.f24509a;
                    for (T3.b bVar2 : X3.j.d((Set) kVar.f5086c)) {
                        if (!bVar2.f() && !bVar2.d()) {
                            bVar2.clear();
                            if (kVar.f5085b) {
                                ((ArrayList) kVar.f5087d).add(bVar2);
                            } else {
                                bVar2.e();
                            }
                        }
                    }
                }
            }
        }
    }

    public c(Context context, com.bumptech.glide.e.b bVar) {
        this.f5063b = context.getApplicationContext();
        this.f5064c = bVar;
    }

    public static boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        M1.d(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // Q3.f
    public final void a() {
        if (this.f5066e) {
            this.f5063b.unregisterReceiver(this.f5067f);
            this.f5066e = false;
        }
    }

    @Override // Q3.f
    public final void k() {
        if (this.f5066e) {
            return;
        }
        Context context = this.f5063b;
        this.f5065d = l(context);
        try {
            context.registerReceiver(this.f5067f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f5066e = true;
        } catch (SecurityException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    @Override // Q3.f
    public final void e() {
    }
}
