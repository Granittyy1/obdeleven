package U4;

import S4.C0760b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends V4.a {
    public static final Parcelable.Creator<D> CREATOR = new E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f6349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0760b f6350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6352f;

    public D(int i10, IBinder iBinder, C0760b c0760b, boolean z10, boolean z11) {
        this.f6348b = i10;
        this.f6349c = iBinder;
        this.f6350d = c0760b;
        this.f6351e = z10;
        this.f6352f = z11;
    }

    public final boolean equals(Object obj) {
        Object e0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f6350d.equals(d10.f6350d)) {
            Object e0Var2 = null;
            IBinder iBinder = this.f6349c;
            if (iBinder == null) {
                e0Var = null;
            } else {
                int i10 = InterfaceC0800h.a.f6464c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                e0Var = iInterfaceQueryLocalInterface instanceof InterfaceC0800h ? (InterfaceC0800h) iInterfaceQueryLocalInterface : new e0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = d10.f6349c;
            if (iBinder2 != null) {
                int i11 = InterfaceC0800h.a.f6464c;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                e0Var2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0800h ? (InterfaceC0800h) iInterfaceQueryLocalInterface2 : new e0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (C0803k.a(e0Var, e0Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f6348b);
        Fa.d.i(parcel, 2, this.f6349c);
        Fa.d.j(parcel, 3, this.f6350d, i10);
        Fa.d.n(parcel, 4, 4);
        parcel.writeInt(this.f6351e ? 1 : 0);
        Fa.d.n(parcel, 5, 4);
        parcel.writeInt(this.f6352f ? 1 : 0);
        Fa.d.p(parcel, iO);
    }
}
