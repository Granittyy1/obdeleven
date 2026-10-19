package U4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends com.google.android.gms.internal.common.d {
    @Override // com.google.android.gms.internal.common.d
    public final boolean e(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.e.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.e.c(parcel);
            P p10 = (P) this;
            C0804l.i(p10.f6366c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0794b abstractC0794b = p10.f6366c;
            abstractC0794b.getClass();
            S s10 = new S(abstractC0794b, i11, strongBinder, bundle);
            N n10 = abstractC0794b.f6402l;
            n10.sendMessage(n10.obtainMessage(1, p10.f6367d, -1, s10));
            p10.f6366c = null;
        } else if (i10 == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.e.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            U u10 = (U) com.google.android.gms.internal.common.e.a(parcel, U.CREATOR);
            com.google.android.gms.internal.common.e.c(parcel);
            P p11 = (P) this;
            AbstractC0794b abstractC0794b2 = p11.f6366c;
            C0804l.i(abstractC0794b2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C0804l.h(u10);
            abstractC0794b2.f6391B = u10;
            if (abstractC0794b2.F()) {
                C0796d c0796d = u10.f6376e;
                C0805m c0805mA = C0805m.a();
                C0806n c0806n = c0796d == null ? null : c0796d.f6436b;
                synchronized (c0805mA) {
                    try {
                        if (c0806n == null) {
                            c0806n = C0805m.f6476c;
                        } else {
                            C0806n c0806n2 = c0805mA.f6477a;
                            if (c0806n2 == null || c0806n2.f6478b < c0806n.f6478b) {
                            }
                        }
                        c0805mA.f6477a = c0806n;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = u10.f6373b;
            C0804l.i(p11.f6366c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0794b abstractC0794b3 = p11.f6366c;
            abstractC0794b3.getClass();
            S s11 = new S(abstractC0794b3, i12, strongBinder2, bundle2);
            N n11 = abstractC0794b3.f6402l;
            n11.sendMessage(n11.obtainMessage(1, p11.f6367d, -1, s11));
            p11.f6366c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
