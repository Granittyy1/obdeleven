package T4;

import S4.C0760b;
import U4.C0795c;
import U4.C0804l;
import U4.InterfaceC0800h;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.C0873a;
import com.braze.support.BrazeLogger;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f5821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.a f5824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0760b f5825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5826f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5828h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p156m5.f f5830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0800h f5834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0795c f5837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0873a f5838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p156m5.b f5839t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5827g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f5829i = new Bundle();
    public final HashSet j = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f5840u = new ArrayList();

    public C(K k10, C0795c c0795c, C0873a c0873a, com.google.android.gms.common.a aVar, p156m5.b bVar, ReentrantLock reentrantLock, Context context) {
        this.f5821a = k10;
        this.f5837r = c0795c;
        this.f5838s = c0873a;
        this.f5824d = aVar;
        this.f5839t = bVar;
        this.f5822b = reentrantLock;
        this.f5823c = context;
    }

    public final void a() {
        this.f5832m = false;
        K k10 = this.f5821a;
        k10.f5878o.f5858q = Collections.emptySet();
        for (com.google.android.gms.common.api.a.b bVar : this.j) {
            HashMap map = k10.f5873i;
            if (!map.containsKey(bVar)) {
                map.put(bVar, new C0760b(17, null, null));
            }
        }
    }

    @Override // T4.H
    public final void b(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f5829i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // T4.H
    public final void d(C0760b c0760b, com.google.android.gms.common.api.a aVar, boolean z10) {
        if (n(1)) {
            l(c0760b, aVar, z10);
            if (o()) {
                j();
            }
        }
    }

    @Override // T4.H
    public final void e(int i10) {
        k(new C0760b(8, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.common.api.a$e, m5.f] */
    @Override // T4.H
    public final void f() {
        C0873a c0873a;
        K k10 = this.f5821a;
        k10.f5873i.clear();
        this.f5832m = false;
        this.f5825e = null;
        this.f5827g = 0;
        this.f5831l = true;
        this.f5833n = false;
        this.f5835p = false;
        HashMap map = new HashMap();
        C0873a c0873a2 = this.f5838s;
        Iterator it = ((C0873a.c) c0873a2.keySet()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0873a = k10.f5872h;
            if (!zHasNext) {
                break;
            }
            com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) it.next();
            com.google.android.gms.common.api.a.e eVar = (com.google.android.gms.common.api.a.e) c0873a.get(aVar.f25313b);
            C0804l.h(eVar);
            com.google.android.gms.common.api.a.e eVar2 = eVar;
            aVar.f25312a.getClass();
            boolean zBooleanValue = ((Boolean) c0873a2.get(aVar)).booleanValue();
            if (eVar2.s()) {
                this.f5832m = true;
                if (zBooleanValue) {
                    this.j.add(aVar.f25313b);
                } else {
                    this.f5831l = false;
                }
            }
            map.put(eVar2, new C0786t(this, aVar, zBooleanValue));
        }
        if (this.f5832m) {
            C0795c c0795c = this.f5837r;
            C0804l.h(c0795c);
            C0804l.h(this.f5839t);
            G g10 = k10.f5878o;
            c0795c.f6431h = Integer.valueOf(System.identityHashCode(g10));
            A a10 = new A(this);
            this.f5830k = this.f5839t.a(this.f5823c, g10.f5850h, c0795c, c0795c.f6430g, a10, a10);
        }
        this.f5828h = c0873a.f9139d;
        this.f5840u.add(L.f5880a.submit(new C0789w(this, map)));
    }

    @Override // T4.H
    public final boolean g() {
        ArrayList arrayList = this.f5840u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        i(true);
        this.f5821a.f();
        return true;
    }

    @Override // T4.H
    public final com.google.android.gms.common.api.internal.a h(com.google.android.gms.common.api.internal.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void i(boolean z10) {
        p156m5.f fVar = this.f5830k;
        if (fVar != null) {
            if (fVar.b() && z10) {
                fVar.m();
            }
            fVar.a();
            C0804l.h(this.f5837r);
            this.f5834o = null;
        }
    }

    public final void j() {
        K k10 = this.f5821a;
        k10.f5867c.lock();
        try {
            k10.f5878o.c();
            k10.f5876m = new r(k10);
            k10.f5876m.f();
            k10.f5868d.signalAll();
            k10.f5867c.unlock();
            L.f5880a.execute(new RunnableC0785s(this));
            p156m5.f fVar = this.f5830k;
            if (fVar != null) {
                if (this.f5835p) {
                    InterfaceC0800h interfaceC0800h = this.f5834o;
                    C0804l.h(interfaceC0800h);
                    fVar.e(interfaceC0800h, this.f5836q);
                }
                i(false);
            }
            Iterator it = this.f5821a.f5873i.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.api.a.e eVar = (com.google.android.gms.common.api.a.e) this.f5821a.f5872h.get((com.google.android.gms.common.api.a.b) it.next());
                C0804l.h(eVar);
                eVar.a();
            }
            this.f5821a.f5879p.f(this.f5829i.isEmpty() ? null : this.f5829i);
        } catch (Throwable th) {
            k10.f5867c.unlock();
            throw th;
        }
    }

    public final void k(C0760b c0760b) {
        ArrayList arrayList = this.f5840u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        arrayList.clear();
        i(!c0760b.e());
        K k10 = this.f5821a;
        k10.f();
        k10.f5879p.g(c0760b);
    }

    public final void l(C0760b c0760b, com.google.android.gms.common.api.a aVar, boolean z10) {
        aVar.f25312a.getClass();
        if ((!z10 || c0760b.e() || this.f5824d.a(null, null, c0760b.f5527c) != null) && (this.f5825e == null || Integer.MAX_VALUE < this.f5826f)) {
            this.f5825e = c0760b;
            this.f5826f = BrazeLogger.SUPPRESS;
        }
        this.f5821a.f5873i.put(aVar.f25313b, c0760b);
    }

    public final void m() {
        if (this.f5828h != 0) {
            return;
        }
        if (!this.f5832m || this.f5833n) {
            ArrayList arrayList = new ArrayList();
            this.f5827g = 1;
            K k10 = this.f5821a;
            C0873a c0873a = k10.f5872h;
            this.f5828h = c0873a.f9139d;
            for (com.google.android.gms.common.api.a.b bVar : (C0873a.c) c0873a.keySet()) {
                if (!k10.f5873i.containsKey(bVar)) {
                    arrayList.add((com.google.android.gms.common.api.a.e) k10.f5872h.get(bVar));
                } else if (o()) {
                    j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f5840u.add(L.f5880a.submit(new C0790x(this, arrayList)));
        }
    }

    public final boolean n(int i10) {
        if (this.f5827g == i10) {
            return true;
        }
        G g10 = this.f5821a.f5878o;
        g10.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(g10.f5849g);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(g10.j);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(g10.f5851i.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(g10.f5864w.f5961a.size());
        b0 b0Var = g10.f5847e;
        if (b0Var != null) {
            b0Var.d("", null, printWriter, null);
        }
        stringWriter.toString();
        "Unexpected callback in ".concat(toString());
        StringBuilder sbA = C7.g.a("GoogleApiClient connecting is in step ", this.f5827g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        sbA.append(i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", sbA.toString(), new Exception());
        k(new C0760b(8, null, null));
        return false;
    }

    public final boolean o() {
        int i10 = this.f5828h - 1;
        this.f5828h = i10;
        if (i10 > 0) {
            return false;
        }
        K k10 = this.f5821a;
        if (i10 >= 0) {
            C0760b c0760b = this.f5825e;
            if (c0760b == null) {
                return true;
            }
            k10.f5877n = this.f5826f;
            k(c0760b);
            return false;
        }
        G g10 = k10.f5878o;
        g10.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(g10.f5849g);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(g10.j);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(g10.f5851i.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(g10.f5864w.f5961a.size());
        b0 b0Var = g10.f5847e;
        if (b0Var != null) {
            b0Var.d("", null, printWriter, null);
        }
        stringWriter.toString();
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        k(new C0760b(8, null, null));
        return false;
    }

    @Override // T4.H
    public final void c() {
    }
}
