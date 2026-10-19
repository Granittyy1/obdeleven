package P2;

import K2.P;
import K2.r;
import Q2.z;
import S4.C0760b;
import T4.W;
import T4.g0;
import U4.C0804l;
import U4.D;
import U4.InterfaceC0800h;
import U4.e0;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import androidx.work.impl.constraints.e;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p166n5.l;

/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4897d;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f4895b = i10;
        this.f4897d = obj;
        this.f4896c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0800h e0Var;
        Set<Scope> set;
        z zVar = null;
        switch (this.f4895b) {
            case 0:
                r rVar = ((b) this.f4897d).f4899b.f4149f;
                String str = (String) this.f4896c;
                synchronized (rVar.f4221k) {
                    try {
                        P pC = rVar.c(str);
                        if (pC != null) {
                            zVar = pC.f4166e;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zVar == null || !zVar.b()) {
                    return;
                }
                synchronized (((b) this.f4897d).f4901d) {
                    ((b) this.f4897d).f4904g.put(Lb.a.g(zVar), zVar);
                    b bVar = (b) this.f4897d;
                    ((b) this.f4897d).f4905h.put(Lb.a.g(zVar), e.a(bVar.f4906i, zVar, bVar.f4900c.a(), (b) this.f4897d));
                    break;
                }
                return;
            default:
                l lVar = (l) this.f4896c;
                C0760b c0760b = lVar.f44970c;
                boolean zK = c0760b.k();
                g0 g0Var = (g0) this.f4897d;
                if (zK) {
                    D d10 = lVar.f44971d;
                    C0804l.h(d10);
                    C0760b c0760b2 = d10.f6350d;
                    if (!c0760b2.k()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0760b2)), new Exception());
                        g0Var.f5957i.b(c0760b2);
                        g0Var.f5956h.a();
                        return;
                    }
                    W w3 = g0Var.f5957i;
                    IBinder iBinder = d10.f6349c;
                    if (iBinder == null) {
                        e0Var = null;
                    } else {
                        int i10 = InterfaceC0800h.a.f6464c;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        e0Var = iInterfaceQueryLocalInterface instanceof InterfaceC0800h ? (InterfaceC0800h) iInterfaceQueryLocalInterface : new e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    w3.getClass();
                    if (e0Var == null || (set = g0Var.f5954f) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        w3.b(new C0760b(4, null, null));
                    } else {
                        w3.f5906c = e0Var;
                        w3.f5907d = set;
                        if (w3.f5908e) {
                            w3.f5904a.k(e0Var, set);
                        }
                    }
                } else {
                    g0Var.f5957i.b(c0760b);
                }
                g0Var.f5956h.a();
                return;
        }
    }
}
