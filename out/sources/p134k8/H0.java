package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class H0 implements Continuation<Boolean, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42600d;

    public H0(ControlUnit controlUnit, int i10, int i11, String str) {
        this.f42600d = controlUnit;
        this.f42597a = i10;
        this.f42598b = i11;
        this.f42599c = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Boolean> task) throws Exception {
        return this.f42600d.f29335r.d(String.format(Locale.US, "340033%06X%06X", Integer.valueOf(this.f42597a), Integer.valueOf(this.f42598b))).continueWithTask(new G0(this));
    }
}
