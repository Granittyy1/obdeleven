package U4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String strC = null;
        String strC2 = null;
        long j = 0;
        long j10 = 0;
        while (parcel.dataPosition() < iM) {
            int i15 = parcel.readInt();
            switch ((char) i15) {
                case 1:
                    i11 = SafeParcelReader.i(parcel, i15);
                    break;
                case 2:
                    i12 = SafeParcelReader.i(parcel, i15);
                    break;
                case 3:
                    i13 = SafeParcelReader.i(parcel, i15);
                    break;
                case 4:
                    j = SafeParcelReader.j(parcel, i15);
                    break;
                case 5:
                    j10 = SafeParcelReader.j(parcel, i15);
                    break;
                case 6:
                    strC = SafeParcelReader.c(parcel, i15);
                    break;
                case 7:
                    strC2 = SafeParcelReader.c(parcel, i15);
                    break;
                case '\b':
                    i14 = SafeParcelReader.i(parcel, i15);
                    break;
                case '\t':
                    i10 = SafeParcelReader.i(parcel, i15);
                    break;
                default:
                    SafeParcelReader.l(parcel, i15);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0802j(i11, i12, i13, j, j10, strC, strC2, i14, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0802j[i10];
    }
}
