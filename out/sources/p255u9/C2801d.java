package p255u9;

import android.text.TextUtils;
import com.parse.ParseClassName;
import com.parse.ParseObject;

/* JADX INFO: renamed from: u9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnitBaseDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("ControlUnitBase")
public final class C2801d extends ParseObject {
    public final Short a() {
        return Short.valueOf(Integer.valueOf(getString("klineId"), 16).shortValue());
    }

    public final String b() {
        Short shA = a();
        return ((shA.shortValue() & 65535) >> 8) > 0 ? String.format("%04X", shA) : String.format("%02X", shA);
    }

    public final String c(String str) {
        v vVar;
        String string = getString("name");
        if (TextUtils.isEmpty(str) || (vVar = (v) getParseObject("texttable")) == null || !vVar.isDataAvailable()) {
            return string;
        }
        String string2 = vVar.getString(str);
        return !TextUtils.isEmpty(string2) ? string2 : string;
    }
}
