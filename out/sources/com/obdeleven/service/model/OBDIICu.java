package com.obdeleven.service.model;

import O.e;
import V8.j;
import V8.n;
import V8.p;
import V8.q;
import V8.r;
import V8.x;
import V8.y;
import android.os.Handler;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.fault.Fault;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.B;
import com.voltasit.obdeleven.core.app.C2087b0;
import com.voltasit.obdeleven.core.app.C2088c;
import com.voltasit.obdeleven.core.app.C2110z;
import com.voltasit.obdeleven.core.app.E;
import com.voltasit.obdeleven.core.app.G;
import com.voltasit.obdeleven.presentation.controlUnit.k;
import com.voltasit.obdeleven.presentation.vehicleInfo.h;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p109i8.i;
import p134k8.C2595b;
import p134k8.C2647s1;
import p134k8.D1;
import p134k8.a2;

/* JADX INFO: loaded from: classes3.dex */
public final class OBDIICu extends ControlUnit implements i {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p266v8.a f29383B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public OBDIIProtocol f29384C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f29385D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f29386E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Thread f29387F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile boolean f29388G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile boolean f29389H;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OBDIIProtocol {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OBDIIProtocol f29390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OBDIIProtocol f29391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final OBDIIProtocol f29392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final OBDIIProtocol f29393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ OBDIIProtocol[] f29394f;

        static {
            OBDIIProtocol oBDIIProtocol = new OBDIIProtocol("UNKNOWN", 0);
            f29390b = oBDIIProtocol;
            OBDIIProtocol oBDIIProtocol2 = new OBDIIProtocol("ISO_9141", 1);
            f29391c = oBDIIProtocol2;
            OBDIIProtocol oBDIIProtocol3 = new OBDIIProtocol("ISO_14230", 2);
            f29392d = oBDIIProtocol3;
            OBDIIProtocol oBDIIProtocol4 = new OBDIIProtocol("ISO_15765", 3);
            f29393e = oBDIIProtocol4;
            f29394f = new OBDIIProtocol[]{oBDIIProtocol, oBDIIProtocol2, oBDIIProtocol3, oBDIIProtocol4};
        }

        public OBDIIProtocol() {
            throw null;
        }

        public static OBDIIProtocol valueOf(String str) {
            return (OBDIIProtocol) Enum.valueOf(OBDIIProtocol.class, str);
        }

        public static OBDIIProtocol[] values() {
            return (OBDIIProtocol[]) f29394f.clone();
        }
    }

    public OBDIICu(ControlUnitDB controlUnitDB, a2 a2Var) {
        super(controlUnitDB, a2Var, null, new com.obdeleven.service.core.c());
        this.f29384C = OBDIIProtocol.f29390b;
        this.f29386E = 0L;
        this.f29388G = false;
        this.f29389H = false;
        this.f29383B = new p266v8.a();
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final void D0(boolean z10) {
        this.f29383B.f47670c = z10;
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final Task<Boolean> H() {
        Task taskContinueWithTask;
        O.e.s("OBDIIControlUnit", "connectTask()");
        int iOrdinal = this.f29384C.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            O.e.j("OBDIIControlUnit", "OBDII protocol: ISO 9141 or 14230");
            taskContinueWithTask = Task.delay((this.f29386E + 5000) - System.currentTimeMillis()).continueWithTask(new p022b9.b(4, this));
        } else {
            if (iOrdinal != 3) {
                O.e.j("OBDIIControlUnit", "Unknown OBDII protocol");
                this.f29384C = OBDIIProtocol.f29393e;
                return H().continueWithTask(new B(6, this)).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.b(3, this));
            }
            O.e.j("OBDIIControlUnit", "OBDII protocol: ISO 15765");
            O.e.j(t() + "_" + getName(), "connectCAN()");
            taskContinueWithTask = new SetProtocolCommand(SetProtocolCommand.Protocol.ISO_TP).a().onSuccessTask(new E(2)).onSuccessTask(new G(3)).onSuccessTask(new n(8, this)).continueWithTask(new p(5, this)).onSuccess(new q(3, this));
        }
        return taskContinueWithTask.continueWith(new com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.e(3, this));
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final ArrayList M() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SupportedFunction.f29281b);
        arrayList.add(SupportedFunction.f29282c);
        arrayList.add(SupportedFunction.f29285f);
        return arrayList;
    }

    public final ArrayList N0(String str) {
        O.e.j("OBDIIControlUnit", t() + "_" + getName() + ": decodePIDs(" + str + ")");
        ArrayList arrayList = new ArrayList();
        int i10 = Integer.parseInt(str.substring(2, 4), 16);
        String strSubstring = str.substring(4, 12);
        char[] cArr = com.obdeleven.service.util.b.f29554a;
        int length = (strSubstring.length() / 2) * 8;
        byte[] bArr = new byte[length];
        StringBuilder sb2 = new StringBuilder(new BigInteger(strSubstring, 16).toString(2));
        while (sb2.length() < length) {
            sb2.insert(0, 0);
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (sb2.charAt((length - 1) - i11) == '0') {
                bArr[i11] = 0;
            } else {
                bArr[i11] = 1;
            }
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (bArr[(length - 1) - i12] == 1) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(i10 + 1 + i12));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                arrayList.add(sb3.toString().toUpperCase());
            }
        }
        return arrayList;
    }

    public final Task<List<Fault>> O0() {
        Task<Boolean> taskD = D(false);
        p009a8.d dVar = new p009a8.d(5, this);
        ExecutorService executorService = Task.BACKGROUND_EXECUTOR;
        return taskD.continueWithTask(dVar, executorService).continueWithTask(new p009a8.e(5, this), executorService).continueWithTask(new p009a8.f(5, this), executorService).continueWithTask(new C2110z(2), executorService).continueWithTask(new C2647s1(this, 0), executorService);
    }

    public final Task P0(int i10, String str) {
        if (this.f29384C == OBDIIProtocol.f29390b) {
            return Task.forError(new CommandException(-4));
        }
        return this.f29324f == null ? Task.forError(new CommandException(-2)) : this.f29324f.g(str).onSuccessTask(new C2595b(i10, this, str));
    }

    public final Task<String> Q0(int i10) {
        O.e.j(t() + "_" + getName(), "requestMeasurement(" + i10 + ")");
        String hexString = Integer.toHexString(i10);
        if (hexString.length() < 2) {
            hexString = "0".concat(hexString);
        }
        String upperCase = hexString.toUpperCase();
        return P0(0, "01" + upperCase).onSuccess(new r(4, upperCase));
    }

    public final Task<List<String>> R0() {
        O.e.j(t() + "_" + getName(), "requestSupportedMeasurementPids()");
        this.f29385D = new ArrayList();
        int i10 = 6;
        Task taskContinueWithTask = P0(0, "0100").continueWithTask(new com.parse.b(i10, this)).continueWithTask(new x(i10, this));
        int i11 = 3;
        return taskContinueWithTask.continueWithTask(new y(i11, this)).continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(i11, this)).continueWith(new k(2, this));
    }

    @Override // com.obdeleven.service.model.ControlUnit, p109i8.e
    public final Task<Boolean> a() {
        O.e.j(t() + "_" + getName(), "disconnect()");
        Task taskContinueWithTask = ControlUnit.f29318A.continueWithTask(new j(6, this));
        ControlUnit.f29318A = taskContinueWithTask;
        return taskContinueWithTask;
    }

    @Override // com.obdeleven.service.model.ControlUnit, p109i8.f
    public final boolean b() {
        return this.f29383B.f47669b;
    }

    @Override // com.obdeleven.service.model.ControlUnit, p109i8.e
    public final Task<Boolean> c() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final List<D1> c0(boolean z10) {
        return new ArrayList();
    }

    @Override // p109i8.i
    public final Task<List<p109i8.j>> g() {
        O.e.j("OBDIIControlUnit", t() + "_" + getName() + ": requestSupportedPids()");
        Task<Boolean> taskD = D(false);
        C2088c c2088c = new C2088c(4, this);
        ExecutorService executorService = Task.BACKGROUND_EXECUTOR;
        return taskD.continueWithTask(c2088c, executorService).continueWithTask(new C2087b0(1), executorService).continueWithTask(new com.voltasit.obdeleven.presentation.oca.b(5, this), executorService);
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final Task<Void> h0(List<D1> list) {
        return Task.forResult(null);
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final Task<Boolean> i0() {
        this.f29329l = new ArrayList();
        return Task.forResult(Boolean.TRUE);
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final boolean j0() {
        return this.f29383B.f47670c;
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final boolean k0() {
        return this.f29383B.c();
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final boolean l0() {
        return false;
    }

    @Override // p109i8.i
    public final synchronized void m(i.b bVar) {
        O.e.j("OBDIIControlUnit", "Stopping requests for live data");
        if (this.f29389H) {
            O.e.j("OBDIIControlUnit", "Background thread is already being stopped");
        } else {
            a().continueWith(new p009a8.e(6, bVar), Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final Task<Boolean> n0() {
        return Task.forResult(Boolean.TRUE);
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final Task<Boolean> p0(boolean z10, boolean z11) {
        O.e.j("OBDIIControlUnit", t() + "_" + getName() + ": readFaults()");
        return O0().continueWith(new p085g9.i(this, 1));
    }

    @Override // p109i8.i
    public final void r(List<p109i8.j> list, i.a aVar) {
        Handler handler = new Handler();
        O.e.j("OBDIIControlUnit", "Started request for live data");
        Task.callInBackground(new p079g3.c(this, 1, list)).continueWith(new V8.f(handler, 3, aVar), Task.UI_THREAD_EXECUTOR);
    }

    @Override // p109i8.i
    public final synchronized void v(final ArrayList arrayList, final i.a aVar) {
        if (arrayList.isEmpty()) {
            O.e.j("OBDIIControlUnit", "Can't start requesting live data because command list is empty");
            return;
        }
        final Handler handler = new Handler();
        O.e.j("OBDIIControlUnit", "Starting requests for live data");
        Thread thread = new Thread(new Runnable() { // from class: k8.x1
            @Override // java.lang.Runnable
            public final void run() {
                OBDIICu oBDIICu = this.f42872b;
                ArrayList<p109i8.j> arrayList2 = arrayList;
                Handler handler2 = handler;
                i.a aVar2 = aVar;
                oBDIICu.getClass();
                try {
                    oBDIICu.D(false).waitForCompletion();
                    e.j("OBDIIControlUnit", "Connected to control unit");
                    while (oBDIICu.f29388G) {
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            for (p109i8.j jVar : arrayList2) {
                                Task<String> taskQ0 = oBDIICu.Q0(Integer.parseInt(jVar.b(), 16));
                                taskQ0.waitForCompletion();
                                if (taskQ0.getError() == null) {
                                    arrayList3.add(new A1(jVar, taskQ0.getResult()));
                                }
                            }
                        } catch (InterruptedException e10) {
                            e.D("OBDIIControlUnit", "Live data thread was interrupted during request");
                            e.m(e10);
                        }
                        handler2.post(new h(oBDIICu, aVar2, arrayList3, 1));
                    }
                    e.j("OBDIIControlUnit", "Background thread finished work");
                } catch (InterruptedException e11) {
                    e.D("OBDIIControlUnit", "Live data thread was interrupted during connect");
                    e.m(e11);
                }
            }
        });
        this.f29387F = thread;
        thread.start();
        this.f29388G = true;
    }

    @Override // com.obdeleven.service.model.ControlUnit
    public final boolean z(boolean z10) {
        p266v8.a aVar = this.f29383B;
        aVar.f47669b = z10;
        aVar.f47670c = z10;
        if (z10 && b0() != null) {
            this.f29320b.setProtocol(b0());
        }
        return z10;
    }
}
