package bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p4 extends AbstractC1479q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f21719n = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f21720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f21721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d2.a f21722m;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21723b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(r5 serverConfigStorageProvider, String urlBase, String str, List pushDeliveryEvents) {
        super(new g5(urlBase.concat("push/delivery_events")), str, serverConfigStorageProvider);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        kotlin.jvm.internal.i.e(pushDeliveryEvents, "pushDeliveryEvents");
        this.f21720k = pushDeliveryEvents;
        this.f21721l = pushDeliveryEvents.isEmpty();
        this.f21722m = d2.a.PUSH_DELIVERY_EVENTS;
    }

    public final void a(List list) {
        kotlin.jvm.internal.i.e(list, "<set-?>");
        this.f21720k = list;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f21721l;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (n4 n4Var : this.f21720k) {
                n4Var.a(a());
                jSONArray.put(n4Var.forJsonPut());
            }
            jSONObjectD.put("events", jSONArray);
            String strA = a();
            if (strA != null && !kotlin.text.n.S(strA)) {
                jSONObjectD.put("user_id", a());
            }
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b.f21723b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21722m;
    }

    public final List l() {
        return this.f21720k;
    }
}
