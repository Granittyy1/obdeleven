package V8;

import G8.C0701c;
import android.os.Bundle;
import androidx.media3.exoplayer.C1406y;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2145g;
import com.voltasit.obdeleven.ui.dialogs.C2147h;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.Parse;
import com.voltasit.parse.model.HistoryDB;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import org.json.JSONException;
import p220r9.C2778j;
import p220r9.C2785q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6786c;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f6784a = i10;
        this.f6785b = obj;
        this.f6786c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        int i10 = 1;
        Object obj = this.f6786c;
        Object obj2 = this.f6785b;
        switch (this.f6784a) {
            case 0:
                h hVar = (h) obj2;
                hVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    hVar.V((String) obj);
                }
                return null;
            case 1:
                p010a9.d dVar = (p010a9.d) obj2;
                dVar.f8081z = true;
                dVar.O();
                String string = ((Bundle) obj).getString("key_channel");
                p219r8.e eVar = dVar.f20630q;
                if (eVar instanceof p219r8.c) {
                    ((p219r8.c) eVar).f46399h = string;
                    O.e.j("ControlUnitSelectiveOutputTestFragment", "Setting hexChannelCode: " + string);
                }
                O.e.s("ControlUnitSelectiveOutputTestFragment", "startSelectiveTest()");
                dVar.f20631r = true;
                dVar.f20635v.setVisibility(0);
                dVar.J();
                dVar.f20629p.D(false).continueWithTask(new k(i10, dVar), Task.BACKGROUND_EXECUTOR).continueWithTask(new l(i10, dVar), Task.UI_THREAD_EXECUTOR);
                return null;
            case 2:
                EepromFragment this$0 = (EepromFragment) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ControlUnit controlUnit = this$0.f31540m;
                kotlin.jvm.internal.i.b(controlUnit);
                String str = this$0.f31549v;
                kotlin.jvm.internal.i.b(str);
                O.h.c(16);
                return controlUnit.L0(((StringBuilder) obj).toString(), Integer.parseInt(str, 16), this$0.f31548u);
            case 3:
                B0 b10 = (B0) obj2;
                b10.getClass();
                return ((Boolean) task.getResult()).booleanValue() ? b10.f33753w.K((String) obj, true) : Task.forResult(-1);
            case 4:
                ControlUnit controlUnit2 = (ControlUnit) obj2;
                controlUnit2.getClass();
                String str2 = (String) task.getResult();
                if (str2.startsWith("67")) {
                    return controlUnit2.f29335r.d(String.format(Locale.US, "2704%08X", Long.valueOf(4294967295L & (Long.parseLong((String) obj) + Long.parseLong(str2.substring(4), 16)))));
                }
                return task;
            case 5:
                p135k9.e eVar2 = (p135k9.e) obj2;
                ControlUnit controlUnit3 = eVar2.f42897b;
                com.obdeleven.service.odx.e.g gVar = eVar2.f42903h;
                controlUnit3.getClass();
                O.e.s("ControlUnit", "udsReadDataByIdentWithoutSaving");
                return controlUnit3.I0((COMPUSCALE) obj, gVar, false);
            default:
                C2785q c2785q = (C2785q) obj2;
                C2145g c2145g = (C2145g) obj;
                if (c2785q.f34220l == null) {
                    c2785q.f34220l = new Timer();
                }
                c2785q.f34220l.scheduleAtFixedRate(new C2778j(c2785q, c2145g), 0L, 1000L);
                if (task.isFaulted()) {
                    Exception error = task.getError();
                    p279w9.b bVar = Application.f29634b;
                    P8.c.b(error);
                }
                if (!c2785q.f34210a) {
                    if (task.getResult() != null) {
                        C0701c c0701c = (C0701c) task.getResult();
                        C2147h c2147h = c2145g.f33951b;
                        c2147h.D(3);
                        try {
                            c0701c.f3446a.put("name", c2145g.f33950a);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                        String string2 = c0701c.toString();
                        p279w9.b bVar2 = Application.f29634b;
                        P8.c.a(3, "Backup", string2, Arrays.copyOf(new Object[0], 0));
                        ControlUnit controlUnit4 = c2147h.f33985t;
                        p255u9.E e11 = controlUnit4.f29321c.f42726c;
                        C1406y c1406y = new C1406y(c2145g);
                        HistoryDB historyDB = new HistoryDB();
                        int i11 = p255u9.z.f47484b;
                        historyDB.o((p255u9.z) ParseUser.getCurrentUser());
                        historyDB.setVehicle(e11);
                        historyDB.i(controlUnit4.f29320b);
                        if (controlUnit4.p() != null) {
                            historyDB.k(controlUnit4.p().f29363c);
                        }
                        historyDB.n("BACKUP");
                        historyDB.m(e11.getInt("mileage"));
                        historyDB.j(c0701c.f3446a);
                        historyDB.put("odxFileName", c0701c.f3447b);
                        P8.c.a(3, "Backup", historyDB.toString(), Arrays.copyOf(new Object[0], 0));
                        historyDB.a();
                        historyDB.saveInBackground(c1406y);
                        c2147h.f33985t.f29320b.saveInBackgroundWithLogging();
                        Parse.f34395b.e();
                        UserTrackingUtils.c(UserTrackingUtils.Key.f34259c, 1);
                    } else {
                        c2145g.f33951b.D(4);
                    }
                    break;
                } else {
                    C2147h c2147h2 = c2145g.f33951b;
                    c2147h2.D(0);
                    c2147h2.f33968z.r();
                }
                return null;
        }
    }
}
