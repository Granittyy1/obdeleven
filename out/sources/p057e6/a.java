package p057e6;

import J4.i;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p045d6.b;
import p045d6.f;
import p191p5.h;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        f fVar = (f) this;
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i12 = b.f34742a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(i.b(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        f fVar2 = (f) fVar;
        q qVar = fVar2.f34576e.f34578a;
        if (qVar != null) {
            h hVar = fVar2.f34575d;
            synchronized (qVar.f34763f) {
                qVar.f34762e.remove(hVar);
            }
            synchronized (qVar.f34763f) {
                try {
                    if (qVar.f34767k.get() <= 0 || qVar.f34767k.decrementAndGet() <= 0) {
                        qVar.a().post(new l(qVar));
                    } else {
                        qVar.f34759b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        fVar2.f34574c.a("onGetLaunchReviewFlowInfo", new Object[0]);
        fVar2.f34575d.d(new b((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
