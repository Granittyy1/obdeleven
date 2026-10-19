package R4;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p191p5.h f5316b = new p191p5.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f5318d;

    public y(int i10, int i11, Bundle bundle) {
        this.f5315a = i10;
        this.f5317c = i11;
        this.f5318d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.f5316b.a(zztVar);
    }

    public final String toString() {
        return "Request { what=" + this.f5317c + " id=" + this.f5315a + " oneWay=" + b() + "}";
    }
}
