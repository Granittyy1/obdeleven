package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import com.google.android.gms.internal.measurement.M1;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;
import kotlinx.coroutines.channels.BufferedChannel;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LeBluetoothDevice extends g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f34304D = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile BluetoothGatt f34305A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f34306B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f34307C;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f34308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f34309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BufferedChannel f34310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f34311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f34314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f34315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o f34316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final byte[] f34318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f34319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f34320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Task<Void> f34321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C2693i f34322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f34323z;

    public LeBluetoothDevice(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f34308k = context;
        this.f34309l = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<BluetoothAdapter>() { // from class: com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$bluetoothAdapter$2
            {
                super(0);
            }

            @Override // Ia.a
            public final BluetoothAdapter invoke() {
                Object systemService = this.this$0.f34308k.getSystemService("bluetooth");
                kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                return ((BluetoothManager) systemService).getAdapter();
            }
        });
        this.f34310m = kotlinx.coroutines.channels.g.a(0, 7, null);
        this.f34311n = new byte[0];
        this.f34318u = new byte[20];
        this.f34320w = true;
        Task<Void> taskForResult = Task.forResult(null);
        kotlin.jvm.internal.i.d(taskForResult, "forResult(...)");
        this.f34321x = taskForResult;
        this.f34323z = true;
        this.f34306B = KoinJavaComponent.b(J8.a.class, null, null);
        this.f34307C = true;
    }

    public static /* synthetic */ void h(LeBluetoothDevice leBluetoothDevice) {
        leBluetoothDevice.g(leBluetoothDevice.f34305A);
    }

    public static BluetoothGattCharacteristic m(BluetoothGatt bluetoothGatt, String str, String str2) {
        Object next;
        O.e.j("LeBluetoothDevice", "getCharacteristic(" + str + ")");
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        kotlin.jvm.internal.i.d(services, "getServices(...)");
        Iterator<T> it = services.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((BluetoothGattService) next).getUuid(), O.h.o(str)));
        BluetoothGattService bluetoothGattService = (BluetoothGattService) next;
        if (bluetoothGattService == null) {
            O.e.D("LeBluetoothDevice", str.concat(" service not found"));
            return null;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(O.h.o(str2));
        if (characteristic != null) {
            return characteristic;
        }
        O.e.D("LeBluetoothDevice", str2.concat(" characteristic not found"));
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.utils.bluetooth.g
    public final void a(n nVar, Context context) throws Exception {
        kotlin.jvm.internal.i.e(context, "context");
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar == null) {
            throw new Exception("No leDevice");
        }
        this.f34316s = oVar;
        String str = ((o) nVar).f34367b;
        kotlin.jvm.internal.i.b(str);
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.f34309l.getValue();
        BluetoothDevice remoteDevice = bluetoothAdapter != null ? bluetoothAdapter.getRemoteDevice(str) : null;
        if (remoteDevice == null) {
            throw new Exception("No bluetooth adapter");
        }
        String address = remoteDevice.getAddress();
        String name = remoteDevice.getName();
        int type = remoteDevice.getType();
        StringBuilder sbC = B6.a.c("Connecting to low energy bluetooth device: ", address, " (", name, ") Type: ");
        sbC.append(type);
        O.e.s("LeBluetoothDevice", sbC.toString());
        C2680e.c(C2673a0.f43223b, null, null, new LeBluetoothDevice$connect$2(this, remoteDevice, null), 3);
    }

    @Override // com.voltasit.obdeleven.utils.bluetooth.g, p109i8.a
    public final synchronized void b(byte b10) {
        try {
            if (this.f34317t == 20) {
                c();
            }
            byte[] bArr = this.f34318u;
            int i10 = this.f34317t;
            this.f34317t = i10 + 1;
            bArr[i10] = b10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.voltasit.obdeleven.utils.bluetooth.g, p109i8.a
    public final synchronized void c() {
        final byte[] bArrCopyOf = Arrays.copyOf(this.f34318u, this.f34317t);
        kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(...)");
        Task taskContinueWithTask = this.f34321x.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.p
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                Task task2;
                LeBluetoothDevice this$0 = this.f34378a;
                byte[] bArr = bArrCopyOf;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                synchronized (this$0) {
                    BluetoothGatt bluetoothGatt = this$0.f34305A;
                    task2 = null;
                    if (bluetoothGatt == null) {
                        O.e.D("LeBluetoothDevice", "Gatt server is null during writeTask()");
                    } else {
                        BluetoothGattCharacteristic bluetoothGattCharacteristicM = LeBluetoothDevice.m(bluetoothGatt, "0000ffe0-0000-1000-8000-00805f9b34fb", "0000ffe1-0000-1000-8000-00805f9b34fb");
                        if (bluetoothGattCharacteristicM == null) {
                            O.e.D("LeBluetoothDevice", "Unable to write to bluetooth. Characteristic is null");
                        } else {
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            C2680e.c(C2673a0.f43223b, null, null, new LeBluetoothDevice$writeTask$1(this$0, bluetoothGattCharacteristicM, bArr, bluetoothGatt, taskCompletionSource, null), 3);
                            task2 = taskCompletionSource.getTask();
                        }
                    }
                }
                return task2;
            }
        });
        kotlin.jvm.internal.i.d(taskContinueWithTask, "continueWithTask(...)");
        this.f34321x = taskContinueWithTask;
        this.f34317t = 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        LeBluetoothDevice$bootIntoFWUpdateMode$1 leBluetoothDevice$bootIntoFWUpdateMode$1;
        LeBluetoothDevice leBluetoothDevice;
        if (continuationImpl instanceof LeBluetoothDevice$bootIntoFWUpdateMode$1) {
            leBluetoothDevice$bootIntoFWUpdateMode$1 = (LeBluetoothDevice$bootIntoFWUpdateMode$1) continuationImpl;
            int i10 = leBluetoothDevice$bootIntoFWUpdateMode$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$bootIntoFWUpdateMode$1.label = i10 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$bootIntoFWUpdateMode$1 = new LeBluetoothDevice$bootIntoFWUpdateMode$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$bootIntoFWUpdateMode$1 = new LeBluetoothDevice$bootIntoFWUpdateMode$1(this, continuationImpl);
        }
        Object objR = leBluetoothDevice$bootIntoFWUpdateMode$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = leBluetoothDevice$bootIntoFWUpdateMode$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$bootIntoFWUpdateMode$1.L$0;
                kotlin.b.b(objR);
            } else if (i11 == 2) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$bootIntoFWUpdateMode$1.L$0;
                kotlin.b.b(objR);
                h(leBluetoothDevice);
                leBluetoothDevice$bootIntoFWUpdateMode$1.L$0 = null;
                leBluetoothDevice$bootIntoFWUpdateMode$1.label = 3;
                if (I.b(5000L, leBluetoothDevice$bootIntoFWUpdateMode$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objR);
            }
            return Boolean.TRUE;
        }
        kotlin.b.b(objR);
        O.e.s("LeBluetoothDevice", "bootIntoFWUpdateMode()");
        BluetoothGatt bluetoothGatt = this.f34305A;
        if (bluetoothGatt == null) {
            return Boolean.FALSE;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = m(bluetoothGatt, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb");
        if (bluetoothGattCharacteristicM == null) {
            return Boolean.FALSE;
        }
        byte[] bArr = {-79, -4, -14, 0};
        kotlin.collections.k.Y(bArr);
        leBluetoothDevice$bootIntoFWUpdateMode$1.L$0 = this;
        leBluetoothDevice$bootIntoFWUpdateMode$1.label = 1;
        objR = r(bluetoothGattCharacteristicM, bArr, bluetoothGatt, leBluetoothDevice$bootIntoFWUpdateMode$1);
        if (objR == coroutineSingletons) {
            return coroutineSingletons;
        }
        leBluetoothDevice = this;
        if (!((Boolean) objR).booleanValue()) {
            return Boolean.FALSE;
        }
        leBluetoothDevice$bootIntoFWUpdateMode$1.L$0 = leBluetoothDevice;
        leBluetoothDevice$bootIntoFWUpdateMode$1.label = 2;
        if (I.b(4000L, leBluetoothDevice$bootIntoFWUpdateMode$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        h(leBluetoothDevice);
        leBluetoothDevice$bootIntoFWUpdateMode$1.L$0 = null;
        leBluetoothDevice$bootIntoFWUpdateMode$1.label = 3;
        if (I.b(5000L, leBluetoothDevice$bootIntoFWUpdateMode$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Boolean.TRUE;
    }

    public final void f(Throwable th, boolean z10) {
        O.e.s("LeBluetoothDevice", "closeBluetoothConnection(showError: " + z10 + ")");
        if (this.f34323z) {
            int i10 = z10 ? 3 : 0;
            o oVar = this.f34316s;
            if (oVar == null) {
                kotlin.jvm.internal.i.m("leDevice");
                throw null;
            }
            this.f34343g.g(i10, oVar, th);
        }
        if (this.f34316s == null) {
            kotlin.jvm.internal.i.m("leDevice");
            throw null;
        }
        W7.c.f7066d = null;
        this.f34340d = 0;
        g(this.f34305A);
    }

    public final void g(BluetoothGatt bluetoothGatt) {
        O.e.s("LeBluetoothDevice", "closeGattConnection()");
        if (bluetoothGatt == null) {
            O.e.j("LeBluetoothDevice", "gattServer was null");
            return;
        }
        bluetoothGatt.close();
        this.f34305A = null;
        O.e.j("LeBluetoothDevice", "gattServer close() success");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, xa.g] */
    public final Object i(o oVar, ContinuationImpl continuationImpl) throws Exception {
        LeBluetoothDevice$connect$1 leBluetoothDevice$connect$1;
        LeBluetoothDevice leBluetoothDevice;
        if (continuationImpl instanceof LeBluetoothDevice$connect$1) {
            leBluetoothDevice$connect$1 = (LeBluetoothDevice$connect$1) continuationImpl;
            int i10 = leBluetoothDevice$connect$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$connect$1.label = i10 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$connect$1 = new LeBluetoothDevice$connect$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$connect$1 = new LeBluetoothDevice$connect$1(this, continuationImpl);
        }
        Object objJ = leBluetoothDevice$connect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = leBluetoothDevice$connect$1.label;
        if (i11 == 0) {
            kotlin.b.b(objJ);
            this.f34316s = oVar;
            String str = oVar.f34367b;
            kotlin.jvm.internal.i.b(str);
            BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.f34309l.getValue();
            BluetoothDevice remoteDevice = bluetoothAdapter != null ? bluetoothAdapter.getRemoteDevice(str) : null;
            if (remoteDevice == null) {
                throw new Exception("No bluetooth adapter");
            }
            String address = remoteDevice.getAddress();
            String name = remoteDevice.getName();
            int type = remoteDevice.getType();
            StringBuilder sbC = B6.a.c("Connecting to low energy bluetooth device: ", address, " (", name, ") Type: ");
            sbC.append(type);
            O.e.s("LeBluetoothDevice", sbC.toString());
            leBluetoothDevice$connect$1.L$0 = this;
            leBluetoothDevice$connect$1.label = 1;
            objJ = j(remoteDevice, leBluetoothDevice$connect$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
            leBluetoothDevice = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$connect$1.L$0;
            kotlin.b.b(objJ);
        }
        C8.a aVar = (C8.a) objJ;
        if (aVar instanceof C8.a.C0024a) {
            O.e.D("LeBluetoothDevice", "Unable to connect to bluetooth");
            leBluetoothDevice.f(((C8.a.C0024a) aVar).f2462a, true);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007a -> B:21:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(android.bluetooth.BluetoothDevice r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            r0 = 1
            boolean r1 = r13 instanceof com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$connectWithRetries$1
            if (r1 == 0) goto L14
            r1 = r13
            com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$connectWithRetries$1 r1 = (com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$connectWithRetries$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.label = r2
            goto L19
        L14:
            com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$connectWithRetries$1 r1 = new com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$connectWithRetries$1
            r1.<init>(r11, r13)
        L19:
            java.lang.Object r13 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r3 = r1.label
            r4 = 0
            java.lang.String r5 = "LeBluetoothDevice"
            if (r3 == 0) goto L3c
            if (r3 != r0) goto L34
            int r12 = r1.I$0
            java.lang.Object r3 = r1.L$1
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3
            java.lang.Object r6 = r1.L$0
            com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice r6 = (com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice) r6
            kotlin.b.b(r13)
            goto L7d
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            kotlin.b.b(r13)
            r6 = r11
            r13 = r12
            r12 = r4
        L42:
            r3 = 10
            if (r12 >= r3) goto Lb9
            r1.L$0 = r6
            r1.L$1 = r13
            r1.I$0 = r12
            r1.label = r0
            r6.getClass()
            kotlinx.coroutines.i r3 = new kotlinx.coroutines.i
            kotlin.coroutines.c r7 = A8.p.y(r1)
            r3.<init>(r0, r7)
            r3.s()
            java.lang.String r7 = "connectToGattServer()"
            O.e.s(r5, r7)
            long r7 = java.lang.System.currentTimeMillis()
            com.voltasit.obdeleven.utils.bluetooth.q r9 = new com.voltasit.obdeleven.utils.bluetooth.q
            r9.<init>(r6, r3, r7)
            r7 = 2
            android.content.Context r8 = r6.f34308k
            r13.connectGatt(r8, r4, r9, r7)
            java.lang.Object r3 = r3.p()
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            if (r3 != r2) goto L7a
            return r2
        L7a:
            r10 = r3
            r3 = r13
            r13 = r10
        L7d:
            C8.a r13 = (C8.a) r13
            boolean r7 = r13 instanceof C8.a.b
            if (r7 == 0) goto L89
            java.lang.String r12 = "Connected to gatt server in boot mode"
            O.e.j(r5, r12)
            goto Lb9
        L89:
            boolean r7 = r13 instanceof C8.a.C0024a
            if (r7 == 0) goto Lb6
            C8.a$a r13 = (C8.a.C0024a) r13
            java.lang.Throwable r7 = r13.f2462a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed iteration: "
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r9 = ". Error: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            O.e.D(r5, r7)
            r7 = 9
            if (r12 != r7) goto Lb6
            C8.a$a r12 = new C8.a$a
            java.lang.Throwable r13 = r13.f2462a
            r12.<init>(r13)
            return r12
        Lb6:
            int r12 = r12 + r0
            r13 = r3
            goto L42
        Lb9:
            C8.a$b r12 = new C8.a$b
            xa.r r13 = p293xa.r.f47939a
            r12.<init>(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice.j(android.bluetooth.BluetoothDevice, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object k(boolean z10, kotlin.coroutines.c<? super BluetoothDevice> cVar) {
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        O.e.s("LeBluetoothDevice", "discoverDevice");
        BluetoothLeScanner bluetoothLeScanner = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
        List<ScanFilter> listK = M1.k(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(z10 ? "0000ffe3-0000-1000-8000-00805f9b34fb" : "0000ffe0-0000-1000-8000-00805f9b34fb")).build());
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        kotlin.jvm.internal.i.d(scanSettingsBuild, "build(...)");
        kotlin.jvm.internal.i.b(bluetoothLeScanner);
        bluetoothLeScanner.startScan(listK, scanSettingsBuild, new r(this, bluetoothLeScanner, c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, String str, ContinuationImpl continuationImpl) {
        LeBluetoothDevice$enableCharacteristicNotifications$1 leBluetoothDevice$enableCharacteristicNotifications$1;
        boolean zWriteDescriptor;
        if (continuationImpl instanceof LeBluetoothDevice$enableCharacteristicNotifications$1) {
            leBluetoothDevice$enableCharacteristicNotifications$1 = (LeBluetoothDevice$enableCharacteristicNotifications$1) continuationImpl;
            int i10 = leBluetoothDevice$enableCharacteristicNotifications$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$enableCharacteristicNotifications$1.label = i10 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$enableCharacteristicNotifications$1 = new LeBluetoothDevice$enableCharacteristicNotifications$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$enableCharacteristicNotifications$1 = new LeBluetoothDevice$enableCharacteristicNotifications$1(this, continuationImpl);
        }
        Object obj = leBluetoothDevice$enableCharacteristicNotifications$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = leBluetoothDevice$enableCharacteristicNotifications$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            boolean characteristicNotification = bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
            O.e.j("LeBluetoothDevice", "setCharacteristicNotification result: " + characteristicNotification);
            if (!characteristicNotification) {
                return Boolean.FALSE;
            }
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(O.h.o(str));
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            zWriteDescriptor = bluetoothGatt.writeDescriptor(descriptor);
            O.e.j("LeBluetoothDevice", "writeDescriptor(" + str + ") result: " + zWriteDescriptor);
            leBluetoothDevice$enableCharacteristicNotifications$1.Z$0 = zWriteDescriptor;
            leBluetoothDevice$enableCharacteristicNotifications$1.label = 1;
            if (I.b(500L, leBluetoothDevice$enableCharacteristicNotifications$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zWriteDescriptor = leBluetoothDevice$enableCharacteristicNotifications$1.Z$0;
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(zWriteDescriptor);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(ContinuationImpl continuationImpl) throws Throwable {
        LeBluetoothDevice$getCurrentVersion$1 leBluetoothDevice$getCurrentVersion$1;
        BluetoothGattCharacteristic bluetoothGattCharacteristicM;
        BluetoothGatt bluetoothGatt;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        byte[] bArr;
        LeBluetoothDevice leBluetoothDevice;
        if (continuationImpl instanceof LeBluetoothDevice$getCurrentVersion$1) {
            leBluetoothDevice$getCurrentVersion$1 = (LeBluetoothDevice$getCurrentVersion$1) continuationImpl;
            int i10 = leBluetoothDevice$getCurrentVersion$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$getCurrentVersion$1.label = i10 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$getCurrentVersion$1 = new LeBluetoothDevice$getCurrentVersion$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$getCurrentVersion$1 = new LeBluetoothDevice$getCurrentVersion$1(this, continuationImpl);
        }
        Object objR = leBluetoothDevice$getCurrentVersion$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = leBluetoothDevice$getCurrentVersion$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                byte[] bArr2 = (byte[]) leBluetoothDevice$getCurrentVersion$1.L$3;
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) leBluetoothDevice$getCurrentVersion$1.L$2;
                BluetoothGatt bluetoothGatt2 = (BluetoothGatt) leBluetoothDevice$getCurrentVersion$1.L$1;
                LeBluetoothDevice leBluetoothDevice2 = (LeBluetoothDevice) leBluetoothDevice$getCurrentVersion$1.L$0;
                kotlin.b.b(objR);
                bArr = bArr2;
                leBluetoothDevice = leBluetoothDevice2;
                bluetoothGatt = bluetoothGatt2;
                bluetoothGattCharacteristic = bluetoothGattCharacteristic2;
            } else if (i11 == 2) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$getCurrentVersion$1.L$0;
                kotlin.b.b(objR);
                if (((Boolean) objR).booleanValue()) {
                    return "";
                }
                BufferedChannel bufferedChannel = leBluetoothDevice.f34310m;
                leBluetoothDevice$getCurrentVersion$1.L$0 = null;
                leBluetoothDevice$getCurrentVersion$1.label = 3;
                objR = bufferedChannel.d(leBluetoothDevice$getCurrentVersion$1);
                if (objR == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objR);
            }
            return E8.a.g((byte[]) objR);
        }
        kotlin.b.b(objR);
        BluetoothGatt bluetoothGatt3 = this.f34305A;
        if (bluetoothGatt3 == null || (bluetoothGattCharacteristicM = m(bluetoothGatt3, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb")) == null) {
            return "";
        }
        O.e.s("LeBluetoothDevice", "Sending get app version magic");
        byte[] bArrB = E8.a.b("A565EF00");
        kotlin.collections.k.Y(bArrB);
        leBluetoothDevice$getCurrentVersion$1.L$0 = this;
        leBluetoothDevice$getCurrentVersion$1.L$1 = bluetoothGatt3;
        leBluetoothDevice$getCurrentVersion$1.L$2 = bluetoothGattCharacteristicM;
        leBluetoothDevice$getCurrentVersion$1.L$3 = bArrB;
        leBluetoothDevice$getCurrentVersion$1.label = 1;
        Object objL = l(bluetoothGatt3, bluetoothGattCharacteristicM, "00002902-0000-1000-8000-00805f9b34fb", leBluetoothDevice$getCurrentVersion$1);
        if (objL == coroutineSingletons) {
            return coroutineSingletons;
        }
        bluetoothGatt = bluetoothGatt3;
        bluetoothGattCharacteristic = bluetoothGattCharacteristicM;
        objR = objL;
        bArr = bArrB;
        leBluetoothDevice = this;
        if (!((Boolean) objR).booleanValue()) {
            O.e.D("LeBluetoothDevice", "Notifications for characteristic not enabled");
            return "";
        }
        leBluetoothDevice$getCurrentVersion$1.L$0 = leBluetoothDevice;
        leBluetoothDevice$getCurrentVersion$1.L$1 = null;
        leBluetoothDevice$getCurrentVersion$1.L$2 = null;
        leBluetoothDevice$getCurrentVersion$1.L$3 = null;
        leBluetoothDevice$getCurrentVersion$1.label = 2;
        objR = leBluetoothDevice.r(bluetoothGattCharacteristic, bArr, bluetoothGatt, leBluetoothDevice$getCurrentVersion$1);
        if (objR == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Boolean) objR).booleanValue()) {
            return "";
        }
        BufferedChannel bufferedChannel2 = leBluetoothDevice.f34310m;
        leBluetoothDevice$getCurrentVersion$1.L$0 = null;
        leBluetoothDevice$getCurrentVersion$1.label = 3;
        objR = bufferedChannel2.d(leBluetoothDevice$getCurrentVersion$1);
        if (objR == coroutineSingletons) {
            return coroutineSingletons;
        }
        return E8.a.g((byte[]) objR);
    }

    public final Object o(byte[] bArr, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        Object objF = C2680e.f(N.f43200c, new LeBluetoothDevice$loadUpdateFile$2(this, bArr, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f0 -> B:73:0x01f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0239 -> B:82:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0251 -> B:27:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x00f4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(int r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice.p(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0195 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    public final Object q(ContinuationImpl continuationImpl) throws Throwable {
        LeBluetoothDevice$updateFirmware$1 leBluetoothDevice$updateFirmware$1;
        LeBluetoothDevice leBluetoothDevice;
        int iIntValue;
        Object objS;
        int i10;
        LeBluetoothDevice leBluetoothDevice2;
        LeBluetoothDevice leBluetoothDevice3;
        LeBluetoothDevice leBluetoothDevice4;
        if (continuationImpl instanceof LeBluetoothDevice$updateFirmware$1) {
            leBluetoothDevice$updateFirmware$1 = (LeBluetoothDevice$updateFirmware$1) continuationImpl;
            int i11 = leBluetoothDevice$updateFirmware$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$updateFirmware$1.label = i11 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$updateFirmware$1 = new LeBluetoothDevice$updateFirmware$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$updateFirmware$1 = new LeBluetoothDevice$updateFirmware$1(this, continuationImpl);
        }
        Object objE = leBluetoothDevice$updateFirmware$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (leBluetoothDevice$updateFirmware$1.label) {
            case 0:
                kotlin.b.b(objE);
                this.f34320w = false;
                leBluetoothDevice$updateFirmware$1.L$0 = this;
                leBluetoothDevice$updateFirmware$1.label = 1;
                objE = e(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice = this;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.j("LeBluetoothDevice", "Unable to boot into firmware update mode");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice.f34319v = true;
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 2;
                objE = leBluetoothDevice.k(true, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 3;
                objE = leBluetoothDevice.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (objE instanceof C8.a.C0024a) {
                    O.e.D("LeBluetoothDevice", "Unable to connect to device in boot mode");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                O.e.j("LeBluetoothDevice", "Connected to gatt server");
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 4;
                objE = leBluetoothDevice.v(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iIntValue = ((Number) objE).intValue();
                if (iIntValue < 0) {
                    O.e.D("LeBluetoothDevice", "Unable to get update target");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.I$0 = iIntValue;
                leBluetoothDevice$updateFirmware$1.label = 5;
                objS = leBluetoothDevice.s(iIntValue, leBluetoothDevice$updateFirmware$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                LeBluetoothDevice leBluetoothDevice5 = leBluetoothDevice;
                i10 = iIntValue;
                objE = objS;
                leBluetoothDevice2 = leBluetoothDevice5;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write info packet");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.I$0 = i10;
                leBluetoothDevice$updateFirmware$1.label = 6;
                objE = leBluetoothDevice2.p(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 1:
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (!((Boolean) objE).booleanValue()) {
                    O.e.j("LeBluetoothDevice", "Unable to boot into firmware update mode");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice.f34319v = true;
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 2;
                objE = leBluetoothDevice.k(true, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 3;
                objE = leBluetoothDevice.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (objE instanceof C8.a.C0024a) {
                    O.e.D("LeBluetoothDevice", "Unable to connect to device in boot mode");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                O.e.j("LeBluetoothDevice", "Connected to gatt server");
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 4;
                objE = leBluetoothDevice.v(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iIntValue = ((Number) objE).intValue();
                if (iIntValue < 0) {
                    O.e.D("LeBluetoothDevice", "Unable to get update target");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.I$0 = iIntValue;
                leBluetoothDevice$updateFirmware$1.label = 5;
                objS = leBluetoothDevice.s(iIntValue, leBluetoothDevice$updateFirmware$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                LeBluetoothDevice leBluetoothDevice6 = leBluetoothDevice;
                i10 = iIntValue;
                objE = objS;
                leBluetoothDevice2 = leBluetoothDevice6;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write info packet");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.I$0 = i10;
                leBluetoothDevice$updateFirmware$1.label = 6;
                objE = leBluetoothDevice2.p(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 2:
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 3;
                objE = leBluetoothDevice.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (objE instanceof C8.a.C0024a) {
                    O.e.D("LeBluetoothDevice", "Unable to connect to device in boot mode");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                O.e.j("LeBluetoothDevice", "Connected to gatt server");
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 4;
                objE = leBluetoothDevice.v(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iIntValue = ((Number) objE).intValue();
                if (iIntValue < 0) {
                    O.e.D("LeBluetoothDevice", "Unable to get update target");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.I$0 = iIntValue;
                leBluetoothDevice$updateFirmware$1.label = 5;
                objS = leBluetoothDevice.s(iIntValue, leBluetoothDevice$updateFirmware$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                LeBluetoothDevice leBluetoothDevice7 = leBluetoothDevice;
                i10 = iIntValue;
                objE = objS;
                leBluetoothDevice2 = leBluetoothDevice7;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write info packet");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.I$0 = i10;
                leBluetoothDevice$updateFirmware$1.label = 6;
                objE = leBluetoothDevice2.p(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 3:
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (objE instanceof C8.a.C0024a) {
                    O.e.D("LeBluetoothDevice", "Unable to connect to device in boot mode");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                O.e.j("LeBluetoothDevice", "Connected to gatt server");
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.label = 4;
                objE = leBluetoothDevice.v(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iIntValue = ((Number) objE).intValue();
                if (iIntValue < 0) {
                    O.e.D("LeBluetoothDevice", "Unable to get update target");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.I$0 = iIntValue;
                leBluetoothDevice$updateFirmware$1.label = 5;
                objS = leBluetoothDevice.s(iIntValue, leBluetoothDevice$updateFirmware$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                LeBluetoothDevice leBluetoothDevice8 = leBluetoothDevice;
                i10 = iIntValue;
                objE = objS;
                leBluetoothDevice2 = leBluetoothDevice8;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write info packet");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.I$0 = i10;
                leBluetoothDevice$updateFirmware$1.label = 6;
                objE = leBluetoothDevice2.p(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 4:
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                iIntValue = ((Number) objE).intValue();
                if (iIntValue < 0) {
                    O.e.D("LeBluetoothDevice", "Unable to get update target");
                    leBluetoothDevice.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$updateFirmware$1.I$0 = iIntValue;
                leBluetoothDevice$updateFirmware$1.label = 5;
                objS = leBluetoothDevice.s(iIntValue, leBluetoothDevice$updateFirmware$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                LeBluetoothDevice leBluetoothDevice9 = leBluetoothDevice;
                i10 = iIntValue;
                objE = objS;
                leBluetoothDevice2 = leBluetoothDevice9;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write info packet");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.I$0 = i10;
                leBluetoothDevice$updateFirmware$1.label = 6;
                objE = leBluetoothDevice2.p(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 5:
                i10 = leBluetoothDevice$updateFirmware$1.I$0;
                leBluetoothDevice2 = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write info packet");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.I$0 = i10;
                leBluetoothDevice$updateFirmware$1.label = 6;
                objE = leBluetoothDevice2.p(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 6:
                i10 = leBluetoothDevice$updateFirmware$1.I$0;
                leBluetoothDevice2 = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to start firmware write procedure");
                    leBluetoothDevice2.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$updateFirmware$1.label = 7;
                objE = leBluetoothDevice2.u(i10, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 7:
                leBluetoothDevice3 = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write target config");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 8;
                objE = leBluetoothDevice3.t(leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 8:
                leBluetoothDevice3 = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (!((Boolean) objE).booleanValue()) {
                    O.e.D("LeBluetoothDevice", "Unable to write reboot command");
                    leBluetoothDevice3.f34320w = true;
                    return Boolean.FALSE;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 9;
                objE = leBluetoothDevice3.k(false, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 9:
                leBluetoothDevice3 = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                leBluetoothDevice$updateFirmware$1.L$0 = leBluetoothDevice3;
                leBluetoothDevice$updateFirmware$1.label = 10;
                objE = leBluetoothDevice3.j((BluetoothDevice) objE, leBluetoothDevice$updateFirmware$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice4 = leBluetoothDevice3;
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            case 10:
                leBluetoothDevice4 = (LeBluetoothDevice) leBluetoothDevice$updateFirmware$1.L$0;
                kotlin.b.b(objE);
                if (!(objE instanceof C8.a.C0024a)) {
                    leBluetoothDevice4.f34320w = true;
                    return Boolean.TRUE;
                }
                O.e.D("LeBluetoothDevice", "Unable to connect to device in obdeleven mode");
                leBluetoothDevice4.f34320w = true;
                return Boolean.FALSE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, xa.g] */
    public final Object r(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, BluetoothGatt bluetoothGatt, ContinuationImpl continuationImpl) {
        C2693i c2693i = new C2693i(1, A8.p.y(continuationImpl));
        c2693i.s();
        this.f34322y = c2693i;
        O.e.j("LeBluetoothDevice", "BT_WRITE(" + E8.a.g(bArr) + ")");
        bluetoothGattCharacteristic.setValue(bArr);
        boolean zWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        O.e.j("LeBluetoothDevice", "Write success: " + zWriteCharacteristic);
        if (this.f34307C) {
            J8.a aVar = (J8.a) this.f34306B.getValue();
            o oVar = this.f34316s;
            if (oVar == null) {
                kotlin.jvm.internal.i.m("leDevice");
                throw null;
            }
            String str = oVar.f34367b;
            if (str == null) {
                str = "Unknown";
            }
            aVar.m(str, zWriteCharacteristic);
        }
        this.f34307C = false;
        if (!zWriteCharacteristic) {
            c2693i.resumeWith(Boolean.FALSE);
        }
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final Object s(int i10, ContinuationImpl continuationImpl) {
        LeBluetoothDevice$writeInfoPacket$1 leBluetoothDevice$writeInfoPacket$1;
        int i11;
        int i12 = 8;
        int i13 = 0;
        if (continuationImpl instanceof LeBluetoothDevice$writeInfoPacket$1) {
            leBluetoothDevice$writeInfoPacket$1 = (LeBluetoothDevice$writeInfoPacket$1) continuationImpl;
            int i14 = leBluetoothDevice$writeInfoPacket$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$writeInfoPacket$1.label = i14 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$writeInfoPacket$1 = new LeBluetoothDevice$writeInfoPacket$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$writeInfoPacket$1 = new LeBluetoothDevice$writeInfoPacket$1(this, continuationImpl);
        }
        Object obj = leBluetoothDevice$writeInfoPacket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i15 = leBluetoothDevice$writeInfoPacket$1.label;
        if (i15 != 0) {
            if (i15 == 1) {
                kotlin.b.b(obj);
                i11 = 2;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return Boolean.TRUE;
        }
        kotlin.b.b(obj);
        O.e.s("LeBluetoothDevice", "writeInfoPacket(" + i10 + ")");
        BluetoothGatt bluetoothGatt = this.f34305A;
        if (bluetoothGatt == null) {
            return Boolean.FALSE;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = m(bluetoothGatt, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb");
        if (bluetoothGattCharacteristicM == null) {
            return Boolean.FALSE;
        }
        int i16 = i10 == 2 ? this.f34312o : 0;
        byte[] bArr = {13, 0};
        byte[] bArr2 = {2};
        int i17 = i16 + 4;
        byte[] bArrT = Q3.d.t(this.f34311n, i17, i16 + 8);
        byte[] bArrT2 = Q3.d.t(this.f34311n, i16, i17);
        byte[] bArrG = Q3.d.G(Q3.d.G(bArr2, bArrT), bArrT2);
        int length = bArrG.length;
        int i18 = 0;
        while (i13 < length) {
            int i19 = bArrG[i13];
            byte[] bArr3 = bArrG;
            int i20 = 0;
            while (i20 < i12) {
                int i21 = i18 & 1;
                i18 >>>= 1;
                int i22 = i19 & 1;
                i19 >>>= 1;
                if ((i21 ^ i22) == 1) {
                    i18 = 40961 ^ i18;
                }
                i20++;
                i12 = 8;
            }
            i13++;
            bArrG = bArr3;
            i12 = 8;
        }
        O.e.s("LeBluetoothDevice", "crc16 " + i18);
        byte[] bArrE = E8.a.e((short) i18);
        kotlin.collections.k.Y(bArrE);
        O.e.l("LeBluetoothDevice", "cmdCRC16 method2 - ".concat(E8.a.g(bArrE)));
        byte[] bArrG2 = Q3.d.G(Q3.d.G(Q3.d.G(Q3.d.G(bArr, bArrE), bArr2), bArrT), bArrT2);
        leBluetoothDevice$writeInfoPacket$1.label = 1;
        if (r(bluetoothGattCharacteristicM, bArrG2, bluetoothGatt, leBluetoothDevice$writeInfoPacket$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        i11 = 2;
        leBluetoothDevice$writeInfoPacket$1.label = i11;
        if (I.b(500L, leBluetoothDevice$writeInfoPacket$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Boolean.TRUE;
    }

    @Override // com.voltasit.obdeleven.utils.bluetooth.g, p109i8.a
    public final synchronized void stop() {
        O.e.s("LeBluetoothDevice", "stop()");
        f(null, false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(ContinuationImpl continuationImpl) {
        LeBluetoothDevice$writeReboot$1 leBluetoothDevice$writeReboot$1;
        LeBluetoothDevice leBluetoothDevice;
        if (continuationImpl instanceof LeBluetoothDevice$writeReboot$1) {
            leBluetoothDevice$writeReboot$1 = (LeBluetoothDevice$writeReboot$1) continuationImpl;
            int i10 = leBluetoothDevice$writeReboot$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$writeReboot$1.label = i10 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$writeReboot$1 = new LeBluetoothDevice$writeReboot$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$writeReboot$1 = new LeBluetoothDevice$writeReboot$1(this, continuationImpl);
        }
        Object obj = leBluetoothDevice$writeReboot$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = leBluetoothDevice$writeReboot$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$writeReboot$1.L$0;
                kotlin.b.b(obj);
            } else if (i11 == 2) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$writeReboot$1.L$0;
                kotlin.b.b(obj);
                h(leBluetoothDevice);
                leBluetoothDevice$writeReboot$1.L$0 = null;
                leBluetoothDevice$writeReboot$1.label = 3;
                if (I.b(5000L, leBluetoothDevice$writeReboot$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return Boolean.TRUE;
        }
        kotlin.b.b(obj);
        O.e.s("LeBluetoothDevice", "writeReboot()");
        BluetoothGatt bluetoothGatt = this.f34305A;
        if (bluetoothGatt == null) {
            return Boolean.FALSE;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = m(bluetoothGatt, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb");
        if (bluetoothGattCharacteristicM == null) {
            return Boolean.FALSE;
        }
        byte[] bArrB = E8.a.b("64E45E00");
        kotlin.collections.k.Y(bArrB);
        leBluetoothDevice$writeReboot$1.L$0 = this;
        leBluetoothDevice$writeReboot$1.label = 1;
        if (r(bluetoothGattCharacteristicM, bArrB, bluetoothGatt, leBluetoothDevice$writeReboot$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        leBluetoothDevice = this;
        leBluetoothDevice$writeReboot$1.L$0 = leBluetoothDevice;
        leBluetoothDevice$writeReboot$1.label = 2;
        if (I.b(4000L, leBluetoothDevice$writeReboot$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        h(leBluetoothDevice);
        leBluetoothDevice$writeReboot$1.L$0 = null;
        leBluetoothDevice$writeReboot$1.label = 3;
        if (I.b(5000L, leBluetoothDevice$writeReboot$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ab -> B:40:0x00ae). Please report as a decompilation issue!!! */
    public final Object u(int i10, ContinuationImpl continuationImpl) throws Throwable {
        LeBluetoothDevice$writeTargetConfig$1 leBluetoothDevice$writeTargetConfig$1;
        LeBluetoothDevice leBluetoothDevice;
        byte b10;
        if (continuationImpl instanceof LeBluetoothDevice$writeTargetConfig$1) {
            leBluetoothDevice$writeTargetConfig$1 = (LeBluetoothDevice$writeTargetConfig$1) continuationImpl;
            int i11 = leBluetoothDevice$writeTargetConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$writeTargetConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$writeTargetConfig$1 = new LeBluetoothDevice$writeTargetConfig$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$writeTargetConfig$1 = new LeBluetoothDevice$writeTargetConfig$1(this, continuationImpl);
        }
        Object objD = leBluetoothDevice$writeTargetConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = leBluetoothDevice$writeTargetConfig$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$writeTargetConfig$1.L$0;
                kotlin.b.b(objD);
            } else if (i12 == 2) {
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$writeTargetConfig$1.L$0;
                kotlin.b.b(objD);
                BufferedChannel bufferedChannel = leBluetoothDevice.f34310m;
                leBluetoothDevice$writeTargetConfig$1.L$0 = leBluetoothDevice;
                leBluetoothDevice$writeTargetConfig$1.label = 3;
                objD = bufferedChannel.d(leBluetoothDevice$writeTargetConfig$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$writeTargetConfig$1.L$0;
                kotlin.b.b(objD);
            }
            b10 = ((byte[]) objD)[0];
            if (b10 != 4 || b10 == 5) {
                return Boolean.TRUE;
            }
            BufferedChannel bufferedChannel2 = leBluetoothDevice.f34310m;
            leBluetoothDevice$writeTargetConfig$1.L$0 = leBluetoothDevice;
            leBluetoothDevice$writeTargetConfig$1.label = 3;
            objD = bufferedChannel2.d(leBluetoothDevice$writeTargetConfig$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            b10 = ((byte[]) objD)[0];
            if (b10 != 4) {
            }
            return Boolean.TRUE;
        }
        kotlin.b.b(objD);
        O.e.s("LeBluetoothDevice", "writeTargetConfig(target: " + i10 + ")");
        BluetoothGatt bluetoothGatt = this.f34305A;
        if (bluetoothGatt == null) {
            return Boolean.FALSE;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = m(bluetoothGatt, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb");
        if (bluetoothGattCharacteristicM == null) {
            return Boolean.FALSE;
        }
        byte[] bArrB = E8.a.b(i10 == 1 ? "DB53DE02" : "212BAD02");
        kotlin.collections.k.Y(bArrB);
        leBluetoothDevice$writeTargetConfig$1.L$0 = this;
        leBluetoothDevice$writeTargetConfig$1.label = 1;
        if (r(bluetoothGattCharacteristicM, bArrB, bluetoothGatt, leBluetoothDevice$writeTargetConfig$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        leBluetoothDevice = this;
        leBluetoothDevice$writeTargetConfig$1.L$0 = leBluetoothDevice;
        leBluetoothDevice$writeTargetConfig$1.label = 2;
        if (I.b(500L, leBluetoothDevice$writeTargetConfig$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        BufferedChannel bufferedChannel3 = leBluetoothDevice.f34310m;
        leBluetoothDevice$writeTargetConfig$1.L$0 = leBluetoothDevice;
        leBluetoothDevice$writeTargetConfig$1.label = 3;
        objD = bufferedChannel3.d(leBluetoothDevice$writeTargetConfig$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        b10 = ((byte[]) objD)[0];
        if (b10 != 4) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object v(ContinuationImpl continuationImpl) throws Throwable {
        LeBluetoothDevice$writeUpdateMagicAndGetTarget$1 leBluetoothDevice$writeUpdateMagicAndGetTarget$1;
        BluetoothGattCharacteristic bluetoothGattCharacteristicM;
        LeBluetoothDevice leBluetoothDevice;
        BluetoothGatt bluetoothGatt;
        LeBluetoothDevice leBluetoothDevice2;
        boolean zBooleanValue;
        LeBluetoothDevice leBluetoothDevice3;
        boolean z10;
        if (continuationImpl instanceof LeBluetoothDevice$writeUpdateMagicAndGetTarget$1) {
            leBluetoothDevice$writeUpdateMagicAndGetTarget$1 = (LeBluetoothDevice$writeUpdateMagicAndGetTarget$1) continuationImpl;
            int i10 = leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = i10 - Integer.MIN_VALUE;
            } else {
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1 = new LeBluetoothDevice$writeUpdateMagicAndGetTarget$1(this, continuationImpl);
            }
        } else {
            leBluetoothDevice$writeUpdateMagicAndGetTarget$1 = new LeBluetoothDevice$writeUpdateMagicAndGetTarget$1(this, continuationImpl);
        }
        Object objR = leBluetoothDevice$writeUpdateMagicAndGetTarget$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                bluetoothGattCharacteristicM = (BluetoothGattCharacteristic) leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$2;
                bluetoothGatt = (BluetoothGatt) leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$1;
                leBluetoothDevice = (LeBluetoothDevice) leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0;
                kotlin.b.b(objR);
            } else if (i11 == 2) {
                leBluetoothDevice2 = (LeBluetoothDevice) leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0;
                kotlin.b.b(objR);
                zBooleanValue = ((Boolean) objR).booleanValue();
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = leBluetoothDevice2;
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.Z$0 = zBooleanValue;
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 3;
                if (I.b(500L, leBluetoothDevice$writeUpdateMagicAndGetTarget$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                leBluetoothDevice3 = leBluetoothDevice2;
                z10 = zBooleanValue;
                if (!z10) {
                    return new Integer(-1);
                }
                BufferedChannel bufferedChannel = leBluetoothDevice3.f34310m;
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = null;
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 4;
                objR = bufferedChannel.d(leBluetoothDevice$writeUpdateMagicAndGetTarget$1);
                if (objR == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 3) {
                z10 = leBluetoothDevice$writeUpdateMagicAndGetTarget$1.Z$0;
                leBluetoothDevice3 = (LeBluetoothDevice) leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0;
                kotlin.b.b(objR);
                if (!z10) {
                    return new Integer(-1);
                }
                BufferedChannel bufferedChannel2 = leBluetoothDevice3.f34310m;
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = null;
                leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 4;
                objR = bufferedChannel2.d(leBluetoothDevice$writeUpdateMagicAndGetTarget$1);
                if (objR == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objR);
            }
            byte[] bArr = (byte[]) objR;
            O.e.j("LeBluetoothDevice", "Result: ".concat(E8.a.g(bArr)));
            return new Integer(bArr[5]);
        }
        kotlin.b.b(objR);
        O.e.s("LeBluetoothDevice", "writeUpdateMagicAndGetTarget()");
        BluetoothGatt bluetoothGatt2 = this.f34305A;
        if (bluetoothGatt2 == null) {
            return new Integer(-1);
        }
        bluetoothGattCharacteristicM = m(bluetoothGatt2, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb");
        if (bluetoothGattCharacteristicM == null) {
            return new Integer(-1);
        }
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = this;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$1 = bluetoothGatt2;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$2 = bluetoothGattCharacteristicM;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 1;
        if (l(bluetoothGatt2, bluetoothGattCharacteristicM, "00002902-0000-1000-8000-00805f9b34fb", leBluetoothDevice$writeUpdateMagicAndGetTarget$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        leBluetoothDevice = this;
        bluetoothGatt = bluetoothGatt2;
        byte[] bArr2 = {83, -66, 111, 0};
        kotlin.collections.k.Y(bArr2);
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = leBluetoothDevice;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$1 = null;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$2 = null;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 2;
        objR = leBluetoothDevice.r(bluetoothGattCharacteristicM, bArr2, bluetoothGatt, leBluetoothDevice$writeUpdateMagicAndGetTarget$1);
        if (objR == coroutineSingletons) {
            return coroutineSingletons;
        }
        leBluetoothDevice2 = leBluetoothDevice;
        zBooleanValue = ((Boolean) objR).booleanValue();
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = leBluetoothDevice2;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.Z$0 = zBooleanValue;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 3;
        if (I.b(500L, leBluetoothDevice$writeUpdateMagicAndGetTarget$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        leBluetoothDevice3 = leBluetoothDevice2;
        z10 = zBooleanValue;
        if (!z10) {
            return new Integer(-1);
        }
        BufferedChannel bufferedChannel3 = leBluetoothDevice3.f34310m;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.L$0 = null;
        leBluetoothDevice$writeUpdateMagicAndGetTarget$1.label = 4;
        objR = bufferedChannel3.d(leBluetoothDevice$writeUpdateMagicAndGetTarget$1);
        if (objR == coroutineSingletons) {
            return coroutineSingletons;
        }
        byte[] bArr3 = (byte[]) objR;
        O.e.j("LeBluetoothDevice", "Result: ".concat(E8.a.g(bArr3)));
        return new Integer(bArr3[5]);
    }
}
