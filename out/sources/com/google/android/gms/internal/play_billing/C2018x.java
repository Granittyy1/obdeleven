package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
import p237t3.C2795h;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2018x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f26297a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return 6;
    }

    public static void b(long j, Bundle bundle, String str, String str2) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(com.android.billingclient.api.a aVar, zzie zzieVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", aVar.f23552a);
        bundle.putString("DEBUG_MESSAGE", aVar.f23554c);
        bundle.putInt("LOG_REASON", zzieVar.a());
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, com.voltasit.obdeleven.domain.usecases.device.v vVar, long j) {
        Bundle bundle = new Bundle();
        b(j, bundle, str, str2);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        C2006t c2006t = zzbt.f26320c;
        Object[] objArr = {"subs", "inapp"};
        C2015w.a(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(zzbt.B(2, objArr)));
        Object[] objArr2 = {"inapp"};
        C2015w.a(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(zzbt.B(1, objArr2)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C2795h.b bVar = (C2795h.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z11 |= !TextUtils.isEmpty(null);
            if (bVar.f47213b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static com.android.billingclient.api.a e(Intent intent, String str) {
        if (intent != null) {
            com.android.billingclient.api.a.C0244a c0244aA = com.android.billingclient.api.a.a();
            c0244aA.f23555a = a(intent.getExtras(), str);
            c0244aA.f23557c = f(intent.getExtras(), str);
            return c0244aA.a();
        }
        Log.isLoggable("BillingHelper", 5);
        com.android.billingclient.api.a.C0244a c0244aA2 = com.android.billingclient.api.a.a();
        c0244aA2.f23555a = 6;
        c0244aA2.f23557c = "An internal error occurred.";
        return c0244aA2.a();
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return "";
    }

    public static String g(int i10) {
        zzbw zzbwVar = zzb.f26315c;
        Integer numValueOf = Integer.valueOf(i10);
        return (!zzbwVar.containsKey(numValueOf) ? zzb.RESPONSE_CODE_UNSPECIFIED : (zzb) zzbwVar.get(numValueOf)).toString();
    }

    public static void h(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i10 = 40000;
        while (!str2.isEmpty() && i10 > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i10));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i10 -= iMin;
        }
    }

    public static void i(String str) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            h("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            "Got JSONException while parsing purchase data: ".concat(e10.toString());
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
