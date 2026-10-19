package p118j5;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1912u0;
import com.google.android.gms.internal.measurement.N0;
import p131k5.H1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1912u0 f41134a;

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
    public interface InterfaceC0469a extends H1 {
    }

    public a(C1912u0 c1912u0) {
        this.f41134a = c1912u0;
    }

    public final void a(InterfaceC0469a interfaceC0469a) {
        C1912u0 c1912u0 = this.f41134a;
        c1912u0.getClass();
        synchronized (c1912u0.f25858e) {
            for (int i10 = 0; i10 < c1912u0.f25858e.size(); i10++) {
                try {
                    if (interfaceC0469a.equals(((Pair) c1912u0.f25858e.get(i10)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1912u0.c cVar = new C1912u0.c(interfaceC0469a);
            c1912u0.f25858e.add(new Pair(interfaceC0469a, cVar));
            if (c1912u0.f25861h != null) {
                try {
                    c1912u0.f25861h.registerOnMeasurementEventListener(cVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            c1912u0.e(new N0(c1912u0, cVar));
        }
    }
}
