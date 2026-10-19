package F6;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsJsonParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H3.c f3272a;

    public f(H3.c cVar) {
        this.f3272a = cVar;
    }

    public final d a(JSONObject jSONObject) throws JSONException {
        g jVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            jVar = new b();
        } else {
            jVar = new j();
        }
        return jVar.a(this.f3272a, jSONObject);
    }
}
