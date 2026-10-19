package R4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import p131k5.B0;
import p131k5.C2493c1;
import p131k5.C2523i1;
import p131k5.D3;
import p131k5.L0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5280c;

    public /* synthetic */ g(int i10, Object obj) {
        this.f5279b = i10;
        this.f5280c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5279b) {
            case 0:
                ((p191p5.h) this.f5280c).c(new IOException("TIMEOUT"));
                break;
            default:
                D3 d10 = ((com.google.android.gms.measurement.internal.e) this.f5280c).f26581n;
                C2523i1 c2523i1 = d10.f41754a;
                C2493c1 c2493c1 = c2523i1.j;
                C2523i1.g(c2493c1);
                c2493c1.p();
                if (d10.b()) {
                    boolean zC = d10.c();
                    com.google.android.gms.measurement.internal.e eVar = c2523i1.f42226p;
                    L0 l10 = c2523i1.f42219h;
                    if (zC) {
                        C2523i1.e(l10);
                        l10.f41881x.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C2523i1.f(eVar);
                        eVar.V(bundle, "auto", "_cmpx");
                    } else {
                        C2523i1.e(l10);
                        String strA = l10.f41881x.a();
                        if (TextUtils.isEmpty(strA)) {
                            B0 b10 = c2523i1.f42220i;
                            C2523i1.g(b10);
                            b10.f41713g.c("Cache still valid but referrer not found");
                        } else {
                            C2523i1.e(l10);
                            long jA = ((l10.f41882y.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strA);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C2523i1.f(eVar);
                            eVar.V((Bundle) pair.second, str2, "_cmp");
                        }
                        C2523i1.e(l10);
                        l10.f41881x.b(null);
                    }
                    C2523i1.e(l10);
                    l10.f41882y.b(0L);
                    break;
                }
                break;
        }
    }
}
