package p106i5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Status status = null;
        c cVar = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                status = (Status) SafeParcelReader.b(parcel, i10, Status.CREATOR);
            } else if (c10 != 2) {
                SafeParcelReader.l(parcel, i10);
            } else {
                cVar = (c) SafeParcelReader.b(parcel, i10, c.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new b(status, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
