package p194p8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;
import p134k8.T1;

/* JADX INFO: compiled from: KWP1281Measurement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Continuation<String, List<T1>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueUnit f45899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f45900b;

    public c(b bVar, ValueUnit valueUnit) {
        this.f45900b = bVar;
        this.f45899a = valueUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final List<T1> then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (task.isFaulted() || !result.startsWith("F4")) {
            throw new MeasurementException(2);
        }
        b bVar = this.f45900b;
        bVar.f45910a.f29320b.saveKWP1281Measurement(0, result);
        bVar.d(b.e(result.substring(2)));
        return bVar.a(this.f45899a);
    }
}
