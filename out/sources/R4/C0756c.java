package R4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.X;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: R4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0756c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f5268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f5269i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f5272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5273d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f5275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f5276g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f5270a = new X();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f5274e = new Messenger(new i(this, Looper.getMainLooper()));

    public C0756c(Context context) {
        this.f5271b = context;
        this.f5272c = new B(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5273d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    public final p191p5.B a(Bundle bundle) {
        final String string;
        synchronized (C0756c.class) {
            int i10 = f5268h;
            f5268h = i10 + 1;
            string = Integer.toString(i10);
        }
        p191p5.h hVar = new p191p5.h();
        synchronized (this.f5270a) {
            this.f5270a.put(string, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f5272c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f5271b;
        synchronized (C0756c.class) {
            try {
                if (f5269i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f5269i = PendingIntent.getBroadcast(context, 0, intent2, p069f5.a.f34994a);
                }
                intent.putExtra("app", f5269i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f5274e);
        if (this.f5275f != null || this.f5276g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f5275f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f5276g.f5285b;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                if (this.f5272c.b() == 2) {
                    this.f5271b.sendBroadcast(intent);
                } else {
                    this.f5271b.startService(intent);
                }
            }
        } else if (this.f5272c.b() == 2) {
            this.f5271b.sendBroadcast(intent);
        } else {
            this.f5271b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f5273d.schedule(new g(0, hVar), 30L, TimeUnit.SECONDS);
        hVar.f45811a.b(D.f5262b, new p191p5.c() { // from class: R4.h
            @Override // p191p5.c
            public final void e(p191p5.g gVar) {
                C0756c c0756c = this.f5281b;
                String str = string;
                ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                synchronized (c0756c.f5270a) {
                    c0756c.f5270a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return hVar.f45811a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f5270a) {
            try {
                p191p5.h hVar = (p191p5.h) this.f5270a.remove(str);
                if (hVar == null) {
                    return;
                }
                hVar.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
