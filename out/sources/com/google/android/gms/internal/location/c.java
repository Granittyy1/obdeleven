package com.google.android.gms.internal.location;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        b bVar = (b) this;
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator<p106i5.b> creator = p106i5.b.CREATOR;
        int i12 = f.f25369a;
        p106i5.b bVarCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
            sb2.append("Parcel data not fully consumed, unread size: ");
            sb2.append(iDataAvail);
            throw new BadParcelableException(sb2.toString());
        }
        h hVar = (h) bVar;
        Status status = bVarCreateFromParcel.f36741b;
        kotlin.jvm.internal.h hVar2 = new kotlin.jvm.internal.h();
        boolean z10 = status.f25308b <= 0;
        p191p5.h hVar3 = hVar.f25370c;
        if (z10) {
            hVar3.b(hVar2);
            return true;
        }
        hVar3.a(status.f25310d != null ? new ResolvableApiException(status) : new ApiException(status));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
