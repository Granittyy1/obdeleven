package J6;

import U4.AbstractC0798f;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: DynamicLinksClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC0798f<d> {
    @Override // U4.AbstractC0794b
    public final String B() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // U4.AbstractC0794b
    public final String C() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // U4.AbstractC0794b
    public final boolean F() {
        return true;
    }

    @Override // U4.AbstractC0794b, com.google.android.gms.common.api.a.e
    public final int n() {
        return 12451000;
    }

    @Override // U4.AbstractC0794b
    public final IInterface v(IBinder iBinder) {
        int i10 = d.a.f4042c;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof d)) {
            return (d) iInterfaceQueryLocalInterface;
        }
        d.a.C0052a c0052a = new d.a.C0052a();
        c0052a.f4043c = iBinder;
        return c0052a;
    }
}
