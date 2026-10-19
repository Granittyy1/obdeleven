package U4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: U4.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0809q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        ArrayList arrayListE = null;
        int i10 = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 != 2) {
                SafeParcelReader.l(parcel, i11);
            } else {
                arrayListE = SafeParcelReader.e(parcel, i11, C0802j.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0807o(i10, arrayListE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0807o[i10];
    }
}
