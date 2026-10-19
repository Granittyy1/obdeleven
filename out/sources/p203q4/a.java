package p203q4;

import Z3.q;
import android.app.ActivityManager;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object systemService = q.a().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            b.a((ActivityManager) systemService);
        } catch (Exception unused) {
        }
    }
}
