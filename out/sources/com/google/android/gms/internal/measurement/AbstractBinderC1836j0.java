package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC1836j0 extends T implements InterfaceC1843k0 {
    @Override // com.google.android.gms.internal.measurement.T
    public final boolean e(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
        S.d(parcel);
        ((BinderC1815g0) this).f(bundle);
        parcel2.writeNoException();
        return true;
    }
}
