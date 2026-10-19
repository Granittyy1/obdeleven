package p194p8;

import C.g;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: UDSMeasurementProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControlUnit f45929c;

    /* JADX INFO: compiled from: UDSMeasurementProvider.java */
    public class a implements Continuation<e, List<j>> {
        public a() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final List<j> then(Task<e> task) throws Exception {
            e.c cVarL;
            e result = task.getResult();
            SNREF snref = new SNREF();
            snref.setSHORTNAME("TAB_RecorDataIdentMeasuValue");
            e.g gVarH = result.H(snref);
            ArrayList arrayList = new ArrayList();
            if (gVarH != null && (cVarL = result.l(gVarH.f29507a.getKEYDOPREF(), gVarH.f29508b)) != null) {
                Iterator<COMPUSCALE> it = ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE().iterator();
                while (it.hasNext()) {
                    arrayList.add(new n(o.this.f45929c, it.next(), gVarH));
                }
            }
            return arrayList;
        }
    }

    public o(ControlUnit controlUnit) {
        this.f45929c = controlUnit;
    }

    @Override // C.g
    public final Task<List<j>> Q() {
        return this.f45929c.X().onSuccess(new a());
    }
}
