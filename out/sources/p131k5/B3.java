package p131k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B3 implements Parcelable.Creator<o3> {
    @Override // android.os.Parcelable.Creator
    public final o3 createFromParcel(Parcel parcel) {
        int iM = SafeParcelReader.m(parcel);
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        String strC4 = null;
        String strC5 = null;
        String strC6 = null;
        String strC7 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayList = null;
        String strC8 = null;
        String strC9 = null;
        String strC10 = null;
        long j = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        boolean zG = true;
        boolean zG2 = true;
        boolean zG3 = false;
        int i10 = 0;
        boolean zG4 = false;
        boolean zG5 = false;
        int i11 = 0;
        long j16 = -2147483648L;
        String strC11 = "";
        String strC12 = strC11;
        String strC13 = strC12;
        String strC14 = strC13;
        int i12 = 100;
        while (parcel.dataPosition() < iM) {
            int i13 = parcel.readInt();
            switch ((char) i13) {
                case 2:
                    strC = SafeParcelReader.c(parcel, i13);
                    break;
                case 3:
                    strC2 = SafeParcelReader.c(parcel, i13);
                    break;
                case 4:
                    strC3 = SafeParcelReader.c(parcel, i13);
                    break;
                case 5:
                    strC4 = SafeParcelReader.c(parcel, i13);
                    break;
                case 6:
                    j = SafeParcelReader.j(parcel, i13);
                    break;
                case 7:
                    j10 = SafeParcelReader.j(parcel, i13);
                    break;
                case '\b':
                    strC5 = SafeParcelReader.c(parcel, i13);
                    break;
                case '\t':
                    zG = SafeParcelReader.g(parcel, i13);
                    break;
                case '\n':
                    zG3 = SafeParcelReader.g(parcel, i13);
                    break;
                case 11:
                    j16 = SafeParcelReader.j(parcel, i13);
                    break;
                case '\f':
                    strC6 = SafeParcelReader.c(parcel, i13);
                    break;
                case '\r':
                    j11 = SafeParcelReader.j(parcel, i13);
                    break;
                case 14:
                    j12 = SafeParcelReader.j(parcel, i13);
                    break;
                case 15:
                    i10 = SafeParcelReader.i(parcel, i13);
                    break;
                case 16:
                    zG2 = SafeParcelReader.g(parcel, i13);
                    break;
                case 17:
                case 20:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                default:
                    SafeParcelReader.l(parcel, i13);
                    break;
                case 18:
                    zG4 = SafeParcelReader.g(parcel, i13);
                    break;
                case 19:
                    strC7 = SafeParcelReader.c(parcel, i13);
                    break;
                case 21:
                    int iK = SafeParcelReader.k(parcel, i13);
                    if (iK != 0) {
                        SafeParcelReader.o(parcel, iK, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    j13 = SafeParcelReader.j(parcel, i13);
                    break;
                case 23:
                    int iK2 = SafeParcelReader.k(parcel, i13);
                    int iDataPosition = parcel.dataPosition();
                    if (iK2 != 0) {
                        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                        parcel.setDataPosition(iDataPosition + iK2);
                        arrayList = arrayListCreateStringArrayList;
                    } else {
                        arrayList = null;
                    }
                    break;
                case 24:
                    strC8 = SafeParcelReader.c(parcel, i13);
                    break;
                case 25:
                    strC11 = SafeParcelReader.c(parcel, i13);
                    break;
                case 26:
                    strC12 = SafeParcelReader.c(parcel, i13);
                    break;
                case 27:
                    strC9 = SafeParcelReader.c(parcel, i13);
                    break;
                case 28:
                    zG5 = SafeParcelReader.g(parcel, i13);
                    break;
                case 29:
                    j14 = SafeParcelReader.j(parcel, i13);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    i12 = SafeParcelReader.i(parcel, i13);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    strC13 = SafeParcelReader.c(parcel, i13);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    i11 = SafeParcelReader.i(parcel, i13);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    j15 = SafeParcelReader.j(parcel, i13);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    strC10 = SafeParcelReader.c(parcel, i13);
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    strC14 = SafeParcelReader.c(parcel, i13);
                    break;
            }
        }
        SafeParcelReader.f(parcel, iM);
        return new o3(strC, strC2, strC3, strC4, j, j10, strC5, zG, zG3, j16, strC6, j11, j12, i10, zG2, zG4, strC7, boolValueOf, j13, arrayList, strC8, strC11, strC12, strC9, zG5, j14, i12, strC13, i11, j15, strC10, strC14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o3[] newArray(int i10) {
        return new o3[i10];
    }
}
