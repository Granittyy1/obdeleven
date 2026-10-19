package U4;

import S4.C0760b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        int i10 = 0;
        boolean zG = false;
        boolean zG2 = false;
        IBinder iBinderH = null;
        C0760b c0760b = null;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 == 2) {
                iBinderH = SafeParcelReader.h(parcel, i11);
            } else if (c10 == 3) {
                c0760b = (C0760b) SafeParcelReader.b(parcel, i11, C0760b.CREATOR);
            } else if (c10 == 4) {
                zG = SafeParcelReader.g(parcel, i11);
            } else if (c10 != 5) {
                SafeParcelReader.l(parcel, i11);
            } else {
                zG2 = SafeParcelReader.g(parcel, i11);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new D(i10, iBinderH, c0760b, zG, zG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new D[i10];
    }
}
