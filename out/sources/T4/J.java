package T4;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends e5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f5866a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k10, Looper looper) {
        super(looper);
        this.f5866a = k10;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            return;
        }
        I i11 = (I) message.obj;
        K k10 = this.f5866a;
        i11.getClass();
        k10.f5867c.lock();
        try {
            if (k10.f5876m == i11.f5865a) {
                i11.a();
            }
        } finally {
            k10.f5867c.unlock();
        }
    }
}
