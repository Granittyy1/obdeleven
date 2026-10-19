package com.voltasit.obdeleven.utils.bluetooth;

import com.google.firebase.messaging.D;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.model.fault.Fault;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2141e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p134k8.T1;
import p134k8.a2;
import p255u9.C2801d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34365b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f34364a = i10;
        this.f34365b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws ParseException {
        switch (this.f34364a) {
            case 0:
                m mVar = (m) this.f34365b;
                mVar.getClass();
                return new com.obdeleven.service.core.gen1.f("12", true).a().onSuccess(new C2141e(1, mVar));
            case 1:
                p073f9.b bVar = (p073f9.b) this.f34365b;
                ArrayList<T1> arrayListA = bVar.f35004D.a(bVar.f35018y);
                ArrayList arrayList = new ArrayList();
                for (T1 t8 : arrayListA) {
                    String str = t8.f42678a;
                    if (str == null || str.isEmpty()) {
                        Locale locale = Locale.US;
                        str = bVar.getString(R.string.common_value) + " " + (arrayListA.indexOf(t8) + 1);
                    }
                    arrayList.add(str);
                }
                bVar.f35019z.C(arrayList);
                return null;
            case 2:
                List<? extends Fault> list = (List) task.getResult();
                D d10 = (D) this.f34365b;
                p170n9.j jVar = (p170n9.j) d10.f28270c;
                jVar.Y();
                if (d10.f28269b) {
                    jVar.f31593p.f1934y.setRefreshing(false);
                } else {
                    jVar.w();
                }
                jVar.U(list);
                return null;
            default:
                a2 a2Var = (a2) this.f34365b;
                a2Var.getClass();
                List<Short> list2 = (List) task.getResult();
                p109i8.g gVar = a2Var.f42733k;
                C8.a<Map<Short, ControlUnitDB>> aVarC = gVar.c();
                if (aVarC instanceof C8.a.C0024a) {
                    throw new ParseException(((C8.a.C0024a) aVarC).f2462a);
                }
                C8.a<Map<Short, C2801d>> aVarA = gVar.a();
                if (aVarA instanceof C8.a.C0024a) {
                    throw new ParseException(((C8.a.C0024a) aVarA).f2462a);
                }
                for (Short sh : list2) {
                    short sShortValue = sh.shortValue();
                    O.e.s("Vehicle", "Parsing " + ((int) sShortValue));
                    C8.a<ControlUnitDB> aVarE = gVar.e(sShortValue);
                    if (aVarE instanceof C8.a.b) {
                        com.obdeleven.service.model.f fVar = new com.obdeleven.service.model.f((ControlUnitDB) ((C8.a.b) aVarE).f2463a, a2Var, a2Var.f42732i, a2Var.f42731h, a2Var.f42733k);
                        fVar.y(fVar);
                        a2Var.f42725b.put(sh, fVar);
                    } else {
                        O.e.m(((C8.a.C0024a) aVarE).f2462a);
                    }
                }
                return a2Var.f42731h.c(SetProtocolCommand.Protocol.NULL);
        }
    }
}
