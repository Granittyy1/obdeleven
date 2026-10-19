package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a4 implements IPutIntoJson, j2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20719d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f20720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20721c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public a4(long j, boolean z10) {
        this.f20720b = j;
        this.f20721c = z10;
    }

    @Override // bo.app.j2
    public boolean isEmpty() {
        return !this.f20721c;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f20720b);
        return jSONObject;
    }
}
