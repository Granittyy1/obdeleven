package p131k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements Parcelable.Creator<j3> {
    @Override // android.os.Parcelable.Creator
    public final j3 createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        long j = 0;
        int i10 = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                strC = SafeParcelReader.c(parcel, i11);
            } else if (c10 == 2) {
                j = SafeParcelReader.j(parcel, i11);
            } else if (c10 != 3) {
                SafeParcelReader.l(parcel, i11);
            } else {
                i10 = SafeParcelReader.i(parcel, i11);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new j3(i10, j, strC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j3[] newArray(int i10) {
        return new j3[i10];
    }
}
