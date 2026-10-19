package T4;

import S4.C0760b;
import U4.C0804l;
import U4.InterfaceC0800h;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* JADX INFO: renamed from: T4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0791y extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f6018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p166n5.l f6019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0791y(C c10, C c11, p166n5.l lVar) {
        super(c10);
        this.f6018b = c11;
        this.f6019c = lVar;
    }

    @Override // T4.I
    public final void a() {
        InterfaceC0800h e0Var;
        C c10 = this.f6018b;
        if (c10.n(0)) {
            p166n5.l lVar = this.f6019c;
            C0760b c0760b = lVar.f44970c;
            if (!c0760b.k()) {
                if (!c10.f5831l || c0760b.e()) {
                    c10.k(c0760b);
                    return;
                } else {
                    c10.a();
                    c10.m();
                    return;
                }
            }
            U4.D d10 = lVar.f44971d;
            C0804l.h(d10);
            C0760b c0760b2 = d10.f6350d;
            if (!c0760b2.k()) {
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0760b2)), new Exception());
                c10.k(c0760b2);
                return;
            }
            c10.f5833n = true;
            IBinder iBinder = d10.f6349c;
            if (iBinder == null) {
                e0Var = null;
            } else {
                int i10 = InterfaceC0800h.a.f6464c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                e0Var = iInterfaceQueryLocalInterface instanceof InterfaceC0800h ? (InterfaceC0800h) iInterfaceQueryLocalInterface : new U4.e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            C0804l.h(e0Var);
            c10.f5834o = e0Var;
            c10.f5835p = d10.f6351e;
            c10.f5836q = d10.f6352f;
            c10.m();
        }
    }
}
