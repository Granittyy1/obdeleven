package U4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Account account = null;
        int i10 = 0;
        int i11 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iM) {
            int i12 = parcel.readInt();
            char c10 = (char) i12;
            if (c10 == 1) {
                i10 = SafeParcelReader.i(parcel, i12);
            } else if (c10 == 2) {
                account = (Account) SafeParcelReader.b(parcel, i12, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.i(parcel, i12);
            } else if (c10 != 4) {
                SafeParcelReader.l(parcel, i12);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.b(parcel, i12, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new B(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B[i10];
    }
}
