package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v4 implements o2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22074c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22075b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22076b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not convert ReEligibilityConfig to JSON";
        }
    }

    public v4(int i10) {
        this.f22075b = i10;
    }

    @Override // bo.app.o2
    public boolean e() {
        return this.f22075b == 0;
    }

    @Override // bo.app.o2
    public Integer g() {
        int i10 = this.f22075b;
        if (i10 > 0) {
            return Integer.valueOf(i10);
        }
        return null;
    }

    @Override // bo.app.o2
    public boolean h() {
        return this.f22075b == -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            return new JSONObject().put("re_eligibility", this.f22075b);
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f22076b);
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v4(JSONObject json) {
        this(json.optInt("re_eligibility", -1));
        kotlin.jvm.internal.i.e(json, "json");
    }
}
