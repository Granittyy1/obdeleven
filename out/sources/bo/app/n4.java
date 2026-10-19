package bo.app;

import com.braze.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends C1471i {
    private n4(j1 j1Var, JSONObject jSONObject, double d10) {
        super(j1Var, jSONObject, d10, (String) null, 8, (kotlin.jvm.internal.e) null);
    }

    public final String x() throws JSONException {
        String string = q().getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        kotlin.jvm.internal.i.d(string, "data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n4(String campaignId, long j) throws JSONException {
        kotlin.jvm.internal.i.e(campaignId, "campaignId");
        j1 j1Var = j1.PUSH_DELIVERY_EVENT;
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, campaignId);
        kotlin.jvm.internal.i.d(jSONObjectPut, "JSONObject().put(IBrazeE…_CAMPAIGN_ID, campaignId)");
        this(j1Var, jSONObjectPut, j);
    }
}
