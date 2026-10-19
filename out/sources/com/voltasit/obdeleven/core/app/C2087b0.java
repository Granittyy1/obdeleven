package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.OBDIIService01;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2087b0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30080a;

    public /* synthetic */ C2087b0(int i10) {
        this.f30080a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30080a) {
            case 0:
                if (((Integer) task.getResult()).intValue() == 0) {
                    return 0;
                }
                if (((Integer) task.getResult()).intValue() == -1) {
                    return -3;
                }
                if (((Integer) task.getResult()).intValue() > 128) {
                    return (Integer) task.getResult();
                }
                return -1;
            default:
                if (task.isFaulted()) {
                    return Task.forError(task.getError());
                }
                List list = (List) task.getResult();
                ArrayList arrayList = new ArrayList();
                if (!list.isEmpty()) {
                    return Task.forResult(OBDIIService01.d(list));
                }
                O.e.D("OBDIIControlUnit", "Unsupported result: " + list);
                return Task.forResult(arrayList);
        }
    }
}
