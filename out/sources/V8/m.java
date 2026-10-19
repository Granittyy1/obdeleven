package V8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Protocol;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.ui.dialogs.A0;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.parse.model.CodingType;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p134k8.D1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6806b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f6805a = i10;
        this.f6806b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) throws ParseException, CommandException {
        int iA;
        int i10 = 4;
        int i11 = 1;
        Object obj = this.f6806b;
        switch (this.f6805a) {
            case 0:
                o oVar = (o) obj;
                oVar.getClass();
                if (((Boolean) task1.getResult()).booleanValue()) {
                    oVar.O();
                } else {
                    oVar.q().getSupportFragmentManager().R();
                }
                return null;
            case 1:
                OnlineControlUnitFragment this$0 = (OnlineControlUnitFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task1, "task1");
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "OnlineControlUnitFragment", "task.result2(" + task1.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                Object result = task1.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue()) {
                    return Task.forResult(Boolean.FALSE);
                }
                ControlUnit controlUnit = this$0.f31429o;
                kotlin.jvm.internal.i.b(controlUnit);
                return controlUnit.n0().continueWithTask(new com.parse.a(i11, this$0));
            case 2:
                UDSOutputTestFragment this$1 = (UDSOutputTestFragment) obj;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.e(task1, "task");
                Object result2 = task1.getResult();
                kotlin.jvm.internal.i.d(result2, "getResult(...)");
                if (!((Boolean) result2).booleanValue()) {
                    return Task.forResult(null);
                }
                ControlUnit controlUnit2 = this$1.f31971s;
                kotlin.jvm.internal.i.b(controlUnit2);
                return controlUnit2.f29335r.d("220100").continueWith(new com.obdeleven.service.model.d(controlUnit2));
            case 3:
                B0.a aVar = (B0.a) obj;
                aVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                LinkedList<Long> linkedList = aVar.f33764h;
                linkedList.addLast(Long.valueOf(jCurrentTimeMillis));
                if (linkedList.size() > 100) {
                    linkedList.removeFirst();
                }
                int iIntValue = ((Integer) task1.getResult()).intValue();
                int i12 = aVar.f33761e;
                int i13 = i12 + 1;
                aVar.f33761e = i13;
                int i14 = aVar.f33762f;
                int i15 = i14 + 1;
                aVar.f33762f = i15;
                B0 b10 = B0.this;
                A0 a10 = aVar.f33758b;
                if (iIntValue == 0) {
                    aVar.f33763g = 0;
                    if (i15 % androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION == 0) {
                        aVar.f33759c = (System.currentTimeMillis() - aVar.f33760d) / ((long) aVar.f33762f);
                    }
                    a10.b(i12, i13, aVar.f33759c, true);
                } else if (iIntValue != 53) {
                    ControlUnit controlUnit3 = b10.f33753w;
                    if (controlUnit3.f29327i == ApplicationProtocol.f29262b) {
                        aVar.f33763g++;
                        if (i15 % androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION == 0) {
                            aVar.f33759c = (System.currentTimeMillis() - aVar.f33760d) / ((long) aVar.f33762f);
                        }
                        a10.b(i12, i13, aVar.f33759c, false);
                    } else {
                        if (iIntValue == 36) {
                            aVar.f33761e = i12;
                            aVar.f33762f = i14;
                            return controlUnit3.a().continueWithTask(new n(i10, aVar));
                        }
                        aVar.f33765i = false;
                        a10.a(i12, iIntValue);
                    }
                } else {
                    aVar.f33763g++;
                    if (i15 % androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION == 0) {
                        aVar.f33759c = (System.currentTimeMillis() - aVar.f33760d) / ((long) aVar.f33762f);
                    }
                    a10.b(i12, i13, aVar.f33759c, false);
                }
                int i16 = aVar.f33761e;
                if (i16 == 65536) {
                    aVar.f33765i = false;
                    B0 b11 = a10.f33731a;
                    ControlUnitDB controlUnitDB = b11.f33753w.f29320b;
                    controlUnitDB.setScannedLogins(i16 - 1);
                    controlUnitDB.saveEventuallyWithLogging();
                    b11.f33751u.v(Boolean.TRUE);
                    b11.f33751u.f1684D.setKeepScreenOn(false);
                    return null;
                }
                if (aVar.f33763g == 2) {
                    b10.C(aVar.f33757a).continueWith(new k(5, aVar), Task.UI_THREAD_EXECUTOR);
                    return null;
                }
                if (aVar.f33765i) {
                    aVar.a();
                    return null;
                }
                B0 b12 = a10.f33731a;
                ControlUnitDB controlUnitDB2 = b12.f33753w.f29320b;
                controlUnitDB2.setScannedLogins(i16 - 1);
                controlUnitDB2.saveEventuallyWithLogging();
                b12.f33751u.v(Boolean.TRUE);
                b12.f33751u.f1684D.setKeepScreenOn(false);
                return null;
            case 4:
                com.voltasit.obdeleven.utils.bluetooth.o oVar2 = (com.voltasit.obdeleven.utils.bluetooth.o) obj;
                oVar2.getClass();
                String str = (String) task1.getResult();
                oVar2.f34370e = str;
                return str;
            case 5:
                if (!((List) task1.getResult()).isEmpty()) {
                    ControlUnitDB controlUnitDB3 = (ControlUnitDB) ((List) task1.getResult()).get(0);
                    String codingValue = controlUnitDB3.getCodingValue();
                    D1 d10 = (D1) obj;
                    if (d10.k() == CodingType.f34406f) {
                        if (codingValue != null && !codingValue.equals(d10.r().f42831c)) {
                            controlUnitDB3.setCoding(d10.k(), d10.r().f42831c);
                        }
                    } else if (codingValue != null && !codingValue.equals((String) d10.y().f10040b)) {
                        controlUnitDB3.setCoding(d10.k(), (String) d10.y().f10040b);
                    }
                    controlUnitDB3.save();
                }
                return null;
            case 6:
                p170n9.m this$2 = (p170n9.m) obj;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                kotlin.jvm.internal.i.e(task1, "task");
                this$2.w();
                if (task1.getResult() != null) {
                    ControlUnit controlUnit4 = this$2.f31429o;
                    kotlin.jvm.internal.i.b(controlUnit4);
                    controlUnit4.f29334q = (p121j8.e) task1.getResult();
                }
                return null;
            case 7:
                p219r8.b bVar2 = (p219r8.b) obj;
                bVar2.getClass();
                String str2 = (String) task1.getResult();
                if (str2.contains("72")) {
                    bVar2.f46397f = false;
                    return null;
                }
                if (str2.startsWith("7F32")) {
                    throw new CommandException(Integer.parseInt(str2.substring(4, 6), 16));
                }
                throw new CommandException(-1);
            default:
                com.obdeleven.service.protocol.f fVar = (com.obdeleven.service.protocol.f) obj;
                fVar.getClass();
                if (task1.isFaulted()) {
                    Exception error = task1.getError();
                    if ((error instanceof CommandException) && ((iA = ((CommandException) error).a()) == -1 || iA == 3 || iA == 254)) {
                        fVar.h(Protocol.State.f29531b);
                    }
                }
                return task1;
        }
    }
}
