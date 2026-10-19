package U4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0794b f6369c;

    public Q(AbstractC0794b abstractC0794b, int i10) {
        Objects.requireNonNull(abstractC0794b);
        this.f6369c = abstractC0794b;
        this.f6368b = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10;
        int i11;
        AbstractC0794b abstractC0794b = this.f6369c;
        if (iBinder == null) {
            synchronized (abstractC0794b.f6403m) {
                i10 = abstractC0794b.f6410t;
            }
            if (i10 == 3) {
                abstractC0794b.f6390A = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            N n10 = abstractC0794b.f6402l;
            n10.sendMessage(n10.obtainMessage(i11, abstractC0794b.f6392C.get(), 16));
            return;
        }
        synchronized (abstractC0794b.f6404n) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0794b.f6405o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0801i)) ? new G(iBinder) : (InterfaceC0801i) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0794b abstractC0794b2 = this.f6369c;
        int i12 = this.f6368b;
        abstractC0794b2.getClass();
        T t8 = new T(abstractC0794b2, 0, null);
        N n11 = abstractC0794b2.f6402l;
        n11.sendMessage(n11.obtainMessage(7, i12, -1, t8));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0794b abstractC0794b = this.f6369c;
        synchronized (abstractC0794b.f6404n) {
            abstractC0794b.f6405o = null;
        }
        AbstractC0794b abstractC0794b2 = this.f6369c;
        int i10 = this.f6368b;
        N n10 = abstractC0794b2.f6402l;
        n10.sendMessage(n10.obtainMessage(6, i10, 1));
    }
}
