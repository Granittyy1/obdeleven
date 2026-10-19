package p131k5;

import com.google.android.gms.internal.measurement.V5;
import com.google.android.gms.measurement.internal.d;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ d f42055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f42056c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        W0 w3 = new W0();
        w3.f42031b = this.f42055b;
        w3.f42032c = this.f42056c;
        return new V5(w3);
    }
}
