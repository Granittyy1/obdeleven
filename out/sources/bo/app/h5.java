package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h5 implements s2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f21182i = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o2 f21188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21189h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21190b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not convert ScheduleConfig to JSON";
        }
    }

    public h5(JSONObject json) {
        kotlin.jvm.internal.i.e(json, "json");
        this.f21183b = json.optLong("start_time", -1L);
        this.f21184c = json.optLong("end_time", -1L);
        this.f21185d = json.optInt("priority", 0);
        this.f21189h = json.optInt("min_seconds_since_last_trigger", -1);
        this.f21186e = json.optInt("delay", 0);
        this.f21187f = json.optInt("timeout", -1);
        this.f21188g = new v4(json);
    }

    @Override // bo.app.s2
    public long b() {
        return this.f21183b;
    }

    @Override // bo.app.s2
    public o2 i() {
        return this.f21188g;
    }

    @Override // bo.app.s2
    public int j() {
        return this.f21185d;
    }

    @Override // bo.app.s2
    public int k() {
        return this.f21187f;
    }

    @Override // bo.app.s2
    public int o() {
        return this.f21186e;
    }

    @Override // bo.app.s2
    public long p() {
        return this.f21184c;
    }

    @Override // bo.app.s2
    public int r() {
        return this.f21189h;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) i().forJsonPut();
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put("start_time", b());
            jSONObject.put("end_time", p());
            jSONObject.put("priority", j());
            jSONObject.put("min_seconds_since_last_trigger", r());
            jSONObject.put("timeout", k());
            jSONObject.put("delay", o());
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f21190b);
            return null;
        }
    }
}
