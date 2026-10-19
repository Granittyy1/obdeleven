package R4;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5307b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Messenger f5308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f5309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f5310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f5311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A f5312g;

    public v(A a10) {
        this.f5312g = a10;
        p069f5.b bVar = new p069f5.b(Looper.getMainLooper(), new Handler.Callback() { // from class: R4.t
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i10 = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                v vVar = this.f5304b;
                synchronized (vVar) {
                    try {
                        y yVar = (y) vVar.f5311f.get(i10);
                        if (yVar == null) {
                            return true;
                        }
                        vVar.f5311f.remove(i10);
                        vVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            yVar.c(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        yVar.a(data);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f5308c = new Messenger(bVar);
        this.f5310e = new ArrayDeque();
        this.f5311f = new SparseArray();
    }

    public final synchronized void a(int i10, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i10 = this.f5307b;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f5307b = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f5307b = 4;
            X4.b.b().c(this.f5312g.f5254a, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f5310e.iterator();
            while (it.hasNext()) {
                ((y) it.next()).c(zztVar);
            }
            this.f5310e.clear();
            for (int i11 = 0; i11 < this.f5311f.size(); i11++) {
                ((y) this.f5311f.valueAt(i11)).c(zztVar);
            }
            this.f5311f.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.f5307b == 2 && this.f5310e.isEmpty() && this.f5311f.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f5307b = 3;
            X4.b.b().c(this.f5312g.f5254a, this);
        }
    }

    public final synchronized boolean d(y yVar) {
        int i10 = this.f5307b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f5310e.add(yVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f5310e.add(yVar);
            this.f5312g.f5255b.execute(new q(this));
            return true;
        }
        this.f5310e.add(yVar);
        if (this.f5307b != 0) {
            throw new IllegalStateException();
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.f5307b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (X4.b.b().a(this.f5312g.f5254a, intent, this, 1)) {
                this.f5312g.f5255b.schedule(new r(this), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b("Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f5312g.f5255b.execute(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f5312g.f5255b.execute(new s(0, this));
    }
}
