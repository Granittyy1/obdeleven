package U4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements InterfaceC0801i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f6356c;

    public G(IBinder iBinder) {
        this.f6356c = iBinder;
    }

    @Override // U4.InterfaceC0801i
    public final void F(P p10, C0797e c0797e) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(p10);
            parcelObtain.writeInt(1);
            X.a(c0797e, parcelObtain, 0);
            this.f6356c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6356c;
    }
}
