package p005a4;

import Z3.I;
import Z3.q;
import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2693i;
import p093h4.e;

/* JADX INFO: compiled from: InternalAppEventsLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8043a;

    public void a(Bundle bundle, String str) {
        q qVar = q.f7852a;
        if (I.a()) {
            n nVar = (n) this.f8043a;
            nVar.getClass();
            nVar.a(str, null, bundle, true, e.b());
        }
    }

    public void b(a aVar, List purchasesList) {
        i.e(aVar, "<anonymous parameter 0>");
        i.e(purchasesList, "purchasesList");
        ((C2693i) this.f8043a).resumeWith(purchasesList);
    }

    public t(Context context) {
        this.f8043a = new n(context, (String) null);
    }

    public t() {
        this.f8043a = new AtomicReference(null);
    }

    public t(Context context, String str) {
        this.f8043a = new n(context, str);
    }
}
