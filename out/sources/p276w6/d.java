package p276w6;

import android.os.Bundle;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p289x6.a;
import p289x6.b;

/* JADX INFO: compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements b, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f47765b;

    public static String b(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p276w6.b
    public final void a(Bundle bundle, String str) {
        a aVar = this.f47765b;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(bundle, str));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // p289x6.b
    public final void c(a aVar) {
        this.f47765b = aVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
