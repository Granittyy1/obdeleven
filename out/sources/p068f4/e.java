package p068f4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.json.JSONException;
import org.json.JSONObject;
import p093h4.f;

/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f34938a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34939b = e.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f34940c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f34941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f34942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f34943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static d f34944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Intent f34945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f34946i;

    public static final void a(e eVar, Context context, ArrayList arrayList, boolean z10) {
        SharedPreferences sharedPreferences;
        int i10;
        int size;
        eVar.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = (String) it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                i.d(sku, "sku");
                i.d(purchase, "purchase");
                map.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f34939b, "Error parsing in-app purchase data.", e10);
            }
        }
        HashMap<String, Method> map2 = j.f34977a;
        Object obj = f34946i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            sharedPreferences = j.f34980d;
            i10 = 0;
            if (!zHasNext) {
                break;
            }
            String sku2 = (String) it2.next();
            String string = sharedPreferences.getString(sku2, null);
            if (string != null) {
                List listE0 = n.e0(string, new String[]{";"}, 2, 2);
                if (jCurrentTimeMillis - Long.parseLong((String) listE0.get(0)) < 43200) {
                    i.d(sku2, "sku");
                    linkedHashMap.put(sku2, listE0.get(1));
                }
            }
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (String str : arrayList2) {
            if (!linkedHashMap.containsKey(str)) {
                arrayList3.add(str);
            }
        }
        HashMap<String, Method> map3 = j.f34977a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (obj != null && !arrayList3.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            Object objE = j.e(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, j.f34979c, z10 ? "subs" : "inapp", bundle});
            if (objE != null) {
                Bundle bundle2 = (Bundle) objE;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList3.size() == stringArrayList.size() && (size = arrayList3.size() - 1) >= 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            String str2 = arrayList3.get(i10);
                            i.d(str2, "skuList[i]");
                            String str3 = stringArrayList.get(i10);
                            i.d(str3, "skuDetailsList[i]");
                            linkedHashMap2.put(str2, str3);
                            if (i11 > size) {
                                break;
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis2 + ';' + ((String) entry.getValue()));
                    }
                    editorEdit.apply();
                }
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str4 = (String) entry2.getKey();
            String str5 = (String) entry2.getValue();
            String str6 = (String) map.get(str4);
            if (str6 != null) {
                f.a(str6, str5, z10);
            }
        }
    }
}
