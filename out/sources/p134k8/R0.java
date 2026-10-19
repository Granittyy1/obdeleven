package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class R0 implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42666a;

    public R0(ControlUnit controlUnit) {
        this.f42666a = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        ArrayList arrayList = new ArrayList();
        ControlUnit controlUnit = this.f42666a;
        controlUnit.f29331n = arrayList;
        if (!result.startsWith("6206")) {
            return null;
        }
        String strSubstring = result.substring(6);
        for (int i10 = 0; i10 < strSubstring.length() / 2; i10++) {
            int i11 = i10 * 2;
            byte b10 = (byte) Integer.parseInt(strSubstring.substring(i11, i11 + 2), 16);
            for (int i12 = 0; i12 < 8; i12++) {
                if (((byte) ((b10 >> (7 - i12)) & 1)) == 1) {
                    controlUnit.f29331n.add(new C2630m1((i10 * 8) + i12, controlUnit));
                }
            }
        }
        return null;
    }
}
