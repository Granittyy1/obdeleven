package p114j1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class t implements c {
    @Override // p114j1.c
    public final u a(Looper looper, Handler.Callback callback) {
        return new u(new Handler(looper, callback));
    }

    @Override // p114j1.c
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
