package bo.app;

import com.braze.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends C1471i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f21387k = new a(null);
    private final boolean j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final a2 a(String campaignId, String actionId, String actionType) throws JSONException {
            kotlin.jvm.internal.i.e(campaignId, "campaignId");
            kotlin.jvm.internal.i.e(actionId, "actionId");
            kotlin.jvm.internal.i.e(actionType, "actionType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, campaignId);
            jSONObject.put(Constants.BRAZE_PUSH_CONTENT_KEY, actionId);
            return new j4(j1.PUSH_ACTION_BUTTON_CLICKED, jSONObject, actionType, null);
        }

        private a() {
        }
    }

    public /* synthetic */ j4(j1 j1Var, JSONObject jSONObject, String str, kotlin.jvm.internal.e eVar) {
        this(j1Var, jSONObject, str);
    }

    public final boolean x() {
        return this.j;
    }

    private j4(j1 j1Var, JSONObject jSONObject, String str) {
        super(j1Var, jSONObject, 0.0d, (String) null, 12, (kotlin.jvm.internal.e) null);
        this.j = kotlin.jvm.internal.i.a(str, Constants.BRAZE_PUSH_ACTION_TYPE_NONE);
    }
}
