package com.voltasit.obdeleven.domain.usecases.vehicle;

import O.e;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService;
import com.obdeleven.service.model.OBDIIService09;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.controlUnit.v;
import java.util.ArrayList;
import java.util.List;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31069c;

    public /* synthetic */ p(Object obj, int i10, Object obj2) {
        this.f31067a = i10;
        this.f31068b = obj;
        this.f31069c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task readControlUnitsTask) throws InterruptedException {
        switch (this.f31067a) {
            case 0:
                q this$0 = (q) this.f31068b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                final a2 a2Var = (a2) this.f31069c;
                kotlin.jvm.internal.i.e(readControlUnitsTask, "readControlUnitsTask");
                if (readControlUnitsTask.isFaulted()) {
                    O.e.m(readControlUnitsTask.getError());
                    return Task.forError(readControlUnitsTask.getError());
                }
                final long jCurrentTimeMillis = System.currentTimeMillis();
                int i10 = 2;
                Task taskContinueWith = a2Var.b((short) 23).onSuccess(new Continuation() { // from class: k8.W1
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task) {
                        int i11;
                        a2 a2Var2 = a2Var;
                        ControlUnit controlUnit = (ControlUnit) task.getResult();
                        long j = jCurrentTimeMillis;
                        if (controlUnit == null) {
                            e.j("Vehicle", "MileageRequestTime.no_cu: " + (System.currentTimeMillis() - j) + "ms");
                            return Boolean.FALSE;
                        }
                        if (controlUnit.G().getResult().booleanValue()) {
                            if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                                String result = controlUnit.f29335r.b("222203").getResult();
                                if (result.startsWith("622203")) {
                                    String strSubstring = result.substring(6);
                                    i11 = strSubstring.length() > 4 ? Integer.parseInt(strSubstring, 16) : Integer.parseInt(strSubstring, 16) * 10;
                                } else {
                                    i11 = -1;
                                }
                            } else {
                                Task<List<T1>> taskB = controlUnit.R(2).b(ValueUnit.f29310b);
                                try {
                                    taskB.waitForCompletion();
                                } catch (InterruptedException e10) {
                                    e.m(e10);
                                }
                                i11 = Integer.parseInt(taskB.getResult().get(0).f42679b);
                            }
                            try {
                                controlUnit.a().waitForCompletion();
                            } catch (InterruptedException e11) {
                                e.m(e11);
                            }
                            if (i11 >= 0) {
                                a2Var2.f42726c.put("mileage", Integer.valueOf(i11));
                                e.j("Vehicle", "MileageRequestTime.true: " + (System.currentTimeMillis() - j) + "ms");
                                return Boolean.TRUE;
                            }
                        }
                        e.j("Vehicle", "MileageRequestTime.false: " + (System.currentTimeMillis() - j) + "ms");
                        return Boolean.FALSE;
                    }
                }, Task.BACKGROUND_EXECUTOR).continueWithTask(new X8.r(i10, a2Var)).continueWithTask(new p009a8.c(i10, a2Var)).continueWith(new p009a8.d(i10, a2Var));
                kotlin.jvm.internal.i.d(taskContinueWith, "continueWith(...)");
                return taskContinueWith;
            case 1:
                ControlUnit controlUnit = (ControlUnit) this.f31068b;
                controlUnit.getClass();
                if (((Boolean) readControlUnitsTask.getResult()).booleanValue()) {
                    return readControlUnitsTask;
                }
                controlUnit.f29326h = (TransportProtocol) ((ArrayList) this.f31069c).get(1);
                return controlUnit.H();
            case 2:
                ControlUnit.a aVar = (ControlUnit.a) this.f31068b;
                aVar.getClass();
                String str = (String) readControlUnitsTask.getResult();
                if (str.startsWith("F6")) {
                    return ControlUnit.this.E(str, false).continueWith(new v(aVar, (String) this.f31069c, 2));
                }
                return str.startsWith("09") ? Task.forResult(0) : Task.forResult(-1);
            default:
                final OBDIICu oBDIICu = (OBDIICu) this.f31068b;
                oBDIICu.getClass();
                String str2 = (String) readControlUnitsTask.getResult();
                if (!str2.startsWith((String) this.f31069c)) {
                    O.e.D("OBDIIControlUnit", "Unsupported result: ".concat(str2));
                    return Task.forResult(new ArrayList());
                }
                ArrayList<OBDIIService09> arrayListD = OBDIIService09.d(oBDIICu.N0(str2));
                O.e.j("OBDIIControlUnit", "Extracting information for each supported pid");
                final ArrayList arrayList = new ArrayList();
                Task taskForResult = Task.forResult(null);
                for (final OBDIIService09 oBDIIService09 : arrayListD) {
                    final String str3 = OBDIIService.f29398e.a() + oBDIIService09.b();
                    taskForResult = taskForResult.continueWithTask(new Continuation() { // from class: k8.u1
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task) throws InterruptedException {
                            OBDIICu oBDIICu2 = oBDIICu;
                            oBDIICu2.getClass();
                            StringBuilder sb2 = new StringBuilder("Obtained value for: ");
                            OBDIIService09 oBDIIService010 = oBDIIService09;
                            sb2.append(oBDIIService010.b());
                            e.j("OBDIIControlUnit", sb2.toString());
                            String str4 = str3;
                            Task taskP0 = oBDIICu2.P0(0, str4);
                            taskP0.waitForCompletion();
                            String str5 = (String) taskP0.getResult();
                            String str6 = OBDIIService.f29398e.b() + oBDIIService010.b();
                            if (str5 == null || !str5.startsWith(str6)) {
                                e.D("OBDIIControlUnit", "No response for request: " + str4);
                            } else {
                                arrayList.add(new A1(oBDIIService010, str5.replaceFirst(str6, "")));
                            }
                            return taskP0;
                        }
                    }, Task.BACKGROUND_EXECUTOR);
                }
                taskForResult.waitForCompletion();
                return Task.forResult(arrayList);
        }
    }
}
