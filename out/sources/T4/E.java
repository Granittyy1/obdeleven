package T4;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends e5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f5843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g10, Looper looper) {
        super(looper);
        this.f5843a = g10;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        G g10 = this.f5843a;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            G.b(g10);
        } else {
            ReentrantLock reentrantLock = g10.f5845c;
            reentrantLock.lock();
            try {
                if (g10.c()) {
                    g10.h();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
