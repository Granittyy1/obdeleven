package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;
import p109i8.k;

/* JADX INFO: renamed from: k8.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2629m0 implements Continuation<Integer, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f42789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2632n0 f42790b;

    public C2629m0(C2632n0 c2632n0, String str) {
        this.f42790b = c2632n0;
        this.f42789a = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Integer> task) throws Exception {
        if (task.getResult().intValue() != 0) {
            return task;
        }
        k kVar = this.f42790b.f42812a.f42819d.f29335r;
        Locale locale = Locale.US;
        return kVar.d("36" + this.f42789a).continueWith(new C2626l0());
    }
}
