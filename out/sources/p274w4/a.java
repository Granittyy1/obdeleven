package p274w4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IReceiverService.java */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: w4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IReceiverService.java */
    public static abstract class AbstractBinderC0546a extends Binder implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f47745c = 0;

        /* JADX INFO: renamed from: w4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IReceiverService.java */
        public static class C0547a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f47746c;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f47746c;
            }

            @Override // p274w4.a
            public final int h(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f47746c.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i10 = AbstractBinderC0546a.f47745c;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            C0547a c0547a = new C0547a();
            c0547a.f47746c = iBinder;
            return c0547a;
        }
    }

    int h(Bundle bundle) throws RemoteException;
}
