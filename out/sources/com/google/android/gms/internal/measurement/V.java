package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends Q implements U {
    @Override // com.google.android.gms.internal.measurement.U
    public final Bundle f(Bundle bundle) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, bundle);
        Parcel parcelG = g(parcelE, 1);
        Bundle bundle2 = (Bundle) S.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
