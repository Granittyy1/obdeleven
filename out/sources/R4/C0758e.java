package R4;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p191p5.InterfaceC2755a;

/* JADX INFO: renamed from: R4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0758e implements InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0758e f5277b = new C0758e();

    @Override // p191p5.InterfaceC2755a
    public final Object i(p191p5.g gVar) throws IOException {
        if (gVar.o()) {
            return (Bundle) gVar.k();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(gVar.j()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", gVar.j());
    }
}
