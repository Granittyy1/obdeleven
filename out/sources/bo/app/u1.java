package bo.app;

import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends AbstractC1479q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f21995n = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a2 f21996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d2.a f21997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f21998m;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21999b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating geofence refresh request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(r5 serverConfigStorageProvider, String urlBase, IBrazeLocation location) {
        super(new g5(urlBase.concat("geofence/request")), null, serverConfigStorageProvider, 2, null);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        kotlin.jvm.internal.i.e(location, "location");
        this.f21996k = C1471i.f21202h.a(location);
        this.f21997l = d2.a.GEOFENCE_REFRESH;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f21998m;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            a2 a2Var = this.f21996k;
            if (a2Var != null) {
                jSONObjectD.put("location_event", a2Var.forJsonPut());
            }
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b.f21999b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21997l;
    }
}
