package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AttributionData implements IPutIntoJson<JSONObject> {
    private static final String ADGROUP_KEY = "adgroup";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String CREATIVE_KEY = "ad";
    public static final a Companion = new a(null);
    private static final String NETWORK_KEY = "source";
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24200b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating AttributionData Json.";
        }
    }

    public AttributionData(String network, String campaign, String adGroup, String creative) {
        i.e(network, "network");
        i.e(campaign, "campaign");
        i.e(adGroup, "adGroup");
        i.e(creative, "creative");
        this.network = network;
        this.campaign = campaign;
        this.adGroup = adGroup;
        this.creative = creative;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!n.S(this.network)) {
                jSONObject.put(NETWORK_KEY, this.network);
            }
            if (!n.S(this.campaign)) {
                jSONObject.put(CAMPAIGN_KEY, this.campaign);
            }
            if (!n.S(this.adGroup)) {
                jSONObject.put(ADGROUP_KEY, this.adGroup);
            }
            if (!n.S(this.creative)) {
                jSONObject.put(CREATIVE_KEY, this.creative);
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f24200b);
        }
        return jSONObject;
    }
}
