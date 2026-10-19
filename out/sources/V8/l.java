package V8;

import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.lifecycle.Z;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.G;
import com.voltasit.obdeleven.core.app.v0;
import com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.utils.CreditUtils;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.coroutines.C2680e;
import p134k8.D1;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6804b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f6803a = i10;
        this.f6804b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0145  */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        int i10 = 2;
        int i11 = 3;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.f6804b;
        switch (this.f6803a) {
            case 0:
                o oVar = (o) obj;
                oVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    oVar.P();
                }
                oVar.f6816s.a();
                return null;
            case 1:
                p010a9.d dVar = (p010a9.d) obj;
                dVar.f20631r = false;
                dVar.w();
                if (task.isFaulted()) {
                    O.e.j("ControlUnitSelectiveOutputTestFragment", "Failure: " + task.getError().getMessage());
                    dVar.f20626m.n();
                    dVar.f20626m.setEnabled(false);
                    dVar.f20626m.setClickable(false);
                    dVar.f20626m.setBackgroundTintList(ColorStateList.valueOf(-7829368));
                    dVar.f20625l.setText(dVar.getString(R.string.common_not_available));
                    String string = dVar.getString(R.string.common_not_available);
                    while (i12 < 4) {
                        ((TextView) dVar.f20627n[i12].getChildAt(1)).setText(string);
                        i12++;
                    }
                    dVar.R(task);
                } else {
                    O.e.j("ControlUnitSelectiveOutputTestFragment", "Setting title: " + dVar.f20630q.d());
                    dVar.f20625l.setText(dVar.f20630q.d());
                    dVar.f20626m.h();
                    dVar.S(false);
                }
                return null;
            case 2:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                return null;
            case 3:
                v0 v0Var = (v0) obj;
                v0Var.getClass();
                D1 d10 = (D1) task.getResult();
                return d10 != null ? d10.w(v0Var.a()).continueWith(new G(1)) : Task.forResult(-3);
            case 4:
                final OnlineControlUnitFragment this$0 = (OnlineControlUnitFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "OnlineControlUnitFragment", "task.result1(" + task.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                if (task.getResult() != null) {
                    Object result = task.getResult();
                    kotlin.jvm.internal.i.b(result);
                    if (((Boolean) result).booleanValue()) {
                        ControlUnit controlUnit = this$0.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit);
                        controlUnit.c().continueWithTask(new m(i13, this$0)).continueWithTask(new n(i10, this$0)).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.C
                            @Override // com.parse.boltsinternal.Continuation
                            public final Object then(Task task13) {
                                OnlineControlUnitFragment this$1 = this$0;
                                kotlin.jvm.internal.i.e(this$1, "this$0");
                                kotlin.jvm.internal.i.e(task13, "task13");
                                p279w9.b bVar2 = Application.f29634b;
                                P8.c.a(3, "OnlineControlUnitFragment", "task.result5(" + task13.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                                Object result2 = task13.getResult();
                                kotlin.jvm.internal.i.d(result2, "getResult(...)");
                                if (!((Boolean) result2).booleanValue()) {
                                    return Task.forResult(Boolean.FALSE);
                                }
                                F fD0 = this$1.d0();
                                ControlUnit controlUnit2 = this$1.f31429o;
                                kotlin.jvm.internal.i.b(controlUnit2);
                                String objectId = controlUnit2.f29320b.getObjectId();
                                kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
                                fD0.getClass();
                                if (fD0.f31464C) {
                                    fD0.f31467q.j(new p279w9.a("CONTROL_UNIT_SCAN_FREEZE_FRAME".concat(objectId), 3600000L), Boolean.TRUE);
                                }
                                ControlUnit controlUnit3 = this$1.f31429o;
                                kotlin.jvm.internal.i.b(controlUnit3);
                                return controlUnit3.p0(false, this$1.d0().f31464C);
                            }
                        }).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.D
                            @Override // com.parse.boltsinternal.Continuation
                            public final Object then(Task task14) {
                                OnlineControlUnitFragment this$1 = this$0;
                                kotlin.jvm.internal.i.e(this$1, "this$0");
                                kotlin.jvm.internal.i.e(task14, "task14");
                                p279w9.b bVar2 = Application.f29634b;
                                P8.c.a(3, "OnlineControlUnitFragment", "task.result6(" + task14.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                                ControlUnit controlUnit2 = this$1.f31429o;
                                if (controlUnit2 != null) {
                                    short sShortValue = controlUnit2.n().shortValue();
                                    F fD0 = this$1.d0();
                                    fD0.getClass();
                                    C2680e.c(Z.a(fD0), fD0.f32112a, null, new OnlineControlUnitViewModel$updateControlUnitList$1(fD0, sShortValue, null), 2);
                                }
                                Object result2 = task14.getResult();
                                kotlin.jvm.internal.i.d(result2, "getResult(...)");
                                if (!((Boolean) result2).booleanValue()) {
                                    return Task.forResult(Boolean.FALSE);
                                }
                                ControlUnit controlUnit3 = this$1.f31429o;
                                kotlin.jvm.internal.i.b(controlUnit3);
                                ControlUnit controlUnit4 = this$1.f31429o;
                                kotlin.jvm.internal.i.b(controlUnit4);
                                return controlUnit3.h0(controlUnit4.c0(false)).continueWith(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.b(1));
                            }
                        }).continueWith(new r(i10, this$0), Task.UI_THREAD_EXECUTOR);
                    } else {
                        this$0.w();
                        C2137c.b(this$0.getActivity(), R.string.view_cu_not_responding_message, R.string.common_try_again, R.string.common_cancel).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.E(i12, this$0), Task.UI_THREAD_EXECUTOR);
                    }
                } else {
                    this$0.w();
                    C2137c.b(this$0.getActivity(), R.string.view_cu_not_responding_message, R.string.common_try_again, R.string.common_cancel).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.E(i12, this$0), Task.UI_THREAD_EXECUTOR);
                }
                return null;
            case 5:
                FaultsFragment this$1 = (FaultsFragment) obj;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                if (!this$1.y()) {
                    this$1.Y();
                    this$1.Q().f1934y.setRefreshing(false);
                    Object result2 = task.getResult();
                    kotlin.jvm.internal.i.d(result2, "getResult(...)");
                    if (((Boolean) result2).booleanValue()) {
                        com.voltasit.obdeleven.presentation.controlUnit.faults.b bVarR = this$1.R();
                        bVarR.f31598B = true;
                        if (bVarR.f31597A) {
                            ControlUnit controlUnit2 = bVarR.f31610z;
                            if (controlUnit2 == null) {
                                kotlin.jvm.internal.i.m("controlUnit");
                                throw null;
                            }
                            bVarR.f31601q.j(new p279w9.a(B7.b.c("CONTROL_UNIT_SCAN_FREEZE_FRAME", controlUnit2.f29320b.getObjectId()), 3600000L), Boolean.TRUE);
                        }
                        this$1.R().b();
                    } else {
                        P.b(this$1.requireActivity(), R.string.common_something_went_wrong);
                        this$1.r().h();
                    }
                }
                return null;
            case 6:
                ((B0.a) obj).a();
                return null;
            case 7:
                com.voltasit.obdeleven.utils.bluetooth.o oVar2 = (com.voltasit.obdeleven.utils.bluetooth.o) obj;
                oVar2.getClass();
                return new p047d8.b(300L, "12", true).a().onSuccess(new p009a8.f(i11, oVar2));
            default:
                p255u9.z userDB = (p255u9.z) obj;
                kotlin.jvm.internal.i.e(userDB, "$userDB");
                Iterator it = CreditUtils.f34225a.iterator();
                while (it.hasNext()) {
                    ((CreditUtils.a) it.next()).m(userDB.getInt("credits"));
                }
                return userDB;
        }
    }
}
