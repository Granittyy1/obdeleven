package T4;

import S4.C0762d;
import U4.C0803k;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0768a f5900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0762d f5901b;

    public /* synthetic */ U(C0768a c0768a, C0762d c0762d) {
        this.f5900a = c0768a;
        this.f5901b = c0762d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof U)) {
            U u10 = (U) obj;
            if (C0803k.a(this.f5900a, u10.f5900a) && C0803k.a(this.f5901b, u10.f5901b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5900a, this.f5901b});
    }

    public final String toString() {
        C0803k.a aVar = new C0803k.a(this);
        aVar.a(this.f5900a, "key");
        aVar.a(this.f5901b, "feature");
        return aVar.toString();
    }
}
