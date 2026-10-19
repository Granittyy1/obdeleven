package V8;

import android.os.Bundle;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2086b;
import com.voltasit.obdeleven.core.app.C2089d;
import com.voltasit.obdeleven.core.app.Y;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.utils.HistoryUtils;
import java.util.Locale;
import p134k8.D1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6843c;

    public /* synthetic */ z(Object obj, int i10, Object obj2) {
        this.f6841a = i10;
        this.f6842b = obj;
        this.f6843c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws MeasurementException {
        switch (this.f6841a) {
            case 0:
                D d10 = (D) this.f6842b;
                d10.f6748D.setRefreshing(false);
                d10.U(true);
                Integer num = (Integer) task.getResult();
                int iIntValue = num.intValue();
                if (iIntValue == -1) {
                    d10.E(R.string.common_something_went_wrong);
                } else if (iIntValue == 0) {
                    D1 d11 = d10.f6761y;
                    ControlUnit controlUnit = d10.f6762z;
                    p279w9.d.a(ControlUnitDB.getSubsystemQuery(d11.d(), controlUnit.f29320b, controlUnit.f29321c.f42726c), null, null).continueWith(new m(5, d11), Task.BACKGROUND_EXECUTOR);
                    HistoryUtils.b(d10.f6761y, "SUB_LONG_CODING", d10.f6760x.f41190d.f42831c, (String) this.f6843c);
                    d10.G(R.string.common_coding_accepted);
                    d10.P();
                    d10.W();
                } else if (iIntValue != 51) {
                    d10.F(String.format(Locale.US, "(%02X) %s", num, Texttabe.a(iIntValue)));
                } else {
                    B0 b10 = d10.f6747C;
                    if (b10 == null || !b10.isVisible()) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("key_login_finder_enabled", false);
                        B0 b11 = new B0();
                        b11.setArguments(bundle);
                        b11.setTargetFragment(d10, 0);
                        b11.f32261r = d10.getFragmentManager();
                        d10.f6747C = b11;
                        b11.f33753w = d10.f6762z;
                        b11.A();
                    }
                }
                return null;
            case 1:
                C2089d c2089d = (C2089d) this.f6842b;
                c2089d.getClass();
                Task task2 = (Task) this.f6843c;
                if (!task2.isFaulted()) {
                    c2089d.f(String.format("%04X", Integer.valueOf(Integer.parseInt((String) task2.getResult()))));
                    return 0;
                }
                CommandException commandException = (CommandException) task2.getError();
                if (commandException.a() > 128) {
                    return Integer.valueOf(commandException.a());
                }
                return c2089d.f30181e ? 0 : -3;
            case 2:
                Y y10 = (Y) this.f6842b;
                y10.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return -3;
                }
                y10.f(((ControlUnit) this.f6843c).W().f42831c);
                return 0;
            default:
                p194p8.n nVar = (p194p8.n) this.f6842b;
                nVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    throw new MeasurementException(1);
                }
                ControlUnit controlUnit2 = nVar.f45925a;
                controlUnit2.getClass();
                O.e.s("ControlUnit", "udsReadDataByIdentWithoutSaving");
                return controlUnit2.I0(nVar.f45926b, nVar.f45927c, false).continueWith(new C2086b(nVar, 4, (ValueUnit) this.f6843c));
        }
    }
}
