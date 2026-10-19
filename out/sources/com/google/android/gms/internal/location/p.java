package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends a implements q {
    @Override // com.google.android.gms.internal.location.q
    public final void o(p106i5.a aVar, h hVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        int i10 = f.f25369a;
        parcelObtain.writeInt(1);
        aVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        parcelObtain.writeString(null);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f25367c.transact(63, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
