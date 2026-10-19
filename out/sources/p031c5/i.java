package p031c5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.e;
import p018b5.b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends a {
    public final p018b5.a b0(b bVar, String str, int i10, b bVar2) throws RemoteException {
        Parcel parcelG = g();
        e.b(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        e.b(parcelG, bVar2);
        Parcel parcelE = e(parcelG, 2);
        p018b5.a aVarG = p018b5.a.AbstractBinderC0208a.g(parcelE.readStrongBinder());
        parcelE.recycle();
        return aVarG;
    }

    public final p018b5.a c0(b bVar, String str, int i10, b bVar2) throws RemoteException {
        Parcel parcelG = g();
        e.b(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        e.b(parcelG, bVar2);
        Parcel parcelE = e(parcelG, 3);
        p018b5.a aVarG = p018b5.a.AbstractBinderC0208a.g(parcelE.readStrongBinder());
        parcelE.recycle();
        return aVarG;
    }
}
