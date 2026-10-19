package p143l4;

import Z3.q;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.intercom.android.sdk.models.AttributeType;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043d4.c;
import p165n4.s;

/* JADX INFO: compiled from: PredictionHistoryManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f44357b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f44356a = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f44358c = new AtomicBoolean(false);

    public static final void a(String str, String predictedEvent) {
        i.e(predictedEvent, "predictedEvent");
        AtomicBoolean atomicBoolean = f44358c;
        boolean z10 = atomicBoolean.get();
        LinkedHashMap linkedHashMap = f44356a;
        if (!z10 && !atomicBoolean.get()) {
            SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            i.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f44357b = sharedPreferences;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            linkedHashMap.putAll(s.A(string != null ? string : ""));
            atomicBoolean.set(true);
        }
        linkedHashMap.put(str, predictedEvent);
        SharedPreferences sharedPreferences2 = f44357b;
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putString("SUGGESTED_EVENTS_HISTORY", s.B(y.x(linkedHashMap))).apply();
        } else {
            i.m("shardPreferences");
            throw null;
        }
    }

    public static final String b(View view, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AttributeType.TEXT, str);
            JSONArray jSONArray = new JSONArray();
            while (view != null) {
                jSONArray.put(view.getClass().getSimpleName());
                c cVar = c.f34562a;
                ViewParent parent = view.getParent();
                view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            }
            jSONObject.put("classname", jSONArray);
        } catch (JSONException unused) {
        }
        return s.H(jSONObject.toString());
    }
}
