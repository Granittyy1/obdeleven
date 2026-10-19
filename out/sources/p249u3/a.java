package p249u3;

import U5.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.List;

/* JADX INFO: compiled from: InstallReferrerClientImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InstallReferrerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47418a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N4.a f47420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServiceConnectionC0540a f47421d;

    /* JADX INFO: renamed from: u3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InstallReferrerClientImpl.java */
    public final class ServiceConnectionC0540a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f47422b;

        public ServiceConnectionC0540a(d dVar) {
            this.f47422b = dVar;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            N4.a aVar;
            Log.isLoggable("InstallReferrerClient", 2);
            int i10 = N4.a.AbstractBinderC0068a.f4644c;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof N4.a)) {
                    N4.a.AbstractBinderC0068a.C0069a c0069a = new N4.a.AbstractBinderC0068a.C0069a();
                    c0069a.f4645c = iBinder;
                    aVar = c0069a;
                } else {
                    aVar = (N4.a) iInterfaceQueryLocalInterface;
                }
            }
            a aVar2 = a.this;
            aVar2.f47420c = aVar;
            aVar2.f47418a = 2;
            this.f47422b.b(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.isLoggable("InstallReferrerClient", 5);
            a aVar = a.this;
            aVar.f47420c = null;
            aVar.f47418a = 0;
        }
    }

    public a(Context context) {
        this.f47419b = context.getApplicationContext();
    }

    public final ReferrerDetails a() throws RemoteException {
        if (this.f47418a != 2 || this.f47420c == null || this.f47421d == null) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f47419b.getPackageName());
        try {
            return new ReferrerDetails(this.f47420c.C(bundle));
        } catch (RemoteException e10) {
            Log.isLoggable("InstallReferrerClient", 5);
            this.f47418a = 0;
            throw e10;
        }
    }

    public final void b(d dVar) {
        ServiceInfo serviceInfo;
        int i10 = this.f47418a;
        if ((i10 != 2 || this.f47420c == null || this.f47421d == null) ? false : true) {
            Log.isLoggable("InstallReferrerClient", 2);
            dVar.b(0);
            return;
        }
        if (i10 == 1) {
            Log.isLoggable("InstallReferrerClient", 5);
            dVar.b(3);
            return;
        }
        if (i10 == 3) {
            Log.isLoggable("InstallReferrerClient", 5);
            dVar.b(3);
            return;
        }
        Log.isLoggable("InstallReferrerClient", 2);
        this.f47421d = new ServiceConnectionC0540a(dVar);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.f47419b;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f47418a = 0;
            Log.isLoggable("InstallReferrerClient", 2);
            dVar.b(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    if (context.bindService(new Intent(intent), this.f47421d, 1)) {
                        Log.isLoggable("InstallReferrerClient", 2);
                        return;
                    }
                    Log.isLoggable("InstallReferrerClient", 5);
                    this.f47418a = 0;
                    dVar.b(1);
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        Log.isLoggable("InstallReferrerClient", 5);
        this.f47418a = 0;
        dVar.b(2);
    }
}
