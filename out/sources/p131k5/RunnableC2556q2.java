package p131k5;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.P4;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: k5.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2556q2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ RunnableC2548o2 f42412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f42413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ IOException f42414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ byte[] f42415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Map f42416f;

    @Override // java.lang.Runnable
    public final void run() {
        C2523i1 c2523i1 = (C2523i1) this.f42412b.f42323c.f5232a;
        B0 b10 = c2523i1.f42220i;
        int i10 = this.f42413c;
        IOException iOException = this.f42414d;
        if ((i10 != 200 && i10 != 204 && i10 != 304) || iOException != null) {
            C2523i1.g(b10);
            b10.f41715i.a(Integer.valueOf(i10), iOException, "Network Request for Deferred Deep Link failed. response, exception");
            return;
        }
        L0 l10 = c2523i1.f42219h;
        C2523i1.e(l10);
        l10.f41878u.a(true);
        byte[] bArr = this.f42415e;
        if (bArr == null || bArr.length == 0) {
            C2523i1.g(b10);
            b10.f41718m.c("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(strOptString)) {
                C2523i1.g(b10);
                b10.f41718m.c("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            P4.a();
            boolean zB = c2523i1.f42218g.B(null, B.f41642S0);
            z3 z3Var = c2523i1.f42222l;
            if (zB) {
                C2523i1.e(z3Var);
                if (!z3Var.y0(strOptString)) {
                    C2523i1.g(b10);
                    b10.f41715i.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                bundle.putString("gbraid", strOptString3);
            } else {
                C2523i1.e(z3Var);
                if (!z3Var.y0(strOptString)) {
                    C2523i1.g(b10);
                    b10.f41715i.a(strOptString2, strOptString, "Deferred Deep Link validation failed. gclid, deep link");
                    return;
                }
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            c2523i1.f42226p.V(bundle, "auto", "_cmp");
            C2523i1.e(z3Var);
            if (TextUtils.isEmpty(strOptString) || !z3Var.a0(strOptString, dOptDouble)) {
                return;
            }
            ((C2523i1) z3Var.f3968a).f42212a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            C2523i1.g(b10);
            b10.f41712f.b(e10, "Failed to parse the Deferred Deep Link response. exception");
        }
    }
}
