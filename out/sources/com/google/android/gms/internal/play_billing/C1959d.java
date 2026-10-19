package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1959d implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f26179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26180d;

    public C1959d(IBinder iBinder, String str) {
        this.f26179c = iBinder;
        this.f26180d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26179c;
    }

    public final Parcel e() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f26180d);
        return parcelObtain;
    }

    public final Parcel g(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f26179c.transact(i10, parcel, parcelObtain, 0);
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
