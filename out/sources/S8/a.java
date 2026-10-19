package S8;

import C7.d;
import V8.h;
import V8.n;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2105u;
import com.voltasit.obdeleven.core.app.v0;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.presentation.main.MainViewModel;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.utils.bluetooth.o;
import kotlin.jvm.internal.i;
import p134k8.D1;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5699b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f5698a = i10;
        this.f5699b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f5698a) {
            case 0:
                c cVar = (c) this.f5699b;
                cVar.getClass();
                if (task.getResult() == null) {
                    return null;
                }
                d dVar = cVar.f5703c;
                Float f10 = (Float) task.getResult();
                dVar.getClass();
                f10.floatValue();
                MainViewModel this$0 = (MainViewModel) dVar.f2426b;
                i.e(this$0, "this$0");
                this$0.f32555P.k(f10);
                return null;
            case 1:
                h hVar = (h) this.f5699b;
                hVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    hVar.U();
                    return null;
                }
                P.b(hVar.getActivity(), R.string.common_something_went_wrong);
                hVar.q().getSupportFragmentManager().R();
                return null;
            case 2:
                final v0 v0Var = (v0) this.f5699b;
                v0Var.getClass();
                final D1 d10 = (D1) task.getResult();
                return d10 != null ? d10.e().continueWith(new Continuation() { // from class: com.voltasit.obdeleven.core.app.t0
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        v0 v0Var2 = v0Var;
                        v0Var2.getClass();
                        if (!((Boolean) task2.getResult()).booleanValue()) {
                            return -3;
                        }
                        v0Var2.f(d10.x().f42831c);
                        return 0;
                    }
                }) : Task.forResult(-3);
            case 3:
                EepromFragment this$1 = (EepromFragment) this.f5699b;
                i.e(this$1, "this$0");
                ControlUnit controlUnit = this$1.f31540m;
                i.b(controlUnit);
                return controlUnit.t0("F198", "077328F6".concat(I.b.j()));
            case 4:
                UDSOutputTestFragment this$2 = (UDSOutputTestFragment) this.f5699b;
                i.e(this$2, "this$0");
                ControlUnit controlUnit2 = this$2.f31971s;
                i.b(controlUnit2);
                return controlUnit2.H0(this$2.f31973u, "02", "");
            case 5:
                ((B0) this.f5699b).D();
                return null;
            case 6:
                o oVar = (o) this.f5699b;
                oVar.getClass();
                return new p059e8.a("08", true).a().onSuccess(new C2105u(1)).continueWithTask(new n(5, oVar));
            default:
                ControlUnit controlUnit3 = (ControlUnit) this.f5699b;
                controlUnit3.getClass();
                if (task.isFaulted()) {
                    return Boolean.FALSE;
                }
                String str = (String) task.getResult();
                if (!str.startsWith("620600")) {
                    if (!str.startsWith("7F22")) {
                        return Boolean.FALSE;
                    }
                    controlUnit3.E0("", true);
                    return Boolean.TRUE;
                }
                controlUnit3.f29328k = ControlUnit.RequestSID.f29346d;
                try {
                    controlUnit3.E0(str.substring(6), true);
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return Boolean.TRUE;
        }
    }
}
