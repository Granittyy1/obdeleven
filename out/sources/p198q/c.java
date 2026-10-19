package p198q;

import Q2.C0741s;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p012b.b;

/* JADX INFO: compiled from: CustomTabsServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ServiceConnection {

    /* JADX INFO: compiled from: CustomTabsServiceConnection.java */
    public class a extends C0741s {
    }

    public abstract void a(ComponentName componentName, a aVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        int i10 = b.a.f20473c;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                b.a.C0205a c0205a = new b.a.C0205a();
                c0205a.f20474c = iBinder;
                bVar = c0205a;
            } else {
                bVar = (b) iInterfaceQueryLocalInterface;
            }
        }
        a(componentName, new a(bVar, componentName));
    }
}
