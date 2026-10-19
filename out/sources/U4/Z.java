package U4;

import S4.C0760b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z implements ServiceConnection, c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f6383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y f6384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComponentName f6385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f6386h;

    public Z(b0 b0Var, Y y10) {
        Objects.requireNonNull(b0Var);
        this.f6386h = b0Var;
        this.f6384f = y10;
        this.f6380b = new HashMap();
        this.f6381c = 2;
    }

    public final C0760b a(String str, Executor executor) {
        C0760b c0760b;
        try {
            Intent intentA = M.a(this.f6386h.f6419e, this.f6384f);
            this.f6381c = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(Y4.k.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                b0 b0Var = this.f6386h;
                X4.b bVar = b0Var.f6421g;
                Context context = b0Var.f6419e;
                Y y10 = this.f6384f;
                boolean zD = bVar.d(context, str, intentA, this, 4225, executor);
                this.f6382d = zD;
                if (zD) {
                    b0Var.f6420f.sendMessageDelayed(b0Var.f6420f.obtainMessage(1, y10), b0Var.f6423i);
                    c0760b = C0760b.f5525g;
                } else {
                    this.f6381c = 2;
                    try {
                        b0Var.f6421g.c(b0Var.f6419e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    c0760b = new C0760b(16, null, null);
                }
                return c0760b;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (zzaf e10) {
            return e10.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b0 b0Var = this.f6386h;
        synchronized (b0Var.f6418d) {
            try {
                b0Var.f6420f.removeMessages(1, this.f6384f);
                this.f6383e = iBinder;
                this.f6385g = componentName;
                Iterator it = this.f6380b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6381c = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b0 b0Var = this.f6386h;
        synchronized (b0Var.f6418d) {
            try {
                b0Var.f6420f.removeMessages(1, this.f6384f);
                this.f6383e = null;
                this.f6385g = componentName;
                Iterator it = this.f6380b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6381c = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
