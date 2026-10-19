package R4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: R4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0757d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                SafeParcelReader.l(parcel, i10);
            } else {
                intent = (Intent) SafeParcelReader.b(parcel, i10, Intent.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0754a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0754a[i10];
    }
}
