package p131k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: k5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2506f implements Parcelable.Creator<C2496d> {
    @Override // android.os.Parcelable.Creator
    public final C2496d createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        String strC2 = null;
        v3 v3Var = null;
        String strC3 = null;
        C2588z c2588z = null;
        C2588z c2588z2 = null;
        C2588z c2588z3 = null;
        long j = 0;
        long j10 = 0;
        long j11 = 0;
        boolean zG = false;
        while (parcel.dataPosition() < iM) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strC = SafeParcelReader.c(parcel, i10);
                    break;
                case 3:
                    strC2 = SafeParcelReader.c(parcel, i10);
                    break;
                case 4:
                    v3Var = (v3) SafeParcelReader.b(parcel, i10, v3.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.j(parcel, i10);
                    break;
                case 6:
                    zG = SafeParcelReader.g(parcel, i10);
                    break;
                case 7:
                    strC3 = SafeParcelReader.c(parcel, i10);
                    break;
                case '\b':
                    c2588z = (C2588z) SafeParcelReader.b(parcel, i10, C2588z.CREATOR);
                    break;
                case '\t':
                    j10 = SafeParcelReader.j(parcel, i10);
                    break;
                case '\n':
                    c2588z2 = (C2588z) SafeParcelReader.b(parcel, i10, C2588z.CREATOR);
                    break;
                case 11:
                    j11 = SafeParcelReader.j(parcel, i10);
                    break;
                case '\f':
                    c2588z3 = (C2588z) SafeParcelReader.b(parcel, i10, C2588z.CREATOR);
                    break;
                default:
                    SafeParcelReader.l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C2496d(strC, strC2, v3Var, j, zG, strC3, c2588z, j10, c2588z2, j11, c2588z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2496d[] newArray(int i10) {
        return new C2496d[i10];
    }
}
