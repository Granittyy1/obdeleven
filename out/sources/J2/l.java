package J2;

import U4.C0804l;
import Z3.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.braze.models.FeatureFlag;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import p131k5.B0;
import p131k5.C2493c1;
import p131k5.C2507f0;
import p131k5.C2523i1;
import p131k5.E1;
import p131k5.L0;
import p131k5.z3;

/* JADX INFO: compiled from: WebkitToCompatConverter.java */
/* JADX INFO: loaded from: classes.dex */
public class l implements E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3968a;

    public l(C2523i1 c2523i1) {
        C0804l.h(c2523i1);
        this.f3968a = c2523i1;
    }

    public static boolean k(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void m(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    @Override // p131k5.E1
    public Context a() {
        return ((C2523i1) this.f3968a).f42212a;
    }

    @Override // p131k5.E1
    public C2507f0 b() {
        return ((C2523i1) this.f3968a).f42217f;
    }

    @Override // p131k5.E1
    public B0 d() {
        B0 b10 = ((C2523i1) this.f3968a).f42220i;
        C2523i1.g(b10);
        return b10;
    }

    public boolean e(String str) {
        String strJ = j(str);
        return "1".equals(strJ) || Boolean.parseBoolean(strJ);
    }

    public Integer f(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strJ));
        } catch (NumberFormatException unused) {
            m(str);
            return null;
        }
    }

    public JSONArray g(String str) {
        String strJ = j(str);
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        try {
            return new JSONArray(strJ);
        } catch (JSONException unused) {
            m(str);
            return null;
        }
    }

    public String h(Resources resources, String str, String str2) {
        String[] strArr;
        String strJ = j(str2);
        if (!TextUtils.isEmpty(strJ)) {
            return strJ;
        }
        String strJ2 = j(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strJ2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strJ2, FeatureFlag.PROPERTIES_TYPE_STRING, str);
        if (identifier == 0) {
            m(str2.concat("_loc_key"));
            return null;
        }
        JSONArray jSONArrayG = g(str2.concat("_loc_args"));
        if (jSONArrayG == null) {
            strArr = null;
        } else {
            int length = jSONArrayG.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = jSONArrayG.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            m(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    @Override // p131k5.E1
    public C2493c1 i() {
        C2493c1 c2493c1 = ((C2523i1) this.f3968a).j;
        C2523i1.g(c2493c1);
        return c2493c1;
    }

    public String j(String str) {
        Bundle bundle = (Bundle) this.f3968a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle l() {
        Bundle bundle = (Bundle) this.f3968a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(TicketDetailDestinationKt.LAUNCHED_FROM)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public L0 n() {
        L0 l10 = ((C2523i1) this.f3968a).f42219h;
        C2523i1.e(l10);
        return l10;
    }

    public z3 o() {
        z3 z3Var = ((C2523i1) this.f3968a).f42222l;
        C2523i1.e(z3Var);
        return z3Var;
    }

    public void p() {
        C2493c1 c2493c1 = ((C2523i1) this.f3968a).j;
        C2523i1.g(c2493c1);
        c2493c1.p();
    }

    @Override // p131k5.E1
    public Y4.c x() {
        return ((C2523i1) this.f3968a).f42224n;
    }

    public l() {
        SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f3968a = sharedPreferences;
    }

    public l(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f3968a = webkitToCompatConverterBoundaryInterface;
    }

    public l(Bundle bundle) {
        this.f3968a = new Bundle(bundle);
    }
}
