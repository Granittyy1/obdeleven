package p252u6;

import android.util.Log;
import p191p5.InterfaceC2755a;
import p191p5.g;

/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC2755a<Void, Object> {
    @Override // p191p5.InterfaceC2755a
    public final Object i(g<Void> gVar) throws Exception {
        if (gVar.o()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", gVar.j());
        return null;
    }
}
