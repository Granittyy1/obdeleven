package p220r9;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: r9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2775g implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractControlUnitBackupUtil f46464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f46465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f46467d;

    public /* synthetic */ C2775g(int i10, ControlUnit controlUnit, AbstractControlUnitBackupUtil abstractControlUnitBackupUtil, List list) {
        this.f46464a = abstractControlUnitBackupUtil;
        this.f46465b = controlUnit;
        this.f46466c = i10;
        this.f46467d = list;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws JSONException {
        final AbstractControlUnitBackupUtil abstractControlUnitBackupUtil = this.f46464a;
        abstractControlUnitBackupUtil.getClass();
        JSONObject jSONObject = new JSONObject();
        boolean zIsFaulted = task.isFaulted();
        final ControlUnit controlUnit = this.f46465b;
        final int i10 = this.f46466c;
        if (zIsFaulted) {
            if (((CommandException) task.getError()).a() != 51) {
                return Task.forResult(null);
            }
            int i11 = abstractControlUnitBackupUtil.f34211b;
            final List list = this.f46467d;
            if (i11 >= list.size()) {
                jSONObject.put("data", "SECURITY_ACCESS");
                return Task.forResult(jSONObject);
            }
            int i12 = abstractControlUnitBackupUtil.f34211b;
            abstractControlUnitBackupUtil.f34211b = i12 + 1;
            return controlUnit.K((String) list.get(i12), true).continueWithTask(new Continuation() { // from class: r9.i
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task2) {
                    AbstractControlUnitBackupUtil abstractControlUnitBackupUtil2 = abstractControlUnitBackupUtil;
                    abstractControlUnitBackupUtil2.getClass();
                    ControlUnit controlUnit2 = controlUnit;
                    Task<Boolean> taskD = controlUnit2.D(false);
                    int i13 = i10;
                    return taskD.continueWithTask(new C2774f(i13, controlUnit2)).continueWithTask(new C2775g(i13, controlUnit2, abstractControlUnitBackupUtil2, list));
                }
            });
        }
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29263c;
        ControlUnitDB controlUnitDB = controlUnit.f29320b;
        if (applicationProtocol == applicationProtocol2) {
            controlUnitDB.saveKWP2000Measurement(i10, (String) task.getResult());
        } else {
            controlUnitDB.saveKWP1281Measurement(i10, (String) task.getResult());
        }
        String str = (String) task.getResult();
        if (str == null) {
            return Task.forResult(null);
        }
        jSONObject.put("channel", i10);
        jSONObject.put("data", str);
        return Task.forResult(jSONObject);
    }
}
