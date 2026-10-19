package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h6 extends AbstractC1479q {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f21191t = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i6 f21192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x2 f21193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d2.a f21194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f21195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f21196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f21197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c3 f21198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b4 f21199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f21200s;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21201b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(r5 serverConfigStorageProvider, String urlBase, i6 templatedTriggeredAction, x2 triggerEvent, String str) {
        super(new g5(urlBase.concat("template")), str, serverConfigStorageProvider);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        kotlin.jvm.internal.i.e(templatedTriggeredAction, "templatedTriggeredAction");
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        this.f21192k = templatedTriggeredAction;
        this.f21193l = triggerEvent;
        this.f21194m = d2.a.TEMPLATE_REQUEST;
        this.f21195n = templatedTriggeredAction.z();
        this.f21196o = a(templatedTriggeredAction.n());
        this.f21197p = templatedTriggeredAction.A();
        this.f21198q = templatedTriggeredAction;
        this.f21199r = new b4.a(null, null, null, null, 15, null).b(str).a();
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, d4 apiResponse) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        IInAppMessage iInAppMessageL = apiResponse.l();
        if (iInAppMessageL != null) {
            iInAppMessageL.setLocalPrefetchedAssetPaths(this.f21192k.y());
        }
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f21200s;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f21195n);
            jSONObject.put("trigger_event_type", this.f21193l.d());
            a2 a2VarA = this.f21193l.a();
            jSONObject.put("data", a2VarA != null ? (JSONObject) a2VarA.forJsonPut() : null);
            jSONObjectD.put("template", jSONObject);
            if (this.f21199r.A()) {
                jSONObjectD.put("respond_with", this.f21199r.forJsonPut());
            }
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b.f21201b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21194m;
    }

    public final long l() {
        return this.f21197p;
    }

    public final long m() {
        return this.f21193l.e() + this.f21196o;
    }

    public final x2 n() {
        return this.f21193l;
    }

    public final c3 o() {
        return this.f21198q;
    }

    @Override // bo.app.AbstractC1479q
    public String toString() {
        return "TemplateRequest(templatedTriggeredAction=" + this.f21192k + ", triggerEvent=" + this.f21193l + ", triggerAnalyticsId='" + this.f21195n + "', templatePayloadExpirationTimestamp=" + this.f21197p + ", getTemplatedDataExpiration=" + m() + "triggeredAction=" + this.f21198q + ')';
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, r2 responseError) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        if (responseError instanceof C1465f) {
            internalPublisher.a(new z6(this.f21193l, this.f21192k), z6.class);
        }
    }

    private final long a(s2 s2Var) {
        if (s2Var.k() == -1) {
            return TimeUnit.SECONDS.toMillis(s2Var.o() + 30);
        }
        return s2Var.k();
    }
}
