package T4;

import S4.C0760b;
import S4.C0764f;
import U4.C0795c;
import U4.C0804l;
import U4.C0816y;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C0873a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends com.google.android.gms.common.api.d implements Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f5845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0816y f5846d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f5849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f5850h;
    public volatile boolean j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E f5854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GoogleApiAvailability f5855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Y f5856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0873a f5857p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0795c f5859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0873a f5860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p156m5.b f5861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f5862u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f5863v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f5864w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f5847e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedList f5851i = new LinkedList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f5852k = 120000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5853l = 5000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Set f5858q = new HashSet();

    public G(Context context, ReentrantLock reentrantLock, Looper looper, C0795c c0795c, GoogleApiAvailability googleApiAvailability, p156m5.b bVar, C0873a c0873a, ArrayList arrayList, ArrayList arrayList2, C0873a c0873a2, int i10, int i11, ArrayList arrayList3) {
        new F6.a(1);
        this.f5863v = null;
        D d10 = new D();
        d10.f5842a = this;
        this.f5849g = context;
        this.f5845c = reentrantLock;
        this.f5846d = new C0816y(looper, d10);
        this.f5850h = looper;
        this.f5854m = new E(this, looper);
        this.f5855n = googleApiAvailability;
        this.f5848f = i10;
        if (i10 >= 0) {
            this.f5863v = Integer.valueOf(i11);
        }
        this.f5860s = c0873a;
        this.f5857p = c0873a2;
        this.f5862u = arrayList3;
        this.f5864w = new j0();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.d.a aVar = (com.google.android.gms.common.api.d.a) it.next();
            C0816y c0816y = this.f5846d;
            c0816y.getClass();
            C0804l.h(aVar);
            synchronized (c0816y.j) {
                try {
                    if (c0816y.f6495c.contains(aVar)) {
                        String.valueOf(aVar);
                    } else {
                        c0816y.f6495c.add(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c0816y.f6494b.a()) {
                e5.h hVar = c0816y.f6501i;
                hVar.sendMessage(hVar.obtainMessage(1, aVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            com.google.android.gms.common.api.d.b bVar2 = (com.google.android.gms.common.api.d.b) it2.next();
            C0816y c0816y2 = this.f5846d;
            c0816y2.getClass();
            C0804l.h(bVar2);
            synchronized (c0816y2.j) {
                try {
                    if (c0816y2.f6497e.contains(bVar2)) {
                        String.valueOf(bVar2);
                    } else {
                        c0816y2.f6497e.add(bVar2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f5859r = c0795c;
        this.f5861t = bVar;
    }

    public static int a(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean zS = false;
        while (it.hasNext()) {
            zS |= ((com.google.android.gms.common.api.a.e) it.next()).s();
        }
        return zS ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void b(G g10) {
        g10.f5845c.lock();
        try {
            if (g10.j) {
                g10.h();
            }
        } finally {
            g10.f5845c.unlock();
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean c() {
        if (!this.j) {
            return false;
        }
        this.j = false;
        this.f5854m.removeMessages(2);
        this.f5854m.removeMessages(1);
        Y y10 = this.f5856o;
        if (y10 != null) {
            y10.a();
            this.f5856o = null;
        }
        return true;
    }

    @Override // T4.Z
    public final void d(int i10) {
        if (i10 == 1) {
            if (!this.j) {
                this.j = true;
                if (this.f5856o == null) {
                    try {
                        GoogleApiAvailability googleApiAvailability = this.f5855n;
                        Context applicationContext = this.f5849g.getApplicationContext();
                        F f10 = new F(this);
                        googleApiAvailability.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        Y y10 = new Y(f10);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 33) {
                            applicationContext.registerReceiver(y10, intentFilter, i11 >= 33 ? 2 : 0);
                        } else {
                            applicationContext.registerReceiver(y10, intentFilter);
                        }
                        y10.f5910a = applicationContext;
                        if (!C0764f.b(applicationContext)) {
                            f10.h0();
                            y10.a();
                            y10 = null;
                        }
                        this.f5856o = y10;
                    } catch (SecurityException unused) {
                    }
                }
                E e10 = this.f5854m;
                e10.sendMessageDelayed(e10.obtainMessage(1), this.f5852k);
                E e11 = this.f5854m;
                e11.sendMessageDelayed(e11.obtainMessage(2), this.f5853l);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5864w.f5961a.toArray(new BasePendingResult[0])) {
            basePendingResult.b(j0.f5960c);
        }
        C0816y c0816y = this.f5846d;
        if (Looper.myLooper() != c0816y.f6501i.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        c0816y.f6501i.removeMessages(1);
        synchronized (c0816y.j) {
            try {
                c0816y.f6500h = true;
                ArrayList<com.google.android.gms.common.api.d.a> arrayList = new ArrayList(c0816y.f6495c);
                int i12 = c0816y.f6499g.get();
                for (com.google.android.gms.common.api.d.a aVar : arrayList) {
                    if (!c0816y.f6498f || c0816y.f6499g.get() != i12) {
                        break;
                        break;
                    } else if (c0816y.f6495c.contains(aVar)) {
                        aVar.e(i10);
                    }
                }
                c0816y.f6496d.clear();
                c0816y.f6500h = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0816y c0816y2 = this.f5846d;
        c0816y2.f6498f = false;
        c0816y2.f6499g.incrementAndGet();
        if (i10 == 2) {
            h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        String str;
        Integer num = this.f5863v;
        if (num == null) {
            this.f5863v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            int iIntValue = this.f5863v.intValue();
            String str2 = "SIGN_IN_MODE_REQUIRED";
            if (iIntValue == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (iIntValue != 2) {
                str = iIntValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
            } else {
                str = "SIGN_IN_MODE_OPTIONAL";
            }
            StringBuilder sb2 = new StringBuilder("Cannot use sign-in mode: ");
            if (i10 != 1) {
                str2 = i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL";
            }
            sb2.append(str2);
            sb2.append(". Mode was already set to ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f5847e != null) {
            return;
        }
        C0873a c0873a = this.f5857p;
        Iterator it = ((C0873a.e) c0873a.values()).iterator();
        boolean zS = false;
        while (it.hasNext()) {
            zS |= ((com.google.android.gms.common.api.a.e) it.next()).s();
        }
        int iIntValue2 = this.f5863v.intValue();
        ReentrantLock reentrantLock = this.f5845c;
        ArrayList arrayList = this.f5862u;
        C0873a c0873a2 = this.f5860s;
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zS) {
                C0873a c0873a3 = new C0873a();
                C0873a c0873a4 = new C0873a();
                for (Map.Entry entry : (C0873a.C0118a) c0873a.entrySet()) {
                    com.google.android.gms.common.api.a.e eVar = (com.google.android.gms.common.api.a.e) entry.getValue();
                    eVar.getClass();
                    if (eVar.s()) {
                        c0873a3.put((com.google.android.gms.common.api.a.b) entry.getKey(), eVar);
                    } else {
                        c0873a4.put((com.google.android.gms.common.api.a.b) entry.getKey(), eVar);
                    }
                }
                C0804l.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c0873a3.isEmpty());
                C0873a c0873a5 = new C0873a();
                C0873a c0873a6 = new C0873a();
                for (com.google.android.gms.common.api.a aVar : (C0873a.c) c0873a2.keySet()) {
                    com.google.android.gms.common.api.a.f fVar = aVar.f25313b;
                    if (c0873a3.containsKey(fVar)) {
                        c0873a5.put(aVar, (Boolean) c0873a2.get(aVar));
                    } else {
                        if (!c0873a4.containsKey(fVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        c0873a6.put(aVar, (Boolean) c0873a2.get(aVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    u0 u0Var = (u0) arrayList.get(i11);
                    if (c0873a5.containsKey(u0Var.f6003c)) {
                        arrayList2.add(u0Var);
                    } else {
                        if (!c0873a6.containsKey(u0Var.f6003c)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(u0Var);
                    }
                }
                this.f5847e = new C0780m(this.f5849g, this, reentrantLock, this.f5850h, this.f5855n, c0873a3, c0873a4, this.f5859r, this.f5861t, null, arrayList2, arrayList3, c0873a5, c0873a6);
                return;
            }
        } else if (!zS) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f5847e = new K(this.f5849g, this, reentrantLock, this.f5850h, this.f5855n, c0873a, this.f5859r, c0873a2, this.f5861t, arrayList, this);
    }

    @Override // T4.Z
    public final void f(Bundle bundle) {
        while (!this.f5851i.isEmpty()) {
            com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) this.f5851i.remove();
            C0873a c0873a = this.f5857p;
            aVar.getClass();
            C0804l.a("GoogleApiClient is not configured to use the API required for this call.", c0873a.containsKey(null));
            this.f5845c.lock();
            try {
                b0 b0Var = this.f5847e;
                if (b0Var == null) {
                    throw new IllegalStateException("GoogleApiClient is not connected yet.");
                }
                if (this.j) {
                    this.f5851i.add(aVar);
                    while (!this.f5851i.isEmpty()) {
                        com.google.android.gms.common.api.internal.a aVar2 = (com.google.android.gms.common.api.internal.a) this.f5851i.remove();
                        j0 j0Var = this.f5864w;
                        j0Var.f5961a.add(aVar2);
                        aVar2.f25331d.set(j0Var.f5962b);
                        aVar2.i(Status.f25305g);
                    }
                } else {
                    b0Var.c(aVar);
                }
                this.f5845c.unlock();
            } catch (Throwable th) {
                this.f5845c.unlock();
                throw th;
            }
        }
        C0816y c0816y = this.f5846d;
        if (Looper.myLooper() != c0816y.f6501i.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (c0816y.j) {
            try {
                if (c0816y.f6500h) {
                    throw new IllegalStateException();
                }
                c0816y.f6501i.removeMessages(1);
                c0816y.f6500h = true;
                if (!c0816y.f6496d.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList<com.google.android.gms.common.api.d.a> arrayList = new ArrayList(c0816y.f6495c);
                int i10 = c0816y.f6499g.get();
                for (com.google.android.gms.common.api.d.a aVar3 : arrayList) {
                    if (!c0816y.f6498f || !c0816y.f6494b.a() || c0816y.f6499g.get() != i10) {
                        break;
                        break;
                        break;
                    } else if (!c0816y.f6496d.contains(aVar3)) {
                        aVar3.b0(bundle);
                    }
                }
                c0816y.f6496d.clear();
                c0816y.f6500h = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // T4.Z
    public final void g(C0760b c0760b) {
        GoogleApiAvailability googleApiAvailability = this.f5855n;
        Context context = this.f5849g;
        int i10 = c0760b.f5527c;
        googleApiAvailability.getClass();
        AtomicBoolean atomicBoolean = C0764f.f5539a;
        if (!(i10 == 18 ? true : i10 == 1 ? C0764f.b(context) : false)) {
            c();
        }
        if (this.j) {
            return;
        }
        C0816y c0816y = this.f5846d;
        if (Looper.myLooper() != c0816y.f6501i.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        c0816y.f6501i.removeMessages(1);
        synchronized (c0816y.j) {
            try {
                ArrayList<com.google.android.gms.common.api.d.b> arrayList = new ArrayList(c0816y.f6497e);
                int i11 = c0816y.f6499g.get();
                for (com.google.android.gms.common.api.d.b bVar : arrayList) {
                    if (c0816y.f6498f && c0816y.f6499g.get() == i11) {
                        if (c0816y.f6497e.contains(bVar)) {
                            bVar.g(c0760b);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0816y c0816y2 = this.f5846d;
        c0816y2.f6498f = false;
        c0816y2.f6499g.incrementAndGet();
    }

    public final void h() {
        this.f5846d.f6498f = true;
        b0 b0Var = this.f5847e;
        C0804l.h(b0Var);
        b0Var.a();
    }
}
