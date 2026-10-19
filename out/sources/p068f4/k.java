package p068f4;

import Z3.q;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: InAppPurchaseLoggerManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f34982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f34983b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f34984c = new ConcurrentHashMap();

    public static void a() {
        ConcurrentHashMap concurrentHashMap;
        SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        SharedPreferences sharedPreferences2 = q.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
        if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
        }
        SharedPreferences sharedPreferences3 = q.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
        i.d(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
        f34982a = sharedPreferences3;
        CopyOnWriteArraySet copyOnWriteArraySet = f34983b;
        Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
        copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            concurrentHashMap = f34984c;
            if (!zHasNext) {
                break;
            }
            List listE0 = n.e0((String) it.next(), new String[]{";"}, 2, 2);
            concurrentHashMap.put(listE0.get(0), Long.valueOf(Long.parseLong((String) listE0.get(1))));
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences4 = f34982a;
        if (sharedPreferences4 == null) {
            i.m("sharedPreferences");
            throw null;
        }
        long j = sharedPreferences4.getLong("LAST_CLEARED_TIME", 0L);
        if (j == 0) {
            SharedPreferences sharedPreferences5 = f34982a;
            if (sharedPreferences5 != null) {
                sharedPreferences5.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                return;
            } else {
                i.m("sharedPreferences");
                throw null;
            }
        }
        if (jCurrentTimeMillis - j > 604800) {
            for (Map.Entry entry : y.x(concurrentHashMap).entrySet()) {
                String str = (String) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                if (jCurrentTimeMillis - jLongValue > 86400) {
                    copyOnWriteArraySet.remove(str + ';' + jLongValue);
                    concurrentHashMap.remove(str);
                }
            }
            SharedPreferences sharedPreferences6 = f34982a;
            if (sharedPreferences6 == null) {
                i.m("sharedPreferences");
                throw null;
            }
            sharedPreferences6.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
        }
    }
}
