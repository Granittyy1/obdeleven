package p220r9;

import G8.C0701c;
import P8.c;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.parse.boltsinternal.CancellationTokenSource;
import com.voltasit.obdeleven.presentation.dialogs.backup.e;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: MultiControlUnitBackupUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends AbstractControlUnitBackupUtil {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<ControlUnit> f46409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CancellationTokenSource f46412p;

    public final void t(ControlUnit controlUnit, C0701c c0701c, e eVar, List list, long j) throws OdxFactory$Exception {
        O.e.j("ControlUnitBackupUtil", "Preparations time: " + (System.currentTimeMillis() - j));
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractControlUnitBackupUtil.s(c0701c, controlUnit);
        O.e.j("ControlUnitBackupUtil", "ODX Info time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        JSONObject jSONObject = c0701c.f3446a;
        e(jSONObject, eVar, controlUnit);
        O.e.j("ControlUnitBackupUtil", "Coding time: " + (System.currentTimeMillis() - jCurrentTimeMillis2));
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        a(jSONObject, eVar, controlUnit, list);
        O.e.j("ControlUnitBackupUtil", "Adaptations time: " + (System.currentTimeMillis() - jCurrentTimeMillis3));
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        j(jSONObject, eVar, controlUnit);
        O.e.j("ControlUnitBackupUtil", "Subsystems time: " + (System.currentTimeMillis() - jCurrentTimeMillis4));
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        h(jSONObject, eVar, controlUnit, list);
        O.e.j("ControlUnitBackupUtil", "Live data time: " + (System.currentTimeMillis() - jCurrentTimeMillis5));
        long jCurrentTimeMillis6 = System.currentTimeMillis();
        if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
            b(jSONObject, eVar, controlUnit, list);
        }
        O.e.j("ControlUnitBackupUtil", "Advanced info Time: " + (System.currentTimeMillis() - jCurrentTimeMillis6));
    }

    public final void u() {
        c.a(3, "ControlUnitBackupUtil", "Cancelling backups", new Object[0]);
        this.f46412p.cancel();
        Iterator<ControlUnit> it = this.f46409m.iterator();
        while (it.hasNext()) {
            it.next().f29340w.cancel();
        }
    }
}
