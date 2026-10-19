package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c4 implements IPutIntoJson, j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f20780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONArray f20781c;

    public c4(JSONObject userObject) {
        kotlin.jvm.internal.i.e(userObject, "userObject");
        this.f20780b = userObject;
        this.f20781c = new JSONArray().put(userObject);
    }

    @Override // bo.app.j2
    public boolean isEmpty() {
        if (this.f20780b.length() == 0) {
            return true;
        }
        return this.f20780b.length() == 1 && this.f20780b.has("user_id");
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONArray forJsonPut() {
        JSONArray jsonArrayForJsonPut = this.f20781c;
        kotlin.jvm.internal.i.d(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    public final JSONObject v() {
        return this.f20780b;
    }
}
