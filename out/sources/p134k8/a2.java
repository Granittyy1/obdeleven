package p134k8;

import O.e;
import V8.y;
import android.text.TextUtils;
import com.obdeleven.service.core.c;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.RequestType;
import com.obdeleven.service.exception.VehicleException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.f;
import com.obdeleven.service.util.a;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.boltsinternal.CancellationTokenSource;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2092g;
import com.voltasit.obdeleven.core.app.V;
import com.voltasit.obdeleven.presentation.controlUnit.t;
import com.voltasit.obdeleven.utils.bluetooth.l;
import com.voltasit.parse.Parse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import p109i8.g;
import p134k8.a2;
import p254u8.b;
import p255u9.C2801d;
import p255u9.D;
import p255u9.E;

/* JADX INFO: compiled from: Vehicle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f42724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f42725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f42726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f42728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CancellationTokenSource f42730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f42731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2598c f42732i;
    public OBDIICu j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f42733k;

    @Deprecated
    public a2(E e10) {
        c cVar = new c();
        C2598c c2598c = new C2598c();
        this.f42727d = false;
        this.f42730g = new CancellationTokenSource();
        this.f42726c = e10;
        this.f42725b = new HashMap();
        g gVar = (g) KoinJavaComponent.b(g.class, null, null).getValue();
        this.f42733k = gVar;
        gVar.b();
        this.f42724a = new HashMap();
        if (!h()) {
            C2598c c2598c2 = new C2598c();
            c cVar2 = new c();
            b bVar = new b();
            bVar.f47453b = c2598c2;
            bVar.f47454c = cVar2;
            bVar.f47456e = gVar;
            bVar.f47455d = this;
            this.f42728e = bVar;
        }
        this.f42731h = cVar;
        this.f42732i = c2598c;
    }

    public final void a() {
        this.f42730g.cancel();
        Iterator it = this.f42724a.values().iterator();
        while (it.hasNext()) {
            ((ControlUnit) it.next()).f29340w.cancel();
        }
        OBDIICu oBDIICu = this.j;
        if (oBDIICu != null) {
            oBDIICu.f29340w.cancel();
        }
    }

    public final Task<ControlUnit> b(final short s10) {
        e.j("Vehicle", "getControlUnitById(" + ((int) s10) + ")");
        return c(false).onSuccess(new Continuation() { // from class: k8.Y1
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                for (ControlUnit controlUnit : (List) task.getResult()) {
                    if (controlUnit.n().shortValue() == s10) {
                        return controlUnit;
                    }
                }
                return null;
            }
        });
    }

    public final Task<List<ControlUnit>> c(final boolean z10) {
        e.D("Vehicle", "getControlUnits(" + z10 + ")");
        if (!j()) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(g());
                return Task.forResult(arrayList);
            } catch (ParseException unused) {
                return Task.forError(new VehicleException(3));
            }
        }
        if (z10) {
            this.f42724a = new HashMap();
            this.f42725b = new HashMap();
        }
        HashMap map = this.f42724a;
        if (map != null && !map.isEmpty() && !z10) {
            ArrayList arrayList2 = new ArrayList(this.f42724a.values());
            Collections.sort(arrayList2, new a(0));
            return Task.forResult(arrayList2);
        }
        if (h()) {
            return e(z10).onSuccessTask(new Continuation() { // from class: k8.V1
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    a2 a2Var = this.f42686a;
                    a2Var.getClass();
                    Map map2 = (Map) task.getResult();
                    Task taskForResult = Task.forResult(null);
                    for (f fVar : map2.values()) {
                        taskForResult = taskForResult.continueWithTask(new com.parse.b(fVar, z10)).continueWith(new V(a2Var, 1, fVar));
                    }
                    return taskForResult.onSuccess(new y(4, a2Var), a2Var.f42730g.getToken());
                }
            }, this.f42730g.getToken());
        }
        final b bVar = this.f42728e;
        bVar.getClass();
        e.j("KlineControlUnitGetter", "getControlUnits()");
        return Task.callInBackground(new Callable() { // from class: u8.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() throws ParseException {
                b bVar2 = bVar;
                bVar2.getClass();
                e.j("KlineControlUnitGetter", "readControlUnits()");
                g gVar = bVar2.f47456e;
                C8.a<Map<Short, C2801d>> aVarA = gVar.a();
                if (aVarA instanceof C8.a.C0024a) {
                    throw new ParseException(((C8.a.C0024a) aVarA).f2462a);
                }
                C8.a<Map<Short, ControlUnitDB>> aVarC = gVar.c();
                if (aVarC instanceof C8.a.C0024a) {
                    throw new ParseException(((C8.a.C0024a) aVarC).f2462a);
                }
                e.j("KlineControlUnitGetter", "readControlUnitsKline()");
                bVar2.f47452a = new HashMap();
                a2 a2Var = bVar2.f47455d;
                Iterator it = a2Var.f().iterator();
                while (it.hasNext()) {
                    C8.a<ControlUnitDB> aVarE = gVar.e(((Short) it.next()).shortValue());
                    if (!(aVarE instanceof C8.a.C0024a)) {
                        ControlUnitDB controlUnitDB = (ControlUnitDB) ((C8.a.b) aVarE).f2463a;
                        Short shA = controlUnitDB.getControlUnitBase().a();
                        ControlUnit controlUnit = (ControlUnit) a2Var.f42724a.get(shA);
                        if (controlUnit == null) {
                            controlUnit = new ControlUnit(controlUnitDB, a2Var, bVar2.f47453b, bVar2.f47454c);
                        }
                        boolean z11 = !TextUtils.isEmpty(controlUnitDB.getObjectId());
                        controlUnit.f29338u.f(z11);
                        controlUnit.D0(z11);
                        bVar2.f47452a.put(shA, controlUnit);
                    }
                }
                return !bVar2.f47452a.isEmpty() ? bVar2.f47452a : new HashMap();
            }
        }).continueWith(new com.parse.a(8, this));
    }

    public final Task<f> d() {
        e.j("Vehicle", "getDefaultGatewayControlUnit()");
        return this.f42725b.containsKey((short) 25) ? Task.forResult((f) this.f42725b.get((short) 25)) : Task.callInBackground(new Callable() { // from class: k8.U1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() throws ParseException {
                a2 a2Var = this.f42683b;
                g gVar = a2Var.f42733k;
                C8.a<Map<Short, ControlUnitDB>> aVarC = gVar.c();
                if (aVarC instanceof C8.a.C0024a) {
                    throw new ParseException(((C8.a.C0024a) aVarC).f2462a);
                }
                C8.a<Map<Short, C2801d>> aVarA = gVar.a();
                if (aVarA instanceof C8.a.C0024a) {
                    throw new ParseException(((C8.a.C0024a) aVarA).f2462a);
                }
                C8.a<ControlUnitDB> aVarE = gVar.e((short) 25);
                if (aVarE instanceof C8.a.C0024a) {
                    e.m(((C8.a.C0024a) aVarE).f2462a);
                    return null;
                }
                a2Var.f42725b.put((short) 25, new f((ControlUnitDB) ((C8.a.b) aVarE).f2463a, a2Var, a2Var.f42732i, a2Var.f42731h, a2Var.f42733k));
                return (f) a2Var.f42725b.get((short) 25);
            }
        });
    }

    public final Task<Map<Short, f>> e(boolean z10) {
        e.j("Vehicle", "getGatewayControlUnit(" + z10 + ")");
        HashMap map = this.f42725b;
        if (map != null && !map.isEmpty() && !z10) {
            return Task.forResult(this.f42725b);
        }
        if (!h()) {
            return null;
        }
        e.j("Vehicle", "broadcastGatewayRequest()");
        this.f42725b = new HashMap();
        int i10 = 3;
        return this.f42731h.c(SetProtocolCommand.Protocol.CAN).onSuccessTask(new C2092g(5, this)).onSuccessTask(new com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.e(4, this)).onSuccessTask(new com.voltasit.obdeleven.presentation.settings.b(3, this)).onSuccessTask(new p022b9.a(6, this)).onSuccessTask(new p022b9.b(5, this)).onSuccessTask(new l(i10, this)).onSuccess(new t(i10, this)).continueWithTask(new com.voltasit.obdeleven.presentation.oca.b(6, this));
    }

    public final ArrayList f() {
        D dI = this.f42726c.i();
        if (dI == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (dI.getList("klineCUs") != null) {
            Iterator it = dI.getList("klineCUs").iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf(Integer.valueOf((String) it.next(), 16).shortValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OBDIICu g() throws ParseException {
        g gVar = this.f42733k;
        C8.a<Map<Short, C2801d>> aVarA = gVar.a();
        if (aVarA instanceof C8.a.C0024a) {
            throw new ParseException(((C8.a.C0024a) aVarA).f2462a);
        }
        C8.a<Map<Short, ControlUnitDB>> aVarC = gVar.c();
        if (aVarC instanceof C8.a.C0024a) {
            throw new ParseException(((C8.a.C0024a) aVarC).f2462a);
        }
        if (this.j == null) {
            C8.a<ControlUnitDB> aVarE = gVar.e((short) 51);
            if (aVarE instanceof C8.a.C0024a) {
                e.D("Vehicle", "OBDII Control unit not found");
                return null;
            }
            OBDIICu oBDIICu = new OBDIICu((ControlUnitDB) ((C8.a.b) aVarE).f2463a, this);
            this.j = oBDIICu;
            p266v8.a aVar = oBDIICu.f29383B;
            aVar.f47670c = true;
            aVar.f47669b = true;
        }
        return this.j;
    }

    public final boolean h() {
        return f() == null || f().isEmpty();
    }

    public final boolean i(ControlUnit controlUnit) throws Exception {
        e.s("Vehicle", "isPopTheHoodRequired()");
        D dI = this.f42726c.i();
        boolean z10 = false;
        if (dI == null || !dI.getBoolean("isFirewallProtected")) {
            return false;
        }
        p279w9.a aVar = new p279w9.a(B7.b.c("POP_THE_HOOD_CHECK", dI.getObjectId()), 86400000L);
        Object objE = Parse.f34395b.i().e(aVar);
        if (objE != null && ((Boolean) objE).booleanValue()) {
            e.j("Vehicle", "Ignoring check because it was already done recently");
            return false;
        }
        if (controlUnit != null && controlUnit.f29324f != null && controlUnit.f29324f.d()) {
            controlUnit.J();
        }
        Task<f> taskD = d();
        taskD.waitForCompletion();
        if (taskD.isFaulted()) {
            throw taskD.getError();
        }
        f result = taskD.getResult();
        result.getClass();
        e.s("GatewayControlUnit", "isPopTheHoodRequired()");
        if (result.f29327i != ApplicationProtocol.f29264d) {
            e.j("GatewayControlUnit", "Skipping check because of non uds protocol: " + result.f29327i.name());
        } else {
            Task<Boolean> taskG = result.G();
            if (taskG.isFaulted()) {
                e.l("GatewayControlUnit", "Connect task is faulted");
                e.m(taskG.getError());
            } else {
                e.j("GatewayControlUnit", "Getting diagnosis filter status");
                Task<String> taskS0 = result.s0(RequestType.DiagnosisFilterStatus.a());
                taskS0.waitForCompletion();
                if (taskS0.isFaulted()) {
                    e.l("GatewayControlUnit", "Diagnosis filter status task is faulted");
                    e.m(taskS0.getError());
                } else {
                    String result2 = taskS0.getResult();
                    e.j("GatewayControlUnit", "Received result: " + result2);
                    if (result2.startsWith("62539B")) {
                        boolean z11 = Integer.parseInt(result2.substring(6, 8), 16) == 1;
                        boolean z12 = Integer.parseInt(result2.substring(8, 10), 16) == 1;
                        e.j("GatewayControlUnit", "isFunctionActive = " + z11 + ", isFilterActive = " + z12);
                        if (z11 && z12) {
                            z10 = true;
                        }
                    } else {
                        e.D("GatewayControlUnit", "Unhandled response to firewall check: ".concat(result2));
                    }
                }
                if (result.J()) {
                    e.j("GatewayControlUnit", "Disconnected from gateway control unit");
                } else {
                    e.l("GatewayControlUnit", "Disconnect task is faulted");
                }
            }
        }
        if (!z10) {
            Parse.f34395b.i().h(aVar, Boolean.TRUE);
        }
        return z10;
    }

    public final boolean j() {
        return this.f42726c.i().getBoolean("supported");
    }
}
