package com.google.android.play.integrity.internal;

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

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f27734n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f27736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f27738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f27739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f27740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O.h f27742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f27743i;
    public final x j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f27744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f27745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f27746m;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.play.integrity.internal.x] */
    public d(Context context, v vVar, O.h hVar) {
        Intent intent = p019b6.p.f20596a;
        this.f27738d = new ArrayList();
        this.f27739e = new HashSet();
        this.f27740f = new Object();
        this.j = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.x
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                d dVar = this.f27762a;
                v vVar2 = dVar.f27736b;
                vVar2.b("reportBinderDeath", new Object[0]);
                B b10 = (B) dVar.f27743i.get();
                if (b10 != null) {
                    vVar2.b("calling onBinderDied", new Object[0]);
                    b10.a();
                } else {
                    vVar2.b("%s : Binder has died.", dVar.f27737c);
                    ArrayList arrayList = dVar.f27738d;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((w) it.next()).a(new RemoteException(String.valueOf(dVar.f27737c).concat(" : Binder has died.")));
                    }
                    arrayList.clear();
                }
                synchronized (dVar.f27740f) {
                    HashSet hashSet = dVar.f27739e;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((p191p5.h) it2.next()).c(new RemoteException(String.valueOf(dVar.f27737c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                }
            }
        };
        this.f27744k = new AtomicInteger(0);
        this.f27735a = context;
        this.f27736b = vVar;
        this.f27737c = "ExpressIntegrityService";
        this.f27742h = hVar;
        this.f27743i = new WeakReference(null);
    }

    public static /* bridge */ /* synthetic */ void b(d dVar, p019b6.n nVar) {
        s sVar = dVar.f27746m;
        ArrayList arrayList = dVar.f27738d;
        v vVar = dVar.f27736b;
        if (sVar != null || dVar.f27741g) {
            if (!dVar.f27741g) {
                nVar.run();
                return;
            } else {
                vVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(nVar);
                return;
            }
        }
        vVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(nVar);
        c cVar = new c(dVar);
        dVar.f27745l = cVar;
        dVar.f27741g = true;
        if (dVar.f27735a.bindService(p019b6.p.f20596a, cVar, 1)) {
            return;
        }
        vVar.b("Failed to bind to the service.", new Object[0]);
        dVar.f27741g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f27734n;
        synchronized (map) {
            try {
                String str = this.f27737c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(p191p5.h hVar) {
        synchronized (this.f27740f) {
            this.f27739e.remove(hVar);
        }
        a().post(new A(this));
    }
}
