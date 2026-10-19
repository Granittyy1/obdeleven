package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1485x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22163e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONArray f22167d;

    /* JADX INFO: renamed from: bo.app.x$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public C1485x(JSONObject jsonObject) {
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        this.f22164a = jsonObject.optLong("last_card_updated_at", -1L);
        this.f22165b = jsonObject.optLong("last_full_sync_at", -1L);
        this.f22166c = jsonObject.optBoolean("full_sync", false);
        this.f22167d = jsonObject.optJSONArray("cards");
    }

    public final JSONArray a() {
        return this.f22167d;
    }

    public final long b() {
        return this.f22164a;
    }

    public final long c() {
        return this.f22165b;
    }

    public final boolean d() {
        return this.f22166c;
    }

    public C1485x(String serializedCardJson) {
        kotlin.jvm.internal.i.e(serializedCardJson, "serializedCardJson");
        this.f22166c = false;
        this.f22164a = -1L;
        this.f22165b = -1L;
        this.f22167d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
