package p057e6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p045d6.f;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements e, IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f34743c;

    public c(IBinder iBinder) {
        this.f34743c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34743c;
    }

    @Override // p057e6.e
    public final void u(String str, Bundle bundle, f fVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i10 = b.f34742a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(fVar);
        try {
            this.f34743c.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
