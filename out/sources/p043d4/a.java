package p043d4;

import com.facebook.appevents.codeless.internal.PathComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ParameterComponent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34558d;

    public a(JSONObject jSONObject) throws JSONException {
        int length;
        String string = jSONObject.getString("name");
        i.d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f34555a = string;
        String strOptString = jSONObject.optString("value");
        i.d(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f34556b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        i.d(strOptString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f34558d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                i.d(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject2));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f34557c = arrayList;
    }
}
