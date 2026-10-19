package com.voltasit.obdeleven.utils.bluetooth;

import J8.u;
import android.content.Context;
import androidx.fragment.app.y;
import com.obdeleven.service.interfaces.IDevice;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseConfig;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.usecases.device.B;
import com.voltasit.obdeleven.domain.usecases.device.C2117b;
import com.voltasit.obdeleven.domain.usecases.device.C2118c;
import com.voltasit.obdeleven.domain.usecases.device.D;
import com.voltasit.obdeleven.presentation.deviceupdate.UpdateDialog;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.activity.MainActivityViewModel;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.ArrayList;
import java.util.Iterator;
import p220r9.P;
import p255u9.z;

/* JADX INFO: compiled from: BluetoothConnectionHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BluetoothConnectionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f34294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2118c f34295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.c f34296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f34297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f34298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.e f34299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.g f34300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2117b f34301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.m f34302i;
    public final J8.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f34303k;

    public BluetoothConnectionHelper(MainActivity activity, C2118c connectToBluetoothUC, J8.c bluetoothProvider, B updateStoredBluetoothDevicesUC, D verifyDeviceUC, com.voltasit.obdeleven.domain.usecases.device.e createFirstGenDeviceUC, com.voltasit.obdeleven.domain.usecases.device.g getDeviceForConnectionUC, C2117b authoriseDeviceUC, com.voltasit.obdeleven.domain.usecases.device.m isDeviceUpdateNeededUC, J8.a analyticsProvider, u remoteConfigProvider) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(connectToBluetoothUC, "connectToBluetoothUC");
        kotlin.jvm.internal.i.e(bluetoothProvider, "bluetoothProvider");
        kotlin.jvm.internal.i.e(updateStoredBluetoothDevicesUC, "updateStoredBluetoothDevicesUC");
        kotlin.jvm.internal.i.e(verifyDeviceUC, "verifyDeviceUC");
        kotlin.jvm.internal.i.e(createFirstGenDeviceUC, "createFirstGenDeviceUC");
        kotlin.jvm.internal.i.e(getDeviceForConnectionUC, "getDeviceForConnectionUC");
        kotlin.jvm.internal.i.e(authoriseDeviceUC, "authoriseDeviceUC");
        kotlin.jvm.internal.i.e(isDeviceUpdateNeededUC, "isDeviceUpdateNeededUC");
        kotlin.jvm.internal.i.e(analyticsProvider, "analyticsProvider");
        kotlin.jvm.internal.i.e(remoteConfigProvider, "remoteConfigProvider");
        this.f34294a = activity;
        this.f34295b = connectToBluetoothUC;
        this.f34296c = bluetoothProvider;
        this.f34297d = updateStoredBluetoothDevicesUC;
        this.f34298e = verifyDeviceUC;
        this.f34299f = createFirstGenDeviceUC;
        this.f34300g = getDeviceForConnectionUC;
        this.f34301h = authoriseDeviceUC;
        this.f34302i = isDeviceUpdateNeededUC;
        this.j = analyticsProvider;
        this.f34303k = remoteConfigProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        C8.a c0024a;
        int i10 = 1;
        MainActivity mainActivity = this.f34294a;
        if (!com.voltasit.obdeleven.domain.usecases.device.u.k(mainActivity)) {
            P.a(mainActivity, mainActivity.getString(R.string.common_check_network_try_again));
            return;
        }
        if (10800 < ParseConfig.getCurrentConfig().getInt("app_version")) {
            P.d(mainActivity, R.string.dialog_please_update, R.string.common_update, new com.voltasit.obdeleven.presentation.vagpromo.b(i10, mainActivity));
            return;
        }
        int i11 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        if (zVar == null || ParseAnonymousUtils.isLinked(zVar)) {
            NavigationManager navigationManager = mainActivity.f33533B;
            if (navigationManager != null) {
                navigationManager.m(mainActivity.E());
                return;
            }
            return;
        }
        J8.c cVar = this.f34296c;
        if (!cVar.d()) {
            P.a(mainActivity, mainActivity.getString(R.string.snackbar_bluetooth_not_available));
            return;
        }
        W7.c.g(1);
        MainActivityViewModel mainActivityViewModelB = mainActivity.B();
        mainActivityViewModelB.getClass();
        mainActivityViewModelB.f33590H.getClass();
        if (!com.voltasit.obdeleven.domain.usecases.permissions.c.a(mainActivity)) {
            Ia.l<Boolean, p293xa.r> lVar = new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$connect$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Boolean bool) {
                    boolean zBooleanValue = bool.booleanValue();
                    BluetoothConnectionHelper bluetoothConnectionHelper = this.this$0;
                    if (zBooleanValue) {
                        bluetoothConnectionHelper.a();
                    } else {
                        P.b(bluetoothConnectionHelper.f34294a, R.string.permission_required);
                        W7.c.g(0);
                    }
                    return p293xa.r.f47939a;
                }
            };
            MainActivityViewModel mainActivityViewModelB2 = mainActivity.B();
            mainActivityViewModelB2.getClass();
            mainActivityViewModelB2.f33592I.getClass();
            com.voltasit.obdeleven.domain.usecases.permissions.a.a(mainActivity, lVar);
            return;
        }
        if (!cVar.c()) {
            mainActivity.z(new Ia.l<Boolean, p293xa.r>() { // from class: com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$connect$2
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Boolean bool) {
                    boolean zBooleanValue = bool.booleanValue();
                    BluetoothConnectionHelper bluetoothConnectionHelper = this.this$0;
                    if (zBooleanValue) {
                        bluetoothConnectionHelper.a();
                    } else {
                        P.b(bluetoothConnectionHelper.f34294a, R.string.snackbar_bluetooth_not_enabled);
                        W7.c.g(0);
                    }
                    return p293xa.r.f47939a;
                }
            });
            return;
        }
        B b10 = this.f34297d;
        if (Q8.b.a.a(b10.f30756a.J()).isEmpty()) {
            Iterator it = kotlin.collections.q.p0(b10.f30757b.e()).iterator();
            while (it.hasNext()) {
                b10.f30758c.a((Q8.b) it.next());
            }
        }
        com.voltasit.obdeleven.domain.usecases.device.g gVar = this.f34300g;
        J8.p pVar = gVar.f30783b;
        pVar.f("GetDeviceForConnectionUC", "GetDeviceForConnectionUC()");
        K8.o oVar = gVar.f30782a;
        ArrayList arrayListA = Q8.b.a.a(oVar.J());
        if (oVar.x() || arrayListA.size() != 1) {
            c0024a = new C8.a.C0024a(new NotFoundException("Default device for connection not found"));
        } else {
            pVar.e("GetDeviceForConnectionUC", "Device for default connection found");
            c0024a = new C8.a.b(arrayListA.get(0));
        }
        if (c0024a instanceof C8.a.b) {
            b((Q8.b) ((C8.a.b) c0024a).f2463a);
        } else if (c0024a instanceof C8.a.C0024a) {
            MainActivityViewModel mainActivityViewModelB3 = mainActivity.B();
            mainActivityViewModelB3.f33660x0.j(Boolean.TRUE);
        }
    }

    public final void b(Q8.b device) {
        g gVar;
        kotlin.jvm.internal.i.e(device, "device");
        C2118c c2118c = this.f34295b;
        c2118c.getClass();
        J8.p pVar = c2118c.f30774c;
        pVar.f("ConnectToBluetoothUC", "ConnectToBluetoothUC(device=" + device + ")");
        c2118c.f30775d.a(device);
        W7.c.g(1);
        Context context = c2118c.f30772a.getContext();
        boolean zEquals = "OBDeleven".equals(device.f5131f);
        String str = device.f5128c;
        n oVar = (!zEquals && device.f5129d) ? new o(str) : new m(str);
        if (oVar instanceof o) {
            pVar.e("ConnectToBluetoothUC", "Using LE bluetooth device");
            gVar = new LeBluetoothDevice(context);
        } else {
            pVar.e("ConnectToBluetoothUC", "Using classic bluetooth device");
            gVar = new g();
        }
        c2118c.f30773b.a(gVar, oVar);
    }

    public final Task<Boolean> c(IDevice iDevice, int i10) {
        O.e.j("BluetoothConnectionHelper", "Showing update dialog");
        UpdateDialog updateDialog = new UpdateDialog(this.f34294a, iDevice, i10);
        y supportFragmentManager = updateDialog.f32150s.getSupportFragmentManager();
        kotlin.jvm.internal.i.d(supportFragmentManager, "getSupportFragmentManager(...)");
        updateDialog.v(supportFragmentManager, "UpdateDialog");
        Task<Boolean> task = updateDialog.f32154w.getTask();
        kotlin.jvm.internal.i.d(task, "getTask(...)");
        return task;
    }
}
