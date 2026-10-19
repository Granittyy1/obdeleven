package coil.util;

import java.io.IOException;
import kotlinx.coroutines.C2693i;
import okhttp3.InterfaceC2754e;
import okhttp3.z;

/* JADX INFO: compiled from: Calls.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o implements okhttp3.f, Ia.l<Throwable, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2754e f23164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2693i f23165c;

    public o(InterfaceC2754e interfaceC2754e, C2693i c2693i) {
        this.f23164b = interfaceC2754e;
        this.f23165c = c2693i;
    }

    @Override // Ia.l
    public final p293xa.r invoke(Throwable th) {
        try {
            this.f23164b.cancel();
        } catch (Throwable unused) {
        }
        return p293xa.r.f47939a;
    }

    @Override // okhttp3.f
    public final void onFailure(InterfaceC2754e interfaceC2754e, IOException iOException) {
        if (interfaceC2754e.isCanceled()) {
            return;
        }
        this.f23165c.resumeWith(kotlin.b.a(iOException));
    }

    @Override // okhttp3.f
    public final void onResponse(InterfaceC2754e interfaceC2754e, z zVar) {
        this.f23165c.resumeWith(zVar);
    }
}
