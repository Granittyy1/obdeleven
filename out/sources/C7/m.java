package C7;

import com.obdeleven.service.model.ControlUnit;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2450c;

    public /* synthetic */ m(int i10, Object obj) {
        this.f2449b = i10;
        this.f2450c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2449b) {
            case 0:
                return ((o) this.f2450c).b("firebase");
            default:
                ControlUnit controlUnit = ((com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m) this.f2450c).f31751s;
                controlUnit.y0(controlUnit.f29320b.getCoding().optString("value"), true);
                return null;
        }
    }
}
