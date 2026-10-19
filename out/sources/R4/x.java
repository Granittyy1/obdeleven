package R4;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends y {
    @Override // R4.y
    public final void a(Bundle bundle) {
        if (!bundle.getBoolean("ack", false)) {
            c(new zzt("Invalid response to one way request", null));
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
        }
        this.f5316b.b(null);
    }

    @Override // R4.y
    public final boolean b() {
        return true;
    }
}
