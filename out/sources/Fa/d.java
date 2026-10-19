package Fa;

import Ia.l;
import Ia.p;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.compose.foundation.text.u;
import androidx.compose.runtime.C1086g;
import androidx.compose.ui.h;
import androidx.compose.ui.input.pointer.C1151b;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.input.D;
import androidx.core.app.C1284i;
import androidx.core.app.C1285j;
import com.google.android.gms.internal.play_billing.i2;
import com.voltasit.parse.model.HistoryDB;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import p141l2.C;
import p141l2.J;
import p141l2.K;
import p311z4.f;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public class d implements f {
    public d(com.voltasit.obdeleven.domain.usecases.odx.c cVar) {
    }

    public static final I.f a(p013b0.c cVar, int i10, D d10, B b10, boolean z10, int i11) {
        I.f fVarC = b10 != null ? b10.c(d10.f15485b.b(i10)) : I.f.f3756e;
        int iE1 = cVar.e1(u.f11632a);
        float f10 = fVarC.f3757a;
        return new I.f(z10 ? (i11 - f10) - iE1 : f10, fVarC.f3758b, z10 ? i11 - f10 : iE1 + f10, fVarC.f3760d);
    }

    public static int b(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = C1284i.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerC = C1285j.c(context);
                iC = C1285j.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = C1285j.a(appOpsManagerC, strD, iMyUid, C1285j.b(context));
                }
            } else {
                iC = C1284i.c((AppOpsManager) C1284i.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final void d(C1086g c1086g, p pVar) {
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        o.d(2, pVar);
        pVar.invoke(c1086g, 1);
    }

    public static final J e(l lVar) {
        K k10 = new K();
        lVar.invoke(k10);
        boolean z10 = k10.f44258b;
        J.a aVar = k10.f44257a;
        aVar.f44249a = z10;
        aVar.f44250b = k10.f44259c;
        String str = k10.f44261e;
        if (str != null) {
            boolean z11 = k10.f44262f;
            boolean z12 = k10.f44263g;
            aVar.f44252d = str;
            aVar.f44251c = -1;
            aVar.f44253e = z11;
            aVar.f44254f = z12;
        } else {
            int i10 = k10.f44260d;
            boolean z13 = k10.f44262f;
            boolean z14 = k10.f44263g;
            aVar.f44251c = i10;
            aVar.f44252d = null;
            aVar.f44253e = z13;
            aVar.f44254f = z14;
        }
        String str2 = aVar.f44252d;
        if (str2 == null) {
            return new J(aVar.f44249a, aVar.f44250b, aVar.f44251c, aVar.f44253e, aVar.f44254f, aVar.f44255g, aVar.f44256h);
        }
        boolean z15 = aVar.f44249a;
        boolean z16 = aVar.f44250b;
        boolean z17 = aVar.f44253e;
        boolean z18 = aVar.f44254f;
        int i11 = aVar.f44255g;
        int i12 = aVar.f44256h;
        int i13 = C.f44217f;
        J j = new J(z15, z16, C.a.a(str2).hashCode(), z17, z18, i11, i12);
        j.j = str2;
        return j;
    }

    public static h f(h hVar, C1151b c1151b) {
        return hVar.i(new PointerHoverIconModifierElement(c1151b, false));
    }

    public static void g(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void h(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iO = o(parcel, i10);
        parcel.writeBundle(bundle);
        p(parcel, iO);
    }

    public static void i(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iO = o(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        p(parcel, iO);
    }

    public static void j(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iO = o(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        p(parcel, iO);
    }

    public static void k(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iO = o(parcel, i10);
        parcel.writeString(str);
        p(parcel, iO);
    }

    public static void l(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iO = o(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        p(parcel, iO);
    }

    public static void m(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iO = o(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        p(parcel, iO);
    }

    public static void n(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static int o(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void p(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    @Override // p311z4.f
    public Object apply(Object obj) {
        return ((i2) obj).c();
    }

    public com.obdeleven.service.odx.d c(HistoryDB history) {
        com.obdeleven.service.odx.d dVarA;
        i.e(history, "history");
        String string = history.getString("odxFileName");
        if (string != null) {
            int i10 = 0;
            for (char c10 : string.toCharArray()) {
                if (Character.isLetter(c10)) {
                    i10++;
                }
            }
            if (i10 > 2 && (dVarA = com.voltasit.obdeleven.domain.usecases.odx.c.a(string)) != null) {
                return dVarA;
            }
        }
        String strOptString = history.d().optString("odxName");
        String strOptString2 = history.d().optString("odxVersion");
        if (strOptString == null || strOptString.length() <= 0 || strOptString2 == null || strOptString2.length() <= 0) {
            return null;
        }
        return new com.obdeleven.service.odx.d(strOptString, strOptString2);
    }
}
