package p106i5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        boolean zG = false;
        ArrayList arrayListE = null;
        boolean zG2 = false;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                arrayListE = SafeParcelReader.e(parcel, i10, LocationRequest.CREATOR);
            } else if (c10 == 2) {
                zG = SafeParcelReader.g(parcel, i10);
            } else if (c10 != 3) {
                SafeParcelReader.l(parcel, i10);
            } else {
                zG2 = SafeParcelReader.g(parcel, i10);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new a(arrayListE, zG, zG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
