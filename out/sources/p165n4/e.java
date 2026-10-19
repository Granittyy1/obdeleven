package p165n4;

import Y1.d;
import Z3.C0835a;
import Z3.q;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.ui.graphics.colorspace.n;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.braze.Constants;
import com.facebook.FacebookException;
import com.facebook.login.LoginTargetApp;
import java.util.Arrays;
import java.util.Date;
import kotlin.collections.k;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FacebookDialogFragment.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Dialog f44879r;

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        i.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f44879r instanceof v) && isResumed()) {
            Dialog dialog = this.f44879r;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((v) dialog).d();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC1347l activity;
        v hVar;
        super.onCreate(bundle);
        if (this.f44879r == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            m mVar = m.f44914a;
            i.d(intent, "intent");
            int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            Bundle extras = (!k.M(Integer.valueOf(intExtra), m.f44918e) || intExtra < 20140701) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
            String string = null;
            if (extras != null ? extras.getBoolean("is_fallback", false) : false) {
                string = extras != null ? extras.getString(Constants.BRAZE_WEBVIEW_URL_EXTRA) : null;
                if (s.y(string)) {
                    q qVar = q.f7852a;
                    activity.finish();
                    return;
                }
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{q.b()}, 1));
                int i10 = h.f44887p;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                v.b(activity);
                t.e();
                int i11 = v.f44936n;
                if (i11 == 0) {
                    t.e();
                    i11 = v.f44936n;
                }
                hVar = new h(activity, i11);
                hVar.f44937b = string;
                hVar.f44938c = str;
                hVar.f44939d = new n(this);
            } else {
                String string2 = extras == null ? null : extras.getString("action");
                Bundle bundle2 = extras == null ? null : extras.getBundle("params");
                if (s.y(string2)) {
                    q qVar2 = q.f7852a;
                    activity.finish();
                    return;
                }
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                Date date = C0835a.f7782m;
                C0835a c0835aB = C0835a.b.b();
                if (!C0835a.b.c()) {
                    int i12 = t.f44935a;
                    string = q.b();
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                d dVar = new d(9, this);
                if (c0835aB != null) {
                    bundle2.putString("app_id", c0835aB.f7792i);
                    bundle2.putString("access_token", c0835aB.f7789f);
                } else {
                    bundle2.putString("app_id", string);
                }
                v.b(activity);
                hVar = new v(activity, string2, bundle2, LoginTargetApp.FACEBOOK, dVar);
            }
            this.f44879r = hVar;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = this.f17606m;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f44879r;
        if (dialog instanceof v) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((v) dialog).d();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialog = this.f44879r;
        if (dialog == null) {
            w(null, null);
            this.f17603i = false;
            return super.r(bundle);
        }
        if (dialog != null) {
            return dialog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }

    public final void w(Bundle bundle, FacebookException facebookException) {
        ActivityC1347l activity = getActivity();
        if (activity == null) {
            return;
        }
        m mVar = m.f44914a;
        Intent intent = activity.getIntent();
        i.d(intent, "fragmentActivity.intent");
        activity.setResult(facebookException == null ? -1 : 0, m.d(intent, bundle, facebookException));
        activity.finish();
    }
}
