package p068f4;

import S4.o;
import Z3.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InAppPurchaseEventManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, Method> f34977a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Class<?>> f34978b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34979c = q.a().getPackageName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SharedPreferences f34980d = q.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f34981e = q.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        SharedPreferences sharedPreferences = f34981e;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (jCurrentTimeMillis - (j / 1000) <= 86400 && !i.a(sharedPreferences.getString(string, ""), string2)) {
                    editorEdit.putString(string, string2);
                    arrayList2.add(str);
                }
            } catch (JSONException unused) {
            }
        }
        editorEdit.apply();
        return arrayList2;
    }

    public static Class b(Context context, String str) {
        Class<?> clsLoadClass;
        HashMap<String, Class<?>> map = f34978b;
        Class<?> cls = map.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            clsLoadClass = context.getClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass != null) {
            map.put(str, clsLoadClass);
        }
        return clsLoadClass;
    }

    public static Method c(Class cls, String str) {
        Class[] clsArr;
        HashMap<String, Method> map = f34977a;
        Method method = map.get(str);
        if (method != null) {
            return method;
        }
        switch (str) {
            case "getPurchases":
                Class TYPE = Integer.TYPE;
                i.d(TYPE, "TYPE");
                clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                break;
            case "isBillingSupported":
                Class TYPE2 = Integer.TYPE;
                i.d(TYPE2, "TYPE");
                clsArr = new Class[]{TYPE2, String.class, String.class};
                break;
            case "asInterface":
                clsArr = new Class[]{IBinder.class};
                break;
            case "getPurchaseHistory":
                Class TYPE3 = Integer.TYPE;
                i.d(TYPE3, "TYPE");
                clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                break;
            case "getSkuDetails":
                Class TYPE4 = Integer.TYPE;
                i.d(TYPE4, "TYPE");
                clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                break;
            default:
                clsArr = null;
                break;
        }
        Method methodI = clsArr == null ? o.i(cls, str, null) : o.i(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        if (methodI != null) {
            map.put(str, methodI);
        }
        return methodI;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[EDGE_INSN: B:20:0x0050->B:19:0x0050 BREAK  A[LOOP:0: B:8:0x0011->B:23:?], SYNTHETIC] */
    public static ArrayList d(Context context, Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        if (obj != null && f(context, obj, str)) {
            int i10 = 0;
            String string = null;
            do {
                Object objE = e(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, f34979c, str, string});
                if (objE == null) {
                    string = null;
                    if (i10 < 30) {
                        break;
                        break;
                    }
                } else {
                    Bundle bundle = (Bundle) objE;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if (stringArrayList == null) {
                            break;
                        }
                        int size = stringArrayList.size() + i10;
                        arrayList.addAll(stringArrayList);
                        string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        i10 = size;
                    } else {
                        string = null;
                    }
                    if (i10 < 30) {
                        break;
                    }
                }
            } while (string != null);
        }
        return arrayList;
    }

    public static Object e(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodC;
        Class clsB = b(context, str);
        if (clsB == null || (methodC = c(clsB, str2)) == null) {
            return null;
        }
        return o.l(clsB, obj, methodC, Arrays.copyOf(objArr, objArr.length));
    }

    public static boolean f(Context context, Object obj, String str) {
        Object objE;
        return (obj == null || (objE = e(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f34979c, str})) == null || ((Integer) objE).intValue() != 0) ? false : true;
    }
}
