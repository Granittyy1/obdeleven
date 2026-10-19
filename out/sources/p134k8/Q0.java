package p134k8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q0 implements Continuation<Boolean, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42664b;

    public Q0(int i10, ControlUnit controlUnit) {
        this.f42664b = controlUnit;
        this.f42663a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Boolean> task) throws Exception {
        if (!task.getResult().booleanValue()) {
            return Task.forResult(-1);
        }
        ControlUnit controlUnit = this.f42664b;
        if (controlUnit.f29327i != ApplicationProtocol.f29264d) {
            return Task.forResult(-1);
        }
        return controlUnit.f29335r.d(String.format(Locale.US, "11%02X", Integer.valueOf(this.f42663a))).continueWith(new P0(this));
    }
}
