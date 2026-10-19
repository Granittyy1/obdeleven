package U4;

import S4.C0762d;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: U4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0797e extends V4.a {
    public static final Parcelable.Creator<C0797e> CREATOR = new X();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Scope[] f6444p = new Scope[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0762d[] f6445q = new C0762d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f6450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Scope[] f6451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f6452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Account f6453i;
    public C0762d[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0762d[] f6454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6458o;

    public C0797e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0762d[] c0762dArr, C0762d[] c0762dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f6444p : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C0762d[] c0762dArr3 = f6445q;
        c0762dArr = c0762dArr == null ? c0762dArr3 : c0762dArr;
        c0762dArr2 = c0762dArr2 == null ? c0762dArr3 : c0762dArr2;
        this.f6446b = i10;
        this.f6447c = i11;
        this.f6448d = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f6449e = "com.google.android.gms";
        } else {
            this.f6449e = str;
        }
        if (i10 < 2) {
            Account accountX = null;
            if (iBinder != null) {
                int i14 = InterfaceC0800h.a.f6464c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0800h e0Var = iInterfaceQueryLocalInterface instanceof InterfaceC0800h ? (InterfaceC0800h) iInterfaceQueryLocalInterface : new e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i15 = BinderC0793a.f6387d;
                if (e0Var != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        accountX = e0Var.x();
                    } catch (RemoteException unused) {
                    } finally {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                }
            }
            this.f6453i = accountX;
        } else {
            this.f6450f = iBinder;
            this.f6453i = account;
        }
        this.f6451g = scopeArr;
        this.f6452h = bundle;
        this.j = c0762dArr;
        this.f6454k = c0762dArr2;
        this.f6455l = z10;
        this.f6456m = i13;
        this.f6457n = z11;
        this.f6458o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        X.a(this, parcel, i10);
    }
}
