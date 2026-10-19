package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Configuration f14885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U.b f14886c;

    public D(Configuration configuration, U.b bVar) {
        this.f14885b = configuration;
        this.f14886c = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f14885b;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<U.b.C0082b, WeakReference<U.b.a>>> it = this.f14886c.f6058a.entrySet().iterator();
        while (it.hasNext()) {
            U.b.a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f6060b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @p293xa.d
    public final void onLowMemory() {
        this.f14886c.f6058a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f14886c.f6058a.clear();
    }
}
