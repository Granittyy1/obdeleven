package p131k5;

import com.google.android.gms.measurement.internal.h;
import p006a5.b;
import p006a5.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2523i1 f41980a;

    public S0(h hVar) {
        this.f41980a = hVar.f26609l;
    }

    public final boolean a() {
        C2523i1 c2523i1 = this.f41980a;
        try {
            b bVarA = c.a(c2523i1.f42212a);
            if (bVarA != null) {
                return bVarA.b(128, "com.android.vending").versionCode >= 80837300;
            }
            B0 b10 = c2523i1.f42220i;
            C2523i1.g(b10);
            b10.f41719n.c("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            B0 b11 = c2523i1.f42220i;
            C2523i1.g(b11);
            b11.f41719n.b(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
