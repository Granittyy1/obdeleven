package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC1871o0 extends T implements InterfaceC1850l0 {
    @Override // com.google.android.gms.internal.measurement.T
    public final boolean e(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            S.d(parcel);
            ((C1912u0.c) this).M(j, bundle, string, string2);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(((C1912u0.c) this).f25867c);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
        }
        return true;
    }
}
