package S4;

import U4.f0;
import U4.g0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends V4.a {
    public static final Parcelable.Creator<F> CREATOR = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f5516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5518e;

    public F(String str, w wVar, boolean z10, boolean z11) {
        this.f5515b = str;
        this.f5516c = wVar;
        this.f5517d = z10;
        this.f5518e = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.k(parcel, 1, this.f5515b);
        w wVar = this.f5516c;
        if (wVar == null) {
            wVar = null;
        }
        Fa.d.i(parcel, 2, wVar);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f5517d ? 1 : 0);
        Fa.d.n(parcel, 4, 4);
        parcel.writeInt(this.f5518e ? 1 : 0);
        Fa.d.p(parcel, iO);
    }

    public F(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f5515b = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                int i10 = v.f5551d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                p018b5.a aVarB = (iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new f0(iBinder, "com.google.android.gms.common.internal.ICertData")).b();
                byte[] bArr = aVarB == null ? null : (byte[]) p018b5.b.b0(aVarB);
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f5516c = wVar;
        this.f5517d = z10;
        this.f5518e = z11;
    }
}
