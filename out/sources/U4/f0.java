package U4;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends com.google.android.gms.internal.common.a implements g0 {
    @Override // U4.g0
    public final p018b5.a b() throws RemoteException {
        Parcel parcelE = e(g(), 1);
        p018b5.a aVarG = p018b5.a.AbstractBinderC0208a.g(parcelE.readStrongBinder());
        parcelE.recycle();
        return aVarG;
    }

    @Override // U4.g0
    public final int z() throws RemoteException {
        Parcel parcelE = e(g(), 2);
        int i10 = parcelE.readInt();
        parcelE.recycle();
        return i10;
    }
}
