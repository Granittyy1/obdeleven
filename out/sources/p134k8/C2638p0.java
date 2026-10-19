package p134k8;

import com.obdeleven.service.core.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2638p0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42825b;

    public /* synthetic */ C2638p0(int i10, Object obj) {
        this.f42824a = i10;
        this.f42825b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42824a) {
            case 0:
                String str = (String) task.getResult();
                if (!str.startsWith("62F1AC")) {
                    return Boolean.FALSE;
                }
                ((C2641q0) this.f42825b).f42828a.put("F1AC", str.substring(6));
                return Boolean.TRUE;
            default:
                return ((String) task.getResult()).startsWith("54") ? Task.forResult(Boolean.TRUE) : b.a("0100070000").onSuccessTask(new C2623k0(1, this)).continueWithTask(new K0(this));
        }
    }
}
