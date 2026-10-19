package p166n5;

import S4.C0760b;
import U4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        C0760b c0760b = null;
        int i10 = 0;
        D d10 = null;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            char c10 = (char) i11;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i11);
            } else if (c10 == 2) {
                c0760b = (C0760b) SafeParcelReader.b(parcel, i11, C0760b.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.l(parcel, i11);
            } else {
                d10 = (D) SafeParcelReader.b(parcel, i11, D.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new l(i10, c0760b, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
