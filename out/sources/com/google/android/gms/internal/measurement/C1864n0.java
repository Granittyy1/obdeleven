package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1864n0 extends Q implements InterfaceC1850l0 {
    public C1864n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1850l0
    public final void M(long j, Bundle bundle, String str, String str2) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        S.c(parcelE, bundle);
        parcelE.writeLong(j);
        b0(parcelE, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1850l0
    public final int a() throws RemoteException {
        Parcel parcelG = g(e(), 2);
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }
}
