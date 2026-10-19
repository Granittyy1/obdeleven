package p131k5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k5.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2565t0 extends Q implements InterfaceC2561s0 {
    public C2565t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p131k5.InterfaceC2561s0
    public final void A(v3 v3Var, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, v3Var);
        S.c(parcelE, o3Var);
        b0(parcelE, 2);
    }

    @Override // p131k5.InterfaceC2561s0
    public final void B(o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        b0(parcelE, 20);
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<C2496d> D(String str, String str2, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        S.c(parcelE, o3Var);
        Parcel parcelG = g(parcelE, 16);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2496d.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<C2496d> E(String str, String str2, String str3) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(null);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        Parcel parcelG = g(parcelE, 17);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2496d.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p131k5.InterfaceC2561s0
    public final void G(o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        b0(parcelE, 18);
    }

    @Override // p131k5.InterfaceC2561s0
    public final void K(C2496d c2496d, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, c2496d);
        S.c(parcelE, o3Var);
        b0(parcelE, 12);
    }

    @Override // p131k5.InterfaceC2561s0
    public final void N(o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        b0(parcelE, 6);
    }

    @Override // p131k5.InterfaceC2561s0
    public final byte[] P(C2588z c2588z, String str) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, c2588z);
        parcelE.writeString(str);
        Parcel parcelG = g(parcelE, 9);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // p131k5.InterfaceC2561s0
    public final C2525j R(o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        Parcel parcelG = g(parcelE, 21);
        C2525j c2525j = (C2525j) S.a(parcelG, C2525j.CREATOR);
        parcelG.recycle();
        return c2525j;
    }

    @Override // p131k5.InterfaceC2561s0
    public final void a0(C2588z c2588z, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, c2588z);
        S.c(parcelE, o3Var);
        b0(parcelE, 1);
    }

    @Override // p131k5.InterfaceC2561s0
    public final List d(Bundle bundle, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        S.c(parcelE, bundle);
        Parcel parcelG = g(parcelE, 24);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(j3.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p131k5.InterfaceC2561s0
    public final void k(o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        b0(parcelE, 4);
    }

    @Override // p131k5.InterfaceC2561s0
    public final void l(String str, String str2, long j, String str3) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeLong(j);
        parcelE.writeString(str);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        b0(parcelE, 10);
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<v3> m(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(null);
        parcelE.writeString(str2);
        parcelE.writeString(str3);
        ClassLoader classLoader = S.f25582a;
        parcelE.writeInt(z10 ? 1 : 0);
        Parcel parcelG = g(parcelE, 15);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(v3.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p131k5.InterfaceC2561s0
    public final String p(o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, o3Var);
        Parcel parcelG = g(parcelE, 11);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<v3> t(String str, String str2, boolean z10, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        ClassLoader classLoader = S.f25582a;
        parcelE.writeInt(z10 ? 1 : 0);
        S.c(parcelE, o3Var);
        Parcel parcelG = g(parcelE, 14);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(v3.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p131k5.InterfaceC2561s0
    /* JADX INFO: renamed from: d */
    public final void mo705d(Bundle bundle, o3 o3Var) throws RemoteException {
        Parcel parcelE = e();
        S.c(parcelE, bundle);
        S.c(parcelE, o3Var);
        b0(parcelE, 19);
    }
}
