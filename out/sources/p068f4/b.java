package p068f4;

import Z3.q;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34937b;

    public /* synthetic */ b(int i10) {
        this.f34937b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    @Override // java.lang.Runnable
    public final void run() {
        Class clsB;
        ArrayList<String> stringArrayList;
        long j;
        switch (this.f34937b) {
            case 0:
                Context contextA = q.a();
                HashMap<String, Method> map = j.f34977a;
                ArrayList arrayListA = j.a(j.d(contextA, e.f34946i, "inapp"));
                if (arrayListA.isEmpty()) {
                    Object obj = e.f34946i;
                    ArrayList arrayList = new ArrayList();
                    if (obj == null || (clsB = j.b(contextA, "com.android.vending.billing.IInAppBillingService")) == null || j.c(clsB, "getPurchaseHistory") == null) {
                        arrayListA = arrayList;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        if (j.f(contextA, obj, "inapp")) {
                            int i10 = 0;
                            boolean z10 = false;
                            String string = null;
                            do {
                                Object objE = j.e(contextA, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, j.f34979c, "inapp", string, new Bundle()});
                                if (objE != null) {
                                    long j10 = 1000;
                                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                    Bundle bundle = (Bundle) objE;
                                    if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                                        string = null;
                                    } else {
                                        for (String str : stringArrayList) {
                                            try {
                                                try {
                                                    j = 1000;
                                                    try {
                                                        if (jCurrentTimeMillis - (new JSONObject(str).getLong("purchaseTime") / 1000) > 1200) {
                                                            z10 = true;
                                                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                                        } else {
                                                            arrayList2.add(str);
                                                            i10++;
                                                        }
                                                    } catch (JSONException unused) {
                                                    }
                                                } catch (JSONException unused2) {
                                                    j = 1000;
                                                }
                                            } catch (JSONException unused3) {
                                                j = j10;
                                            }
                                            j10 = j;
                                        }
                                        string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                    }
                                } else {
                                    string = null;
                                }
                                if (i10 >= 30 || string == null) {
                                }
                            } while (!z10);
                        }
                        arrayListA = j.a(arrayList2);
                    }
                }
                e.a(e.f34938a, contextA, arrayListA, false);
                return;
            default:
                AtomicBoolean atomicBoolean = m.f44917d;
                try {
                    Iterator it = m.f44916c.iterator();
                    while (it.hasNext()) {
                        ((m.e) it.next()).a(true);
                    }
                    atomicBoolean.set(false);
                    return;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
        }
    }
}
