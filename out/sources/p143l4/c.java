package p143l4;

import P3.d;
import android.app.Activity;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: SuggestedEventsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f44360a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f44361b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f44362c = new LinkedHashSet();

    public static void a(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    LinkedHashSet linkedHashSet = f44361b;
                    String string = jSONArray2.getString(i11);
                    i.d(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                LinkedHashSet linkedHashSet2 = f44362c;
                String string2 = jSONArray.getString(i10);
                i.d(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void b(Activity activity) {
        i.e(activity, "activity");
        try {
            if (f44360a.get() && d.f4923e && (!f44361b.isEmpty() || !f44362c.isEmpty())) {
                HashMap map = d.f44363e;
                d.a.a(activity);
            } else {
                HashMap map2 = d.f44363e;
                d.a.b(activity);
            }
        } catch (Exception unused) {
        }
    }
}
