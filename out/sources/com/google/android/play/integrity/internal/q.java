package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements s, IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f27758c;

    public q(IBinder iBinder) {
        this.f27758c = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.s
    public final void Z(Bundle bundle, p019b6.l lVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        int i10 = n.f27755a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(lVar);
        try {
            this.f27758c.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27758c;
    }

    @Override // com.google.android.play.integrity.internal.s
    public final void r(Bundle bundle, p019b6.m mVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        int i10 = n.f27755a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(mVar);
        try {
            this.f27758c.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
