package Z3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.FlushReason;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0835a c0835aA;
        y yVar;
        C0835a c0835aB;
        String string;
        int i10 = 1;
        C0841g c0841gA = C0841g.f7810f.a();
        SharedPreferences sharedPreferences = c0841gA.f7813b.f7795a;
        if (!sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") || (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) == null) {
            c0835aA = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Date date = C0835a.f7782m;
                c0835aA = C0835a.b.a(jSONObject);
            } catch (JSONException unused) {
                c0835aA = null;
            }
        }
        if (c0835aA != null) {
            c0841gA.c(c0835aA, false);
        }
        A.a aVar = A.f7741d;
        A a10 = aVar.a();
        String string2 = ((SharedPreferences) a10.f7744b.f7914a).getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string2 != null) {
            try {
                yVar = new y(new JSONObject(string2));
            } catch (JSONException unused2) {
                yVar = null;
            }
        } else {
            yVar = null;
        }
        if (yVar != null) {
            a10.a(yVar, false);
        }
        Date date2 = C0835a.f7782m;
        if (C0835a.b.c() && aVar.a().f7745c == null && (c0835aB = C0835a.b.b()) != null) {
            if (C0835a.b.c()) {
                p165n4.s.o(c0835aB.f7789f, new O.e());
            } else {
                aVar.a().a(null, true);
            }
        }
        Context contextA = q.a();
        String str = q.f7855d;
        if (I.a()) {
            p005a4.n nVar = new p005a4.n(contextA, str);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = p005a4.n.f8034c;
            if (scheduledThreadPoolExecutor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scheduledThreadPoolExecutor.execute(new O2.g(contextA, i10, nVar));
        }
        try {
            Context contextA2 = q.a();
            ApplicationInfo applicationInfo = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128);
            kotlin.jvm.internal.i.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                p005a4.n nVar2 = new p005a4.n(contextA2, (String) null);
                Bundle bundle2 = new Bundle();
                if (!p165n4.s.u()) {
                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                if (I.a()) {
                    nVar2.a("fb_auto_applink", null, bundle2, false, p093h4.e.b());
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
        }
        Context applicationContext = q.a().getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "getApplicationContext().applicationContext");
        p165n4.s.l(applicationContext);
        p165n4.t.e();
        Date date3 = C0835a.f7782m;
        C0835a c0835aB2 = C0835a.b.b();
        if (c0835aB2 == null || new Date().after(c0835aB2.f7785b)) {
            q.a();
            new AccessTokenAppIdPair(null, q.b());
        } else {
            new AccessTokenAppIdPair(c0835aB2.f7789f, q.b());
        }
        a4.n.a.b();
        String str2 = p005a4.j.f8027a;
        p005a4.j.f8030d.execute(new X8.a(i10, FlushReason.f24780b));
        return null;
    }
}
