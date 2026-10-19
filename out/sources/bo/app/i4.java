package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends n6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f21317e = BrazeLogger.getBrazeLogTag((Class<?>) i4.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21318d;

    public i4(JSONObject jSONObject) {
        super(jSONObject);
        this.f21318d = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // bo.app.n6, bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        if (!(x2Var instanceof h4) || StringUtils.isNullOrBlank(this.f21318d)) {
            return false;
        }
        h4 h4Var = (h4) x2Var;
        if (!StringUtils.isNullOrBlank(h4Var.f()) && h4Var.f().equals(this.f21318d)) {
            return super.a(x2Var);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put("type", "purchase_property");
            JSONObject jSONObject = jSONObjectForJsonPut.getJSONObject("data");
            jSONObject.put("product_id", this.f21318d);
            jSONObjectForJsonPut.put("data", jSONObject);
        } catch (JSONException e10) {
            BrazeLogger.e(f21317e, "Caught exception creating Json.", e10);
        }
        return jSONObjectForJsonPut;
    }
}
