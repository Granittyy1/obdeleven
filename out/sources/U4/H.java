package U4;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends com.google.android.gms.internal.common.a implements J {
    @Override // U4.J
    public final S4.D I(S4.B b10) throws RemoteException {
        Parcel parcelG = g();
        int i10 = com.google.android.gms.internal.common.e.f25356a;
        parcelG.writeInt(1);
        b10.writeToParcel(parcelG, 0);
        Parcel parcelE = e(parcelG, 6);
        S4.D d10 = (S4.D) com.google.android.gms.internal.common.e.a(parcelE, S4.D.CREATOR);
        parcelE.recycle();
        return d10;
    }

    @Override // U4.J
    public final boolean Q(S4.F f10, p018b5.b bVar) throws RemoteException {
        Parcel parcelG = g();
        int i10 = com.google.android.gms.internal.common.e.f25356a;
        parcelG.writeInt(1);
        f10.writeToParcel(parcelG, 0);
        com.google.android.gms.internal.common.e.b(parcelG, bVar);
        Parcel parcelE = e(parcelG, 5);
        boolean z10 = parcelE.readInt() != 0;
        parcelE.recycle();
        return z10;
    }

    @Override // U4.J
    public final boolean c() throws RemoteException {
        Parcel parcelE = e(g(), 7);
        int i10 = com.google.android.gms.internal.common.e.f25356a;
        boolean z10 = parcelE.readInt() != 0;
        parcelE.recycle();
        return z10;
    }
}
