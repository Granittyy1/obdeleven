package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30065c;

    public /* synthetic */ U(Object obj, int i10, Object obj2) {
        this.f30063a = i10;
        this.f30064b = obj;
        this.f30065c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30063a) {
            case 0:
                W w3 = (W) this.f30064b;
                w3.getClass();
                ((p146l8.v) this.f30065c).a();
                if (task.isFaulted()) {
                    return w3.f30181e ? 0 : -3;
                }
                w3.f((String) task.getResult());
                return 0;
            default:
                ControlUnit controlUnit = (ControlUnit) this.f30064b;
                controlUnit.getClass();
                String str = (String) task.getResult();
                boolean zStartsWith = str.startsWith("76");
                Capture capture = (Capture) this.f30065c;
                if (zStartsWith) {
                    capture.set(str.substring(4));
                    return controlUnit.f29335r.d("37");
                }
                capture.set(str);
                return task;
        }
    }
}
