package p237t3;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.q;

/* JADX INFO: renamed from: t3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2796i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47219d;

    public C2796i(String str) throws JSONException {
        this.f47216a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f47217b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f47218c = strOptString;
        this.f47219d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2796i) {
            return TextUtils.equals(this.f47216a, ((C2796i) obj).f47216a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47216a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f47217b);
        sb2.append("', productType='");
        sb2.append(this.f47218c);
        sb2.append("', statusCode=");
        return q.c(sb2, this.f47219d, "}");
    }
}
