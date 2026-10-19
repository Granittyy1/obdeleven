package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import p169n8.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42603b;

    public /* synthetic */ I(int i10, ControlUnit controlUnit) {
        this.f42602a = i10;
        this.f42603b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42602a) {
            case 0:
                ControlUnit controlUnit = this.f42603b;
                return controlUnit.f29335r.d("22F189").continueWith(new L(1, controlUnit));
            default:
                ControlUnit controlUnit2 = this.f42603b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                final boolean z10 = true;
                if (!str.startsWith("09")) {
                    if (str.startsWith("FC")) {
                        ArrayList arrayList = controlUnit2.f29330m;
                        arrayList.clear();
                        String strSubstring = str.substring(2);
                        int length = strSubstring.length() / 6;
                        if (length == 0) {
                            controlUnit2.f29337t = false;
                        } else {
                            controlUnit2.f29337t = true;
                            for (int i10 = 0; i10 < length; i10++) {
                                int i11 = i10 * 6;
                                b bVar = new b(controlUnit2, strSubstring.substring(i11, i11 + 6));
                                if (!bVar.f29433d.equals("65535") || (bVar.f29433d.equals("65535") && bVar.f29436g != 8)) {
                                    arrayList.add(bVar);
                                }
                            }
                        }
                    } else {
                        z10 = false;
                    }
                }
                return Task.delay(2000L).continueWith(new Continuation() { // from class: k8.q
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        return Boolean.valueOf(z10);
                    }
                });
        }
    }
}
