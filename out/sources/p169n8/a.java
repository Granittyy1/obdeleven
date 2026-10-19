package p169n8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.e;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p181o8.b;
import p181o8.c;

/* JADX INFO: compiled from: GenericFault.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Fault {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ApplicationProtocol f44976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f44977o;

    public a(ApplicationProtocol applicationProtocol, JSONObject jSONObject, boolean z10, ControlUnit controlUnit, e eVar) {
        this.f29431b = controlUnit;
        this.f44976n = applicationProtocol;
        this.f29433d = jSONObject.optString("faultCode");
        this.f29432c = jSONObject.optString("rawFaultCode");
        this.j = jSONObject.optString("statusStatus");
        this.f29439k = jSONObject.optString("faultStatus");
        String strOptString = jSONObject.optString("freezeFrame");
        if (!strOptString.isEmpty()) {
            if (applicationProtocol == ApplicationProtocol.f29263c) {
                this.f29441m = new b(strOptString);
            } else if (applicationProtocol == ApplicationProtocol.f29264d) {
                if (eVar == null) {
                    try {
                        eVar = controlUnit.Z();
                    } catch (ControlUnitException | OdxFactory$Exception e10) {
                        O.e.m(e10);
                    }
                }
                this.f29441m = new c(eVar, strOptString);
            }
        }
        Pattern patternCompile = Pattern.compile("^[BCPU]");
        String str = this.f29433d;
        if (str == null || !patternCompile.matcher(str).find() || this.f29433d.length() < 1 || this.f29433d.charAt(1) != '0') {
            this.f44977o = z10;
        } else {
            this.f44977o = true;
        }
    }

    public static ArrayList k(ApplicationProtocol applicationProtocol, JSONArray jSONArray, boolean z10, ControlUnit controlUnit, com.obdeleven.service.odx.c cVar) {
        e eVarA;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        if (cVar != null) {
            try {
                eVarA = e.a(cVar);
            } catch (OdxFactory$Exception e10) {
                O.e.m(e10);
                return arrayList;
            }
        } else {
            eVarA = null;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new a(applicationProtocol, jSONObjectOptJSONObject, z10, controlUnit, eVarA));
            }
        }
        return arrayList;
    }

    @Override // com.obdeleven.service.model.fault.Fault
    public final ApplicationProtocol b() {
        return this.f44976n;
    }

    @Override // com.obdeleven.service.model.fault.Fault
    public final boolean i() {
        return this.f44977o;
    }
}
