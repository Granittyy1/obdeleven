package T4;

import S4.C0760b;
import S4.C0762d;
import U4.AbstractC0794b;
import U4.C0795c;
import U4.C0803k;
import U4.C0804l;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import androidx.collection.C0873a;
import androidx.collection.C0874b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class T implements com.google.android.gms.common.api.d.a, com.google.android.gms.common.api.d.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.api.a.e f5889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0768a f5890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0781n f5891f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5894i;
    public final g0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5895k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0771d f5899o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f5888c = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f5892g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f5893h = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f5896l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0760b f5897m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5898n = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public T(C0771d c0771d, com.google.android.gms.common.api.c cVar) {
        this.f5899o = c0771d;
        Looper looper = c0771d.f5941n.getLooper();
        C0795c.a aVarA = cVar.a();
        Account account = aVarA.f6432a;
        C0874b c0874b = aVarA.f6433b;
        String str = aVarA.f6434c;
        String str2 = aVarA.f6435d;
        p156m5.a aVar = p156m5.a.f44596b;
        C0795c c0795c = new C0795c(account, c0874b, null, str, str2, aVar);
        com.google.android.gms.common.api.a.AbstractC0263a abstractC0263a = cVar.f25318c.f25312a;
        C0804l.h(abstractC0263a);
        com.google.android.gms.common.api.a.e eVarA = abstractC0263a.a(cVar.f25316a, looper, c0795c, cVar.f25319d, this, this);
        String str3 = cVar.f25317b;
        if (str3 != null && (eVarA instanceof AbstractC0794b)) {
            ((AbstractC0794b) eVarA).f6415y = str3;
        }
        if (str3 != null && (eVarA instanceof ServiceConnectionC0775h)) {
            ((ServiceConnectionC0775h) eVarA).getClass();
        }
        this.f5889d = eVarA;
        this.f5890e = cVar.f25320e;
        this.f5891f = new C0781n();
        this.f5894i = cVar.f25321f;
        if (!eVarA.s()) {
            this.j = null;
            return;
        }
        Context context = c0771d.f5934f;
        e5.h hVar = c0771d.f5941n;
        C0795c.a aVarA2 = cVar.a();
        this.j = new g0(context, hVar, new C0795c(aVarA2.f6432a, aVarA2.f6433b, null, aVarA2.f6434c, aVarA2.f6435d, aVar));
    }

    public final void a(C0760b c0760b) {
        HashSet hashSet = this.f5892g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        n0 n0Var = (n0) it.next();
        if (C0803k.a(c0760b, C0760b.f5525g)) {
            this.f5889d.h();
        }
        n0Var.getClass();
        throw null;
    }

    public final void b(Status status) {
        C0804l.c(this.f5899o.f5941n);
        c(status, null, false);
    }

    @Override // T4.InterfaceC0770c
    public final void b0(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        C0771d c0771d = this.f5899o;
        if (looperMyLooper == c0771d.f5941n.getLooper()) {
            f();
        } else {
            c0771d.f5941n.post(new O(this));
        }
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z10) {
        C0804l.c(this.f5899o.f5941n);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5888c.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (!z10 || m0Var.f5986a == 2) {
                if (status != null) {
                    m0Var.a(status);
                } else {
                    m0Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f5888c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0 m0Var = (m0) arrayList.get(i10);
            if (!this.f5889d.b()) {
                return;
            }
            if (j(m0Var)) {
                linkedList.remove(m0Var);
            }
        }
    }

    @Override // T4.InterfaceC0770c
    public final void e(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        C0771d c0771d = this.f5899o;
        if (looperMyLooper == c0771d.f5941n.getLooper()) {
            h(i10);
        } else {
            c0771d.f5941n.post(new P(this, i10));
        }
    }

    public final void f() {
        C0771d c0771d = this.f5899o;
        C0804l.c(c0771d.f5941n);
        this.f5897m = null;
        a(C0760b.f5525g);
        if (this.f5895k) {
            e5.h hVar = c0771d.f5941n;
            C0768a c0768a = this.f5890e;
            hVar.removeMessages(11, c0768a);
            c0771d.f5941n.removeMessages(9, c0768a);
            this.f5895k = false;
        }
        Iterator it = this.f5893h.values().iterator();
        if (it.hasNext()) {
            ((f0) it.next()).getClass();
            throw null;
        }
        d();
        i();
    }

    @Override // T4.InterfaceC0776i
    public final void g(C0760b c0760b) {
        o(c0760b, null);
    }

    public final void h(int i10) {
        C0771d c0771d = this.f5899o;
        C0804l.c(c0771d.f5941n);
        this.f5897m = null;
        this.f5895k = true;
        String strQ = this.f5889d.q();
        C0781n c0781n = this.f5891f;
        c0781n.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strQ != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strQ);
        }
        c0781n.a(true, new Status(20, sb2.toString(), null, null));
        e5.h hVar = c0771d.f5941n;
        C0768a c0768a = this.f5890e;
        hVar.sendMessageDelayed(Message.obtain(hVar, 9, c0768a), 5000L);
        e5.h hVar2 = c0771d.f5941n;
        hVar2.sendMessageDelayed(Message.obtain(hVar2, 11, c0768a), 120000L);
        c0771d.f5936h.f6502a.clear();
        Iterator it = this.f5893h.values().iterator();
        if (it.hasNext()) {
            ((f0) it.next()).getClass();
            throw null;
        }
    }

    public final void i() {
        C0771d c0771d = this.f5899o;
        e5.h hVar = c0771d.f5941n;
        C0768a c0768a = this.f5890e;
        hVar.removeMessages(12, c0768a);
        e5.h hVar2 = c0771d.f5941n;
        hVar2.sendMessageDelayed(hVar2.obtainMessage(12, c0768a), c0771d.f5930b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(m0 m0Var) {
        C0762d c0762d;
        if (!(m0Var instanceof a0)) {
            com.google.android.gms.common.api.a.e eVar = this.f5889d;
            m0Var.d(this.f5891f, eVar.s());
            try {
                m0Var.c(this);
            } catch (DeadObjectException unused) {
                e(1);
                eVar.d("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        a0 a0Var = (a0) m0Var;
        C0762d[] c0762dArrG = a0Var.g(this);
        if (c0762dArrG == null || c0762dArrG.length == 0) {
            c0762d = null;
            break;
        }
        C0762d[] c0762dArrP = this.f5889d.p();
        if (c0762dArrP == null) {
            c0762dArrP = new C0762d[0];
        }
        C0873a c0873a = new C0873a(c0762dArrP.length);
        for (C0762d c0762d2 : c0762dArrP) {
            c0873a.put(c0762d2.f5534b, Long.valueOf(c0762d2.e()));
        }
        int length = c0762dArrG.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                c0762d = null;
                break;
            }
            c0762d = c0762dArrG[i10];
            Long l10 = (Long) c0873a.get(c0762d.f5534b);
            if (l10 == null || l10.longValue() < c0762d.e()) {
                break;
            }
            i10++;
        }
        if (c0762d == null) {
            com.google.android.gms.common.api.a.e eVar2 = this.f5889d;
            m0Var.d(this.f5891f, eVar2.s());
            try {
                m0Var.c(this);
            } catch (DeadObjectException unused2) {
                e(1);
                eVar2.d("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        this.f5889d.getClass();
        if (!this.f5899o.f5942o || !a0Var.f(this)) {
            a0Var.b(new UnsupportedApiCallException(c0762d));
            return true;
        }
        U u10 = new U(this.f5890e, c0762d);
        int iIndexOf = this.f5896l.indexOf(u10);
        if (iIndexOf >= 0) {
            U u11 = (U) this.f5896l.get(iIndexOf);
            this.f5899o.f5941n.removeMessages(15, u11);
            e5.h hVar = this.f5899o.f5941n;
            hVar.sendMessageDelayed(Message.obtain(hVar, 15, u11), 5000L);
        } else {
            this.f5896l.add(u10);
            e5.h hVar2 = this.f5899o.f5941n;
            hVar2.sendMessageDelayed(Message.obtain(hVar2, 15, u10), 5000L);
            e5.h hVar3 = this.f5899o.f5941n;
            hVar3.sendMessageDelayed(Message.obtain(hVar3, 16, u10), 120000L);
            C0760b c0760b = new C0760b(2, null, null);
            if (!k(c0760b)) {
                this.f5899o.b(c0760b, this.f5894i);
            }
        }
        return false;
    }

    public final boolean k(C0760b c0760b) {
        synchronized (C0771d.f5928r) {
            this.f5899o.getClass();
        }
        return false;
    }

    public final boolean l(boolean z10) {
        C0804l.c(this.f5899o.f5941n);
        com.google.android.gms.common.api.a.e eVar = this.f5889d;
        if (!eVar.b() || !this.f5893h.isEmpty()) {
            return false;
        }
        C0781n c0781n = this.f5891f;
        if (c0781n.f5987a.isEmpty() && c0781n.f5988b.isEmpty()) {
            eVar.d("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.common.api.a$e, m5.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        C0771d c0771d = this.f5899o;
        C0804l.c(c0771d.f5941n);
        com.google.android.gms.common.api.a.e eVar = this.f5889d;
        if (eVar.b() || eVar.f()) {
            return;
        }
        try {
            int iA = c0771d.f5936h.a(c0771d.f5934f, eVar);
            if (iA != 0) {
                C0760b c0760b = new C0760b(iA, null, null);
                c0760b.toString();
                o(c0760b, null);
                return;
            }
            W w3 = new W(c0771d, eVar, this.f5890e);
            if (eVar.s()) {
                g0 g0Var = this.j;
                C0804l.h(g0Var);
                p156m5.f fVar = g0Var.f5956h;
                if (fVar != null) {
                    fVar.a();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(g0Var));
                C0795c c0795c = g0Var.f5955g;
                c0795c.f6431h = numValueOf;
                e5.h hVar = g0Var.f5952d;
                Looper looper = hVar.getLooper();
                g0Var.f5956h = g0Var.f5953e.a(g0Var.f5951c, looper, c0795c, c0795c.f6430g, g0Var, g0Var);
                g0Var.f5957i = w3;
                Set set = g0Var.f5954f;
                if (set == null || set.isEmpty()) {
                    hVar.post(new R4.s(1, g0Var));
                } else {
                    g0Var.f5956h.t();
                }
            }
            try {
                eVar.i(w3);
            } catch (SecurityException e10) {
                o(new C0760b(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            o(new C0760b(10, null, null), e11);
        }
    }

    public final void n(m0 m0Var) {
        C0804l.c(this.f5899o.f5941n);
        boolean zB = this.f5889d.b();
        LinkedList linkedList = this.f5888c;
        if (zB) {
            if (j(m0Var)) {
                i();
                return;
            } else {
                linkedList.add(m0Var);
                return;
            }
        }
        linkedList.add(m0Var);
        C0760b c0760b = this.f5897m;
        if (c0760b == null || !c0760b.e()) {
            m();
        } else {
            o(this.f5897m, null);
        }
    }

    public final void o(C0760b c0760b, RuntimeException runtimeException) {
        p156m5.f fVar;
        C0804l.c(this.f5899o.f5941n);
        g0 g0Var = this.j;
        if (g0Var != null && (fVar = g0Var.f5956h) != null) {
            fVar.a();
        }
        C0804l.c(this.f5899o.f5941n);
        this.f5897m = null;
        this.f5899o.f5936h.f6502a.clear();
        a(c0760b);
        if ((this.f5889d instanceof W4.e) && c0760b.f5527c != 24) {
            C0771d c0771d = this.f5899o;
            c0771d.f5931c = true;
            e5.h hVar = c0771d.f5941n;
            hVar.sendMessageDelayed(hVar.obtainMessage(19), 300000L);
        }
        if (c0760b.f5527c == 4) {
            b(C0771d.f5927q);
            return;
        }
        if (this.f5888c.isEmpty()) {
            this.f5897m = c0760b;
            return;
        }
        if (runtimeException != null) {
            C0804l.c(this.f5899o.f5941n);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f5899o.f5942o) {
            b(C0771d.c(this.f5890e, c0760b));
            return;
        }
        c(C0771d.c(this.f5890e, c0760b), null, true);
        if (this.f5888c.isEmpty() || k(c0760b) || this.f5899o.b(c0760b, this.f5894i)) {
            return;
        }
        if (c0760b.f5527c == 18) {
            this.f5895k = true;
        }
        if (!this.f5895k) {
            b(C0771d.c(this.f5890e, c0760b));
            return;
        }
        C0771d c0771d2 = this.f5899o;
        C0768a c0768a = this.f5890e;
        e5.h hVar2 = c0771d2.f5941n;
        hVar2.sendMessageDelayed(Message.obtain(hVar2, 9, c0768a), 5000L);
    }

    public final void p(C0760b c0760b) {
        C0804l.c(this.f5899o.f5941n);
        com.google.android.gms.common.api.a.e eVar = this.f5889d;
        eVar.d("onSignInFailed for " + eVar.getClass().getName() + " with " + String.valueOf(c0760b));
        o(c0760b, null);
    }

    public final void q() {
        C0804l.c(this.f5899o.f5941n);
        Status status = C0771d.f5926p;
        b(status);
        C0781n c0781n = this.f5891f;
        c0781n.getClass();
        c0781n.a(false, status);
        for (C0774g c0774g : (C0774g[]) this.f5893h.keySet().toArray(new C0774g[0])) {
            n(new l0(c0774g, new p191p5.h()));
        }
        a(new C0760b(4, null, null));
        com.google.android.gms.common.api.a.e eVar = this.f5889d;
        if (eVar.b()) {
            eVar.o(new S(this));
        }
    }
}
