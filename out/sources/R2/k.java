package R2;

import Q2.C0728e;
import androidx.work.impl.WorkDatabase;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DOPBASE;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.STRUCTURE;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5229c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f5228b = i10;
        this.f5229c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws OdxFactory$Exception {
        switch (this.f5228b) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((m) this.f5229c).f5232a;
                Long lA = workDatabase.p().a("next_alarm_manager_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase.p().b(new C0728e("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            default:
                UDSOutputTestFragment this$0 = (UDSOutputTestFragment) this.f5229c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                COMPUSCALE compuscale = this$0.f31973u;
                kotlin.jvm.internal.i.b(compuscale);
                LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                if (lowerlimit == null) {
                    COMPUSCALE compuscale2 = this$0.f31973u;
                    kotlin.jvm.internal.i.b(compuscale2);
                    lowerlimit = compuscale2.getUPPERLIMIT();
                }
                kotlin.jvm.internal.i.b(lowerlimit);
                String value = lowerlimit.getValue();
                kotlin.jvm.internal.i.d(value, "getValue(...)");
                int i10 = Integer.parseInt(value);
                com.obdeleven.service.odx.e eVar = this$0.f31976x;
                kotlin.jvm.internal.i.b(eVar);
                com.obdeleven.service.odx.e.g gVar = this$0.f31974v;
                kotlin.jvm.internal.i.b(gVar);
                com.obdeleven.service.odx.e.g gVar2 = this$0.f31974v;
                kotlin.jvm.internal.i.b(gVar2);
                com.obdeleven.service.odx.e.c cVarB = eVar.B(gVar.f29508b, gVar2.f29507a, i10);
                com.obdeleven.service.odx.e eVar2 = this$0.f31976x;
                kotlin.jvm.internal.i.b(eVar2);
                kotlin.jvm.internal.i.b(cVarB);
                DOPBASE dopbase = cVarB.f29499a;
                kotlin.jvm.internal.i.c(dopbase, "null cannot be cast to non-null type com.obdeleven.service.odx.model.STRUCTURE");
                this$0.f31975w = eVar2.L(cVarB.f29500b, ((STRUCTURE) dopbase).getPARAMS().getPARAM(), new byte[0], true);
                return null;
        }
    }
}
