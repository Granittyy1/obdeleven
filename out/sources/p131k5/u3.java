package p131k5;

import A1.C0579n;
import U4.C0804l;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f42479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f42481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0579n f42482e;

    public u3(C0579n c0579n, String str, String str2, Bundle bundle) {
        this.f42479b = str;
        this.f42480c = str2;
        this.f42481d = bundle;
        this.f42482e = c0579n;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C0579n c0579n = this.f42482e;
        z3 z3VarX = ((h) c0579n.f539a).X();
        h hVar = (h) c0579n.f539a;
        hVar.x().getClass();
        C2588z c2588zF = z3VarX.F(this.f42480c, this.f42481d, "auto", System.currentTimeMillis(), false);
        C0804l.h(c2588zF);
        hVar.u(c2588zF, this.f42479b);
    }
}
