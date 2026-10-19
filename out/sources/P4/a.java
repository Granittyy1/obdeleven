package P4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        String strC4 = null;
        Uri uri = null;
        String strC5 = null;
        String strC6 = null;
        ArrayList arrayListE = null;
        String strC7 = null;
        String strC8 = null;
        long j = 0;
        int i10 = 0;
        while (parcel.dataPosition() < iM) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    i10 = SafeParcelReader.i(parcel, i11);
                    break;
                case 2:
                    strC = SafeParcelReader.c(parcel, i11);
                    break;
                case 3:
                    strC2 = SafeParcelReader.c(parcel, i11);
                    break;
                case 4:
                    strC3 = SafeParcelReader.c(parcel, i11);
                    break;
                case 5:
                    strC4 = SafeParcelReader.c(parcel, i11);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.b(parcel, i11, Uri.CREATOR);
                    break;
                case 7:
                    strC5 = SafeParcelReader.c(parcel, i11);
                    break;
                case '\b':
                    j = SafeParcelReader.j(parcel, i11);
                    break;
                case '\t':
                    strC6 = SafeParcelReader.c(parcel, i11);
                    break;
                case '\n':
                    arrayListE = SafeParcelReader.e(parcel, i11, Scope.CREATOR);
                    break;
                case 11:
                    strC7 = SafeParcelReader.c(parcel, i11);
                    break;
                case '\f':
                    strC8 = SafeParcelReader.c(parcel, i11);
                    break;
                default:
                    SafeParcelReader.l(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new GoogleSignInAccount(i10, strC, strC2, strC3, strC4, uri, strC5, j, strC6, arrayListE, strC7, strC8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
