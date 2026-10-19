package p093h4;

import Z3.I;
import Z3.q;
import android.os.Bundle;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.n;
import p005a4.t;
import p165n4.j;
import p165n4.l;

/* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f36148a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36149b = f.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f36150c = new t(q.a());

    /* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigDecimal f36151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Currency f36152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f36153c;
    }

    public static final void a(String str, String skuDetails, boolean z10) {
        a aVar;
        String str2;
        int i10 = 1;
        i.e(skuDetails, "skuDetails");
        j jVarB = FetchedAppSettingsManager.b(q.b());
        if (jVarB != null && I.a() && jVarB.f44900f) {
            f36148a.getClass();
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(skuDetails);
                Bundle bundle = new Bundle(1);
                bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
                bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
                bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
                bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
                String strOptString = jSONObject2.optString("type");
                bundle.putCharSequence("fb_iap_product_type", strOptString);
                if (i.a(strOptString, "subs")) {
                    bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                    bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                    bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                    String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                    i.d(introductoryPriceCycles, "introductoryPriceCycles");
                    if (introductoryPriceCycles.length() != 0) {
                        bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
                }
                BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
                Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
                i.d(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
                aVar = new a();
                aVar.f36151a = bigDecimal;
                aVar.f36152b = currency;
                aVar.f36153c = bundle;
            } catch (JSONException e10) {
                Log.e(f36149b, "Error parsing in-app subscription data.", e10);
                aVar = null;
            }
            if (aVar == null) {
                return;
            }
            t tVar = f36150c;
            Bundle bundle2 = aVar.f36153c;
            Currency currency2 = aVar.f36152b;
            BigDecimal bigDecimal2 = aVar.f36151a;
            if (z10) {
                p165n4.i iVar = p165n4.i.f44889a;
                if (p165n4.i.b("app_events_if_auto_log_subs", q.b(), false)) {
                    HashMap<String, Method> map2 = p068f4.j.f34977a;
                    try {
                        String strOptString2 = new JSONObject(skuDetails).optString("freeTrialPeriod");
                        str2 = (strOptString2 == null || strOptString2.length() <= 0) ? "Subscribe" : "StartTrial";
                    } catch (JSONException unused) {
                    }
                    String str3 = str2;
                    tVar.getClass();
                    q qVar = q.f7852a;
                    if (I.a()) {
                        n nVar = (n) tVar.f8043a;
                        nVar.getClass();
                        if (bigDecimal2 == null || currency2 == null) {
                            return;
                        }
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle3 = bundle2;
                        bundle3.putString("fb_currency", currency2.getCurrencyCode());
                        nVar.a(str3, Double.valueOf(bigDecimal2.doubleValue()), bundle3, true, e.b());
                        return;
                    }
                    return;
                }
            }
            tVar.getClass();
            q qVar2 = q.f7852a;
            if (I.a()) {
                n nVar2 = (n) tVar.f8043a;
                nVar2.getClass();
                if (bigDecimal2 == null) {
                    l.a aVar2 = l.f44910c;
                    l.a.a(LoggingBehavior.f24777e, "AppEvents", "purchaseAmount cannot be null");
                    return;
                }
                if (currency2 == null) {
                    l.a aVar3 = l.f44910c;
                    l.a.a(LoggingBehavior.f24777e, "AppEvents", "currency cannot be null");
                    return;
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                Bundle bundle4 = bundle2;
                bundle4.putString("fb_currency", currency2.getCurrencyCode());
                nVar2.a("fb_mobile_purchase", Double.valueOf(bigDecimal2.doubleValue()), bundle4, true, e.b());
                synchronized (n.f8035d) {
                }
                String str4 = p005a4.j.f8027a;
                p005a4.j.f8030d.execute(new X8.a(i10, FlushReason.f24783e));
            }
        }
    }
}
