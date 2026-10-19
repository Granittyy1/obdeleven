package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends AbstractC1479q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f21954p = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f21955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f21956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f21957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f21958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d2.a f21959o;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21960b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "PushMaxSendRequest executed successfully.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21961b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(r5 serverConfigStorageProvider, String urlBase, String str, List campaignIds, long j, List dedupeIds) {
        super(new g5(urlBase.concat("push/redeliver")), str, serverConfigStorageProvider);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        kotlin.jvm.internal.i.e(campaignIds, "campaignIds");
        kotlin.jvm.internal.i.e(dedupeIds, "dedupeIds");
        this.f21955k = campaignIds;
        this.f21956l = j;
        this.f21957m = dedupeIds;
        this.f21959o = d2.a.PUSH_REDELIVER;
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, d4 apiResponse) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f21960b, 3, (Object) null);
        long j = apiResponse.j();
        if (j != -1) {
            internalPublisher.a(new s4(j), s4.class);
        }
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f21958n;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            String strA = a();
            if (strA != null && !kotlin.text.n.S(strA)) {
                jSONObjectD.put("user_id", a());
            }
            jSONObjectD.put("campaign_ids", new JSONArray((Collection) this.f21955k));
            jSONObjectD.put("last_sync_at", this.f21956l);
            if (!this.f21957m.isEmpty()) {
                jSONObjectD.put("dedupe_ids", new JSONArray((Collection) this.f21957m));
            }
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, c.f21961b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21959o;
    }
}
