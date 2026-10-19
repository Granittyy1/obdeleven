package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 implements f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21663c = BrazeLogger.getBrazeLogTag((Class<?>) n3.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List f21664b;

    public n3(List list) {
        this.f21664b = list;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = this.f21664b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((f2) it.next()).forJsonPut());
            }
        } catch (Exception e10) {
            BrazeLogger.e(f21663c, "Caught exception creating Json.", e10);
        }
        return jSONArray;
    }
}
