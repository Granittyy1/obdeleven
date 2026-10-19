package U4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends V4.a {
    public static final Parcelable.Creator<B> CREATOR = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f6345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f6347e;

    public B(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f6344b = i10;
        this.f6345c = account;
        this.f6346d = i11;
        this.f6347e = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(this.f6344b);
        Fa.d.j(parcel, 2, this.f6345c, i10);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(this.f6346d);
        Fa.d.j(parcel, 4, this.f6347e, i10);
        Fa.d.p(parcel, iO);
    }
}
