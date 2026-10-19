package p010a9;

import O.e;
import com.obdeleven.service.core.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2100o;
import p134k8.C2656v1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8078a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f8078a) {
            case 0:
                if (!task.isFaulted()) {
                    return null;
                }
                e.m(task.getError());
                return null;
            default:
                return b.a("0033").continueWithTask(new C2656v1()).continueWithTask(new C2100o(3));
        }
    }
}
