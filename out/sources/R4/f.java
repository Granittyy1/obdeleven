package R4;

import android.content.Intent;
import android.os.Bundle;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f5278b = new f();

    @Override // p191p5.InterfaceC2755a
    public final Object i(p191p5.g gVar) {
        Intent intent = (Intent) ((Bundle) gVar.k()).getParcelable("notification_data");
        if (intent != null) {
            return new C0754a(intent);
        }
        return null;
    }
}
