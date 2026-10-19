package W4;

import S4.C0762d;
import U4.AbstractC0798f;
import U4.C0795c;
import U4.C0808p;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e5.f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends AbstractC0798f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0808p f7003G;

    public e(Context context, Looper looper, C0795c c0795c, C0808p c0808p, com.google.android.gms.common.api.d.a aVar, com.google.android.gms.common.api.d.b bVar) {
        super(context, looper, 270, c0795c, aVar, bVar);
        this.f7003G = c0808p;
    }

    @Override // U4.AbstractC0794b
    public final String B() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // U4.AbstractC0794b
    public final String C() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // U4.AbstractC0794b
    public final boolean D() {
        return true;
    }

    @Override // U4.AbstractC0794b, com.google.android.gms.common.api.a.e
    public final int n() {
        return 203400000;
    }

    @Override // U4.AbstractC0794b
    public final IInterface v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // U4.AbstractC0794b
    public final C0762d[] x() {
        return f.f34740b;
    }

    @Override // U4.AbstractC0794b
    public final Bundle y() {
        this.f7003G.getClass();
        return new Bundle();
    }
}
