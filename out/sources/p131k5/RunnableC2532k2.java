package p131k5;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.B5;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.P4;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: renamed from: k5.k2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2532k2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f42278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f42280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2536l2 f42281f;

    public RunnableC2532k2(C2536l2 c2536l2, boolean z10, Uri uri, String str, String str2) {
        this.f42277b = z10;
        this.f42278c = uri;
        this.f42279d = str;
        this.f42280e = str2;
        this.f42281f = c2536l2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZ;
        CharSequence charSequence;
        String str;
        Uri uri = this.f42278c;
        String str2 = this.f42280e;
        e eVar = this.f42281f.f42296b;
        eVar.p();
        try {
            z3 z3VarO = eVar.o();
            ((E5) B5.f25405c.get()).getClass();
            C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
            C2501e c2501e = c2523i1.f42218g;
            C2557r0<Boolean> c2557r0 = B.f41706y0;
            boolean zB = c2501e.B(null, c2557r0);
            P4.a();
            C2501e c2501e2 = c2523i1.f42218g;
            C2557r0<Boolean> c2557r1 = B.f41642S0;
            boolean zB2 = c2501e2.B(null, c2557r1);
            if (TextUtils.isEmpty(str2)) {
                bundleZ = null;
            } else {
                if (!str2.contains("gclid") && (!zB2 || !str2.contains("gbraid"))) {
                    if (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && (!zB || !str2.contains("sfmc_id"))) {
                        z3VarO.d().f41718m.c("Activity created with data 'referrer' without required params");
                        bundleZ = null;
                    }
                }
                bundleZ = z3VarO.z(Uri.parse("https://google.com/search?".concat(str2)), zB, zB2);
                if (bundleZ != null) {
                    bundleZ.putString("_cis", "referrer");
                }
            }
            String str3 = this.f42279d;
            boolean z10 = this.f42277b;
            D3 d10 = eVar.f26581n;
            if (z10) {
                z3 z3VarO2 = eVar.o();
                ((E5) B5.f25405c.get()).getClass();
                str = "Activity created with data 'referrer' without required params";
                boolean zB3 = c2523i1.f42218g.B(null, c2557r0);
                P4.a();
                charSequence = "utm_medium";
                Bundle bundleZ2 = z3VarO2.z(uri, zB3, c2523i1.f42218g.B(null, c2557r1));
                if (bundleZ2 != null) {
                    bundleZ2.putString("_cis", "intent");
                    if (!bundleZ2.containsKey("gclid") && bundleZ != null && bundleZ.containsKey("gclid")) {
                        bundleZ2.putString("_cer", "gclid=" + bundleZ.getString("gclid"));
                    }
                    eVar.V(bundleZ2, str3, "_cmp");
                    d10.a(bundleZ2, str3);
                }
            } else {
                charSequence = "utm_medium";
                str = "Activity created with data 'referrer' without required params";
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            eVar.d().f41718m.b(str2, "Activity created with referrer");
            if (c2523i1.f42218g.B(null, B.f41677j0)) {
                if (bundleZ != null) {
                    eVar.V(bundleZ, str3, "_cmp");
                    d10.a(bundleZ, str3);
                } else {
                    eVar.d().f41718m.b(str2, "Referrer does not contain valid parameters");
                }
                eVar.M("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains(charSequence) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                eVar.d().f41718m.c(str);
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                eVar.M("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e10) {
            eVar.d().f41712f.b(e10, "Throwable caught in handleReferrerForOnActivityCreated");
        }
    }
}
