package T4;

import S4.C0760b;
import U4.C0795c;
import U4.C0804l;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C0873a;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: T4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0780m implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f5975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K f5976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K f5977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f5978g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.common.api.a.e f5980i;
    public Bundle j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ReentrantLock f5984n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f5979h = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0760b f5981k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0760b f5982l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5983m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5985o = 0;

    public C0780m(Context context, G g10, ReentrantLock reentrantLock, Looper looper, com.google.android.gms.common.a aVar, C0873a c0873a, C0873a c0873a2, C0795c c0795c, p156m5.b bVar, com.google.android.gms.common.api.a.e eVar, ArrayList arrayList, ArrayList arrayList2, C0873a c0873a3, C0873a c0873a4) {
        this.f5974c = context;
        this.f5975d = g10;
        this.f5984n = reentrantLock;
        this.f5980i = eVar;
        this.f5976e = new K(context, g10, reentrantLock, looper, aVar, c0873a2, null, c0873a4, null, arrayList2, new N6.d(this));
        this.f5977f = new K(context, g10, reentrantLock, looper, aVar, c0873a, c0795c, c0873a3, bVar, arrayList, new v0(this));
        C0873a c0873a5 = new C0873a();
        Iterator it = ((C0873a.c) c0873a2.keySet()).iterator();
        while (it.hasNext()) {
            c0873a5.put((com.google.android.gms.common.api.a.b) it.next(), this.f5976e);
        }
        Iterator it2 = ((C0873a.c) c0873a.keySet()).iterator();
        while (it2.hasNext()) {
            c0873a5.put((com.google.android.gms.common.api.a.b) it2.next(), this.f5977f);
        }
        this.f5978g = Collections.unmodifiableMap(c0873a5);
    }

    public static /* bridge */ /* synthetic */ void g(C0780m c0780m, int i10) {
        c0780m.f5975d.d(i10);
        c0780m.f5982l = null;
        c0780m.f5981k = null;
    }

    public static void h(C0780m c0780m) {
        C0760b c0760b;
        C0760b c0760b2;
        C0760b c0760b3;
        C0760b c0760b4 = c0780m.f5981k;
        boolean z10 = c0760b4 != null && c0760b4.k();
        K k10 = c0780m.f5976e;
        if (!z10) {
            C0760b c0760b5 = c0780m.f5981k;
            K k11 = c0780m.f5977f;
            if (c0760b5 != null && (c0760b2 = c0780m.f5982l) != null && c0760b2.k()) {
                k11.g();
                C0760b c0760b6 = c0780m.f5981k;
                C0804l.h(c0760b6);
                c0780m.e(c0760b6);
                return;
            }
            C0760b c0760b7 = c0780m.f5981k;
            if (c0760b7 == null || (c0760b = c0780m.f5982l) == null) {
                return;
            }
            if (k11.f5877n < k10.f5877n) {
                c0760b7 = c0760b;
            }
            c0780m.e(c0760b7);
            return;
        }
        C0760b c0760b8 = c0780m.f5982l;
        if (!(c0760b8 != null && c0760b8.k()) && ((c0760b3 = c0780m.f5982l) == null || c0760b3.f5527c != 4)) {
            if (c0760b3 != null) {
                if (c0780m.f5985o == 1) {
                    c0780m.f();
                    return;
                } else {
                    c0780m.e(c0760b3);
                    k10.g();
                    return;
                }
            }
            return;
        }
        int i10 = c0780m.f5985o;
        if (i10 == 1) {
            c0780m.f();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            G g10 = c0780m.f5975d;
            C0804l.h(g10);
            g10.f(c0780m.j);
            c0780m.f();
        }
        c0780m.f5985o = 0;
    }

    @Override // T4.b0
    public final void a() {
        this.f5985o = 2;
        this.f5983m = false;
        this.f5982l = null;
        this.f5981k = null;
        this.f5976e.a();
        this.f5977f.a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    @Override // T4.b0
    public final boolean b() {
        this.f5984n.lock();
        try {
            boolean z10 = false;
            if (this.f5976e.f5876m instanceof r) {
                if (this.f5977f.f5876m instanceof r) {
                    z10 = true;
                } else {
                    C0760b c0760b = this.f5982l;
                    if ((c0760b != null && c0760b.f5527c == 4) || this.f5985o == 1) {
                        z10 = true;
                    }
                }
            }
            return z10;
        } finally {
            this.f5984n.unlock();
        }
    }

    @Override // T4.b0
    public final com.google.android.gms.common.api.internal.a c(com.google.android.gms.common.api.internal.a aVar) {
        PendingIntent activity;
        K k10 = (K) this.f5978g.get(null);
        C0804l.i(k10, "GoogleApiClient is not configured to use the API required for this call.");
        if (!k10.equals(this.f5977f)) {
            K k11 = this.f5976e;
            k11.getClass();
            aVar.f();
            return k11.f5876m.h(aVar);
        }
        C0760b c0760b = this.f5982l;
        if (c0760b == null || c0760b.f5527c != 4) {
            K k12 = this.f5977f;
            k12.getClass();
            aVar.f();
            return k12.f5876m.h(aVar);
        }
        com.google.android.gms.common.api.a.e eVar = this.f5980i;
        if (eVar == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.f5974c, System.identityHashCode(this.f5975d), eVar.r(), e5.g.f34741a | 134217728);
        }
        aVar.i(new Status(4, null, activity, null));
        return aVar;
    }

    @Override // T4.b0
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f5977f.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f5976e.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void e(C0760b c0760b) {
        int i10 = this.f5985o;
        if (i10 == 1) {
            f();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f5975d.g(c0760b);
            f();
        }
        this.f5985o = 0;
    }

    public final void f() {
        Set set = this.f5979h;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC0778k) it.next()).a();
        }
        set.clear();
    }
}
