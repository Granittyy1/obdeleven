package S4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        long j = -1;
        boolean zG = false;
        int i10 = 0;
        int i11 = 0;
        String strC = null;
        while (parcel.dataPosition() < iM) {
            int i12 = parcel.readInt();
            char c10 = (char) i12;
            if (c10 == 1) {
                zG = SafeParcelReader.g(parcel, i12);
            } else if (c10 == 2) {
                strC = SafeParcelReader.c(parcel, i12);
            } else if (c10 == 3) {
                i10 = SafeParcelReader.i(parcel, i12);
            } else if (c10 == 4) {
                i11 = SafeParcelReader.i(parcel, i12);
            } else if (c10 != 5) {
                SafeParcelReader.l(parcel, i12);
            } else {
                j = SafeParcelReader.j(parcel, i12);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new D(zG, strC, i10, i11, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new D[i10];
    }
}
