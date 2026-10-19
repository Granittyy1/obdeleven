package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p293xa.r;

/* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        int i12 = 0;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        f callback = null;
        f callback2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) {
                    e eVar = new e();
                    eVar.f20108c = strongBinder;
                    callback = eVar;
                } else {
                    callback = (f) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            MultiInstanceInvalidationService.a aVar = (MultiInstanceInvalidationService.a) this;
            kotlin.jvm.internal.i.e(callback, "callback");
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                synchronized (multiInstanceInvalidationService.f20058d) {
                    try {
                        int i13 = multiInstanceInvalidationService.f20056b + 1;
                        multiInstanceInvalidationService.f20056b = i13;
                        if (multiInstanceInvalidationService.f20058d.register(callback, Integer.valueOf(i13))) {
                            multiInstanceInvalidationService.f20057c.put(Integer.valueOf(i13), string);
                            i12 = i13;
                        } else {
                            multiInstanceInvalidationService.f20056b--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        } else if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof f)) {
                    e eVar2 = new e();
                    eVar2.f20108c = strongBinder2;
                    callback2 = eVar2;
                } else {
                    callback2 = (f) iInterfaceQueryLocalInterface2;
                }
            }
            int i14 = parcel.readInt();
            kotlin.jvm.internal.i.e(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService2.f20058d) {
                multiInstanceInvalidationService2.f20058d.unregister(callback2);
            }
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int i15 = parcel.readInt();
            String[] tables = parcel.createStringArray();
            kotlin.jvm.internal.i.e(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService3.f20058d) {
                try {
                    String str = (String) multiInstanceInvalidationService3.f20057c.get(Integer.valueOf(i15));
                    if (str != null) {
                        int iBeginBroadcast = multiInstanceInvalidationService3.f20058d.beginBroadcast();
                        while (i12 < iBeginBroadcast) {
                            try {
                                Object broadcastCookie = multiInstanceInvalidationService3.f20058d.getBroadcastCookie(i12);
                                kotlin.jvm.internal.i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                Integer num = (Integer) broadcastCookie;
                                int iIntValue = num.intValue();
                                String str2 = (String) multiInstanceInvalidationService3.f20057c.get(num);
                                if (i15 != iIntValue && str.equals(str2)) {
                                    try {
                                        multiInstanceInvalidationService3.f20058d.getBroadcastItem(i12).n(tables);
                                    } catch (RemoteException unused) {
                                    }
                                }
                                i12++;
                            } catch (Throwable th2) {
                                multiInstanceInvalidationService3.f20058d.finishBroadcast();
                                throw th2;
                            }
                        }
                        multiInstanceInvalidationService3.f20058d.finishBroadcast();
                        r rVar = r.f47939a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
