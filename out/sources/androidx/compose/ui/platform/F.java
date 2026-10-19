package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U.d f14891b;

    public F(U.d dVar) {
        this.f14891b = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f14891b.a();
    }

    @Override // android.content.ComponentCallbacks
    @p293xa.d
    public final void onLowMemory() {
        this.f14891b.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f14891b.a();
    }
}
