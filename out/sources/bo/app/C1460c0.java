package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1460c0 extends n6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20777e = BrazeLogger.getBrazeLogTag((Class<?>) C1460c0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20778d;

    public C1460c0(JSONObject jSONObject) {
        super(jSONObject);
        this.f20778d = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // bo.app.n6, bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        if (!(x2Var instanceof C1458b0)) {
            return false;
        }
        C1458b0 c1458b0 = (C1458b0) x2Var;
        if (StringUtils.isNullOrBlank(c1458b0.f()) || !c1458b0.f().equals(this.f20778d)) {
            return false;
        }
        return super.a(x2Var);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u */
    public JSONObject forJsonPut() {
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put("type", "custom_event_property");
            JSONObject jSONObject = jSONObjectForJsonPut.getJSONObject("data");
            jSONObject.put("event_name", this.f20778d);
            jSONObjectForJsonPut.put("data", jSONObject);
        } catch (JSONException e10) {
            BrazeLogger.e(f20777e, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e10);
        }
        return jSONObjectForJsonPut;
    }
}
