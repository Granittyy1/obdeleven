package T4;

import S4.C0760b;
import U4.InterfaceC0800h;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0760b f5902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f5903c;

    public V(W w3, C0760b c0760b) {
        this.f5903c = w3;
        this.f5902b = c0760b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0800h interfaceC0800h;
        W w3 = this.f5903c;
        T t8 = (T) w3.f5909f.f5938k.get(w3.f5905b);
        if (t8 == null) {
            return;
        }
        C0760b c0760b = this.f5902b;
        if (!c0760b.k()) {
            t8.o(c0760b, null);
            return;
        }
        w3.f5908e = true;
        com.google.android.gms.common.api.a.e eVar = w3.f5904a;
        if (eVar.s()) {
            if (!w3.f5908e || (interfaceC0800h = w3.f5906c) == null) {
                return;
            }
            eVar.k(interfaceC0800h, w3.f5907d);
            return;
        }
        try {
            eVar.k(null, eVar.c());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            eVar.d("Failed to get service from broker.");
            t8.o(new C0760b(10, null, null), null);
        }
    }
}
