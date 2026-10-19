package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2617i0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42771b;

    public /* synthetic */ C2617i0(int i10, Object obj) {
        this.f42770a = i10;
        this.f42771b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42770a) {
            case 0:
                return ((Integer) task.getResult()).intValue() == 0 ? ((ControlUnit) this.f42771b).f29335r.d("33C5").continueWith(new C2614h0(0)) : task;
            default:
                Task task2 = (Task) this.f42771b;
                return Boolean.valueOf(!task2.isFaulted() && ((String) task2.getResult()).startsWith("44"));
        }
    }
}
