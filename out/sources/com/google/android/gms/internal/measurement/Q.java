package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class Q implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f25555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25556d;

    public Q(IBinder iBinder, String str) {
        this.f25555c = iBinder;
        this.f25556d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25555c;
    }

    public final void b0(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f25555c.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel e() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25556d);
        return parcelObtain;
    }

    public final Parcel g(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f25555c.transact(i10, parcel, parcelObtain, 0);
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
}
