package U4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        C0806n c0806n = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean zG = false;
        boolean zG2 = false;
        int i10 = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    c0806n = (C0806n) SafeParcelReader.b(parcel, i11, C0806n.CREATOR);
                    break;
                case 2:
                    zG = SafeParcelReader.g(parcel, i11);
                    break;
                case 3:
                    zG2 = SafeParcelReader.g(parcel, i11);
                    break;
                case 4:
                    int iK = SafeParcelReader.k(parcel, i11);
                    int iDataPosition = parcel.dataPosition();
                    if (iK != 0) {
                        iArrCreateIntArray = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition + iK);
                    } else {
                        iArrCreateIntArray = null;
                    }
                    break;
                case 5:
                    i10 = SafeParcelReader.i(parcel, i11);
                    break;
                case 6:
                    int iK2 = SafeParcelReader.k(parcel, i11);
                    int iDataPosition2 = parcel.dataPosition();
                    if (iK2 != 0) {
                        iArrCreateIntArray2 = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition2 + iK2);
                    } else {
                        iArrCreateIntArray2 = null;
                    }
                    break;
                default:
                    SafeParcelReader.l(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0796d(c0806n, zG, zG2, iArrCreateIntArray, i10, iArrCreateIntArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0796d[i10];
    }
}
