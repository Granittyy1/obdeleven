package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f25351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25352d;

    public a(IBinder iBinder, String str) {
        this.f25351c = iBinder;
        this.f25352d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25351c;
    }

    public final Parcel e(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f25351c.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25352d);
        return parcelObtain;
    }
}
