package p237t3;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.platform.c1;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.InterfaceC1956c;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.t;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f47235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2789b f47236c;

    public p(C2789b c2789b, t tVar) {
        this.f47235b = tVar;
        Objects.requireNonNull(c2789b);
        this.f47236c = c2789b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e4 A[LOOP:0: B:98:0x0078->B:82:0x01e4, LOOP_END] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        c1 c1VarX;
        InterfaceC1956c interfaceC1956c;
        int i10;
        Bundle bundleW;
        a aVarA;
        zzie zzieVar;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        int i11;
        boolean z10;
        int i12;
        int i13;
        JSONObject jSONObject;
        int i14;
        C2789b c2789b = this.f47236c;
        Exception exc = null;
        int i15 = 9;
        if (c2789b.o()) {
            int i16 = 5;
            if (!TextUtils.isEmpty("inapp")) {
                C2018x.h("BillingClient", "Querying owned items, item type: ".concat("inapp"));
                ArrayList arrayList = new ArrayList();
                boolean z11 = c2789b.f47174n;
                c2789b.f47184x.getClass();
                c2789b.f47184x.getClass();
                long jLongValue = c2789b.f47160B.longValue();
                Bundle bundle = new Bundle();
                C2018x.b(jLongValue, bundle, c2789b.f47164c, c2789b.f47165d);
                if (z11) {
                    bundle.putBoolean("enablePendingPurchases", true);
                }
                String string = null;
                while (true) {
                    try {
                        synchronized (c2789b.f47162a) {
                            interfaceC1956c = c2789b.f47170i;
                        }
                        if (interfaceC1956c == null) {
                            c1VarX = c2789b.x(b.f23565h, zzie.SERVICE_RESET_TO_NULL, exc);
                            break;
                        }
                        if (c2789b.f47174n) {
                            if (c2789b.f47183w) {
                                i10 = 26;
                            } else if (c2789b.f47182v) {
                                i10 = 24;
                            } else {
                                i10 = c2789b.f47179s ? 19 : i15;
                            }
                            bundleW = interfaceC1956c.W(i10, bundle, c2789b.f47168g.getPackageName(), string);
                        } else {
                            bundleW = interfaceC1956c.L(c2789b.f47168g.getPackageName(), string);
                        }
                        a aVar = b.f23563f;
                        if (bundleW == null) {
                            Log.isLoggable("BillingClient", i16);
                            zzieVar = zzie.NULL_OWNED_ITEMS_LIST;
                        } else {
                            int iA = C2018x.a(bundleW, "BillingClient");
                            String strF = C2018x.f(bundleW, "BillingClient");
                            a.C0244a c0244aA = a.a();
                            c0244aA.f23555a = iA;
                            c0244aA.f23557c = strF;
                            aVarA = c0244aA.a();
                            if (iA != 0) {
                                Log.isLoggable("BillingClient", i16);
                                zzieVar = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                            } else if (bundleW.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleW.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleW.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                ArrayList<String> stringArrayList4 = bundleW.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList5 = bundleW.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList6 = bundleW.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                if (stringArrayList4 == null) {
                                    Log.isLoggable("BillingClient", i16);
                                    zzieVar = zzie.NULL_SKUS_LIST;
                                } else if (stringArrayList5 == null) {
                                    Log.isLoggable("BillingClient", i16);
                                    zzieVar = zzie.NULL_PURCHASES_LIST;
                                } else if (stringArrayList6 == null) {
                                    Log.isLoggable("BillingClient", i16);
                                    zzieVar = zzie.NULL_SIGNATURES_LIST;
                                } else {
                                    aVarA = b.f23564g;
                                    zzieVar = zzie.REASON_UNSPECIFIED;
                                }
                            } else {
                                Log.isLoggable("BillingClient", i16);
                                zzieVar = zzie.MISSING_REQUIRED_PURCHASE_KEY;
                            }
                            if (aVarA != b.f23564g) {
                                c1VarX = c2789b.x(aVarA, zzieVar, exc);
                                break;
                            }
                            stringArrayList = bundleW.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            stringArrayList2 = bundleW.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            stringArrayList3 = bundleW.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            i11 = 0;
                            z10 = false;
                            while (i11 < stringArrayList2.size()) {
                                String str = stringArrayList2.get(i11);
                                String str2 = stringArrayList3.get(i11);
                                C2018x.h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                                try {
                                    Purchase purchase = new Purchase(str, str2);
                                    jSONObject = purchase.f23551c;
                                    if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                        i14 = 5;
                                        Log.isLoggable("BillingClient", 5);
                                        z10 = true;
                                    } else {
                                        i14 = 5;
                                    }
                                    arrayList.add(purchase);
                                    i11++;
                                    i16 = i14;
                                } catch (JSONException e10) {
                                    c1VarX = c2789b.x(b.f23563f, zzie.ERROR_DECODING_PURCHASE_DATA, e10);
                                }
                            }
                            i12 = i16;
                            if (z10) {
                                i13 = 9;
                                c2789b.y(9, aVar, zzie.EMPTY_PURCHASE_TOKEN);
                            } else {
                                i13 = 9;
                            }
                            string = bundleW.getString("INAPP_CONTINUATION_TOKEN");
                            C2018x.h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                            if (TextUtils.isEmpty(string)) {
                                c1VarX = new c1(b.f23564g, arrayList);
                                break;
                            }
                            exc = null;
                            int i17 = i13;
                            i16 = i12;
                            i15 = i17;
                        }
                        aVarA = aVar;
                        if (aVarA != b.f23564g) {
                            c1VarX = c2789b.x(aVarA, zzieVar, exc);
                            break;
                        }
                        stringArrayList = bundleW.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        stringArrayList2 = bundleW.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        stringArrayList3 = bundleW.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        i11 = 0;
                        z10 = false;
                        while (i11 < stringArrayList2.size()) {
                            String str3 = stringArrayList2.get(i11);
                            String str4 = stringArrayList3.get(i11);
                            C2018x.h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i11))));
                            Purchase purchase2 = new Purchase(str3, str4);
                            jSONObject = purchase2.f23551c;
                            if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                i14 = 5;
                                Log.isLoggable("BillingClient", 5);
                                z10 = true;
                            } else {
                                i14 = 5;
                            }
                            arrayList.add(purchase2);
                            i11++;
                            i16 = i14;
                        }
                        i12 = i16;
                        if (z10) {
                            i13 = 9;
                            c2789b.y(9, aVar, zzie.EMPTY_PURCHASE_TOKEN);
                        } else {
                            i13 = 9;
                        }
                        string = bundleW.getString("INAPP_CONTINUATION_TOKEN");
                        C2018x.h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                        if (TextUtils.isEmpty(string)) {
                            c1VarX = new c1(b.f23564g, arrayList);
                            break;
                        }
                        exc = null;
                        int i18 = i13;
                        i16 = i12;
                        i15 = i18;
                    } catch (DeadObjectException e11) {
                        c1VarX = c2789b.x(b.f23565h, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
                    } catch (Exception e12) {
                        c1VarX = c2789b.x(b.f23563f, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, e12);
                    }
                }
                ArrayList arrayList2 = (ArrayList) c1VarX.f15035a;
                if (arrayList2 != null) {
                    this.f47235b.b((a) c1VarX.f15036b, arrayList2);
                } else {
                    this.f47235b.b((a) c1VarX.f15036b, zzbt.G());
                }
                return null;
            }
            int i19 = C2018x.f26297a;
            Log.isLoggable("BillingClient", 5);
            zzie zzieVar2 = zzie.EMPTY_PRODUCT_TYPE;
            a aVar2 = b.f23561d;
            c2789b.y(9, aVar2, zzieVar2);
            this.f47235b.b(aVar2, zzbt.G());
        } else {
            zzie zzieVar3 = zzie.SERVICE_CONNECTION_NOT_READY;
            a aVar3 = b.f23565h;
            c2789b.y(9, aVar3, zzieVar3);
            this.f47235b.b(aVar3, zzbt.G());
        }
        return null;
    }
}
