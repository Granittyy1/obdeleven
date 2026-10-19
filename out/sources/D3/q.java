package D3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2783b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((o) message.obj).a();
            return true;
        }
    }

    public final synchronized void a(o<?> oVar, boolean z10) {
        try {
            if (this.f2782a || z10) {
                this.f2783b.obtainMessage(1, oVar).sendToTarget();
            } else {
                this.f2782a = true;
                oVar.a();
                this.f2782a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
