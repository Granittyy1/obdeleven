package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: renamed from: k8.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2635o0 implements Continuation<Boolean, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42819d;

    public C2635o0(ControlUnit controlUnit, int i10, int i11, String str) {
        this.f42819d = controlUnit;
        this.f42816a = i10;
        this.f42817b = i11;
        this.f42818c = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Boolean> task) throws Exception {
        return this.f42819d.f29335r.d(String.format(Locale.US, "34%06X00%06X", Integer.valueOf(this.f42816a), Integer.valueOf(this.f42817b))).continueWithTask(new C2632n0(this));
    }
}
