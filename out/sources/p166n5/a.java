package p166n5;

import S4.C0760b;
import U4.AbstractC0794b;
import U4.AbstractC0798f;
import U4.B;
import U4.C0795c;
import U4.C0804l;
import U4.InterfaceC0800h;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.d;
import e5.c;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p156m5.f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC0798f<g> implements f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f44958G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0795c f44959H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Bundle f44960I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Integer f44961J;

    public a(Context context, Looper looper, C0795c c0795c, Bundle bundle, d.a aVar, d.b bVar) {
        super(context, looper, 44, c0795c, aVar, bVar);
        this.f44958G = true;
        this.f44959H = c0795c;
        this.f44960I = bundle;
        this.f44961J = c0795c.f6431h;
    }

    @Override // U4.AbstractC0794b
    public final String B() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // U4.AbstractC0794b
    public final String C() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p156m5.f
    public final void e(InterfaceC0800h interfaceC0800h, boolean z10) {
        try {
            g gVar = (g) A();
            Integer num = this.f44961J;
            C0804l.h(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(gVar.f34737d);
            int i10 = c.f34738a;
            if (interfaceC0800h == null) {
                parcelObtain.writeStrongBinder(null);
            } else {
                parcelObtain.writeStrongBinder(interfaceC0800h.asBinder());
            }
            parcelObtain.writeInt(iIntValue);
            parcelObtain.writeInt(z10 ? 1 : 0);
            gVar.e(parcelObtain, 9);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p156m5.f
    public final void j(d dVar) {
        GoogleSignInAccount googleSignInAccountK;
        try {
            Account account = this.f44959H.f6424a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f6400i;
                ReentrantLock reentrantLock = Q4.a.f5096c;
                C0804l.h(context);
                ReentrantLock reentrantLock2 = Q4.a.f5096c;
                reentrantLock2.lock();
                try {
                    if (Q4.a.f5097d == null) {
                        Q4.a.f5097d = new Q4.a(context.getApplicationContext());
                    }
                    Q4.a aVar = Q4.a.f5097d;
                    reentrantLock2.unlock();
                    String strA = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = aVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountK = GoogleSignInAccount.k(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountK = null;
                            }
                        }
                    }
                    googleSignInAccountK = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountK = null;
            }
            Integer num = this.f44961J;
            C0804l.h(num);
            B b10 = new B(2, account, num.intValue(), googleSignInAccountK);
            g gVar = (g) A();
            j jVar = new j(1, b10);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(gVar.f34737d);
            int i10 = c.f34738a;
            parcelObtain.writeInt(1);
            jVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(dVar);
            gVar.e(parcelObtain, 12);
        } catch (RemoteException e10) {
            try {
                dVar.U(new l(1, new C0760b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p156m5.f
    public final void m() {
        try {
            g gVar = (g) A();
            Integer num = this.f44961J;
            C0804l.h(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(gVar.f34737d);
            parcelObtain.writeInt(iIntValue);
            gVar.e(parcelObtain, 7);
        } catch (RemoteException unused) {
        }
    }

    @Override // U4.AbstractC0794b, com.google.android.gms.common.api.a.e
    public final int n() {
        return 12451000;
    }

    @Override // U4.AbstractC0794b, com.google.android.gms.common.api.a.e
    public final boolean s() {
        return this.f44958G;
    }

    @Override // p156m5.f
    public final void t() {
        i(new AbstractC0794b.d(this));
    }

    @Override // U4.AbstractC0794b
    public final IInterface v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // U4.AbstractC0794b
    public final Bundle y() {
        C0795c c0795c = this.f44959H;
        boolean zEquals = this.f6400i.getPackageName().equals(c0795c.f6428e);
        Bundle bundle = this.f44960I;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0795c.f6428e);
        }
        return bundle;
    }
}
