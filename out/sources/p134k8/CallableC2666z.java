package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: k8.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC2666z implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ COMPUSCALE f42881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e.g f42882d;

    public /* synthetic */ CallableC2666z(ControlUnit controlUnit, COMPUSCALE compuscale, e.g gVar) {
        this.f42880b = controlUnit;
        this.f42881c = compuscale;
        this.f42882d = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ControlUnit controlUnit = this.f42880b;
        controlUnit.getClass();
        COMPUSCALE compuscale = this.f42881c;
        LIMIT lowerlimit = compuscale.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = compuscale.getUPPERLIMIT();
        }
        if (lowerlimit == null) {
            return null;
        }
        int i10 = Integer.parseInt(lowerlimit.getValue());
        String str = String.format(Locale.US, "%04X", Integer.valueOf(i10));
        String dataById = controlUnit.f29320b.getDataById(i10);
        O.e.j(controlUnit.f0(), "getOfflineDataById(" + str + ")");
        if (dataById.startsWith("62".concat(str))) {
            return UDSResult.b(i10, dataById.substring(6), this.f42882d, controlUnit.f29322d);
        }
        if (dataById.startsWith("7F")) {
            return UDSResult.a(dataById.substring(4));
        }
        return null;
    }
}
