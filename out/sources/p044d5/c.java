package p044d5;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a implements e {
    @Override // p044d5.e
    public final String y() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelE = e(parcelObtain, 1);
        String string = parcelE.readString();
        parcelE.recycle();
        return string;
    }

    @Override // p044d5.e
    public final boolean z() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i10 = b.f34567a;
        parcelObtain.writeInt(1);
        Parcel parcelE = e(parcelObtain, 2);
        boolean z10 = parcelE.readInt() != 0;
        parcelE.recycle();
        return z10;
    }
}
