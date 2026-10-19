package p044d5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f34566c;

    public a(IBinder iBinder) {
        this.f34566c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34566c;
    }

    public final Parcel e(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f34566c.transact(i10, parcel, parcelObtain, 0);
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
