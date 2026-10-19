package R4;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements p191p5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C f5261b = new C();

    @Override // p191p5.f
    public final p191p5.g c(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = C0756c.f5268h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? p191p5.j.e(bundle) : p191p5.j.e(null);
    }
}
