package J5;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.b f4038b;

    public e(com.google.android.material.floatingactionbutton.b bVar) {
        this.f4038b = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.b bVar = this.f4038b;
        float rotation = bVar.f27195v.getRotation();
        if (bVar.f27188o == rotation) {
            return true;
        }
        bVar.f27188o = rotation;
        bVar.p();
        return true;
    }
}
