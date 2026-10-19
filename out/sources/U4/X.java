package U4;

import S4.C0762d;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class X implements Parcelable.Creator {
    public static void a(C0797e c0797e, Parcel parcel, int i10) {
        int iO = Fa.d.o(parcel, 20293);
        int i11 = c0797e.f6446b;
        Fa.d.n(parcel, 1, 4);
        parcel.writeInt(i11);
        Fa.d.n(parcel, 2, 4);
        parcel.writeInt(c0797e.f6447c);
        Fa.d.n(parcel, 3, 4);
        parcel.writeInt(c0797e.f6448d);
        Fa.d.k(parcel, 4, c0797e.f6449e);
        Fa.d.i(parcel, 5, c0797e.f6450f);
        Fa.d.l(parcel, 6, c0797e.f6451g, i10);
        Fa.d.h(parcel, 7, c0797e.f6452h);
        Fa.d.j(parcel, 8, c0797e.f6453i, i10);
        Fa.d.l(parcel, 10, c0797e.j, i10);
        Fa.d.l(parcel, 11, c0797e.f6454k, i10);
        Fa.d.n(parcel, 12, 4);
        parcel.writeInt(c0797e.f6455l ? 1 : 0);
        Fa.d.n(parcel, 13, 4);
        parcel.writeInt(c0797e.f6456m);
        boolean z10 = c0797e.f6457n;
        Fa.d.n(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        Fa.d.k(parcel, 15, c0797e.f6458o);
        Fa.d.p(parcel, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        Scope[] scopeArr = C0797e.f6444p;
        Bundle bundle = new Bundle();
        C0762d[] c0762dArr = C0797e.f6445q;
        C0762d[] c0762dArr2 = c0762dArr;
        String strC = null;
        IBinder iBinderH = null;
        Account account = null;
        String strC2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean zG = false;
        int i13 = 0;
        boolean zG2 = false;
        while (parcel.dataPosition() < iM) {
            int i14 = parcel.readInt();
            switch ((char) i14) {
                case 1:
                    i10 = SafeParcelReader.i(parcel, i14);
                    break;
                case 2:
                    i11 = SafeParcelReader.i(parcel, i14);
                    break;
                case 3:
                    i12 = SafeParcelReader.i(parcel, i14);
                    break;
                case 4:
                    strC = SafeParcelReader.c(parcel, i14);
                    break;
                case 5:
                    iBinderH = SafeParcelReader.h(parcel, i14);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.d(parcel, i14, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, i14);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.b(parcel, i14, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.l(parcel, i14);
                    break;
                case '\n':
                    c0762dArr = (C0762d[]) SafeParcelReader.d(parcel, i14, C0762d.CREATOR);
                    break;
                case 11:
                    c0762dArr2 = (C0762d[]) SafeParcelReader.d(parcel, i14, C0762d.CREATOR);
                    break;
                case '\f':
                    zG = SafeParcelReader.g(parcel, i14);
                    break;
                case '\r':
                    i13 = SafeParcelReader.i(parcel, i14);
                    break;
                case 14:
                    zG2 = SafeParcelReader.g(parcel, i14);
                    break;
                case 15:
                    strC2 = SafeParcelReader.c(parcel, i14);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new C0797e(i10, i11, i12, strC, iBinderH, scopeArr, bundle, account, c0762dArr, c0762dArr2, zG, i13, zG2, strC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0797e[i10];
    }
}
