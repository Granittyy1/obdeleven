package p134k8;

import C4.b;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 implements Continuation<String, Task<Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2638p0 f42615a;

    public K0(C2638p0 c2638p0) {
        this.f42615a = c2638p0;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Boolean> then(Task<String> task) throws Exception {
        int i10 = Integer.parseInt(((ControlUnit) this.f42615a.f42825b).f29325g, 16);
        if (i10 > 4095) {
            i10 |= Integer.MIN_VALUE;
        }
        String string = "01";
        for (int i11 = 0; i11 < 4; i11++) {
            StringBuilder sbE = b.e(string);
            sbE.append(String.format("%02X", Integer.valueOf((i10 >> (i11 * 8)) & 255)));
            string = sbE.toString();
        }
        return com.obdeleven.service.core.b.a(string).continueWith(new C2617i0(1, task));
    }
}
