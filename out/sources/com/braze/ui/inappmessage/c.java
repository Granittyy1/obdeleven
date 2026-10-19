package com.braze.ui.inappmessage;

import Z3.q;
import android.content.SharedPreferences;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24422b;

    public /* synthetic */ c(int i10) {
        this.f24422b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24422b) {
            case 0:
                DefaultInAppMessageViewWrapper.addDismissRunnable$lambda$7();
                break;
            default:
                try {
                    SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string = sharedPreferences.getString("models", null);
                    JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
                    long j = sharedPreferences.getLong("model_request_timestamp", 0L);
                    FeatureManager featureManager = FeatureManager.f24975a;
                    boolean zB = FeatureManager.b(FeatureManager.Feature.ModelRequest);
                    ConcurrentHashMap concurrentHashMap = ModelManager.f24945a;
                    if (!zB || jSONObject.length() == 0 || j == 0 || System.currentTimeMillis() - j >= 259200000) {
                        jSONObject = ModelManager.b();
                        if (jSONObject != null) {
                            sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        }
                        break;
                    }
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        try {
                            ModelManager.a aVarA = ModelManager.a.C0262a.a(jSONObject.getJSONObject(itKeys.next()));
                            if (aVarA != null) {
                                ModelManager.f24945a.put(aVarA.f24951a, aVarA);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    ModelManager.a();
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
