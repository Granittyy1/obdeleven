package S4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        boolean zG = false;
        String strC = null;
        IBinder iBinderH = null;
        boolean zG2 = false;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strC = SafeParcelReader.c(parcel, i10);
            } else if (c10 == 2) {
                iBinderH = SafeParcelReader.h(parcel, i10);
            } else if (c10 == 3) {
                zG = SafeParcelReader.g(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.l(parcel, i10);
            } else {
                zG2 = SafeParcelReader.g(parcel, i10);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new F(strC, iBinderH, zG, zG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new F[i10];
    }
}
