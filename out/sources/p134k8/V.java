package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42684a;

    public V(ControlUnit controlUnit) {
        this.f42684a = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        ArrayList arrayList = new ArrayList();
        ControlUnit controlUnit = this.f42684a;
        controlUnit.f29331n = arrayList;
        if (result == null || !result.startsWith("6206")) {
            return null;
        }
        String strSubstring = result.substring(4);
        boolean zStartsWith = strSubstring.startsWith("08");
        String strSubstring2 = strSubstring.substring(2);
        int i10 = zStartsWith ? 4 : 2;
        for (int i11 = 0; i11 < strSubstring2.length() / i10; i11++) {
            int i12 = i11 * i10;
            int i13 = Integer.parseInt(strSubstring2.substring(i12, i12 + i10), 16) & 65535;
            if (i13 > 0 && i13 < 512) {
                if (!zStartsWith) {
                    i13--;
                }
                controlUnit.f29331n.add(new P1(i13, controlUnit, zStartsWith));
            }
        }
        return null;
    }
}
