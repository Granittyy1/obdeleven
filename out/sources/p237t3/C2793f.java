package p237t3;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: t3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2793f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f47197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f47204i;
    public final ArrayList j;

    /* JADX INFO: renamed from: t3.f$a */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f47207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f47208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F f47209e;

        public a(JSONObject jSONObject) throws JSONException {
            this.f47205a = jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            F f10 = null;
            this.f47206b = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f47207c = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f47207c.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                    jSONObjectOptJSONObject.optInt("percentageDiscount");
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                    jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                    jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject3 != null) {
                if (jSONObjectOptJSONObject3.has("startTimeMillis")) {
                    jSONObjectOptJSONObject3.optLong("startTimeMillis");
                }
                if (jSONObjectOptJSONObject3.has("endTimeMillis")) {
                    jSONObjectOptJSONObject3.optLong("endTimeMillis");
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getInt("maximumQuantity");
                jSONObjectOptJSONObject4.getInt("remainingQuantity");
            }
            this.f47208d = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject5.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject6 != null) {
                jSONObjectOptJSONObject6.getString("rentalPeriod");
                jSONObjectOptJSONObject6.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject7 != null) {
                f10 = new F();
                jSONObjectOptJSONObject7.getString("type");
            }
            this.f47209e = f10;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject8 != null) {
                    arrayList.add(new b(jSONObjectOptJSONObject8));
                }
            }
        }
    }

    /* JADX INFO: renamed from: t3.f$b */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class b {
        public b(JSONObject jSONObject) {
            jSONObject.optString("billingPeriod");
            jSONObject.optString("priceCurrencyCode");
            jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }
    }

    /* JADX INFO: renamed from: t3.f$c */
    /* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
    public static final class c {
    }

    public C2793f(String str) throws JSONException {
        this.f47196a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f47197b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f47198c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f47199d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f47200e = jSONObject.optString("title");
        this.f47201f = jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f47202g = jSONObject.optString("skuDetailsToken");
        this.f47203h = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                c cVar = new c();
                jSONObject2.optString("basePlanId");
                jSONObject2.optString("offerId").getClass();
                jSONObject2.getString("offerIdToken");
                JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                ArrayList arrayList2 = new ArrayList();
                if (jSONArray != null) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList2.add(new b(jSONObjectOptJSONObject));
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
                    jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
                if (jSONObjectOptJSONObject3 != null) {
                    jSONObjectOptJSONObject3.getString("productId");
                    jSONObjectOptJSONObject3.optString("title");
                    jSONObjectOptJSONObject3.optString("name");
                    jSONObjectOptJSONObject3.optString("description");
                    jSONObjectOptJSONObject3.optString("basePlanId");
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
                    if (jSONObjectOptJSONObject4 != null) {
                        jSONObjectOptJSONObject4.optString("billingPeriod");
                        jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                        jSONObjectOptJSONObject4.optString("formattedPrice");
                        jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                        jSONObjectOptJSONObject4.optInt("recurrenceMode");
                        jSONObjectOptJSONObject4.optInt("billingCycleCount");
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("offerTags");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                        arrayList3.add(jSONArrayOptJSONArray2.getString(i12));
                    }
                }
                arrayList.add(cVar);
            }
            this.f47204i = arrayList;
        } else {
            this.f47204i = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject5 = this.f47197b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray3 = this.f47197b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList4 = new ArrayList();
        if (jSONArrayOptJSONArray3 != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                arrayList4.add(new a(jSONArrayOptJSONArray3.getJSONObject(i13)));
            }
            this.j = arrayList4;
            return;
        }
        if (jSONObjectOptJSONObject5 == null) {
            this.j = null;
        } else {
            arrayList4.add(new a(jSONObjectOptJSONObject5));
            this.j = arrayList4;
        }
    }

    public final a a() {
        ArrayList arrayList = this.j;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (a) arrayList.get(0);
    }

    public final String b() {
        return this.f47198c;
    }

    public final String c() {
        return this.f47199d;
    }

    public final String d() {
        return this.f47197b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2793f) {
            return TextUtils.equals(this.f47196a, ((C2793f) obj).f47196a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47196a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f47196a + "', parsedJson=" + this.f47197b.toString() + ", productId='" + this.f47198c + "', productType='" + this.f47199d + "', title='" + this.f47200e + "', productDetailsToken='" + this.f47202g + "', subscriptionOfferDetails=" + String.valueOf(this.f47204i) + "}";
    }
}
