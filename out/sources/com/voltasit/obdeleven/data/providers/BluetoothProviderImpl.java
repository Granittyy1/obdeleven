package com.voltasit.obdeleven.data.providers;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: BluetoothProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BluetoothProviderImpl implements J8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.d f30202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F8.c f30204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f30205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f30206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateFlowImpl f30207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlowImpl f30208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BluetoothAdapter f30209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f30210i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f30211k;

    /* JADX INFO: compiled from: BluetoothProviderImpl.kt */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(intent, "intent");
            BluetoothProviderImpl bluetoothProviderImpl = BluetoothProviderImpl.this;
            bluetoothProviderImpl.f30203b.f("BluetoothProviderImpl", "onReceive(intent=" + intent.getAction() + ")");
            String action = intent.getAction();
            boolean zEquals = "android.bluetooth.device.action.FOUND".equals(action);
            J8.p pVar = bluetoothProviderImpl.f30203b;
            if (!zEquals) {
                if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    pVar.e("BluetoothProviderImpl", "ClassicBluetoothDevice discovery finished");
                    bluetoothProviderImpl.i();
                    return;
                } else {
                    pVar.e("BluetoothProviderImpl", "Unhandled bluetooth state: " + action);
                    return;
                }
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            kotlin.jvm.internal.i.b(bluetoothDevice);
            String strB = J4.i.b(bluetoothDevice.getType(), " Type: ");
            StringBuilder sbC = B6.a.c("ClassicBluetoothDevice found: ", bluetoothDevice.getAddress(), " (", bluetoothDevice.getName(), ")");
            sbC.append(strB);
            pVar.e("BluetoothProviderImpl", sbC.toString());
            if (bluetoothDevice.getName() != null) {
                String name = bluetoothDevice.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                String lowerCase2 = "OBDeleven".toLowerCase(locale);
                kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
                if (!kotlin.text.n.J(lowerCase, lowerCase2, false)) {
                    return;
                }
            }
            ArrayList arrayList = bluetoothProviderImpl.f30210i;
            arrayList.add(bluetoothProviderImpl.j(bluetoothDevice));
            bluetoothProviderImpl.f30207f.setValue(kotlin.collections.q.o0(arrayList));
        }
    }

    public BluetoothProviderImpl(J8.d dVar, J8.p pVar, F8.c cVar) {
        this.f30202a = dVar;
        this.f30203b = pVar;
        this.f30204c = cVar;
        kotlinx.coroutines.flow.v vVarB = kotlinx.coroutines.flow.w.b(0, 0, null, 7);
        this.f30205d = vVarB;
        this.f30206e = vVarB;
        kotlinx.coroutines.flow.w.b(0, 0, null, 7);
        StateFlowImpl stateFlowImplA = B.a(EmptyList.f42983b);
        this.f30207f = stateFlowImplA;
        this.f30208g = stateFlowImplA;
        this.f30209h = BluetoothAdapter.getDefaultAdapter();
        this.f30210i = new ArrayList();
        this.f30211k = new a();
    }

    @Override // J8.c
    public final void a(com.voltasit.obdeleven.utils.bluetooth.g gVar, com.voltasit.obdeleven.utils.bluetooth.n nVar) {
        int i10;
        gVar.a(nVar, this.f30202a.getContext());
        int i11 = W7.c.f7063a;
        StringBuilder sb2 = new StringBuilder("setBluetoothDeviceAndResync(state: ");
        synchronized (gVar) {
            i10 = gVar.f34340d;
        }
        sb2.append(i10);
        sb2.append(")");
        O.e.j("OBDeleven", sb2.toString());
        W7.c.f7065c = gVar;
        Object obj = com.obdeleven.service.core.d.f29240f;
        com.obdeleven.service.core.d.f29241g = Task.forResult(null);
    }

    @Override // J8.c
    public final StateFlowImpl b() {
        return this.f30208g;
    }

    @Override // J8.c
    public final boolean c() {
        BluetoothAdapter bluetoothAdapter = this.f30209h;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    @Override // J8.c
    public final boolean d() {
        return this.f30209h != null;
    }

    @Override // J8.c
    public final List<Q8.b> e() {
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapter = this.f30209h;
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter != null ? bluetoothAdapter.getBondedDevices() : null;
        if (bondedDevices == null) {
            return EmptyList.f42983b;
        }
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            if (bluetoothDevice.getName() != null) {
                String name = bluetoothDevice.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                if (kotlin.text.n.J(name, "OBDeleven", false)) {
                }
            }
            arrayList.add(j(bluetoothDevice));
        }
        return arrayList;
    }

    @Override // J8.c
    public final void f() {
        J8.p pVar = this.f30203b;
        pVar.f("BluetoothProviderImpl", "startScan()");
        this.f30210i.clear();
        this.f30207f.setValue(EmptyList.f42983b);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        this.f30202a.getContext().registerReceiver(this.f30211k, intentFilter);
        this.j = true;
        try {
            BluetoothAdapter bluetoothAdapter = this.f30209h;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.startDiscovery();
            }
        } catch (Exception e10) {
            pVar.d(e10, false);
        }
    }

    @Override // J8.c
    public final void g(int i10, IDevice device, Throwable th) {
        kotlin.jvm.internal.i.e(device, "device");
        C2680e.c(C2673a0.f43223b, null, null, new BluetoothProviderImpl$onBluetoothStateChanged$1(th, this, device, i10, null), 3);
    }

    @Override // J8.c
    public final kotlinx.coroutines.flow.v h() {
        return this.f30206e;
    }

    @Override // J8.c
    public final void i() {
        this.f30203b.f("BluetoothProviderImpl", "stopScan()");
        BluetoothAdapter bluetoothAdapter = this.f30209h;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.cancelDiscovery();
        }
        if (this.j) {
            this.j = false;
            this.f30202a.getContext().unregisterReceiver(this.f30211k);
        }
    }

    public final Q8.b j(BluetoothDevice bluetoothDevice) {
        Q8.b bVar = new Q8.b(0);
        bVar.f5127b = bluetoothDevice.getName();
        String name = bluetoothDevice.getName();
        bVar.f5131f = name;
        if (name == null) {
            bVar.f5131f = "Unknown";
        }
        bVar.f5128c = bluetoothDevice.getAddress();
        bVar.f5130e = 0;
        boolean z10 = true;
        bVar.f5132g = true;
        if (bluetoothDevice.getType() != 2 && bluetoothDevice.getType() != 3) {
            z10 = false;
        }
        bVar.f5129d = z10;
        if (bVar.f5127b == null) {
            bVar.f5127b = this.f30202a.a(R.string.common_unknown, new Object[0]);
        }
        return bVar;
    }
}
