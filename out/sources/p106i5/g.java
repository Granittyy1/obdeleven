package p106i5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        boolean zG = false;
        boolean zG2 = false;
        boolean zG3 = false;
        boolean zG4 = false;
        boolean zG5 = false;
        boolean zG6 = false;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    zG = SafeParcelReader.g(parcel, i10);
                    break;
                case 2:
                    zG2 = SafeParcelReader.g(parcel, i10);
                    break;
                case 3:
                    zG3 = SafeParcelReader.g(parcel, i10);
                    break;
                case 4:
                    zG4 = SafeParcelReader.g(parcel, i10);
                    break;
                case 5:
                    zG5 = SafeParcelReader.g(parcel, i10);
                    break;
                case 6:
                    zG6 = SafeParcelReader.g(parcel, i10);
                    break;
                default:
                    SafeParcelReader.l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new c(zG, zG2, zG3, zG4, zG5, zG6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
