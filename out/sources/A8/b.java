package A8;

import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.VT;
import java.util.Locale;
import p220r9.C2783o;

/* JADX INFO: compiled from: BasicSettingMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static p207q8.a a(COMPUSCALE input) {
        String value;
        kotlin.jvm.internal.i.e(input, "input");
        LIMIT lowerlimit = input.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = input.getUPPERLIMIT();
        }
        int i10 = (lowerlimit == null || (value = lowerlimit.getValue()) == null) ? -1 : Integer.parseInt(value);
        String strA = C2783o.a(input, false);
        VT vt = input.getCOMPUCONST().getVT();
        String value2 = vt != null ? vt.getValue() : null;
        if (value2 == null) {
            value2 = "";
        }
        String ti = vt != null ? vt.getTI() : null;
        String str = ti != null ? ti : "";
        String strG = kotlin.jvm.internal.n.g(input.getLOWERLIMIT().getValue());
        kotlin.jvm.internal.i.d(strG, "decStringHexString(...)");
        Locale ROOT = Locale.ROOT;
        kotlin.jvm.internal.i.d(ROOT, "ROOT");
        String upperCase = strG.toUpperCase(ROOT);
        kotlin.jvm.internal.i.d(upperCase, "toUpperCase(...)");
        kotlin.jvm.internal.i.b(strA);
        return new p207q8.a(i10, strA, value2, str, upperCase);
    }
}
