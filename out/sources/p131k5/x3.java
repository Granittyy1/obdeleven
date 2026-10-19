package p131k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class x3 implements Parcelable.Creator<v3> {
    @Override // android.os.Parcelable.Creator
    public final v3 createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        int i10 = 0;
        String strC = null;
        Long lValueOf = null;
        Float fValueOf = null;
        String strC2 = null;
        String strC3 = null;
        Double dValueOf = null;
        long j = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    i10 = SafeParcelReader.i(parcel, i11);
                    break;
                case 2:
                    strC = SafeParcelReader.c(parcel, i11);
                    break;
                case 3:
                    j = SafeParcelReader.j(parcel, i11);
                    break;
                case 4:
                    int iK = SafeParcelReader.k(parcel, i11);
                    if (iK != 0) {
                        SafeParcelReader.o(parcel, iK, 8);
                        lValueOf = Long.valueOf(parcel.readLong());
                    } else {
                        lValueOf = null;
                    }
                    break;
                case 5:
                    int iK2 = SafeParcelReader.k(parcel, i11);
                    if (iK2 != 0) {
                        SafeParcelReader.o(parcel, iK2, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strC2 = SafeParcelReader.c(parcel, i11);
                    break;
                case 7:
                    strC3 = SafeParcelReader.c(parcel, i11);
                    break;
                case '\b':
                    int iK3 = SafeParcelReader.k(parcel, i11);
                    if (iK3 != 0) {
                        SafeParcelReader.o(parcel, iK3, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    SafeParcelReader.l(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new v3(i10, strC, j, lValueOf, fValueOf, strC2, strC3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v3[] newArray(int i10) {
        return new v3[i10];
    }
}
