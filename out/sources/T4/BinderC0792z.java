package T4;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: T4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0792z extends p166n5.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f6022c;

    public BinderC0792z(C c10) {
        this.f6022c = new WeakReference(c10);
    }

    @Override // p166n5.f
    public final void U(p166n5.l lVar) {
        C c10 = (C) this.f6022c.get();
        if (c10 == null) {
            return;
        }
        C0791y c0791y = new C0791y(c10, c10, lVar);
        J j = c10.f5821a.f5871g;
        j.sendMessage(j.obtainMessage(1, c0791y));
    }
}
