package com.voltasit.obdeleven.core.app;

import androidx.fragment.app.ActivityC1347l;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.DiagnosticSession;
import com.obdeleven.service.util.Texttabe;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.HistoryDB;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2096k implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30107c;

    public /* synthetic */ C2096k(Object obj, int i10, Object obj2) {
        this.f30105a = i10;
        this.f30106b = obj;
        this.f30107c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws CommandException {
        Task taskContinueWith;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.f30107c;
        Object obj2 = this.f30106b;
        switch (this.f30105a) {
            case 0:
                AbstractC2107w command = (AbstractC2107w) obj2;
                kotlin.jvm.internal.i.e(command, "$command");
                C2098m this$0 = (C2098m) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                Integer num = (Integer) task.getResult();
                if (num == null || num.intValue() != 0) {
                    return task;
                }
                String str = "writeValue(" + command.b() + ")";
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "DeviceCommand", str, Arrays.copyOf(new Object[0], 0));
                if (command.f30179c) {
                    taskContinueWith = (command.f30182f || AbstractC2107w.f30174g.containsKey(command.b())) ? command.i(AbstractC2107w.f30176i).continueWith(new p009a8.e(i11, command)) : Task.forResult(-3);
                } else {
                    taskContinueWith = Task.forResult(0);
                }
                return taskContinueWith.continueWithTask(new C2097l(this$0, i10, command));
            case 1:
                ControlUnitFragment this$1 = (ControlUnitFragment) obj2;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                DiagnosticSession diagnosticSession = (DiagnosticSession) obj;
                kotlin.jvm.internal.i.e(task, "task1");
                this$1.f31426C.v();
                Integer num2 = (Integer) task.getResult();
                Integer num3 = (Integer) task.getResult();
                if (num3 == null || num3.intValue() != 0) {
                    if (num2 != null && num2.intValue() == -1) {
                        MainActivity mainActivityQ = this$1.q();
                        p220r9.P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
                        return null;
                    }
                    ActivityC1347l activityC1347lRequireActivity = this$1.requireActivity();
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.i.b(num2);
                    p220r9.P.a(activityC1347lRequireActivity, String.format(locale, "(%02X) %s", Arrays.copyOf(new Object[]{num2, Texttabe.a(num2.intValue())}, 2)));
                    return null;
                }
                ControlUnit controlUnit = this$1.f31429o;
                kotlin.jvm.internal.i.b(controlUnit);
                p255u9.E e10 = controlUnit.f29321c.f42726c;
                ControlUnit controlUnit2 = this$1.f31429o;
                HistoryDB historyDB = new HistoryDB();
                int i12 = p255u9.z.f47484b;
                historyDB.o((p255u9.z) ParseUser.getCurrentUser());
                historyDB.setVehicle(e10);
                historyDB.i(controlUnit2.f29320b);
                historyDB.n("DIAGNOSTIC_SESSION");
                historyDB.m(e10.getInt("mileage"));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", diagnosticSession.f29362b);
                    jSONObject.put("ti", diagnosticSession.f29363c);
                    if (controlUnit2.p() != null) {
                        historyDB.k(controlUnit2.p().f29363c);
                    }
                    historyDB.j(jSONObject);
                    historyDB.a();
                    historyDB.saveEventually();
                    break;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                MainActivity mainActivityQ2 = this$1.q();
                p220r9.P.e(mainActivityQ2, mainActivityQ2.getString(R.string.snackbar_session_changed));
                this$1.P();
                UserTrackingUtils.c(UserTrackingUtils.Key.f34269n, 1);
                ControlUnit controlUnit3 = this$1.f31429o;
                kotlin.jvm.internal.i.b(controlUnit3);
                controlUnit3.B0(diagnosticSession);
                return null;
            default:
                com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) obj2;
                mVar.getClass();
                if (task.isFaulted() || ((Integer) task.getResult()).intValue() != 0) {
                    throw new CommandException(-1);
                }
                String str2 = (String) obj;
                mVar.f34368c = str2;
                return new com.obdeleven.service.core.gen1.m("11" + com.obdeleven.service.util.b.c(str2), true).a();
        }
    }
}
