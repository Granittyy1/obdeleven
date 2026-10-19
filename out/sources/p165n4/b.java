package p165n4;

import Z3.I;
import Z3.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import p005a4.n;
import p065f1.a;
import p093h4.e;

/* JADX INFO: compiled from: BoltsMeasurementEventListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f44875b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44876a;

    public b(Context context) {
        Context applicationContext = context.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        this.f44876a = applicationContext;
    }

    public final void finalize() throws Throwable {
        a aVarA = a.a(this.f44876a);
        i.d(aVarA, "getInstance(applicationContext)");
        aVarA.d(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n nVar = new n(context, (String) null);
        String strK = i.k(intent == null ? null : intent.getStringExtra("event_name"), "bf_");
        Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
        if (setKeySet != null) {
            for (String key : setKeySet) {
                i.d(key, "key");
                bundle.putString(new Regex("[ -]*$").f("", new Regex("^[ -]*").f("", new Regex("[^0-9a-zA-Z _-]").f("-", key))), (String) bundleExtra.get(key));
            }
        }
        q qVar = q.f7852a;
        if (I.a()) {
            nVar.a(strK, null, bundle, false, e.b());
        }
    }
}
