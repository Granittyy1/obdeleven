package U4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: U4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0816y implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T4.D f6494b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e5.h f6501i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6495c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6496d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6497e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f6498f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f6499g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6500h = false;
    public final Object j = new Object();

    public C0816y(Looper looper, T4.D d10) {
        this.f6494b = d10;
        this.f6501i = new e5.h(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", J4.i.b(i10, "Don't know how to handle message: "), new Exception());
            return false;
        }
        com.google.android.gms.common.api.d.a aVar = (com.google.android.gms.common.api.d.a) message.obj;
        synchronized (this.j) {
            try {
                if (this.f6498f && this.f6494b.a() && this.f6495c.contains(aVar)) {
                    aVar.b0(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
