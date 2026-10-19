package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends AbstractC1479q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f22069n = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a2 f22070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d2.a f22072m;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22073b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating geofence report request.Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(r5 serverConfigStorageProvider, String urlBase, a2 geofenceEvent) {
        super(new g5(urlBase.concat("geofence/report")), null, serverConfigStorageProvider, 2, null);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        kotlin.jvm.internal.i.e(geofenceEvent, "geofenceEvent");
        this.f22070k = geofenceEvent;
        this.f22072m = d2.a.GEOFENCE_REPORT;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f22071l;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            jSONObjectD.put("geofence_event", this.f22070k.forJsonPut());
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b.f22073b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f22072m;
    }
}
