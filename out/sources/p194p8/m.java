package p194p8;

import com.google.android.gms.internal.measurement.C1787c0;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.V;
import java.util.ArrayList;
import java.util.List;
import p121j8.c;
import p134k8.T1;

/* JADX INFO: compiled from: OBDIIMeasurement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OBDIICu f45922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45924c = new ArrayList();

    public m(OBDIICu oBDIICu, int i10) {
        this.f45922a = oBDIICu;
        this.f45923b = i10;
    }

    @Override // p194p8.j
    public final ArrayList a(ValueUnit valueUnit) {
        ValueUnit valueUnit2 = ValueUnit.f29311c;
        ArrayList arrayList = this.f45924c;
        return valueUnit == valueUnit2 ? C1787c0.l(arrayList) : arrayList;
    }

    @Override // p194p8.j
    public final Task<List<T1>> b(ValueUnit valueUnit) {
        return this.f45922a.D(false).continueWithTask(new V(this, 2, valueUnit));
    }

    @Override // p194p8.j
    public final int getChannel() {
        return this.f45923b;
    }

    @Override // p194p8.j
    public final c getLabel() {
        return null;
    }

    @Override // p194p8.j
    public final String getName() {
        return null;
    }
}
