package bo.app;

import com.braze.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m4 extends C1471i {
    public static final a j = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final m4 a(String campaignId) throws JSONException {
            kotlin.jvm.internal.i.e(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, campaignId);
            return new m4(j1.PUSH_CLICKED, jSONObject, null);
        }

        private a() {
        }

        public final String a(a2 event) throws JSONException {
            kotlin.jvm.internal.i.e(event, "event");
            String string = event.q().getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            kotlin.jvm.internal.i.d(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
            return string;
        }
    }

    public /* synthetic */ m4(j1 j1Var, JSONObject jSONObject, kotlin.jvm.internal.e eVar) {
        this(j1Var, jSONObject);
    }

    private m4(j1 j1Var, JSONObject jSONObject) {
        super(j1Var, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
    }
}
