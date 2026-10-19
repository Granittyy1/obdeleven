package p100i;

import O3.d;
import android.view.View;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f36386e;

    public j(g gVar) {
        this.f36386e = gVar;
    }

    @Override // O3.d, androidx.core.view.a0
    public final void c() {
        g gVar = this.f36386e;
        gVar.f36343w.setVisibility(0);
        if (gVar.f36343w.getParent() instanceof View) {
            View view = (View) gVar.f36343w.getParent();
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.c.c(view);
        }
    }

    @Override // androidx.core.view.a0
    public final void d() {
        g gVar = this.f36386e;
        gVar.f36343w.setAlpha(1.0f);
        gVar.f36348z.d(null);
        gVar.f36348z = null;
    }
}
