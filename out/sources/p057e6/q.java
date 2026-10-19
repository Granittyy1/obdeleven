package p057e6;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f34757n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f34759b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f34765h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f34768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f34769m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f34761d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f34762e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34763f = new Object();
    public final j j = new IBinder.DeathRecipient() { // from class: e6.j
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            q qVar = this.f34749a;
            qVar.f34759b.a("reportBinderDeath", new Object[0]);
            m mVar = (m) qVar.f34766i.get();
            g gVar = qVar.f34759b;
            if (mVar != null) {
                gVar.a("calling onBinderDied", new Object[0]);
                mVar.a();
            } else {
                String str = qVar.f34760c;
                gVar.a("%s : Binder has died.", str);
                ArrayList<h> arrayList = qVar.f34761d;
                for (h hVar : arrayList) {
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    h hVar2 = hVar.f34746b;
                    if (hVar2 != null) {
                        hVar2.c(remoteException);
                    }
                }
                arrayList.clear();
            }
            qVar.b();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f34767k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34760c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f34766i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [e6.j] */
    public q(Context context, g gVar, Intent intent) {
        this.f34758a = context;
        this.f34759b = gVar;
        this.f34765h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f34757n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f34760c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f34760c, 10);
                    handlerThread.start();
                    map.put(this.f34760c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f34760c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f34763f) {
            try {
                Iterator it = this.f34762e.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).c(new RemoteException(String.valueOf(this.f34760c).concat(" : Binder has died.")));
                }
                this.f34762e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
