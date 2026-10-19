package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t5 implements IPutIntoJson {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21962f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v5 f21963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f21964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Double f21965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f21966e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f21967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t5 f21968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d10, t5 t5Var) {
            super(0);
            this.f21967b = d10;
            this.f21968c = t5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "End time '" + this.f21967b + "' for session is less than the start time '" + this.f21968c.x() + "' for this session.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21969b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception creating Session Json.";
        }
    }

    public t5(v5 sessionId, double d10, Double d11, boolean z10) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        this.f21963b = sessionId;
        this.f21964c = d10;
        a(d11);
        this.f21966e = z10;
    }

    public void a(Double d10) {
        this.f21965d = d10;
    }

    public final v5 s() {
        return this.f21963b;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f21963b + ", startTime=" + this.f21964c + ", endTime=" + w() + ", isSealed=" + this.f21966e + ", duration=" + v() + ')';
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f21963b);
            jSONObject.put("start_time", this.f21964c);
            jSONObject.put("is_sealed", this.f21966e);
            if (w() != null) {
                jSONObject.put("end_time", w());
            }
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f21969b);
        }
        return jSONObject;
    }

    public final long v() {
        Double dW = w();
        if (dW == null) {
            return -1L;
        }
        double dDoubleValue = dW.doubleValue();
        long j = (long) (dDoubleValue - this.f21964c);
        if (j < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(dDoubleValue, this), 2, (Object) null);
        }
        return j;
    }

    public Double w() {
        return this.f21965d;
    }

    public final double x() {
        return this.f21964c;
    }

    public final boolean y() {
        return this.f21966e;
    }

    public final q3 z() {
        return new q3(this.f21963b, this.f21964c, w(), this.f21966e);
    }

    public final void a(boolean z10) {
        this.f21966e = z10;
    }

    public t5(JSONObject sessionData) throws JSONException {
        kotlin.jvm.internal.i.e(sessionData, "sessionData");
        v5.a aVar = v5.f22077d;
        String string = sessionData.getString("session_id");
        kotlin.jvm.internal.i.d(string, "sessionData.getString(SESSION_ID_KEY)");
        this.f21963b = aVar.a(string);
        this.f21964c = sessionData.getDouble("start_time");
        this.f21966e = sessionData.getBoolean("is_sealed");
        a(JsonUtils.getDoubleOrNull(sessionData, "end_time"));
    }
}
