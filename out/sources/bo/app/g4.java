package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g4 implements w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f21145b;

    public g4(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("product_id")) {
            return;
        }
        this.f21145b = jSONObjectOptJSONObject.optString("product_id", null);
    }

    @Override // bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        if (!(x2Var instanceof h4)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f21145b)) {
            return true;
        }
        h4 h4Var = (h4) x2Var;
        return !StringUtils.isNullOrBlank(h4Var.f()) && h4Var.f().equals(this.f21145b);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f21145b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f21145b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
