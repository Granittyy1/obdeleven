package p194p8;

import V8.z;
import com.google.android.gms.internal.measurement.C1787c0;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.VT;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import p121j8.c;
import p134k8.T1;

/* JADX INFO: compiled from: UDSMeasurement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlUnit f45925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final COMPUSCALE f45926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.g f45927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45928d = new ArrayList();

    public n(ControlUnit controlUnit, COMPUSCALE compuscale, e.g gVar) {
        this.f45925a = controlUnit;
        this.f45926b = compuscale;
        this.f45927c = gVar;
    }

    @Override // p194p8.j
    public final ArrayList a(ValueUnit valueUnit) {
        ValueUnit valueUnit2 = ValueUnit.f29311c;
        ArrayList arrayList = this.f45928d;
        return valueUnit == valueUnit2 ? C1787c0.l(arrayList) : arrayList;
    }

    @Override // p194p8.j
    public final Task<List<T1>> b(ValueUnit valueUnit) {
        return this.f45925a.D(false).continueWithTask(new z(this, 3, valueUnit));
    }

    @Override // p194p8.j
    public final int getChannel() {
        COMPUSCALE compuscale = this.f45926b;
        LIMIT lowerlimit = compuscale.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = compuscale.getUPPERLIMIT();
        }
        if (lowerlimit == null) {
            return 0;
        }
        return Integer.parseInt(lowerlimit.getValue());
    }

    @Override // p194p8.j
    public final c getLabel() {
        return null;
    }

    @Override // p194p8.j
    public final String getName() {
        VT vt = this.f45926b.getCOMPUCONST().getVT();
        return vt.getTI() != null ? Texttabe.c(vt.getTI()) : vt.getValue();
    }
}
