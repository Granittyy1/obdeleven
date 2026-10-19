package p134k8;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.core.gen1.d;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42833b;

    public /* synthetic */ r(int i10, ControlUnit controlUnit) {
        this.f42832a = i10;
        this.f42833b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42832a) {
            case 0:
                final int iShortValue = this.f42833b.n().shortValue();
                int i10 = (iShortValue >> 4) ^ iShortValue;
                int i11 = i10 ^ (i10 >> 2);
                if (((i11 ^ (i11 >> 1)) & 1) == 0) {
                    iShortValue |= 128;
                }
                return new d(String.format("00%02X", Integer.valueOf(iShortValue))).a().continueWithTask(new Continuation() { // from class: k8.G
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        if (!task2.isFaulted()) {
                            return task2;
                        }
                        Task<Void> taskDelay = Task.delay(3000L);
                        final int i12 = iShortValue;
                        return taskDelay.continueWithTask(new Continuation() { // from class: k8.S
                            @Override // com.parse.boltsinternal.Continuation
                            public final Object then(Task task3) {
                                Task<Void> taskA = new SetProtocolCommand(SetProtocolCommand.Protocol.K_LINE).a();
                                final int i13 = i12;
                                return taskA.onSuccessTask(new Continuation() { // from class: k8.e
                                    @Override // com.parse.boltsinternal.Continuation
                                    public final Object then(Task task4) {
                                        return new d(String.format("00%02X", Integer.valueOf(i13))).a();
                                    }
                                });
                            }
                        });
                    }
                });
            case 1:
                ControlUnit controlUnit = this.f42833b;
                if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                    return controlUnit.f29335r.d("22F19E").continueWith(new C2619j(2, controlUnit));
                }
                controlUnit.F0("");
                return Task.forResult(null);
            default:
                ControlUnit controlUnit2 = this.f42833b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                boolean zStartsWith = str.startsWith("62F1AA");
                ControlUnitDB controlUnitDB = controlUnit2.f29320b;
                if (zStartsWith) {
                    controlUnitDB.setSystemIdentifier(b.b(str.substring(6)));
                    return null;
                }
                if (!str.startsWith("7F22")) {
                    return null;
                }
                controlUnitDB.setSystemIdentifier("");
                return null;
        }
    }
}
