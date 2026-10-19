package com.facebook.appevents.internal;

import Z3.I;
import Z3.q;
import android.content.Context;
import android.os.Build;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.b;
import p005a4.v;
import p017b4.c;
import p165n4.a;
import p165n4.l;
import p165n4.s;

/* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsLoggerUtility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f24941a = y.r(new Pair(GraphAPIActivityType.f24942b, "MOBILE_APP_INSTALL"), new Pair(GraphAPIActivityType.f24943c, "CUSTOM_APP_EVENTS"));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
    public static final class GraphAPIActivityType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final GraphAPIActivityType f24942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final GraphAPIActivityType f24943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ GraphAPIActivityType[] f24944d;

        static {
            GraphAPIActivityType graphAPIActivityType = new GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
            f24942b = graphAPIActivityType;
            GraphAPIActivityType graphAPIActivityType2 = new GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
            f24943c = graphAPIActivityType2;
            f24944d = new GraphAPIActivityType[]{graphAPIActivityType, graphAPIActivityType2};
        }

        public GraphAPIActivityType() {
            throw null;
        }

        public static GraphAPIActivityType valueOf(String value) {
            i.e(value, "value");
            return (GraphAPIActivityType) Enum.valueOf(GraphAPIActivityType.class, value);
        }

        public static GraphAPIActivityType[] values() {
            return (GraphAPIActivityType[]) Arrays.copyOf(f24944d, 2);
        }
    }

    public static final JSONObject a(GraphAPIActivityType graphAPIActivityType, a aVar, String str, boolean z10, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f24941a.get(graphAPIActivityType));
        b bVar = b.f8014a;
        if (!b.f8017d) {
            b.f8014a.getClass();
            b.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b.f8015b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = b.f8016c;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            FeatureManager featureManager = FeatureManager.f24975a;
            FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
            if (!FeatureManager.b(feature)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z10);
            q qVar = q.f7852a;
            I.f7769a.getClass();
            I.c();
            jSONObject.put("advertiser_id_collection_enabled", I.f7774f.a());
            if (aVar != null) {
                if (FeatureManager.b(feature) && (Build.VERSION.SDK_INT < 31 || !s.x(context) || !aVar.f44871e)) {
                    jSONObject.put("anon_id", str);
                }
                if (aVar.f44869c != null && (!FeatureManager.b(feature) || Build.VERSION.SDK_INT < 31 || !s.x(context) || !aVar.f44871e)) {
                    jSONObject.put("attribution", aVar.f44869c);
                }
                if (aVar.a() != null) {
                    jSONObject.put("advertiser_id", aVar.a());
                    jSONObject.put("advertiser_tracking_enabled", !aVar.f44871e);
                }
                if (!aVar.f44871e) {
                    boolean z11 = v.f8052d.get();
                    v vVar = v.f8049a;
                    if (!z11) {
                        vVar.a();
                    }
                    HashMap map = new HashMap();
                    map.putAll(v.f8053e);
                    vVar.getClass();
                    HashMap map2 = new HashMap();
                    CopyOnWriteArraySet copyOnWriteArraySet = c.f20551d;
                    HashSet hashSet = new HashSet();
                    Iterator it = c.f20551d.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((c) it.next()).f20552a);
                    }
                    ConcurrentHashMap<String, String> concurrentHashMap = v.f8054f;
                    for (String str3 : concurrentHashMap.keySet()) {
                        if (hashSet.contains(str3)) {
                            map2.put(str3, concurrentHashMap.get(str3));
                        }
                    }
                    map.putAll(map2);
                    String strB = s.B(map);
                    if (strB.length() != 0) {
                        jSONObject.put("ud", strB);
                    }
                }
                String str4 = aVar.f44870d;
                if (str4 != null) {
                    jSONObject.put("installer_package", str4);
                }
            }
            try {
                s.G(context, jSONObject);
            } catch (Exception e10) {
                l.a aVar2 = l.f44910c;
                l.a.b(LoggingBehavior.f24776d, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
            }
            JSONObject jSONObjectN = s.n();
            if (jSONObjectN != null) {
                Iterator<String> itKeys = jSONObjectN.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectN.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th) {
            b.f8015b.readLock().unlock();
            throw th;
        }
    }
}
