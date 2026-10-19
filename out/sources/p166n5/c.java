package p166n5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Intent intent = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < iM) {
            int i12 = parcel.readInt();
            char c10 = (char) i12;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i12);
            } else if (c10 == 2) {
                i11 = SafeParcelReader.i(parcel, i12);
            } else if (c10 != 3) {
                SafeParcelReader.l(parcel, i12);
            } else {
                intent = (Intent) SafeParcelReader.b(parcel, i12, Intent.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new b(i10, i11, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
