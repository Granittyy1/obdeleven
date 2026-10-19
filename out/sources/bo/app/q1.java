package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends AbstractC1479q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f21781m = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d2.a f21783l;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21784b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "FeatureFlagsSyncRequest failed.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21785b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "FeatureFlagsSyncRequest executed successfully.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21786b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating Feature Flags request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r5 serverConfigStorageProvider, String urlBase, String str) {
        super(new g5(urlBase.concat("feature_flags/sync")), str, serverConfigStorageProvider);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        this.f21783l = d2.a.FEATURE_FLAG_SYNC;
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, d4 apiResponse) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f21785b, 3, (Object) null);
        internalPublisher.a(new p1(this), p1.class);
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f21782k;
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
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, d.f21786b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21783l;
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, r2 responseError) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.f21784b, 2, (Object) null);
        internalPublisher.a(new o1(), o1.class);
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public void a(Map existingHeaders) {
        kotlin.jvm.internal.i.e(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
