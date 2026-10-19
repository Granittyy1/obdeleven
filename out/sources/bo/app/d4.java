package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends AbstractC1461d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f20852q = new e(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f20853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r2 f20854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t2 f20855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1485x f20856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IInAppMessage f20857i;
    private final List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p5 f20858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f20859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JSONArray f20860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f20861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final JSONArray f20862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f20863p;

    public static final class a extends Lambda implements Ia.a {
        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered Exception processing Content Cards response: " + d4.this.f20853e;
        }
    }

    public static final class b extends Lambda implements Ia.a {
        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found " + d4.this.m().size() + " triggered actions in server response.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f20866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f20866b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got server config: " + JsonUtils.getPrettyPrintedString(this.f20866b);
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f20867b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.f20867b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered Exception processing server config: " + this.f20867b;
        }
    }

    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final r2 a(JSONObject jsonObject, d2 request) {
            kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
            kotlin.jvm.internal.i.e(request, "request");
            String optionalString = JsonUtils.getOptionalString(jsonObject, "error");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("auth_error");
            if (jSONObjectOptJSONObject != null) {
                return new j5(request, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, "reason"), optionalString);
            }
            if (kotlin.jvm.internal.i.a(optionalString, "invalid_api_key")) {
                return new k3(optionalString, request);
            }
            if (optionalString != null) {
                return new C1465f(optionalString, request);
            }
            return null;
        }

        public final t2 b(JSONObject jsonObject, d2 request) {
            kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
            kotlin.jvm.internal.i.e(request, "request");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("optional_auth_error");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            return new n5(request, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, "reason"));
        }

        private e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(d2 request, l2.a connectionResult, c2 brazeManager) {
        C1485x c1485x;
        Exception e10;
        p5 p5Var;
        super(request, connectionResult);
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(connectionResult, "connectionResult");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        JSONObject jSONObjectA = connectionResult.a();
        jSONObjectA = jSONObjectA == null ? new JSONObject() : jSONObjectA;
        this.f20853e = jSONObjectA;
        e eVar = f20852q;
        r2 r2VarA = eVar.a(jSONObjectA, request);
        this.f20854f = r2VarA;
        this.f20855g = eVar.b(jSONObjectA, request);
        this.f20860m = jSONObjectA.optJSONArray("feature_flags");
        this.f20862o = jSONObjectA.optJSONArray("feed");
        this.f20863p = jSONObjectA.optLong("last_sync_at", -1L);
        if (r2VarA == null && (request instanceof C1487z)) {
            try {
                c1485x = new C1485x(jSONObjectA);
            } catch (Exception e11) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e11, new a());
                c1485x = null;
            }
        } else {
            c1485x = null;
        }
        this.f20856h = c1485x;
        List listA = w6.f22152a.a(this.f20853e.optJSONArray("triggers"), brazeManager);
        this.j = listA;
        if (listA != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(), 2, (Object) null);
        }
        JSONObject jSONObjectOptJSONObject = this.f20853e.optJSONObject("config");
        if (jSONObjectOptJSONObject != null) {
            try {
                p5Var = new p5(jSONObjectOptJSONObject);
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(jSONObjectOptJSONObject), 2, (Object) null);
                } catch (Exception e12) {
                    e10 = e12;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new d(jSONObjectOptJSONObject));
                }
            } catch (Exception e13) {
                e10 = e13;
                p5Var = null;
            }
        } else {
            p5Var = null;
        }
        this.f20858k = p5Var;
        this.f20857i = w6.f22152a.a(this.f20853e.optJSONObject("templated_message"), brazeManager);
        JSONArray jSONArrayOptJSONArray = this.f20853e.optJSONArray("geofences");
        this.f20859l = jSONArrayOptJSONArray != null ? com.braze.support.e.a(jSONArrayOptJSONArray) : null;
        this.f20861n = request instanceof s0 ? JsonUtils.getOptionalString(this.f20853e, "mite") : null;
    }

    public final C1485x c() {
        return this.f20856h;
    }

    public final String d() {
        return this.f20861n;
    }

    public final r2 e() {
        return this.f20854f;
    }

    public final JSONArray f() {
        return this.f20860m;
    }

    public final JSONArray g() {
        return this.f20862o;
    }

    public final List h() {
        return this.f20859l;
    }

    public final t2 i() {
        return this.f20855g;
    }

    public final long j() {
        return this.f20863p;
    }

    public final p5 k() {
        return this.f20858k;
    }

    public final IInAppMessage l() {
        return this.f20857i;
    }

    public final List m() {
        return this.j;
    }
}
