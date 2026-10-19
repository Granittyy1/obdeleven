package p012b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: ICustomTabsCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            parcel.readInt();
            if (parcel.readInt() != 0) {
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 3) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            parcel.readString();
            if (parcel.readInt() != 0) {
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            if (parcel.readInt() != 0) {
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            parcel.readString();
            if (parcel.readInt() != 0) {
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 6) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        parcel.readInt();
        if (parcel.readInt() != 0) {
        }
        parcel.readInt();
        if (parcel.readInt() != 0) {
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
