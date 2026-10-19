package bo.app;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e3 implements w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f20900c = new HashSet();

    public e3(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f20899b = jSONObject2.getString("id");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("buttons");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.f20900c.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
    }

    @Override // bo.app.w2, bo.app.f2
    public boolean a(x2 x2Var) {
        if (x2Var instanceof f3) {
            f3 f3Var = (f3) x2Var;
            if (!StringUtils.isNullOrBlank(f3Var.g()) && f3Var.g().equals(this.f20899b)) {
                if (this.f20900c.size() > 0) {
                    return !StringUtils.isNullOrBlank(f3Var.f()) && this.f20900c.contains(f3Var.f());
                }
                return StringUtils.isNullOrBlank(f3Var.f());
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f20899b);
            if (this.f20900c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f20900c.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
