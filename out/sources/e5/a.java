package e5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f34736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34737d;

    public a(IBinder iBinder, String str) {
        this.f34736c = iBinder;
        this.f34737d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34736c;
    }

    public final void e(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f34736c.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
