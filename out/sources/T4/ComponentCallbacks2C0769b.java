package T4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: T4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacks2C0769b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ComponentCallbacks2C0769b f5916f = new ComponentCallbacks2C0769b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5917b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5918c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5919d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5920e = false;

    /* JADX INFO: renamed from: T4.b$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface a {
        void a(boolean z10);
    }

    public static void b(Application application) {
        ComponentCallbacks2C0769b componentCallbacks2C0769b = f5916f;
        synchronized (componentCallbacks2C0769b) {
            try {
                if (!componentCallbacks2C0769b.f5920e) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0769b);
                    application.registerComponentCallbacks(componentCallbacks2C0769b);
                    componentCallbacks2C0769b.f5920e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f5916f) {
            this.f5919d.add(aVar);
        }
    }

    public final void c(boolean z10) {
        synchronized (f5916f) {
            try {
                Iterator it = this.f5919d.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f5918c;
        boolean zCompareAndSet = this.f5917b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f5918c;
        boolean zCompareAndSet = this.f5917b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f5917b.compareAndSet(false, true)) {
            this.f5918c.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
