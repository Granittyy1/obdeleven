package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class n6 implements w2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21669c = BrazeLogger.getBrazeLogTag((Class<?>) n6.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C1459c f21670b;

    public n6(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(new e4(jSONArray2.getJSONObject(i11)));
            }
            arrayList.add(new z3(arrayList2));
        }
        this.f21670b = new C1459c(arrayList);
    }

    @Override // bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        return this.f21670b.a(x2Var);
    }

    public JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f21670b.forJsonPut());
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e10) {
            BrazeLogger.e(f21669c, "Caught exception creating Json.", e10);
        }
        return jSONObject;
    }
}
