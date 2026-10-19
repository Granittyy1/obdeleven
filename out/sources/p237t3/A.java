package p237t3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractBinderC1971h;
import com.google.android.gms.internal.play_billing.C1968g;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.InterfaceC1974i;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class A implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f47129b;

    public /* synthetic */ A(B b10) {
        Objects.requireNonNull(b10);
        this.f47129b = b10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1974i c1968g;
        C2018x.h("BillingClientTesting", "Billing Override Service connected.");
        B b10 = this.f47129b;
        int i10 = AbstractBinderC1971h.f26184c;
        if (iBinder == null) {
            c1968g = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c1968g = iInterfaceQueryLocalInterface instanceof InterfaceC1974i ? (InterfaceC1974i) iInterfaceQueryLocalInterface : new C1968g(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        }
        b10.f47132F = c1968g;
        b10.f47131E = 2;
        b10.G(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = C2018x.f26297a;
        Log.isLoggable("BillingClientTesting", 5);
        B b10 = this.f47129b;
        b10.f47132F = null;
        b10.f47131E = 0;
    }
}
