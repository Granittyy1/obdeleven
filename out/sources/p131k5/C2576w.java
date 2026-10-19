package p131k5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: k5.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2576w implements Parcelable.Creator<C2568u> {
    @Override // android.os.Parcelable.Creator
    public final C2568u createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            if (((char) i10) != 2) {
                SafeParcelReader.l(parcel, i10);
            } else {
                bundleA = SafeParcelReader.a(parcel, i10);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C2568u(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2568u[] newArray(int i10) {
        return new C2568u[i10];
    }
}
