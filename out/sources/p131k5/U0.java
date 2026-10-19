package p131k5;

import com.google.android.gms.internal.measurement.G3;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.measurement.internal.d;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ d f42005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f42006c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C2488b1 c2488b1 = new C2488b1(this.f42005b, this.f42006c);
        G3 g10 = new G3("internal.remoteConfig");
        g10.f25796c.put("getValue", new J4(c2488b1));
        return g10;
    }
}
