package p057e6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f34756b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q qVar = this.f34756b;
        qVar.f34759b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        qVar.a().post(new n(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        q qVar = this.f34756b;
        qVar.f34759b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        qVar.a().post(new o(this));
    }
}
