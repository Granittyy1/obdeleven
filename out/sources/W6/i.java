package W6;

import android.view.View;
import android.view.WindowManager;

/* JADX INFO: compiled from: FiamWindowManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f7019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ WindowManager f7020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X6.c f7021q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view, h hVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, X6.c cVar) {
        super(view, hVar);
        this.f7019o = layoutParams;
        this.f7020p = windowManager;
        this.f7021q = cVar;
    }

    @Override // W6.u
    public final float b() {
        return this.f7019o.x;
    }

    @Override // W6.u
    public final void c(float f10) {
        WindowManager.LayoutParams layoutParams = this.f7019o;
        layoutParams.x = (int) f10;
        this.f7020p.updateViewLayout(this.f7021q.e(), layoutParams);
    }
}
