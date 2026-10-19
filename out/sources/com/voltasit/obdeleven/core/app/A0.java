package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30029a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30029a) {
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
                return new SetProtocolCommand(SetProtocolCommand.Protocol.K_LINE).a().onSuccessTask(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.k());
        }
    }
}
