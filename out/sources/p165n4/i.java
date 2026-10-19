package p165n4;

import C4.v;
import Z3.q;
import Z3.r;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.RunnableC1340e;
import androidx.fragment.app.RunnableC1341f;
import com.google.android.play.integrity.internal.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f44889a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f44890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentLinkedQueue<a> f44891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f44892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Long f44893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k f44894f;

    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
    public interface a {
        void a();
    }

    static {
        l.a(i.class).a();
        f44890b = new AtomicBoolean(false);
        f44891c = new ConcurrentLinkedQueue<>();
        f44892d = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundleD = v.d("platform", "android");
        q qVar = q.f7852a;
        bundleD.putString("sdk_version", "16.2.0");
        bundleD.putString("fields", "gatekeepers");
        String str = r.j;
        r rVarG = r.c.g(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        rVarG.f7876d = bundleD;
        JSONObject jSONObject = rVarG.c().f7906d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String name, String str, boolean z10) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        kotlin.jvm.internal.i.e(name, "name");
        f44889a.getClass();
        ArrayList<p178o4.a> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = f44892d;
        if (concurrentHashMap2.containsKey(str)) {
            k kVar = f44894f;
            if (kVar != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) kVar.f27754b).get(str)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((p178o4.a) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                map = new HashMap();
                for (p178o4.a aVar : arrayList) {
                    map.put(aVar.f45214a, Boolean.valueOf(aVar.f45215b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    kotlin.jvm.internal.i.d(key, "key");
                    map2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                k kVar2 = f44894f;
                if (kVar2 == null) {
                    kVar2 = new k();
                }
                ArrayList<p178o4.a> arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new p178o4.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                for (p178o4.a aVar2 : arrayList2) {
                    concurrentHashMap3.put(aVar2.f45214a, aVar2);
                }
                ((ConcurrentHashMap) kVar2.f27754b).put(str, concurrentHashMap3);
                f44894f = kVar2;
                map = map2;
            }
        } else {
            map = new HashMap();
        }
        return (map.containsKey(name) && (bool = (Boolean) map.get(name)) != null) ? bool.booleanValue() : z10;
    }

    public static final synchronized void c(com.facebook.internal.a aVar) {
        if (aVar != null) {
            try {
                f44891c.add(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strB = q.b();
        i iVar = f44889a;
        Long l10 = f44893e;
        iVar.getClass();
        if (l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000 && f44892d.containsKey(strB)) {
            e();
            return;
        }
        Context contextA = q.a();
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strB}, 1));
        JSONObject jSONObject = null;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!s.y(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                q qVar = q.f7852a;
            }
            if (jSONObject != null) {
                d(strB, jSONObject);
            }
        }
        Executor executorC = q.c();
        if (f44890b.compareAndSet(false, true)) {
            executorC.execute(new RunnableC1340e(strB, contextA, str, 1));
        }
    }

    public static final synchronized JSONObject d(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            kotlin.jvm.internal.i.e(applicationId, "applicationId");
            jSONObject2 = (JSONObject) f44892d.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            int i10 = 0;
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray == null ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                    } catch (JSONException unused) {
                        q qVar = q.f7852a;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f44892d.put(applicationId, jSONObject2);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f44891c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new RunnableC1341f(5, aVarPoll));
            }
        }
    }
}
