package p194p8;

import C.g;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: KWPMeasurementProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ControlUnit f45914c;

    /* JADX INFO: compiled from: KWPMeasurementProvider.java */
    public class a implements Callable<List<j>> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final List<j> call() throws Exception {
            i iVar = i.this;
            ApplicationProtocol applicationProtocol = iVar.f45914c.f29327i;
            ArrayList arrayList = new ArrayList();
            ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29262b;
            int i10 = applicationProtocol == applicationProtocol2 ? 255 : 254;
            for (int i11 = applicationProtocol == applicationProtocol2 ? 0 : 1; i11 <= i10; i11++) {
                ControlUnit controlUnit = iVar.f45914c;
                if (applicationProtocol == applicationProtocol2) {
                    arrayList.add(new b(i11, controlUnit));
                } else {
                    arrayList.add(new f(i11, controlUnit));
                }
            }
            return arrayList;
        }
    }

    public i(ControlUnit controlUnit) {
        this.f45914c = controlUnit;
    }

    @Override // C.g
    public final Task<List<j>> Q() {
        return Task.callInBackground(new a());
    }
}
