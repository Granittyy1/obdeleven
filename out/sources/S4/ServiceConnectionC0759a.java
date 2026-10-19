package S4;

import U4.C0804l;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: S4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC0759a implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5523b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f5524c = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0804l.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f5523b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f5523b = true;
        IBinder iBinder = (IBinder) this.f5524c.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5524c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
