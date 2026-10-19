package X8;

import android.content.Context;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import java.util.List;
import java.util.concurrent.Callable;
import p220r9.B;
import p220r9.C2783o;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7405c;

    public /* synthetic */ q(int i10, Object obj) {
        this.f7404b = i10;
        this.f7405c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ControlUnitException, OdxFactory$Exception {
        switch (this.f7404b) {
            case 0:
                s sVar = (s) this.f7405c;
                com.obdeleven.service.odx.e eVarZ = sVar.f7416q.Z();
                if (eVarZ == null) {
                    return Boolean.FALSE;
                }
                com.obdeleven.service.odx.e.g gVarG = eVarZ.G();
                sVar.f7418s = gVarG;
                if (gVarG == null) {
                    return Boolean.FALSE;
                }
                List<COMPUSCALE> listC = C2783o.c(eVarZ, gVarG);
                UDSResult uDSResultB = null;
                COMPUSCALE compuscale = listC != null ? listC.get(0) : null;
                sVar.f7417r = compuscale;
                if (sVar.f7408A) {
                    ControlUnit controlUnit = sVar.f7416q;
                    com.obdeleven.service.odx.e.g gVar = sVar.f7418s;
                    if (compuscale != null) {
                        LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                        if (lowerlimit == null) {
                            lowerlimit = compuscale.getUPPERLIMIT();
                        }
                        uDSResultB = UDSResult.b(Integer.parseInt(lowerlimit.getValue()), controlUnit.W().f42831c, gVar, eVarZ);
                    }
                    sVar.f7421v = uDSResultB;
                    if (uDSResultB != null) {
                        sVar.f7423x = uDSResultB.f29414c;
                    }
                }
                return Boolean.valueOf(sVar.f7417r != null);
            case 1:
                ((p191p5.h) this.f7405c).b(null);
                return null;
            default:
                VehicleHistoryChildrenFragment this$0 = (VehicleHistoryChildrenFragment) this.f7405c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Context applicationContext = this$0.q().getApplicationContext();
                E e10 = this$0.f32425n;
                kotlin.jvm.internal.i.b(e10);
                B.a aVar = new B.a(applicationContext, e10);
                com.voltasit.obdeleven.presentation.history.k kVar = this$0.f32423l;
                kotlin.jvm.internal.i.b(kVar);
                aVar.f46405c = kVar.f36795b;
                return aVar.a();
        }
    }
}
