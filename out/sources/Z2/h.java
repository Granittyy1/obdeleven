package Z2;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: ViewSizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<View> f7738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f7739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2693i f7740e;

    public h(i iVar, ViewTreeObserver viewTreeObserver, C2693i c2693i) {
        this.f7738c = iVar;
        this.f7739d = viewTreeObserver;
        this.f7740e = c2693i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        i<View> iVar = this.f7738c;
        e size = iVar.getSize();
        if (size != null) {
            iVar.k(this.f7739d, this);
            if (!this.f7737b) {
                this.f7737b = true;
                this.f7740e.resumeWith(size);
            }
        }
        return true;
    }
}
