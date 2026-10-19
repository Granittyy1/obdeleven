package Z2;

import Ia.l;
import android.view.View;
import android.view.ViewTreeObserver;
import p293xa.r;

/* JADX INFO: compiled from: ViewSizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements l<Throwable, r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i<View> f7734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f7735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f7736d;

    public g(i<View> iVar, ViewTreeObserver viewTreeObserver, h hVar) {
        this.f7734b = iVar;
        this.f7735c = viewTreeObserver;
        this.f7736d = hVar;
    }

    @Override // Ia.l
    public final r invoke(Throwable th) {
        this.f7734b.k(this.f7735c, this.f7736d);
        return r.f47939a;
    }
}
