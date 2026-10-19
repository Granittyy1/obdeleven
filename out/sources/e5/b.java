package e5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p166n5.l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        p166n5.e eVar = (p166n5.e) this;
        switch (i10) {
            case 3:
                c.b(parcel);
                break;
            case 4:
                c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                c.b(parcel);
                break;
            case 7:
                c.b(parcel);
                break;
            case 8:
                l lVar = (l) c.a(parcel, l.CREATOR);
                c.b(parcel);
                eVar.U(lVar);
                break;
            case 9:
                c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
