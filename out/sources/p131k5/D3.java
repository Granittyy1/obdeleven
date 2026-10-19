package p131k5;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2523i1 f41754a;

    public D3(C2523i1 c2523i1) {
        this.f41754a = c2523i1;
    }

    public final void a(Bundle bundle, String str) {
        String string;
        C2523i1 c2523i1 = this.f41754a;
        C2493c1 c2493c1 = c2523i1.j;
        C2523i1.g(c2493c1);
        c2493c1.p();
        if (c2523i1.h()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        L0 l10 = c2523i1.f42219h;
        C2523i1.e(l10);
        l10.f41881x.b(string);
        C2523i1.e(l10);
        c2523i1.f42224n.getClass();
        l10.f41882y.b(System.currentTimeMillis());
    }

    public final boolean b() {
        L0 l10 = this.f41754a.f42219h;
        C2523i1.e(l10);
        return l10.f41882y.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        C2523i1 c2523i1 = this.f41754a;
        c2523i1.f42224n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        L0 l10 = c2523i1.f42219h;
        C2523i1.e(l10);
        return jCurrentTimeMillis - l10.f41882y.a() > c2523i1.f42218g.v(null, B.f41645U);
    }
}
