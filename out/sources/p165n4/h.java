package p165n4;

import X5.C;
import Z3.q;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookWebFallbackDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends v {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f44887p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44888o;

    public static void g(h this$0) {
        i.e(this$0, "this$0");
        super.cancel();
    }

    @Override // p165n4.v
    public final Bundle c(String str) {
        Bundle bundleC = s.C(Uri.parse(str).getQuery());
        String string = bundleC.getString("bridge_args");
        bundleC.remove("bridge_args");
        if (!s.y(string)) {
            try {
                bundleC.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject(string)));
            } catch (JSONException unused) {
                q qVar = q.f7852a;
            }
        }
        String string2 = bundleC.getString("method_results");
        bundleC.remove("method_results");
        if (!s.y(string2)) {
            try {
                bundleC.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                q qVar2 = q.f7852a;
            }
        }
        bundleC.remove("version");
        bundleC.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", m.f44918e[0].intValue());
        return bundleC;
    }

    @Override // p165n4.v, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        v.e eVar = this.f44940e;
        if (!this.f44946l || this.j || eVar == null || !eVar.isShown()) {
            super.cancel();
        } else {
            if (this.f44888o) {
                return;
            }
            this.f44888o = true;
            eVar.loadUrl(i.k("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", InAppMessageWebViewClient.JAVASCRIPT_PREFIX));
            new Handler(Looper.getMainLooper()).postDelayed(new C(5, this), 1500L);
        }
    }
}
