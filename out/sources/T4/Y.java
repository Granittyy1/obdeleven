package T4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C.g f5911b;

    public Y(C.g gVar) {
        this.f5911b = gVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f5910a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f5910a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5911b.h0();
            a();
        }
    }
}
