package bo.app;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1456a0 implements w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20692b;

    public C1456a0(JSONObject jSONObject) {
        this.f20692b = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        if (!(x2Var instanceof C1458b0)) {
            return false;
        }
        C1458b0 c1458b0 = (C1458b0) x2Var;
        return !StringUtils.isNullOrBlank(c1458b0.f()) && c1458b0.f().equals(this.f20692b);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f20692b);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
