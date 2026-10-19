package U4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends com.google.android.gms.internal.common.a implements InterfaceC0800h {
    @Override // U4.InterfaceC0800h
    public final Account x() throws RemoteException {
        Parcel parcelE = e(g(), 2);
        Account account = (Account) com.google.android.gms.internal.common.e.a(parcelE, Account.CREATOR);
        parcelE.recycle();
        return account;
    }
}
