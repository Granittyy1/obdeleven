package p131k5;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1823h1;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.measurement.internal.d;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends n3 {
    /* JADX WARN: Multi-variable type inference failed */
    public final Uri.Builder t(String str) {
        d dVarS = s();
        dVarS.p();
        dVarS.O(str);
        String str2 = (String) dVarS.f26568l.get(str);
        Uri.Builder builder = new Uri.Builder();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        builder.scheme(c2523i1.f42218g.w(str, B.f41653Y));
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        C2501e c2501e = c2523i1.f42218g;
        if (zIsEmpty) {
            builder.authority(c2501e.w(str, B.f41655Z));
        } else {
            builder.authority(str2 + "." + c2501e.w(str, B.f41655Z));
        }
        builder.path(c2501e.w(str, B.f41658a0));
        return builder;
    }

    public final Pair<p3, Boolean> u(String str) {
        C2550p0 c2550p0G0;
        G5.a();
        p3 p3Var = null;
        if (((C2523i1) this.f3968a).f42218g.B(null, B.f41697t0)) {
            o();
            if (z3.t0(str)) {
                d().f41719n.c("sgtm feature flag enabled.");
                C2550p0 c2550p0G1 = r().g0(str);
                if (c2550p0G1 == null) {
                    return Pair.create(new p3(v(str)), Boolean.TRUE);
                }
                String strE = c2550p0G1.e();
                C1823h1 c1823h1I = s().I(str);
                if (c1823h1I == null || (c2550p0G0 = r().g0(str)) == null || ((!c1823h1I.P() || c1823h1I.F().v() != 100) && !o().r0(str, c2550p0G0.j()) && (TextUtils.isEmpty(strE) || strE.hashCode() % 100 >= c1823h1I.F().v()))) {
                    return Pair.create(new p3(v(str)), Boolean.TRUE);
                }
                if (c2550p0G1.m()) {
                    d().f41719n.c("sgtm upload enabled in manifest.");
                    C1823h1 c1823h1I2 = s().I(c2550p0G1.d());
                    if (c1823h1I2 != null && c1823h1I2.P()) {
                        String strY = c1823h1I2.F().y();
                        if (!TextUtils.isEmpty(strY)) {
                            String strX = c1823h1I2.F().x();
                            d().f41719n.a(strY, TextUtils.isEmpty(strX) ? "Y" : "N", "sgtm configured with upload_url, server_info");
                            if (TextUtils.isEmpty(strX)) {
                                p3Var = new p3(strY);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strX);
                                if (!TextUtils.isEmpty(c2550p0G1.j())) {
                                    map.put("x-gtm-server-preview", c2550p0G1.j());
                                }
                                p3 p3Var2 = new p3();
                                p3Var2.f42405a = strY;
                                p3Var2.f42406b = map;
                                p3Var = p3Var2;
                            }
                        }
                    }
                }
                if (p3Var != null) {
                    return Pair.create(p3Var, Boolean.FALSE);
                }
            }
        }
        return Pair.create(new p3(v(str)), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String v(String str) {
        d dVarS = s();
        dVarS.p();
        dVarS.O(str);
        String str2 = (String) dVarS.f26568l.get(str);
        if (TextUtils.isEmpty(str2)) {
            return B.f41694s.a(null);
        }
        Uri uri = Uri.parse(B.f41694s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
