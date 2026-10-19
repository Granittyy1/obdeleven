package p068f4;

import S4.o;
import Z3.I;
import Z3.q;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import f4.i.c;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONException;
import org.json.JSONObject;
import p093h4.f;
import p165n4.j;

/* JADX INFO: compiled from: InAppPurchaseManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f34985a = new AtomicBoolean(false);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final void a() {
        Class<?> cls;
        Class<ProxyBillingActivity> cls2;
        i iVar;
        if (f34985a.get()) {
            try {
                Context contextA = q.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                i.d(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string != null && Integer.parseInt((String) n.e0(string, new String[]{"."}, 3, 2).get(0)) >= 2) {
                    FeatureManager featureManager = FeatureManager.f24975a;
                    if (FeatureManager.b(FeatureManager.Feature.IapLoggingLib2)) {
                        Context contextA2 = q.a();
                        if (Purchase.class == 0) {
                            return;
                        }
                        synchronized (i.f34950s) {
                            AtomicBoolean atomicBoolean = i.f34951t;
                            if (atomicBoolean.get()) {
                                iVar = i.f34952u;
                            } else {
                                i.b.a(contextA2);
                                atomicBoolean.set(true);
                                iVar = i.f34952u;
                            }
                        }
                        if (iVar != null && i.f34953v.get()) {
                            k.a();
                            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                            SharedPreferences sharedPreferences = k.f34982a;
                            if (sharedPreferences == null) {
                                i.m("sharedPreferences");
                                throw null;
                            }
                            long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                            if (j == 0 || jCurrentTimeMillis - j >= 86400) {
                                SharedPreferences sharedPreferences2 = k.f34982a;
                                if (sharedPreferences2 == null) {
                                    i.m("sharedPreferences");
                                    throw null;
                                }
                                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
                                h hVar = new h(iVar, 0, new f());
                                Class<?> cls3 = iVar.f34964i;
                                o.l(iVar.f34958c, iVar.f34957b, iVar.f34970p, "inapp", Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, iVar.new c(hVar)));
                                return;
                            }
                            g gVar = new g();
                            Object objL = o.l(iVar.f34959d, o.l(iVar.f34958c, iVar.f34957b, iVar.j, "inapp"), iVar.f34965k, new Object[0]);
                            List list = objL instanceof List ? (List) objL : null;
                            if (list == null) {
                                return;
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Object objL2 = o.l(iVar.f34960e, it.next(), iVar.f34966l, new Object[0]);
                                    String str = objL2 instanceof String ? (String) objL2 : null;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String skuID = jSONObject.getString("productId");
                                            arrayList.add(skuID);
                                            ConcurrentHashMap concurrentHashMap = i.f34954w;
                                            i.d(skuID, "skuID");
                                            concurrentHashMap.put(skuID, jSONObject);
                                        }
                                    }
                                }
                                iVar.a(arrayList, gVar);
                                return;
                            } catch (JSONException unused) {
                                return;
                            }
                        }
                        return;
                    }
                }
            } catch (Exception unused2) {
            }
            e.f34938a.getClass();
            if (e.f34941d == null) {
                try {
                    cls = Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                } catch (ClassNotFoundException unused3) {
                    cls = null;
                }
                Boolean boolValueOf = Boolean.valueOf(cls != null);
                e.f34941d = boolValueOf;
                if (!boolValueOf.equals(Boolean.FALSE)) {
                    try {
                        cls2 = ProxyBillingActivity.class;
                        int i10 = ProxyBillingActivity.f23536h;
                    } catch (ClassNotFoundException unused4) {
                        cls2 = null;
                    }
                    e.f34942e = Boolean.valueOf(cls2 != null);
                    HashMap<String, Method> map = j.f34977a;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                    SharedPreferences sharedPreferences3 = j.f34980d;
                    long j10 = sharedPreferences3.getLong("LAST_CLEARED_TIME", 0L);
                    if (j10 == 0) {
                        sharedPreferences3.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis2).apply();
                    } else if (jCurrentTimeMillis2 - j10 > 604800) {
                        sharedPreferences3.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis2).apply();
                    }
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                    i.d(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                    e.f34945h = intent;
                    e.f34943f = new a();
                    e.f34944g = new d();
                }
            }
            if (i.a(e.f34941d, Boolean.FALSE)) {
                return;
            }
            f fVar = f.f36148a;
            j jVarB = FetchedAppSettingsManager.b(q.b());
            if (jVarB != null && I.a() && jVarB.f44900f && e.f34940c.compareAndSet(false, true)) {
                Context contextA3 = q.a();
                if (contextA3 instanceof Application) {
                    Application application = (Application) contextA3;
                    d dVar = e.f34944g;
                    if (dVar == null) {
                        i.m("callbacks");
                        throw null;
                    }
                    application.registerActivityLifecycleCallbacks(dVar);
                    Intent intent2 = e.f34945h;
                    if (intent2 == null) {
                        i.m("intent");
                        throw null;
                    }
                    a aVar = e.f34943f;
                    if (aVar != null) {
                        contextA3.bindService(intent2, aVar, 1);
                    } else {
                        i.m("serviceConnection");
                        throw null;
                    }
                }
            }
        }
    }
}
