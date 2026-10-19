package S4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        PendingIntent pendingIntent = null;
        String strC = null;
        Integer numValueOf = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < iM) {
            int i12 = parcel.readInt();
            char c10 = (char) i12;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i12);
            } else if (c10 == 2) {
                i11 = SafeParcelReader.i(parcel, i12);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.b(parcel, i12, PendingIntent.CREATOR);
            } else if (c10 == 4) {
                strC = SafeParcelReader.c(parcel, i12);
            } else if (c10 != 5) {
                SafeParcelReader.l(parcel, i12);
            } else {
                int iK = SafeParcelReader.k(parcel, i12);
                if (iK == 0) {
                    numValueOf = null;
                } else {
                    SafeParcelReader.o(parcel, iK, 4);
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0760b(i10, i11, pendingIntent, strC, numValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0760b[i10];
    }
}
