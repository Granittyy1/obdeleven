package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.FaultsUtils;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2110z implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30187a;

    public /* synthetic */ C2110z(int i10) {
        this.f30187a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws Exception {
        switch (this.f30187a) {
            case 0:
                ControlUnit controlUnit = (ControlUnit) task.getResult();
                AbstractC2107w.f30176i = controlUnit;
                return controlUnit != null ? controlUnit.D(true).continueWith(new p010a9.b(1)) : Task.forResult(-3);
            case 1:
                if (((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                throw new Exception("Failed to start firmware");
            default:
                List list = (List) task.getResult();
                FaultsUtils.e(list, false);
                return Task.forResult(list);
        }
    }
}
