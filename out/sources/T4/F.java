package T4;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f5844c;

    public F(G g10) {
        this.f5844c = new WeakReference(g10);
    }

    @Override // C.g
    public final void h0() {
        G g10 = (G) this.f5844c.get();
        if (g10 == null) {
            return;
        }
        G.b(g10);
    }
}
