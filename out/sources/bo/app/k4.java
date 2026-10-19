package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class k4 implements w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21419b;

    public k4(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("campaign_id")) {
            return;
        }
        this.f21419b = jSONObjectOptJSONObject.optString("campaign_id", null);
    }

    @Override // bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        if (!(x2Var instanceof l4)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f21419b)) {
            return true;
        }
        l4 l4Var = (l4) x2Var;
        return !StringUtils.isNullOrBlank(l4Var.f()) && l4Var.f().equals(this.f21419b);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f21419b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f21419b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
