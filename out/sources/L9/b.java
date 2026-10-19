package L9;

import Z3.C0835a;
import Z3.q;
import Z3.r;
import Z3.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.media3.exoplayer.audio.c;
import com.facebook.LoggingBehavior;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p030c4.e;
import p030c4.f;
import p165n4.l;
import p165n4.s;
import p175o1.j;
import p175o1.k;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4475d;

    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        this.f4473b = i10;
        this.f4474c = obj;
        this.f4475d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = 1;
        Object obj = this.f4474c;
        Object obj2 = this.f4475d;
        switch (this.f4473b) {
            case 0:
                ((HelpCenterWebViewInterface) obj).lambda$handleAction$1((Map) obj2);
                return;
            case 1:
                String str2 = (String) obj;
                f this$0 = (f) obj2;
                i.e(this$0, "this$0");
                byte[] bytes = str2.getBytes(kotlin.text.a.f43120b);
                i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                String strS = s.s("MD5", bytes);
                Date date = C0835a.f7782m;
                C0835a c0835aB = C0835a.b.b();
                if (strS == null || !strS.equals(this$0.f22329d)) {
                    String strB = q.b();
                    String str3 = r.j;
                    r rVarI = r.c.i(c0835aB, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{strB}, 1)), null, null);
                    Bundle bundle = rVarI.f7876d;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString("tree", str2);
                    Context contextA = q.a();
                    try {
                        str = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
                        i.d(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
                    } catch (PackageManager.NameNotFoundException unused) {
                        str = "";
                    }
                    bundle.putString("app_version", str);
                    bundle.putString("platform", "android");
                    bundle.putString("request_type", "app_indexing");
                    if (p030c4.b.f22303d == null) {
                        p030c4.b.f22303d = UUID.randomUUID().toString();
                    }
                    String str4 = p030c4.b.f22303d;
                    if (str4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    bundle.putString("device_session_id", str4);
                    rVarI.f7876d = bundle;
                    rVarI.j(new e());
                    String str5 = f.f22325e;
                    x xVarC = rVarI.c();
                    try {
                        JSONObject jSONObject = xVarC.f7904b;
                        if (jSONObject == null) {
                            Log.e(str5, i.k(xVarC.f7905c, "Error sending UI component tree to Facebook: "));
                            return;
                        }
                        if ("true".equals(jSONObject.optString("success"))) {
                            l.a aVar = l.f44910c;
                            l.a.a(LoggingBehavior.f24776d, str5, "Successfully send UI component tree to server");
                            this$0.f22329d = strS;
                        }
                        if (jSONObject.has("is_app_indexing_enabled")) {
                            p030c4.b.f22305f.set(jSONObject.getBoolean("is_app_indexing_enabled"));
                            return;
                        }
                        return;
                    } catch (JSONException e10) {
                        Log.e(str5, "Error decoding server response.", e10);
                        return;
                    }
                    break;
                }
                return;
            default:
                k kVar = (k) obj2;
                j jVar = c.this.f18299T0;
                Handler handler = jVar.f45099a;
                if (handler != null) {
                    handler.post(new p090h1.c(jVar, i10, kVar));
                    return;
                }
                return;
        }
    }
}
