package U4;

import S4.C0760b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class S extends F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f6370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0794b f6371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AbstractC0794b abstractC0794b, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC0794b, i10, bundle);
        Objects.requireNonNull(abstractC0794b);
        this.f6371h = abstractC0794b;
        this.f6370g = iBinder;
    }

    @Override // U4.F
    public final boolean b() {
        IBinder iBinder = this.f6370g;
        try {
            C0804l.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0794b abstractC0794b = this.f6371h;
            if (!abstractC0794b.B().equals(interfaceDescriptor)) {
                new StringBuilder(abstractC0794b.B().length() + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface iInterfaceV = abstractC0794b.v(iBinder);
            if (iInterfaceV != null && (abstractC0794b.G(2, 4, iInterfaceV) || abstractC0794b.G(3, 4, iInterfaceV))) {
                abstractC0794b.f6416z = null;
                AbstractC0794b.a aVar = abstractC0794b.f6411u;
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }

    @Override // U4.F
    public final void c(C0760b c0760b) {
        AbstractC0794b abstractC0794b = this.f6371h;
        AbstractC0794b.InterfaceC0086b interfaceC0086b = abstractC0794b.f6412v;
        if (interfaceC0086b != null) {
            interfaceC0086b.g(c0760b);
        }
        abstractC0794b.f6396e = c0760b.f5527c;
        abstractC0794b.f6397f = System.currentTimeMillis();
    }
}
