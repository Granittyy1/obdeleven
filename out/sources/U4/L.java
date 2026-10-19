package U4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean zG = false;
        boolean zG2 = false;
        while (parcel.dataPosition() < iM) {
            int i13 = parcel.readInt();
            char c10 = (char) i13;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i13);
            } else if (c10 == 2) {
                zG = SafeParcelReader.g(parcel, i13);
            } else if (c10 == 3) {
                zG2 = SafeParcelReader.g(parcel, i13);
            } else if (c10 == 4) {
                i11 = SafeParcelReader.i(parcel, i13);
            } else if (c10 != 5) {
                SafeParcelReader.l(parcel, i13);
            } else {
                i12 = SafeParcelReader.i(parcel, i13);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0806n(i10, i11, i12, zG, zG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0806n[i10];
    }
}
