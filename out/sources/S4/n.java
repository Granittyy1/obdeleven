package S4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        int i10 = 0;
        boolean zG = false;
        long j = -1;
        String strC = null;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                strC = SafeParcelReader.c(parcel, i11);
            } else if (c10 == 2) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 == 3) {
                j = SafeParcelReader.j(parcel, i11);
            } else if (c10 != 4) {
                SafeParcelReader.l(parcel, i11);
            } else {
                zG = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0762d(strC, i10, j, zG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0762d[i10];
    }
}
