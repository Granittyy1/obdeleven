package p038d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: ResultReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p038d.a f34476b;

    /* JADX INFO: compiled from: ResultReceiver.java */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            p038d.a aVar;
            b bVar = new b();
            IBinder strongBinder = parcel.readStrongBinder();
            int i10 = p038d.a.AbstractBinderC0354a.f34474c;
            if (strongBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(p038d.a.f34473b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p038d.a)) {
                    p038d.a.AbstractBinderC0354a.C0355a c0355a = new p038d.a.AbstractBinderC0354a.C0355a();
                    c0355a.f34475c = strongBinder;
                    aVar = c0355a;
                } else {
                    aVar = (p038d.a) iInterfaceQueryLocalInterface;
                }
            }
            bVar.f34476b = aVar;
            return bVar;
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ResultReceiver.java */
    public class BinderC0356b extends p038d.a.AbstractBinderC0354a {
        public BinderC0356b() {
            attachInterface(this, p038d.a.f34473b);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f34476b == null) {
                    this.f34476b = new BinderC0356b();
                }
                parcel.writeStrongBinder(this.f34476b.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
