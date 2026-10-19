package p079g3;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35572c;

    public /* synthetic */ g(int i10, Object obj) {
        this.f35571b = i10;
        this.f35572c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ControlUnitException, OdxFactory$Exception {
        switch (this.f35571b) {
            case 0:
                return new r((b) this.f35572c);
            default:
                ControlUnit controlUnit = (ControlUnit) this.f35572c;
                if (controlUnit.f29327i != ApplicationProtocol.f29264d) {
                    throw new UnsupportedOperationException("Attempt to load odx for non UDS unit");
                }
                controlUnit.Z();
                return controlUnit.f29322d;
        }
    }
}
