package com.google.android.play.integrity.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        t tVar = (t) this;
        if (i10 == 2) {
            Bundle bundle = (Bundle) n.a(parcel, Bundle.CREATOR);
            n.b(parcel);
            tVar.H(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) n.a(parcel, Bundle.CREATOR);
            n.b(parcel);
            tVar.w(bundle2);
            return true;
        }
        if (i10 == 4) {
            n.b(parcel);
            p019b6.k kVar = (p019b6.k) tVar;
            kVar.f20585d.f20595e.c(kVar.f20584c);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        n.b(parcel);
        p019b6.k kVar2 = (p019b6.k) tVar;
        kVar2.f20585d.f20595e.c(kVar2.f20584c);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
