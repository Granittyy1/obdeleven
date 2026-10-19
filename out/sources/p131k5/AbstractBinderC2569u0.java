package p131k5;

import U4.C0804l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.measurement.internal.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: k5.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2569u0 extends T implements InterfaceC2561s0 {
    @Override // com.google.android.gms.internal.measurement.T
    public final boolean e(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        ArrayList arrayList;
        int i11 = 0;
        switch (i10) {
            case 1:
                C2588z c2588z = (C2588z) S.a(parcel, C2588z.CREATOR);
                o3 o3Var = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).a0(c2588z, o3Var);
                parcel2.writeNoException();
                return true;
            case 2:
                v3 v3Var = (v3) S.a(parcel, v3.CREATOR);
                o3 o3Var2 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).A(v3Var, o3Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                o3 o3Var3 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).k(o3Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                C2588z c2588z2 = (C2588z) S.a(parcel, C2588z.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                S.d(parcel);
                BinderC2535l1 binderC2535l1 = (BinderC2535l1) this;
                C0804l.h(c2588z2);
                C0804l.e(string);
                binderC2535l1.b0(string, true);
                binderC2535l1.g(new RunnableC2582x1(binderC2535l1, c2588z2, string, i11));
                parcel2.writeNoException();
                return true;
            case 6:
                o3 o3Var4 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).N(o3Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                o3 o3Var5 = (o3) S.a(parcel, o3.CREATOR);
                i11 = parcel.readInt() != 0 ? 1 : 0;
                S.d(parcel);
                BinderC2535l1 binderC2535l2 = (BinderC2535l1) this;
                binderC2535l2.c0(o3Var5);
                String str = o3Var5.f42332b;
                C0804l.h(str);
                h hVar = binderC2535l2.f42293c;
                try {
                    List<w3> list = (List) hVar.i().u(new B1(binderC2535l2, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (w3 w3Var : list) {
                        if (i11 != 0 || !z3.v0(w3Var.f42521c)) {
                            arrayList.add(new v3(w3Var));
                        }
                        break;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    hVar.d().f41712f.a(B0.v(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                } catch (ExecutionException e11) {
                    e = e11;
                    hVar.d().f41712f.a(B0.v(str), e, "Failed to get user properties. appId");
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C2588z c2588z3 = (C2588z) S.a(parcel, C2588z.CREATOR);
                String string2 = parcel.readString();
                S.d(parcel);
                byte[] bArrP = ((BinderC2535l1) this).P(c2588z3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrP);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                S.d(parcel);
                ((BinderC2535l1) this).l(string3, string4, j, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                o3 o3Var6 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                String strP = ((BinderC2535l1) this).p(o3Var6);
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 12:
                C2496d c2496d = (C2496d) S.a(parcel, C2496d.CREATOR);
                o3 o3Var7 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).K(c2496d, o3Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C2496d c2496d2 = (C2496d) S.a(parcel, C2496d.CREATOR);
                S.d(parcel);
                BinderC2535l1 binderC2535l3 = (BinderC2535l1) this;
                C0804l.h(c2496d2);
                C0804l.h(c2496d2.f42125d);
                C0804l.e(c2496d2.f42123b);
                binderC2535l3.b0(c2496d2.f42123b, true);
                binderC2535l3.g(new RunnableC2545o(binderC2535l3, 1, new C2496d(c2496d2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = S.f25582a;
                boolean z10 = parcel.readInt() != 0;
                o3 o3Var8 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                List<v3> listT = ((BinderC2535l1) this).t(string6, string7, z10, o3Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = S.f25582a;
                boolean z11 = parcel.readInt() != 0;
                S.d(parcel);
                List<v3> listM = ((BinderC2535l1) this).m(string8, string9, string10, z11);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                o3 o3Var9 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                List<C2496d> listD = ((BinderC2535l1) this).D(string11, string12, o3Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listD);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                S.d(parcel);
                List<C2496d> listE = ((BinderC2535l1) this).E(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                return true;
            case 18:
                o3 o3Var10 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).G(o3Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
                o3 o3Var11 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).mo705d(bundle, o3Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                o3 o3Var12 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                ((BinderC2535l1) this).B(o3Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                o3 o3Var13 = (o3) S.a(parcel, o3.CREATOR);
                S.d(parcel);
                C2525j c2525jR = ((BinderC2535l1) this).R(o3Var13);
                parcel2.writeNoException();
                if (c2525jR == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c2525jR.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                o3 o3Var14 = (o3) S.a(parcel, o3.CREATOR);
                Bundle bundle2 = (Bundle) S.a(parcel, Bundle.CREATOR);
                S.d(parcel);
                List listD2 = ((BinderC2535l1) this).d(bundle2, o3Var14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listD2);
                return true;
        }
    }
}
