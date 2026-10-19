package p131k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: k5.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2584y implements Parcelable.Creator<C2588z> {
    @Override // android.os.Parcelable.Creator
    public final C2588z createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        C2568u c2568u = null;
        String strC2 = null;
        long j = 0;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strC = SafeParcelReader.c(parcel, i10);
            } else if (c10 == 3) {
                c2568u = (C2568u) SafeParcelReader.b(parcel, i10, C2568u.CREATOR);
            } else if (c10 == 4) {
                strC2 = SafeParcelReader.c(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.l(parcel, i10);
            } else {
                j = SafeParcelReader.j(parcel, i10);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C2588z(strC, c2568u, strC2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2588z[] newArray(int i10) {
        return new C2588z[i10];
    }
}
